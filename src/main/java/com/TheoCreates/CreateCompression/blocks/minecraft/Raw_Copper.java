package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Raw_Copper extends Block {
    public Raw_Copper() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.STONE)
            .strength(5.0f, 6.0f));
    }
}
