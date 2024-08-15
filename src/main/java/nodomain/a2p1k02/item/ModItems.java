package nodomain.a2p1k02.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.AdditionalFoods;
import nodomain.a2p1k02.block.ModBlocks;

public class ModItems {

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()));

    public static final Item PUMPKIN_SLICE = registerItem("pumpkin_slice",
            new Item(new Item.Settings().food(ModFoodComponents.FRUIT_SLICE_COMPONENT)));

    public static final Item TOMATO = registerItem("tomato",
            new Item(new Item.Settings().food(ModFoodComponents.VEGETABLE_COMPONENT)));

    public static final Item TOMATO_SOUP = registerItem("tomato_soup",
            new Item(new Item.Settings().food(ModFoodComponents.SOUP_COMPONENT)));

    public static final Item MINCED_BEEF = registerItem("minced_beef",
            new Item(new Item.Settings().food(ModFoodComponents.BEEF_COMPONENT)));

    public static final Item BEEF_PATTY = registerItem("beef_patty",
            new Item(new Item.Settings().food(ModFoodComponents.COOKED_BEEF_COMPONENT)));

    public static final Item BEEF_TARTARE = registerItem("beef_tartare",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_BEEF_DISH_COMPONENT)));

    public static final Item FLINT_KNIFE = registerItem("flint_knife",
            new SwordItem(KnifeMaterial.KNIFE_FLINT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(
                            KnifeMaterial.KNIFE_FLINT, 1, -2.4f))));

    public static final Item IRON_KNIFE = registerItem("iron_knife",
            new SwordItem(KnifeMaterial.KNIFE_IRON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(
                            KnifeMaterial.KNIFE_IRON, 1, -2.4f))));

    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife",
            new SwordItem(KnifeMaterial.KNIFE_DIAMOND, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(
                            KnifeMaterial.KNIFE_DIAMOND, 1, -2.4f))));

    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife",
            new SwordItem(KnifeMaterial.KNIFE_NETHERITE, new Item.Settings().fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(
                            KnifeMaterial.KNIFE_NETHERITE, 1, -2.4f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdditionalFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdditionalFoods.LOGGER.info("Registering Mod Items for " + AdditionalFoods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(TOMATO_SEEDS);
            entries.add(PUMPKIN_SLICE);
            entries.add(TOMATO);
            entries.add(TOMATO_SOUP);
            entries.add(MINCED_BEEF);
            entries.add(BEEF_PATTY);
            entries.add(BEEF_TARTARE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(FLINT_KNIFE);
            entries.add(IRON_KNIFE);
            entries.add(DIAMOND_KNIFE);
            entries.add(NETHERITE_KNIFE);
        });
    }
}
