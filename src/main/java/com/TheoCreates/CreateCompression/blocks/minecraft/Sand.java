package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;


public class Sand extends FallingBlock {
    public Sand() {
        super(Properties.of()
            .sound(SoundType.SAND)
            .strength(0.5f));
    }
}
