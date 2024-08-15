package nodomain.a2p1k02.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.AdditionalFoods;
import nodomain.a2p1k02.block.custom.TomatoCropBlock;

public class ModBlocks {
    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, Identifier.of(AdditionalFoods.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
}
