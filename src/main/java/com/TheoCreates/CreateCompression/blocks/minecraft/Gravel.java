package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;


public class Gravel extends FallingBlock {
    public Gravel() {
        super(Properties.of()
            .sound(SoundType.GRAVEL)
            .strength(0.6f));
    }
}

