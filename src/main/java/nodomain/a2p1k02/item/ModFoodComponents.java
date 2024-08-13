package nodomain.a2p1k02.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent FRUIT_SLICE_COMPONENT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent BEEF_COMPONENT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodComponent COCKED_BEEF_COMPONENT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.25f).build();
    public static final FoodComponent RAW_BEEF_DISH_COMPONENT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.25f).build();
}
