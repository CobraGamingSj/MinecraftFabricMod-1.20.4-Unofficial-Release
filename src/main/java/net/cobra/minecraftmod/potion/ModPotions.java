package net.cobra.minecraftmod.potion;

import net.cobra.minecraftmod.MinecraftMod;
import net.cobra.minecraftmod.item.ModItems;
import net.cobra.minecraftmod.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static Potion HEALTH_BOOST_POTION;

    public static Potion registerPotion(String name) {
        return Registry.register(Registries.POTION, new Identifier(MinecraftMod.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 9600, 2)));

    }

    public static void registerPotions() {
      HEALTH_BOOST_POTION = registerPotion("health_boost_potion");
      registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.HEALING, ModItems.PINEAPPLE,
                ModPotions.HEALTH_BOOST_POTION);
    }

}
