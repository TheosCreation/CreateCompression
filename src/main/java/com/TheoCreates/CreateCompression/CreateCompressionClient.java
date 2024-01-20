package com.TheoCreates.CreateCompression;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public class CreateCompressionClient {
    public static void setupItemVar() {
        for (CreateCompressionType type : CreateCompressionType.VALUES) {
            for (Block block : type.blocks) {
                ItemBlockRenderTypes.setRenderLayer(block, renderType -> renderType == RenderType.solid() || renderType == RenderType.translucent());
            }
        }
    }
}
