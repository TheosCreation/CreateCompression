package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Netherrack extends Block {
    public Netherrack() {
        super(Properties.copy(Blocks.STONE)
            .sound(SoundType.NETHERRACK)
            .requiresCorrectToolForDrops()
            .strength(0.4f));
    }
}
