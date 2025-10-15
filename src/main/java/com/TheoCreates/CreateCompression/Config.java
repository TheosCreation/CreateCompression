package com.TheoCreates.CreateCompression;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = CreateCompression.MODID)
public final class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue MAX_COMPRESSION_LEVEL =
        BUILDER.comment("Maximum compression level for blocks [1..9]")
            .defineInRange("general.maxCompressionLevel", 9, 1, 9);

    private static final Map<CreateCompressionType, ModConfigSpec.BooleanValue> ENABLED_BLOCKS =
        new EnumMap<>(CreateCompressionType.class);

    public static final ModConfigSpec.BooleanValue ENABLE_NETHER_STAR_BLOCK =
        BUILDER.define("blocks.enable_nether_star_block", true);
    public static final ModConfigSpec.BooleanValue ENABLE_REFINED_RADIANCE_BLOCK =
        BUILDER.define("blocks.enable_refined_radiance_block", true);
    public static final ModConfigSpec.BooleanValue ENABLE_SHADOW_STEEL_BLOCK =
        BUILDER.define("blocks.enable_shadow_steel_block", true);

    static {
        BUILDER.push("blocks");
        for (CreateCompressionType t : CreateCompressionType.values()) {
            ENABLED_BLOCKS.put(t,
                BUILDER.define("enable_" + t.name().toLowerCase(Locale.ROOT) + "_block", true));
        }
        BUILDER.pop();
    }

    public static final ModConfigSpec SPEC = BUILDER.build();

    @SubscribeEvent static void onLoad(ModConfigEvent.Loading e) {}
    @SubscribeEvent static void onReload(ModConfigEvent.Reloading e) {}

    // accessors
    public static boolean isBlockEnabled(CreateCompressionType t) { return ENABLED_BLOCKS.get(t).get(); }
    public static int getMaxCompressionLevel() { return MAX_COMPRESSION_LEVEL.get(); }
    public static boolean isNetherStarBlockEnabled() { return ENABLE_NETHER_STAR_BLOCK.get(); }
    public static boolean isRefinedRadianceBlockEnabled() { return ENABLE_REFINED_RADIANCE_BLOCK.get(); }
    public static boolean isShadowSteelBlockEnabled() { return ENABLE_SHADOW_STEEL_BLOCK.get(); }
}
