package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Basalt extends Block {
    public Basalt() {
        super(Properties.copy(Blocks.STONE)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
            .strength(1.25f, 4.2f));
    }
}
