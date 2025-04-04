package fr.samlegamer.utils.preset;

import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.api.datagen.TagsGenerator;
import fr.samlegamer.api.lang.*;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;

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
	
	/*Instance Furniture*/
	private static final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
	private static final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);
	
	/*Instance Stairs*/
	private static final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
	private static final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);
	
	private final boolean bridges;
	private final boolean roofs;
	private final boolean fences;
	private final boolean furnitures;
	private final boolean stairs;
	private final ModLoaders modLoader = ModLoaders.FORGE;

	public Sajevius(boolean bridges, boolean roofs, boolean fences, boolean furnitures, boolean stairs)
	{
		this.bridges=bridges;
		this.roofs=roofs;
		this.fences=fences;
		this.furnitures=furnitures;
		this.stairs=stairs;
	}
	
	public Sajevius()
	{
		this(true, true, true, true, true);
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

		List<String> ID_WOOD = new ArrayList<>();
		List<String> ID_ROCK = new ArrayList<>();
		List<String> WALL = new ArrayList<>();
		List<String> FLOOR = new ArrayList<>();
		List<String> ID_LEAVE = new ArrayList<>();

		List<String> LANG_WOOD = new ArrayList<>();
		List<String> LANG_ROCK = new ArrayList<>();
		List<String> LANG_LEAVE = new ArrayList<>();
		String CompatModid = "mcwsajevius";
		String txtLocMod, ModidOfBaseMod;
		
		NewModsList.Sajevius.betterlandsWood(ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);
		txtLocMod = "betterlands:blocks";
		ModidOfBaseMod = "betterlands";
		if(bridges)
		{
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_bridges.createWoodModelsBlocks(LOCATION, txtLocMod, ID_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_bridges.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, modLoader);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, modLoader);
		}
		if(roofs)
		{
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_roofs.createWoodModelsBlocks(LOCATION, txtLocMod, ID_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_roofs.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, modLoader);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, modLoader);
		}
		if(fences)
		{
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_fences.createWoodModelsBlocks(LOCATION, txtLocMod, ID_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_fences.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data_fences.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearch(LOCATION, txtLocMod, ID_LEAVE, Boolean.FALSE, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			data_fences.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data_fences.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
		if(furnitures)
		{
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_furnitures.createWoodModelsBlocks(LOCATION, txtLocMod, ID_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_furnitures.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod, modLoader);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod, modLoader);
		}
		if(stairs)
		{
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_stairs.createWoodModelsBlocks(LOCATION, txtLocMod, ID_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_stairs.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod, modLoader);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod, modLoader);
		}
		ID_LEAVE.clear();
		ID_WOOD.clear();

		NewModsList.Sajevius.betterlandsRock(ID_ROCK, WALL, FLOOR);
		if(bridges)
		{
			client_stone_bridges.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
			client_stone_bridges.createStoneModelsBlocks(LOCATION, txtLocMod, ID_ROCK, WALL, FLOOR);
			client_stone_bridges.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
			data_bridges.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, modLoader);
			data_bridges.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
			data_bridges.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, FLOOR, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, modLoader);
		}
		if(roofs)
		{
			client_stone_roofs.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
			client_stone_roofs.createStoneModelsBlocks(LOCATION, txtLocMod, ID_ROCK, WALL, FLOOR);
			client_stone_roofs.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
			data_roofs.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, modLoader);
			data_roofs.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
			data_roofs.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, FLOOR, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, modLoader);
		}
		if(fences)
		{
			client_stone_fences.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
			client_stone_fences.createStoneModelsBlocks(LOCATION, txtLocMod, ID_ROCK, WALL, FLOOR);
			client_stone_fences.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
			data_fences.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data_fences.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
			data_fences.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, FLOOR, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
		McwAPI.clears(ID_ROCK, WALL, FLOOR);

		txtLocMod = "shroomed:blocks";
		ModidOfBaseMod = "shroomed";
		ID_WOOD.add("hard_mushroom");
		genShroom(LOCATION, CompatModid, txtLocMod, ModidOfBaseMod, ID_WOOD, "shroomwood_planks", "hard_mushroom_stem", "shroomwood_planks", "hard_mushroom_hyphae", "shroomwood");
		ID_WOOD.clear();

		ID_WOOD.add("blue_hard_mushroom");
		genShroom(LOCATION, CompatModid, txtLocMod, ModidOfBaseMod, ID_WOOD, "blue_shroomwood_planks", "blue_hard_mushroom_stem", "blue_mushroom_stem", "blue_hard_mushroom_hyphae", "blue_shroomwood");
		ID_WOOD.clear();
		

		ID_WOOD.add("orange_hard_mushroom");
		genShroom(LOCATION, CompatModid, txtLocMod, ModidOfBaseMod, ID_WOOD, "orange_shroomwood_planks", "orange_hard_mushroom_stem", "orange_mushroom_stem", "orange_hard_mushroom_hyphae", "orange_shroomwood");
		ID_WOOD.clear();
		

		ID_WOOD.add("purple_hard_mushroom");
		genShroom(LOCATION, CompatModid, txtLocMod, ModidOfBaseMod, ID_WOOD, "purple_shroomwood_planks", "purple_hard_mushroom_stem", "purple_mushroom_stem", "purple_hard_mushroom_hyphae", "purple_shroomwood");
		ID_WOOD.clear();
		
		System.out.println("Start Tags");
		NewModsList.Sajevius.betterlandsWood(ID_WOOD);
		NewModsList.Sajevius.shroomedWood(ID_WOOD);
		NewModsList.Sajevius.betterlandsWood(ID_LEAVE);
		NewModsList.Sajevius.betterlandsRock(ID_ROCK, WALL, FLOOR);

		List<String> modsMcw = List.of(Compatibilities.MCW_BRIDGES_MODID, Compatibilities.MCW_ROOFS_MODID, Compatibilities.MCW_FENCES_MODID, Compatibilities.MCW_FURNITURES_MODID, Compatibilities.MCW_STAIRS_MODID);

		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, modsMcw);

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, modsMcw);
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);

		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), modsMcw);
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), modsMcw);

//		BridgesTagsGenerator tag_bridges = new BridgesTagsGenerator();
//		RoofsTagsGenerator tag_roofs = new RoofsTagsGenerator();
//		FencesTagsGenerator tag_fences = new FencesTagsGenerator(true, ID_ROCK, ID_LEAVE);
//		FurnituresTagsGenerator tag_furnitures = new FurnituresTagsGenerator();
//		StairsTagsGenerator tag_stairs = new StairsTagsGenerator();
		System.out.println("Done Tags");



//		BridgesLangGenerator lang_bridges = new BridgesLangGenerator();
//		RoofsLangGenerator lang_roofs = new RoofsLangGenerator();
//		FencesLangGenerator lang_fences = new FencesLangGenerator(ID_LEAVE, LANG_LEAVE);
//		FurnituresLangGenerator lang_furnitures = new FurnituresLangGenerator();
//		StairsLangGenerator lang_stairs = new StairsLangGenerator();
		
//		tag_bridges.AxeDataGenWood(LOCATION, CompatModid, ID_WOOD);
//		tag_bridges.TagsWood(LOCATION, CompatModid, ID_WOOD);
//		tag_bridges.TagsRock(LOCATION, CompatModid, ID_ROCK);
//		tag_roofs.AxeDataGenWood(LOCATION, CompatModid, ID_WOOD);
//		tag_roofs.TagsWood(LOCATION, CompatModid, ID_WOOD);
//		tag_fences.AxeDataGenWood(LOCATION, CompatModid, ID_WOOD);
//		tag_fences.HoeDataGenWood(LOCATION, CompatModid, ID_LEAVE);
//		tag_fences.TagsWood(LOCATION, CompatModid, ID_WOOD);
//		tag_furnitures.AxeDataGenWood(LOCATION, CompatModid, ID_WOOD);
//		tag_furnitures.TagsWood(LOCATION, CompatModid, ID_WOOD);
//		tag_stairs.AxeDataGenWood(LOCATION, CompatModid, ID_WOOD);
//		tag_stairs.TagsWood(LOCATION, CompatModid, ID_WOOD);

		
//		lang_bridges.initAllWoodEnglish(CompatModid, ID_WOOD, LANG_WOOD);
//		lang_bridges.initAllStoneEnglish(CompatModid, ID_ROCK, LANG_ROCK);
//		lang_roofs.initAllWoodEnglish(CompatModid, ID_WOOD, LANG_WOOD);
//		lang_roofs.initAllStoneEnglish(CompatModid, ID_ROCK, LANG_ROCK);
//		lang_fences.initAllWoodEnglish(CompatModid, ID_WOOD, LANG_WOOD);
//		lang_fences.initAllStoneEnglish(CompatModid, ID_ROCK, LANG_ROCK);
//		lang_furnitures.initAllWoodEnglish(CompatModid, ID_WOOD, LANG_WOOD);
//		lang_stairs.initAllWoodEnglish(CompatModid, ID_WOOD, LANG_WOOD);

		genLang(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_ROCK, LANG_ROCK, ID_LEAVE, LANG_LEAVE, "en_us");
		System.out.println("Done Data/Tags/Lang");
	}

	private void genLang(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> LANG_WOOD, List<String> ID_ROCK,
	List<String> LANG_ROCK, List<String> ID_LEAVE, List<String> LANG_LEAVE, String language)
	{
		System.out.println("Start Lang "+language);
		LangSearcher langSearcher = new LangSearcher(McwAPI.READER_MCW_LANG);
		LangMods.Sajevius.sajeviusWoodLang(LANG_WOOD, language);
		LangMods.Sajevius.sajeviusLeaveLang(LANG_LEAVE, language);
		LangMods.Sajevius.sajeviusRockLang(LANG_ROCK, language);

		langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, List.of(
				Compatibilities.MCW_BRIDGES_MODID,
				Compatibilities.MCW_ROOFS_MODID,
				Compatibilities.MCW_FENCES_MODID,
				Compatibilities.MCW_FURNITURES_MODID,
				Compatibilities.MCW_STAIRS_MODID));
		langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
		langSearcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, language, Reference.allMcwModsStone());
		LANG_WOOD.clear();
		LANG_LEAVE.clear();
		LANG_ROCK.clear();
		System.out.println("Done Lang "+language);
	}
	
	protected void genShroom(String LOCATION, String CompatModid, String txtLocMod, String ModidOfBaseMod, List<String> ID_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped, String hyphae, String planksStuff)
	{
		if(bridges)
		{
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_bridges.createWoodCustomModelsBlocks(LOCATION, txtLocMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_bridges.AdvancementsLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, modLoader);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_bridges.RecipesLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, modLoader);
		}
		if(roofs)
		{
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_roofs.createWoodCustomModelsBlocks(LOCATION, txtLocMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_roofs.AdvancementsLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, modLoader);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_roofs.RecipesLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, modLoader);
		}
		if(fences)
		{
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_fences.createWoodCustomModelsBlocks(LOCATION, txtLocMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_fences.AdvancementsLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data_fences.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_fences.RecipesLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
		if(furnitures)
		{
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_furnitures.createWoodCustomModelsBlocks(LOCATION, txtLocMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_furnitures.AdvancementsLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod, modLoader);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_furnitures.RecipesLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod, modLoader);
		}
		if(stairs)
		{
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
			client_wood_stairs.createWoodCustomModelsBlocks(LOCATION, txtLocMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
			data_stairs.AdvancementsLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod, modLoader);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
			data_stairs.RecipesLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, hyphae, planksStuff, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod, modLoader);
		}
	}
}