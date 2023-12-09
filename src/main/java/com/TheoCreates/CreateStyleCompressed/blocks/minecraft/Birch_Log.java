package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Birch_Log extends Block {
    public Birch_Log() {
        super(Properties.of(Material.WOOD)
            .sound(SoundType.WOOD)
            .strength(2.0f, 2.0f));
    }
}
