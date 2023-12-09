package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Copper extends Block {
    public Copper() {
        super(Properties.of(Material.METAL)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(3.0f, 6.0f));
    }
}
