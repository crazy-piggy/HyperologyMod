package io.github.hyperology.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Blocks {
    public static final Block ANTIMONY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
}
