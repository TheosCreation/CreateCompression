package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Netherite extends Block {
    public Netherite() {
        super(Properties.of()
            .sound(SoundType.NETHERITE_BLOCK)
            .requiresCorrectToolForDrops()
            .strength(50.0f, 1200.0f));
    }
}
