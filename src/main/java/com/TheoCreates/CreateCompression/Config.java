package com.TheoCreates.CreateCompression;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;

import java.util.EnumMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = CreateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

    // Configuration fields
    public static final ForgeConfigSpec COMMON_CONFIG;
    private static final Map<CreateCompressionType, ForgeConfigSpec.BooleanValue> ENABLED_BLOCKS = new EnumMap<>(CreateCompressionType.class);
    private static final ForgeConfigSpec.IntValue MAX_COMPRESSION_LEVEL;
    private static final ForgeConfigSpec.BooleanValue ENABLE_NETHER_STAR_BLOCK;
    private static final ForgeConfigSpec.BooleanValue ENABLE_REFINED_RADIANCE_BLOCK;
    private static final ForgeConfigSpec.BooleanValue ENABLE_SHADOW_STEEL_BLOCK;

    private static boolean isLoaded = false;

    @SubscribeEvent
    public static void onConfigLoad(final ModConfigEvent event) {
        if (event.getConfig().getSpec() == COMMON_CONFIG) {
            isLoaded = true;
        }
    }

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        // General settings
        COMMON_BUILDER.comment("General settings").push("general");
        MAX_COMPRESSION_LEVEL = COMMON_BUILDER
            .comment("Maximum compression level for blocks")
            .defineInRange("maxCompressionLevel", 9, 1, 9);
        COMMON_BUILDER.pop();

        // Block settings
        COMMON_BUILDER.comment("Block settings").push("blocks");
        for (CreateCompressionType type : CreateCompressionType.values()) {
            ForgeConfigSpec.BooleanValue enabled = COMMON_BUILDER
                .comment("Enable the " + type.name + " block")
                .define("enable" + type.name + "Block", true);
            ENABLED_BLOCKS.put(type, enabled);
        }
        ENABLE_NETHER_STAR_BLOCK = COMMON_BUILDER
            .comment("Enable the Nether Star Block")
            .define("enableNetherStarBlock", true);

        ENABLE_REFINED_RADIANCE_BLOCK = COMMON_BUILDER
            .comment("Enable the Refined Radiance Block")
            .define("enableRefinedRadianceBlock", true);
        ENABLE_SHADOW_STEEL_BLOCK = COMMON_BUILDER
            .comment("Enable the Shadow Steel Block")
            .define("enableShadowSteelBlock", true);
        COMMON_BUILDER.pop();

        // Finalize the config object
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    // Register configuration during common setup
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_CONFIG, "createcompression-common.toml");
    }

    // Method to safely access configuration values
    public static boolean isBlockEnabled(CreateCompressionType type) {
        return ENABLED_BLOCKS.get(type).get();
    }

    public static int getMaxCompressionLevel() {
        return MAX_COMPRESSION_LEVEL.get();
    }

    public static boolean isNetherStarBlockEnabled() {
        return ENABLE_NETHER_STAR_BLOCK.get();
    }

    public static boolean isRefinedRadianceBlockEnabled() {
        return ENABLE_REFINED_RADIANCE_BLOCK.get();
    }

    public static boolean isShadowSteelBlockEnabled() {
        return ENABLE_SHADOW_STEEL_BLOCK.get();
    }
}
