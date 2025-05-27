package com.TheoCreates.CreateCompression;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = CreateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCompression.MODID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab", () ->
        CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.name"))
            .displayItems((params, output) -> {
                ModBlocks.ITEMS_MAP.keySet().stream()
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .forEach(key -> output.accept(ModBlocks.ITEMS_MAP.get(key).get()));
            })
            .build()
    );

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            ModBlocks.ITEMS_MAP.forEach((key, item) -> {
                if (shouldShowInCreativeTab(key)) {
                    event.accept(item.get());
                }
            });
        }
    }

    private static boolean shouldShowInCreativeTab(String key) {
        // Use config to decide if this block should appear
        switch (key) {
            case "nether_star_block" -> {
                return Config.isNetherStarBlockEnabled();
            }
            case "refined_radiance_block" -> {
                return Config.isRefinedRadianceBlockEnabled();
            }
            case "shadow_steel_block" -> {
                return Config.isShadowSteelBlockEnabled();
            }
        }

        for (CreateCompressionType type : CreateCompressionType.values()) {
            if (key.startsWith("compressed_" + type.name)) {
                return Config.isBlockEnabled(type);
            }
        }

        return true;
    }

    public static void registerStatic() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.registerStatic(bus);
        CREATIVE_MODE_TABS.register(bus);
    }
}
