package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Experience extends Block {
    public Experience() {
        super(Properties.of(Material.AMETHYST)
            .lightLevel((b) -> 15)
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()
            .strength(3.0f, 6.0f));
    }
}
