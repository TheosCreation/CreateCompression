package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Hay extends Block {
    public Hay() {
        super(Properties.of(Material.GRASS)
            .sound(SoundType.GRASS)
            .requiresCorrectToolForDrops()
            .strength(0.5f));
    }
}
