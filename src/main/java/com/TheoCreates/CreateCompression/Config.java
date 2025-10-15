package com.TheoCreates.CreateCompression;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

import net.minecraftforge.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@Mod.EventBusSubscriber(modid = CreateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    // General
    public static final ModConfigSpec.IntValue MAX_COMPRESSION_LEVEL = BUILDER
        .comment("Maximum compression level for blocks [1..9]")
        .defineInRange("general.maxCompressionLevel", 9, 1, 9);

    // Blocks
    private static final Map<CreateCompressionType, ModConfigSpec.BooleanValue> ENABLED_BLOCKS =
        new EnumMap<>(CreateCompressionType.class);

    public static final ModConfigSpec.BooleanValue ENABLE_NETHER_STAR_BLOCK = BUILDER
        .comment("Enable the Nether Star Block")
        .define("blocks.enable_nether_star_block", true);

    public static final ModConfigSpec.BooleanValue ENABLE_REFINED_RADIANCE_BLOCK = BUILDER
        .comment("Enable the Refined Radiance Block")
        .define("blocks.enable_refined_radiance_block", true);

    public static final ModConfigSpec.BooleanValue ENABLE_SHADOW_STEEL_BLOCK = BUILDER
        .comment("Enable the Shadow Steel Block")
        .define("blocks.enable_shadow_steel_block", true);

    static {
        // Per-type toggles
        BUILDER.push("blocks");
        for (CreateCompressionType type : CreateCompressionType.values()) {
            String key = "enable_" + type.name().toLowerCase(Locale.ROOT) + "_block";
            ENABLED_BLOCKS.put(type, BUILDER.define(key, true));
        }
        BUILDER.pop();
    }

    public static final ModConfigSpec SPEC = BUILDER.build();

    public static void register() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SPEC);
    }

    @SubscribeEvent
    static void onLoad(ModConfigEvent.Loading e) { /* no-op */ }

    @SubscribeEvent
    static void onReload(ModConfigEvent.Reloading e) { /* no-op */ }

    // Accessors
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
