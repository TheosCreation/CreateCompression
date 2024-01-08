package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Podzol extends Block {
    public Podzol() {
        super(Properties.copy(Blocks.DIRT)
            .sound(SoundType.GRAVEL)
            .strength(0.5f));
    }
}
