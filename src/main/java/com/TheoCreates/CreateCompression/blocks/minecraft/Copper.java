package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Copper extends Block {
    public Copper() {
        super(Properties.of()
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(3.0f, 6.0f));
    }
}
