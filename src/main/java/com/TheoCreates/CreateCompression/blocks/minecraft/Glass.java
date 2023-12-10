package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Glass extends Block {
    public Glass() {
        super(Properties.of(Material.GLASS)
            .sound(SoundType.GLASS)
            .strength(0.3f)
            .noOcclusion());
    }
}
