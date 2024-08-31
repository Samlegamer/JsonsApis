package fr.samlegamer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class McwAPI
{
	public static final String READER = System.getProperty("user.dir")+File.separator+"mcwmods"+File.separator;
	
	public enum ClassicFolderTypes
	{
		TAGS_BLOCK_MINEABLE("data"+File.separator+"tags"+File.separator+"block"+File.separator+"mineable"+File.separator),
		TAGS_BLOCK("data"+File.separator+"tags"+File.separator+"blocks"+File.separator),
		TAGS_ITEM("data"+File.separator+"tags"+File.separator+"items"+File.separator),
		RECIPE("data"+File.separator+"recipes"+File.separator), 
		ADVANCEMENT_RECIPE("data"+File.separator+"advancements"+File.separator+"recipes"+File.separator), 
		LOOT_TABLES("data"+File.separator+"loot_tables"+File.separator+"blocks"+File.separator),
		BLOCKSTATES("blockstates"+File.separator),
		LANG("blockstates"+File.separator),
		MODELS("models"+File.separator),
		MODEL_BLOCK("models"+File.separator+"block"+File.separator),
		MODEL_ITEM("models"+File.separator+"item"+File.separator);
		private String path;
		private ClassicFolderTypes(String path)
		{
			this.path = path;
		}
		
		public String getPath() {
			return path;
		}
	}
	
	private static List<String> mcw_fences_block_model_wood()
	{
		List<String> result = new ArrayList<String>();
		result.add("highley_gate"+File.separator);
		result.add("horse"+File.separator);
		result.add("inventory"+File.separator);
		result.add("picket"+File.separator);
		result.add("stockade"+File.separator);
		result.add("wired"+File.separator);
		result.add("pyramid_gate"+File.separator);
		result.add("hedges"+File.separator);
		return result;
	}
	
	private static List<String> mcw_fences_block_model_stone()
	{
		List<String> result = new ArrayList<String>();
		result.add("grass_topped"+File.separator);
		result.add("modern_wall"+File.separator);
		result.add("inventory"+File.separator);
		result.add("pillar"+File.separator);
		result.add("railing_gate"+File.separator);
		result.add("railing_wall"+File.separator);
		return result;
	}

	
	private static List<String> mcw_bridges_block_model_wood()
	{
		List<String> result = new ArrayList<String>();
		result.add("bridge"+File.separator+"bridge_wood"+File.separator);
		result.add("bridge"+File.separator+"rail"+File.separator);
		result.add("bridge"+File.separator+"rope"+File.separator);
		result.add("stair"+File.separator+"wood"+File.separator);
		result.add("stair"+File.separator+"rope"+File.separator);
		result.add("support_pier"+File.separator);
		return result;
	}
	
	private static List<String> mcw_bridges_block_model_stone()
	{
		List<String> result = new ArrayList<String>();
		result.add("bridge"+File.separator+"bridge_stone"+File.separator);
		result.add("stair"+File.separator+"stone"+File.separator);
		result.add("support_pier"+File.separator);
		result.add("bridge"+File.separator+"balustrade"+File.separator);//Added
		return result;
	}
	
	private static List<String> mcw_roofs_block_modelwood()
	{
		List<String> result = new ArrayList<String>();
		result.add("attic"+File.separator);
		result.add("lower"+File.separator);
		result.add("middle_end"+File.separator);
		result.add("roof"+File.separator);
		result.add("steep"+File.separator);
		result.add("top"+File.separator);
		return result;
	}

	private static List<String> mcw_furnitures_block_model()
	{
		List<String> result = new ArrayList<String>();
		result.add("cabinet"+File.separator);
		result.add("chair"+File.separator);
		result.add("counter"+File.separator);
		result.add("desk"+File.separator);
		result.add("drawer"+File.separator);
		result.add("table"+File.separator);
		result.add("wardrobe"+File.separator);
		return result;
	}
	
	private static List<String> mcw_trapdoors_block_model()
	{
		List<String> result = new ArrayList<String>();
		result.add("bamboo"+File.separator);
		result.add("barn"+File.separator);
		result.add("barred"+File.separator);
		result.add("barrel"+File.separator);
		result.add("beach"+File.separator);
		result.add("blossom"+File.separator);
		result.add("classic"+File.separator);
		result.add("cottage"+File.separator);
		result.add("four_panel"+File.separator);
		result.add("glass"+File.separator);
		result.add("mystic"+File.separator);
		result.add("paper"+File.separator);
		result.add("ranch"+File.separator);
		result.add("rp_bark"+File.separator);
		result.add("swamp"+File.separator);
		result.add("tropical"+File.separator);
		return result;
	}
	
	public enum ClientFolderTypes
	{
		MCW_BRIDGES_BLOCK_MODEL_WOOD(mcw_bridges_block_model_wood()),
		MCW_BRIDGES_BLOCK_MODEL_STONE(mcw_bridges_block_model_stone()),
		MCW_FENCES_BLOCK_MODEL_WOOD(mcw_fences_block_model_wood()),
		MCW_FENCES_BLOCK_MODEL_STONE(mcw_fences_block_model_stone()),
		MCW_ROOFS_BLOCK_MODEL_WOOD(mcw_roofs_block_modelwood()),
		MCW_TRAPDOORS_BLOCK_MODEL_WOOD(mcw_trapdoors_block_model()),
		MCW_FURNITURES_BLOCK_MODEL(mcw_furnitures_block_model());
		
		private List<String> path;
		private ClientFolderTypes(List<String> path)
		{
			this.path = path;
		}
		
		public List<String> getPathList()
		{
			return path;
		}
	}
	
	/*
	 * A message for file generated
	 */
	public static void message(File file)
	{
		System.out.println("File : "+file.getName()+" has generated !"); 
	}
	
	/*
	 * Simplified Method
	 */
	private static void registerFolder(String location, String path)
	{
		File folderBase = new File(location + path);
		
		if(!folderBase.exists())
		{
			folderBase.mkdir();
		}
	}
	
	/*
	 * Base Server root Folder
	 */
	public static void DataGenFolder(String location)
	{
		registerFolder(location, "data/");
		registerFolder(location, "data/advancements/");
		registerFolder(location, "data/advancements/recipes");
		registerFolder(location, "data/recipes/");
		registerFolder(location, "data/loot_tables/");
		registerFolder(location, "data/loot_tables/blocks/");
		registerFolder(location, "data/tags/");
		registerFolder(location, "data/tags/blocks/");
		registerFolder(location, "data/tags/block/mineable/");
		registerFolder(location, "data/tags/items/");
	}
	
	/*
	 * Base Client root Folder
	 */
	private static void baseFolder(String location)
	{
		registerFolder(location, "blockstates/");
		registerFolder(location, "lang/");
		registerFolder(location, "models/");
		registerFolder(location, "models/block/");
		registerFolder(location, "models/item/");
	}
	
	public static void BridgesGenFolder(String location)
	{
		baseFolder(location);
		registerFolder(location, "models/block/bridge/");
		registerFolder(location, "models/block/bridge/bridge_wood/");
		registerFolder(location, "models/block/bridge/bridge_stone/");
		registerFolder(location, "models/block/bridge/balustrade/"); //added
		registerFolder(location, "models/block/bridge/rail/");
		registerFolder(location, "models/block/bridge/rope/");
		registerFolder(location, "models/block/stair/");
		registerFolder(location, "models/block/stair/wood/");
		registerFolder(location, "models/block/stair/rope/");
		registerFolder(location, "models/block/stair/stone/");
		registerFolder(location, "models/block/support_pier/");
	}
	
	public static void FencesGenFolder(String location)
	{
		baseFolder(location);
		registerFolder(location, "models/block/highley_gate/");
		registerFolder(location, "models/block/horse/");
		registerFolder(location, "models/block/inventory/");
		registerFolder(location, "models/block/modern_wall/");
		registerFolder(location, "models/block/picket/");
		registerFolder(location, "models/block/stockade/");
		registerFolder(location, "models/block/wired/");
		registerFolder(location, "models/block/pyramid_gate/");
		registerFolder(location, "models/block/hedges/");
		
		registerFolder(location, "models/block/grass_topped/");
		registerFolder(location, "models/block/pillar/");
		registerFolder(location, "models/block/railing_gate/");
		registerFolder(location, "models/block/railing_wall/");
	}

	public static void RoofsGenFolder(String location)
	{
		baseFolder(location);
		registerFolder(location, "models/block/attic/");
		registerFolder(location, "models/block/awning/");
		registerFolder(location, "models/block/middle_end/");
		registerFolder(location, "models/block/gutter/");
		registerFolder(location, "models/block/lower/");
		registerFolder(location, "models/block/roof/");
		registerFolder(location, "models/block/steep/");
		registerFolder(location, "models/block/top/");
	}

	public static void FurnituresGenFolder(String location)
	{
		baseFolder(location);
		registerFolder(location, "models/block/cabinet/");
		registerFolder(location, "models/block/chair/");
		registerFolder(location, "models/block/counter/");
		registerFolder(location, "models/block/desk/");
		registerFolder(location, "models/block/drawer/");
		registerFolder(location, "models/block/table/");
		registerFolder(location, "models/block/wardrobe/");
	}
	
	public static void TrapdoorsGenFolder(String location)
	{
		baseFolder(location);
		registerFolder(location, "models/block/bamboo/");
		registerFolder(location, "models/block/barn/");
		registerFolder(location, "models/block/barred/");
		registerFolder(location, "models/block/barrel/");
		registerFolder(location, "models/block/beach/");
		registerFolder(location, "models/block/blossom/");
		registerFolder(location, "models/block/classic/");
		registerFolder(location, "models/block/cottage/");
		registerFolder(location, "models/block/four_panel/");
		registerFolder(location, "models/block/glass/");
		registerFolder(location, "models/block/mystic/");
		registerFolder(location, "models/block/paper/");
		registerFolder(location, "models/block/ranch/");
		registerFolder(location, "models/block/rp_bark/");
		registerFolder(location, "models/block/swamp/");
		registerFolder(location, "models/block/tropical/");
		
		/*Textures Folders*/
		registerFolder(location, "textures/block/");
		registerFolder(location, "textures/block/bamboo/");
		registerFolder(location, "textures/block/barn/");
		registerFolder(location, "textures/block/barred/");
		registerFolder(location, "textures/block/barrel/");
		registerFolder(location, "textures/block/beach/");
		registerFolder(location, "textures/block/blossom/");
		registerFolder(location, "textures/block/classic/");
		registerFolder(location, "textures/block/cottage/");
		registerFolder(location, "textures/block/four_panel/");
		registerFolder(location, "textures/block/glass/");
		registerFolder(location, "textures/block/mystic/");
		registerFolder(location, "textures/block/paper/");
		registerFolder(location, "textures/block/swamp/");
		registerFolder(location, "textures/block/tropical/");
	}

	public static void clears(List<?>... list)
	{
		for(List<?> l : list)
		{
			l.clear();
		}
	}
	
	@Deprecated
	public static void verifTag(BufferedWriter buffer, String i, List<String> MAT_WOOD) throws IOException
	{
		verifJson(buffer, i, MAT_WOOD);
	}
	
	public static void verifJson(BufferedWriter buffer, String i, List<String> MAT_WOOD) throws IOException
	{
		if(!i.equals(MAT_WOOD.get(0)))
		{
			buffer.write(",");
			buffer.newLine();
		}
	}
	
	public static void verifJsonLang(BufferedWriter buffer, int nbr) throws IOException
	{
		if(nbr != 0)
		{
			buffer.write(",");
			buffer.newLine();
		}
	}

}