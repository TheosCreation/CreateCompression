package com.TheoCreates.CreateStyleCompressed.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.runtime.IIngredientManager;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;

import static com.TheoCreates.CreateStyleCompressed.CreateStyleCompressed.MODID;

@JeiPlugin
public class JEICompat implements IModPlugin {

    private static final ResourceLocation PLUGIN_ID = new ResourceLocation(MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return PLUGIN_ID;
    }

    @Override
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {
        IIngredientManager ingredientManager = jeiRuntime.getIngredientManager();
        if (ModList.get().isLoaded("compressium")) {
            ingredientManager.removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, Arrays.asList(
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:clay_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:coal_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:cobblestone_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:diamond_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:dirt_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:emerald_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:end_stone_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gold_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:gravel_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:honey_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:iron_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:lapis_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherite_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:netherrack_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:obsidian_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:quartz_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:red_sand_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:redstone_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:sand_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:snow_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:soul_sand_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:stone_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:nether_star_block_9x")))
            ));
        }
        if (!ModList.get().isLoaded("create")) {
            ingredientManager.removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, Arrays.asList(
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:zinc_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:experience_block_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createstylecompressed:brass_block_9x")))
            ));
        }
    }
}
