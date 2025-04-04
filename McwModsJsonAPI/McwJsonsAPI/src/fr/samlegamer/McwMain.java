package fr.samlegamer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.preset.*;

public class McwMain
{	
	public static final List<String> WALL = new ArrayList<>();	// !ONLY FOR STONE! this is wall texture in the bridge
	public static final List<String> FLOOR = new ArrayList<>();	// !ONLY FOR STONE! this is floor texture in the bridge
	public static final List<String> MAT_WOOD = new ArrayList<>();
	public static final List<String> MAT_ROCK = new ArrayList<>();
	public static final List<String> MAJ_WOOD = new ArrayList<>();
	public static final List<String> MAJ_ROCK = new ArrayList<>();
	public static final List<String> LEAVES = new ArrayList<>();
	public static final List<String> LEAVES_LANG = new ArrayList<>();

	public static final String LOCATION = System.getProperty("user.dir")+File.separator+"genRessourcesMcw"+File.separator;// Local Path
	public static final String RP = System.getProperty("user.dir")+File.separator+"ressourcepack"+File.separator;// Local Path
	
	public static void main(String[] args)
	{
		preset(new BYGWarden(ModLoaders.FORGE));
	}
	
	public static void preset(Presetting preset)
	{
		preset.init(LOCATION);
	}
}