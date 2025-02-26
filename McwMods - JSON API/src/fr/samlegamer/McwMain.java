package fr.samlegamer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.preset.TerraformersMC;

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
	
	public static void main(String[] args)
	{
		preset(new TerraformersMC("1.21"));
	}
	
	public static void preset(Presetting preset)
	{
		preset.init(LOCATION);
	}
}