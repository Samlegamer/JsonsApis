package fr.samlegamer.utils;

import java.util.List;

import fr.samlegamer.api.code.bridges.MBTabBuild;
import fr.samlegamer.api.inits.InitAllBridges;

public class UtilsModsList
{
	public static class Abnormals implements IUtils
	{
		@Override
		public void eventAcceptTab(String LOCATION, List<String> MAT_WOOD, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String ClassMod)
		{
			ModsList.abnormalsWood(MAT_WOOD);
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR);
			MBTabBuild mb = new MBTabBuild();
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
			InitAllBridges.WardenAllWood(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_WOOD, MAJ_MAT, false);
			MAT_WOOD.clear();

			MAT_WOOD.add("maple");
			txtLocMod = "autumnity:block";
			InitAllBridges.WardenAllWood(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_WOOD, MAJ_MAT, false);
			MAT_WOOD.clear();

			MAT_WOOD.add("cherry");
			MAT_WOOD.add("wisteria");
			MAT_WOOD.add("willow");
			txtLocMod = "environmental:block";
			InitAllBridges.WardenAllWood(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_WOOD, MAJ_MAT, false);
			MAT_WOOD.clear();

			MAT_WOOD.add("driftwood");
			MAT_WOOD.add("river");
			txtLocMod = "upgrade_aquatic:block";
			InitAllBridges.WardenAllWood(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_WOOD, MAJ_MAT, false);
			MAT_WOOD.clear();

			MAT_WOOD.add("poise");
			txtLocMod = "endergetic:block";
			InitAllBridges.WardenAllWood(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_WOOD, MAJ_MAT, true);
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
			InitAllBridges.WardenAllRock(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_ROCK, WALL, FLOOR);
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
			InitAllBridges.WardenAllRock(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_ROCK, WALL, FLOOR);
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
			InitAllBridges.WardenAllRock(LOCATION, CompatModid, txtLocMod, ModidExtended, MAT_ROCK, WALL, FLOOR);
			MAT_ROCK.clear();
			WALL.clear();
			FLOOR.clear();
		}
		
		
	}
}