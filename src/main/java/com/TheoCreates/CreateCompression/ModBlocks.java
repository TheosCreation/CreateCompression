package com.TheoCreates.CreateCompression;


import com.TheoCreates.CreateCompression.blocks.minecraft.*;
import com.TheoCreates.CreateCompression.blocks.cc.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateCompression.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCompression.MODID);

    public static final RegistryObject<Block> nether_star_block = BLOCKS.register("nether_star", Nether_Star_Block::new);
    public static final RegistryObject<BlockItem> nether_star_item = blockItem(nether_star_block);
    //acacia log
    public static final RegistryObject<Block> compressed_acacia_log_1x_block = BLOCKS.register("compressed_acacia_log_1x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_1x_item = blockItem(compressed_acacia_log_1x_block);
    public static final RegistryObject<Block> compressed_acacia_log_2x_block = BLOCKS.register("compressed_acacia_log_2x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_2x_item = blockItem(compressed_acacia_log_2x_block);
    public static final RegistryObject<Block> compressed_acacia_log_3x_block = BLOCKS.register("compressed_acacia_log_3x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_3x_item = blockItem(compressed_acacia_log_3x_block);
    public static final RegistryObject<Block> compressed_acacia_log_4x_block = BLOCKS.register("compressed_acacia_log_4x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_4x_item = blockItem(compressed_acacia_log_4x_block);
    public static final RegistryObject<Block> compressed_acacia_log_5x_block = BLOCKS.register("compressed_acacia_log_5x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_5x_item = blockItem(compressed_acacia_log_5x_block);
    public static final RegistryObject<Block> compressed_acacia_log_6x_block = BLOCKS.register("compressed_acacia_log_6x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_6x_item = blockItem(compressed_acacia_log_6x_block);
    public static final RegistryObject<Block> compressed_acacia_log_7x_block = BLOCKS.register("compressed_acacia_log_7x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_7x_item = blockItem(compressed_acacia_log_7x_block);
    public static final RegistryObject<Block> compressed_acacia_log_8x_block = BLOCKS.register("compressed_acacia_log_8x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_8x_item = blockItem(compressed_acacia_log_8x_block);
    public static final RegistryObject<Block> compressed_acacia_log_9x_block = BLOCKS.register("compressed_acacia_log_9x", Acacia_Log::new);
    public static final RegistryObject<BlockItem> compressed_acacia_log_9x_item = blockItem(compressed_acacia_log_9x_block);
    //acacia planks
    public static final RegistryObject<Block> compressed_acacia_plank_1x_block = BLOCKS.register("compressed_acacia_plank_1x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_1x_item = blockItem(compressed_acacia_plank_1x_block);
    public static final RegistryObject<Block> compressed_acacia_plank_2x_block = BLOCKS.register("compressed_acacia_plank_2x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_2x_item = blockItem(compressed_acacia_plank_2x_block);
    public static final RegistryObject<Block> compressed_acacia_plank_3x_block = BLOCKS.register("compressed_acacia_plank_3x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_3x_item = blockItem(compressed_acacia_plank_3x_block);
    public static final RegistryObject<Block> compressed_acacia_plank_4x_block = BLOCKS.register("compressed_acacia_plank_4x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_4x_item = blockItem(compressed_acacia_plank_4x_block);
    public static final RegistryObject<Block> compressed_acacia_plank_5x_block = BLOCKS.register("compressed_acacia_plank_5x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_5x_item = blockItem(compressed_acacia_plank_5x_block);
    public static final RegistryObject<Block> compressed_acacia_plank_6x_block = BLOCKS.register("compressed_acacia_plank_6x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_6x_item = blockItem(compressed_acacia_plank_6x_block);
    public static final RegistryObject<Block> compressed_acacia_plank_7x_block = BLOCKS.register("compressed_acacia_plank_7x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_7x_item = blockItem(compressed_acacia_plank_7x_block);
    public static final RegistryObject<Block> compressed_acacia_plank_8x_block = BLOCKS.register("compressed_acacia_plank_8x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_8x_item = blockItem(compressed_acacia_plank_8x_block);
    public static final RegistryObject<Block> compressed_acacia_plank_9x_block = BLOCKS.register("compressed_acacia_plank_9x", Acacia_Plank::new);
    public static final RegistryObject<BlockItem> compressed_acacia_plank_9x_item = blockItem(compressed_acacia_plank_9x_block);
    //amethyst
    public static final RegistryObject<Block> compressed_amethyst_1x_block = BLOCKS.register("compressed_amethyst_1x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_1x_item = blockItem(compressed_amethyst_1x_block);
    public static final RegistryObject<Block> compressed_amethyst_2x_block = BLOCKS.register("compressed_amethyst_2x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_2x_item = blockItem(compressed_amethyst_2x_block);
    public static final RegistryObject<Block> compressed_amethyst_3x_block = BLOCKS.register("compressed_amethyst_3x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_3x_item = blockItem(compressed_amethyst_3x_block);
    public static final RegistryObject<Block> compressed_amethyst_4x_block = BLOCKS.register("compressed_amethyst_4x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_4x_item = blockItem(compressed_amethyst_4x_block);
    public static final RegistryObject<Block> compressed_amethyst_5x_block = BLOCKS.register("compressed_amethyst_5x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_5x_item = blockItem(compressed_amethyst_5x_block);
    public static final RegistryObject<Block> compressed_amethyst_6x_block = BLOCKS.register("compressed_amethyst_6x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_6x_item = blockItem(compressed_amethyst_6x_block);
    public static final RegistryObject<Block> compressed_amethyst_7x_block = BLOCKS.register("compressed_amethyst_7x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_7x_item = blockItem(compressed_amethyst_7x_block);
    public static final RegistryObject<Block> compressed_amethyst_8x_block = BLOCKS.register("compressed_amethyst_8x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_8x_item = blockItem(compressed_amethyst_8x_block);
    public static final RegistryObject<Block> compressed_amethyst_9x_block = BLOCKS.register("compressed_amethyst_9x", Amethyst::new);
    public static final RegistryObject<BlockItem> compressed_amethyst_9x_item = blockItem(compressed_amethyst_9x_block);
    //andesite
    public static final RegistryObject<Block> compressed_andesite_1x_block = BLOCKS.register("compressed_andesite_1x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_1x_item = blockItem(compressed_andesite_1x_block);
    public static final RegistryObject<Block> compressed_andesite_2x_block = BLOCKS.register("compressed_andesite_2x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_2x_item = blockItem(compressed_andesite_2x_block);
    public static final RegistryObject<Block> compressed_andesite_3x_block = BLOCKS.register("compressed_andesite_3x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_3x_item = blockItem(compressed_andesite_3x_block);
    public static final RegistryObject<Block> compressed_andesite_4x_block = BLOCKS.register("compressed_andesite_4x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_4x_item = blockItem(compressed_andesite_4x_block);
    public static final RegistryObject<Block> compressed_andesite_5x_block = BLOCKS.register("compressed_andesite_5x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_5x_item = blockItem(compressed_andesite_5x_block);
    public static final RegistryObject<Block> compressed_andesite_6x_block = BLOCKS.register("compressed_andesite_6x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_6x_item = blockItem(compressed_andesite_6x_block);
    public static final RegistryObject<Block> compressed_andesite_7x_block = BLOCKS.register("compressed_andesite_7x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_7x_item = blockItem(compressed_andesite_7x_block);
    public static final RegistryObject<Block> compressed_andesite_8x_block = BLOCKS.register("compressed_andesite_8x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_8x_item = blockItem(compressed_andesite_8x_block);
    public static final RegistryObject<Block> compressed_andesite_9x_block = BLOCKS.register("compressed_andesite_9x", Andesite::new);
    public static final RegistryObject<BlockItem> compressed_andesite_9x_item = blockItem(compressed_andesite_9x_block);
    //andesite alloy
    public static final RegistryObject<Block> compressed_andesite_alloy_1x_block = BLOCKS.register("compressed_andesite_alloy_1x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_1x_item = blockItem(compressed_andesite_alloy_1x_block);
    public static final RegistryObject<Block> compressed_andesite_alloy_2x_block = BLOCKS.register("compressed_andesite_alloy_2x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_2x_item = blockItem(compressed_andesite_alloy_2x_block);
    public static final RegistryObject<Block> compressed_andesite_alloy_3x_block = BLOCKS.register("compressed_andesite_alloy_3x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_3x_item = blockItem(compressed_andesite_alloy_3x_block);
    public static final RegistryObject<Block> compressed_andesite_alloy_4x_block = BLOCKS.register("compressed_andesite_alloy_4x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_4x_item = blockItem(compressed_andesite_alloy_4x_block);
    public static final RegistryObject<Block> compressed_andesite_alloy_5x_block = BLOCKS.register("compressed_andesite_alloy_5x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_5x_item = blockItem(compressed_andesite_alloy_5x_block);
    public static final RegistryObject<Block> compressed_andesite_alloy_6x_block = BLOCKS.register("compressed_andesite_alloy_6x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_6x_item = blockItem(compressed_andesite_alloy_6x_block);
    public static final RegistryObject<Block> compressed_andesite_alloy_7x_block = BLOCKS.register("compressed_andesite_alloy_7x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_7x_item = blockItem(compressed_andesite_alloy_7x_block);
    public static final RegistryObject<Block> compressed_andesite_alloy_8x_block = BLOCKS.register("compressed_andesite_alloy_8x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_8x_item = blockItem(compressed_andesite_alloy_8x_block);
    public static final RegistryObject<Block> compressed_andesite_alloy_9x_block = BLOCKS.register("compressed_andesite_alloy_9x", Andesite_Alloy::new);
    public static final RegistryObject<BlockItem> compressed_andesite_alloy_9x_item = blockItem(compressed_andesite_alloy_9x_block);
    //asurine
    public static final RegistryObject<Block> compressed_asurine_1x_block = BLOCKS.register("compressed_asurine_1x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_1x_item = blockItem(compressed_asurine_1x_block);
    public static final RegistryObject<Block> compressed_asurine_2x_block = BLOCKS.register("compressed_asurine_2x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_2x_item = blockItem(compressed_asurine_2x_block);
    public static final RegistryObject<Block> compressed_asurine_3x_block = BLOCKS.register("compressed_asurine_3x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_3x_item = blockItem(compressed_asurine_3x_block);
    public static final RegistryObject<Block> compressed_asurine_4x_block = BLOCKS.register("compressed_asurine_4x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_4x_item = blockItem(compressed_asurine_4x_block);
    public static final RegistryObject<Block> compressed_asurine_5x_block = BLOCKS.register("compressed_asurine_5x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_5x_item = blockItem(compressed_asurine_5x_block);
    public static final RegistryObject<Block> compressed_asurine_6x_block = BLOCKS.register("compressed_asurine_6x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_6x_item = blockItem(compressed_asurine_6x_block);
    public static final RegistryObject<Block> compressed_asurine_7x_block = BLOCKS.register("compressed_asurine_7x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_7x_item = blockItem(compressed_asurine_7x_block);
    public static final RegistryObject<Block> compressed_asurine_8x_block = BLOCKS.register("compressed_asurine_8x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_8x_item = blockItem(compressed_asurine_8x_block);
    public static final RegistryObject<Block> compressed_asurine_9x_block = BLOCKS.register("compressed_asurine_9x", Asurine::new);
    public static final RegistryObject<BlockItem> compressed_asurine_9x_item = blockItem(compressed_asurine_9x_block);
    //basalt
    public static final RegistryObject<Block> compressed_basalt_1x_block = BLOCKS.register("compressed_basalt_1x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_1x_item = blockItem(compressed_basalt_1x_block);
    public static final RegistryObject<Block> compressed_basalt_2x_block = BLOCKS.register("compressed_basalt_2x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_2x_item = blockItem(compressed_basalt_2x_block);
    public static final RegistryObject<Block> compressed_basalt_3x_block = BLOCKS.register("compressed_basalt_3x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_3x_item = blockItem(compressed_basalt_3x_block);
    public static final RegistryObject<Block> compressed_basalt_4x_block = BLOCKS.register("compressed_basalt_4x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_4x_item = blockItem(compressed_basalt_4x_block);
    public static final RegistryObject<Block> compressed_basalt_5x_block = BLOCKS.register("compressed_basalt_5x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_5x_item = blockItem(compressed_basalt_5x_block);
    public static final RegistryObject<Block> compressed_basalt_6x_block = BLOCKS.register("compressed_basalt_6x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_6x_item = blockItem(compressed_basalt_6x_block);
    public static final RegistryObject<Block> compressed_basalt_7x_block = BLOCKS.register("compressed_basalt_7x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_7x_item = blockItem(compressed_basalt_7x_block);
    public static final RegistryObject<Block> compressed_basalt_8x_block = BLOCKS.register("compressed_basalt_8x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_8x_item = blockItem(compressed_basalt_8x_block);
    public static final RegistryObject<Block> compressed_basalt_9x_block = BLOCKS.register("compressed_basalt_9x", Basalt::new);
    public static final RegistryObject<BlockItem> compressed_basalt_9x_item = blockItem(compressed_basalt_9x_block);
    //birch_log
    public static final RegistryObject<Block> compressed_birch_log_1x_block = BLOCKS.register("compressed_birch_log_1x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_1x_item = blockItem(compressed_birch_log_1x_block);
    public static final RegistryObject<Block> compressed_birch_log_2x_block = BLOCKS.register("compressed_birch_log_2x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_2x_item = blockItem(compressed_birch_log_2x_block);
    public static final RegistryObject<Block> compressed_birch_log_3x_block = BLOCKS.register("compressed_birch_log_3x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_3x_item = blockItem(compressed_birch_log_3x_block);
    public static final RegistryObject<Block> compressed_birch_log_4x_block = BLOCKS.register("compressed_birch_log_4x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_4x_item = blockItem(compressed_birch_log_4x_block);
    public static final RegistryObject<Block> compressed_birch_log_5x_block = BLOCKS.register("compressed_birch_log_5x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_5x_item = blockItem(compressed_birch_log_5x_block);
    public static final RegistryObject<Block> compressed_birch_log_6x_block = BLOCKS.register("compressed_birch_log_6x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_6x_item = blockItem(compressed_birch_log_6x_block);
    public static final RegistryObject<Block> compressed_birch_log_7x_block = BLOCKS.register("compressed_birch_log_7x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_7x_item = blockItem(compressed_birch_log_7x_block);
    public static final RegistryObject<Block> compressed_birch_log_8x_block = BLOCKS.register("compressed_birch_log_8x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_8x_item = blockItem(compressed_birch_log_8x_block);
    public static final RegistryObject<Block> compressed_birch_log_9x_block = BLOCKS.register("compressed_birch_log_9x", Birch_Log::new);
    public static final RegistryObject<BlockItem> compressed_birch_log_9x_item = blockItem(compressed_birch_log_9x_block);

    private static RegistryObject<BlockItem> blockItem(RegistryObject<Block> block) {
        return ITEMS.register(block.getId().getPath(),
            () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
