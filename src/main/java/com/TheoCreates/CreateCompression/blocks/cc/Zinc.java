package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Zinc extends Block {
    public Zinc() {
        super(Properties.of()
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(5.0f, 6.0f));
    }
}
