package net.onehorsepower.lightspeedcore.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.onehorsepower.lightspeedcore.LightSpeedCore;
import net.onehorsepower.lightspeedcore.item.ModItemGroup;


import static net.onehorsepower.lightspeedcore.LightSpeedCore.MOD_ID;

public class ModBlocks {


    //harvest level 3=dia_pick,4=neth_pick
    public static final Block ORE_GRANTI = registerBlock("ore_granti",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20f,10f).requiresTool().strength(20f)), ModItemGroup.LIGHTSPEED);
    public static final Block BLOCK_GRANTI = registerBlock("block_granti",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20f,50f).requiresTool().strength(20f)), ModItemGroup.LIGHTSPEED);

    public static final Block ORE_OZY = registerBlock("ore_ozy",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20f,10f).requiresTool().strength(20f)), ModItemGroup.LIGHTSPEED);
    public static final Block BLOCK_OZY = registerBlock("block_ozy",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20f,50f).requiresTool().strength(20f)), ModItemGroup.LIGHTSPEED);

    public static final Block ORE_CAER = registerBlock("ore_caer",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30f,50f).requiresTool().strength(30f)), ModItemGroup.LIGHTSPEED);
    public static final Block BLOCK_CAER = registerBlock("block_caer",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30f,250f).requiresTool().strength(30f)), ModItemGroup.LIGHTSPEED);

    public static final Block ORE_CAERLA = registerBlock("ore_caerla",
            new Block(FabricBlockSettings.of(Material.METAL).strength(50f,1200f).requiresTool().strength(50f)), ModItemGroup.LIGHTSPEED);
    public static final Block BLOCK_CAERLA = registerBlock("block_caerla",
            new Block(FabricBlockSettings.of(Material.METAL).strength(50f,5000f).requiresTool().strength(50f)), ModItemGroup.LIGHTSPEED);

    public static final Block ORE_VELOX = registerBlock("ore_velox",
            new Block(FabricBlockSettings.of(Material.METAL).strength(70f,2000f).requiresTool().strength(70f)), ModItemGroup.LIGHTSPEED);
    public static final Block BLOCK_VELOX = registerBlock("block_velox",
            new Block(FabricBlockSettings.of(Material.METAL).strength(70f,10000f).requiresTool().strength(70f)), ModItemGroup.LIGHTSPEED);



    /**
     * registering blocks
     */
    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        LightSpeedCore.LOGGER.info("Registering mod blocks for "+MOD_ID);
    }
}
