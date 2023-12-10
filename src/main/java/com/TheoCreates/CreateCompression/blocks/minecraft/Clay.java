package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Clay extends Block {
    public Clay() {
        super(Properties.of(Material.CLAY)
            .sound(SoundType.GRAVEL)
            .strength(0.6f));
    }
}
