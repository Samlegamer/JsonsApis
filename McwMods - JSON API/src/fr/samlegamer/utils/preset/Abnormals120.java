package fr.samlegamer.utils.preset;

import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.bridges.BridgesTagsGenerator;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.datagen.furnitures.FurnituresTagsGenerator;
import fr.samlegamer.api.datagen.roofs.RoofsTagsGenerator;
import fr.samlegamer.api.datagen.stairs.StairsTagsGenerator;
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.FurnituresLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.StairsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;

public class Abnormals120 implements Presetting
{
	/*Instance Roofs*/
	private static final McwModsRessources client_wood_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
	private static final McwModsRessources client_stone_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
	private static final McwDataGen data_roofs = new McwDataGen(Compatibilities.MCW_ROOFS_MODID);
	
	/*Instance Fences*/
	private static final McwModsRessources client_wood_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
	private static final McwModsRessources client_stone_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE);
	private static final McwDataGen data_fences = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
	
	/*Instance Roofs*/
	private static final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
	private static final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);
	
	/*Instance Stairs*/
	private static final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
	private static final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);

	private final boolean activeBridges;
	private final boolean activeRoofs;
	private final boolean activeFences;
	private final boolean activeFurnitures;
	private final boolean activeStairs;

	public Abnormals120(boolean activeBridges, boolean activeRoofs, boolean activeFences, boolean activeFurnitures, boolean activeStairs)
	{
		this.activeBridges=activeBridges;
		this.activeRoofs=activeRoofs;
		this.activeFences=activeFences;
		this.activeFurnitures=activeFurnitures;
		this.activeStairs=activeStairs;
	}
	
	public Abnormals120()
	{
		this(true, true, true, true, true);
	}
	
	protected void genRessources(String LOCATION, String CompatModid, List<String> MAT_WOOD, String txtLocMod, String ModidOfBaseMod, boolean isStem, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		res.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, isStem);
		res.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		dat.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		dat.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, compat, ModidOfBaseMod);
	}
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> MAT_WOOD = new ArrayList<String>();
		List<String> MAT_ROCK = new ArrayList<String>();
		List<String> WALL = new ArrayList<String>();
		List<String> FLOOR = new ArrayList<String>();
		List<String> MAJ_WOOD = new ArrayList<String>();
		List<String> MAJ_ROCK = new ArrayList<String>();
		List<String> LEAVES = new ArrayList<String>();
		List<String> MAJ_LEAVES = new ArrayList<String>();
		String CompatModid = "mcwabnormals";
		String txtLocMod, ModidOfBaseMod;
		
		/*Instance Bridges*/
		final McwModsRessources client_wood_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
		final McwModsRessources client_stone_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE);
		final McwDataGen data_bridges = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);

		/*Bridges*/
		if(activeBridges)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.addAll(List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel"));
			txtLocMod = "atmospheric:block";
			ModidOfBaseMod = "atmospheric";
			
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			/*client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);*/
			MAT_WOOD.clear();
	
			MAT_WOOD.add("maple");
			txtLocMod = "autumnity:block";
			ModidOfBaseMod = "autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			/*client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);*/
			MAT_WOOD.clear();
	
			MAT_WOOD.addAll(List.of("plum", "wisteria", "willow", "pine"));
			txtLocMod = "environmental:block";
			ModidOfBaseMod = "environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			/*client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);*/
			MAT_WOOD.clear();
	
			MAT_WOOD.add("driftwood");
			MAT_WOOD.add("river");
			txtLocMod = "upgrade_aquatic:block";
			ModidOfBaseMod = "upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			/*client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);*/
			MAT_WOOD.clear();
	
			MAT_WOOD.add("poise");
			txtLocMod = "endergetic:block";
			ModidOfBaseMod = "endergetic";
			//genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "stripped_poise_stem");
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
	
			
			
			System.out.println("Start Stone Client");
			MAT_ROCK.add("honeycomb_brick");
			MAT_ROCK.add("honeycomb_tile");
			WALL.add("honeycomb_bricks");
			WALL.add("honeycomb_tiles");
			FLOOR.add("honeycomb_block");
			FLOOR.add("honeycomb_bricks");
			txtLocMod = "buzzier_bees:block";
			ModidOfBaseMod = "buzzier_bees";
			client_stone_bridges.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_bridges.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_bridges.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_bridges.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_bridges.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_bridges.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			
			MAT_ROCK.add("red_arid_sandstone");
			MAT_ROCK.add("arid_sandstone");
			WALL.add("red_arid_sandstone");
			WALL.add("arid_sandstone");
			FLOOR.add("arid_sand");
			FLOOR.add("red_arid_sand");
			txtLocMod = "atmospheric:block";
			ModidOfBaseMod = "atmospheric";
			client_stone_bridges.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_bridges.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_bridges.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_bridges.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_bridges.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_bridges.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, List.of("smooth_red_arid_sandstone", "smooth_arid_sandstone"), Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
	
	
			MAT_ROCK.add("snail_shell_bricks");
			MAT_ROCK.add("snail_shell_tiles");
			WALL.add("snail_shell_bricks");
			WALL.add("snail_shell_tiles");
			FLOOR.add("snail_shell_block_stripes");
			FLOOR.add("snail_shell_bricks");
			txtLocMod = "autumnity:block";
			ModidOfBaseMod = "autumnity";
			client_stone_bridges.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_bridges.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_bridges.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_bridges.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_bridges.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_bridges.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			System.out.println("Done Stone Client");
		}
		
		/*Fences*/
		if(activeFences)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.addAll(List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel"));
			LEAVES.addAll(MAT_WOOD);
			txtLocMod = "atmospheric:block";
			ModidOfBaseMod = "atmospheric";
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_fences.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_fences.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearch(LOCATION, txtLocMod, LEAVES, Boolean.FALSE, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data_fences.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
			data_fences.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			LEAVES.clear();
			MAT_WOOD.clear();
	
			MAT_WOOD.add("maple");
			LEAVES.add("maple");
			LEAVES.add("red_maple");
			LEAVES.add("yellow_maple");
			LEAVES.add("orange_maple");
			txtLocMod = "autumnity:block";
			ModidOfBaseMod = "autumnity";
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_fences.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_fences.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearchCustom(LOCATION, txtLocMod, LEAVES, Boolean.FALSE, "acacia_wall", "maple_leaves");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data_fences.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
			data_fences.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			LEAVES.clear();
			MAT_WOOD.clear();
	
			MAT_WOOD.addAll(List.of("plum", "wisteria", "willow", "pine"));
			LEAVES.add("plum");
			LEAVES.add("willow");
			LEAVES.add("blue_wisteria");
			LEAVES.add("pink_wisteria");
			LEAVES.add("white_wisteria");
			LEAVES.add("purple_wisteria");
			LEAVES.add("pine");
			txtLocMod = "environmental:block";
			ModidOfBaseMod = "environmental";
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_fences.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_fences.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearch(LOCATION, txtLocMod, LEAVES, Boolean.FALSE, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data_fences.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
			data_fences.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			LEAVES.clear();
	
			MAT_WOOD.add("driftwood");
			MAT_WOOD.add("river");
			LEAVES.add("river");
			txtLocMod = "upgrade_aquatic:block";
			ModidOfBaseMod = "upgrade_aquatic";
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_fences.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_fences.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearch(LOCATION, txtLocMod, LEAVES, Boolean.FALSE, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data_fences.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
			data_fences.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			LEAVES.clear();
			
			MAT_WOOD.add("poise");
			txtLocMod = "endergetic:block";
			ModidOfBaseMod = "endergetic";
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_fences.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "stripped_poise_stem");
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_fences.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
	
			System.out.println("Start Stone Client");
			MAT_ROCK.add("honeycomb_brick");
			MAT_ROCK.add("honeycomb_tile");
			WALL.add("honeycomb_bricks");
			WALL.add("honeycomb_tiles");
			FLOOR.add("honeycomb_block");
			FLOOR.add("honeycomb_bricks");
			txtLocMod = "buzzier_bees:block";
			ModidOfBaseMod = "buzzier_bees";
			client_stone_fences.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_fences.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_fences.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_fences.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_fences.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_fences.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			
			MAT_ROCK.add("red_arid_sandstone");
			MAT_ROCK.add("arid_sandstone");
			WALL.add("red_arid_sandstone");
			WALL.add("arid_sandstone");
			FLOOR.add("arid_sand");
			FLOOR.add("red_arid_sand");
			txtLocMod = "atmospheric:block";
			ModidOfBaseMod = "atmospheric";
			client_stone_fences.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_fences.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_fences.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_fences.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_fences.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_fences.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
	
	
			MAT_ROCK.add("snail_shell_bricks");
			MAT_ROCK.add("snail_shell_tiles");
			WALL.add("snail_shell_bricks");
			WALL.add("snail_shell_tiles");
			FLOOR.add("snail_shell_block_stripes");
			FLOOR.add("snail_shell_bricks");
			txtLocMod = "autumnity:block";
			ModidOfBaseMod = "autumnity";
			client_stone_fences.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_fences.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_fences.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_fences.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_fences.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_fences.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			System.out.println("Done Stone Client");
		}
		
		/*Roofs*/
		if(activeRoofs)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.addAll(List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel"));
			txtLocMod = "atmospheric:block";
			ModidOfBaseMod = "atmospheric";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("maple");
			txtLocMod = "autumnity:block";
			ModidOfBaseMod = "autumnity";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.addAll(List.of("plum", "wisteria", "willow", "pine"));
			txtLocMod = "environmental:block";
			ModidOfBaseMod = "environmental";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("driftwood");
			MAT_WOOD.add("river");
			txtLocMod = "upgrade_aquatic:block";
			ModidOfBaseMod = "upgrade_aquatic";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("poise");
			txtLocMod = "endergetic:block";
			ModidOfBaseMod = "endergetic";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "stripped_poise_stem");
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
	
			System.out.println("Start Stone Client");
			MAT_ROCK.add("honeycomb_brick");
			MAT_ROCK.add("honeycomb_tile");
			WALL.add("honeycomb_bricks");
			WALL.add("honeycomb_tiles");
			FLOOR.add("honeycomb_block");
			FLOOR.add("honeycomb_bricks");
			txtLocMod = "buzzier_bees:block";
			ModidOfBaseMod = "buzzier_bees";
			client_stone_roofs.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_roofs.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_roofs.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_roofs.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_roofs.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_roofs.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			
			MAT_ROCK.add("red_arid_sandstone");
			MAT_ROCK.add("arid_sandstone");
			WALL.add("red_arid_sandstone");
			WALL.add("arid_sandstone");
			FLOOR.add("arid_sand");
			FLOOR.add("red_arid_sand");
			txtLocMod = "atmospheric:block";
			ModidOfBaseMod = "atmospheric";
			client_stone_roofs.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_roofs.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_roofs.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_roofs.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_roofs.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_roofs.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
	
	
			MAT_ROCK.add("snail_shell_bricks");
			MAT_ROCK.add("snail_shell_tiles");
			WALL.add("snail_shell_bricks");
			WALL.add("snail_shell_tiles");
			FLOOR.add("snail_shell_block_stripes");
			FLOOR.add("snail_shell_bricks");
			txtLocMod = "autumnity:block";
			ModidOfBaseMod = "autumnity";
			client_stone_roofs.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_roofs.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_roofs.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_roofs.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_roofs.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_roofs.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			System.out.println("Done Stone Client");
		}
		
		/*Furnitures*/
		if(activeFurnitures)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.addAll(List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel"));
			txtLocMod = "atmospheric:block";
			ModidOfBaseMod = "atmospheric";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("maple");
			txtLocMod = "autumnity:block";
			ModidOfBaseMod = "autumnity";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.addAll(List.of("plum", "wisteria", "willow", "pine"));
			txtLocMod = "environmental:block";
			ModidOfBaseMod = "environmental";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("driftwood");
			MAT_WOOD.add("river");
			txtLocMod = "upgrade_aquatic:block";
			ModidOfBaseMod = "upgrade_aquatic";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("poise");
			txtLocMod = "endergetic:block";
			ModidOfBaseMod = "endergetic";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "stripped_poise_stem");
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}

		/*Stairs*/ 
		if(activeStairs)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.addAll(List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel"));
			txtLocMod = "atmospheric:block";
			ModidOfBaseMod = "atmospheric";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("maple");
			txtLocMod = "autumnity:block";
			ModidOfBaseMod = "autumnity";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.addAll(List.of("plum", "wisteria", "willow", "pine"));
			txtLocMod = "environmental:block";
			ModidOfBaseMod = "environmental";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("driftwood");
			MAT_WOOD.add("river");
			txtLocMod = "upgrade_aquatic:block";
			ModidOfBaseMod = "upgrade_aquatic";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("poise");
			txtLocMod = "endergetic:block";
			ModidOfBaseMod = "endergetic";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "stripped_poise_stem");
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		System.out.println("Start Data/Tags/Lang/ForgeCode");
		ModsList.abnormalsWood120(MAT_WOOD);
		ModsList.abnormalsRock(MAT_ROCK);
		ModsList.abnormalsLeaves120(LEAVES);
		English.Abnormals.abnormalsWood120Lang(MAJ_WOOD);
		English.Abnormals.abnormalsRockLang(MAJ_ROCK);
		English.Abnormals.abnormalsLeaves120Lang(MAJ_LEAVES);
		BridgesTagsGenerator tag_bridges = new BridgesTagsGenerator();		
		RoofsTagsGenerator tag_roofs = new RoofsTagsGenerator();
		FencesTagsGenerator tag_fences = new FencesTagsGenerator(true, MAT_ROCK, LEAVES);
		FurnituresTagsGenerator tag_furnitures = new FurnituresTagsGenerator();
		StairsTagsGenerator tag_stairs = new StairsTagsGenerator();
		
		BridgesLangGenerator lang_bridges = new BridgesLangGenerator();
		RoofsLangGenerator lang_roofs = new RoofsLangGenerator();
		FencesLangGenerator lang_fences = new FencesLangGenerator(LEAVES, MAJ_LEAVES);
		FurnituresLangGenerator lang_furnitures = new FurnituresLangGenerator();
		StairsLangGenerator lang_stairs = new StairsLangGenerator();

		tag_bridges.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_bridges.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag_bridges.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_bridges.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		tag_roofs.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_roofs.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag_roofs.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_roofs.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		tag_fences.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_fences.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tag_fences.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag_fences.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_fences.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		tag_furnitures.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_furnitures.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag_furnitures.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_furnitures.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		tag_stairs.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_stairs.TagsWood(LOCATION, CompatModid, MAT_WOOD);

		lang_bridges.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_bridges.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_roofs.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_roofs.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_fences.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_fences.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_furnitures.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_furnitures.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_stairs.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);

		MAJ_WOOD.clear();
		MAJ_ROCK.clear();
		MAJ_LEAVES.clear();
		French.Abnormals.abnormalsWood120Lang(MAJ_WOOD);
		French.Abnormals.abnormalsRockLang(MAJ_ROCK);
		French.Abnormals.abnormalsLeaves120Lang(MAJ_LEAVES);
		lang_bridges.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_bridges.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_roofs.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_roofs.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_fences.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_fences.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_furnitures.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_furnitures.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_stairs.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);

		MAJ_WOOD.clear();
		MAJ_ROCK.clear();
		MAJ_LEAVES.clear();

		System.out.println("Done Data/Tags/Lang/ForgeCode");
		System.out.println("Finish Abnormals Registries");
	}
	
	protected void genHedges(String LOCATION, String CompatModid, List<String> LEAVES, String TextureLocationFormodid, String ModidOfBaseMod)
	{
		client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		client_wood_fences.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
		client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data_fences.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
		data_fences.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data_fences.RecipesLogAllwithResearch(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge");
	}
}