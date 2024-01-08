package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Hay extends Block {
    public Hay() {
        super(Properties.copy(Blocks.GRASS)
            .sound(SoundType.GRASS)
            .requiresCorrectToolForDrops()
            .strength(0.5f));
    }
}
