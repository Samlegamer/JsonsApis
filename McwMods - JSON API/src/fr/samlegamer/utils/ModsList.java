package fr.samlegamer.utils;

import java.util.List;

public class ModsList
{
	public static void bygRock(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		MAT_ROCK.add("cryptic_stone");
		MAT_ROCK.add("dacite_bricks");
		MAT_ROCK.add("polished_travertine");
		MAT_ROCK.add("purpur_stone");
		MAT_ROCK.add("red_rock_bricks");
		MAT_ROCK.add("scoria_stone_bricks");
		MAT_ROCK.add("soapstone_bricks");
		
		WALL.add("cryptic_stone");
		WALL.add("dacite_bricks");
		WALL.add("polished_travertine");
		WALL.add("purpur_stone");
		WALL.add("red_rock_bricks");
		WALL.add("scoria_stone_bricks");
		WALL.add("soapstone_bricks");
		
		FLOOR.add("cryptic_stone");
		FLOOR.add("dacite");
		FLOOR.add("travertine");
		FLOOR.add("purpur_stone");
		FLOOR.add("red_rock");
		FLOOR.add("scoria_stone");
		FLOOR.add("soapstone");
	}
	
	public static void bygRock120(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		MAT_ROCK.add("dacite_bricks");
		MAT_ROCK.add("red_rock_bricks");
		MAT_ROCK.add("pink_sandstone");
		MAT_ROCK.add("white_sandstone");
		MAT_ROCK.add("blue_sandstone");
		MAT_ROCK.add("purple_sandstone");
		MAT_ROCK.add("black_sandstone");
		MAT_ROCK.add("windswept_sandstone");

		WALL.add("dacite_bricks");
		WALL.add("red_rock_bricks");
		WALL.add("pink_sandstone");
		WALL.add("white_sandstone");
		WALL.add("blue_sandstone");
		WALL.add("purple_sandstone");
		WALL.add("black_sandstone");
		WALL.add("windswept_sandstone");
		
		FLOOR.add("dacite");
		FLOOR.add("red_rock");
		FLOOR.add("pink_sand");
		FLOOR.add("white_sand");
		FLOOR.add("blue_sand");
		FLOOR.add("purple_sand");
		FLOOR.add("black_sand");
		FLOOR.add("windswept_sand");
	}
	
	public static void byg(List<String> MATERIAL, boolean isStem)
	{
		if(!isStem)
		{
			MATERIAL.add("aspen");
			MATERIAL.add("baobab");
			MATERIAL.add("blue_enchanted");
			MATERIAL.add("cherry");
			MATERIAL.add("cika");
			MATERIAL.add("cypress");
			MATERIAL.add("ebony");
			MATERIAL.add("ether");
			MATERIAL.add("fir");
			MATERIAL.add("green_enchanted");
			MATERIAL.add("holly");
			MATERIAL.add("jacaranda");
			MATERIAL.add("lament");
			MATERIAL.add("mahogany");
			MATERIAL.add("mangrove");
			MATERIAL.add("maple");
			MATERIAL.add("nightshade");
			MATERIAL.add("palm");
			MATERIAL.add("pine");
			MATERIAL.add("rainbow_eucalyptus");
			MATERIAL.add("redwood");
			MATERIAL.add("skyris");
			MATERIAL.add("willow");
			MATERIAL.add("witch_hazel");
			MATERIAL.add("zelkova");
		}
		
		if(isStem)
		{
			MATERIAL.add("bulbis");
			MATERIAL.add("imparius");
			MATERIAL.add("sythian");
		}
	}
	
	public static void bygAssets(List<String> MATERIAL)
	{
		MATERIAL.add("aspen");
		MATERIAL.add("baobab");
		MATERIAL.add("blue_enchanted");
		MATERIAL.add("cherry");
		MATERIAL.add("cika");
		MATERIAL.add("cypress");
		MATERIAL.add("ebony");
		MATERIAL.add("ether");
		MATERIAL.add("fir");
		MATERIAL.add("green_enchanted");
		MATERIAL.add("holly");
		MATERIAL.add("jacaranda");
		MATERIAL.add("lament");
		MATERIAL.add("mahogany");
		MATERIAL.add("mangrove");
		MATERIAL.add("maple");
		MATERIAL.add("nightshade");
		MATERIAL.add("palm");
		MATERIAL.add("pine");
		MATERIAL.add("rainbow_eucalyptus");
		MATERIAL.add("redwood");
		MATERIAL.add("skyris");
		MATERIAL.add("willow");
		MATERIAL.add("witch_hazel");
		MATERIAL.add("zelkova");
		MATERIAL.add("bulbis");
		MATERIAL.add("imparius");
		MATERIAL.add("sythian");
	}

	
	public static void bygWildUp(List<String> MATERIAL, boolean isStem)
	{
		if(!isStem)
		{
			MATERIAL.add("aspen");
			MATERIAL.add("baobab");
			MATERIAL.add("blue_enchanted");
			MATERIAL.add("cherry");
			MATERIAL.add("cika");
			MATERIAL.add("cypress");
			MATERIAL.add("ebony");
			MATERIAL.add("ether");
			MATERIAL.add("fir");
			MATERIAL.add("green_enchanted");
			MATERIAL.add("holly");
			MATERIAL.add("jacaranda");
			MATERIAL.add("lament");
			MATERIAL.add("mahogany");
			MATERIAL.add("white_mangrove");
			MATERIAL.add("maple");
			MATERIAL.add("nightshade");
			MATERIAL.add("palm");
			MATERIAL.add("pine");
			MATERIAL.add("rainbow_eucalyptus");
			MATERIAL.add("redwood");
			MATERIAL.add("skyris");
			MATERIAL.add("willow");
			MATERIAL.add("witch_hazel");
			MATERIAL.add("zelkova");
		}
		
		if(isStem)
		{
			MATERIAL.add("bulbis");
			MATERIAL.add("imparius");
			MATERIAL.add("sythian");
		}
	}
	
	public static void byg120(List<String> MATERIAL, boolean isStem)
	{
		if(!isStem)
		{
			MATERIAL.add("aspen");
			MATERIAL.add("baobab");
			MATERIAL.add("blue_enchanted");
			MATERIAL.add("cika");
			MATERIAL.add("cypress");
			MATERIAL.add("ebony");
			MATERIAL.add("fir");
			MATERIAL.add("green_enchanted");
			MATERIAL.add("holly");
			MATERIAL.add("ironwood");
			MATERIAL.add("jacaranda");
			MATERIAL.add("mahogany");
			MATERIAL.add("maple");
			MATERIAL.add("palm");
			MATERIAL.add("pine");
			MATERIAL.add("rainbow_eucalyptus");
			MATERIAL.add("redwood");
			MATERIAL.add("sakura");
			MATERIAL.add("skyris");
			MATERIAL.add("white_mangrove");
			MATERIAL.add("willow");
			MATERIAL.add("witch_hazel");
			MATERIAL.add("zelkova");
		}
		else
		{
			MATERIAL.add("florus");
		}
	}
	
	public static void byg120(List<String> MATERIAL)
	{
		MATERIAL.add("aspen");
		MATERIAL.add("baobab");
		MATERIAL.add("blue_enchanted");
		MATERIAL.add("cika");
		MATERIAL.add("cypress");
		MATERIAL.add("ebony");
		MATERIAL.add("fir");
		MATERIAL.add("green_enchanted");
		MATERIAL.add("holly");
		MATERIAL.add("ironwood");
		MATERIAL.add("jacaranda");
		MATERIAL.add("mahogany");
		MATERIAL.add("maple");
		MATERIAL.add("palm");
		MATERIAL.add("pine");
		MATERIAL.add("rainbow_eucalyptus");
		MATERIAL.add("redwood");
		MATERIAL.add("sakura");
		MATERIAL.add("skyris");
		MATERIAL.add("white_mangrove");
		MATERIAL.add("willow");
		MATERIAL.add("witch_hazel");
		MATERIAL.add("zelkova");
		MATERIAL.add("florus");
	}

	public static void bygWildUp(List<String> MATERIAL)
	{
			MATERIAL.add("aspen");
			MATERIAL.add("baobab");
			MATERIAL.add("blue_enchanted");
			MATERIAL.add("cherry");
			MATERIAL.add("cika");
			MATERIAL.add("cypress");
			MATERIAL.add("ebony");
			MATERIAL.add("ether");
			MATERIAL.add("fir");
			MATERIAL.add("green_enchanted");
			MATERIAL.add("holly");
			MATERIAL.add("jacaranda");
			MATERIAL.add("lament");
			MATERIAL.add("mahogany");
			MATERIAL.add("white_mangrove");
			MATERIAL.add("maple");
			MATERIAL.add("nightshade");
			MATERIAL.add("palm");
			MATERIAL.add("pine");
			MATERIAL.add("rainbow_eucalyptus");
			MATERIAL.add("redwood");
			MATERIAL.add("skyris");
			MATERIAL.add("willow");
			MATERIAL.add("witch_hazel");
			MATERIAL.add("zelkova");
			MATERIAL.add("bulbis");
			MATERIAL.add("imparius");
			MATERIAL.add("sythian");
	}

	public static void bop(List<String> MAT_WOOD, boolean cherryMC)
	{
		if(!cherryMC) { MAT_WOOD.add("cherry"); }
		MAT_WOOD.add("dead");
		MAT_WOOD.add("fir");
		MAT_WOOD.add("hellbark");
		MAT_WOOD.add("jacaranda");
		MAT_WOOD.add("magic");
		MAT_WOOD.add("mahogany");
		MAT_WOOD.add("palm");
		MAT_WOOD.add("redwood");
		MAT_WOOD.add("umbran");
		MAT_WOOD.add("willow");
	}
	
	public static void bop1204(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("dead");
		MAT_WOOD.add("fir");
		MAT_WOOD.add("hellbark");
		MAT_WOOD.add("jacaranda");
		MAT_WOOD.add("magic");
		MAT_WOOD.add("mahogany");
		MAT_WOOD.add("palm");
		MAT_WOOD.add("redwood");
		MAT_WOOD.add("umbran");
		MAT_WOOD.add("willow");
		MAT_WOOD.add("empyreal");
	}
	
	public static void shroomed(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("blue_hard_mushroom");
		MAT_WOOD.add("hard_mushroom");
		MAT_WOOD.add("orange_hard_mushroom");
		MAT_WOOD.add("purple_hard_mushroom");
	}
	
	public static void abnormalsWood(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("aspen");
		MAT_WOOD.add("grimwood");
		MAT_WOOD.add("kousa");
		MAT_WOOD.add("morado");
		MAT_WOOD.add("rosewood");
		MAT_WOOD.add("yucca");
		MAT_WOOD.add("maple");
		MAT_WOOD.add("cherry");
		MAT_WOOD.add("wisteria");
		MAT_WOOD.add("willow");
		MAT_WOOD.add("driftwood");
		MAT_WOOD.add("river");
		MAT_WOOD.add("poise");
	}

	public static void abnormalsRock(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		MAT_ROCK.add("honeycomb_brick");
		MAT_ROCK.add("honeycomb_tile");
		WALL.add("honeycomb_bricks");
		WALL.add("honeycomb_tiles");
		FLOOR.add("honeycomb_block");
		FLOOR.add("honeycomb_bricks");

		MAT_ROCK.add("red_arid_sandstone");
		MAT_ROCK.add("arid_sandstone");
		WALL.add("red_arid_sandstone");
		WALL.add("arid_sandstone");
		FLOOR.add("arid_sand");
		FLOOR.add("red_arid_sand");

		MAT_ROCK.add("snail_shell_bricks");
		MAT_ROCK.add("snail_shell_tiles");
		WALL.add("snail_shell_bricks");
		WALL.add("snail_shell_tiles");
		FLOOR.add("snail_shell_block_stripes");
		FLOOR.add("snail_shell_bricks");
	}

	public static void betterlandsWoods(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("juniper");
	}
	
	public static void betterlandsRocks(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		MAT_ROCK.add("black_terracotta_bricks");
		MAT_ROCK.add("blue_terracotta_bricks");
		MAT_ROCK.add("brown_terracotta_bricks");
		MAT_ROCK.add("claystone_bricks");
		MAT_ROCK.add("cyan_terracotta_bricks");
		MAT_ROCK.add("gray_terracotta_bricks");
		MAT_ROCK.add("green_terracotta_bricks");
		MAT_ROCK.add("light_blue_terracotta_bricks");
		MAT_ROCK.add("light_gray_terracotta_bricks");
		MAT_ROCK.add("lime_terracotta_bricks");
		MAT_ROCK.add("magenta_terracotta_bricks");
		MAT_ROCK.add("orange_terracotta_bricks");
		MAT_ROCK.add("red_terracotta_bricks");
		MAT_ROCK.add("terracotta_bricks");
		MAT_ROCK.add("white_terracotta_bricks");
		MAT_ROCK.add("yellow_terracotta_bricks");
		
		WALL.add("black_terracotta_bricks");
		WALL.add("blue_terracotta_bricks");
		WALL.add("brown_terracotta_bricks");
		WALL.add("claystone_bricks");
		WALL.add("cyan_terracotta_bricks");
		WALL.add("gray_terracotta_bricks");
		WALL.add("green_terracotta_bricks");
		WALL.add("light_blue_terracotta_bricks");
		WALL.add("light_gray_terracotta_bricks");
		WALL.add("lime_terracotta_bricks");
		WALL.add("magenta_terracotta_bricks");
		WALL.add("orange_terracotta_bricks");
		WALL.add("red_terracotta_bricks");
		WALL.add("terracotta_bricks");
		WALL.add("white_terracotta_bricks");
		WALL.add("yellow_terracotta_bricks");
		
		FLOOR.add("black_terracotta_tiles");
		FLOOR.add("blue_terracotta_tiles");
		FLOOR.add("brown_terracotta_tiles");
		FLOOR.add("claystone_tiles");
		FLOOR.add("cyan_terracotta_tiles");
		FLOOR.add("gray_terracotta_tiles");
		FLOOR.add("green_terracotta_tiles");
		FLOOR.add("light_blue_terracotta_tiles");
		FLOOR.add("light_gray_terracotta_tiles");
		FLOOR.add("lime_terracotta_tiles");
		FLOOR.add("magenta_terracotta_tiles");
		FLOOR.add("orange_terracotta_tiles");
		FLOOR.add("red_terracotta_tiles");
		FLOOR.add("terracotta_tiles");
		FLOOR.add("white_terracotta_tiles");
		FLOOR.add("yellow_terracotta_tiles");
	}
	
	public static void ModdingLegacyWoods(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("bsky_bluebright");
		MAT_WOOD.add("bsky_cherry");
		MAT_WOOD.add("bsky_crystallized");
		MAT_WOOD.add("bsky_dusk");
		MAT_WOOD.add("bsky_frostbright");
		MAT_WOOD.add("bsky_lunar");
		MAT_WOOD.add("bsky_maple");
		MAT_WOOD.add("bsky_starlit");
		MAT_WOOD.add("pwood_magic");
		MAT_WOOD.add("pwood_maple");
		MAT_WOOD.add("pwood_purple_heart");
		MAT_WOOD.add("pwood_silverbell");
		MAT_WOOD.add("pwood_tiger");
		MAT_WOOD.add("pwood_willow");
	}
	
	public static void AuroraWoods(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("cypress");
		MAT_WOOD.add("brown_mushroom");
		MAT_WOOD.add("red_mushroom");
	}
	
	public static void AuroraWoodsLang(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("Cypress");
		MAT_WOOD.add("Brown Mushroom");
		MAT_WOOD.add("Red Mushroom");
	}
	
	public static void AuroraWoods1201(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("cypress");
		MAT_WOOD.add("mushroom");
	}
	
	public static void AuroraWoods1201Lang(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("Cypress");
		MAT_WOOD.add("Mushroom");
	}
	
	public static void BlueSkiesBsky(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("bsky_bluebright");
		MAT_WOOD.add("bsky_cherry");
		MAT_WOOD.add("bsky_crystallized");
		MAT_WOOD.add("bsky_dusk");
		MAT_WOOD.add("bsky_frostbright");
		MAT_WOOD.add("bsky_lunar");
		MAT_WOOD.add("bsky_maple");
		MAT_WOOD.add("bsky_starlit");
	}
	
	public static void PremiumWoodPwood(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("pwood_magic");
		MAT_WOOD.add("pwood_maple");
		MAT_WOOD.add("pwood_purple_heart");
		MAT_WOOD.add("pwood_silverbell");
		MAT_WOOD.add("pwood_tiger");
		MAT_WOOD.add("pwood_willow");
	}
}