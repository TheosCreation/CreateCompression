package com.TheoCreates.CreateCompression;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@net.neoforged.fml.common.Mod(CreateCompression.MODID)
public class CreateCompression {
    public static final String MODID = "createcompression";

    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateCompression(IEventBus modBus, ModContainer container) {
        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        ModRegistry.BLOCKS.register(modBus);
        ModRegistry.ITEMS.register(modBus);
        ModRegistry.TABS.register(modBus);
    }
}
