package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Glass extends GlassBlock {
    public Glass() {
        super(Properties.of(Material.GLASS)
            .sound(SoundType.GLASS)
            .requiresCorrectToolForDrops()
            .strength(7.0f, 20.0f));
    }
}
