package net.cobra.minecraftmod.item;

import net.cobra.minecraftmod.MinecraftMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                                 entries.add(ModItems.RUBY);
                                 entries.add(ModItems.RADIANT);
                                 entries.add(ModItems.SAPPHIRE);
                                 entries.add(ModItems.GREEN_SAPPHIRE);
                                 entries.add(ModItems.BLUE_GARNET);
                                 entries.add(ModItems.PINK_GARNET);
                    }).build());
    public static final ItemGroup MUSIC_DISC = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftMod.MOD_ID, "taswell"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.music_disc"))
                    .icon(() -> new ItemStack(ModItems.TASWELL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TASWELL);
                        entries.add(ModItems.DREITON);
                        entries.add(ModItems.BIOME_FEST);
                        entries.add(Items.MUSIC_DISC_5);
                        entries.add(Items.MUSIC_DISC_11);
                        entries.add(Items.MUSIC_DISC_13);
                        entries.add(Items.MUSIC_DISC_CAT);
                        entries.add(Items.MUSIC_DISC_CHIRP);
                        entries.add(Items.MUSIC_DISC_FAR);
                        entries.add(Items.MUSIC_DISC_BLOCKS);
                        entries.add(Items.MUSIC_DISC_MALL);
                        entries.add(Items.MUSIC_DISC_MELLOHI);
                        entries.add(Items.MUSIC_DISC_OTHERSIDE);
                        entries.add(Items.MUSIC_DISC_PIGSTEP);
                        entries.add(Items.MUSIC_DISC_RELIC);
                        entries.add(Items.MUSIC_DISC_STAL);
                        entries.add(Items.MUSIC_DISC_STRAD);
                        entries.add(Items.MUSIC_DISC_WAIT);
                        entries.add(Items.MUSIC_DISC_WARD);
                    }).build());

    public static void registerItemGroups() {

        MinecraftMod.LOGGER.info("Registering Item Groups for" + MinecraftMod.MOD_ID);
    }

}
