package fr.samlegamer.utils.preset.fences;

import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.code.fences.*;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;

/*
 * Only for 1.20.1
 * For 1.16.5/1.18.2 use FencesBYG
 * For 1.19/1.19.3 use FencesBYGWarden
 */
public class FencesBWG implements Presetting
{
	/*Instance*/
	protected static final McwModsRessources client_wood = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
	protected static final McwModsRessources client_stone = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE);
	protected static final McwDataGen data = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
	
	protected static final List<String> MAT_WOOD = new ArrayList<String>();
	protected static final List<String> MAT_ROCK = new ArrayList<String>();
	protected static final List<String> WALL = new ArrayList<String>();
	protected static final List<String> FLOOR = new ArrayList<String>();
	protected static final List<String> MAJ_WOOD = new ArrayList<String>();
	protected static final List<String> MAJ_ROCK = new ArrayList<String>();
	protected static final List<String> LEAVES = new ArrayList<String>();
	protected static final List<String> LEAVES_LANG = new ArrayList<String>();
	protected boolean fbric;
	
	public FencesBWG(boolean isFabric)
	{
		this.fbric = isFabric;
	}
	
	protected void clearAll()
	{
		McwAPI.clears(MAT_WOOD, MAT_ROCK, WALL, FLOOR, MAJ_WOOD, MAJ_ROCK, LEAVES, LEAVES_LANG);
	}
	
	protected void genHedges(String LOCATION, String CompatModid, List<String> LEAVES, String TextureLocationFormodid, String ModidOfBaseMod, boolean normalFolder)
	{
		client_wood.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		if(normalFolder)
		{
			client_wood.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
		}
		else {
			client_wood.createWoodCustomModelsBlocksBYGSettingwithResearch(LOCATION, TextureLocationFormodid, LEAVES, "planks", "log", "stripped_log", "leaves", "acacia_wall");
		}
		client_wood.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
		data.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.RecipesLogAllwithResearch(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge");
	}
	
	protected void genWoodBYG(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodCustomModelsBlocksBYGSetting(LOCATION, TextureLocationFormodid, MAT_WOOD, "planks", isStem ? "stem" : "log", isStem ? "stripped_stem" : "stripped_log");
		data.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}

	protected void genStoneBYG(String LOCATION, String CompatModid, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String TextureLocationFormodid, String ModidOfBaseMod)
	{
		client_stone.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, MAT_ROCK, WALL, FLOOR);
		client_stone.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.RecipesStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
	}
	
	@Override
	public void init(String LOCATION)
	{
		clearAll();
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		String ClassBlockRegistry = "MFBYGBlocksRegistry";
		String TextureLocationFormodid = Compatibilities.BYG_TEXTURES_120;
		String ModidOfBaseMod = Compatibilities.BYG_MODID_120;
		String CompatModid = fbric ? Compatibilities.BYG_FENCES_MODID_FABRIC : Compatibilities.BYG_FENCES_MODID;
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

		System.out.println("Start Leaves Hedges Data/Client");
		ModsList.bygLeaves120(LEAVES, false);
		genHedges(LOCATION, CompatModid, LEAVES, TextureLocationFormodid, ModidOfBaseMod, false);
		LEAVES.clear();
		ModsList.bygLeaves120(LEAVES, true);
		genHedges(LOCATION, CompatModid, LEAVES, TextureLocationFormodid, ModidOfBaseMod, true);
		McwAPI.clears(LEAVES, MAT_WOOD);
		System.out.println("Done Leaves Hedges Data/Client");

		System.out.println("Start Generate Code Wood/Hedge/Stone");
		ModsList.byg120(MAT_WOOD);
		ModsList.bygLeaves120(LEAVES);
		FencesCodeGeneratorForge forge = new FencesCodeGeneratorForge(LEAVES);
		FencesCodeGeneratorFabric fabric = new FencesCodeGeneratorFabric(LEAVES);
		if(fbric)
		{
			fabric.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
			fabric.registerBlockLog(LOCATION, MAT_WOOD, true, true);
			fabric.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
			fabric.registerBlockStone(LOCATION, MAT_ROCK, true, true);
		}
		else
		{
			forge.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
			forge.registerBlockLog(LOCATION, MAT_WOOD, true, true);
			forge.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
			forge.registerBlockStone(LOCATION, MAT_ROCK, true, true);
		}
		System.out.println("Done Generate Code Wood/Hedge/Stone");

		System.out.println("Start Generate Tags");
		FencesTagsGenerator tags = new FencesTagsGenerator(true, MAT_ROCK, LEAVES);
		tags.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tags.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		System.out.println("Done Generate Tags");

		System.out.println("Start Generate AddTabs");
		FencesTabBuild tab = new FencesTabBuild(LEAVES);
		FencesTabBuild tab2 = new FencesTabBuild(LEAVES);
		if(fbric)
		{
			tab.fabricWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
			tab.fabricStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		}
		else
		{
			tab2.builderToAddWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
			tab2.builderToAddStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		}
		System.out.println("Done Generate AddTabs");

		System.out.println("Start Generate English Files");
		English.BYG.bygLeaves120Lang(LEAVES_LANG);
		English.BYG.byg120Lang(MAJ_WOOD);
		English.BYG.bygRockLang120(MAJ_ROCK);
		
		FencesLangGenerator english = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		english.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		english.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		System.out.println("Done Generate English Files");

		System.out.println("Start Generate French Files");
		McwAPI.clears(MAJ_WOOD, MAJ_ROCK, LEAVES_LANG);
		French.BYG.bygLeaves120Lang(LEAVES_LANG);
		French.BYG.byg120Lang(MAJ_WOOD);
		French.BYG.bygRockLang120(MAJ_ROCK);
		FencesLangGenerator french = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		french.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		french.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		System.out.println("Done Generate French Files");
		System.out.println("Finish Registries");
	}
}