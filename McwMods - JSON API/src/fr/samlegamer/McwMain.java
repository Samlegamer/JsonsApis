package fr.samlegamer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.utils.JsonsUtils;
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
	
	public static void main(String[] args)
	{
		//JsonsUtils.PreReplacedRecipe1213(LOCATION + ClassicFolderTypes.RECIPE.getPath());
		/*ModsList.BlueSkiesBsky1201(MAT_WOOD);
		ModsList.PremiumWoodPwood(MAT_WOOD);
		fixForPaleGarden("mcwmoddinglegacy", MAT_WOOD);*/
		preset(new BOP(true, "1.21.3", ModLoaders.NEOFORGE));
	}
	
	public static void fixForPaleGarden(String CompatModid, List<String> MAT_WOOD)
	{
		McwAPI.registerFolder(McwMain.LOCATION, ClassicFolderTypes.ITEMS.getPath());
		
		JsonsUtils.adder1214(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath(), ".json", "\"model\" : {\r\n"
				+ "    \"type\" : \"minecraft:model\",", "}");
		JsonsUtils.Doors1214(LOCATION, CompatModid, MAT_WOOD);
	}
	
	public static void preset(Presetting preset)
	{
		preset.init(LOCATION);
	}
}