package fr.samlegamer.utils;

import java.util.List;
import fr.samlegamer.api.code.bridges.BridgesTabBuild;

public class UtilsModsList
{
	public static class Abnormals implements IUtils
	{
		/* Missing data */
		private IModFiles.IClient client;
		
		public Abnormals(IModFiles.IClient c)
		{
			this.client=c;
		}
		
		@Override
		public void eventAcceptTab(String LOCATION, List<String> MAT_WOOD, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String ClassMod)
		{
			ModsList.abnormalsWood(MAT_WOOD);
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR);
			BridgesTabBuild mb = new BridgesTabBuild();
			mb.builderToAddWood(LOCATION, MAT_WOOD, ClassMod);
			mb.builderToAddStone(LOCATION, MAT_ROCK, ClassMod);
		}

		@Override
		public void createWoodBridges(String LOCATION, String ModidExtended, List<String> MAT_WOOD, List<String> MAJ_MAT)
		{
			String CompatModid = "mcwbridgesabnormals";
			String txtLocMod = "";
			MAT_WOOD.add("aspen");
			MAT_WOOD.add("grimwood");
			MAT_WOOD.add("kousa");
			MAT_WOOD.add("morado");
			MAT_WOOD.add("rosewood");
			MAT_WOOD.add("yucca");
			txtLocMod = "atmospheric:block";
			client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);

			MAT_WOOD.clear();

			MAT_WOOD.add("maple");
			txtLocMod = "autumnity:block";
			client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			MAT_WOOD.clear();

			MAT_WOOD.add("cherry");
			MAT_WOOD.add("wisteria");
			MAT_WOOD.add("willow");
			txtLocMod = "environmental:block";
			client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			MAT_WOOD.clear();

			MAT_WOOD.add("driftwood");
			MAT_WOOD.add("river");
			txtLocMod = "upgrade_aquatic:block";
			client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, false);
			client.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			MAT_WOOD.clear();

			MAT_WOOD.add("poise");
			txtLocMod = "endergetic:block";
			client.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, true);
			client.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			MAT_WOOD.clear();
		}

		@Override
		public void createRockBridges(String LOCATION, String ModidExtended, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
		{
			String CompatModid = "mcwbridgesabnormals";
			String txtLocMod = "";
			MAT_ROCK.add("honeycomb_brick");
			MAT_ROCK.add("honeycomb_tile");
			WALL.add("honeycomb_bricks");
			WALL.add("honeycomb_tiles");
			FLOOR.add("honeycomb_block");
			FLOOR.add("honeycomb_bricks");
			txtLocMod = "buzzier_bees:block";
			client.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
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
			client.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
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
			client.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			MAT_ROCK.clear();
			WALL.clear();
			FLOOR.clear();
		}
		
		
	}
}