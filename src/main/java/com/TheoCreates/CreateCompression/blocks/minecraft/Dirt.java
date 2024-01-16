package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Dirt extends Block {
    public Dirt() {
        super(Properties.of()
            .sound(SoundType.GRAVEL)
            .strength(0.5f));
    }
}
