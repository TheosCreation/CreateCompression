package com.TheoCreates.CreateCompression.compat;

import com.TheoCreates.CreateCompression.ModBlocks;
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
            ingredientManager.removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK,
                Arrays.asList(
                    new ItemStack(ModBlocks.compressed_andesite_alloy_1x_item.get()),
                    new ItemStack(ModBlocks.compressed_andesite_alloy_2x_item.get()),
                    new ItemStack(ModBlocks.compressed_andesite_alloy_3x_item.get()),
                    new ItemStack(ModBlocks.compressed_andesite_alloy_4x_item.get()),
                    new ItemStack(ModBlocks.compressed_andesite_alloy_5x_item.get()),
                    new ItemStack(ModBlocks.compressed_andesite_alloy_6x_item.get()),
                    new ItemStack(ModBlocks.compressed_andesite_alloy_7x_item.get()),
                    new ItemStack(ModBlocks.compressed_andesite_alloy_8x_item.get()),
                    new ItemStack(ModBlocks.compressed_andesite_alloy_9x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_1x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_2x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_3x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_4x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_5x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_6x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_7x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_8x_item.get()),
                    new ItemStack(ModBlocks.compressed_asurine_9x_item.get())
                    //new ItemStack(ModBlocks.compressed_brass_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_brass_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_brass_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_brass_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_brass_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_brass_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_brass_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_brass_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_brass_9x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_crimsite_9x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_experience_9x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_limestone_9x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_ochrum_9x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scorchia_9x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_scoria_9x_item.get()),
                    //new ItemStack(ModBlocks.refined_radiance_block_item.get()),
                    //new ItemStack(ModBlocks.shadow_steel_block_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_veridium_9x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_1x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_2x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_3x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_4x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_5x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_6x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_7x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_8x_item.get()),
                    //new ItemStack(ModBlocks.compressed_zinc_9x.get())
                ));
        }
    }
}
