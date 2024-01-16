package com.TheoCreates.CreateCompression;

import com.TheoCreates.CreateCompression.blocks.cc.Nether_Star_Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = CreateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModRegistry {
    private ModRegistry() {
        // nothing to do
    }

    //public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCompression.MODID);
//
    //public static RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab", () -> CreativeModeTab.builder()
    //    .title(Component.translatable("creativemodetab.name")).displayItems((parameters, tabData) -> {
    //        ModBlocks.ITEMS_MAP.keySet().stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(key -> tabData.accept(ModBlocks.ITEMS_MAP.get(key).get()));
    //    }).build());

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            ModBlocks.ITEMS_MAP.keySet().stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(key -> event.accept(ModBlocks.ITEMS_MAP.get(key).get()));
        }
    }

    public static void register() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        //CREATIVE_MODE_TABS.register(bus);
    }
}
