package net.cobra.minecraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {

//    Pineapple

    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(6).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 5), 1.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 5), 1.5f).build();

//    Tomato

    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(12).saturationModifier(2.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 200, 5), 1.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 5), 1.5f).build();

//     Diamond Apple

    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder().hunger(16).saturationModifier(2.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200, 7), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 5), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 5),1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 5), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200, 5),1f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 200, 5),1f).build();
}
