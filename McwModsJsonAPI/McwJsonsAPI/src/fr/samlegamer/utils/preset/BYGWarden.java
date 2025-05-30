package fr.samlegamer.utils.preset;

import java.io.File;
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

public class BYGWarden implements Presetting
{
	protected static final List<String> ID_WOOD = new ArrayList<>();
	protected static final List<String> ID_ROCK = new ArrayList<>();
	protected static final List<String> WALL = new ArrayList<>();
	protected static final List<String> FLOOR = new ArrayList<>();
	protected static final List<String> ID_LEAVE = new ArrayList<>();

	protected static final List<String> LANG_WOOD = new ArrayList<>();
	protected static final List<String> LANG_ROCK = new ArrayList<>();
	protected static final List<String> LANG_LEAVE = new ArrayList<>();

	private final List<String> mcwMods;
	private final ModLoaders modLoader;

	public BYGWarden(List<String> mcwMods, ModLoaders modLoader)
	{
		this.modLoader=modLoader;
		this.mcwMods=mcwMods;
	}
	
	public BYGWarden(ModLoaders modLoader)
	{
		this(Reference.allMcwMods(), modLoader);
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

		String TextureLocationFormodid = Compatibilities.BYG_TEXTURES;
		String ModidOfBaseMod = Compatibilities.BYG_MODID;
		String CompatModid = "mcwbyg";
		System.out.println("Start Wood Data/Client");
		NewModsList.BYG.bygWoodWarden(ID_WOOD, false);
		NewModsList.BYG.bygLeavesWarden(ID_LEAVE, false);

		for (String mcwMod : mcwMods)
		{
			ClientFolderTypes clientFolderTypes = Reference.getFoldersWoodWithMcwMod(mcwMod);

			System.out.println("Start Wood Client/Data LOG " + mcwMod);
			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, mcwMod,
					new McwModsRessources(mcwMod, clientFolderTypes),
					new McwDataGen(mcwMod));
			System.out.println("Done Wood Client/Data LOG " + mcwMod);
		}
		ID_WOOD.clear();
		ID_LEAVE.clear();

		NewModsList.BYG.bygWoodWarden(ID_WOOD, true);
		NewModsList.BYG.bygLeavesWarden(ID_LEAVE, true);

		for (String mcwMod : mcwMods)
		{
			ClientFolderTypes clientFolderTypes = Reference.getFoldersWoodWithMcwMod(mcwMod);

			System.out.println("Start Wood Client/Data STEM " + mcwMod);

			if(mcwMod.equals(Compatibilities.MCW_FENCES_MODID))
			{
				genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, mcwMod,
						new McwModsRessources(mcwMod, clientFolderTypes),
						new McwDataGen(mcwMod), true);
			}
			else
			{
				genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, mcwMod,
						new McwModsRessources(mcwMod, clientFolderTypes),
						new McwDataGen(mcwMod));
			}
			System.out.println("Done Wood Client/Data STEM " + mcwMod);
		}

		ID_WOOD.clear();
		ID_LEAVE.clear();
		System.out.println("Start Stone Data/Client");
		NewModsList.BYG.bygRockFenceable(ID_ROCK, WALL, FLOOR);

		if(mcwMods.contains(Compatibilities.MCW_ROOFS_MODID))
		{
			genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID,
					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
		}

		if(mcwMods.contains(Compatibilities.MCW_FENCES_MODID))
		{
			genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID,
					new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE),
					new McwDataGen(Compatibilities.MCW_FENCES_MODID));
		}

		ID_ROCK.clear();
		WALL.clear();
		FLOOR.clear();
		NewModsList.BYG.bygRock(ID_ROCK, WALL, FLOOR);

		if(mcwMods.contains(Compatibilities.MCW_BRIDGES_MODID))
		{
			genStoneRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID,
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE),
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
		}

		System.out.println("Done Stone Data/Client");

		NewModsList.BYG.bygWoodWarden(ID_WOOD);
		NewModsList.BYG.bygLeavesWarden(ID_LEAVE);
		NewModsList.BYG.bygRock(ID_ROCK, WALL, FLOOR);

		System.out.println("Start Generate Tags");

		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
		tagsGenerator.pickaxeCustom(LOCATION, CompatModid, ID_ROCK, "Bridges", List.of(Compatibilities.MCW_BRIDGES_MODID));
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, List.of(Compatibilities.MCW_BRIDGES_MODID));
//		genTags(LOCATION, CompatModid, new BridgesTagsGenerator());
		McwAPI.clears(ID_ROCK, WALL, FLOOR);
		NewModsList.BYG.bygRockFenceable(ID_ROCK, WALL, FLOOR);
		tagsGenerator.pickaxeCustom(LOCATION, CompatModid, ID_ROCK, "RoofsAndFences", List.of(Compatibilities.MCW_ROOFS_MODID, Compatibilities.MCW_FENCES_MODID));

		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());

//		genTags(LOCATION, CompatModid, new RoofsTagsGenerator());
//		genTags(LOCATION, CompatModid, new FencesTagsGenerator(ID_LEAVE));
//		genTags(LOCATION, CompatModid, new FurnituresTagsGenerator());
//		genTags(LOCATION, CompatModid, new TrapdoorsTagsGenerator());
//		genTags(LOCATION, CompatModid, new DoorsTagsGenerator());
//		genTags(LOCATION, CompatModid, new WindowsTagsGenerator());
//		genTags(LOCATION, CompatModid, new StairsTagsGenerator());
//		genTags(LOCATION, CompatModid, new PathsTagsGenerator());
		System.out.println("Done Generate Tags");

		McwAPI.clears(ID_ROCK, WALL, FLOOR, LANG_ROCK);
		genLang(LOCATION, CompatModid, "en_us");
		genLang(LOCATION, CompatModid, "fr_fr");

//		System.out.println("Start Generate English Files");
//		LangMods.BYG.bygLeavesWildUpLang(LANG_LEAVE);
//		English.BYG.bygLangWildUp(LANG_WOOD);
//		English.BYG.bygRockFenceableLang(LANG_ROCK);
//		genLangEnglish(LOCATION, CompatModid, new RoofsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, new FencesLangGenerator(ID_LEAVE, LANG_LEAVE));
//		genLangEnglish(LOCATION, CompatModid, new FurnituresLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, new TrapdoorsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, new DoorsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, new WindowsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, new PathsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, new StairsLangGenerator());
//		System.out.println("Done Generate English Files");
//
//		System.out.println("Start Generate French Files");
//		McwAPI.clears(LANG_WOOD, LANG_ROCK, LANG_LEAVE);
//		French.BYG.bygLeavesWildUpLang(LANG_LEAVE);
//		French.BYG.bygLangWildUp(LANG_WOOD);
//		French.BYG.bygRockFenceableLang(LANG_ROCK);
//		genLangFrench(LOCATION, CompatModid, new RoofsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, new FencesLangGenerator(ID_LEAVE, LANG_LEAVE));
//		genLangFrench(LOCATION, CompatModid, new FurnituresLangGenerator());
//		genLangFrench(LOCATION, CompatModid, new TrapdoorsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, new DoorsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, new WindowsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, new PathsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, new StairsLangGenerator());
//
//		McwAPI.clears(LANG_ROCK, ID_ROCK, WALL, FLOOR);
//		genLangBridges(CompatModid);
//		System.out.println("Done Generate French Files");

//		if(bridges)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_BRIDGES_MODID,
//					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
//		}
//		if(bridges)
//		{
//		}
//
//		if(fences)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID,
//					new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_FENCES_MODID), false);
//		}
//
//		if(roofs)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID,
//					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
//		}
//
//		if(furnitures)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID,
//					new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
//					new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
//		}
//
//		if(stairs)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID,
//					new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
//		}
//
//		if(trapdoors)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID,
//					new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
//		}
//
//		if(doors)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID,
//					new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_DOORS_MODID));
//		}
//
//		if(windows)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID,
//					new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
//		}
//
//		if(paths)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID,
//					new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_PATHS_MODID));
//		}
//
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
//		if(fences)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_FENCES_MODID,
//					new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_FENCES_MODID), true);
//		}
//
//		if(roofs)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_ROOFS_MODID,
//					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
//		}
//
//		if(furnitures)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_FURNITURES_MODID,
//					new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
//					new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
//		}
//
//		if(stairs)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_STAIRS_MODID,
//					new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
//		}
//
//		if(trapdoors)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_TRAPDOORS_MODID,
//					new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
//		}
//
//		if(doors)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_DOORS_MODID,
//					new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_DOORS_MODID));
//		}
//
//		if(windows)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_WINDOWS_MODID,
//					new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
//		}
//
//
//		if(paths)
//		{
//			genWoodRsc(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, true, Compatibilities.MCW_PATHS_MODID,
//					new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
//					new McwDataGen(Compatibilities.MCW_PATHS_MODID));
//		}
		

		
		/* Replace Error for textures  */
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "red_oak", "red_oak_leaves", "oak_leaves_red");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "red_spruce", "red_spruce_leaves", "spruce_leaves_red");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "orange_spruce", "orange_spruce_leaves", "spruce_leaves_orange");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "yellow_spruce", "yellow_spruce_leaves", "spruce_leaves_yellow");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "flowering_palo_verde", "flowering_palo_verde_leaves", "palo_verde_leaves_flowering");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "orange_oak", "orange_oak_leaves", "oak_leaves_orange");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "blooming_witch_hazel", "blooming_witch_hazel_leaves", "witch_hazel_leaves_blooming");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "brown_oak", "brown_oak_leaves", "oak_leaves_dry_brown");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "brown_oak", "brown_oak_leaves", "oak_leaves_dry_brown");

		for(String folderInModel : ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD.getPathList())
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "soapstone", "polished_soapstone", "soapstone_polished");
		}
		
		for(String folderInModel : ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList())
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "soapstone", "polished_soapstone", "soapstone_polished");
		}
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "imparius", "stripped_imparius_stem", "fungal_imparius_stem");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "scoria_stone", "scoria_stone_bricks\"", "scoria_stonebricks\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "scoria_stone", "scoria_stone_bricks\"", "scoria_stonebricks\"");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "scoria_stone", "scoria_stone_brick_wall", "scoria_stonebrick_wall");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "scoria_stone", "scoria_stone_brick_wall", "scoria_stonebrick_wall");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "scoria_stone", "scoria_stone_brick_slab", "scoria_stonebrick_slab");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "scoria_stone", "scoria_stone_brick_slab", "scoria_stonebrick_slab");


		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "imparius_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "imparius_hedge.json");

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "nightshade_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "nightshade_hedge.json");

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "bulbis_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "bulbis_hedge.json");

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sythian_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "sythian_hedge.json");

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "cherry_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "cherry_hedge.json");

		System.out.println("Finish Registries");
	}
	
	private void genLang(String LOCATION, String CompatModid, String language)
	{
		LangSearcher langSearcher = new LangSearcher();
		System.out.println("Start Generate "+language+" Files");
		McwAPI.clears(ID_ROCK, WALL, FLOOR, LANG_ROCK);
		NewModsList.BYG.bygRockFenceable(ID_ROCK, WALL, FLOOR);
		LangMods.BYG.bygLeaveWardenLang(LANG_LEAVE, language);
		LangMods.BYG.bygWoodWardenLang(LANG_WOOD, language);
		LangMods.BYG.bygRockFencesAndRoofsLang(LANG_ROCK, language);

		langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, mcwMods);
		langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
		langSearcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, language, List.of(Compatibilities.MCW_FENCES_MODID, Compatibilities.MCW_ROOFS_MODID));

		McwAPI.clears(ID_ROCK, WALL, FLOOR, LANG_ROCK);
		NewModsList.BYG.bygRock(ID_ROCK, WALL, FLOOR);
		LangMods.BYG.bygRockBridgesLang(LANG_ROCK, language);
		JsonsUtils.addToLangStone(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, language, List.of(Compatibilities.MCW_BRIDGES_MODID));
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
		client.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, ID_WOOD, "planks", "log", "stripped_log");
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
			data.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
			data.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
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
	
	private void genTags(String LOCATION, String CompatModid, ITagData tag)
	{
		tag.AxeDataGenWood(LOCATION, CompatModid, ID_WOOD);
		tag.PickaxeDataGen(LOCATION, CompatModid, ID_ROCK);
		tag.HoeDataGenWood(LOCATION, CompatModid, ID_LEAVE);
		tag.TagsWood(LOCATION, CompatModid, ID_WOOD);
		tag.TagsRock(LOCATION, CompatModid, ID_ROCK);
	}
}