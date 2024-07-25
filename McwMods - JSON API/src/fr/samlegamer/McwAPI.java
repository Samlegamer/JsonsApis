package fr.samlegamer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class McwAPI
{
	public static final String READER = System.getProperty("user.dir")+File.separator+"mcwmods"+File.separator;
	
	public enum ClassicFolderTypes
	{
		TAGS_BLOCK_MINEABLE("data"+File.separator+"tags"+File.separator+"block"+File.separator+"mineable"+File.separator),
		TAGS_BLOCK("data"+File.separator+"tags"+File.separator+"block"+File.separator),
		TAGS_ITEM("data"+File.separator+"tags"+File.separator+"item"+File.separator),
		RECIPE("data"+File.separator+"recipes"+File.separator), 
		LOOT_TABLES("data"+File.separator+"loot_tables"+File.separator+"blocks"+File.separator),
		BLOCKSTATES("blockstates"+File.separator),
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
	
	private static List<String> mcw_fences_block_model()
	{
		List<String> result = new ArrayList<String>();
		result.add("highley_gate"+File.separator);
		result.add("horse"+File.separator);
		result.add("inventory"+File.separator);
		result.add("modern_wall"+File.separator);
		result.add("picket"+File.separator);
		result.add("stockade"+File.separator);
		result.add("wired"+File.separator);
		result.add("pyramid_gate"+File.separator);
		result.add("hedges"+File.separator);
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

		return result;
	}
	
	public enum ClientFolderTypes
	{
		MCW_BRIDGES_BLOCK_MODEL_WOOD(mcw_bridges_block_model_wood()),
		MCW_BRIDGES_BLOCK_MODEL_STONE(mcw_bridges_block_model_stone()),
		MCW_FENCES_BLOCK_MODEL(mcw_fences_block_model()),
		MCW_ROOFS_BLOCK_MODEL_WOOD(mcw_roofs_block_modelwood()),
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
	
	public static void message(File file)
	{
		System.out.println("File : "+file.getName()+" has generated !"); 
	}
	
	public static void DataGenFolder(String location)
	{
		File folderData = new File(location + "data/");
		File folderRecipes = new File(location + "data/recipes/");
		File folderLoot_Tables = new File(location + "data/loot_tables/");
		File folderBlocks = new File(location + "data/loot_tables/blocks/");
		File folderTags = new File(location + "data/tags/");
		File folderTagsBlock = new File(location + "data/tags/block/");
		File folderTagsBlockMineable = new File(location + "data/tags/block/mineable/");
		File folderTagsItem = new File(location + "data/tags/item/");

		if(!folderData.exists() || !folderRecipes.exists() || !folderLoot_Tables.exists() || !folderBlocks.exists() || 
		!folderTags.exists() || !folderTagsBlock.exists() || !folderTagsBlockMineable.exists() || !folderTagsItem.exists())
		{
			folderData.mkdir();
			folderRecipes.mkdir();
			folderLoot_Tables.mkdir();
			folderTags.mkdir();
			folderBlocks.mkdir();
			folderTagsBlock.mkdir();
			folderTagsBlockMineable.mkdir();
			folderTagsItem.mkdir();
		}
	}
	
	public static void BridgesGenFolder(String location)
	{
		File folderBlockstates = new File(location + "blockstates/");
		File folderModels = new File(location + "models/");
		File folderBlock = new File(location + "models/block/");
		File folderBridge = new File(location + "models/block/bridge/");
		File folderBridgeWood = new File(location + "models/block/bridge/bridge_wood/");
		File folderBridgeStone = new File(location + "models/block/bridge/bridge_stone/");
		File folderBridgerail = new File(location + "models/block/bridge/rail/");
		File folderBridgeRope = new File(location + "models/block/bridge/rope/");
		File folderItem = new File(location + "models/item/");
		File folderStair = new File(location + "models/block/stair/");
		File folderStairWood = new File(location + "models/block/stair/wood/");
		File folderStairRope = new File(location + "models/block/stair/rope/");
		File folderStairStone = new File(location + "models/block/stair/stone/");
		File foldersupport_pier = new File(location + "models/block/support_pier/");
		
		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists() || !folderBridge.exists()
		|| !folderBridgeWood.exists() || !folderItem.exists() || !folderBridgeStone.exists() || !folderBridgeRope.exists()
		|| !folderStair.exists() || !folderStairWood.exists() || !folderStairRope.exists() || !folderStairStone.exists()
		|| !foldersupport_pier.exists() || !folderBridgerail.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderBridge.mkdir();
			folderBridgeWood.mkdir();
			folderItem.mkdir();
			folderBridgeStone.mkdir();
			folderBridgeRope.mkdir();
			folderBridgerail.mkdir();
			folderStair.mkdir();
			folderStairWood.mkdir();
			folderStairRope.mkdir();
			folderStairStone.mkdir();
			foldersupport_pier.mkdir();
		}
	}
	
	public static void FencesGenFolder(String location)
	{
		File folderBlockstates = new File(location + "blockstates/");
		File folderModels = new File(location + "models/");
		File folderBlock = new File(location + "models/block/");
		File folderItem = new File(location + "models/item/");
		File folderhighley_gate = new File(location + "models/block/highley_gate/");
		File folderhorse = new File(location + "models/block/horse/");
		File folderinventory = new File(location + "models/block/inventory/");
		File foldermodern_wall = new File(location + "models/block/modern_wall/");
		File folderpicket = new File(location + "models/block/picket/");
		File folderstockade = new File(location + "models/block/stockade/");
		File folderwired = new File(location + "models/block/wired/");
		File folderpyramid_gate = new File(location + "models/block/pyramid_gate/");

		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists()
		|| !folderItem.exists() || !folderhighley_gate.exists() 
		|| !folderhorse.exists() || !folderinventory.exists() || !foldermodern_wall.exists()
		|| !folderpicket.exists() || !folderstockade.exists() || !folderwired.exists() || !folderpyramid_gate.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderItem.mkdir();
			folderhighley_gate.mkdir();
			folderhorse.mkdir();
			folderinventory.mkdir();
			foldermodern_wall.mkdir();
			folderpicket.mkdir();
			folderstockade.mkdir();
			folderwired.mkdir();
			folderpyramid_gate.mkdir();
		}
	}

	public static void RoofsGenFolder(String location)
	{
		//Base
		File folderBlockstates = new File(location + "blockstates/");
		File folderModels = new File(location + "models/");
		File folderBlock = new File(location + "models/block/");
		File folderItem = new File(location + "models/item/");
		
		//models/block/
		File folderAttic = new File(location + "models/block/attic/");
		File folderAwning = new File(location + "models/block/awning/");
		File foldermiddle_end = new File(location + "models/block/middle_end/");
		File folderGutter = new File(location + "models/block/gutter/");
		File folderLower = new File(location + "models/block/lower/");
		File folderRoof = new File(location + "models/block/roof/");
		File folderSteep = new File(location + "models/block/steep/");
		File folderTop = new File(location + "models/block/top/");

		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists() || !folderItem.exists() 
		|| !folderAttic.exists() || !folderAwning.exists()
		|| !foldermiddle_end.exists() || !folderGutter.exists() || !folderLower.exists() || !folderRoof.exists()
		|| !folderSteep.exists() || !folderTop.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderItem.mkdir();
			folderAttic.mkdir();
			folderAwning.mkdir();
			foldermiddle_end.mkdir();
			folderGutter.mkdir();
			folderLower.mkdir();
			folderRoof.mkdir();
			folderSteep.mkdir();
			folderTop.mkdir();
		}
	}

}
