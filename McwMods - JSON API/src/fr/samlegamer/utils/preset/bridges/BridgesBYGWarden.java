package fr.samlegamer.utils.preset.bridges;

import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.code.bridges.BridgesCodeGeneratorFabric;
import fr.samlegamer.api.code.bridges.BridgesCodeGeneratorForge;
import fr.samlegamer.api.code.bridges.BridgesTabBuild;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.bridges.BridgesTagsGenerator;
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;

/*
 * Only for 1.19/1.19.3
 * For 1.16.5/1.18.2 use BridgesBYG
 * For 1.20.1 use BridgesBWG
 */
public class BridgesBYGWarden implements Presetting
{
	/*Instance*/
	private static final McwModsRessources client_wood = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
	private static final McwModsRessources client_stone = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE);
	private static final IModFiles.IData data = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> MAT_WOOD = new ArrayList<String>();
		List<String> MAT_ROCK = new ArrayList<String>();
		List<String> WALL = new ArrayList<String>();
		List<String> FLOOR = new ArrayList<String>();
		List<String> MAJ_WOOD = new ArrayList<String>();
		List<String> MAJ_ROCK = new ArrayList<String>();
		String CompatModid = Compatibilities.BYG_BRIDGES_MODID;
		String ClassBlockRegistry = "MBBYGBlocksRegistry";
		System.out.println("Start Wood Client");
		String txtLocMod = Compatibilities.BYG_TEXTURES;
		String ModidOfBaseMod = Compatibilities.BYG_MODID;
		ModsList.bygWildUp(MAT_WOOD);
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodCustomModelsBlocksBYGSetting(LOCATION, txtLocMod, MAT_WOOD, "planks", "log", "stripped_log");
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		MAT_WOOD.clear();
		ModsList.bygWildUp(MAT_WOOD, false);
		data.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		MAT_WOOD.clear();
		ModsList.bygWildUp(MAT_WOOD, true);
		data.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data.RecipesLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
		MAT_WOOD.clear();
		System.out.println("Done Wood Client");
		System.out.println("Start Stone Client");
		ModsList.bygRock(MAT_ROCK, WALL, FLOOR);
		client_stone.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
		client_stone.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
		data.RecipesStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		MAT_ROCK.clear();
		WALL.clear();
		FLOOR.clear();
		System.out.println("Done Stone Client");
		System.out.println("Start Data/Tags/Lang/ForgeCode");
		ModsList.bygWildUp(MAT_WOOD);
		ModsList.bygRock(MAT_ROCK);
		English.BYG.bygLangWildUp(MAJ_WOOD);
		English.BYG.bygRockLang(MAJ_ROCK);
		BridgesTagsGenerator tag = new BridgesTagsGenerator();
		BridgesLangGenerator lang = new BridgesLangGenerator();
		BridgesTabBuild tab = new BridgesTabBuild();
		BridgesCodeGeneratorForge forge = new BridgesCodeGeneratorForge();
		BridgesCodeGeneratorFabric fabric = new BridgesCodeGeneratorFabric();
		tag.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		tab.builderToAddWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		tab.builderToAddStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		forge.registerBlockLog(LOCATION, MAT_WOOD, true, false);
		forge.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		forge.registerBlockStone(LOCATION, MAT_ROCK, true, false);
		forge.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		fabric.registerBlockLog(LOCATION, MAT_WOOD, true, false);
		fabric.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		fabric.registerBlockStone(LOCATION, MAT_ROCK, true, false);
		fabric.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		lang.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		MAJ_WOOD.clear();
		MAJ_ROCK.clear();
		French.BYG.bygLangWildUp(MAJ_WOOD);
		French.BYG.bygRockLang(MAJ_ROCK);
		lang.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
		System.out.println("Done Data/Tags/Lang/ForgeCode");
		System.out.println("Finish Registries");
	}
}