package fr.samlegamer;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.utils.*;
import fr.samlegamer.utils.preset.*;

public class McwMain
{
	public static final String LOCATION = System.getProperty("user.dir")+File.separator+"genRessourcesMcw"+File.separator;// Local Path
	public static final String RP = System.getProperty("user.dir")+File.separator+"ressourcepack"+File.separator;// Local Path

	public static void main(String[] args)
	{
        preset(new Sajevius());
		//renameFoldersData();
	}

	private static void renameFoldersData()
	{
		rename("data/recipes/", "data/recipe/");
		rename("data/loot_tables/", "data/loot_table/");
		rename("data/advancements/", "data/advancement/");

		for(String folder : Reference.allMcwMods())
		{
			rename("data/tagsNewGen/"+folder+"/tags/blocks/", "data/tagsNewGen/"+folder+"/tags/block/");
		}

		rename("data/tagsNewGen/minecraft/tags/blocks/", "data/tagsNewGen/minecraft/tags/block/");
		rename("data/tagsNewGen/minecraft/tags/items/", "data/tagsNewGen/minecraft/tags/item/");

	}

	private static void rename(String oldDataFolder, String newDataFolder)
	{
		Path file = Paths.get(LOCATION + oldDataFolder);
		Path fileNew = Paths.get(LOCATION + newDataFolder);
		try {
			Files.move(file, fileNew);
		}
		catch (Exception e) {
			System.out.println("Renaming failed: " + e.getMessage());
		}
	}
	
	public static void preset(Presetting preset)
	{
		preset.init(LOCATION);
	}
}