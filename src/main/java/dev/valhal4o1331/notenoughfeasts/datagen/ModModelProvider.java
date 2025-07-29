package dev.valhal4o1331.notenoughfeasts.datagen;

import dev.valhal4o1331.notenoughfeasts.block.ModBlocks;
import dev.valhal4o1331.notenoughfeasts.block.custom.OnionBushBlock;
import dev.valhal4o1331.notenoughfeasts.block.custom.OnionCropBlock;
import dev.valhal4o1331.notenoughfeasts.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.ONION_CROP, OnionCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.ONION_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED,
                OnionBushBlock.AGE, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.APPLE_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONION, Models.GENERATED);
    }
}
