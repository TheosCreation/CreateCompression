package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Red_Sand extends Block {
    public Red_Sand() {
        super(Properties.of()
            .sound(SoundType.SAND)
            .strength(0.5f));
    }
}
