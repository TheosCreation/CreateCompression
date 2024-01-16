package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Andesite_Alloy extends Block {
    public Andesite_Alloy() {
        super(Properties.of()
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(1.25f, 0.8f));
    }
}
