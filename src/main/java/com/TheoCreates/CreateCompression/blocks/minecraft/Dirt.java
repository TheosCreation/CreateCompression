package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Dirt extends Block {
    public Dirt() {
        super(Properties.copy(Blocks.DIRT)
            .sound(SoundType.GRAVEL)
            .strength(0.5f));
    }
}
