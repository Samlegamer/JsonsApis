package fr.samlegamer.utils.preset;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.api.datagen.TagsGenerator;
import fr.samlegamer.api.lang.LangSearcher;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;

public class BWG implements Presetting
{
	protected final List<String> ID_WOOD = new ArrayList<>();
	protected final List<String> ID_ROCK = new ArrayList<>();
	protected final List<String> WALL = new ArrayList<>();
	protected final List<String> FLOOR = new ArrayList<>();
	protected final List<String> ID_LEAVE = new ArrayList<>();
	
	protected final List<String> LANG_WOOD = new ArrayList<>();
	protected final List<String> LANG_ROCK = new ArrayList<>();
	protected final List<String> LANG_LEAVE = new ArrayList<>();

	private final List<String> mcwMods;
	private final ModLoaders modLoader;
	private final String version;
	
	public BWG(String version, List<String> mcwMods, ModLoaders modLoader)
	{
		this.version = version;
		this.modLoader = modLoader;
		this.mcwMods=mcwMods;
	}
	
	public BWG(String version, ModLoaders modLoader)
	{
		this(version, Reference.allMcwMods(), modLoader);
	}

	public BWG(ModLoaders modLoader)
	{
		this("1.20", modLoader);
	}

	@Override
	public void init(String LOCATION) {
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
		NewModsList.BWG.bwgWood(ID_WOOD, false);
		NewModsList.BWG.bwgLeaves(ID_LEAVE, false);

		for (String mcwMod : mcwMods)
		{
			ClientFolderTypes clientFolderTypes = Reference.getFoldersWoodWithMcwMod(mcwMod);

			System.out.println("Start Wood Client/Data LOG " + mcwMod);
			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, mcwMod,
					new McwModsRessources(mcwMod, clientFolderTypes),
					new McwDataGen(mcwMod, version));
			System.out.println("Done Wood Client/Data LOG " + mcwMod);
		}

		ID_WOOD.clear();
		ID_LEAVE.clear();
		NewModsList.BWG.bwgWood(ID_WOOD, true);
		NewModsList.BWG.bwgLeaves(ID_LEAVE, true);

		for (String mcwMod : mcwMods)
		{
			ClientFolderTypes clientFolderTypes = Reference.getFoldersWoodWithMcwMod(mcwMod);

			System.out.println("Start Wood Client/Data STEM " + mcwMod);
			if(mcwMods.contains(Compatibilities.MCW_FENCES_MODID))
			{
				genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, mcwMod,
						new McwModsRessources(mcwMod, clientFolderTypes),
						new McwDataGen(mcwMod, version), true);
			}
			else
			{
				genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, mcwMod,
						new McwModsRessources(mcwMod, clientFolderTypes),
						new McwDataGen(mcwMod, version));
			}
			System.out.println("Done Wood Client/Data STEM " + mcwMod);
		}

		ID_WOOD.clear();
		ID_LEAVE.clear();
		System.out.println("Start Stone Data/Client");
		NewModsList.BWG.bwgRock(ID_ROCK, WALL, FLOOR);

		genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID,
				new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
				new McwDataGen(Compatibilities.MCW_ROOFS_MODID, version));

		genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID,
				new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE),
				new McwDataGen(Compatibilities.MCW_FENCES_MODID, version));

		genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID,
				new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE),
				new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, version));

		System.out.println("Done Stone Data/Client");
		ID_ROCK.clear();
		WALL.clear();
		FLOOR.clear();
		NewModsList.BWG.bwgWood(ID_WOOD);
		NewModsList.BWG.bwgLeaves(ID_LEAVE);
		NewModsList.BWG.bwgRock(ID_ROCK, WALL, FLOOR);

		System.out.println("Start Generate Tags");
		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
		tagsGenerator.pickaxe(LOCATION, CompatModid, ID_ROCK, Reference.allMcwModsStone());

		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());

		System.out.println("Done Generate Tags");

		genLang(LOCATION, CompatModid, "en_us");
		genLang(LOCATION, CompatModid, "fr_fr");



		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "sakura_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "sakura_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sakura_hedge.json");

		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "florus_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "florus_hedge.json");
		JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "florus_hedge.json");

		if(version.equals("1.21.4") || version.equals("1.21.5"))
		{
			McwAPI.fixForPaleGarden(LOCATION, CompatModid, ID_WOOD);

			final List<String> LEAVES_NO_COLORED = List.of("mahogany", "maple");

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
		}

		System.out.println("Finish Registries");
	}

	private void genLang(String LOCATION, String CompatModid, String language)
	{
		LangSearcher langSearcher = new LangSearcher();
		System.out.println("Start Generate "+language+" Files");
		LangMods.BWG.bwgLeaveLang(LANG_LEAVE, language);
		LangMods.BWG.bwgWoodLang(LANG_WOOD, language);
		LangMods.BWG.bwgRockLang(LANG_ROCK, language);

		langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, mcwMods);
		langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
		langSearcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, language, List.of(Compatibilities.MCW_FENCES_MODID, Compatibilities.MCW_ROOFS_MODID, Compatibilities.MCW_BRIDGES_MODID));

		McwAPI.clears(LANG_WOOD, LANG_ROCK, LANG_LEAVE);
		System.out.println("Done Generate "+language+" Files");
	}


	protected void genWoodRsc(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem, String compatmcw, McwModsRessources client, McwDataGen data)
	{
		genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, isStem, compatmcw, client, data, false);
	}
	
	protected void genWoodRsc(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem, String compatmcw, McwModsRessources client, McwDataGen data, boolean normalFolder)
	{
		client.setModid(CompatModid);
		client.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
		client.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
		if(isStem)
		{
			client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, ID_WOOD, "planks", "stem", "stripped_stem");
		}
		else
		{
			client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, ID_WOOD, "planks", "log", "stripped_log");
		}
		data.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, isStem, compatmcw, ModidOfBaseMod, modLoader);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, isStem, compatmcw, ModidOfBaseMod, modLoader);
		data.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
		
		if(compatmcw.equals(Compatibilities.MCW_FENCES_MODID))
		{
			client.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			if(normalFolder)
			{
				client.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, Boolean.FALSE, "acacia_wall");
			}
			else {
				client.createWoodCustomModelsBlocksBYGSettingwithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, "planks", "log", "stripped_log", "leaves", "acacia_wall");
			}
			client.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			data.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, compatmcw, ModidOfBaseMod, modLoader);
			data.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			data.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", compatmcw, ModidOfBaseMod, modLoader);
		}
	}
	
	protected void genStoneRsc(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compatmcw, McwModsRessources client, McwDataGen data)
	{
		client.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
		client.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, ID_ROCK, WALL, FLOOR);
		client.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
		data.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, compatmcw, ModidOfBaseMod, modLoader);
		data.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, WALL, compatmcw, ModidOfBaseMod, modLoader);
		data.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
	}
}