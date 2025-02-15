package fr.samlegamer.utils.preset;

import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.bridges.BridgesTagsGenerator;
import fr.samlegamer.api.datagen.doors.DoorsTagsGenerator;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.datagen.furnitures.FurnituresTagsGenerator;
import fr.samlegamer.api.datagen.paths.PathsTagsGenerator;
import fr.samlegamer.api.datagen.roofs.RoofsTagsGenerator;
import fr.samlegamer.api.datagen.stairs.StairsTagsGenerator;
import fr.samlegamer.api.datagen.traps.TrapdoorsTagsGenerator;
import fr.samlegamer.api.datagen.windows.WindowsTagsGenerator;
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.DoorsLangGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.FurnituresLangGenerator;
import fr.samlegamer.api.lang.PathsLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.StairsLangGenerator;
import fr.samlegamer.api.lang.TrapdoorsLangGenerator;
import fr.samlegamer.api.lang.WindowsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.IModFiles.ILang;
import fr.samlegamer.utils.IModFiles.ITagData;

public class BWG implements Presetting
{
	private String version = "1.21";
	
	protected final List<String> MAT_WOOD = new ArrayList<String>();
	protected final List<String> MAT_ROCK = new ArrayList<String>();
	protected final List<String> WALL = new ArrayList<String>();
	protected final List<String> FLOOR = new ArrayList<String>();
	protected final List<String> MAJ_WOOD = new ArrayList<String>();
	protected final List<String> MAJ_ROCK = new ArrayList<String>();
	protected final List<String> LEAVES = new ArrayList<String>();
	protected final List<String> LEAVES_LANG = new ArrayList<String>();
	
	public BWG(String version)
	{
		this.version = version;
	}
	
	public BWG()
	{
		this("1.20");
	}

	@Override
	public void init(String LOCATION)
	{

		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.TrapdoorsGenFolder(LOCATION);
		McwAPI.DoorsGenFolder(LOCATION);
		McwAPI.WindowsGenFolder(LOCATION);
		McwAPI.PathsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		String TextureLocationFormodid = Compatibilities.BYG_TEXTURES_120;
		String ModidOfBaseMod = Compatibilities.BYG_MODID_120;
		String CompatModid = "mcwbyg";
		System.out.println("Start Wood Data/Client");
		ModsList.byg120(MAT_WOOD, false);
		ModsList.bygLeaves120(LEAVES, false);

		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, 
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, 
					new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_FENCES_MODID, version), false);
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, 
					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, 
					new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
					new McwDataGen(Compatibilities.MCW_FURNITURES_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, 
					new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_STAIRS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_DOORS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, 
					new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_WINDOWS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, 
					new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_PATHS_MODID, version));
		
		MAT_WOOD.clear();
		LEAVES.clear();
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		ModsList.byg120(MAT_WOOD, true);
		ModsList.bygLeaves120(LEAVES, true);
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_BRIDGES_MODID, 
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_FENCES_MODID, 
					new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_FENCES_MODID, version), true);
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_ROOFS_MODID, 
					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_FURNITURES_MODID, 
					new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
					new McwDataGen(Compatibilities.MCW_FURNITURES_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_STAIRS_MODID, 
					new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_STAIRS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_TRAPDOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_DOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_DOORS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_WINDOWS_MODID, 
					new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_WINDOWS_MODID, version));
		
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_PATHS_MODID, 
					new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_PATHS_MODID, version));
		
		MAT_WOOD.clear();
		System.out.println("Done Wood Data/Client");
		System.out.println("Start Stone Data/Client");
		ModsList.bygRock120(MAT_ROCK, WALL, FLOOR);
		
		genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID,
					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID, version));
		
		genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID,
					new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE),
					new McwDataGen(Compatibilities.MCW_FENCES_MODID, version));
		
		MAT_ROCK.clear();
		WALL.clear();
		FLOOR.clear();
		LEAVES.clear();
		ModsList.bygRock120(MAT_ROCK, WALL, FLOOR);
		
		genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID,
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE),
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, version));
		
		System.out.println("Done Stone Data/Client");
		
		ModsList.byg120(MAT_WOOD);
		ModsList.bygLeaves120(LEAVES);
		ModsList.bygRock120(MAT_ROCK, WALL, FLOOR);

		System.out.println("Start Generate Tags");
		genTags(LOCATION, CompatModid, new BridgesTagsGenerator());
		MAT_ROCK.clear();
		WALL.clear();
		FLOOR.clear();
		ModsList.bygRock120(MAT_ROCK, WALL, FLOOR);
		genTags(LOCATION, CompatModid, new RoofsTagsGenerator());
		genTags(LOCATION, CompatModid, new FencesTagsGenerator(LEAVES));
		genTags(LOCATION, CompatModid, new FurnituresTagsGenerator());
		genTags(LOCATION, CompatModid, new TrapdoorsTagsGenerator());
		genTags(LOCATION, CompatModid, new DoorsTagsGenerator());
		genTags(LOCATION, CompatModid, new WindowsTagsGenerator());
		genTags(LOCATION, CompatModid, new StairsTagsGenerator());		
		genTags(LOCATION, CompatModid, new PathsTagsGenerator());		
		System.out.println("Done Generate Tags");

		System.out.println("Start Generate English Files");
		English.BYG.bygLeaves120Lang(LEAVES_LANG);
		English.BYG.byg120Lang(MAJ_WOOD);
		English.BYG.bygRockLang120(MAJ_ROCK);
		genLangEnglish(LOCATION, CompatModid, new RoofsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new FencesLangGenerator(LEAVES, LEAVES_LANG));
		genLangEnglish(LOCATION, CompatModid, new FurnituresLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new TrapdoorsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new DoorsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new WindowsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new PathsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new StairsLangGenerator());
		System.out.println("Done Generate English Files");

		System.out.println("Start Generate French Files");
		McwAPI.clears(MAJ_WOOD, MAJ_ROCK, LEAVES_LANG);
		French.BYG.bygLeaves120Lang(LEAVES_LANG);
		French.BYG.byg120Lang(MAJ_WOOD);
		French.BYG.bygRockLang120(MAJ_ROCK);
		genLangFrench(LOCATION, CompatModid, new RoofsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new FencesLangGenerator(LEAVES, LEAVES_LANG));
		genLangFrench(LOCATION, CompatModid, new FurnituresLangGenerator());
		genLangFrench(LOCATION, CompatModid, new TrapdoorsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new DoorsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new WindowsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new PathsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new StairsLangGenerator());
		
		McwAPI.clears(MAJ_ROCK, MAT_ROCK, WALL, FLOOR);		
		genLangBridges(CompatModid);
		System.out.println("Done Generate French Files");
		
		/* Replace Error for textures  */
		
		/*JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "red_oak", "red_oak_leaves", "oak_leaves_red");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "red_spruce", "red_spruce_leaves", "spruce_leaves_red");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "orange_spruce", "orange_spruce_leaves", "spruce_leaves_orange");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "yellow_spruce", "yellow_spruce_leaves", "spruce_leaves_yellow");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "flowering_palo_verde", "flowering_palo_verde_leaves", "palo_verde_leaves_flowering");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "orange_oak", "orange_oak_leaves", "oak_leaves_orange");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "blooming_witch_hazel", "blooming_witch_hazel_leaves", "witch_hazel_leaves_blooming");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "brown_oak", "brown_oak_leaves", "oak_leaves_dry_brown");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "brown_oak", "brown_oak_leaves", "oak_leaves_dry_brown");

		for(String folderInModel : McwAPI.ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD.getPathList())
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "soapstone", "polished_soapstone", "soapstone_polished");
		}
		
		for(String folderInModel : McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList())
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "soapstone", "polished_soapstone", "soapstone_polished");
		}
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "imparius", "stripped_imparius_stem", "fungal_imparius_stem");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "scoria_stone", "scoria_stone_bricks\"", "scoria_stonebricks\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "scoria_stone", "scoria_stone_bricks\"", "scoria_stonebricks\"");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "scoria_stone", "scoria_stone_brick_wall", "scoria_stonebrick_wall");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "scoria_stone", "scoria_stone_brick_wall", "scoria_stonebrick_wall");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "scoria_stone", "scoria_stone_brick_slab", "scoria_stonebrick_slab");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "scoria_stone", "scoria_stone_brick_slab", "scoria_stonebrick_slab");*/

		System.out.println("Finish Registries");
	}
	
	/* Separed method for remove error */
	private void genLangBridges(String CompatModid)
	{
		List<String> A = new ArrayList<String>();
		List<String> W = new ArrayList<String>();
		List<String> F = new ArrayList<String>();
		List<String> MAJ = new ArrayList<String>();
		BridgesLangGenerator lang = new BridgesLangGenerator();
		
		ModsList.bygRock120(A, W, F);
		English.BYG.bygRockLang120(MAJ);
		lang.initAllStoneEnglish(CompatModid, A, MAJ);
		MAJ.clear();
		French.BYG.bygRockLang120(MAJ);
		lang.initAllStoneFrench(CompatModid, A, MAJ);
	}
	
	protected void genWoodRsc(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem, String compatmcw, McwModsRessources client, McwDataGen data)
	{
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, isStem, compatmcw, client, data, false);
	}
	
	protected void genWoodRsc(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem, String compatmcw, McwModsRessources client, McwDataGen data, boolean normalFolder)
	{
		client.setModid(CompatModid);
		client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		//client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "log", "stripped_log");
		if(isStem)
		{
			client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "stem", "stripped_stem");
		}
		else
		{
			client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "log", "stripped_log");
		}
		data.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, compatmcw, Compatibilities.BYG_MODID);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		
		if(compatmcw.equals(Compatibilities.MCW_FENCES_MODID))
		{
			client.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			if(normalFolder)
			{
				client.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
			}
			else {
				client.createWoodCustomModelsBlocksBYGSettingwithResearch(LOCATION, TextureLocationFormodid, LEAVES, "planks", "log", "stripped_log", "leaves", "acacia_wall");
			}
			client.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
			data.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			data.RecipesLogAllwithResearch(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge");
		}
	}
	
	protected void genStoneRsc(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compatmcw, McwModsRessources client, McwDataGen data)
	{
		client.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, MAT_ROCK, WALL, FLOOR);
		client.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, WALL, compatmcw, ModidOfBaseMod);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
	}
	
	private void genTags(String LOCATION, String CompatModid, ITagData tag)
	{
		tag.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tag.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag.TagsRock(LOCATION, CompatModid, MAT_ROCK);
	}
	
	private void genLangEnglish(String LOCATION, String CompatModid, ILang lang)
	{
		lang.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
	}
	
	private void genLangFrench(String LOCATION, String CompatModid, ILang lang)
	{
		lang.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
	}

	public String getVersion() {
		return version;
	}
}