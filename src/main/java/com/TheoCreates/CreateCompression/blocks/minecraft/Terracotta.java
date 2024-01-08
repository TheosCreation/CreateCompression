package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class Terracotta extends Block {
    public Terracotta() {
        super(Properties.copy(Blocks.TERRACOTTA)
            .requiresCorrectToolForDrops()
            .strength(1.25F, 4.2F));
    }
}
