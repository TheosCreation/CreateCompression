package com.TheoCreates.CreateCompression;

import com.TheoCreates.CreateCompression.blocks.minecraft.*;
import com.TheoCreates.CreateCompression.blocks.cc.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateCompression.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCompression.MODID);

    public static final Map<String, RegistryObject<Block>> BLOCKS_MAP = new HashMap<>();
    public static final Map<String, RegistryObject<BlockItem>> ITEMS_MAP = new HashMap<>();
    static {
        registerBlockWithItem("nether_star", Nether_Star_Block::new);
        registerBlockWithItem("refined_radiance_block", Refined_Radiance_Block::new);
        registerBlockWithItem("shadow_steel_block", Shadow_Steel_Block::new);
        for (int i = 1; i <= 9; i++) {
            registerBlockWithItem("compressed_acacia_log_" + i + "x", Acacia_Log::new);
            registerBlockWithItem("compressed_acacia_plank_" + i + "x", Acacia_Plank::new);
            registerBlockWithItem("compressed_amethyst_" + i + "x", Amethyst::new);
            registerBlockWithItem("compressed_andesite_" + i + "x", Andesite::new);
            registerBlockWithItem("compressed_andesite_alloy_" + i + "x", Andesite_Alloy::new);
            registerBlockWithItem("compressed_asurine_" + i + "x", Asurine::new);
            registerBlockWithItem("compressed_basalt_" + i + "x", Basalt::new);
            registerBlockWithItem("compressed_birch_log_" + i + "x", Birch_Log::new);
            registerBlockWithItem("compressed_birch_plank_" + i + "x", Birch_Plank::new);
            registerBlockWithItem("compressed_blackstone_" + i + "x", Blackstone::new);
            registerBlockWithItem("compressed_brass_" + i + "x", Brass::new);
            registerBlockWithItem("compressed_clay_" + i + "x", Clay::new);
            registerBlockWithItem("compressed_coal_" + i + "x", Coal::new);
            registerBlockWithItem("compressed_cobbled_deepslate_" + i + "x", Cobbled_Deepslate::new);
            registerBlockWithItem("compressed_cobblestone_" + i + "x", Cobblestone::new);
            registerBlockWithItem("compressed_copper_" + i + "x", Copper::new);
            registerBlockWithItem("compressed_crimsite_" + i + "x", Crimsite::new);
            registerBlockWithItem("compressed_crimson_plank_" + i + "x", Crimson_Plank::new);
            registerBlockWithItem("compressed_crimson_stem_" + i + "x", Crimson_Stem::new);
            registerBlockWithItem("compressed_dark_oak_log_" + i + "x", Dark_Oak_Log::new);
            registerBlockWithItem("compressed_dark_oak_plank_" + i + "x", Dark_Oak_Plank::new);
            registerBlockWithItem("compressed_deepslate_" + i + "x", Deepslate::new);
            registerBlockWithItem("compressed_diamond_" + i + "x", Diamond::new);
            registerBlockWithItem("compressed_diorite_" + i + "x", Diorite::new);
            registerBlockWithItem("compressed_dirt_" + i + "x", Dirt::new);
            registerBlockWithItem("compressed_emerald_" + i + "x", Emerald::new);
            registerBlockWithItem("compressed_end_stone_" + i + "x", End_Stone::new);
            registerBlockWithItem("compressed_experience_" + i + "x", Experience::new);
            registerBlockWithItem("compressed_glass_" + i + "x", Glass::new);
            registerBlockWithItem("compressed_glowstone_" + i + "x", Glowstone::new);
            registerBlockWithItem("compressed_gold_" + i + "x", Gold::new);
            registerBlockWithItem("compressed_granite_" + i + "x", Granite::new);
            registerBlockWithItem("compressed_grass_" + i + "x", Grass::new);
            registerBlockWithItem("compressed_gravel_" + i + "x", Gravel::new);
            registerBlockWithItem("compressed_hay_" + i + "x", Hay::new);
            registerBlockWithItem("compressed_honey_" + i + "x", Honey::new);
            registerBlockWithItem("compressed_iron_" + i + "x", Iron::new);
            registerBlockWithItem("compressed_jungle_log_" + i + "x", Jungle_Log::new);
            registerBlockWithItem("compressed_jungle_plank_" + i + "x", Jungle_Plank::new);
            registerBlockWithItem("compressed_lapis_" + i + "x", Lapis::new);
            registerBlockWithItem("compressed_limestone_" + i + "x", Limestone::new);
            registerBlockWithItem("compressed_melon_" + i + "x", Melon::new);
            registerBlockWithItem("compressed_nether_star_" + i + "x", Nether_Star::new);
            registerBlockWithItem("compressed_netherite_" + i + "x", Netherite::new);
            registerBlockWithItem("compressed_netherrack_" + i + "x", Netherrack::new);
            registerBlockWithItem("compressed_oak_log_" + i + "x", Oak_Log::new);
            registerBlockWithItem("compressed_oak_plank_" + i + "x", Oak_Plank::new);
            registerBlockWithItem("compressed_obsidian_" + i + "x", Obsidian::new);
            registerBlockWithItem("compressed_ochrum_" + i + "x", Ochrum::new);
            registerBlockWithItem("compressed_podzol_" + i + "x", Podzol::new);
            registerBlockWithItem("compressed_pumpkin_" + i + "x", Pumpkin::new);
            registerBlockWithItem("compressed_quartz_" + i + "x", Quartz::new);
            registerBlockWithItem("compressed_red_sand_" + i + "x", Red_Sand::new);
            registerBlockWithItem("compressed_redstone_" + i + "x", Redstone::new);
            registerBlockWithItem("compressed_sand_" + i + "x", Sand::new);
            registerBlockWithItem("compressed_scorchia_" + i + "x", Scorchia::new);
            registerBlockWithItem("compressed_scoria_" + i + "x", Scoria::new);
            registerBlockWithItem("compressed_snow_" + i + "x", Snow::new);
            registerBlockWithItem("compressed_soul_sand_" + i + "x", Soul_Sand::new);
            registerBlockWithItem("compressed_soul_soil_" + i + "x", Soul_Soil::new);
            registerBlockWithItem("compressed_spruce_log_" + i + "x", Spruce_Log::new);
            registerBlockWithItem("compressed_spruce_plank_" + i + "x", Spruce_Plank::new);
            registerBlockWithItem("compressed_stone_" + i + "x", Stone::new);
            registerBlockWithItem("compressed_terracotta_" + i + "x", Terracotta::new);
            registerBlockWithItem("compressed_tuff_" + i + "x", Tuff::new);
            registerBlockWithItem("compressed_veridium_" + i + "x", Veridium::new);
            registerBlockWithItem("compressed_warped_plank_" + i + "x", Warped_Plank::new);
            registerBlockWithItem("compressed_warped_stem_" + i + "x", Warped_Stem::new);
            registerBlockWithItem("compressed_zinc_" + i + "x", Zinc::new);
        }
        // Register other blocks here...
    }

    private static void registerBlockWithItem(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        BLOCKS_MAP.put(name, block);
        ITEMS_MAP.put(name, blockItem(block));
    }

    private static RegistryObject<BlockItem> blockItem(RegistryObject<Block> block) {
        return ITEMS.register(block.getId().getPath(),
            () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
