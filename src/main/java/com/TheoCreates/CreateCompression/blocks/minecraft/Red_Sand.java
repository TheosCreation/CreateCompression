package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Red_Sand extends Block {
    public Red_Sand() {
        super(Properties.copy(Blocks.SAND)
            .sound(SoundType.SAND)
            .strength(0.5f));
    }
}
