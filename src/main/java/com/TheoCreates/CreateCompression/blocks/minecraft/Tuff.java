package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Tuff extends Block {
    public Tuff() {
        super(Properties.copy(Blocks.STONE)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
            .strength(1.5f, 6.0f));
    }
}
