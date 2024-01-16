package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Clay extends Block {
    public Clay() {
        super(Properties.of()
            .sound(SoundType.GRAVEL)
            .strength(0.6f));
    }
}
