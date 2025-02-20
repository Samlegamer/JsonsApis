package fr.samlegamer.utils.preset;

import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.bridges.BridgesTagsGenerator;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.datagen.roofs.RoofsTagsGenerator;
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.registry.Compatibilities;
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
	
	protected void clearAll()
	{
		McwAPI.clears(MAT_WOOD, MAT_ROCK, WALL, FLOOR, MAJ_WOOD, MAJ_ROCK, LEAVES, LEAVES_LANG);
	}

	protected void genHedges(String LOCATION, String CompatModid, List<String> LEAVES, String TextureLocationFormodid, String ModidOfBaseMod)
	{
		client_wood.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		client_wood.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
		client_wood.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
		data.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.RecipesLogAllwithResearch(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge");
	}

	protected void genStoneBYG(String LOCATION, String CompatModid, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String TextureLocationFormodid, String ModidOfBaseMod)
	{
		client_stone.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, MAT_ROCK, WALL, FLOOR);
		client_stone.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.RecipesStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
	}
	
	@Override
	public void init(String LOCATION)
	{
		clearAll();
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		data = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);
		client_stone = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE);
		client_wood = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
		String TextureLocationFormodid = Compatibilities.QUARK_TEXTURE;
		String ModidOfBaseMod = Compatibilities.QUARK_MODID;
		String CompatModid = "mcwquark";
		ModsList.quarkRock(MAT_ROCK, WALL, FLOOR);
		genStoneBYG(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod);
		English.Quark.quarkRockLang(MAJ_ROCK);
		BridgesLangGenerator lang = new BridgesLangGenerator();
		lang.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		
		ModsList.quarkLeaves(LEAVES);
		English.Quark.quarkLeaves(LEAVES_LANG);
		data = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
		client_stone = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE);
		client_wood = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
		genStoneBYG(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod);
		genHedges(LOCATION, CompatModid, LEAVES, TextureLocationFormodid, ModidOfBaseMod);

		FencesLangGenerator lang2 = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		lang2.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		lang2.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		
		data = new McwDataGen(Compatibilities.MCW_ROOFS_MODID);
		client_stone = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
		client_wood = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
		genStoneBYG(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod);
		RoofsLangGenerator lang3 = new RoofsLangGenerator();
		lang3.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);

		RoofsTagsGenerator tag = new RoofsTagsGenerator();
		tag.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		
		BridgesTagsGenerator tag2 = new BridgesTagsGenerator();
		tag2.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag2.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		
		FencesTagsGenerator tag3 = new FencesTagsGenerator(true, MAT_ROCK, LEAVES);
		tag3.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag3.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag3.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
	}
	
}