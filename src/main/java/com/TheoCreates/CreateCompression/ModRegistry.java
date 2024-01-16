package com.TheoCreates.CreateCompression;

import com.TheoCreates.CreateCompression.blocks.cc.Nether_Star_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Refined_Radiance_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Shadow_Steel_Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRegistry {
    private ModRegistry() {
        // nothing to do
    }

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateCompression.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCompression.MODID);

        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCompression.MODID);

        public static RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("block.createcompression.compressed_acacia_log_1x")).displayItems((parameters, tabData) -> {
                tabData.accept(blockItem(ForgeRegistries.BLOCKS.getResourceKey("createcompression:acacia_log_1x")).get());

            }).build());
        //RegistryObject<Block> nether_star = BLOCKS.register("nether_star", Nether_Star_Block::new);
        //blockItem(nether_star);
        //RegistryObject<Block> refined_radiance_block = BLOCKS.register("refined_radiance_block", Refined_Radiance_Block::new);
        //blockItem(refined_radiance_block);
        //RegistryObject<Block> shadow_steel_block = BLOCKS.register("shadow_steel_block", Shadow_Steel_Block::new);
        //blockItem(shadow_steel_block);

    public static void registerBlocks() {
        for (CreateCompressionType type : CreateCompressionType.VALUES) {
            for (int i = 0; i < 9; i++) {
                RegistryObject<Block> block = BLOCKS.register("compressed_" + type.name + "_" + (i + 1) + "x", type.factory);
                blockItem(block);
            }
        }
        RegistryObject<Block> nether_star = BLOCKS.register("nether_star", Nether_Star_Block::new);
        blockItem(nether_star);
        RegistryObject<Block> refined_radiance_block = BLOCKS.register("refined_radiance_block", Refined_Radiance_Block::new);
        blockItem(refined_radiance_block);
        RegistryObject<Block> shadow_steel_block = BLOCKS.register("shadow_steel_block", Shadow_Steel_Block::new);
        blockItem(shadow_steel_block);
    }

    private static RegistryObject<BlockItem> blockItem(RegistryObject<Block> registryObject) {
        return ITEMS.register(registryObject.getId().getPath(),
            () -> new BlockItem(registryObject.get(), new Item.Properties()));
    }
    public static void register() {
        registerBlocks();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        BLOCKS.register(bus);
        CREATIVE_MODE_TABS.register(bus);
    }
}
