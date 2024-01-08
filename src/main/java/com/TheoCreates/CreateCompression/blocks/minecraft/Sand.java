package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Sand extends FallingBlock {
    public Sand() {
        super(Properties.copy(Blocks.SAND)
            .sound(SoundType.SAND)
            .strength(0.5f));
    }
}
