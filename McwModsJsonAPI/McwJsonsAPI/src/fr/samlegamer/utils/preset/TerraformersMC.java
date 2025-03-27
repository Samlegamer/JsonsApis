package fr.samlegamer.utils.preset;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.ModLoaders;
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
import fr.samlegamer.utils.IModFiles.ILang;
import fr.samlegamer.utils.IModFiles.ITagData;
import fr.samlegamer.utils.JsonsUtils;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;

public class TerraformersMC implements Presetting
{
	protected static final List<String> MAT_WOOD = new ArrayList<String>();
	protected static final List<String> MAJ_WOOD = new ArrayList<String>();
	protected static final List<String> LEAVES = new ArrayList<String>();
	protected static final List<String> LEAVES_LANG = new ArrayList<String>();

	protected static final List<String> MAT_ROCK = new ArrayList<String>();
	protected static final List<String> WALL = new ArrayList<String>();
	protected static final List<String> FLOOR = new ArrayList<String>();
	protected static final List<String> MAJ_ROCK = new ArrayList<String>();
	private String version;
	private ModLoaders modLoader;

	public TerraformersMC(String version, ModLoaders modLoader)
	{
		this.version=version;
		this.modLoader=modLoader;
	}
	
	public TerraformersMC(ModLoaders modLoader)
	{
		this("1.20", modLoader);
	}
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.DoorsGenFolder(LOCATION);
		McwAPI.PathsGenFolder(LOCATION);
		McwAPI.TrapdoorsGenFolder(LOCATION);
		McwAPI.WindowsGenFolder(LOCATION);
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		
		String CompatModid = "mcwterraformersmc";
		String TextureLocationFormodid, ModidOfBaseMod;


		System.out.println("Start Traverse");
		TextureLocationFormodid = Compatibilities.TRAVERSE_TEXTURES;
		ModidOfBaseMod = Compatibilities.TRAVERSE_MODID;

		ModsList.TerraformersMCWood(MAT_WOOD, ModidOfBaseMod);
		ModsList.TerraformersMCLeaves(LEAVES, ModidOfBaseMod);

		wood(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false);
		System.out.println("Finish Traverse !");
		clearAll();
		

		System.out.println("Start Cinderscapes");
		TextureLocationFormodid = Compatibilities.CINDERSCAPES_TEXTURES;
		ModidOfBaseMod = Compatibilities.CINDERSCAPES_MODID;

		ModsList.TerraformersMCWood(MAT_WOOD, ModidOfBaseMod);
		ModsList.TerraformersMCRock(MAT_ROCK, WALL, FLOOR, ModidOfBaseMod);

		wood(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true);
		stone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod);
		System.out.println("Finish Cinderscapes !");
		clearAll();

		
		System.out.println("Start Terrestria");
		TextureLocationFormodid = Compatibilities.TERRESTRIA_TEXTURES;
		ModidOfBaseMod = Compatibilities.TERRESTRIA_MODID;

		ModsList.TerraformersMCWood(MAT_WOOD, ModidOfBaseMod);
		ModsList.TerraformersMCLeaves(LEAVES, ModidOfBaseMod);
		ModsList.TerraformersMCRock(MAT_ROCK, WALL, FLOOR, ModidOfBaseMod);

		wood(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false);
		stone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod);
		System.out.println("Finish Terrestria !");
		clearAll();

		
		ModsList.TerraformersMCWood(MAT_WOOD);
		ModsList.TerraformersMCLeaves(LEAVES);
		ModsList.TerraformersMCRock(MAT_ROCK, WALL, FLOOR);

		System.out.println("Tags...");
		genTags(LOCATION, CompatModid, new BridgesTagsGenerator());
		genTags(LOCATION, CompatModid, new RoofsTagsGenerator());
		genTags(LOCATION, CompatModid, new FencesTagsGenerator(true, MAT_ROCK, LEAVES));
		genTags(LOCATION, CompatModid, new FurnituresTagsGenerator());
		genTags(LOCATION, CompatModid, new TrapdoorsTagsGenerator());
		genTags(LOCATION, CompatModid, new DoorsTagsGenerator());
		genTags(LOCATION, CompatModid, new WindowsTagsGenerator());
		genTags(LOCATION, CompatModid, new StairsTagsGenerator());		
		genTags(LOCATION, CompatModid, new PathsTagsGenerator());		

		English.TerraformersMC.TerraformersMCRockLang(MAJ_ROCK);
		English.TerraformersMC.TerraformersMCWoodLang(MAJ_WOOD);
		English.TerraformersMC.TerraformersMCLeavesLang(LEAVES_LANG);

		genLangEnglish(LOCATION, CompatModid, new BridgesLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new RoofsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new FencesLangGenerator(LEAVES, LEAVES_LANG));
		genLangEnglish(LOCATION, CompatModid, new FurnituresLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new TrapdoorsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new DoorsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new WindowsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new PathsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, new StairsLangGenerator());
		
		MAJ_WOOD.clear();
		MAJ_ROCK.clear();
		LEAVES_LANG.clear();
		
		French.TerraformersMC.TerraformersMCRockLang(MAJ_ROCK);
		French.TerraformersMC.TerraformersMCWoodLang(MAJ_WOOD);
		French.TerraformersMC.TerraformersMCLeavesLang(LEAVES_LANG);

		genLangFrench(LOCATION, CompatModid, new BridgesLangGenerator());
		genLangFrench(LOCATION, CompatModid, new RoofsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new FencesLangGenerator(LEAVES, LEAVES_LANG));
		genLangFrench(LOCATION, CompatModid, new FurnituresLangGenerator());
		genLangFrench(LOCATION, CompatModid, new TrapdoorsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new DoorsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new WindowsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new PathsLangGenerator());
		genLangFrench(LOCATION, CompatModid, new StairsLangGenerator());

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "dark_japanese_maple", "dark_japanese_maple_leaves", "japanese_maple_leaves_dark");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "japanese_maple_shrub", "japanese_maple_shrub_leaves", "japanese_maple_leaves_green");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "wired" + File.separator, "yucca_palm", "yucca_palm_log_top", "yucca_palm_log_section");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "inventory" + File.separator, "yucca_palm", "yucca_palm_log_top", "yucca_palm_log_section");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "wired" + File.separator, "sakura", "sakura_log_top", "sakura_log_section");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "inventory" + File.separator, "sakura", "sakura_log_top", "sakura_log_section");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sulfur_quartz_bricks", "cinderscapes:sulfur_quartz_brick_wall", "cinderscapes:sulfur_quartz_pillar");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "rose_quartz_bricks", "cinderscapes:rose_quartz_brick_wall", "cinderscapes:rose_quartz_pillar");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "smoky_quartz_bricks", "cinderscapes:smoky_quartz_brick_wall", "cinderscapes:smoky_quartz_pillar");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sulfur_quartz_bricks", "cinderscapes:sulfur_quartz_brick_slab", "cinderscapes:sulfur_quartz_slab");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "rose_quartz_bricks", "cinderscapes:rose_quartz_brick_slab", "cinderscapes:rose_quartz_slab");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "smoky_quartz_bricks", "cinderscapes:smoky_quartz_brick_slab", "cinderscapes:smoky_quartz_slab");

		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD.getPathList());
		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD.getPathList());
		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD.getPathList());
		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL.getPathList());
		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD.getPathList());
		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD.getPathList());
		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD.getPathList());
		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD.getPathList());
		fixSakuraFabric(LOCATION, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD.getPathList());
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "wired" + File.separator, "sakura", "terrestria:block/sakura_log_mcw_section", "terrestria:block/sakura_log_section");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "inventory" + File.separator, "sakura", "terrestria:block/sakura_log_mcw_section", "terrestria:block/sakura_log_section");

		if(version.equals("1.21.3"))
		{
			McwAPI.fixForPaleGarden(LOCATION, CompatModid, MAT_WOOD);
		}
		
		/*JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "blossom", "quark:blossom_slab", "quark:blossom_planks_slab");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "azalea", "quark:azalea_slab", "quark:azalea_planks_slab");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sandstone_bricks", "\"quark:smooth_sandstone_bricks\"", "\"minecraft:smooth_sandstone\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_sandstone_bricks", "\"quark:smooth_red_sandstone_bricks\"", "\"minecraft:smooth_red_sandstone\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "calcite_bricks", "\"quark:calcite\"", "\"minecraft:calcite\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "blackstone_bricks", "\"quark:blackstone\"", "\"minecraft:blackstone\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mossy_cobblestone_bricks", "\"quark:mossy_cobblestone\"", "\"minecraft:mossy_cobblestone\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "cobblestone_bricks", "\"quark:cobblestone\"", "\"minecraft:cobblestone\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "andesite_bricks", "\"quark:andesite\"", "\"minecraft:andesite\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "tuff_bricks", "\"quark:tuff\"", "\"minecraft:tuff\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "granite_bricks", "\"quark:granite\"", "\"minecraft:granite\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "diorite_bricks", "\"quark:diorite\"", "\"minecraft:diorite\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "dripstone_bricks", "\"quark:dripstone\"", "\"minecraft:dripstone_block\"");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "soul_sandstone_bricks", "\"quark:smooth_soul_sandstone_bricks\"", "\"quark:smooth_soul_sandstone\"");

		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mossy_cobblestone_bricks", "\"quark:mossy_cobblestone_brick_", "\"quark:mossy_cobblestone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sandstone_bricks", "\"quark:sandstone_brick_", "\"quark:sandstone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "soul_sandstone_bricks", "\"quark:soul_sandstone_brick_", "\"quark:soul_sandstone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "jasper_bricks", "\"quark:jasper_brick_", "\"quark:jasper_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "tuff_bricks", "\"quark:tuff_brick_", "\"quark:tuff_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "shale_bricks", "\"quark:shale_brick_", "\"quark:shale_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "permafrost_bricks", "\"quark:permafrost_brick_", "\"quark:permafrost_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "andesite_bricks", "\"quark:andesite_brick_", "\"quark:andesite_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "limestone_bricks", "\"quark:limestone_brick_", "\"quark:limestone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "diorite_bricks", "\"quark:diorite_brick_", "\"quark:diorite_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_sandstone_bricks", "\"quark:red_sandstone_brick_", "\"quark:red_sandstone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "calcite_bricks", "\"quark:calcite_brick_", "\"quark:calcite_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "cobblestone_bricks", "\"quark:cobblestone_brick_", "\"quark:cobblestone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "tuff_bricks", "\"quark:tuff_brick_", "\"quark:tuff_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "limestone_bricks", "\"quark:limestone_brick_", "\"quark:limestone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "dripstone_bricks", "\"quark:dripstone_brick_", "\"quark:dripstone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "granite_bricks", "\"quark:granite_brick_", "\"quark:granite_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "blackstone_bricks", "\"quark:blackstone_brick_", "\"quark:blackstone_bricks_");

		//JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mossy_cobblestone_bricks", "minecraft:mossy_cobblestone_bricks_wall", "minecraft:mossy_cobblestone_brick_wall");
		//JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mossy_cobblestone_bricks", "minecraft:mossy_cobblestone_bricks_wall", "minecraft:mossy_cobblestone_brick_wall");
		
		for(String folderInModel : McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList())
		{
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "soul_sandstone_bricks", "soul_sandstone_bricks_top", "soul_sandstone_bricks");
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "red_sandstone_bricks", "red_sandstone_bricks_top", "red_sandstone_bricks");
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "sandstone_bricks", "sandstone_bricks_top", "sandstone_bricks");

		}
		
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "blossom_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "azalea_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "blossom_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "azalea_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "blossom_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "azalea_hedge.json");*/

		//JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "cherry_hedge.json");
		//JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "cherry_hedge.json");
	}
	
	private void fixSakuraFabric(String LOCATION, List<String> pathList)
	{
		for(String folderInModel : pathList)
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "sakura", "terrestria:block/sakura_log", "terrestria:block/sakura_log_mcw");
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "sakura", "terrestria:block/stripped_sakura_log", "terrestria:block/stripped_sakura_log_mcw");
		}
	}
	
	public void wood(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, boolean Stem)
	{
		System.out.println("Bridges...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
				new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, version), Stem);
		System.out.println("Roofs...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, 
				new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_ROOFS_MODID, version), Stem);
		System.out.println("Fences...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, 
				new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_FENCES_MODID, version), Stem);
		System.out.println("Furnitures...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FURNITURES_MODID, 
				new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL), 
				new McwDataGen(Compatibilities.MCW_FURNITURES_MODID, version), Stem);
		System.out.println("Doors...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_DOORS_MODID, 
				new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_DOORS_MODID, version), Stem);
		System.out.println("Paths...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID, 
				new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_PATHS_MODID, version), Stem);
		System.out.println("Stairs...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_STAIRS_MODID, 
				new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_STAIRS_MODID, version), Stem);
		System.out.println("Trapdoors...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_TRAPDOORS_MODID, 
				new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID, version), Stem);
		System.out.println("Windows...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_WINDOWS_MODID, 
				new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_WINDOWS_MODID, version), Stem);
		System.out.println("Paths...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID, 
				new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_PATHS_MODID, version), Stem);
	}
	
	public void stone(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod)
	{
		System.out.println("Stone...");
		genRessourcesStone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
				new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE), 
				new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, version));

		genRessourcesStone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, 
				new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_ROOFS_MODID, version));

		genRessourcesStone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, 
				new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE), 
				new McwDataGen(Compatibilities.MCW_FENCES_MODID, version));
	}
	
	protected void clearAll()
	{
		McwAPI.clears(MAT_WOOD, MAT_ROCK, WALL, FLOOR, MAJ_WOOD, MAJ_ROCK, LEAVES, LEAVES_LANG);
	}
		
	private void genRessourcesStone(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		res.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, MAT_ROCK, WALL, FLOOR);
		res.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		dat.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, compat, ModidOfBaseMod, modLoader);
		dat.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, compat, ModidOfBaseMod, modLoader);
		dat.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
	}
	
	private void genRessources(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat, boolean Stem)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		res.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		res.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, Stem);
		dat.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, Stem, compat, ModidOfBaseMod, modLoader);
		dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, Stem, compat, ModidOfBaseMod, modLoader);
		dat.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		
		if(compat.equals(Compatibilities.MCW_FENCES_MODID))
		{
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			res.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			dat.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			dat.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
			dat.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
	}
	
	private void genTags(String LOCATION, String CompatModid, ITagData tag)
	{
		tag.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tag.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		tag.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
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
}