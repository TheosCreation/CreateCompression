package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Raw_Copper extends Block {
    public Raw_Copper() {
        super(Properties.of()
            .sound(SoundType.STONE)
            .strength(5.0f, 6.0f));
    }
}
