package net.onehorsepower.lightspeedcore.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.onehorsepower.lightspeedcore.LightSpeedCore;

public class ModItemGroup {
    public static final ItemGroup LIGHTSPEED = FabricItemGroupBuilder.build(new Identifier(LightSpeedCore.MOD_ID, "lightspeed"),
            () -> new ItemStack(ModItems.ENERGETIC_ESS));
}
