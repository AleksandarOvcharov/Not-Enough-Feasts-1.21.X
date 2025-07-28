package dev.valhal4o1331.notenoughfeasts;

import dev.valhal4o1331.notenoughfeasts.datagen.ModLootTableProvider;
import dev.valhal4o1331.notenoughfeasts.datagen.ModModelProvider;
import dev.valhal4o1331.notenoughfeasts.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NotEnoughFeastsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModLootTableProvider::new);

	}
}
