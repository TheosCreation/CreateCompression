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

    //make a new way to hide create blocks when create is not loaded
}
