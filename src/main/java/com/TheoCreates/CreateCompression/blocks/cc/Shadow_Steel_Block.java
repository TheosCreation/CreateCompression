package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Shadow_Steel_Block extends Block {
    public Shadow_Steel_Block() {
        super(Properties.of()
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(25.0f, 800.0f));
    }
}
