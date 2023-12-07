package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Melon extends Block {
    public Melon() {
        super(Properties.of(Material.PLANT)
            .sound(SoundType.WOOD)
            .strength(7.0f, 20.0f));
    }
}
