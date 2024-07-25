package fr.samlegamer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.code.MRTabBuild;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.IModFiles;
import fr.samlegamer.utils.ModsList;

public class Main
{	
	public static final List<String> WALL = new ArrayList<String>();	// !ONLY FOR STONE! this is wall texture in the bridge
	public static final List<String> FLOOR = new ArrayList<String>();	// !ONLY FOR STONE! this is floor texture in the bridge
	public static final List<String> MAT_WOOD = new ArrayList<String>();
	public static final List<String> MAT_ROCK = new ArrayList<String>();
	public static final List<String> MAJ_MAT = new ArrayList<String>();
	public static final List<String> LocationFormodidPlus = new ArrayList<String>();

	public static final String LOCATION = System.getProperty("user.dir")+File.separator+"genRessourcesMcw"+File.separator;// Local Path
	
	public static final String CompatModid = Compatibilities.BYG_ROOFS_MODID; //The modid of compat, Please no insert ":"
	public static final String TextureLocationFormodid = Compatibilities.BYG_TEXTURES; //modid:block for textures location (ex : assets/quark/textures/block = quark:block)
	public static final String ModidOfBaseMod = ""; //For recipes (ex: bop:cherry_log)
	public static final String ClassBlockRegistry = "MRBYGBlocksRegistry"; // Blocks Class Registries (ex : IafBlockRegistry)
		
	public static void main(String[] args)
	{
		ModsList.bygWildUp(MAT_WOOD);
		//chargeLang(new MRLangGenerator());
		McwAPI.RoofsGenFolder(LOCATION);
		//McwAPI.DataGenFolder(LOCATION);
		//chargebyIModFile(new McwModsRessources("mcwroofs", ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), false);
		//MRTabBuild.fabricWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		genCustom(new McwModsRessources("mcwroofs", ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD));
		//recipeAndLoot(new McwDataGen("mcwroofs", "1.21"));
		//tag(new MRTagGenerator());
		//McwAPI.DataGenFolder(LOCATION);
		/*
		MBTagsGenerator Bdata = new MBTagsGenerator();
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

		/* Test */
		/*McwAPI.DataGenFolder(LOCATION);
		
		//McwFencesRecipeOld1204 fences = new McwFencesRecipeOld1204();
		//fences.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, "cherry", false);
		ModsList.bop1204(MAT_WOOD);
		MFTagsGenerator gen = new MFTagsGenerator();
		gen.FencesDataGen(LOCATION, CompatModid, MAT_WOOD);
		//chargebyIModFile(new McwFences());
		//chargebyIModFileData(new McwFencesData("1.21"));
		//MacawsFences.InitFolders(LOCATION);
		
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
	
	private static void tag(IModFiles.ITagData t)
	{
		t.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
	}
	
	public static void recipeAndLoot(IModFiles.IData f)
	{
		f.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		f.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}
	
	private static void genCustom(McwModsRessources client)
	{
		client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client.createModelItem(LOCATION, CompatModid, MAT_WOOD);
		client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "log", "stripped_log");
	}

	/*
	 * Create a blockstates and models block/item
	 */
	public static void chargebyIModFile(IModFiles.IClient f, boolean isStem)
	{
		f.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		f.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, isStem);
		f.createModelItem(LOCATION, CompatModid, MAT_WOOD);
	}
	
	/*
	 * Create a lang File (en_us)
	 */
	public static void chargeLang(IModFiles.ILang f)
	{
		f.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_MAT);
	}
}