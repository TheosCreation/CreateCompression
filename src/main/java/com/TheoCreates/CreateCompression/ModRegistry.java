package com.TheoCreates.CreateCompression;

import com.TheoCreates.CreateCompression.blocks.cc.Nether_Star_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Refined_Radiance_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Shadow_Steel_Block;
import com.google.common.base.Suppliers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModRegistry {
    private ModRegistry() {
    }

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateCompression.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCompression.MODID);

    public static final List<Block> blocks = new ArrayList<>();

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(CreateCompression.MODID) {
        private static final Supplier<Item> ITEM_SUPPLIER = Suppliers.memoize(
            () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_gold_4x")));

        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ITEM_SUPPLIER.get());
        }
    };

    public static void register() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addGenericListener(Block.class, ModRegistry::registerBlocks);
        eventBus.addGenericListener(Item.class, ModRegistry::registerItems);
        eventBus.addListener(ModRegistry::clientSetup);
    }

    private static void clientSetup(FMLClientSetupEvent event) {
        CreateCompressionClient.setupItemVar();
    }

    private static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (CreateCompressionType type : CreateCompressionType.VALUES) {
            if(Config.isBlockEnabled((type))) {
                for (int i = 0; i < 9; i++) {
                    Block block = type.factory.get();
                    event.getRegistry().register(block.setRegistryName("compressed_" + type.name + "_" + (i + 1) + "x"));
                    blocks.add(block);
                }
            }
        }

        if(Config.isNetherStarBlockEnabled())
        {
            Block netherStarBlock = new Nether_Star_Block();
            event.getRegistry().register(netherStarBlock.setRegistryName("nether_star"));
            blocks.add(netherStarBlock);
        }

        if(Config.isRefinedRadianceBlockEnabled()) {
            Block refinedRadianceBlock = new Refined_Radiance_Block();
            event.getRegistry().register(refinedRadianceBlock.setRegistryName("refined_radiance_block"));
            blocks.add(refinedRadianceBlock);
        }

        if(Config.isShadowSteelBlockEnabled())
        {
            Block shadowSteelBlock = new Shadow_Steel_Block();
            event.getRegistry().register(shadowSteelBlock.setRegistryName("shadow_steel_block"));
            blocks.add(shadowSteelBlock);
        }
    }

    private static void registerItems(RegistryEvent.Register<Item> event) {
        for (Block block : blocks) {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(CREATIVE_TAB)).setRegistryName(block.getRegistryName()));
        }
    }


    public static void register() {
        registerBlocks();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }
}
