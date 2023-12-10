package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Amethyst extends Block {
    public Amethyst() {
        super(Properties.of(Material.AMETHYST)
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()
            .strength(1.5f));
    }
}
