package net.cobra.minecraftmod.item;

import net.cobra.minecraftmod.MinecraftMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OneHitSword {

    public static final Item ONE_HIT_SWORD = registerItem("one_hit_sword", new SwordItem(ModToolMaterial.BLUE_GARNET, 92, 9.0f, new FabricItemSettings()));

    private static void addToolsToCombatGroup(FabricItemGroupEntries entries) {
        entries.add(OneHitSword.ONE_HIT_SWORD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MinecraftMod.MOD_ID, name), item);
    }

    public static void registerOneHitSword() {
        MinecraftMod.LOGGER.info("Registering Mod Items for" + MinecraftMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(OneHitSword::addToolsToCombatGroup);

    }
}
