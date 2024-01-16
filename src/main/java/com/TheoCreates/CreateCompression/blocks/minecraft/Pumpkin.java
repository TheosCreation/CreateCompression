package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class Pumpkin extends Block {
    public Pumpkin() {
        super(BlockBehaviour.Properties.of()
            .sound(SoundType.WOOD)
            .strength(1.0f));
    }
}
