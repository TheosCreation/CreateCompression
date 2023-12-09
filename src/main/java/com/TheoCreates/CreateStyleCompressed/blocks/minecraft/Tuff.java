package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Tuff extends Block {
    public Tuff() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
            .strength(1.5f, 6.0f));
    }
}
