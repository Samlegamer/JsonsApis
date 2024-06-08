package fr.samlegamer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.api.clientgen.bridges.BridgesForClones;
import fr.samlegamer.api.clientgen.bridges.MBWarden;
import fr.samlegamer.api.code.MBTabBuild;
import fr.samlegamer.api.datagen.bridges.MBCodeGenerator;
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
			//+ "C://Users/samue/OneDrive/Documents/test json api/";  //Path
	
	public static final String CompatModid = "mcwbridgesmoddinglegacy"; //The modid of compat, Please no insert ":"
	public static final String TextureLocationFormodid = "enhanced_mushrooms:block"; //modid:block for textures location (ex : assets/quark/textures/block = quark:block)
	public static final String ModidExtended = "enhanced_mushrooms"; //For recipes (ex: bop:cherry_log)
	public static final String ClassMod = "MBMLBlocksRegistry"; // Blocks Class Registries (ex : IafBlockRegistry)
	
	public static void main(String[] args)
	{
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

		MAT_WOOD.add("pwood_magic");
		MAT_WOOD.add("pwood_maple");
		MAT_WOOD.add("pwood_purple_heart");
		MAT_WOOD.add("pwood_silverbell");
		MAT_WOOD.add("pwood_tiger");
		MAT_WOOD.add("pwood_willow");

		MBCodeGenerator.ItemBlockRenderTypes.initWood(LOCATION, MAT_WOOD, ClassMod);
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
}