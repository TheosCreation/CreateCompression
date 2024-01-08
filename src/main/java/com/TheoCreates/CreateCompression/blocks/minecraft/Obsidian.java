package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Obsidian extends Block {
    public Obsidian() {
        super(Properties.copy(Blocks.STONE)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(50.0f, 1200.0f));
    }
}
