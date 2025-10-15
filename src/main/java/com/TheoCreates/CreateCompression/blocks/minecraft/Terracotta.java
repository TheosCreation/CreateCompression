package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;

public class Terracotta extends Block {
    public Terracotta() {
        super(Properties.of()
            .requiresCorrectToolForDrops()
            .strength(1.25F, 4.2F));
    }
}
