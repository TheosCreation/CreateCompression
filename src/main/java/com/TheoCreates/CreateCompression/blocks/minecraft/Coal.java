package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Coal extends Block {
    public Coal() {
        super(Properties.of()
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(5.0f, 6.0f));
    }
}
