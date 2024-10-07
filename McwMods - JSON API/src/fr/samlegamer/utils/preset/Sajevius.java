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
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.FurnituresLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;

public class Sajevius implements Presetting
{
	/*Instance Bridges*/
	private static final McwModsRessources client_wood_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
	private static final McwModsRessources client_stone_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE);
	private static final McwDataGen data_bridges = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);
	
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
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> MAT_WOOD = new ArrayList<String>();
		List<String> MAJ_WOOD = new ArrayList<String>();
		List<String> MAT_ROCK = new ArrayList<String>();
		List<String> WALL = new ArrayList<String>();
		List<String> FLOOR = new ArrayList<String>();
		List<String> MAJ_ROCK = new ArrayList<String>();

		List<String> LEAVES = new ArrayList<String>();
		List<String> MAJ_LEAVES = new ArrayList<String>();
		String CompatModid = "mcwsajevius";
		String txtLocMod, ModidOfBaseMod;
		
		ModsList.betterlandsWoods(MAT_WOOD);
		LEAVES.addAll(MAT_WOOD);
		txtLocMod = "betterlands:blocks";
		ModidOfBaseMod = "betterlands";
		client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
		client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
		
		client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
		client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);

		client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_fences.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
		client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data_fences.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
		
		client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
		client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
		
		client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		client_wood_fences.createWoodModelsBlockswithResearch(LOCATION, txtLocMod, LEAVES, Boolean.FALSE, "acacia_wall");
		client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data_fences.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
		data_fences.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data_fences.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
		LEAVES.clear();
		MAT_WOOD.clear();
		
		ModsList.betterlandsRocks(MAT_ROCK, WALL, FLOOR);
		client_stone_bridges.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone_bridges.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
		client_stone_bridges.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data_bridges.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data_bridges.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
		data_bridges.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
		
		client_stone_roofs.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone_roofs.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
		client_stone_roofs.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data_roofs.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data_roofs.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
		data_roofs.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);

		client_stone_fences.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone_fences.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
		client_stone_fences.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data_fences.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data_fences.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
		data_fences.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
		McwAPI.clears(MAT_ROCK, WALL, FLOOR);

		txtLocMod = "shroomed:blocks";
		ModidOfBaseMod = "shroomed";
		MAT_WOOD.add("hard_mushroom");
		genShroom(LOCATION, CompatModid, txtLocMod, ModidOfBaseMod, MAT_WOOD, "shroomwood_planks", "hard_mushroom_stem", "shroomwood_planks", "hard_mushroom_hyphae", "shroomwood");
		MAT_WOOD.clear();

		MAT_WOOD.add("blue_hard_mushroom");
		genShroom(LOCATION, CompatModid, txtLocMod, ModidOfBaseMod, MAT_WOOD, "blue_shroomwood_planks", "blue_hard_mushroom_stem", "blue_mushroom_stem", "blue_hard_mushroom_hyphae", "blue_shroomwood");
		MAT_WOOD.clear();
		

		MAT_WOOD.add("orange_hard_mushroom");
		genShroom(LOCATION, CompatModid, txtLocMod, ModidOfBaseMod, MAT_WOOD, "orange_shroomwood_planks", "orange_hard_mushroom_stem", "orange_mushroom_stem", "orange_hard_mushroom_hyphae", "orange_shroomwood");
		MAT_WOOD.clear();
		

		MAT_WOOD.add("purple_hard_mushroom");
		genShroom(LOCATION, CompatModid, txtLocMod, ModidOfBaseMod, MAT_WOOD, "purple_shroomwood_planks", "purple_hard_mushroom_stem", "purple_mushroom_stem", "purple_hard_mushroom_hyphae", "purple_shroomwood");
		MAT_WOOD.clear();
		
		System.out.println("Start Data/Tags/Lang/ForgeCode");
		ModsList.shroomed(MAT_WOOD);
		ModsList.betterlandsWoods(MAT_WOOD);
		ModsList.betterlandsWoods(LEAVES);
		ModsList.betterlandsRocks(MAT_ROCK, WALL, FLOOR);

		English.Sajevius.ShroomedLang(MAJ_WOOD);
		English.Sajevius.betterlandsWoodsLang(MAJ_WOOD);
		English.Sajevius.betterlandsWoodsLang(MAJ_LEAVES);
		English.Sajevius.betterlandsRocksLang(MAJ_ROCK);
		BridgesTagsGenerator tag_bridges = new BridgesTagsGenerator();		
		RoofsTagsGenerator tag_roofs = new RoofsTagsGenerator();
		FencesTagsGenerator tag_fences = new FencesTagsGenerator(true, MAT_ROCK, LEAVES);
		FurnituresTagsGenerator tag_furnitures = new FurnituresTagsGenerator();

		BridgesLangGenerator lang_bridges = new BridgesLangGenerator();
		RoofsLangGenerator lang_roofs = new RoofsLangGenerator();
		FencesLangGenerator lang_fences = new FencesLangGenerator(LEAVES, MAJ_LEAVES);
		FurnituresLangGenerator lang_furnitures = new FurnituresLangGenerator();

		tag_bridges.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_bridges.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_bridges.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		tag_roofs.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_roofs.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_fences.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_fences.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tag_fences.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_furnitures.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_furnitures.TagsWood(LOCATION, CompatModid, MAT_WOOD);

		lang_bridges.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_bridges.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_roofs.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_roofs.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_fences.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang_fences.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang_furnitures.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		MAJ_WOOD.clear();
		MAJ_LEAVES.clear();
		System.out.println("Done Data/Tags/Lang");
		System.out.println("Finish Aurora Registries");
	}
	
	protected void genShroom(String LOCATION, String CompatModid, String txtLocMod, String ModidOfBaseMod, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped, String hyphae, String planksStuff)
	{
		client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_bridges.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
		client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data_bridges.AdvancementsLogAllCustom(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae);
		data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data_bridges.RecipesLogAllIsChargedCustom(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
		
		client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_roofs.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
		client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data_roofs.AdvancementsLogAllCustom(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae);
		data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data_roofs.RecipesLogAllIsChargedCustom(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);

		client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_fences.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
		client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data_fences.AdvancementsLogAllCustom(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae);
		data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data_fences.RecipesLogAllIsChargedCustom(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);

		client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_furnitures.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
		client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data_furnitures.AdvancementsLogAllCustom(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae);
		data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data_furnitures.RecipesLogAllIsChargedCustom(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
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