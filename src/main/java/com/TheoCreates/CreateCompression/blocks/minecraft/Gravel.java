package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Gravel extends FallingBlock {
    public Gravel() {
        super(Properties.copy(Blocks.SAND)
            .sound(SoundType.GRAVEL)
            .strength(0.6f));
    }
}

