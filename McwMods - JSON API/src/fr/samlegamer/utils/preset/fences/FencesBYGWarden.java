package fr.samlegamer.utils.preset.fences;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwMain;
import fr.samlegamer.api.code.fences.FencesCodeGeneratorFabric;
import fr.samlegamer.api.code.fences.FencesCodeGeneratorForge;
import fr.samlegamer.api.code.fences.FencesTabBuild;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;

/*
 * Only for 1.19/1.19.3
 * For 1.16.5/1.18.2 use FencesBYG
 * For 1.20.1 use FencesBWG
 */
public class FencesBYGWarden extends FencesBWG
{
	/*
	 * NOT FINISHED
	 */
	public FencesBYGWarden(boolean isFabric)
	{
		super(isFabric);
	}

	@Override
	public void init(String LOCATION)
	{
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		String CompatModid = Compatibilities.BYG_FENCES_MODID;
		String ClassBlockRegistry = "MFBYGBlocksRegistry";
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
		forge.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		forge.registerBlockLog(LOCATION, MAT_WOOD, true, true);
		forge.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		forge.registerBlockStone(LOCATION, MAT_ROCK, true, true);
		fabric.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		fabric.registerBlockLog(LOCATION, MAT_WOOD, true, true);
		fabric.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		fabric.registerBlockStone(LOCATION, MAT_ROCK, true, true);
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
		tab.builderToAddWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		tab.builderToAddStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		tab.fabricWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		tab.fabricStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		System.out.println("Done Generate AddTabs");

		System.out.println("Start Generate English Files");
		English.BYG.bygLeaves120Lang(LEAVES_LANG);
		English.BYG.byg120Lang(MAJ_WOOD);
		English.BYG.bygRockLang120(MAJ_ROCK);
		McwMain.chargeLangEnglish(new FencesLangGenerator(LEAVES, LEAVES_LANG));
		System.out.println("Done Generate English Files");

		System.out.println("Start Generate French Files");
		McwAPI.clears(MAJ_WOOD, MAJ_ROCK, LEAVES_LANG);
		French.BYG.bygLeaves120Lang(LEAVES_LANG);
		French.BYG.byg120Lang(MAJ_WOOD);
		French.BYG.bygRockLang120(MAJ_ROCK);
		McwMain.chargeLangFrench(new FencesLangGenerator(LEAVES, LEAVES_LANG));
		System.out.println("Done Generate French Files");
		System.out.println("Finish Registries");
	
	}
}