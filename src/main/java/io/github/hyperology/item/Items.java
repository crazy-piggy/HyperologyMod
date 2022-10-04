package io.github.hyperology.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.registry.Registry;

import static io.github.hyperology.Hyperology.ofModIdentifier;
import static io.github.hyperology.block.Blocks.ANTIMONY_BLOCK;

public class Items {
    public static final Item ANTIMONY_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ANTIMONY_NUGGET = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ANTIMONY_SWORD = new SwordItem(AntimonySword.INSTANCE, 5, 5, new Item.Settings().group(ItemGroup.COMBAT));

    public static void register() {
        register("antimony_block", new BlockItem(ANTIMONY_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        register("antimony_ingot", ANTIMONY_INGOT);
        register("antimony_nugget", ANTIMONY_NUGGET);
        register("antimony_sword", ANTIMONY_SWORD);
    }

    private static void register(String path, Item item) {
        Registry.register(Registry.ITEM, ofModIdentifier(path), item);
    }
}
