package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Crimson_Stem extends Block {
    public Crimson_Stem() {
        super(Properties.copy(Blocks.OAK_LOG)
            .sound(SoundType.WOOD)
            .strength(2.0f, 2.0f));
    }
}
