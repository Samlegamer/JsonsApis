package fr.samlegamer.utils.preset.fences;

import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.api.code.fences.FencesCodeGeneratorForge;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;

public class FencesBYG extends FencesBYGWarden
{
	protected void genWoodBYG(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, isStem);
		data.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}
	
	public FencesBYG()
	{
		/*Fabric is only for 1.19+*/
		super(false);
	}
	
	@Override
	public void init(String LOCATION)
	{
		clearAll();
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		String ClassBlockRegistry = "MFBYGBlocksRegistry";
		String TextureLocationFormodid = Compatibilities.BYG_TEXTURES;
		String ModidOfBaseMod = Compatibilities.BYG_MODID;
		String CompatModid = Compatibilities.BYG_FENCES_MODID;
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

		System.out.println("Start Leaves Hedges Data/Client");
		ModsList.bygLeaves(LEAVES);
		genHedges(LOCATION, CompatModid, LEAVES, TextureLocationFormodid, ModidOfBaseMod, true);
		McwAPI.clears(LEAVES, MAT_WOOD);
		System.out.println("Done Leaves Hedges Data/Client");

		System.out.println("Start Generate Code Wood/Hedge/Stone");
		ModsList.byg(MAT_WOOD);
		ModsList.bygLeaves(LEAVES);
		FencesCodeGeneratorForge forge = new FencesCodeGeneratorForge(LEAVES);
		forge.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		forge.registerBlockLog(LOCATION, MAT_WOOD, false, false);
		forge.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		forge.registerBlockStone(LOCATION, MAT_ROCK, false, false);
		System.out.println("Done Generate Code Wood/Hedge/Stone");

		System.out.println("Start Generate Tags");
		FencesTagsGenerator tags = new FencesTagsGenerator(true, MAT_ROCK, LEAVES);
		tags.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tags.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		System.out.println("Done Generate Tags");

		System.out.println("Start Generate English Files");
		English.BYG.bygLeavesLang(LEAVES_LANG);
		English.BYG.bygLang(MAJ_WOOD);
		English.BYG.bygRockFenceableLang(MAJ_ROCK);
		
		FencesLangGenerator english = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		english.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		english.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		System.out.println("Done Generate English Files");

		System.out.println("Start Generate French Files");
		McwAPI.clears(MAJ_WOOD, MAJ_ROCK, LEAVES_LANG);
		French.BYG.bygLeavesLang(LEAVES_LANG);
		French.BYG.bygLang(MAJ_WOOD);
		French.BYG.bygRockFenceableLang(MAJ_ROCK);
		FencesLangGenerator french = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		french.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		french.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		System.out.println("Done Generate French Files");
		System.out.println("Finish Registries");
	}
}
