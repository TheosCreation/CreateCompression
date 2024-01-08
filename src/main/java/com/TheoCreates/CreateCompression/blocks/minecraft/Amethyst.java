package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Amethyst extends Block {
    public Amethyst() {
        super(Properties.copy(Blocks.AMETHYST_BLOCK)
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()
            .strength(1.5f));
    }
}
