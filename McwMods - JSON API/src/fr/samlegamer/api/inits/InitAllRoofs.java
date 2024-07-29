package fr.samlegamer.api.inits;

import java.util.List;
import fr.samlegamer.api.clientgen.roofs.MacawsRoofs;
import fr.samlegamer.api.datagen.roofs.MRRecipesGenerator;

@Deprecated
public class InitAllRoofs
{
	public static void init(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, List<String> MATERIAL, List<String> MAJ_MAT, boolean isStem)
	{
		MRRecipesGenerator.init(LOCATION);
		MacawsRoofs.init(LOCATION);
		
		for(String i : MATERIAL)
		{
			MacawsRoofs.Log_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);
			
			MacawsRoofs.Planks_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperLog_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperLog_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperLog_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperLog_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperLog_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperPlanks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperPlanks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperPlanks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperPlanks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperPlanks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			
			MRRecipesGenerator.AtticLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.AtticLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);
			
			MRRecipesGenerator.AtticPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.AtticPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.LowerLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.LowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.LowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.LowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.RoofLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.RoofLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.RoofPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.RoofPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.SteepLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.SteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.SteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.SteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.TopLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.TopLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.TopPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.TopPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.UpperLowerLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperLowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.UpperLowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperLowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.UpperSteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperSteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.UpperSteepLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperSteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);
		}
	}

	public static void initWithCustom(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, List<String> MATERIAL, boolean isStem)
	{
		/*
		 MATERIAL.add("aspen");
		MATERIAL.add("baobab");
		MATERIAL.add("blue_enchanted");
		MATERIAL.add("cherry");
		MATERIAL.add("cika");
		MATERIAL.add("cypress");
		MATERIAL.add("ebony");
		MATERIAL.add("ether");
		MATERIAL.add("fir");
		MATERIAL.add("green_enchanted");
		MATERIAL.add("holly");
		MATERIAL.add("jacaranda");
		MATERIAL.add("lament");
		MATERIAL.add("mahogany");
		MATERIAL.add("white_mangrove");
		MATERIAL.add("maple");
		MATERIAL.add("nightshade");
		MATERIAL.add("palm");
		MATERIAL.add("pine");
		MATERIAL.add("rainbow_eucalyptus");
		MATERIAL.add("redwood");
		MATERIAL.add("skyris");
		MATERIAL.add("willow");
		MATERIAL.add("witch_hazel");
		MATERIAL.add("zelkova");
		MATERIAL.add("bulbis");
		MATERIAL.add("imparius");
		MATERIAL.add("sythian");

		MRTagGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
		MRRecipesGenerator.init(LOCATION);
		MacawsRoofs.init(LOCATION);

		for(String i : MATERIAL)
		{
			MacawsRoofs.Log_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);
			
			MacawsRoofs.Planks_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperLog_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperLog_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperLog_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperLog_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperPlanks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperPlanks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperPlanks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperPlanks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			
			MRCustom.Log_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Log_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Log_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Log_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Log_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Planks_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Planks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Planks_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Planks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.Planks_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.UpperLog_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");
			MRCustom.UpperPlanks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid + "/"+i+"", i, "planks", "log");

			
			MRRecipesGenerator.AtticLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.AtticLog.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			
			MRRecipesGenerator.AtticPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.AtticPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.LowerLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.LowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, true);

			MRRecipesGenerator.LowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.LowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, true);

			MRRecipesGenerator.RoofLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.RoofLog.recipe(LOCATION, ModidExtended, CompatModid, i, true);

			MRRecipesGenerator.RoofPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.RoofPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, true);

			MRRecipesGenerator.SteepLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.SteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, true);

			MRRecipesGenerator.SteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.SteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.TopLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.TopLog.recipe(LOCATION, ModidExtended, CompatModid, i, true);

			MRRecipesGenerator.TopPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.TopPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.UpperLowerLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperLowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, true);

			MRRecipesGenerator.UpperLowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperLowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.UpperSteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperSteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, true);

			MRRecipesGenerator.UpperSteepLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperSteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, true);
		}
		 */
	}
}