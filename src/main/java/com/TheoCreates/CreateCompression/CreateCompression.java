package com.TheoCreates.CreateCompression;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(CreateCompression.MODID)
public class CreateCompression {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "createcompression";

    @SuppressWarnings("java:S1118")
    public CreateCompression() {
        LOGGER.info("Registering mod: {}", MODID);
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        CreativeModeTabs.register(bus);
        ModRegistry.register(bus);
    }
}
