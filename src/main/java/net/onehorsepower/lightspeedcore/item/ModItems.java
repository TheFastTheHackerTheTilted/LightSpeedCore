package net.onehorsepower.lightspeedcore.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.onehorsepower.lightspeedcore.LightSpeedCore;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

import static net.onehorsepower.lightspeedcore.LightSpeedCore.MOD_ID;

public class ModItems {


    /**
     * items & materials
     */
    public static final Item INGOT_GRANTI =registerItem("ingot_granti",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item NUGGET_GRANTI =registerItem("nugget_granti",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item RAW_GRANTI =registerItem("raw_granti",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));

    public static final Item INGOT_OZY =registerItem("ingot_ozy",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item NUGGET_OZY =registerItem("nugget_ozy",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item RAW_OZY =registerItem("raw_ozy",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));

    public static final Item INGOT_CAER =registerItem("ingot_caer",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item NUGGET_CAER =registerItem("nugget_caer",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item RAW_CAER =registerItem("raw_caer",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));

    public static final Item INGOT_CAERLA =registerItem("ingot_caerla",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item NUGGET_CAERLA =registerItem("nugget_caerla",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item RAW_CAERLA =registerItem("raw_caerla",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));

    public static final Item INGOT_VELOX =registerItem("ingot_velox",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item NUGGET_VELOX =registerItem("nugget_velox",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item RAW_VELOX =registerItem("raw_velox",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));

    public static final Item STABLE_ESS = registerItem("stable_ess",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item ENERGETIC_ESS = registerItem("energetic_ess",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));

    /**
     * custom mechanical items
     */
    public static final Item EMPTY_ENERGY_FRAME = registerItem("empty_energy_frame",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item GLASS_ENERGY_STAR = registerItem("glass_energy_star",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item EMPTY_IMPRISONMENT = registerItem("empty_imprisonment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));
    public static final Item CHARGED_IMPRISONMENT = registerItem("charged_imprisonment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIGHTSPEED)));



    /**
     * registering items
     */
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems(){
        LightSpeedCore.LOGGER.info("Registering mod items for "+MOD_ID);
    }
}
