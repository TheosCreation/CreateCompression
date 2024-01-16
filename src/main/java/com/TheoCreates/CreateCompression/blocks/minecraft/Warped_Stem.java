package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Warped_Stem extends Block {
    public Warped_Stem() {
        super(Properties.of()
            .sound(SoundType.WOOD)
            .strength(2.0f, 2.0f));
    }
}
