package com.TheoCreates.CreateCompression;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
        CreateCompression.MODID);
    public static RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("create_compression", () ->
        CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.create_compression")).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
