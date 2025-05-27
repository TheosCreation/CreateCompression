package com.TheoCreates.CreateCompression;

import com.TheoCreates.CreateCompression.blocks.cc.Nether_Star_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Refined_Radiance_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Shadow_Steel_Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = CreateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateCompression.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCompression.MODID);

    public static final Map<String, RegistryObject<Block>> BLOCKS_MAP = new LinkedHashMap<>();
    public static final Map<String, RegistryObject<Item>> ITEMS_MAP = new LinkedHashMap<>();

    public static final CreativeModeTab creativeTab = new CreativeModeTab(CreateCompression.MODID) {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_gold_1x")));
        }
    };

    public static void register() {
        registerAllBlocks(); // Register everything up-front

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(ModRegistry.class); // for creative tab event
    }

    private static void registerAllBlocks() {
        for (CreateCompressionType type : CreateCompressionType.values()) {
            for (int i = 0; i < 9; i++) {
                String name = "compressed_" + type.name + "_" + (i + 1) + "x";
                registerBlockWithItem(name, type.factory);
            }
        }

        registerBlockWithItem("nether_star_block", Nether_Star_Block::new);
        registerBlockWithItem("refined_radiance_block", Refined_Radiance_Block::new);
        registerBlockWithItem("shadow_steel_block", Shadow_Steel_Block::new);
    }

    private static void registerBlockWithItem(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        BLOCKS_MAP.put(name, block);
        RegistryObject<Item> item = ITEMS.register(name,
            () -> new BlockItem(block.get(), new Item.Properties().tab(creativeTab)));
        ITEMS_MAP.put(name, item);
    }
}
