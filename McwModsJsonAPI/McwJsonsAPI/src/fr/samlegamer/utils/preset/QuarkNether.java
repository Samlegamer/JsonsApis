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
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.datagen.roofs.RoofsTagsGenerator;
import fr.samlegamer.api.lang.LangSearcher;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;
import fr.samlegamer.utils.IModFiles.ILang;
import fr.samlegamer.utils.IModFiles.ITagData;

public class QuarkNether implements Presetting
{
	protected static final List<String> ID_WOOD = new ArrayList<>();
	protected static final List<String> ID_ROCK = new ArrayList<>();
	protected static final List<String> WALL = new ArrayList<>();
	protected static final List<String> FLOOR = new ArrayList<>();
	protected static final List<String> ID_LEAVE = new ArrayList<>();

	protected static final List<String> LANG_WOOD = new ArrayList<>();
	protected static final List<String> LANG_ROCK = new ArrayList<>();
	protected static final List<String> LANG_LEAVE = new ArrayList<>();
	private final ModLoaders modLoader = ModLoaders.FORGE;

	protected void clearAll()
	{
		McwAPI.clears(ID_WOOD, ID_ROCK, WALL, FLOOR, LANG_WOOD, LANG_ROCK, ID_LEAVE, LANG_LEAVE);
	}

	protected void genHedges(String LOCATION, String CompatModid, List<String> ID_LEAVE, String TextureLocationFormodid, String ModidOfBaseMod, McwModsRessources client, McwDataGen dat)
	{
		client.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		client.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, Boolean.FALSE, "acacia_wall");
		client.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		dat.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		dat.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		dat.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
	}

	protected void genStoneBYG(String LOCATION, String CompatModid, List<String> ID_ROCK, List<String> WALL, List<String> FLOOR, String TextureLocationFormodid, String ModidOfBaseMod, String compat, 
	McwModsRessources client, McwDataGen dat)
	{
		client.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
		client.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, ID_ROCK, WALL, FLOOR);
		client.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
		dat.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, compat, ModidOfBaseMod, modLoader);
		dat.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, FLOOR, compat, ModidOfBaseMod, modLoader);
		dat.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
	}
	
	protected void genLangStoneEn(String CompatModid, ILang lang)
	{
		lang.initAllStoneEnglish(CompatModid, ID_ROCK, LANG_ROCK);
	}
	
	protected void genLangStoneFr(String CompatModid, ILang lang)
	{
		lang.initAllStoneFrench(CompatModid, ID_ROCK, LANG_ROCK);
	}
	
	protected void genTagStone(String LOCATION, String CompatModid, ITagData tag)
	{
		tag.PickaxeDataGen(LOCATION, CompatModid, ID_ROCK);
		tag.TagsRock(LOCATION, CompatModid, ID_ROCK);
	}
	
	@Override
	public void init(String LOCATION)
	{
		System.out.println("Quark Loading...");
		clearAll();
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		String TextureLocationFormodid = Compatibilities.QUARK_TEXTURE;
		String ModidOfBaseMod = Compatibilities.QUARK_MODID;
		String CompatModid = "mcwquark";
		
		NewModsList.Quark.quarkRock(ID_ROCK, WALL, FLOOR);
		NewModsList.Quark.quarkLeaves(ID_LEAVE);

		System.out.println("Ressources/Data Loading...");
		genStoneBYG(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
				new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE),
				new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
		final McwDataGen data_fence = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
		genStoneBYG(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID,
				new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE), data_fence);
		genHedges(LOCATION, CompatModid, ID_LEAVE, TextureLocationFormodid, ModidOfBaseMod, new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD), data_fence);

		genStoneBYG(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID,
				new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
				new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
		System.out.println("Ressources/Data Finish !");

		System.out.println("Tags Loading...");
		final FencesTagsGenerator tag_fences = new FencesTagsGenerator(true, ID_ROCK, ID_LEAVE);
		genTagStone(LOCATION, CompatModid, tag_fences);
		tag_fences.TagsWood(LOCATION, CompatModid, ID_WOOD);
		tag_fences.HoeDataGenWood(LOCATION, CompatModid, ID_LEAVE);
		genTagStone(LOCATION, CompatModid, new RoofsTagsGenerator());
		genTagStone(LOCATION, CompatModid, new BridgesTagsGenerator());
		System.out.println("Tags Finish !");
		
		LangMods.Quark.quarkRockLang(LANG_ROCK, "en_us");
		LangMods.Quark.quarkLeaveLang(LANG_LEAVE, "en_us");

		System.out.println("Lang Loading...");
		final LangSearcher lang_searcher = new LangSearcher(McwAPI.READER_MCW_LANG);

		lang_searcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, "en_us");
		lang_searcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, "en_us",
				List.of(Compatibilities.MCW_BRIDGES_MODID, Compatibilities.MCW_FENCES_MODID, Compatibilities.MCW_ROOFS_MODID));
		
		LANG_LEAVE.clear();
		LANG_ROCK.clear();
		LangMods.Quark.quarkRockLang(LANG_ROCK, "fr_fr");
		LangMods.Quark.quarkLeaveLang(LANG_LEAVE, "fr_fr");

		lang_searcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, "fr_fr");
		lang_searcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, "fr_fr",
				List.of(Compatibilities.MCW_BRIDGES_MODID, Compatibilities.MCW_FENCES_MODID, Compatibilities.MCW_ROOFS_MODID));
		
		System.out.println("Lang Finish !");
		
		System.out.println("Quark Finish !");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sandstone_bricks", "\"quark:smooth_sandstone_bricks\"", "\"minecraft:smooth_sandstone\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_sandstone_bricks", "\"quark:smooth_red_sandstone_bricks\"", "\"minecraft:smooth_red_sandstone\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "soul_sandstone_bricks", "\"quark:smooth_soul_sandstone_bricks\"", "\"quark:smooth_soul_sandstone\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "andesite_bricks", "\"quark:andesite\"", "\"minecraft:andesite\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "granite_bricks", "\"quark:granite\"", "\"minecraft:granite\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "diorite_bricks", "\"quark:diorite\"", "\"minecraft:diorite\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "magma_bricks", "\"quark:magma_block\"", "\"minecraft:magma_block\"");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "marble_bricks", "\"quark:marble_brick_", "\"quark:marble_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "biotite_bricks", "\"quark:biotite_brick_", "\"quark:biotite_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sandstone_bricks", "\"quark:sandstone_brick_", "\"quark:sandstone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_sandstone_bricks", "\"quark:red_sandstone_brick_", "\"quark:red_sandstone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "soul_sandstone_bricks", "\"quark:soul_sandstone_brick_", "\"quark:soul_sandstone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "jasper_bricks", "\"quark:jasper_brick_", "\"quark:jasper_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "permafrost_bricks", "\"quark:permafrost_brick_", "\"quark:permafrost_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "magma_bricks", "\"quark:magma_brick_", "\"quark:magma_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "andesite_bricks", "\"quark:andesite_brick_", "\"quark:andesite_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "diorite_bricks", "\"quark:diorite_brick_", "\"quark:diorite_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "granite_bricks", "\"quark:granite_brick_", "\"quark:granite_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "limestone_bricks", "\"quark:limestone_brick_", "\"quark:limestone_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "slate_bricks", "\"quark:slate_brick_", "\"quark:slate_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "elder_prismarine_bricks", "\"quark:elder_prismarine_brick_", "\"quark:elder_prismarine_bricks_");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "basalt_bricks", "\"quark:basalt_brick_", "\"quark:basalt_bricks_");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "biotite_bricks", "\"quark:biotite_bricks_wall", "\"quark:biotite_block_vertical_slab");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "biotite_bricks", "\"quark:biotite_bricks_slab", "\"quark:biotite_block_slab");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "elder_prismarine_bricks", "\"quark:elder_prismarine_bricks_wall", "\"quark:elder_prismarine_wall");

		for(String folderInModel : ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList())
		{
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "soul_sandstone_bricks", "soul_sandstone_bricks_top", "soul_sandstone_bricks");
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "red_sandstone_bricks", "red_sandstone_bricks_top", "red_sandstone_bricks");
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "sandstone_bricks", "sandstone_bricks_top", "sandstone_bricks");
		}

	}
	
}