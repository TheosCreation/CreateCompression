package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Basalt extends Block {
    public Basalt() {
        super(Properties.of()
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
            .strength(1.25f, 4.2f));
    }
}
