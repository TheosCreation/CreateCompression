package com.TheoCreates.CreateCompression;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModRegistry {
    private ModRegistry() {
        // nothing to do
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCompression.MODID);

    public static RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab", () -> CreativeModeTab.builder()
        .title(Component.translatable("creativemodetab.name")).displayItems((parameters, tabData) -> {
            tabData.accept(ModBlocks.nether_star_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_1x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_2x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_3x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_4x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_5x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_6x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_7x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_8x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_log_9x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_1x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_2x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_3x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_4x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_5x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_6x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_7x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_8x_item.get());
            tabData.accept(ModBlocks.compressed_acacia_plank_9x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_1x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_2x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_3x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_4x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_5x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_6x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_7x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_8x_item.get());
            tabData.accept(ModBlocks.compressed_amethyst_9x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_1x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_2x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_3x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_4x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_5x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_6x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_7x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_8x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_9x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_1x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_2x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_3x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_4x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_5x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_6x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_7x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_8x_item.get());
            tabData.accept(ModBlocks.compressed_andesite_alloy_9x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_1x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_2x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_3x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_4x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_5x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_6x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_7x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_8x_item.get());
            tabData.accept(ModBlocks.compressed_asurine_9x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_1x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_2x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_3x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_4x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_5x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_6x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_7x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_8x_item.get());
            tabData.accept(ModBlocks.compressed_basalt_9x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_1x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_2x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_3x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_4x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_5x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_6x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_7x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_8x_item.get());
            tabData.accept(ModBlocks.compressed_birch_log_9x_item.get());
        }).build());

    public static void register() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        CREATIVE_MODE_TABS.register(bus);
    }
}
