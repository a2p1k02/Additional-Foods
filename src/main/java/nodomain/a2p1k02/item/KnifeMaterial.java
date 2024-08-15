package nodomain.a2p1k02.item;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public enum KnifeMaterial implements ToolMaterial {

    KNIFE_FLINT(250, 2, 1, 10, Ingredient.ofItems(Items.FLINT)),
    KNIFE_IRON(450, 2, 3, 15, Ingredient.ofItems(Items.IRON_INGOT)),
    KNIFE_DIAMOND(650, 2, 4, 20, Ingredient.ofItems(Items.DIAMOND)),
    KNIFE_NETHERITE(850, 2, 5, 20, Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    KnifeMaterial(int durability, float miningSpeed, float attackDamage, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }
}
