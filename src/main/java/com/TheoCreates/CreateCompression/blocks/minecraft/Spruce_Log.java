package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Spruce_Log extends Block {
    public Spruce_Log() {
        super(Properties.copy(Blocks.OAK_LOG)
            .sound(SoundType.WOOD)
            .strength(2.0f, 2.0f));
    }
}
