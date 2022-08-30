package io.github.hyperology;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.hyperology.block.Blocks.*;
import static io.github.hyperology.item.Items.*;

public class Main implements ModInitializer {
	public static final String MODID = "hyperology";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier(MODID, "antimony_block"), ANTIMONY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MODID, "antimony_block"), new BlockItem(ANTIMONY_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MODID, "antimony_ingot"), ANTIMONY_INGOT);
		Registry.register(Registry.ITEM, new Identifier(MODID, "antimony_nugget"), ANTIMONY_NUGGET);
	}
}
