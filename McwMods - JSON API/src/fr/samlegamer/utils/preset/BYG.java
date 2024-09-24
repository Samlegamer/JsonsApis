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
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.FurnituresLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.preset.bridges.BridgesBYG;
import fr.samlegamer.utils.preset.fences.FencesBYG;

public class BYG implements Presetting
{
	protected static final McwModsRessources client_wood = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
	protected static final McwModsRessources client_stone = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
	protected static final McwDataGen data = new McwDataGen(Compatibilities.MCW_ROOFS_MODID);

	
	protected static final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
	protected static final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);

	protected static final List<String> MAT_WOOD = new ArrayList<String>();
	protected static final List<String> MAT_ROCK = new ArrayList<String>();
	protected static final List<String> WALL = new ArrayList<String>();
	protected static final List<String> FLOOR = new ArrayList<String>();
	protected static final List<String> MAJ_WOOD = new ArrayList<String>();
	protected static final List<String> MAJ_ROCK = new ArrayList<String>();
	protected static final List<String> LEAVES = new ArrayList<String>();
	protected static final List<String> LEAVES_LANG = new ArrayList<String>();
	protected boolean fbric;
	
	protected void genWoodBYGFurnitures(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client_wood_furnitures.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, isStem);
		data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data_furnitures.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}
	
	protected void genWoodBYG(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, isStem);
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
		data.RecipesStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, WALL);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
	}


	@Override
	public void init(String LOCATION)
	{
		BridgesBYG bridges = new BridgesBYG();
		bridges.init(LOCATION);
		FencesBYG fences = new FencesBYG();
		fences.init(LOCATION);
		
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);

		//String ClassBlockRegistry = "MFBYGBlocksRegistry";
		String TextureLocationFormodid = Compatibilities.BYG_TEXTURES;
		String ModidOfBaseMod = Compatibilities.BYG_MODID;
		String CompatModid = "mcwbyg";
		System.out.println("Start Wood Data/Client");
		ModsList.byg(MAT_WOOD, false);
		genWoodBYG(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, false);
		MAT_WOOD.clear();
		ModsList.byg(MAT_WOOD, true);
		genWoodBYG(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, true);
		MAT_WOOD.clear();
		System.out.println("Done Wood Data/Client");

		System.out.println("Start Stone Data/Client");
		ModsList.bygRockFenceable(MAT_ROCK, WALL, FLOOR);
		genStoneBYG(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, TextureLocationFormodid, ModidOfBaseMod);
		System.out.println("Done Stone Data/Client");
		
		
		System.out.println("Start Wood Data/Client");
		ModsList.byg(MAT_WOOD, false);
		genWoodBYGFurnitures(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, false);
		MAT_WOOD.clear();
		ModsList.byg(MAT_WOOD, true);
		genWoodBYGFurnitures(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, true);
		MAT_WOOD.clear();
		System.out.println("Done Wood Data/Client");
		


		System.out.println("Start Generate Code Wood/Hedge/Stone");
		ModsList.byg(MAT_WOOD);
		ModsList.bygLeaves(LEAVES);
		/*FencesCodeGeneratorForge forge = new FencesCodeGeneratorForge(LEAVES);
		forge.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		forge.registerBlockLog(LOCATION, MAT_WOOD, false, false);
		forge.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		forge.registerBlockStone(LOCATION, MAT_ROCK, false, false);
		System.out.println("Done Generate Code Wood/Hedge/Stone");*/

		System.out.println("Start Generate Tags");
		FencesTagsGenerator tags = new FencesTagsGenerator(true, MAT_ROCK, LEAVES);
		FurnituresTagsGenerator tags_furni = new FurnituresTagsGenerator();
		RoofsTagsGenerator tags_roof = new RoofsTagsGenerator();
		tags.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tags.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tags_furni.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags_furni.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags_roof.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags_roof.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		System.out.println("Done Generate Tags");

		System.out.println("Start Generate English Files");
		English.BYG.bygLeavesLang(LEAVES_LANG);
		English.BYG.bygLang(MAJ_WOOD);
		English.BYG.bygRockFenceableLang(MAJ_ROCK);
		
		FencesLangGenerator english = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		FurnituresLangGenerator english_furni = new FurnituresLangGenerator();
		RoofsLangGenerator english_roof = new RoofsLangGenerator();
		english.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		english.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		english_furni.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		english_roof.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		english_roof.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		System.out.println("Done Generate English Files");

		System.out.println("Start Generate French Files");
		McwAPI.clears(MAJ_WOOD, MAJ_ROCK, LEAVES_LANG);
		French.BYG.bygLeavesLang(LEAVES_LANG);
		French.BYG.bygLang(MAJ_WOOD);
		French.BYG.bygRockFenceableLang(MAJ_ROCK);
		FencesLangGenerator french = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		FurnituresLangGenerator french_furni = new FurnituresLangGenerator();
		RoofsLangGenerator french_roof = new RoofsLangGenerator();
		french.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		french.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		french_furni.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		french_roof.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		french_roof.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		System.out.println("Done Generate French Files");
		System.out.println("Finish Registries");


	}
}
