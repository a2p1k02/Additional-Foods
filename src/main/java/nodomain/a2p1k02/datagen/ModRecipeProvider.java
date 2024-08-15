package nodomain.a2p1k02.datagen;

import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> COOKED = List.of(ModItems.MINCED_BEEF);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, COOKED, RecipeCategory.FOOD, ModItems.BEEF_PATTY, 0.7f, 200, "");

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOMATO_SEEDS, 1)
                .pattern("S")
                .input('S', Items.WHEAT_SEEDS)
                .criterion(hasItem(Items.WHEAT_SEEDS), conditionsFromItem(Items.WHEAT_SEEDS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.TOMATO_SEEDS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.FLINT_KNIFE, 1)
                .pattern("F")
                .pattern("S")
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.FLINT_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_KNIFE, 1)
                .pattern("I")
                .pattern("S")
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.IRON_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_KNIFE, 1)
                .pattern("D")
                .pattern("S")
                .input('D', Items.DIAMOND)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DIAMOND_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITE_KNIFE, 1)
                .pattern("N")
                .pattern("S")
                .input('N', Items.NETHERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.NETHERITE_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BEEF_TARTARE, 1)
                .pattern("MM")
                .pattern("B ")
                .input('M', ModItems.MINCED_BEEF)
                .input('B', Items.BOWL)
                .criterion(hasItem(ModItems.MINCED_BEEF), conditionsFromItem(ModItems.MINCED_BEEF))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.BEEF_TARTARE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MINCED_BEEF, 1)
                .pattern("MM")
                .input('M', Items.BEEF)
                .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.MINCED_BEEF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOMATO_SOUP, 1)
                .pattern("TT")
                .pattern("B ")
                .input('T', ModItems.TOMATO)
                .input('B', Items.BOWL)
                .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.TOMATO))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.TOMATO_SOUP)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PUMPKIN, 1)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModItems.PUMPKIN_SLICE)
                .criterion(hasItem(ModItems.PUMPKIN_SLICE), conditionsFromItem(ModItems.PUMPKIN_SLICE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.PUMPKIN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PUMPKIN_SLICE, 4)
                .pattern("P")
                .input('P', Items.PUMPKIN)
                .criterion(hasItem(Items.PUMPKIN), conditionsFromItem(Items.PUMPKIN))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.PUMPKIN_SLICE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.PUMPKIN_SEEDS, 1)
                .pattern("P")
                .input('P', ModItems.PUMPKIN_SLICE)
                .criterion(hasItem(ModItems.PUMPKIN_SLICE), conditionsFromItem(ModItems.PUMPKIN_SLICE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.PUMPKIN_SEEDS)));
    }
}
