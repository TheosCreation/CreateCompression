package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Oak_Plank extends Block {
    public Oak_Plank() {
        super(Properties.of(Material.WOOD)
            .sound(SoundType.WOOD)
            .strength(2.0f, 3.0f));
    }
}
