package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Oak_Plank extends Block {
    public Oak_Plank() {
        super(Properties.of()
            .sound(SoundType.WOOD)
            .strength(2.0f, 3.0f));
    }
}
