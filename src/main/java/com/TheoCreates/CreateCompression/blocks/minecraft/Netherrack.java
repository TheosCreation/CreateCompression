package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Netherrack extends Block {
    public Netherrack() {
        super(Properties.of()
            .sound(SoundType.NETHERRACK)
            .requiresCorrectToolForDrops()
            .strength(0.4f));
    }
}
