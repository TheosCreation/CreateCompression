package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Amethyst extends Block {
    public Amethyst() {
        super(Properties.of()
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()
            .strength(1.5f));
    }
}
