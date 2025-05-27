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
    public static final ForgeConfigSpec COMMON_CONFIG;

    private static final Map<CreateCompressionType, ForgeConfigSpec.BooleanValue> ENABLED_BLOCKS = new EnumMap<>(CreateCompressionType.class);
    private static final ForgeConfigSpec.IntValue MAX_COMPRESSION_LEVEL;
    private static final ForgeConfigSpec.BooleanValue ENABLE_NETHER_STAR_BLOCK;
    private static final ForgeConfigSpec.BooleanValue ENABLE_REFINED_RADIANCE_BLOCK;
    private static final ForgeConfigSpec.BooleanValue ENABLE_SHADOW_STEEL_BLOCK;

    public static void register() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_CONFIG);
    }

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("general");
        MAX_COMPRESSION_LEVEL = builder.defineInRange("maxCompressionLevel", 9, 1, 9);
        builder.pop();

        builder.push("blocks");
        for (CreateCompressionType type : CreateCompressionType.values()) {
            ENABLED_BLOCKS.put(type, builder.define("enable" + type.name + "Block", true));
        }
        ENABLE_NETHER_STAR_BLOCK = builder.define("enableNetherStarBlock", true);
        ENABLE_REFINED_RADIANCE_BLOCK = builder.define("enableRefinedRadianceBlock", true);
        ENABLE_SHADOW_STEEL_BLOCK = builder.define("enableShadowSteelBlock", true);
        builder.pop();

        COMMON_CONFIG = builder.build();
    }

    @SubscribeEvent
    public static void onConfigLoad(ModConfigEvent.Loading event) {
        if (event.getConfig().getSpec() == COMMON_CONFIG) {
            // Now it is safe to read config values
        }
    }

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
