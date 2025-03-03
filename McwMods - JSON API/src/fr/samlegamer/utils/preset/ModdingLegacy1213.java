package fr.samlegamer.utils.preset;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.bridges.BridgesTagsGenerator;
import fr.samlegamer.api.datagen.doors.DoorsTagsGenerator;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.datagen.furnitures.FurnituresTagsGenerator;
import fr.samlegamer.api.datagen.paths.PathsTagsGenerator;
import fr.samlegamer.api.datagen.roofs.RoofsTagsGenerator;
import fr.samlegamer.api.datagen.stairs.StairsTagsGenerator;
import fr.samlegamer.api.datagen.traps.TrapdoorsTagsGenerator;
import fr.samlegamer.api.datagen.windows.WindowsTagsGenerator;
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.DoorsLangGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.FurnituresLangGenerator;
import fr.samlegamer.api.lang.PathsLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.StairsLangGenerator;
import fr.samlegamer.api.lang.TrapdoorsLangGenerator;
import fr.samlegamer.api.lang.WindowsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.JsonsUtils;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;

public class ModdingLegacy1213 implements Presetting
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
	
	public ModdingLegacy1213(boolean bridges, boolean roofs, boolean fences, boolean furnitures, boolean stairs, boolean traps, boolean doors, boolean paths, boolean windows)
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
	
	public ModdingLegacy1213()
	{
		this(true, true, true, true, true, true, true, true, true);
	}
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.PathsGenFolder(LOCATION);
		McwAPI.DoorsGenFolder(LOCATION);
		McwAPI.TrapdoorsGenFolder(LOCATION);
		McwAPI.WindowsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> PREFIX_WOOD = new ArrayList<String>();
		List<String> MAT_WOOD = new ArrayList<String>();
		List<String> MAJ_WOOD = new ArrayList<String>();		
		List<String> PREFIX_LEAVES = new ArrayList<String>();
		List<String> LEAVES = new ArrayList<String>();
		List<String> MAJ_LEAVES = new ArrayList<String>();
		String CompatModid = "mcwmoddinglegacy";
		String txtLocMod, ModidOfBaseMod;
		
		ModsList.BlueSkiesBsky1201(PREFIX_WOOD);
		ModsList.BlueSkiesTextures1201(MAT_WOOD);
		PREFIX_LEAVES.addAll(PREFIX_WOOD);
		LEAVES.addAll(MAT_WOOD);
		txtLocMod = Compatibilities.BLUE_SKIES_TEXTURES;
		ModidOfBaseMod = Compatibilities.BLUE_SKIES_MODID;

		if(bridges)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, "1.21"));
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
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID, "1.21"));
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
			McwDataGen data = new McwDataGen(Compatibilities.MCW_FENCES_MODID, "1.21");
			
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
					new McwDataGen(Compatibilities.MCW_FURNITURES_MODID, "1.21"));

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
					new McwDataGen(Compatibilities.MCW_STAIRS_MODID, "1.21"));

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
					new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID, "1.21"));
		}
		
		if(doors)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_DOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_DOORS_MODID, "1.21"));
		}

		if(paths)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID, 
					new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_PATHS_MODID, "1.21"));
		}
		
		if(windows)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_WOOD, MAT_WOOD, ModidOfBaseMod, Compatibilities.MCW_WINDOWS_MODID, 
					new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_WINDOWS_MODID, "1.21"));
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
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, "1.21"));

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
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID, "1.21"));

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
			McwDataGen data = new McwDataGen(Compatibilities.MCW_FENCES_MODID, "1.21");

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
		
		PathsTagsGenerator paths_tags = new PathsTagsGenerator();
		PathsLangGenerator paths_lang = new PathsLangGenerator();
		paths_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		paths_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		paths_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);

		DoorsTagsGenerator doors_tags = new DoorsTagsGenerator();
		DoorsLangGenerator doors_lang = new DoorsLangGenerator();
		doors_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		doors_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		doors_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);

		TrapdoorsTagsGenerator traps_tags = new TrapdoorsTagsGenerator();
		TrapdoorsLangGenerator traps_lang = new TrapdoorsLangGenerator();
		traps_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		traps_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		traps_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);

		WindowsTagsGenerator wins_tags = new WindowsTagsGenerator();
		WindowsLangGenerator wins_lang = new WindowsLangGenerator();
		wins_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		wins_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		wins_lang.initAllWoodEnglish(CompatModid, PREFIX_WOOD, MAJ_WOOD);

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

		//bridges_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		//bridges_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		//roofs_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		
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

		//fences_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		//fences_tags.HoeDataGenWood(LOCATION, CompatModid, PREFIX_LEAVES);
		//fences_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		fences_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		
		//furni_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_WOOD);
		//furni_tags.TagsWood(LOCATION, CompatModid, PREFIX_WOOD);
		furni_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		stairs_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		paths_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		doors_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		traps_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		wins_lang.initAllWoodFrench(CompatModid, PREFIX_WOOD, MAJ_WOOD);
		

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "crystallized", "blue_skies:crystallized_fence", "blue_skies:crystallized_wall");


		for(String folderInModel : McwAPI.ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD.getPathList())
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+ folderInModel + File.separator, "crystallized", "stripped_crystallized_log_side", "crystallized_planks");
		}

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+ "hedges" + File.separator, "bsky_comet", "comet_leaves", "comet_leaves_can_grow");
	}
	
	private void genRessourcesBsky(String LOCATION, String CompatModid, String txtLocMod, List<String> PREFIX_WOOD, List<String> MAT_WOOD, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen data)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
		res.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", MAT_WOOD, PREFIX_WOOD, false);
		res.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
		data.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, compat, ModidOfBaseMod);
		data.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
		data.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, compat, ModidOfBaseMod);
	}

	public void genPwoodWood(String LOCATION, String CompatModid, String txtLocMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, List<String> LEAVES, List<String> PREFIX_LEAVES, String ModidOfBaseMod, String folderWood)
	{
		/*Instance Bridges*/
		final McwModsRessources client_wood_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
		final McwDataGen data_bridges = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, "1.21");
		
		/*Instance Roofs*/
		final McwModsRessources client_wood_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
		final McwDataGen data_roofs = new McwDataGen(Compatibilities.MCW_ROOFS_MODID, "1.21");
		
		/*Instance Fences*/
		final McwModsRessources client_wood_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
		final McwDataGen data_fences = new McwDataGen(Compatibilities.MCW_FENCES_MODID, "1.21");
		
		/*Instance Furniture*/
		final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
		final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID, "1.21");

		/*Instance Stairs*/
		final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
		final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID, "1.21");

		/*Instance Paths*/
		final McwModsRessources client_wood_paths = new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD);
		final McwDataGen data_paths = new McwDataGen(Compatibilities.MCW_PATHS_MODID, "1.21");

		/*Instance Doors*/
		final McwModsRessources client_wood_doors = new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD);
		final McwDataGen data_doors = new McwDataGen(Compatibilities.MCW_DOORS_MODID, "1.21");

		/*Instance Trapdoors*/
		final McwModsRessources client_wood_traps = new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD);
		final McwDataGen data_traps = new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID, "1.21");

		/*Instance Stairs*/
		final McwModsRessources client_wood_windows = new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD);
		final McwDataGen data_windows = new McwDataGen(Compatibilities.MCW_WINDOWS_MODID, "1.21");

		if(bridges)
		{
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, true);
		}
		
		if(roofs)
		{
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, true);
		}
		
		if(fences)
		{
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_fences.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_fences.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			data_fences.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_fences.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, true);
		}
		
		if(furnitures)
		{
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_furnitures.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_furnitures.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_furnitures.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod, true);
		}
		
		if(fences)
		{
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod, LEAVES, PREFIX_LEAVES, false, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_LEAVES, "acacia_hedge");
			data_fences.AdvancementsLeavesHedgesPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			data_fences.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, LEAVES, PREFIX_LEAVES, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, false, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
		}
		
		if(stairs)
		{
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_stairs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_stairs.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_stairs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod, true);
		}
		
		if(paths)
		{
			client_wood_paths.setModid(CompatModid);
			client_wood_paths.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_paths.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_paths.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_paths.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_PATHS_MODID, ModidOfBaseMod);
			data_paths.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_paths.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_PATHS_MODID, ModidOfBaseMod, true);
		}
		
		if(doors)
		{
			client_wood_doors.setModid(CompatModid);
			client_wood_doors.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_doors.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_doors.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_doors.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_DOORS_MODID, ModidOfBaseMod);
			data_doors.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_doors.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_DOORS_MODID, ModidOfBaseMod, true);
		}
		
		if(traps)
		{
			client_wood_traps.setModid(CompatModid);
			client_wood_traps.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_traps.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_traps.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_traps.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_TRAPDOORS_MODID, ModidOfBaseMod);
			data_traps.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_traps.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_TRAPDOORS_MODID, ModidOfBaseMod, true);
		}
		
		if(windows)
		{
			client_wood_windows.setModid(CompatModid);
			client_wood_windows.createWoodBlockstates(LOCATION, CompatModid, PREFIX_WOOD);
			client_wood_windows.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, MAT_WOOD, PREFIX_WOOD, false, "1.21.4");
			client_wood_windows.createWoodModelItem(LOCATION, CompatModid, PREFIX_WOOD);
			data_windows.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_WINDOWS_MODID, ModidOfBaseMod);
			data_windows.LootTableLogAll(LOCATION, CompatModid, PREFIX_WOOD);
			data_windows.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, false, Compatibilities.MCW_WINDOWS_MODID, ModidOfBaseMod, true);
		}
	}
}