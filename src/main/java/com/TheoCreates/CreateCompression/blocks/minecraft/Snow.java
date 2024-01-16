package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Snow extends Block {
    public Snow() {
        super(Properties.of()
            .sound(SoundType.SNOW)
            .requiresCorrectToolForDrops()
            .strength(0.2f));
    }
}
