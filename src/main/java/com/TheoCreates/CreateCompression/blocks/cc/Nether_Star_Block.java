package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Nether_Star_Block extends Block {
    public Nether_Star_Block() {
        super(Properties.copy(Blocks.IRON_BLOCK)
            .lightLevel((b) -> 15)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(25.0f, 800.0f));
    }
}
