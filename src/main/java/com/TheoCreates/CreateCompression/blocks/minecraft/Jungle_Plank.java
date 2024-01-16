package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Jungle_Plank extends Block {
    public Jungle_Plank() {
        super(Properties.of()
            .sound(SoundType.WOOD)
            .strength(2.0f, 3.0f));
    }
}
