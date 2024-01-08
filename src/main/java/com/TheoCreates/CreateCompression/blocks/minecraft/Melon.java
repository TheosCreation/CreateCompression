package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;

public class Melon extends Block {
    public Melon() {
        super(BlockBehaviour.Properties.copy(Blocks.MELON)
            .sound(SoundType.WOOD)
            .strength(1.0f));
    }
}
