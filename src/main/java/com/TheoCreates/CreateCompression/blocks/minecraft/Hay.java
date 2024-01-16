package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Hay extends Block {
    public Hay() {
        super(Properties.of()
            .sound(SoundType.GRASS)
            .requiresCorrectToolForDrops()
            .strength(0.5f));
    }
}
