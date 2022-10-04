package io.github.hyperology.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;

import static io.github.hyperology.Hyperology.ofModIdentifier;

public class Blocks {
    public static final Block ANTIMONY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static void register() {
        register("antimony_block", ANTIMONY_BLOCK);
    }

    private static void register(String path, Block block) {
        Registry.register(Registry.BLOCK, ofModIdentifier(path), block);
    }
}
