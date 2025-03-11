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
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.IModFiles.ILang;
import fr.samlegamer.utils.IModFiles.ITagData;
import fr.samlegamer.utils.JsonsUtils;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;

public class QuarkNether implements Presetting
{
	/*Instance*/
	protected static McwModsRessources client_wood;
	protected static McwModsRessources client_stone;
	protected static McwDataGen data;
	
	protected static final List<String> MAT_WOOD = new ArrayList<String>();
	protected static final List<String> MAT_ROCK = new ArrayList<String>();
	protected static final List<String> WALL = new ArrayList<String>();
	protected static final List<String> FLOOR = new ArrayList<String>();
	protected static final List<String> MAJ_WOOD = new ArrayList<String>();
	protected static final List<String> MAJ_ROCK = new ArrayList<String>();
	protected static final List<String> LEAVES = new ArrayList<String>();
	protected static final List<String> LEAVES_LANG = new ArrayList<String>();
	private final ModLoaders modLoader = ModLoaders.FORGE;

	protected void clearAll()
	{
		McwAPI.clears(MAT_WOOD, MAT_ROCK, WALL, FLOOR, MAJ_WOOD, MAJ_ROCK, LEAVES, LEAVES_LANG);
	}

	protected void genHedges(String LOCATION, String CompatModid, List<String> LEAVES, String TextureLocationFormodid, String ModidOfBaseMod, McwModsRessources client, McwDataGen dat)
	{
		client.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		client.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
		client.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		dat.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		dat.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		dat.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
	}

	protected void genStoneBYG(String LOCATION, String CompatModid, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String TextureLocationFormodid, String ModidOfBaseMod, String compat, 
	McwModsRessources client, McwDataGen dat)
	{
		client.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, MAT_ROCK, WALL, FLOOR);
		client.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		dat.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, compat, ModidOfBaseMod, modLoader);
		dat.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, compat, ModidOfBaseMod, modLoader);
		dat.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
	}
	
	protected void genLangStoneEn(String CompatModid, ILang lang)
	{
		lang.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
	}
	
	protected void genLangStoneFr(String CompatModid, ILang lang)
	{
		lang.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
	}
	
	protected void genTagStone(String LOCATION, String CompatModid, ITagData tag)
	{
		tag.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag.TagsRock(LOCATION, CompatModid, MAT_ROCK);
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
		
		ModsList.quarkRock(MAT_ROCK, WALL, FLOOR);
		ModsList.quarkLeaves(LEAVES);

		System.out.println("Ressources/Data Loading...");
		genStoneBYG(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
				new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE),
				new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
		final McwDataGen data_fence = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
		genStoneBYG(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID,
				new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE), data_fence);
		genHedges(LOCATION, CompatModid, LEAVES, TextureLocationFormodid, ModidOfBaseMod, new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD), data_fence);

		genStoneBYG(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID,
				new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
				new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
		System.out.println("Ressources/Data Finish !");

		System.out.println("Tags Loading...");
		final FencesTagsGenerator tag_fences = new FencesTagsGenerator(true, MAT_ROCK, LEAVES);
		genTagStone(LOCATION, CompatModid, tag_fences);
		tag_fences.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag_fences.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		genTagStone(LOCATION, CompatModid, new RoofsTagsGenerator());
		genTagStone(LOCATION, CompatModid, new BridgesTagsGenerator());
		System.out.println("Tags Finish !");
		
		English.Quark.quarkRockLang(MAJ_ROCK);
		English.Quark.quarkLeavesLang(LEAVES_LANG);

		System.out.println("Lang Loading...");
		final FencesLangGenerator lang_fences = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		lang_fences.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		genLangStoneEn(CompatModid, lang_fences);
		genLangStoneEn(CompatModid, new RoofsLangGenerator());
		genLangStoneEn(CompatModid, new BridgesLangGenerator());
		
		LEAVES_LANG.clear();
		MAJ_ROCK.clear();
		French.Quark.quarkRockLang(MAJ_ROCK);
		French.Quark.quarkLeavesLang(LEAVES_LANG);
		lang_fences.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		genLangStoneFr(CompatModid, lang_fences);
		genLangStoneFr(CompatModid, new RoofsLangGenerator());
		genLangStoneFr(CompatModid, new BridgesLangGenerator());
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

		for(String folderInModel : McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList())
		{
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "soul_sandstone_bricks", "soul_sandstone_bricks_top", "soul_sandstone_bricks");
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "red_sandstone_bricks", "red_sandstone_bricks_top", "red_sandstone_bricks");
			JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "sandstone_bricks", "sandstone_bricks_top", "sandstone_bricks");
		}

	}
	
}