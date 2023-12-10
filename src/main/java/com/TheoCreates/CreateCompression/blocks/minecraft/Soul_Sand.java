package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Soul_Sand extends Block {
    public Soul_Sand() {
        super(Properties.of(Material.SAND)
            .sound(SoundType.SOUL_SAND)
            .strength(0.5f));
    }
}
