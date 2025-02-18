package com.TheoCreates.CreateCompression;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(CreateCompression.MODID)
public class CreateCompression {
    public static final String MODID = "createcompression";


    public CreateCompression() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        ModRegistry.register();
    }
}
