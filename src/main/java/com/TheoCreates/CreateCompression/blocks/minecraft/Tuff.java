package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Tuff extends Block {
    public Tuff() {
        super(Properties.of()
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
            .strength(1.5f, 6.0f));
    }
}
