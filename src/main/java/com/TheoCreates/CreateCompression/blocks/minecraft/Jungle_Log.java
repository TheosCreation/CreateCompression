package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Jungle_Log extends Block {
    public Jungle_Log() {
        super(Properties.of()
            .sound(SoundType.WOOD)
            .strength(2.0f, 2.0f));
    }
}
