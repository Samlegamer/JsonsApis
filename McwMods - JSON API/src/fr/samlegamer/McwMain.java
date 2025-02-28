package fr.samlegamer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.JsonsUtils;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;

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
		
		fixForPaleGarden();
		//preset(new QuarkWarden());
	}
	
	public static void fixForPaleGarden()
	{
		McwAPI.registerFolder(McwMain.LOCATION, ClassicFolderTypes.ITEMS.getPath());
		
		JsonsUtils.adder1214(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath(), ".json", "\"model\" : {\r\n"
				+ "    \"type\" : \"minecraft:model\",", "}");
		ModsList.bop1201(MAT_WOOD);
		JsonsUtils.Doors1214(LOCATION, "mcwbiomesoplenty", MAT_WOOD);
	}
	
	public void fix()
	{
		
	}
	
	public static void preset(Presetting preset)
	{
		preset.init(LOCATION);
	}
}