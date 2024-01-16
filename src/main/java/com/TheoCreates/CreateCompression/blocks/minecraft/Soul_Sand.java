package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Soul_Sand extends Block {
    public Soul_Sand() {
        super(Properties.of()
            .sound(SoundType.SOUL_SAND)
            .strength(0.5f));
    }
}
