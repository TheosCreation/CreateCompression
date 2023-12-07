package com.TheoCreates.CreateStyleCompressed;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(CreateStyleCompressed.MODID)
public class CreateStyleCompressed {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "createstylecompressed";

    @SuppressWarnings("java:S1118")
    public CreateStyleCompressed() {
        LOGGER.info("Registering mod: {}", MODID);
        ModRegistry.register();
    }
}
