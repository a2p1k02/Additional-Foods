package nodomain.a2p1k02.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.AdditionalFoods;

public class ModItemGroups {
    public static final ItemGroup ADDITIONAL_FOODS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AdditionalFoods.MOD_ID, "pumpkin_slice"),
            FabricItemGroup.builder().displayName(
                    Text.translatable("itemgroup.pumpkin_slice")).icon(() ->
                    new ItemStack(ModItems.PUMPKIN_SLICE)).entries((displayContext, entries) -> {
                entries.add(ModItems.PUMPKIN_SLICE);
                entries.add(ModItems.MINCED_BEEF);
                entries.add(ModItems.BEEF_PATTY);
                entries.add(ModItems.BEEF_TARTARE);
                entries.add(ModItems.DIAMOND_KNIFE);
            }).build());

    public static void registerItemGroups() {
        AdditionalFoods.LOGGER.info("Registering Item Groups for " + AdditionalFoods.MOD_ID);
    }
}
