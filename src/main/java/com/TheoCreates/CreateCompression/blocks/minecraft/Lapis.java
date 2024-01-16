package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Lapis extends Block {
    public Lapis() {
        super(Properties.of()
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(3.0f, 3.0f));
    }
}
