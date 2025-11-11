package fr.samlegamer.utils.preset;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.api.datagen.TagsGenerator;
import fr.samlegamer.api.lang.*;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;
import fr.samlegamer.utils.IModFiles.ITagData;

public class TerraformersMC implements Presetting
{
	protected static final List<String> ID_WOOD = new ArrayList<>();
	protected static final List<String> ID_ROCK = new ArrayList<>();
	protected static final List<String> WALL = new ArrayList<>();
	protected static final List<String> FLOOR = new ArrayList<>();
	protected static final List<String> ID_LEAVE = new ArrayList<>();
	
	protected static final List<String> LANG_WOOD = new ArrayList<>();
	protected static final List<String> LANG_ROCK = new ArrayList<>();
	protected static final List<String> LANG_LEAVE = new ArrayList<>();
	
	private final String version;
	private final ModLoaders modLoader;

	public TerraformersMC(String version, ModLoaders modLoader)
	{
		this.version = version;
		this.modLoader = modLoader;
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

		NewModsList.TerraformersMC.TerraformersMCWood(ID_WOOD, ModidOfBaseMod);
		NewModsList.TerraformersMC.TerraformersMCLeaves(ID_LEAVE, ModidOfBaseMod);

		wood(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false);
		System.out.println("Finish Traverse !");
		clearAll();
		

		System.out.println("Start Cinderscapes");
		TextureLocationFormodid = Compatibilities.CINDERSCAPES_TEXTURES;
		ModidOfBaseMod = Compatibilities.CINDERSCAPES_MODID;

		NewModsList.TerraformersMC.TerraformersMCWood(ID_WOOD, ModidOfBaseMod);
		NewModsList.TerraformersMC.TerraformersMCRock(ID_ROCK, WALL, FLOOR, ModidOfBaseMod);

		wood(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true);
		stone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod);
		System.out.println("Finish Cinderscapes !");
		clearAll();

		
		System.out.println("Start Terrestria");
		TextureLocationFormodid = Compatibilities.TERRESTRIA_TEXTURES;
		ModidOfBaseMod = Compatibilities.TERRESTRIA_MODID;

		NewModsList.TerraformersMC.TerraformersMCWood(ID_WOOD, ModidOfBaseMod);
		NewModsList.TerraformersMC.TerraformersMCLeaves(ID_LEAVE, ModidOfBaseMod);
		NewModsList.TerraformersMC.TerraformersMCRock(ID_ROCK, WALL, FLOOR, ModidOfBaseMod);

		wood(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false);
		stone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod);
		System.out.println("Finish Terrestria !");
		clearAll();


		NewModsList.TerraformersMC.TerraformersMCWood(ID_WOOD);
		NewModsList.TerraformersMC.TerraformersMCLeaves(ID_LEAVE);
		NewModsList.TerraformersMC.TerraformersMCRock(ID_ROCK, WALL, FLOOR);

		System.out.println("Tags...");
		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
		tagsGenerator.pickaxe(LOCATION, CompatModid, ID_ROCK, Reference.allMcwModsStone());

		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());

		addLang(LOCATION, CompatModid, "en_us");
		addLang(LOCATION, CompatModid, "fr_fr");

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

		if(version.equals("1.21.3") || version.equals("1.21.4") || version.equals("1.21.10"))
		{
			McwAPI.fixForPaleGarden(LOCATION, CompatModid, ID_WOOD);
		}

		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "scorched_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "umbral_hedge.json");

		if(version.equals("1.21.4") || version.equals("1.21.10"))
		{
			List<String> LEAVES_NO_COLORED = List.of("redwood", "hemlock", "rubber", "cypress",
					"willow", "japanese_maple_shrub", "rainbow_eucalyptus");
			for (String leave : LEAVES_NO_COLORED)
			{
				JsonsUtils.deleter(LOCATION + "/items/", leave+"_hedge.json");

				APIWriter.write(Path.of(LOCATION + "/items/"+leave+"_hedge.json"), "{\n" +
						"  \"model\" : {\n" +
						"    \"type\" : \"minecraft:model\",\n" +
						"    \"model\": \""+CompatModid+":block/hedges/"+leave+"_wall_inventory\",\n" +
						"    \"tints\": [\n" +
						"      {\n" +
						"        \"type\": \"minecraft:constant\",\n" +
						"        \"value\": -12012264\n" +
						"      }\n" +
						"    ]\n" +
						"  }\n" +
						"}\n");
			}

			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "wired" + File.separator, "sakura", "terrestria:block/sakura_log_section", "terrestria:block/sakura_log_top");
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "wired" + File.separator, "yucca_palm", "terrestria:block/yucca_palm_log_section", "terrestria:block/yucca_palm_log_top");
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "inventory" + File.separator, "sakura", "terrestria:block/sakura_log_section", "terrestria:block/sakura_log_top");
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "inventory" + File.separator, "yucca_palm", "terrestria:block/yucca_palm_log_section", "terrestria:block/yucca_palm_log_top");

			for(String folder : McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList()) {
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "mossy_basalt_bricks", "terrestria:block/mossy_basalt_bricks", "terrestria:block/mossy_volcanic_rock_bricks");
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "mossy_basalt_bricks", "terrestria:block/mossy_basalt_cobblestone", "terrestria:block/mossy_volcanic_rock_cobblestone");

				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "basalt_bricks", "terrestria:block/basalt_bricks", "terrestria:block/volcanic_rock_bricks");
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "basalt_bricks", "terrestria:block/basalt_cobblestone", "terrestria:block/volcanic_rock_cobblestone");
			}

			for(String folder : ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE.getPathList()) {
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "mossy_basalt_bricks", "terrestria:block/mossy_basalt_bricks", "terrestria:block/mossy_volcanic_rock_bricks");
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "mossy_basalt_bricks", "terrestria:block/mossy_basalt_cobblestone", "terrestria:block/mossy_volcanic_rock_cobblestone");

				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "basalt_bricks", "terrestria:block/basalt_bricks", "terrestria:block/volcanic_rock_bricks");
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "basalt_bricks", "terrestria:block/basalt_cobblestone", "terrestria:block/volcanic_rock_cobblestone");
			}

			for(String folder : ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD.getPathList()) {
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "mossy_basalt_bricks", "terrestria:block/mossy_basalt_bricks", "terrestria:block/mossy_volcanic_rock_bricks");
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "mossy_basalt_bricks", "terrestria:block/mossy_basalt_cobblestone", "terrestria:block/mossy_volcanic_rock_cobblestone");

				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "basalt_bricks", "terrestria:block/basalt_bricks", "terrestria:block/volcanic_rock_bricks");
				JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folder + File.separator, "basalt_bricks", "terrestria:block/basalt_cobblestone", "terrestria:block/volcanic_rock_cobblestone");
			}

			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "japanese_maple_shrub", "terrestria:block/japanese_maple_leaves_green", "terrestria:block/japanese_maple_shrub_leaves");
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "dark_japanese_maple", "terrestria:block/japanese_maple_leaves_dark", "terrestria:block/dark_japanese_maple_leaves");
		}

	}

	public static void addLang(String LOCATION, String CompatModid, String language)
	{
		System.out.println("Start Language: " + language);
		LangSearcher langSearcher = new LangSearcher();
		LangMods.TerraformersMC.terraformersMCRockLang(LANG_ROCK, language);
		LangMods.TerraformersMC.terraformersMCWoodLang(LANG_WOOD, language);
		LangMods.TerraformersMC.terraformersMCLeaveLang(LANG_LEAVE, language);

		langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, Reference.allMcwMods());
		langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
		langSearcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, language, Reference.allMcwModsStone());
		McwAPI.clears(LANG_WOOD, LANG_ROCK, LANG_LEAVE);
		System.out.println("Done Language: " + language);
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
		McwAPI.clears(ID_WOOD, ID_ROCK, WALL, FLOOR, LANG_WOOD, LANG_ROCK, ID_LEAVE, LANG_LEAVE);
	}
		
	private void genRessourcesStone(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
		res.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, ID_ROCK, WALL, FLOOR);
		res.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
		dat.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, compat, ModidOfBaseMod, modLoader);
		dat.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, FLOOR, compat, ModidOfBaseMod, modLoader);
		dat.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
	}
	
	private void genRessources(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat, boolean Stem)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
		res.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
		res.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, ID_WOOD, Stem);
		dat.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, Stem, compat, ModidOfBaseMod, modLoader);
		dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, Stem, compat, ModidOfBaseMod, modLoader);
		dat.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
		
		if(compat.equals(Compatibilities.MCW_FENCES_MODID))
		{
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			res.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, Boolean.FALSE, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			dat.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			dat.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			dat.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
	}
	
	private void genTags(String LOCATION, String CompatModid, ITagData tag)
	{
		tag.AxeDataGenWood(LOCATION, CompatModid, ID_WOOD);
		tag.HoeDataGenWood(LOCATION, CompatModid, ID_LEAVE);
		tag.TagsWood(LOCATION, CompatModid, ID_WOOD);
		tag.TagsRock(LOCATION, CompatModid, ID_ROCK);
		tag.PickaxeDataGen(LOCATION, CompatModid, ID_ROCK);
	}
}