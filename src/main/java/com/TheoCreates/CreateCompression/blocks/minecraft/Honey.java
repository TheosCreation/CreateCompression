package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Honey extends Block {
    public Honey() {
        super(Properties.of()
            .sound(SoundType.HONEY_BLOCK)
            .speedFactor(0.4F).jumpFactor(0.5F)
            .noOcclusion());
    }
}
