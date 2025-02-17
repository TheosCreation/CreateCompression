package com.TheoCreates.CreateCompression;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

@Mod(CreateCompression.MODID)
public class CreateCompression {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "createcompression";

    @SuppressWarnings("java:S1118")
    public CreateCompression() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        LOGGER.info("Registering mod: {}", MODID);
        ModRegistry.register();
    }
}
