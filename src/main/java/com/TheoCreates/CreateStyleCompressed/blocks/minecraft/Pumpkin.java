package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class Pumpkin extends Block {
    public Pumpkin() {
        super(BlockBehaviour.Properties.of(Material.PLANT)
            .sound(SoundType.WOOD)
            .strength(7.0f, 20.0f));
    }
}
