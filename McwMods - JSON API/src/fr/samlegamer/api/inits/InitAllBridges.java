package fr.samlegamer.api.inits;

import java.util.List;

import fr.samlegamer.api.clientgen.bridges.MBWarden;
import fr.samlegamer.api.datagen.bridges.MBRecipesGenerator;

@Deprecated
public class InitAllBridges
{
	public static void WardenAllWood(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, List<String> MATERIAL, List<String> MAJ_MAT, boolean isStem)
	{
		MBWarden.init(LOCATION);
		MBRecipesGenerator.init(LOCATION);
		
		for(String i : MATERIAL)
		{
			MBWarden.BridgeLog.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeLog.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.BridgeLog.createModelItem(LOCATION, CompatModid, i);

			MBWarden.BridgeRailWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeRailWood.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.BridgeRailWood.createModelItem(LOCATION, CompatModid, i);
			
			MBWarden.PierWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.PierWood.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.PierWood.createModelItem(LOCATION, CompatModid, i);
			
			MBWarden.RopeBridge.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.RopeBridge.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.RopeBridge.createModelItem(LOCATION, CompatModid, i);

			MBWarden.StairWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairWood.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.StairWood.createModelItem(LOCATION, CompatModid, i);

			MBWarden.StairRope.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairRope.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.StairRope.createModelItem(LOCATION, CompatModid, i);
			
			MBRecipesGenerator.BridgeLog.loot_tablesGen(LOCATION, CompatModid, i);
			MBRecipesGenerator.BridgeLog.recipeGen(LOCATION, ModidExtended, CompatModid, i);

			MBRecipesGenerator.Rails.loot_tablesGen(LOCATION, CompatModid, i);
			MBRecipesGenerator.Rails.recipeGen(LOCATION, ModidExtended, CompatModid, i);

			MBRecipesGenerator.Pier.loot_tablesGen(LOCATION, CompatModid, i);
			MBRecipesGenerator.Pier.recipeGenWood(LOCATION, ModidExtended, CompatModid, i, false, isStem);

			MBRecipesGenerator.RopeBridge.loot_tablesGen(LOCATION, CompatModid, i);
			MBRecipesGenerator.RopeBridge.recipeGen(LOCATION, ModidExtended, CompatModid, i);

			MBRecipesGenerator.RopeStairs.loot_tablesGen(LOCATION, CompatModid, i);
			MBRecipesGenerator.RopeStairs.recipeGen(LOCATION, CompatModid, i);

			MBRecipesGenerator.Stairs.loot_tablesGen(LOCATION, CompatModid, i, false);
			MBRecipesGenerator.Stairs.recipeGenWood(LOCATION, CompatModid, i, false);
		}
		
		
			/*MBWarden.BridgeLog.createModelBlockCustom(LOCATION, TextureLocationFormodid, i, i+"_planks", i+"_stem");
			MBWarden.StairRope.createModelBlockCustom(LOCATION, TextureLocationFormodid, i, i+"_planks", i+"_stem");
			MBWarden.StairWood.createModelBlockCustom(LOCATION, TextureLocationFormodid, i, i+"_planks", i+"_stem");
			MBWarden.BridgeRailWood.createModelBlockCustom(LOCATION, TextureLocationFormodid, i, "stripped_"+i+"_stem", i+"_stem");
			MBWarden.PierWood.createModelBlockCustom(LOCATION, TextureLocationFormodid, i, i+"_planks", i+"_stem", "stripped_"+i+"_stem");
			
			MBWarden.BridgeRailWood.createModelItem(LOCATION, CompatModid, i);
			MBWarden.BridgeLog.createModelItem(LOCATION, CompatModid, i);*/

			/*MBWarden.BridgeStone.createBlockstate(LOCATION, CompatModid, MAT_ROCK.get(numb));
			MBWarden.BridgeStone.createModelBlock(LOCATION, TextureLocationFormodid, MAT_ROCK.get(numb), WALL.get(numb), FLOOR.get(numb));
			MBWarden.BridgeStone.createModelItem(LOCATION, CompatModid, MAT_ROCK.get(numb));
			MBWarden.StairStone.createBlockstate(LOCATION, CompatModid, MAT_ROCK.get(numb));
			MBWarden.StairStone.createModelBlock(LOCATION, TextureLocationFormodid, MAT_ROCK.get(numb), WALL.get(numb), FLOOR.get(numb));
			MBWarden.StairStone.createModelItem(LOCATION, CompatModid, MAT_ROCK.get(numb));
			MBWarden.PierStone.createBlockstate(LOCATION, CompatModid, MAT_ROCK.get(numb));
			MBWarden.PierStone.createModelBlock(LOCATION, TextureLocationFormodid, MAT_ROCK.get(numb), WALL.get(numb));
			MBWarden.PierStone.createModelItem(LOCATION, CompatModid, MAT_ROCK.get(numb));*/

			/*
			MBWarden.BridgeLog.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.RopeBridge.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairRope.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeRailWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.PierWood.createBlockstate(LOCATION, CompatModid, i);
		    	
			MBWarden.BridgeStone.createBlockstate(LOCATION, CompatModid, MAT_ROCK.get(numb));
			MBWarden.BridgeStone.createModelBlock(LOCATION, TextureLocationFormodid, MAT_ROCK.get(numb), WALL.get(numb), FLOOR.get(numb));
			MBWarden.StairStone.createBlockstate(LOCATION, CompatModid, MAT_ROCK.get(numb));
			MBWarden.StairStone.createModelBlock(LOCATION, TextureLocationFormodid, MAT_ROCK.get(numb), WALL.get(numb), FLOOR.get(numb));
			MBWarden.PierStone.createBlockstate(LOCATION, CompatModid, MAT_ROCK.get(numb));
			MBWarden.PierStone.createModelBlock(LOCATION, TextureLocationFormodid, MAT_ROCK.get(numb), WALL.get(numb));
			
			MBWarden.BridgeLog.createModelBlockCustom(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MBWarden.StairRope.createModelBlockCustom(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MBWarden.StairWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MBWarden.BridgeRailWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + "/"+i+"", i, "stripped_log", "log");
			MBWarden.PierWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log", "stripped_log");
			
			MBWarden.BridgeRailWood.createModelItem(LOCATION, CompatModid, i);
			MBWarden.BridgeLog.createModelItem(LOCATION, CompatModid, i);*/
			//MBWarden.BridgeStone.createModelItem(LOCATION, CompatModid, MAT_ROCK.get(numb));
			//numb++;
	}
	
	public static void CustomWardenAllWood(String LOCATION, String CompatModid, String TextureLocationFormodid, List<String> LocationFormodidPlus, String ModidExtended, List<String> MATERIAL,
	boolean isStem, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesLogsStripped)
	{
		for(int i = 0;i<=MATERIAL.size()-1;i++)
		{
			MBWarden.BridgeLog.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.BridgeLog.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));

			MBWarden.BridgeRailWood.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.BridgeRailWood.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			
			MBWarden.PierWood.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.PierWood.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			
			MBWarden.RopeBridge.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.RopeBridge.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));

			MBWarden.StairWood.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.StairWood.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));

			MBWarden.StairRope.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.StairRope.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			
			MBRecipesGenerator.BridgeLog.loot_tablesGen(LOCATION, CompatModid, MATERIAL.get(i));
			MBRecipesGenerator.BridgeLog.recipeGen(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i));

			MBRecipesGenerator.Rails.loot_tablesGen(LOCATION, CompatModid, MATERIAL.get(i));
			MBRecipesGenerator.Rails.recipeGen(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i));

			MBRecipesGenerator.Pier.loot_tablesGen(LOCATION, CompatModid, MATERIAL.get(i));
			MBRecipesGenerator.Pier.recipeGenWood(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i), false, isStem);

			MBRecipesGenerator.RopeBridge.loot_tablesGen(LOCATION, CompatModid, MATERIAL.get(i));
			MBRecipesGenerator.RopeBridge.recipeGen(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i));

			MBRecipesGenerator.RopeStairs.loot_tablesGen(LOCATION, CompatModid, MATERIAL.get(i));
			MBRecipesGenerator.RopeStairs.recipeGen(LOCATION, CompatModid, MATERIAL.get(i));

			MBRecipesGenerator.Stairs.loot_tablesGen(LOCATION, CompatModid, MATERIAL.get(i), false);
			MBRecipesGenerator.Stairs.recipeGenWood(LOCATION, CompatModid, MATERIAL.get(i), false);
			
			MBWarden.BridgeLog.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus.get(i), MATERIAL.get(i), nameOfTexturesPlanks, nameOfTexturesLogs);
			MBWarden.RopeBridge.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus.get(i), MATERIAL.get(i), nameOfTexturesPlanks, nameOfTexturesLogs);
			MBWarden.StairRope.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus.get(i), MATERIAL.get(i), nameOfTexturesPlanks, nameOfTexturesLogs);
			MBWarden.StairWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus.get(i), MATERIAL.get(i), nameOfTexturesPlanks, nameOfTexturesLogs);
			MBWarden.BridgeRailWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus.get(i), MATERIAL.get(i), nameOfTexturesLogsStripped, nameOfTexturesLogs);
			MBWarden.PierWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus.get(i), MATERIAL.get(i), nameOfTexturesPlanks, nameOfTexturesLogs);
		}
	}
	
	//Just Blockstates and Models
	/*
	 * Please update for Recipes/Loots Tables and Langs File
	 */
	public static void WardenAllRock(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, List<String> MATERIAL, List<String> WALL, List<String> FLOOR)
	{
		int cpt = 0;
		for(int i = 0;i<=MATERIAL.size()-1;i++)
		{
			MBWarden.BridgeStone.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.PierStone.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.StairStone.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			
			MBWarden.BridgeStone.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), WALL.get(i), FLOOR.get(i));
			MBWarden.PierStone.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), WALL.get(i));
			MBWarden.StairStone.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), WALL.get(i), FLOOR.get(i));
			
			MBWarden.BridgeStone.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.PierStone.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			MBWarden.StairStone.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			cpt=cpt+15;
		}
		System.out.println();
		System.out.println();
		System.out.println("Number of File Generated is " + cpt);
	}
}