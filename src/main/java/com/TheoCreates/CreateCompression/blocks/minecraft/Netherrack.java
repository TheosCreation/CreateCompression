package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Netherrack extends Block {
    public Netherrack() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.NETHERRACK)
            .requiresCorrectToolForDrops()
            .strength(0.4f));
    }
}
