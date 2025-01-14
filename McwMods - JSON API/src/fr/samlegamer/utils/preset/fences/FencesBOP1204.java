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
 * Only for 1.20.4 or +
 * For 1.16.5/1.20 use FencesBOP
 */
public class FencesBOP1204 implements Presetting
{
	/*Instance*/
	protected static McwModsRessources client_wood;
	protected static McwDataGen data;
	protected String version;
	
	protected static final List<String> MAT_WOOD = new ArrayList<String>();
	protected static final List<String> MAJ_WOOD = new ArrayList<String>();
	protected static final List<String> LEAVES = new ArrayList<String>();
	protected static final List<String> LEAVES_LANG = new ArrayList<String>();
	
	protected void clearAll()
	{
		McwAPI.clears(MAT_WOOD, MAJ_WOOD, LEAVES, LEAVES_LANG);
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
	
	protected void genWoodBOP(String LOCATION, String CompatModid, List<String> MAT_WOOD, String TextureLocationFormodid, String ModidOfBaseMod, boolean isStem)
	{
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, isStem);
		data.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
	}
	
	public FencesBOP1204(String ver)
	{
		this.version=ver;
	}
	
	public FencesBOP1204()
	{
		this("1.20");
	}
	
	@Override
	public void init(String LOCATION)
	{
		clearAll();
		data = new McwDataGen(Compatibilities.MCW_FENCES_MODID, version);
		client_wood = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);
		String ClassBlockRegistry = "MFBOPBlocksRegistry";
		String TextureLocationFormodid = Compatibilities.BOP_TEXTURES;
		String ModidOfBaseMod = Compatibilities.BOP_MODID;
		String CompatModid = Compatibilities.BOP_FENCES_MODID;
		System.out.println("Start Wood Data/Client");
		ModsList.bop1201(MAT_WOOD);
		genWoodBOP(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, false);
		MAT_WOOD.clear();
		System.out.println("Done Wood Data/Client");

		System.out.println("Start Leaves Hedges Data/Client");
		ModsList.bopLeaves1201(LEAVES);
		genHedges(LOCATION, CompatModid, LEAVES, TextureLocationFormodid, ModidOfBaseMod);
		LEAVES.clear();
		System.out.println("Done Leaves Hedges Data/Client");

		System.out.println("Start Generate Code Wood/Hedge");
		ModsList.bop1201(MAT_WOOD);
		ModsList.bopLeaves1201(LEAVES);
		FencesCodeGeneratorForge forge = new FencesCodeGeneratorForge(LEAVES);
		FencesCodeGeneratorFabric fabric = new FencesCodeGeneratorFabric(LEAVES);
		fabric.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		fabric.registerBlockLog(LOCATION, MAT_WOOD, true, true);
		forge.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		forge.registerBlockLog(LOCATION, MAT_WOOD, true, true);
		System.out.println("Done Generate Code Wood/Hedge");

		System.out.println("Start Generate Tags");
		FencesTagsGenerator tags = new FencesTagsGenerator(LEAVES);
		tags.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tags.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		System.out.println("Done Generate Tags");

		System.out.println("Start Generate AddTabs");
		FencesTabBuild tab = new FencesTabBuild(LEAVES);
		FencesTabBuild tab2 = new FencesTabBuild(LEAVES);
		tab.fabricWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		tab2.builderToAddWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		System.out.println("Done Generate AddTabs");

		System.out.println("Start Generate English Files");
		English.BOP.bopLeaves1204Lang(LEAVES_LANG);
		English.BOP.bop1204Lang(MAJ_WOOD);
		
		FencesLangGenerator english = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		english.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		System.out.println("Done Generate English Files");

		System.out.println("Start Generate French Files");
		McwAPI.clears(MAJ_WOOD, LEAVES_LANG);
		French.BOP.bopLeaves1204Lang(LEAVES_LANG);
		French.BOP.bop1204Lang(MAJ_WOOD);
		FencesLangGenerator french = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		french.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		System.out.println("Done Generate French Files");
		System.out.println("Finish Registries");
	}
}