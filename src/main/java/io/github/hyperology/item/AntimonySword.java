package io.github.hyperology.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static io.github.hyperology.item.Items.ANTIMONY_NUGGET;

public enum AntimonySword implements ToolMaterial {
    INSTANCE;

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ANTIMONY_NUGGET);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public int getEnchantability() {
        return 127;
    }
}
