package fr.samlegamer.utils.preset;

import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.datagen.furnitures.FurnituresTagsGenerator;
import fr.samlegamer.api.datagen.roofs.RoofsTagsGenerator;
import fr.samlegamer.api.datagen.stairs.StairsTagsGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.FurnituresLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.StairsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.preset.bridges.BridgesBWG;
import fr.samlegamer.utils.preset.fences.FencesBWG;

public class BWG implements Presetting
{
	private String version = "1.21";
	
	protected final McwModsRessources client_wood = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
	protected final McwModsRessources client_stone = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
	protected final McwDataGen data = new McwDataGen(Compatibilities.MCW_ROOFS_MODID, version);
	
	protected final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
	protected final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID, version);

	protected final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
	protected final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID, version);

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
	
	protected void genWoodBYGFurnitures(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		if(isStem)
		{
			client_wood_furnitures.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "stem", "stripped_stem");
		}
		else
		{
			client_wood_furnitures.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "log", "stripped_log");
		}
		data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data_furnitures.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}
	
	protected void genWoodBYG(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		if(isStem)
		{
			client_wood.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "stem", "stripped_stem");
		}
		else
		{
			client_wood.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "log", "stripped_log");
		}
		data.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, Compatibilities.MCW_ROOFS_MODID);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}
	
	protected void genStoneBYG(String LOCATION, String CompatModid, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String TextureLocationFormodid, String ModidOfBaseMod)
	{
		client_stone.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, MAT_ROCK, WALL, FLOOR);
		client_stone.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, WALL, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
	}

	protected void genWoodBYGStairs(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		if(isStem)
		{
			client_wood_stairs.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "stem", "stripped_stem");
		}
		else
		{
			client_wood_stairs.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", "log", "stripped_log");
		}
		data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, Compatibilities.MCW_STAIRS_MODID);
		data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}

	@Override
	public void init(String LOCATION)
	{
		final String CompatModid = "mcwbyg";

		BridgesBWG bridges = new BridgesBWG(CompatModid, version);
		bridges.init(LOCATION);
		FencesBWG fences = new FencesBWG(CompatModid, version);
		fences.init(LOCATION);

		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.StairsGenFolder(LOCATION);

		String TextureLocationFormodid = Compatibilities.BYG_TEXTURES_120;
		String ModidOfBaseMod = Compatibilities.BYG_MODID_120;

		System.out.println("Start Wood Data/Client");
		ModsList.byg120(MAT_WOOD, false);
		genWoodBYG(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, false);
		MAT_WOOD.clear();
		ModsList.byg120(MAT_WOOD, true);
		genWoodBYG(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, true);
		MAT_WOOD.clear();
		System.out.println("Done Wood Data/Client");

		System.out.println("Start Stone Data/Client");
		ModsList.bygRock120(MAT_ROCK, WALL, FLOOR);
		genStoneBYG(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod);
		System.out.println("Done Stone Data/Client");
		
		
		System.out.println("Start Wood Data/Client");
		ModsList.byg120(MAT_WOOD, false);
		genWoodBYGFurnitures(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, false);
		MAT_WOOD.clear();
		ModsList.byg120(MAT_WOOD, true);
		genWoodBYGFurnitures(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, true);
		MAT_WOOD.clear();
		System.out.println("Done Wood Data/Client");
		
		System.out.println("Start Wood Data/Client");
		ModsList.byg120(MAT_WOOD, false);
		genWoodBYGStairs(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, false);
		MAT_WOOD.clear();
		ModsList.byg120(MAT_WOOD, true);
		genWoodBYGStairs(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, true);
		MAT_WOOD.clear();
		System.out.println("Done Wood Data/Client");

		ModsList.byg120(MAT_WOOD);
		ModsList.bygLeaves120(LEAVES);

		System.out.println("Start Generate Tags");
		FencesTagsGenerator tags_fences = new FencesTagsGenerator(true, MAT_ROCK, LEAVES);
		FurnituresTagsGenerator tags_furni = new FurnituresTagsGenerator();
		RoofsTagsGenerator tags_roof = new RoofsTagsGenerator();
		StairsTagsGenerator tag_stairs = new StairsTagsGenerator();
		tags_fences.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags_fences.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags_fences.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tags_fences.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tags_furni.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags_furni.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags_roof.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags_roof.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags_roof.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag_stairs.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag_stairs.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		System.out.println("Done Generate Tags");

		System.out.println("Start Generate English Files");
		English.BYG.bygLeaves120Lang(LEAVES_LANG);
		English.BYG.byg120Lang(MAJ_WOOD);
		English.BYG.bygRockLang120(MAJ_ROCK);
		FencesLangGenerator english_fences = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		FurnituresLangGenerator english_furni = new FurnituresLangGenerator();
		RoofsLangGenerator english_roof = new RoofsLangGenerator();
		StairsLangGenerator english_stairs = new StairsLangGenerator();
		english_fences.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		english_fences.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		english_furni.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		english_roof.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		english_roof.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		english_stairs.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		System.out.println("Done Generate English Files");

		System.out.println("Start Generate French Files");
		McwAPI.clears(MAJ_WOOD, MAJ_ROCK, LEAVES_LANG);
		French.BYG.bygLeaves120Lang(LEAVES_LANG);
		French.BYG.byg120Lang(MAJ_WOOD);
		French.BYG.bygRockLang120(MAJ_ROCK);
		FencesLangGenerator french_fences = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		FurnituresLangGenerator french_furni = new FurnituresLangGenerator();
		RoofsLangGenerator french_roof = new RoofsLangGenerator();
		StairsLangGenerator french_stairs = new StairsLangGenerator();
		french_fences.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		french_fences.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		french_furni.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		french_roof.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		french_roof.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		french_stairs.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		System.out.println("Done Generate French Files");
		System.out.println("Finish Registries");
	}

	public String getVersion() {
		return version;
	}
}