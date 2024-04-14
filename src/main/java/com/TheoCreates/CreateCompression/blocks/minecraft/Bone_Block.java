package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Bone_Block extends Block {
    public Bone_Block() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.BONE_BLOCK)
            .strength(2.0f, 2.0f));
    }
}
