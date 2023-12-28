package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Crimsite extends Block {
    public Crimsite() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(1.25f, 6.0f));
    }
}
