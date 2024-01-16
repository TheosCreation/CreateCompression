package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Blackstone extends Block {
    public Blackstone() {
        super(Properties.of()
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(1.5f, 6.0f));
    }
}
