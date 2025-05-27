package com.TheoCreates.CreateCompression;

import com.TheoCreates.CreateCompression.blocks.minecraft.*;
import com.TheoCreates.CreateCompression.blocks.cc.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, CreateCompression.MODID);
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCompression.MODID);

    public static final Map<String, RegistryObject<Block>> BLOCKS_MAP = new LinkedHashMap<>();
    public static final Map<String, RegistryObject<BlockItem>> ITEMS_MAP = new LinkedHashMap<>();

    public static void registerStatic(IEventBus bus) {
        for (CreateCompressionType type : CreateCompressionType.values()) {
            for (int i = 0; i < 9; i++) {
                String name = "compressed_" + type.name + "_" + (i + 1) + "x";
                registerBlockWithItem(name, type.factory);
            }
        }

        registerBlockWithItem("nether_star_block", Nether_Star_Block::new);
        registerBlockWithItem("refined_radiance_block", Refined_Radiance_Block::new);
        registerBlockWithItem("shadow_steel_block", Shadow_Steel_Block::new);

        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static void registerConfigDependentBlocks() {
        for (CreateCompressionType type : CreateCompressionType.values()) {
            if (Config.isBlockEnabled(type)) {
                for (int i = 0; i < Config.getMaxCompressionLevel(); i++) {
                    String name = "compressed_" + type.name + "_" + (i + 1) + "x";
                    registerBlockWithItem(name, type.factory);
                }
            }
        }

        if (Config.isNetherStarBlockEnabled()) {
            registerBlockWithItem("nether_star_block", Nether_Star_Block::new);
        }
        if (Config.isRefinedRadianceBlockEnabled()) {
            registerBlockWithItem("refined_radiance_block", Refined_Radiance_Block::new);
        }
        if (Config.isShadowSteelBlockEnabled()) {
            registerBlockWithItem("shadow_steel_block", Shadow_Steel_Block::new);
        }
    }

    private static void registerBlockWithItem(String name, Supplier<Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        BLOCKS_MAP.put(name, block);
        ITEMS_MAP.put(name, ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties())));
    }
}

