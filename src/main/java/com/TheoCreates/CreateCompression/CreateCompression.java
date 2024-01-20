package com.TheoCreates.CreateCompression;

import com.TheoCreates.CreateCompression.blocks.cc.Nether_Star_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Refined_Radiance_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Shadow_Steel_Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(CreateCompression.MODID)
public class CreateCompression {
    public static final String MODID = "createcompression";
    public static final CreativeModeTab creativeTab = new CreativeModeTab(CreateCompression.MODID) {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_gold_1x")));
        }
    };

    public CreateCompression() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addGenericListener(Block.class, this::registerBlocks);
        eventBus.addGenericListener(Item.class, this::registerItems);
        ModRegistry.registerStandardBlocks();
        ModRegistry.ITEMS.register(eventBus);
        ModRegistry.BLOCKS.register(eventBus);
        eventBus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        CreateCompressionClient.setupItemVar();
    }

    private void registerBlocks(RegistryEvent.Register<Block> event) {
        for (CreateCompressionType type : CreateCompressionType.VALUES) {
            for (int i = 0; i < 9; i++) {
                Block block = type.factory.get();
                event.getRegistry().register(block.setRegistryName("compressed_" + type.name + "_" + (i + 1) + "x"));
                type.blocks.add(block);
            }
        }
    }

    private void registerItems(RegistryEvent.Register<Item> event) {
        for (CreateCompressionType type : CreateCompressionType.VALUES) {
            for (Block block : type.blocks) {
                event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(creativeTab)).setRegistryName(block.getRegistryName()));
            }
        }
    }
}
