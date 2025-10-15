package com.TheoCreates.CreateCompression.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.runtime.IIngredientManager;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.ModList;

import com.TheoCreates.CreateCompression.CreateCompression;

import java.util.List;
import java.util.stream.Collectors;

@JeiPlugin
public final class JEICompat implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(CreateCompression.MODID, "jei_plugin");
    }

    @Override
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {
        if (ModList.get().isLoaded("create")) return;

        IIngredientManager mgr = jeiRuntime.getIngredientManager();

        // Remove all createcompression items that start with "compressed_"
        // plus specific non-prefixed blocks.
        List<ItemStack> toRemove = BuiltInRegistries.ITEM.stream()
            .map(item -> BuiltInRegistries.ITEM.getKey(item))
            .filter(rl -> rl != null && rl.getNamespace().equals(CreateCompression.MODID))
            .filter(rl -> {
                String p = rl.getPath();
                return p.startsWith("compressed_")
                    || p.equals("refined_radiance_block")
                    || p.equals("shadow_steel_block");
            })
            .map(rl -> new ItemStack(BuiltInRegistries.ITEM.get(rl)))
            .filter(stack -> !stack.isEmpty())
            .collect(Collectors.toList());

        if (!toRemove.isEmpty()) {
            mgr.removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, toRemove);
        }
    }
}
