package com.TheoCreates.CreateCompression.compat;

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

import static com.TheoCreates.CreateCompression.CreateCompression.MODID;

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
        if (!ModList.get().isLoaded("create")) {
            ingredientManager.removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, Arrays.asList(
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_andesite_alloy_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_asurine_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_brass_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_crimsite_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_experience_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_limestone_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_ochrum_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scorchia_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_scoria_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:refined_radiance_block"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:shadow_steel_block"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_veridium_9x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_1x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_2x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_3x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_4x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_5x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_6x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_7x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_8x"))),
                new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createcompression:compressed_zinc_9x")))
            ));
        }
    }
}
