package fr.samlegamer.utils.preset.bridges;

import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.code.bridges.BridgesCodeGeneratorForge;
import fr.samlegamer.api.code.bridges.BridgesTabBuild;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.bridges.BridgesTagsGenerator;
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;

public class BridgesAbnormals implements Presetting
{
	/*Instance*/
	private static final McwModsRessources client_wood = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
	private static final McwModsRessources client_stone = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE);
	private static final McwDataGen data = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);
	
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
		String CompatModid = Compatibilities.ABNORMALS_BRIDGES_MODID;
		String txtLocMod, ModidOfBaseMod;
		String ClassBlockRegistry = "MBABlocksRegistry";
		System.out.println("Start Wood Client");
		MAT_WOOD.add("aspen");
		MAT_WOOD.add("grimwood");
		MAT_WOOD.add("kousa");
		MAT_WOOD.add("morado");
		MAT_WOOD.add("rosewood");
		MAT_WOOD.add("yucca");
		txtLocMod = "atmospheric:block";
		ModidOfBaseMod = "atmospheric";
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		MAT_WOOD.clear();

		MAT_WOOD.add("maple");
		txtLocMod = "autumnity:block";
		ModidOfBaseMod = "autumnity";
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		MAT_WOOD.clear();

		MAT_WOOD.add("cherry");
		MAT_WOOD.add("wisteria");
		MAT_WOOD.add("willow");
		txtLocMod = "environmental:block";
		ModidOfBaseMod = "environmental";
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		MAT_WOOD.clear();

		MAT_WOOD.add("driftwood");
		MAT_WOOD.add("river");
		txtLocMod = "upgrade_aquatic:block";
		ModidOfBaseMod = "upgrade_aquatic";
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		MAT_WOOD.clear();

		MAT_WOOD.add("poise");
		txtLocMod = "endergetic:block";
		ModidOfBaseMod = "endergetic";
		client_wood.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, true);
		client_wood.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
		MAT_WOOD.clear();
		System.out.println("Done Wood Client");

		System.out.println("Start Stone Client");
		MAT_ROCK.add("honeycomb_brick");
		MAT_ROCK.add("honeycomb_tile");
		WALL.add("honeycomb_bricks");
		WALL.add("honeycomb_tiles");
		FLOOR.add("honeycomb_block");
		FLOOR.add("honeycomb_bricks");
		txtLocMod = "buzzier_bees:block";
		ModidOfBaseMod = "buzzier_bees";
		client_stone.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
		client_stone.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
		data.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		MAT_ROCK.clear();
		WALL.clear();
		FLOOR.clear();
		
		MAT_ROCK.add("red_arid_sandstone");
		MAT_ROCK.add("arid_sandstone");
		WALL.add("red_arid_sandstone");
		WALL.add("arid_sandstone");
		FLOOR.add("arid_sand");
		FLOOR.add("red_arid_sand");
		txtLocMod = "atmospheric:block";
		ModidOfBaseMod = "atmospheric";
		client_stone.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
		client_stone.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
		data.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		MAT_ROCK.clear();
		WALL.clear();
		FLOOR.clear();

		MAT_ROCK.add("snail_shell_bricks");
		MAT_ROCK.add("snail_shell_tiles");
		WALL.add("snail_shell_bricks");
		WALL.add("snail_shell_tiles");
		FLOOR.add("snail_shell_block_stripes");
		FLOOR.add("snail_shell_bricks");
		txtLocMod = "autumnity:block";
		ModidOfBaseMod = "autumnity";
		client_stone.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		client_stone.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
		client_stone.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		data.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		data.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
		data.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		MAT_ROCK.clear();
		WALL.clear();
		FLOOR.clear();
		System.out.println("Done Stone Client");

		System.out.println("Start Data/Tags/Lang/ForgeCode");
		ModsList.abnormalsWood(MAT_WOOD);
		ModsList.abnormalsRock(MAT_ROCK);
		English.Abnormals.abnormalsWoodLang(MAJ_WOOD);
		English.Abnormals.abnormalsRockLang(MAJ_ROCK);
		BridgesTagsGenerator tag = new BridgesTagsGenerator();
		BridgesLangGenerator lang = new BridgesLangGenerator();
		BridgesTabBuild tab = new BridgesTabBuild();
		/*Missing custom createBlock*/
		BridgesCodeGeneratorForge forge = new BridgesCodeGeneratorForge();
		tag.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag.TagsRock(LOCATION, CompatModid, MAT_ROCK);
		tab.builderToAddWood(LOCATION, MAT_WOOD, ClassBlockRegistry);
		tab.builderToAddStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		forge.registerBlockLogIsCharged(LOCATION, MAT_WOOD, ModidOfBaseMod, false, false);
		forge.InitRendersLog(LOCATION, MAT_WOOD, ClassBlockRegistry);
		forge.registerBlockStoneIsCharged(LOCATION, MAT_ROCK, ModidOfBaseMod, false, false);
		forge.InitRendersStone(LOCATION, MAT_ROCK, ClassBlockRegistry);
		lang.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		lang.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
		System.out.println("Done Data/Tags/Lang/ForgeCode");
		System.out.println("Finish Abnormals Registries");
	}
}