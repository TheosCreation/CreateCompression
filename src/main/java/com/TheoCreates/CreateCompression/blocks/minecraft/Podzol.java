package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;


public class Podzol extends Block {
    public Podzol() {
        super(Properties.of()
            .sound(SoundType.GRAVEL)
            .strength(0.5f));
    }
}
