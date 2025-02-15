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
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;

public class Aurora implements Presetting
{
	/*Instance Bridges*/
	private static final McwModsRessources client_wood_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
	private static final McwDataGen data_bridges = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);
	
	/*Instance Roofs*/
	private static final McwModsRessources client_wood_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
	private static final McwDataGen data_roofs = new McwDataGen(Compatibilities.MCW_ROOFS_MODID);
	
	/*Instance Fences*/
	private static final McwModsRessources client_wood_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
	private static final McwDataGen data_fences = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
	
	/*Instance Furniture*/
	private static final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
	private static final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);
	
	/*Instance Stairs*/
	private static final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
	private static final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);

	private boolean activeBridges;
	private boolean activeRoofs;
	private boolean activeFences;
	private boolean activeFurnitures;
	private boolean activeStairs;
	private boolean is120;
	
	public Aurora(boolean activeBridges, boolean activeRoofs, boolean activeFences, boolean activeFurnitures, boolean activeStairs, boolean is120)
	{
		this.activeBridges=activeBridges;
		this.activeRoofs=activeRoofs;
		this.activeFences=activeFences;
		this.activeFurnitures=activeFurnitures;
		this.activeStairs=activeStairs;
		this.is120=is120;
	}
	
	public Aurora(boolean is120)
	{
		this(true, true, true, true, true, is120);
	}
	
	private void setEMMats(List<String> MAT_WOOD)
	{
		if(this.is120)
		{
			MAT_WOOD.add("mushroom");
		}
		else
		{
			MAT_WOOD.add("brown_mushroom");
			MAT_WOOD.add("red_mushroom");
		}
	}
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> MAT_WOOD = new ArrayList<String>();
		List<String> MAJ_WOOD = new ArrayList<String>();

		List<String> LEAVES = new ArrayList<String>();
		List<String> MAJ_LEAVES = new ArrayList<String>();
		String CompatModid = "mcwaurora";
		String txtLocMod, ModidOfBaseMod;
		//String ClassBlockRegistry = "MBABlocksRegistry";
		
		/*Bridges*/
		if(activeBridges)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.add("cypress");
			txtLocMod = "bayou_blues:block";
			ModidOfBaseMod = "bayou_blues";
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			setEMMats(MAT_WOOD);
			txtLocMod = "enhanced_mushrooms:block";
			ModidOfBaseMod = "enhanced_mushrooms";
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, true);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();

			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("redbud");
			txtLocMod = "abundance:block";
			ModidOfBaseMod = "abundance";
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		/*Fences*/
		if(activeFences)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.add("cypress");
			txtLocMod = "bayou_blues:block";
			ModidOfBaseMod = "bayou_blues";
			LEAVES.addAll(MAT_WOOD);
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
	
			setEMMats(MAT_WOOD);
			txtLocMod = "enhanced_mushrooms:block";
			ModidOfBaseMod = "enhanced_mushrooms";
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_fences.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, true);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_fences.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("redbud");
			txtLocMod = "abundance:block";
			ModidOfBaseMod = "abundance";
			LEAVES.addAll(MAT_WOOD);
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
			System.out.println("Done Stone Client");
		}
		
		/*Roofs*/
		if(activeRoofs)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.add("cypress");
			txtLocMod = "bayou_blues:block";
			ModidOfBaseMod = "bayou_blues";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			setEMMats(MAT_WOOD);
			txtLocMod = "enhanced_mushrooms:block";
			ModidOfBaseMod = "enhanced_mushrooms";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, true);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("redbud");
			txtLocMod = "abundance:block";
			ModidOfBaseMod = "abundance";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Stone Client");
		}
		
		/*Furnitures*/
		if(activeFurnitures)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.add("cypress");
			txtLocMod = "bayou_blues:block";
			ModidOfBaseMod = "bayou_blues";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			setEMMats(MAT_WOOD);
			txtLocMod = "enhanced_mushrooms:block";
			ModidOfBaseMod = "enhanced_mushrooms";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, true);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("redbud");
			txtLocMod = "abundance:block";
			ModidOfBaseMod = "abundance";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}

		/*Stairs*/
		if(activeStairs)
		{
			System.out.println("Start Wood Client");
			MAT_WOOD.add("cypress");
			txtLocMod = "bayou_blues:block";
			ModidOfBaseMod = "bayou_blues";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			setEMMats(MAT_WOOD);
			txtLocMod = "enhanced_mushrooms:block";
			ModidOfBaseMod = "enhanced_mushrooms";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, true);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
	
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("redbud");
			txtLocMod = "abundance:block";
			ModidOfBaseMod = "abundance";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		System.out.println("Start Data/Tags/Lang/ForgeCode");
		
		if(this.is120)
		{
			ModsList.AuroraWoods1201(MAT_WOOD);
			English.Aurora.AuroraWoods1201Lang(MAJ_WOOD);
		}
		else
		{
			ModsList.AuroraWoods(MAT_WOOD);
			English.Aurora.AuroraWoodsLang(MAJ_WOOD);
		}
		ModsList.AuroraLeaves(LEAVES);
		English.Aurora.AuroraLeavesLang(MAJ_LEAVES);
		BridgesTagsGenerator tag_bridges = new BridgesTagsGenerator();		
		RoofsTagsGenerator tag_roofs = new RoofsTagsGenerator();
		FencesTagsGenerator tag_fences = new FencesTagsGenerator(LEAVES);
		FurnituresTagsGenerator tag_furnitures = new FurnituresTagsGenerator();
		StairsTagsGenerator tag_stairs = new StairsTagsGenerator();

		BridgesLangGenerator lang_bridges = new BridgesLangGenerator();
		RoofsLangGenerator lang_roofs = new RoofsLangGenerator();
		FencesLangGenerator lang_fences = new FencesLangGenerator(LEAVES, MAJ_LEAVES);
		FurnituresLangGenerator lang_furnitures = new FurnituresLangGenerator();
		StairsLangGenerator lang_stairs = new StairsLangGenerator();

		tag_bridges.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_bridges.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_roofs.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_roofs.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_fences.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_fences.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tag_fences.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_furnitures.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_furnitures.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_stairs.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_stairs.TagsWood(LOCATION, CompatModid, MAT_WOOD);

		lang_bridges.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_roofs.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_fences.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_furnitures.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_stairs.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		MAJ_WOOD.clear();
		MAJ_LEAVES.clear();
		
		if(this.is120)
		{
			French.Aurora.AuroraWoods1201Lang(MAJ_WOOD);
		}
		else
		{
			French.Aurora.AuroraWoodsLang(MAJ_WOOD);
		}
		French.Aurora.AuroraLeavesLang(MAJ_LEAVES);
		lang_bridges.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_roofs.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_fences.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_furnitures.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_stairs.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);

		System.out.println("Done Data/Tags/Lang");
		System.out.println("Finish Aurora Registries");
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
