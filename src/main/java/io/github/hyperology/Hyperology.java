package io.github.hyperology;

import io.github.hyperology.block.Blocks;
import io.github.hyperology.item.Items;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hyperology implements ModInitializer {

    public static final String MODID = "hyperology";
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    public static Identifier ofModIdentifier(String path) {
        return new Identifier(MODID, path);
    }

    @Override
    public void onInitialize() {
        Blocks.register();
        Items.register();
    }
}
