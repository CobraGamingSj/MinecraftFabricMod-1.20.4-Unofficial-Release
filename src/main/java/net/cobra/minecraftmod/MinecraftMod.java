package net.cobra.minecraftmod;

import com.mojang.datafixers.types.Func;
import net.cobra.minecraftmod.block.EnergyBlock;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MinecraftMod implements ModInitializer {
	public static final Item RUBY = new Item(new Item.Settings());
	public static final Item RADIANT = new Item(new Item.Settings());
	public static final Item SAPPHIRE = new Item(new Item.Settings());
	public static final Item GREEN_SAPPHIRE = new Item(new Item.Settings());
	public static final Item PINK_GARNET = new Item(new Item.Settings());
	public static final Item BLUE_GARNET = new Item(new Item.Settings());

	public static final Block ENERGY_BLOCK = new EnergyBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).requiresTool().strength(6f, 7f).strength(8f));
	public static final Block RUBY_BLOCK = new EnergyBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5f, 5f).strength(5f));
	public static final Block RADIANT_BLOCK = new EnergyBlock(AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_RED).requiresTool().strength(5f, 5f).strength(5f));
	public static final Block SAPPHIRE_BLOCK = new EnergyBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).requiresTool().strength(4f, 4f).strength(4f));
	public static final Block GREEN_SAPHIRE_BLOCK = new EnergyBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).requiresTool().strength(4f, 4f).strength(4f));
	public static final Block BLUE_GARNET_BLOCK = new EnergyBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).requiresTool().strength(6f, 6.5f).strength(7f));
	public static final Block PINk_GARNET_BLOCK = new EnergyBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).requiresTool().strength(6f, 6.5f).strength(7f));

	public static final Item ENERGY_INGOT = new Item(new Item.Settings());

	public static final Item WOOD_PELLET = new Item(new Item.Settings());

	public static final Item SMITHING_TEMPLATE = new Item(new Item.Settings());

	private static final ItemGroup GEMSTONES = FabricItemGroup.builder()
			.icon(() -> new ItemStack(RUBY))
			.displayName(Text.translatable("itemGroup.minecraftmod.gemstones"))
			.entries((context, entries) -> {
				entries.add(RUBY);
				entries.add(RADIANT);
				entries.add(SAPPHIRE);
				entries.add(GREEN_SAPPHIRE);
				entries.add(BLUE_GARNET);
				entries.add(PINK_GARNET);
			}).build();

	@Override
	public void onInitialize() {

		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "ruby"), RUBY);
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "radiant"), RADIANT);
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "sapphire"), SAPPHIRE);
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "green_sapphire"), GREEN_SAPPHIRE);
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "blue_garnet"), BLUE_GARNET);
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "pink_garnet"), PINK_GARNET);
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "energy_ingot"), ENERGY_INGOT);

		Registry.register(Registries.ITEM_GROUP, new Identifier("minecraftmod", "gemstones"), GEMSTONES);

		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "wood_pellet"), WOOD_PELLET);

		Registry.register(Registries.BLOCK, new Identifier("minecraftmod", "energy_block"), ENERGY_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier("minecraftmod", "ruby_block"), RUBY_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier("minecraftmod", "radiant_block"), RADIANT_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier("minecraftmod", "sapphire_block"), SAPPHIRE_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier("minecraftmod", "green_sapphire_block"), GREEN_SAPHIRE_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier("minecraftmod", "blue_garnet_block"), BLUE_GARNET_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier("minecraftmod", "pink_garnet_block"), PINk_GARNET_BLOCK);

		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "energy_block"), new BlockItem(ENERGY_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "radiant_block"), new BlockItem(RADIANT_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "sapphire_block"), new BlockItem(SAPPHIRE_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "green_sapphire_block"), new BlockItem(GREEN_SAPHIRE_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "blue_garnet_block"), new BlockItem(BLUE_GARNET_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "pink_garnet_block"), new BlockItem(PINk_GARNET_BLOCK, new Item.Settings()));

		Registry.register(Registries.ITEM, new Identifier("minecraftmod", "smithing_template"), SMITHING_TEMPLATE);

		FuelRegistry.INSTANCE.add(WOOD_PELLET, 2000);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(items -> {
			items.addBefore(Items.NETHERITE_INGOT, ENERGY_INGOT);
			items.addBefore(Items.COAL, WOOD_PELLET);
			items.addAfter(Items.NETHERITE_INGOT, RADIANT);
			items.addAfter(RADIANT, RUBY);
			items.addAfter(RUBY, SAPPHIRE);
			items.addAfter(SAPPHIRE, GREEN_SAPPHIRE);
			items.addAfter(GREEN_SAPPHIRE, BLUE_GARNET);
			items.addAfter(BLUE_GARNET, PINK_GARNET);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(FunctionBlocks -> {
			FunctionBlocks.addAfter(Blocks.BLAST_FURNACE, ENERGY_BLOCK);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(blocks -> {
			blocks.addBefore(Blocks.NETHERITE_BLOCK, ENERGY_BLOCK);
			blocks.addAfter(Blocks.NETHERITE_BLOCK, RUBY_BLOCK);
			blocks.addAfter(RUBY_BLOCK, RADIANT_BLOCK);
			blocks.addAfter(RADIANT_BLOCK, SAPPHIRE_BLOCK);
			blocks.addAfter(SAPPHIRE_BLOCK, GREEN_SAPHIRE_BLOCK);
			blocks.addAfter(GREEN_SAPHIRE_BLOCK, BLUE_GARNET_BLOCK);
			blocks.addAfter(BLUE_GARNET_BLOCK, PINk_GARNET_BLOCK);
		});
	}
}