package com.TheoCreates.CreateStyleCompressed.blocks.csc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Zinc extends Block {
    public Zinc() {
        super(Properties.of(Material.METAL)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(5.0f, 6.0f));
    }
}
