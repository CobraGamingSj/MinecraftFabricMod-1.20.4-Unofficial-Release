package net.cobra.minecraftmod;

import net.cobra.minecraftmod.block.ModBlocks;
import net.cobra.minecraftmod.enchantment.ModEnchantments;
import net.cobra.minecraftmod.item.BlueGarnetSword;
import net.cobra.minecraftmod.item.ModItemGroups;
import net.cobra.minecraftmod.item.ModItems;
import net.cobra.minecraftmod.item.OneHitSword;
import net.cobra.minecraftmod.potion.ModPotions;
import net.cobra.minecraftmod.util.ModCustomTrades;
import net.cobra.minecraftmod.util.ModLootTableModifiers;
import net.cobra.minecraftmod.villager.ModVillagers;
import net.cobra.minecraftmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftMod implements ModInitializer {
	public static final String MOD_ID = "minecraftmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraftmod");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();
		ModWorldGeneration.generateModWorldGen();
		FuelRegistry.INSTANCE.add(ModItems.WOOD_PELLET , 2000);
		ModEnchantments.registerModEnchantments();
		BlueGarnetSword.registerBlueGarnetSword();
		OneHitSword.registerOneHitSword();
		ModPotions.registerPotions();

		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.REINFORCED_DEEPSLATE)
				.lightWithItem(Items.ECHO_SHARD)
				.destDimID(new Identifier(MinecraftMod.MOD_ID, "warden_dimen"))
				.tintColor(139)
				.registerPortal();
		}
	}