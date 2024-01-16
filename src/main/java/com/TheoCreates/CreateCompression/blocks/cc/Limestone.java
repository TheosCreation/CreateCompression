package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Limestone extends Block {
    public Limestone() {
        super(Properties.of()
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(1.25f, 0.8f));
    }
}
