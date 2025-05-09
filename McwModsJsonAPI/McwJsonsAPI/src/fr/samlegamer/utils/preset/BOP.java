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

public class BOP implements Presetting
{
	protected static final List<String> ID_WOOD = new ArrayList<>();
	protected static final List<String> LANG_WOOD = new ArrayList<>();
	public static final List<String> ID_LEAVE = new ArrayList<>();
	public static final List<String> LANG_LEAVE = new ArrayList<>();
	private final boolean b;
	private final String versioning;
	private final ModLoaders modLoader;
	
	public BOP(ModLoaders modL)
	{
		this(false, "1.20", modL);
	}
	
	public BOP(boolean supSniffer, String version, ModLoaders modL)
	{
		this.b = supSniffer;
		this.versioning = version;
		this.modLoader = modL;
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

		if(this.b)
		{
			NewModsList.BOP.bopWood1201(ID_WOOD);
			NewModsList.BOP.bopLeave1201(ID_LEAVE);
		}
		else
		{
			NewModsList.BOP.bopWood(ID_WOOD);
			NewModsList.BOP.bopLeave(ID_LEAVE);
		}

		String TextureLocationFormodid = Compatibilities.BOP_TEXTURES;
		String ModidOfBaseMod = Compatibilities.BOP_MODID;
		String CompatModid = "mcwbiomesoplenty";

		System.out.println("Bridges...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
				new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, this.versioning));
		System.out.println("Roofs...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, 
				new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_ROOFS_MODID, this.versioning));
		System.out.println("Fences...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, 
				new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_FENCES_MODID, this.versioning));
		System.out.println("Furnitures...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FURNITURES_MODID, 
				new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL), 
				new McwDataGen(Compatibilities.MCW_FURNITURES_MODID, this.versioning));
		System.out.println("Doors...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_DOORS_MODID, 
				new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_DOORS_MODID, this.versioning));
		System.out.println("Paths...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID, 
				new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_PATHS_MODID, this.versioning));
		System.out.println("Stairs...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_STAIRS_MODID, 
				new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_STAIRS_MODID, this.versioning));
		System.out.println("Trapdoors...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_TRAPDOORS_MODID, 
				new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID, this.versioning));
		System.out.println("Windows...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_WINDOWS_MODID, 
				new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_WINDOWS_MODID, this.versioning));
		System.out.println("Paths...");
		genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID, 
				new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
				new McwDataGen(Compatibilities.MCW_PATHS_MODID, this.versioning));

		System.out.println("Tags...");
		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), Reference.allMcwMods());

		addLanguage(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_LEAVE, LANG_LEAVE, "en_us");
		addLanguage(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_LEAVE, LANG_LEAVE, "fr_fr");

		if(this.b)
		{
			JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "maple_hedge.json");
			JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "maple_hedge.json");
			JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "maple_hedge.json");
		}
		else
		{
			JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "cherry_hedge.json");
			JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "cherry_hedge.json");
			JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "cherry_hedge.json");
		}
		
		if(versioning.equals("1.21.3") || versioning.equals("1.21.4") || versioning.equals("1.21.5"))
		{
			McwAPI.fixForPaleGarden(LOCATION, CompatModid, ID_WOOD);
		}

		if(versioning.equals("1.21.4") || versioning.equals("1.21.5"))
		{
			final List<String> LEAVES_NO_COLORED = List.of("pine", "mahogany", "willow", "palm", "flowering_oak");

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

		if(versioning.equals("1.21.5")) //Fix for dead hedge in 1.21.5
		{
			JsonsUtils.deleter(LOCATION + "/items/", "dead_hedge.json");

			APIWriter.write(Path.of(LOCATION + "/items/dead_hedge.json"), "{\n" +
					"  \"model\" : {\n" +
					"    \"type\" : \"minecraft:model\",\n" +
					"    \"model\": \""+CompatModid+":block/hedges/dead_wall_inventory\",\n" +
					"    \"tints\": [\n" +
					"      {\n" +
					"        \"type\": \"minecraft:constant\",\n" +
					"        \"value\": -10732494\n" +
					"      }\n" +
					"    ]\n" +
					"  }\n" +
					"}\n");
		}
	}
	
	private void genRessources(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
		res.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
		res.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, ID_WOOD, false);
		dat.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, compat, ModidOfBaseMod, modLoader);
		dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, compat, ModidOfBaseMod, modLoader);
		dat.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
		
		if(compat.equals(Compatibilities.MCW_FENCES_MODID))
		{
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			res.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, Boolean.FALSE, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			dat.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, compat, ModidOfBaseMod, modLoader);
			dat.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			dat.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
	}

	private void addLanguage(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> LANG_WOOD, List<String> ID_LEAVE, List<String> LANG_LEAVE, String language)
	{
		LangSearcher langSearcher = new LangSearcher();

		if(this.b)
		{
			LangMods.BOP.bopWoodSniffer(LANG_WOOD, language);
			LangMods.BOP.bopLeaveSniffer(LANG_LEAVE, language);

        }
		else
		{
			LangMods.BOP.bopWood(LANG_WOOD, language);
			LangMods.BOP.bopLeave(LANG_LEAVE, language);
        }
        langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, Reference.allMcwMods());
        langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
        LANG_WOOD.clear();
		LANG_LEAVE.clear();
	}
}