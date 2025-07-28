package dev.valhal4o1331.notenoughfeasts.datagen;

import dev.valhal4o1331.notenoughfeasts.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                createShapeless(RecipeCategory.MISC, ModItems.APPLE_PIE, 1)
                        .input(Items.APPLE)
                        .input(Items.SUGAR)
                        .input(Items.EGG)
                        .criterion("has_apple", conditionsFromItem(Items.APPLE))
                        .criterion("has_sugar", conditionsFromItem(Items.SUGAR))
                        .criterion("has_egg", conditionsFromItem(Items.EGG))
                        .offerTo(exporter);

            }
        };
    }

    @Override
    public String getName() {
        return "[NotEnoughFeasts] Recipe Provider";
    }
}
