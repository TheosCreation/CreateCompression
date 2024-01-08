package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Snow extends Block {
    public Snow() {
        super(Properties.copy(Blocks.SNOW)
            .sound(SoundType.SNOW)
            .requiresCorrectToolForDrops()
            .strength(0.2f));
    }
}
