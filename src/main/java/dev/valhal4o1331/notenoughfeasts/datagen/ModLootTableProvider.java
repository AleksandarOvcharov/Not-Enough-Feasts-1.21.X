package dev.valhal4o1331.notenoughfeasts.datagen;

import dev.valhal4o1331.notenoughfeasts.block.ModBlocks;
import dev.valhal4o1331.notenoughfeasts.block.custom.OnionCropBlock;
import dev.valhal4o1331.notenoughfeasts.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.ONION_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(OnionCropBlock.AGE, OnionCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.ONION_CROP, this.cropDrops(ModBlocks.ONION_CROP,
                ModItems.ONION, ModItems.ONION_SEEDS, builder2));

    }

}
