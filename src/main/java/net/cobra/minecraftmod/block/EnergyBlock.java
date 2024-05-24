package net.cobra.minecraftmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EnergyBlock extends Block {
    public EnergyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
       if(!world.isClient()) {
           if(entity instanceof LivingEntity) {
               LivingEntity livingEntity = ((LivingEntity)entity);
               livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20, 1, false, false));
               livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 1, false, false));
               livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 1, false, false));
           }
       }

        super.onSteppedOn(world, pos, state, entity);
    }



}
