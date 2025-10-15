package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Raw_Gold extends Block {
    public Raw_Gold() {
        super(Properties.of()
            .sound(SoundType.STONE)
            .strength(5.0f, 6.0f));
    }
}
