package net.onehorsepower.lightspeedcore.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BodyTimeAccelerator extends Block {
    public BodyTimeAccelerator(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        if (!world.isClient()){
            if (entity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1, 13));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 1, 250));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
