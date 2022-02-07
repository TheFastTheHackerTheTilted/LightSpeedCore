package net.onehorsepower.lightspeedcore.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.onehorsepower.lightspeedcore.LightSpeedCore;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

import static net.onehorsepower.lightspeedcore.LightSpeedCore.MOD_ID;

public class ModItems {

    public static final Item INGOT_GRANTI =registerItem("ingot_granti",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems(){
        LightSpeedCore.LOGGER.info("Registering mod items for "+MOD_ID);
    }
}
