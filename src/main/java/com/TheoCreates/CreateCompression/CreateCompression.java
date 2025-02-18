package com.TheoCreates.CreateCompression;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(CreateCompression.MODID)
public class CreateCompression {
    public static final String MODID = "createcompression";


    public CreateCompression() {
        ModRegistry.register();
    }
}
