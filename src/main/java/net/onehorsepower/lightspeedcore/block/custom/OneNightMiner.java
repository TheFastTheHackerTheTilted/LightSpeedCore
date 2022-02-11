package net.onehorsepower.lightspeedcore.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class OneNightMiner extends Block {
    public OneNightMiner(Settings settings) {
        super(settings);
    }

    private int timer = 1;


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient()){
            if (hand == Hand.MAIN_HAND) {
                try {
                    BlockPos playerPos = player.getBlockPos();
                    player.sendMessage(new LiteralText("You will be back at X:" + playerPos.getX() + " Y:" + playerPos.getY() + " Z:" + playerPos.getZ()+" in "+timer+" minutes!"), true);
                    TimeUnit.SECONDS.sleep(timer);
                    player.sendMessage(new LiteralText("Sending to the position in 5"), true);
                    TimeUnit.SECONDS.sleep(5);
                    player.teleport(playerPos.getX(), playerPos.getY(), playerPos.getZ());
                    player.sendMessage(new LiteralText("Successfully Teleported!"), true);
                }catch (InterruptedException ignored){}
            }
        }else {return ActionResult.PASS;}
        return ActionResult.SUCCESS;
    }


}
