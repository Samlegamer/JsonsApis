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

public class ModdingLegacy implements Presetting
{
	private boolean bridges;
	private boolean roofs;
	private boolean fences;
	private boolean furnitures;
	private boolean stairs;
	private boolean traps;
	private boolean doors;
	private boolean paths;
	private boolean windows;
	
	public ModdingLegacy(boolean bridges, boolean roofs, boolean fences, boolean furnitures, boolean stairs, boolean traps, boolean doors, boolean paths, boolean windows)
	{
		this.bridges=bridges;
		this.roofs=roofs;
		this.fences=fences;
		this.furnitures=furnitures;
		this.stairs=stairs;
		this.traps=traps;
		this.doors=doors;
		this.paths=paths;
		this.windows=windows;
	}
	
	public ModdingLegacy()
	{
		this(true, true, true, true, true, true, true, true, true);
	}
	
	private void genRessourcesBsky(String LOCATION, String CompatModid, String txtLocMod, List<String> PREFIX_WOOD, List<String> MAT_WOOD, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen data)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
		res.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
		res.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
		data.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
		data.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
		data.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, compat, ModidOfBaseMod);
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
		
		ModsList.BlueSkiesBsky(PREFIX_WOOD);
		ModsList.BlueSkiesTextures(MAT_WOOD);
		PREFIX_LEAVES.addAll(PREFIX_WOOD);
		LEAVES.addAll(MAT_WOOD);
		txtLocMod = Compatibilities.BLUE_SKIES_TEXTURES;
		ModidOfBaseMod = Compatibilities.BLUE_SKIES_MODID;

		if(bridges)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
			/*client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);*/
		}
		
		if(roofs)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, 
					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
			/*client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);*/
		}
		
		if(fences)
		{
			McwModsRessources res = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
			McwDataGen data = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
			
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, 
					res, 
					data);

			/*client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_fences.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_fences.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_fences.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_fences.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);*/
			
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			res.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod+"/leaves", LEAVES, PREFIX_LEAVES, false, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			data.AdvancementsLeavesHedgesPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES);
			data.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, LEAVES, PREFIX_LEAVES, "acacia_hedge");
			data.RecipesLogAllwithResearchIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, false, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);

		}
		
		if(furnitures)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_FURNITURES_MODID, 
					new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL), 
					new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));

			/*client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_furnitures.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_furnitures.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_furnitures.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);*/
		}
		
		if(stairs)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_STAIRS_MODID, 
					new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_STAIRS_MODID));

			/*client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_stairs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_stairs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_stairs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);*/
		}
		
		if(traps)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_TRAPDOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
		}
		
		if(doors)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_DOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_DOORS_MODID));
		}

		if(paths)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID, 
					new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_PATHS_MODID));
		}
		
		if(windows)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_WINDOWS_MODID, 
					new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
		}
		LEAVES.clear();
		MAT_WOOD.clear();
		PREFIX_WOOD.clear();
		PREFIX_LEAVES.clear();

		/*For Crystal Bridges/Roofs*/
		PREFIX_WOOD.add("bsky_crystallized");
		MAT_WOOD.add("crystallized");
		PREFIX_LEAVES.addAll(PREFIX_WOOD);
		LEAVES.addAll(MAT_WOOD);

		if(bridges)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));

			/*client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);*/
		}
		
		if(roofs)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, 
					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID));

			/*client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);*/
		}
		
		if(fences)
		{
			McwModsRessources res = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
			McwDataGen data = new McwDataGen(Compatibilities.MCW_FENCES_MODID);

			//Hedges
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			res.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod+"/leaves", LEAVES, PREFIX_LEAVES, false, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			data.AdvancementsLeavesHedgesPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES);
			data.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, LEAVES, PREFIX_LEAVES, "acacia_hedge");
			data.RecipesLogAllwithResearchIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, false, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
		}
		MAT_WOOD.clear();
		PREFIX_WOOD.clear();
		LEAVES.clear();
		PREFIX_LEAVES.clear();

		txtLocMod = Compatibilities.PREMIUM_WOOD_TEXTURES;
		ModidOfBaseMod = Compatibilities.PREMIUM_WOOD_MODID;
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
		
		ModsList.BlueSkiesBsky(PREFIX_WOOD);
		ModsList.PremiumWoodPwood(PREFIX_WOOD);
		English.ModdingLegacy.BlueSkiesLang(MAJ_WOOD);
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
		
		ModsList.BlueSkiesBsky(PREFIX_WOOD);
		ModsList.PremiumWoodPwood(PREFIX_WOOD);
		English.ModdingLegacy.BlueSkiesLang(MAJ_WOOD);
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

		ModsList.BlueSkiesBsky(PREFIX_WOOD);
		ModsList.PremiumWoodPwood(PREFIX_WOOD);
		French.ModdingLegacy.BlueSkiesLang(MAJ_WOOD);
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
		
		ModsList.BlueSkiesBsky(PREFIX_WOOD);
		ModsList.PremiumWoodPwood(PREFIX_WOOD);
		French.ModdingLegacy.BlueSkiesLang(MAJ_WOOD);
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
		/*Instance Bridges*/
		final McwModsRessources client_wood_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
		final McwDataGen data_bridges = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);
		
		/*Instance Roofs*/
		final McwModsRessources client_wood_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
		final McwDataGen data_roofs = new McwDataGen(Compatibilities.MCW_ROOFS_MODID);
		
		/*Instance Fences*/
		final McwModsRessources client_wood_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
		final McwDataGen data_fences = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
		
		/*Instance Furniture*/
		final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
		final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);

		/*Instance Stairs*/
		final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
		final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);

		/*Instance Paths*/
		final McwModsRessources client_wood_paths = new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD);
		final McwDataGen data_paths = new McwDataGen(Compatibilities.MCW_PATHS_MODID);

		/*Instance Doors*/
		final McwModsRessources client_wood_doors = new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD);
		final McwDataGen data_doors = new McwDataGen(Compatibilities.MCW_DOORS_MODID);

		/*Instance Trapdoors*/
		final McwModsRessources client_wood_traps = new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD);
		final McwDataGen data_traps = new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID);

		/*Instance Stairs*/
		final McwModsRessources client_wood_windows = new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD);
		final McwDataGen data_windows = new McwDataGen(Compatibilities.MCW_WINDOWS_MODID);

		if(bridges)
		{
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
		}
		
		if(roofs)
		{
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
		}
		
		if(fences)
		{
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_fences.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_fences.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_fences.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_fences.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
		}
		
		if(furnitures)
		{
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_furnitures.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_furnitures.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_furnitures.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
		}
		
		if(fences)
		{
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod+"/"+folderWood, LEAVES, PREFIX_LEAVES, Boolean.FALSE, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			data_fences.AdvancementsLeavesHedgesPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES);
			data_fences.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, LEAVES, PREFIX_LEAVES, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
		}
		
		if(stairs)
		{
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_stairs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_stairs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_stairs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
		}
		
		if(paths)
		{
			client_wood_paths.setModid(CompatModid);
			client_wood_paths.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_paths.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_paths.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_paths.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_paths.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_paths.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_PATHS_MODID, ModidOfBaseMod);
		}
		
		if(doors)
		{
			client_wood_doors.setModid(CompatModid);
			client_wood_doors.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_doors.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_doors.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_doors.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_doors.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_doors.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_DOORS_MODID, ModidOfBaseMod);
		}
		
		if(traps)
		{
			client_wood_traps.setModid(CompatModid);
			client_wood_traps.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_traps.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_traps.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_traps.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_traps.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_traps.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_TRAPDOORS_MODID, ModidOfBaseMod);
		}
		
		if(windows)
		{
			client_wood_windows.setModid(CompatModid);
			client_wood_windows.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_windows.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/"+folderWood, MAT_WOOD, PREFIX_WOOD, false);
			client_wood_windows.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_windows.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false);
			data_windows.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_windows.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_WINDOWS_MODID, ModidOfBaseMod);
		}
	}
}