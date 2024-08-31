package fr.samlegamer.utils.preset.fences;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.code.fences.FencesCodeGeneratorForge;
import fr.samlegamer.api.code.fences.FencesTabBuild;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;

public class FencesBOP extends FencesBOP1204
{
	protected boolean cherry;
	
	/*
	 * Set boolean to false for 1.19.4 and below
	 */
	public FencesBOP(boolean cherryVanilla)
	{
		super();
		this.cherry = cherryVanilla;
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
		ModsList.bop(MAT_WOOD, this.cherry);
		genWoodBOP(LOCATION, CompatModid, MAT_WOOD, TextureLocationFormodid, ModidOfBaseMod, false);
		MAT_WOOD.clear();
		System.out.println("Done Wood Data/Client");

		System.out.println("Start Leaves Hedges Data/Client");
		ModsList.bopLeaves(LEAVES, this.cherry);
		genHedges(LOCATION, CompatModid, LEAVES, TextureLocationFormodid, ModidOfBaseMod);
		LEAVES.clear();
		System.out.println("Done Leaves Hedges Data/Client");

		System.out.println("Start Generate Code Wood/Hedge");
		ModsList.bop(MAT_WOOD, this.cherry);
		ModsList.bopLeaves(LEAVES, this.cherry);
		FencesCodeGeneratorForge forge = new FencesCodeGeneratorForge(LEAVES);
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
		FencesTabBuild tab2 = new FencesTabBuild(LEAVES);
		tab2.builderToAddWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		System.out.println("Done Generate AddTabs");

		System.out.println("Start Generate English Files");
		English.BOP.bopLeavesLang(LEAVES_LANG, this.cherry);
		English.BOP.bopLang(MAJ_WOOD, this.cherry);
		FencesLangGenerator english = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		english.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		System.out.println("Done Generate English Files");

		System.out.println("Start Generate French Files");
		McwAPI.clears(MAJ_WOOD, LEAVES_LANG);
		French.BOP.bopLeavesLang(LEAVES_LANG, this.cherry);
		French.BOP.bopLang(MAJ_WOOD, this.cherry);
		FencesLangGenerator french = new FencesLangGenerator(LEAVES, LEAVES_LANG);
		french.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		System.out.println("Done Generate French Files");
		System.out.println("Finish Registries");
	}
}