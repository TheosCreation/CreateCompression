package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Nether_Star extends Block {
    public Nether_Star() {
        super(Properties.of()
            .lightLevel((b) -> 15)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(25.0f, 800.0f));
    }
}
