package fr.samlegamer.utils;

public class Temp {}

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

		CustomMFurni.InitFolders(LOCATION);
		MFurniRecipesGenerator.init(LOCATION);
		//MFurniLangGenerator.initAllEnglish(CompatModid, MATERIAL, MAJ_MAT);
		//MBCodeGenerator.init(LOCATION);
		//MFurniCodeGenerator.BlockRegistry(LOCATION, CompatModid, MATERIAL);
		//MFurniCodeGenerator.RenderRegistry(LOCATION, CompatModid, MATERIAL);
		//MFurniTagsGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
		
		for(String i : MATERIAL)
		{
			McwFurnitures.Chair.createBlockstate(LOCATION, CompatModid, i, "1.19.2");
			McwFurnitures.Modern_Chair.createBlockstate(LOCATION, CompatModid, i, "1.19.2");
			McwFurnitures.Striped_Chair.createBlockstate(LOCATION, CompatModid, i, "1.19.2");

			McwFurnitures.Chair.createModelItem(LOCATION, CompatModid, i, "1.19.2");
			McwFurnitures.Modern_Chair.createModelItem(LOCATION, CompatModid, i, "1.19.2");
			McwFurnitures.Striped_Chair.createModelItem(LOCATION, CompatModid, i, "1.19.2");
			
			McwFurnitures.ModelsGen.chair(LOCATION, TextureLocationFormodid, i, false);
			McwFurnitures.ModelsGen.counter(LOCATION, TextureLocationFormodid, i, false);
			McwFurnitures.ModelsGen.desk(LOCATION, TextureLocationFormodid, i, false);
			McwFurnitures.ModelsGen.drawer(LOCATION, TextureLocationFormodid, i, false);
			McwFurnitures.ModelsGen.gui(LOCATION, TextureLocationFormodid, i, false);
			McwFurnitures.ModelsGen.table(LOCATION, TextureLocationFormodid, i, false);
			McwFurnitures.ModelsGen.wardrobe(LOCATION, TextureLocationFormodid, i, false);
			
			CustomMFurni.ModelsGen.chair(LOCATION, TextureLocationFormodid + "/"+i+"", i, i + "_planks", i + "_log");
			CustomMFurni.ModelsGen.counter(LOCATION, TextureLocationFormodid + "/"+i+"", i, i + "_planks", i + "_log");
			CustomMFurni.ModelsGen.desk(LOCATION, TextureLocationFormodid + "/"+i+"", i, i + "_planks", i + "_log");
			CustomMFurni.ModelsGen.drawer(LOCATION, TextureLocationFormodid + "/"+i+"", i, i + "_planks", i + "_log");
			CustomMFurni.ModelsGen.gui(LOCATION, TextureLocationFormodid + "/"+i+"", i, i + "_planks", i + "_log");
			CustomMFurni.ModelsGen.table(LOCATION, TextureLocationFormodid + "/"+i+"", i, i + "_planks", i + "_log");
			CustomMFurni.ModelsGen.wardrobe(LOCATION, TextureLocationFormodid + "/"+i+"", i, i + "_planks", i + "_log");
			
			McwFurnitures.Bookshelf.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Bookshelf.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Glass_Table.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Glass_Table.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Bookshelf_Cupboard.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Bookshelf_Cupboard.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Bookshelf_Drawer.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Bookshelf_Drawer.createModelItem(LOCATION, CompatModid, i);

			//McwFurnitures.Chair.createBlockstate(LOCATION, CompatModid, i, "1.16.5");
			//McwFurnitures.Chair.createModelItem(LOCATION, CompatModid, i, "1.16.5");

			McwFurnitures.Coffee_Table.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Coffee_Table.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Counter.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Counter.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Covered_Desk.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Covered_Desk.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Cupboard_Counter.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Cupboard_Counter.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Desk.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Desk.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Double_Drawer.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Double_Drawer.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Double_Drawer_Counter.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Double_Drawer_Counter.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Double_Wardrobe.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Double_Wardrobe.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Drawer.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Drawer.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Drawer_Counter.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Drawer_Counter.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.End_Table.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.End_Table.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Large_Drawer.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Large_Drawer.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Lower_Bookshelf_Drawer.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Lower_Bookshelf_Drawer.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Lower_Triple_Drawer.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Lower_Triple_Drawer.createModelItem(LOCATION, CompatModid, i);

			//McwFurnitures.Modern_Chair.createBlockstate(LOCATION, CompatModid, i, "1.16.5");
			//McwFurnitures.Modern_Chair.createModelItem(LOCATION, CompatModid, i, "1.16.5");

			McwFurnitures.Modern_Desk.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Modern_Desk.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Modern_Wardrobe.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Modern_Wardrobe.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Stool_Chair.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Stool_Chair.createModelItem(LOCATION, CompatModid, i);

			//McwFurnitures.Striped_Chair.createBlockstate(LOCATION, CompatModid, i, "1.16.5");
			//McwFurnitures.Striped_Chair.createModelItem(LOCATION, CompatModid, i, "1.16.5");

			McwFurnitures.Table.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Table.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Triple_Drawer.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Triple_Drawer.createModelItem(LOCATION, CompatModid, i);

			McwFurnitures.Wardrobe.createBlockstate(LOCATION, CompatModid, i);
			McwFurnitures.Wardrobe.createModelItem(LOCATION, CompatModid, i);
			

			MFurniRecipesGenerator.Bookshelf.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Bookshelf_Cupboard.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Bookshelf_Drawer.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Chair.loot_tables(LOCATION, CompatModid, i, false);
			MFurniRecipesGenerator.Coffee_Table.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Counter.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Covered_Desk.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Cupboard_Counter.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Desk.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Double_Drawer.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Double_Drawer_Counter.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Double_Wardrobe.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Drawer.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.End_Table.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Glass_Table.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Large_Drawer.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Lower_Bookshelf_Drawer.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Lower_Triple_Drawer.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Modern_Chair.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Modern_Desk.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Modern_Wardrobe.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Stool_Chair.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Striped_Chair.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Table.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Triple_Drawer.loot_tables(LOCATION, CompatModid, i);
			MFurniRecipesGenerator.Wardrobe.loot_tables(LOCATION, CompatModid, i);

			MFurniRecipesGenerator.Bookshelf.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Bookshelf_Cupboard.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Bookshelf_Drawer.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Coffee_Table.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Counter.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Covered_Desk.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Cupboard_Counter.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Desk.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Double_Drawer.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Double_Drawer_Counter.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Double_Wardrobe.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Drawer.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.End_Table.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Glass_Table.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Large_Drawer.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Lower_Bookshelf_Drawer.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Lower_Triple_Drawer.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Modern_Chair.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Modern_Desk.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Modern_Wardrobe.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Stool_Chair.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Striped_Chair.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Table.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Triple_Drawer.recipe(LOCATION, ModidExtended, CompatModid, i, true);
			MFurniRecipesGenerator.Wardrobe.recipe(LOCATION, ModidExtended, CompatModid, i, true);
		}
*/