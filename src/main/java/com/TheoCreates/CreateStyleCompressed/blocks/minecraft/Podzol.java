package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Podzol extends Block {
    public Podzol() {
        super(Properties.of(Material.DIRT)
            .sound(SoundType.GRAVEL)
            .strength(0.5f));
    }
}
