package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Grass extends Block {
    public Grass() {
        super(Properties.of(Material.GRASS)
            .sound(SoundType.GRASS)
            .strength(0.6f));
    }
}
