package fr.samlegamer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.preset.BOP;

public class McwMain
{	
	public static final List<String> WALL = new ArrayList<String>();	// !ONLY FOR STONE! this is wall texture in the bridge
	public static final List<String> FLOOR = new ArrayList<String>();	// !ONLY FOR STONE! this is floor texture in the bridge
	public static final List<String> MAT_WOOD = new ArrayList<String>();
	public static final List<String> MAT_ROCK = new ArrayList<String>();
	public static final List<String> MAJ_WOOD = new ArrayList<String>();
	public static final List<String> MAJ_ROCK = new ArrayList<String>();
	public static final List<String> LEAVES = new ArrayList<String>();
	public static final List<String> LEAVES_LANG = new ArrayList<String>();

	public static final String LOCATION = System.getProperty("user.dir")+File.separator+"genRessourcesMcw"+File.separator;// Local Path
	public static final String RP = System.getProperty("user.dir")+File.separator+"ressourcepack"+File.separator;// Local Path

	/*public static final String CompatModid = "mcwbiomesoplenty"; //The modid of compat, Please no insert ":"
	public static final String TextureLocationFormodid = Compatibilities.BOP_TEXTURES; //modid:block for textures location (ex : assets/quark/textures/block = quark:block)
	public static final String ModidOfBaseMod = Compatibilities.BOP_MODID; //For recipes (ex: bop:cherry_log)
	public static final String ClassBlockRegistry = "MFBYGBlocksRegistry"; // Blocks Class Registries (ex : IafBlockRegistry)*/
	protected static final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
	protected static final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);

	protected static void genWoodBYGStairs(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client_wood_stairs.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, isStem);
		data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, Compatibilities.MCW_STAIRS_MODID);
		data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}

	public static void main(String[] args)
	{
		preset(new BOP(true, "1.21"));
		/*French.Minecraft.mcWood(MAT_WOOD, MAJ_WOOD);
		MAT_WOOD.add("bamboo");
		MAJ_WOOD.add("bamboo");
		DoorsLangGenerator lang = new DoorsLangGenerator();
		lang.initAllWoodFrench("mcwdoors", MAT_WOOD, MAJ_WOOD);
		
		FabricMissingFrozCode missing = new FabricMissingFrozCode();
		String MODID = "mcwbiomesoplenty";
		ModsList.bop1201(MAT_WOOD);
		ModsList.bopLeaves1201(LEAVES);
		missing.bridges(LOCATION, "macawsbridgesbop", MODID, MAT_WOOD, MAT_ROCK);
		missing.roofs(LOCATION, "macawsroofsbop", MODID, MAT_WOOD, MAT_ROCK);
		missing.fences(LOCATION, "mcwfencesbop", MODID, MAT_WOOD, LEAVES, MAT_ROCK);
		missing.furnitures(LOCATION, "mcwfurnituresbop", MODID, MAT_WOOD);*/
		/*FabricMissingFrozCode missing = new FabricMissingFrozCode();
		String MODID = "mcwbyg";
		ModsList.bygWildUp(MAT_WOOD);
		ModsList.bygRock(MAT_ROCK);
		missing.bridges(LOCATION, "macawsbridgesbyg", MODID, MAT_WOOD, MAT_ROCK);
		MAT_ROCK.clear();
		ModsList.bygRockFenceable(MAT_ROCK);
		missing.fences(LOCATION, "z_mcwfencesbyg", MODID, MAT_WOOD, LEAVES, MAT_ROCK);
		missing.furnitures(LOCATION, "mcwfurnituresbyg", MODID, MAT_WOOD);
		missing.roofs(LOCATION, "z_mcwroofsbyg", MODID, MAT_WOOD, MAT_ROCK);*/
		//preset(new BYGWarden());
		/*McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.StairsGenFolder(LOCATION);

		//String ClassBlockRegistry = "MFBYGBlocksRegistry";
		String TextureLocationFormodid = Compatibilities.BYG_TEXTURES;
		String ModidOfBaseMod = Compatibilities.BYG_MODID;
		String CompatModid = "mcwbyg";
		System.out.println("Start Wood Data/Client");
		ModsList.byg(MAT_WOOD, false);
		genWoodBYGStairs(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, false);
		MAT_WOOD.clear();
		ModsList.byg(MAT_WOOD, true);
		genWoodBYGStairs(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, true);
		MAT_WOOD.clear();
		ModsList.byg(MAT_WOOD);

		System.out.println("Done Wood Data/Client");
		StairsTagsGenerator tag_stairs = new StairsTagsGenerator();
		tag_stairs.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_stairs.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		StairsLangGenerator english_stairs = new StairsLangGenerator();
		English.BYG.bygLang(MAJ_WOOD);

		english_stairs.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		MAJ_WOOD.clear();
		French.BYG.bygLang(MAJ_WOOD);
		StairsLangGenerator french_stairs = new StairsLangGenerator();

		french_stairs.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);*/

		//McwAPI.DataGenFolder(LOCATION);
		//preset(new MacadonQuark());
		//McwAPI.FencesGenFolder(LOCATION);
		//McwAPI.BridgesGenFolder(LOCATION);
		//McwAPI.RoofsGenFolder(LOCATION);
		//McwAPI.FurnituresGenFolder(LOCATION);
		//McwAPI.WindowsGenFolder(LOCATION);
		//McwAPI.TrapdoorsGenFolder(LOCATION);
		
		//preset(new Abnormals(false, false, false, false, true));
		//preset(new BOP());
		//preset(new ModdingLegacy());
		//preset(new Abnormals(false, true, true, true));
		/*MAT_WOOD.add("pale_oak");
		MAJ_WOOD.add("chêne pâle");
		BridgesLangGenerator langB = new BridgesLangGenerator();
		FurnituresLangGenerator langFurni = new FurnituresLangGenerator();
		FencesLangGenerator fence = new FencesLangGenerator(MAT_WOOD, MAJ_WOOD);
		RoofsLangGenerator roofs = new RoofsLangGenerator();
		TrapdoorsLangGenerator trapdoor = new TrapdoorsLangGenerator();
		DoorsLangGenerator door = new DoorsLangGenerator();
		PathsLangGenerator path = new PathsLangGenerator();
		WindowsLangGenerator window = new WindowsLangGenerator();
		langB.initAllWoodFrench(Compatibilities.MCW_BRIDGES_MODID, MAT_WOOD, MAJ_WOOD);
		langFurni.initAllWoodFrench(Compatibilities.MCW_FURNITURES_MODID, MAT_WOOD, MAJ_WOOD);
		roofs.initAllWoodFrench(Compatibilities.MCW_ROOFS_MODID, MAT_WOOD, MAJ_WOOD);
		fence.initAllWoodFrench(Compatibilities.MCW_FENCES_MODID, MAT_WOOD, MAJ_WOOD);
		trapdoor.initAllWoodFrench(Compatibilities.MCW_TRAPDOORS_MODID, MAT_WOOD, MAJ_WOOD);
		door.initAllWoodFrench(Compatibilities.MCW_DOORS_MODID, MAT_WOOD, MAJ_WOOD);
		path.initAllWoodFrench(Compatibilities.MCW_PATHS_MODID, MAT_WOOD, MAJ_WOOD);
		window.initAllWoodFrench(Compatibilities.MCW_WINDOWS_MODID, MAT_WOOD, MAJ_WOOD);
		
		MAJ_WOOD.clear();
		MAJ_WOOD.add("Pale Oak");

		langB.initAllWoodEnglish(Compatibilities.MCW_BRIDGES_MODID, MAT_WOOD, MAJ_WOOD);
		langFurni.initAllWoodEnglish(Compatibilities.MCW_FURNITURES_MODID, MAT_WOOD, MAJ_WOOD);
		roofs.initAllWoodEnglish(Compatibilities.MCW_ROOFS_MODID, MAT_WOOD, MAJ_WOOD);
		fence.initAllWoodEnglish(Compatibilities.MCW_FENCES_MODID, MAT_WOOD, MAJ_WOOD);
		trapdoor.initAllWoodEnglish(Compatibilities.MCW_TRAPDOORS_MODID, MAT_WOOD, MAJ_WOOD);
		door.initAllWoodEnglish(Compatibilities.MCW_DOORS_MODID, MAT_WOOD, MAJ_WOOD);
		path.initAllWoodEnglish(Compatibilities.MCW_PATHS_MODID, MAT_WOOD, MAJ_WOOD);
		window.initAllWoodEnglish(Compatibilities.MCW_WINDOWS_MODID, MAT_WOOD, MAJ_WOOD);*/

		//preset(new Aurora(true, true, true, true));
		/*
		McwAPI.FencesGenFolder(RP);
		McwAPI.BridgesGenFolder(RP);
		McwAPI.RoofsGenFolder(RP);
		McwAPI.FurnituresGenFolder(RP);
		McwAPI.DataGenFolder(RP);*/

		
		
		/*ModidCharged = Compatibilities.MCW_BRIDGES_MODID;
		recipeAndLootWoodCharged(new McwDataGen(ModidCharged, "1.20"), false, ModidCharged);
		genClientWood(new McwModsRessources(ModidCharged, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD, "1.20"), false);
		
		ModidCharged = Compatibilities.MCW_FENCES_MODID;
		recipeAndLootWoodCharged(new McwDataGen(ModidCharged, "1.20"), false, ModidCharged);
		genClientWood(new McwModsRessources(ModidCharged, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD, "1.20"), false);
		McwModsRessources client_wood = new McwModsRessources(ModidCharged, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
		McwDataGen data = new McwDataGen(ModidCharged);
		
		ModidCharged = Compatibilities.MCW_ROOFS_MODID;
		recipeAndLootWoodCharged(new McwDataGen(ModidCharged, "1.20"), false, ModidCharged);
		genClientWood(new McwModsRessources(ModidCharged, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD, "1.20"), false);
*/
		/*ModidCharged = Compatibilities.MCW_FURNITURES_MODID;
		recipeAndLootWoodCharged(new McwDataGen(ModidCharged, "1.20"), false, ModidCharged);
		genClientWood(new McwModsRessources(ModidCharged, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL, "1.20"), false);*/
		
		/*ModsList.bop(MAT_WOOD, false);
		//ModsList.bopLeaves(LEAVES, false);
		String ModidCharged = "";
		ModidCharged = Compatibilities.MCW_WINDOWS_MODID;
		McwModsRessources client_wood = new McwModsRessources(ModidCharged, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD, "1.20");
		client_wood.setModid(CompatModid);
		recipeAndLootWoodCharged(new McwDataGen(ModidCharged, "1.20"), false, ModidCharged);
		genClientWood(client_wood, false);
		
		English.BOP.bopLang(MAJ_WOOD, false);
		chargeLangEnglish(new WindowsLangGenerator());
		tagWood(new WindowsTagsGenerator());*/
	
		/*MAJ_WOOD.clear();
		French.BOP.bopLang(MAJ_WOOD, false);
		chargeLangFrench(new PathsLangGenerator());*/
		//McwModsRessources client_wood = new McwModsRessources(ModidCharged, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD, "1.20");
		//McwDataGen data = new McwDataGen(ModidCharged, "1.20");
		
		/*client_wood.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		client_wood.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
		client_wood.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
		data.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.RecipesLogAllwithResearch(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge");*/
		/*RessourcePackMissing.generateBlockstate(LOCATION + ClassicFolderTypes.BLOCKSTATES.getPath(), RP + ClassicFolderTypes.BLOCKSTATES.getPath());
		//RessourcePackMissing.generateModelsBlock(ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL, RP + ClassicFolderTypes.BLOCKSTATES);

		RessourcePackMissing.generateModelsBlock(LOCATION + ClassicFolderTypes.MODEL_BLOCK.getPath(), RP + ClassicFolderTypes.MODEL_BLOCK.getPath(), ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL.getPathList(), ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL.getPathList());

		RessourcePackMissing.generateModelsItem(LOCATION + ClassicFolderTypes.MODEL_ITEM.getPath(), RP + ClassicFolderTypes.MODEL_ITEM.getPath());*/
		/*client_wood.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		client_wood.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
		client_wood.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
		data.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.RecipesLogAllwithResearch(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge");

		tagWood(new FurnituresTagGenerator());
		tagWood(new RoofsTagGenerator());
		tagWood(new BridgesTagsGenerator());
		tagWood(new FencesTagsGenerator(LEAVES));
		
		English.BOP.bopLang(MAJ_WOOD, false);
		English.BOP.bopLeavesLang(LEAVES_LANG, false);

		chargeLangEnglish(new FurnituresLangGenerator());
		chargeLangEnglish(new FencesLangGenerator(LEAVES, LEAVES_LANG));
		chargeLangEnglish(new BridgesLangGenerator());
		chargeLangEnglish(new RoofsLangGenerator());
		
		MAJ_WOOD.clear();
		LEAVES_LANG.clear();
		French.BOP.bopLang(MAJ_WOOD, false);
		French.BOP.bopLeavesLang(LEAVES_LANG, false);

		chargeLangFrench(new FurnituresLangGenerator());
		chargeLangFrench(new FencesLangGenerator(LEAVES, LEAVES_LANG));
		chargeLangFrench(new BridgesLangGenerator());
		chargeLangFrench(new RoofsLangGenerator());*/
		
		
		
		
		/*
		ModsList.byg120(MAT_WOOD, Stem);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		BridgesTabBuild tab = new BridgesTabBuild();
		genCustom(new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD, "1.20"), Stem);
		recipeAndLoot(new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, "1.20"), Stem);
		MAT_WOOD.clear();
		ModsList.byg120(MAT_WOOD);
		English.BYG.byg120Lang(MAJ_WOOD);
		tab.builderToAddWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		tab.fabricWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		chargeLangEnglish(new BridgesLangGenerator());
		
		chargeCodeJavaForge(new FurnituresCodeGeneratorForge(), true, false);
		chargeCodeJavaFabric(new FurnituresCodeGeneratorFabric(), true, false);
		
		chargeLangFrench(new BridgesLangGenerator());*/
		/*French.Minecraft.mcWood(MAT_WOOD, MAJ_WOOD);
		French.Minecraft.mcRockFences(MAT_ROCK, MAJ_ROCK);
		chargeLangFrench(new FencesLangGenerator());*/
		//MAJ_MAT.clear();
		/*French.Minecraft.mcRock(MAT_ROCK, MAJ_MAT);
		BridgesLangGenerator lang = new BridgesLangGenerator();
		lang.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_MAT);*/
		//MAJ_MAT.clear();
		//French.BYG.byg120Lang(MAJ_MAT);
		//chargeLangFrench(new RoofsLangGenerator());
		
		/*MBTagsGenerator Bdata = new MBTagsGenerator();
		Bdata.TagsWood(LOCATION, CompatModid, MAT_WOOD);*/
		/*McwDataGen genRecipe = new McwDataGen("mcwbridges");
		genRecipe.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);*/
		//Fences BYG
		/*
		//McwAPI.FencesGenFolder(LOCATION);
		//ModsList.bygWildUp(MAT_WOOD, false);
		//genCustom(new McwFences());
		//chargebyIModFile(new McwFences(), true);
		//MFTagsGenerator gen = new MFTagsGenerator();
		//gen.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		//gen.FencesDataGen(LOCATION, CompatModid, MAT_WOOD);

		//MAT_WOOD.add("mushroom");
		//MAJ_MAT.add("Mushroom");
		/*ModsList.ModdingLegacyWoods(MAT_WOOD);
		ModsList.PremiumWoodPwood(MAT_WOOD);
		MBTabBuild.builderToAddWood(LOCATION, MAT_WOOD, ClassMod);*/
		//InitAllBridges.WardenAllWood(LOCATION, CompatModid, TextureLocationFormodid, ModidExtended, MAT_WOOD, MAJ_MAT, true);
		/*ModsList.bop1204(MAT_WOOD);
		ModsList.bop1204Lang(MAJ_MAT);
		
		InitAllMFurni.WardenAllWood(LOCATION, CompatModid, TextureLocationFormodid, ModidExtended, MAT_WOOD, MAJ_MAT, false);
		MRCodeGenerator.initAllRegistries(LOCATION, MAT_WOOD);
		MRCodeGenerator.initAllRenders(LOCATION, MAT_WOOD, ClassMod);*/
		/*txtLocMod = "betterlands:blocks";
		ModsList.betterlandsWoods(MAT_WOOD);
		ModsList.betterlandsRocks(MAT_ROCK, WALL, FLOOR);
		InitAllBridges.WardenAllWood(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_WOOD, MAJ_MAT, false);
		InitAllBridges.WardenAllRock(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_ROCK, WALL, FLOOR);
		MAT_WOOD.clear();
		
		txtLocMod="blue_skies:block/wood";
		MAT_WOOD.add("bsky_bluebright");
		MAT_WOOD.add("bsky_cherry");
		MAT_WOOD.add("bsky_crystallized");
		MAT_WOOD.add("bsky_dusk");
		MAT_WOOD.add("bsky_frostbright");
		MAT_WOOD.add("bsky_lunar");
		MAT_WOOD.add("bsky_maple");
		MAT_WOOD.add("bsky_starlit");

		for(String i : MAT_WOOD)
		{
			MBWarden.BridgeLog.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.RopeBridge.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairRope.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeRailWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.PierWood.createBlockstate(LOCATION, CompatModid, i);

			
			BridgesForClones.BridgeLog.createModelBlockCustom(LOCATION, i.substring(0, 5),txtLocMod, i.substring(5), i.substring(5)+"_planks", i.substring(5)+"_log_side");
			BridgesForClones.RopeBridge.createModelBlockCustom(LOCATION, i.substring(0, 5), txtLocMod, i.substring(5), i.substring(5)+"_planks", i.substring(5)+"_log_side");
			BridgesForClones.StairRope.createModelBlockCustom(LOCATION, i.substring(0, 5), txtLocMod, i.substring(5), i.substring(5)+"_planks", i.substring(5)+"_log_side");
			BridgesForClones.StairWood.createModelBlockCustom(LOCATION, i.substring(0, 5), txtLocMod, i.substring(5), i.substring(5)+"_planks", i.substring(5)+"_log_side");
			BridgesForClones.BridgeRailWood.createModelBlockCustom(LOCATION, i.substring(0, 5), txtLocMod, i.substring(5), "stripped_"+i.substring(5)+"_log_side", i.substring(5)+"_log_side");
			BridgesForClones.PierWood.createModelBlockCustom(LOCATION, i.substring(0, 5), txtLocMod, i.substring(5), i.substring(5)+"_planks", i.substring(5)+"_log_side");
		
			MBWarden.BridgeLog.createModelItem(LOCATION, CompatModid, i);
			MBWarden.RopeBridge.createModelItem(LOCATION, CompatModid, i);
			MBWarden.StairRope.createModelItem(LOCATION, CompatModid, i);
			MBWarden.StairWood.createModelItem(LOCATION, CompatModid, i);
			MBWarden.BridgeRailWood.createModelItem(LOCATION, CompatModid, i);
			MBWarden.PierWood.createModelItem(LOCATION, CompatModid, i);
		}*/
		
		//String txtLocMod = "";

		/*MAT_WOOD.add("pwood_magic");
		MAT_WOOD.add("pwood_maple");
		MAT_WOOD.add("pwood_purple_heart");
		MAT_WOOD.add("pwood_silverbell");
		MAT_WOOD.add("pwood_tiger");
		MAT_WOOD.add("pwood_willow");

		MBCodeGenerator.ItemBlockRenderTypes.initWood(LOCATION, MAT_WOOD, ClassBlockRegistry);*/
		//MBCodeGenerator.BlockRegistry.initWood(LOCATION, MAT_WOOD);

		/*for(String i : MAT_WOOD)
		{
			txtLocMod="premium_wood:block";
			MBWarden.BridgeLog.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.RopeBridge.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairRope.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeRailWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.PierWood.createBlockstate(LOCATION, CompatModid, i);

			
			BridgesForClones.BridgeLog.createModelBlockCustom(LOCATION, i.substring(0, 6),txtLocMod, i.substring(6), i.substring(6)+"_planks", i.substring(6)+"_log_side");
			BridgesForClones.RopeBridge.createModelBlockCustom(LOCATION, i.substring(0, 6), txtLocMod, i.substring(6), i.substring(6)+"_planks", i.substring(6)+"_log_side");
			BridgesForClones.StairRope.createModelBlockCustom(LOCATION, i.substring(0, 6), txtLocMod, i.substring(6), i.substring(6)+"_planks", i.substring(6)+"_log_side");
			BridgesForClones.StairWood.createModelBlockCustom(LOCATION, i.substring(0, 6), txtLocMod, i.substring(6), i.substring(6)+"_planks", i.substring(6)+"_log_side");
			BridgesForClones.BridgeRailWood.createModelBlockCustom(LOCATION, i.substring(0, 6), txtLocMod, i.substring(6), "stripped_"+i.substring(6)+"_log_side", i.substring(6)+"_log_side");
			BridgesForClones.PierWood.createModelBlockCustom(LOCATION, i.substring(0, 6), txtLocMod, i.substring(6), i.substring(6)+"_planks", i.substring(6)+"_log_side");
		
			MBWarden.BridgeLog.createModelItem(LOCATION, CompatModid, i);
			MBWarden.RopeBridge.createModelItem(LOCATION, CompatModid, i);
			MBWarden.StairRope.createModelItem(LOCATION, CompatModid, i);
			MBWarden.StairWood.createModelItem(LOCATION, CompatModid, i);
			MBWarden.BridgeRailWood.createModelItem(LOCATION, CompatModid, i);
			MBWarden.PierWood.createModelItem(LOCATION, CompatModid, i);
		}*/
		
		
		/* Aurora
		txtLocMod="bayou_blues:block";
		MAT_WOOD.add("cypress");
		InitAllBridges.WardenAllWood(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_WOOD, MAJ_MAT, false);
		
		MAT_WOOD.clear();
		txtLocMod="enhanced_mushrooms:block";
		MAT_WOOD.add("brown_mushroom");
		MAT_WOOD.add("red_mushroom");
		InitAllBridges.WardenAllWood(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_WOOD, MAJ_MAT, true);
		*/
		
		/*ModsList.shroomed(MAT_WOOD);
		txtLocMod = "shroomed:blocks";
		LocationFormodidPlus.clear();
		
		for(String i : MAT_WOOD)
		{
			if(i.equals("hard_mushroom"))
			{
				MBWarden.BridgeLog.createModelBlockCustom(LOCATION, txtLocMod, i, "shroomwood_planks", "hard_mushroom_stem");
				MBWarden.RopeBridge.createModelBlockCustom(LOCATION, txtLocMod, i, "shroomwood_planks", "hard_mushroom_stem");
				MBWarden.StairRope.createModelBlockCustom(LOCATION, txtLocMod, i, "shroomwood_planks", "hard_mushroom_stem");
				MBWarden.StairWood.createModelBlockCustom(LOCATION, txtLocMod, i, "shroomwood_planks", "hard_mushroom_stem");
				MBWarden.BridgeRailWood.createModelBlockCustom(LOCATION, txtLocMod, i, "shroomwood_planks", "hard_mushroom_stem");
				MBWarden.PierWood.createModelBlockCustom(LOCATION, txtLocMod, i, "shroomwood_planks", "hard_mushroom_stem");
			}
			else if(i.equals("blue_hard_mushroom")) 
			{
				MBWarden.BridgeLog.createModelBlockCustom(LOCATION, txtLocMod, i, "blue_shroomwood_planks", "blue_hard_mushroom_stem");
				MBWarden.RopeBridge.createModelBlockCustom(LOCATION, txtLocMod, i, "blue_shroomwood_planks", "blue_hard_mushroom_stem");
				MBWarden.StairRope.createModelBlockCustom(LOCATION, txtLocMod, i, "blue_shroomwood_planks", "blue_hard_mushroom_stem");
				MBWarden.StairWood.createModelBlockCustom(LOCATION, txtLocMod, i, "blue_shroomwood_planks", "blue_hard_mushroom_stem");
				MBWarden.BridgeRailWood.createModelBlockCustom(LOCATION, txtLocMod, i, "blue_shroomwood_planks", "blue_hard_mushroom_stem");
				MBWarden.PierWood.createModelBlockCustom(LOCATION, txtLocMod, i, "blue_shroomwood_planks", "blue_hard_mushroom_stem");
			}
			else if(i.equals("orange_hard_mushroom")) 
			{
				MBWarden.BridgeLog.createModelBlockCustom(LOCATION, txtLocMod, i, "orange_shroomwood_planks", "orange_hard_mushroom_stem");
				MBWarden.RopeBridge.createModelBlockCustom(LOCATION, txtLocMod, i, "orange_shroomwood_planks", "orange_hard_mushroom_stem");
				MBWarden.StairRope.createModelBlockCustom(LOCATION, txtLocMod, i, "orange_shroomwood_planks", "orange_hard_mushroom_stem");
				MBWarden.StairWood.createModelBlockCustom(LOCATION, txtLocMod, i, "orange_shroomwood_planks", "orange_hard_mushroom_stem");
				MBWarden.BridgeRailWood.createModelBlockCustom(LOCATION, txtLocMod, i, "orange_shroomwood_planks", "orange_hard_mushroom_stem");
				MBWarden.PierWood.createModelBlockCustom(LOCATION, txtLocMod, i, "orange_shroomwood_planks", "orange_hard_mushroom_stem");
			}
			else if(i.equals("purple_hard_mushroom")) 
			{
				MBWarden.BridgeLog.createModelBlockCustom(LOCATION, txtLocMod, i, "purple_shroomwood_planks", "purple_hard_mushroom_stem");
				MBWarden.RopeBridge.createModelBlockCustom(LOCATION, txtLocMod, i, "purple_shroomwood_planks", "purple_hard_mushroom_stem");
				MBWarden.StairRope.createModelBlockCustom(LOCATION, txtLocMod, i, "purple_shroomwood_planks", "purple_hard_mushroom_stem");
				MBWarden.StairWood.createModelBlockCustom(LOCATION, txtLocMod, i, "purple_shroomwood_planks", "purple_hard_mushroom_stem");
				MBWarden.BridgeRailWood.createModelBlockCustom(LOCATION, txtLocMod, i, "purple_shroomwood_planks", "purple_hard_mushroom_stem");
				MBWarden.PierWood.createModelBlockCustom(LOCATION, txtLocMod, i, "purple_shroomwood_planks", "purple_hard_mushroom_stem");
			}
			else
			{
				System.out.println("Errored it's no Shroomed Mat");
			}
		}
		//InitAllBridges.WardenAllWood(LOCATION, CompatModid, TextureLocationFormodid, ModidExtended, MAT_WOOD, MAJ_MAT, false);
		//InitAllBridges.WardenAllRock(LOCATION, CompatModid, TextureLocationFormodid, ModidExtended, MAT_ROCK, WALL, FLOOR);
		/*
		MBCodeGenerator.init(LOCATION);
		MBCodeGenerator.InitAllCodeBlock(LOCATION, MAT_WOOD);
		MBCodeGenerator.InitAllItemBlockRenderTypes(LOCATION, MAT_WOOD, ClassMod);*/

		//MBLangGenerator.WoodBridges(LOCATION, CompatModid, MAT_WOOD, MAJ_MAT);
		//InitAllBridges.CustomWardenAllWood(LOCATION, CompatModid, TextureLocationFormodid, LocationFormodidPlus, ModidExtended, MAT_WOOD, true, "planks", "log", "stripped_log");

		//MBTagGenerator.AxeDataGen(LOCATION, CompatModid, MAT_WOOD);
		//MBCodeGenFabric.init(LOCATION, CompatModid, MAT_WOOD, ClassMod);
		//MRCodeGenFabric.init(LOCATION, MAT_WOOD, ClassMod);
	}
	
	public static void preset(Presetting preset)
	{
		preset.init(LOCATION);
	}
	
	/*public static void tabBuildForge(IModFiles.IProgram.TabBuild tab, boolean stone)
	{
		tab.builderToAddWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		if(stone) {
			tab.builderToAddStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		}
	}
	
	public static void tabBuildFabric(IModFiles.IProgram.TabBuild tab, boolean stone)
	{
		tab.fabricWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		if(stone) {
			tab.fabricStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		}
	}
	
	public static void tagWood(IModFiles.ITagData t)
	{
		t.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		t.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		t.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
	}
	
	public static void tagStone(IModFiles.ITagData t)
	{
		t.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		t.TagsRock(LOCATION, CompatModid, MAT_ROCK);
	}
	
	public static void recipeAndLootWood(IModFiles.IData f, boolean isStem)
	{
		f.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		f.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		f.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}
	
	public static void recipeAndLootWoodCharged(McwDataGen f, boolean isStem, String ModidCharged)
	{
		f.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		f.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, ModidCharged);
		f.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}

	
	public static void recipeAndLootStone(IModFiles.IData f)
	{
		f.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		f.RecipesStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		f.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
	}

	public static void recipeAndLootWood(IModFiles.IData f)
	{
		recipeAndLootWood(f, false);
	}
	
	public static void genCustom(McwModsRessources client)
	{
		client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "log", "stripped_log");
	}
	
	public static void genCustom(McwModsRessources client, boolean isStem)
	{
		client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", isStem ? "stem" : "log", isStem ? "stripped_stem" : "stripped_log");
	}

	public static void genClientWood(IModFiles.IClient f, boolean isStem)
	{
		f.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		f.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, isStem);
		f.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
	}
	
	public static void genClientStone(IModFiles.IClient f)
	{
		f.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		f.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, MAT_ROCK, WALL, FLOOR);
		f.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
	}
	
	public static void chargeLangEnglish(IModFiles.ILang f)
	{
		f.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		f.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
	}
	
	public static void chargeLangFrench(IModFiles.ILang f)
	{
		f.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		f.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
	}
	
	public static void chargeCodeJavaForge(IModFiles.IProgram.JavaForge forge, boolean supNetherUpdate, boolean TrailsandTales, boolean stone)
	{
		forge.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		forge.registerBlockLog(LOCATION, MAT_WOOD, supNetherUpdate, TrailsandTales);
		if(stone) {
			forge.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
			forge.registerBlockStone(LOCATION, MAT_ROCK, supNetherUpdate, TrailsandTales);
		}
	}
	
	public static void chargeCodeJavaFabric(IModFiles.IProgram.JavaFabric fabric, boolean supNetherUpdate, boolean TrailsandTales, boolean stone)
	{
		fabric.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		fabric.registerBlockLog(LOCATION, MAT_WOOD, supNetherUpdate, TrailsandTales);
		if(stone) {
			fabric.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
			fabric.registerBlockStone(LOCATION, MAT_ROCK, supNetherUpdate, TrailsandTales);
		}
	}*/
}