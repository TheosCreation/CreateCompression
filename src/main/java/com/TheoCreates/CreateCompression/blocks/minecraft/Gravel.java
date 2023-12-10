package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Gravel extends FallingBlock {
    public Gravel() {
        super(Properties.of(Material.SAND)
            .sound(SoundType.GRAVEL)
            .strength(0.6f));
    }
}

