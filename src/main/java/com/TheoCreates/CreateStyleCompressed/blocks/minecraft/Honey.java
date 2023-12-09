package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Honey extends Block {
    public Honey() {
        super(Properties.of(Material.CLAY)
            .sound(SoundType.HONEY_BLOCK)
            .speedFactor(0.4F).jumpFactor(0.5F)
            .noOcclusion());
    }
}
