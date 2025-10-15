package com.TheoCreates.CreateCompression.blocks.minecraft;


import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class Gravel extends FallingBlock {
    public static final MapCodec<Gravel> CODEC = simpleCodec(Gravel::new);

    public Gravel(BlockBehaviour.Properties props) {
        super(props);
    }

    public static Gravel create() {
        return new Gravel(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(0.5F));
    }

    @Override
    protected MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }
}

