package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Dark_Oak_Plank extends Block {
    public Dark_Oak_Plank() {
        super(Properties.copy(Blocks.OAK_LOG)
            .sound(SoundType.WOOD)
            .strength(2.0f, 3.0f));
    }
}
