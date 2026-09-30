package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Raw_Zinc extends Block {
    public Raw_Zinc() {
        super(Properties.of()
            .sound(SoundType.STONE)
            .strength(5.0f, 6.0f));
    }
}
