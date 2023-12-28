package com.TheoCreates.CreateCompression.blocks.cc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Andesite_Alloy extends Block {
    public Andesite_Alloy() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(1.25f, 0.8f));
    }
}
