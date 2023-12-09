package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Acacia_Log extends Block {
    public Acacia_Log() {
        super(Properties.of(Material.WOOD)
            .sound(SoundType.WOOD)
            .strength(2.0f, 2.0f));
    }
}
