package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Grass extends Block {
    public Grass() {
        super(Properties.copy(Blocks.GRASS)
            .sound(SoundType.GRASS)
            .strength(0.6f));
    }
}
