package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Crimsite extends Block {
    public Crimsite() {
        super(Properties.of()
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(1.25f, 6.0f));
    }
}
