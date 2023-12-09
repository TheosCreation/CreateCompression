package com.TheoCreates.CreateStyleCompressed.blocks.csc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Nether_Star_Block extends Block {
    public Nether_Star_Block() {
        super(Properties.of(Material.METAL)
            .lightLevel((b) -> 15)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(25.0f, 800.0f));
    }
}
