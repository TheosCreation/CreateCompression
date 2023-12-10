package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Deepslate extends Block {
    public Deepslate() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()
            .strength(3.0f, 6.0f));
    }
}
