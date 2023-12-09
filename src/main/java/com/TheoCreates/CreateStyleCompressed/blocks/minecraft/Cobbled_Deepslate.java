package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Cobbled_Deepslate extends Block {
    public Cobbled_Deepslate() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()
            .strength(3.5f, 6.0f));
    }
}
