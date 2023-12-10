package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Soul_Soil extends Block {
    public Soul_Soil() {
        super(Properties.of(Material.DIRT)
            .sound(SoundType.SOUL_SOIL)
            .requiresCorrectToolForDrops()
            .strength(0.5f));
    }
}

