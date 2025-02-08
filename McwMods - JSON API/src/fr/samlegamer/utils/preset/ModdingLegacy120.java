package fr.samlegamer.utils.preset;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.bridges.BridgesTagsGenerator;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.datagen.furnitures.FurnituresTagsGenerator;
import fr.samlegamer.api.datagen.roofs.RoofsTagsGenerator;
import fr.samlegamer.api.datagen.stairs.StairsTagsGenerator;
import fr.samlegamer.api.lang.*;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;

import java.util.ArrayList;
import java.util.List;

public class ModdingLegacy120 implements Presetting
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
	
	/*Instance Roofs*/
	private static final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
	private static final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);

	private static final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
	private static final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);

	public boolean blueSkies;
	public boolean premiumWood;

	public ModdingLegacy120(boolean blueSkies, boolean premiumWood)
	{
		this.blueSkies = blueSkies;
		this.premiumWood = premiumWood;
	}
	
	public ModdingLegacy120()
	{
		this(true, true);
	}
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> PREFIX_WOOD = new ArrayList<String>();
		List<String> MAT_WOOD = new ArrayList<String>();
		List<String> MAJ_WOOD = new ArrayList<String>();		
		List<String> PREFIX_LEAVES = new ArrayList<String>();
		List<String> LEAVES = new ArrayList<String>();
		List<String> MAJ_LEAVES = new ArrayList<String>();
		String CompatModid = "mcwmoddinglegacy";
		String txtLocMod, ModidOfBaseMod;
		
		if(blueSkies)
		{

			ModsList.BlueSkiesBsky1201(PREFIX_WOOD);
			ModsList.BlueSkiesTextures1201(MAT_WOOD);
			PREFIX_LEAVES.addAll(PREFIX_WOOD);
			LEAVES.addAll(MAT_WOOD);
			txtLocMod = "blue_skies:block";
			ModidOfBaseMod = "blue_skies";

			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
	
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_fences.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_fences.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_fences.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_fences.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_furnitures.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_furnitures.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_furnitures.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_stairs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_stairs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_stairs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
	
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod+"/leaves", LEAVES, PREFIX_LEAVES, Boolean.FALSE, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			data_fences.AdvancementsLeavesHedgesPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES);
			data_fences.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, LEAVES, PREFIX_LEAVES, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			LEAVES.clear();
			MAT_WOOD.clear();
			PREFIX_WOOD.clear();
			PREFIX_LEAVES.clear();
	
			/*For Crystal Bridges/Roofs*/
			PREFIX_WOOD.add("bsky_crystallized");
			MAT_WOOD.add("crystallized");
			PREFIX_LEAVES.addAll(PREFIX_WOOD);
			LEAVES.addAll(MAT_WOOD);
	
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			
			//Hedges
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod+"/leaves", LEAVES, PREFIX_LEAVES, Boolean.FALSE, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			data_fences.AdvancementsLeavesHedgesPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES);
			data_fences.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, LEAVES, PREFIX_LEAVES, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			PREFIX_WOOD.clear();
			LEAVES.clear();
			PREFIX_LEAVES.clear();
		}
		
		if(premiumWood)
		{
			txtLocMod = "premium_wood:block";
			ModidOfBaseMod = "premium_wood";
			PREFIX_WOOD.add("pwood_magic");
			MAT_WOOD.add("magic");
			PREFIX_LEAVES.addAll(PREFIX_WOOD);
			LEAVES.addAll(MAT_WOOD);
			genPwoodWood(LOCATION, CompatModid, txtLocMod, MAT_WOOD, PREFIX_WOOD, LEAVES, PREFIX_LEAVES, ModidOfBaseMod, MAT_WOOD.get(0));
			MAT_WOOD.clear();
			PREFIX_WOOD.clear();
			LEAVES.clear();
			PREFIX_LEAVES.clear();
	
			PREFIX_WOOD.add("pwood_maple");
			MAT_WOOD.add("maple");
			PREFIX_LEAVES.addAll(PREFIX_WOOD);
			LEAVES.addAll(MAT_WOOD);
			genPwoodWood(LOCATION, CompatModid, txtLocMod, MAT_WOOD, PREFIX_WOOD, LEAVES, PREFIX_LEAVES, ModidOfBaseMod, MAT_WOOD.get(0));
			MAT_WOOD.clear();
			PREFIX_WOOD.clear();
			LEAVES.clear();
			PREFIX_LEAVES.clear();
	
			PREFIX_WOOD.add("pwood_purple_heart");
			MAT_WOOD.add("purple_heart");
			PREFIX_LEAVES.addAll(PREFIX_WOOD);
			LEAVES.addAll(MAT_WOOD);
			genPwoodWood(LOCATION, CompatModid, txtLocMod, MAT_WOOD, PREFIX_WOOD, LEAVES, PREFIX_LEAVES, ModidOfBaseMod, MAT_WOOD.get(0));
			MAT_WOOD.clear();
			PREFIX_WOOD.clear();
			LEAVES.clear();
			PREFIX_LEAVES.clear();
	
			PREFIX_WOOD.add("pwood_silverbell");
			MAT_WOOD.add("silverbell");
			PREFIX_LEAVES.addAll(PREFIX_WOOD);
			LEAVES.addAll(MAT_WOOD);
			genPwoodWood(LOCATION, CompatModid, txtLocMod, MAT_WOOD, PREFIX_WOOD, LEAVES, PREFIX_LEAVES, ModidOfBaseMod, MAT_WOOD.get(0));
			MAT_WOOD.clear();
			PREFIX_WOOD.clear();
			LEAVES.clear();
			PREFIX_LEAVES.clear();
	
			PREFIX_WOOD.add("pwood_tiger");
			MAT_WOOD.add("tiger");
			PREFIX_LEAVES.addAll(PREFIX_WOOD);
			LEAVES.addAll(MAT_WOOD);
			genPwoodWood(LOCATION, CompatModid, txtLocMod, MAT_WOOD, PREFIX_WOOD, LEAVES, PREFIX_LEAVES, ModidOfBaseMod, MAT_WOOD.get(0));
			MAT_WOOD.clear();
			PREFIX_WOOD.clear();
			LEAVES.clear();
			PREFIX_LEAVES.clear();
	
			PREFIX_WOOD.add("pwood_willow");
			MAT_WOOD.add("willow");
			PREFIX_LEAVES.addAll(PREFIX_WOOD);
			LEAVES.addAll(MAT_WOOD);
			genPwoodWood(LOCATION, CompatModid, txtLocMod, MAT_WOOD, PREFIX_WOOD, LEAVES, PREFIX_LEAVES, ModidOfBaseMod, MAT_WOOD.get(0));
			MAT_WOOD.clear();
			PREFIX_WOOD.clear();
			LEAVES.clear();
			PREFIX_LEAVES.clear();	
		}
		
		ModsList.BlueSkiesBsky1201(PREFIX_WOOD);
		ModsList.PremiumWoodPwood(PREFIX_WOOD);
		English.ModdingLegacy.BlueSkiesLang1201(MAJ_WOOD);
		English.ModdingLegacy.PremiumWoodLang(MAJ_WOOD);
		PREFIX_WOOD.add("bsky_crystallized");
		MAJ_WOOD.add("Crystallized");

		BridgesTagsGenerator bridges_tags = new BridgesTagsGenerator();
		bridges_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		bridges_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		RoofsTagsGenerator roofs_tags = new RoofsTagsGenerator();
		roofs_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		
		BridgesLangGenerator bridges_lang = new BridgesLangGenerator();
		RoofsLangGenerator roofs_lang = new RoofsLangGenerator();
		bridges_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		roofs_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		PREFIX_WOOD.clear();
		MAJ_WOOD.clear();
		
		ModsList.BlueSkiesBsky1201(PREFIX_WOOD);
		ModsList.PremiumWoodPwood(PREFIX_WOOD);
		English.ModdingLegacy.BlueSkiesLang1201(MAJ_WOOD);
		English.ModdingLegacy.PremiumWoodLang(MAJ_WOOD);
		MAJ_LEAVES.addAll(MAJ_WOOD);
		PREFIX_LEAVES.addAll(PREFIX_WOOD);
		PREFIX_LEAVES.add("bsky_crystallized");
		MAJ_LEAVES.add("Crystallized");

		FencesTagsGenerator fences_tags = new FencesTagsGenerator(PREFIX_LEAVES);
		FencesLangGenerator fences_lang = new FencesLangGenerator(PREFIX_LEAVES, MAJ_LEAVES);
		fences_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		fences_tags.HoeDataGenWood(LOCATION, CompatModid, PREFIX_LEAVES);
		fences_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		fences_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		
		FurnituresTagsGenerator furni_tags = new FurnituresTagsGenerator();
		FurnituresLangGenerator furni_lang = new FurnituresLangGenerator();
		furni_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		furni_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		furni_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		
		StairsTagsGenerator stairs_tags = new StairsTagsGenerator();
		StairsLangGenerator stairs_lang = new StairsLangGenerator();
		stairs_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		stairs_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		stairs_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		MAJ_LEAVES.clear();
		PREFIX_LEAVES.clear();
		PREFIX_WOOD.clear();
		MAJ_WOOD.clear();

		ModsList.BlueSkiesBsky1201(PREFIX_WOOD);
		ModsList.PremiumWoodPwood(PREFIX_WOOD);
		French.ModdingLegacy.BlueSkiesLang1201(MAJ_WOOD);
		French.ModdingLegacy.PremiumWoodLang(MAJ_WOOD);
		PREFIX_WOOD.add("bsky_crystallized");
		MAJ_WOOD.add("cristallisé");

		bridges_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		bridges_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		roofs_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		
		bridges_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		roofs_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		PREFIX_WOOD.clear();
		MAJ_WOOD.clear();
		
		ModsList.BlueSkiesBsky1201(PREFIX_WOOD);
		ModsList.PremiumWoodPwood(PREFIX_WOOD);
		French.ModdingLegacy.BlueSkiesLang1201(MAJ_WOOD);
		French.ModdingLegacy.PremiumWoodLang(MAJ_WOOD);
		MAJ_LEAVES.addAll(MAJ_WOOD);
		PREFIX_LEAVES.addAll(PREFIX_WOOD);
		PREFIX_LEAVES.add("bsky_crystallized");
		MAJ_LEAVES.add("cristallisé");

		fences_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		fences_tags.HoeDataGenWood(LOCATION, CompatModid, PREFIX_LEAVES);
		fences_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		fences_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		
		furni_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		furni_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		furni_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		
		stairs_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
	}
	
	public void genPwoodWood(String LOCATION, String CompatModid, String txtLocMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, List<String> LEAVES, List<String> PREFIX_LEAVES, String ModidOfBaseMod, String folderWood)
	{
		client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
		client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, true);
		client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
		data_bridges.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
		data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
		data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, true);
		
		client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
		client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, true);
		client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
		data_roofs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
		data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
		data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, true);

		client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
		client_wood_fences.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, true);
		client_wood_fences.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
		data_fences.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
		data_fences.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
		data_fences.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, true);
		
		client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
		client_wood_furnitures.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, true);
		client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
		data_furnitures.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
		data_furnitures.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
		data_furnitures.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod, true);
		
		client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
		client_wood_fences.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod, LEAVES, PREFIX_LEAVES, Boolean.FALSE, "acacia_wall");
		client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
		data_fences.AdvancementsLeavesHedgesPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES);
		data_fences.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, LEAVES, PREFIX_LEAVES, "acacia_hedge");
		data_fences.RecipesLogAllwithResearchIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);

		client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
		client_wood_stairs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, true);
		client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
		data_stairs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
		data_stairs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
		data_stairs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod, true);
	}
}