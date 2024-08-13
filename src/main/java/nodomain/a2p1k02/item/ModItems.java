package nodomain.a2p1k02.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.AdditionalFoods;

public class ModItems {
    public static final Item PUMPKIN_SLICE = registerItem("pumpkin_slice",
            new Item(new Item.Settings().food(ModFoodComponents.FRUIT_SLICE_COMPONENT)));

    public static final Item MINCED_BEEF = registerItem("minced_beef",
            new Item(new Item.Settings().food(ModFoodComponents.BEEF_COMPONENT)));

    public static final Item BEEF_PATTY = registerItem("beef_patty",
            new Item(new Item.Settings().food(ModFoodComponents.COCKED_BEEF_COMPONENT)));

    public static final Item BEEF_TARTARE = registerItem("beef_tartare",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_BEEF_DISH_COMPONENT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdditionalFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdditionalFoods.LOGGER.info("Registering Mod Items for " + AdditionalFoods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(PUMPKIN_SLICE);
            entries.add(MINCED_BEEF);
            entries.add(BEEF_PATTY);
            entries.add(BEEF_TARTARE);
        });
    }
}
