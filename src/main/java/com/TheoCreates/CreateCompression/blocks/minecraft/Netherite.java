package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Netherite extends Block {
    public Netherite() {
        super(Properties.of(Material.METAL)
            .sound(SoundType.NETHERITE_BLOCK)
            .requiresCorrectToolForDrops()
            .strength(50.0f, 1200.0f));
    }
}
