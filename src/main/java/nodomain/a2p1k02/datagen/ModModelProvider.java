package nodomain.a2p1k02.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import nodomain.a2p1k02.block.ModBlocks;
import nodomain.a2p1k02.block.custom.TomatoCropBlock;
import nodomain.a2p1k02.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PUMPKIN_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);

        itemModelGenerator.register(ModItems.BEEF_TARTARE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_SOUP, Models.GENERATED);

        itemModelGenerator.register(ModItems.MINCED_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_PATTY, Models.GENERATED);

        itemModelGenerator.register(ModItems.IRON_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_KNIFE, Models.GENERATED);
    }
}
