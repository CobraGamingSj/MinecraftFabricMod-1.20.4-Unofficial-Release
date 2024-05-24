package net.cobra.minecraftmod.datagen;

import net.cobra.minecraftmod.block.ModBlocks;
import net.cobra.minecraftmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFESTED_GRASS);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEAD_GRASS_BLOCK);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RADIANT_BLOCK);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_SAPPHIRE_BLOCK);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_SAPPHIRE_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_GREEN_SAPPHIRE_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_GARNET_BLOCK);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_BLOCK);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_GARNET_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BLUE_GARNET_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
      itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
      itemModelGenerator.register(ModItems.RADIANT, Models.GENERATED);
      itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
      itemModelGenerator.register(ModItems.GREEN_SAPPHIRE, Models.GENERATED);
      itemModelGenerator.register(ModItems.BLUE_GARNET, Models.GENERATED);
      itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
      itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
      itemModelGenerator.register(ModItems.WOOD_PELLET, Models.GENERATED);
      itemModelGenerator.register(ModItems.SMITHING_TEMPLATE, Models.GENERATED);
      itemModelGenerator.register(ModItems.TASWELL, Models.GENERATED);

      itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
      itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
      itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

      itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);

      itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_BOOTS));
    }
}
