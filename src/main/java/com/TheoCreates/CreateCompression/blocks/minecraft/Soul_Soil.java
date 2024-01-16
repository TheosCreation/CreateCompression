package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Soul_Soil extends Block {
    public Soul_Soil() {
        super(Properties.of()
            .sound(SoundType.SOUL_SOIL)
            .requiresCorrectToolForDrops()
            .strength(0.5f));
    }
}

