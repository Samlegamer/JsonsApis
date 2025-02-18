package fr.samlegamer.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.samlegamer.registry.Compatibilities;

public class ModsList
{
	private static final Collection<String> BOP_WOODS = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow");

	//Quark Mat
	public static void quarkRock(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		Collection<String> mat = List.of("andesite_bricks", "basalt_bricks", "biotite_bricks", "diorite_bricks", "elder_prismarine_bricks", "granite_bricks", "jasper_bricks", "limestone_bricks", "magma_bricks", "marble_bricks", "permafrost_bricks", "red_sandstone_bricks", "sandstone_bricks", "slate_bricks", "soul_sandstone_bricks");
		MAT_ROCK.addAll(mat);
		WALL.addAll(mat);
		Collection<String> flo = List.of("andesite", "basalt", "biotite_block", "diorite", "elder_prismarine", "granite", "jasper", "limestone", "magma_block", "marble", "permafrost", "red_sandstone", "sandstone", "slate", "soul_sandstone");
		FLOOR.addAll(flo);
	}
		
	public static void quarkLeaves(List<String> LEAVES)
	{
		LEAVES.addAll(List.of("blue_blossom", "lavender_blossom", "orange_blossom", "pink_blossom", "red_blossom", "yellow_blossom"));
	}
	
	public static void bygRock(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		Collection<String> mat = List.of("cryptic_stone", "dacite_bricks", "polished_travertine", "purpur_stone", "red_rock_bricks", "scoria_stone_bricks", "soapstone_bricks");
		MAT_ROCK.addAll(mat);
		WALL.addAll(mat);
		Collection<String> fl = List.of("cryptic_stone", "dacite", "travertine", "purpur_stone", "red_rock", "scoria_stone", "soapstone");
		FLOOR.addAll(fl);
	}
	
	public static void bygRock(List<String> MAT_ROCK)
	{
		bygRock(MAT_ROCK, new ArrayList<String>(), new ArrayList<String>());
	}

	
	public static void bygRockFenceable(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		Collection<String> mat = List.of("soapstone", "travertine", "dacite", "red_rock", "scoria_stone");
		Collection<String> wall = List.of("polished_soapstone", "polished_travertine", "dacite_bricks", "red_rock_bricks", "scoria_stone_bricks");
		MAT_ROCK.addAll(mat);
		WALL.addAll(wall);
		FLOOR.addAll(mat);
	}
	
	public static void bygRockFenceable(List<String> MAT_ROCK)
	{
		bygRockFenceable(MAT_ROCK, new ArrayList<String>(), new ArrayList<String>());
	}
	
	public static void bygRock120(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		Collection<String> mat = List.of("dacite_bricks", "red_rock_bricks", "pink_sandstone", "white_sandstone", "blue_sandstone", "purple_sandstone", "black_sandstone", "windswept_sandstone");
		MAT_ROCK.addAll(mat);
		WALL.addAll(mat);
		Collection<String> fl = List.of("dacite", "red_rock", "pink_sand", "white_sand", "blue_sand", "purple_sand", "black_sand", "windswept_sand");
		FLOOR.addAll(fl);
	}
	
	public static void bygLeaves120(List<String> LEAVES, boolean Specialfolder)
	{
		Collection<String> c;
		if(!Specialfolder)
		{	/*For Folder like aspen/leaves*/
			c = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
			"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova");
			LEAVES.addAll(c);
		}
		else
		{
			c = List.of("blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", 
			"red_oak", "white_sakura", "yellow_sakura", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", "flowering_ironwood", "flowering_jacaranda",
			"flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");
			LEAVES.addAll(c);
		}
	}

	public static void bygLeaves120(List<String> LEAVES)
	{
		Collection<String> c = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
		"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", 
		"red_oak", "white_sakura", "yellow_sakura", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", "flowering_ironwood", "flowering_jacaranda",
		"flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");
		LEAVES.addAll(c);
	}
	
	public static void bygLeavesWildUp(List<String> LEAVES, boolean Specialfolder)
	{
		Collection<String> c;
		if(!Specialfolder)
		{	/*For Folder like aspen/leaves*/
			c = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
			"palm","pine","rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova");
		}
		else
		{
			c = List.of("blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch", 
			"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
			"flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");
		}
		LEAVES.addAll(c);
	}
	
	public static void bygLeavesWildUp(List<String> LEAVES)
	{
		bygLeavesWildUp(LEAVES, false);
		bygLeavesWildUp(LEAVES, true);
	}
	
	public static void bygLeaves(List<String> LEAVES)
	{
		Collection<String> c = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
		"palm","pine","rainbow_eucalyptus","redwood","skyris","mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", 
		"orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
		"flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");
		LEAVES.addAll(c);
	}
		
	public static void byg(List<String> MAT_WOOD, boolean isStem)
	{
		if(!isStem)
		{
			MAT_WOOD.add("aspen");
			MAT_WOOD.add("baobab");
			MAT_WOOD.add("blue_enchanted");
			MAT_WOOD.add("cherry");
			MAT_WOOD.add("cika");
			MAT_WOOD.add("cypress");
			MAT_WOOD.add("ebony");
			MAT_WOOD.add("ether");
			MAT_WOOD.add("fir");
			MAT_WOOD.add("green_enchanted");
			MAT_WOOD.add("holly");
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("lament");
			MAT_WOOD.add("mahogany");
			MAT_WOOD.add("mangrove");
			MAT_WOOD.add("maple");
			MAT_WOOD.add("nightshade");
			MAT_WOOD.add("palm");
			MAT_WOOD.add("pine");
			MAT_WOOD.add("rainbow_eucalyptus");
			MAT_WOOD.add("redwood");
			MAT_WOOD.add("skyris");
			MAT_WOOD.add("willow");
			MAT_WOOD.add("witch_hazel");
			MAT_WOOD.add("zelkova");
		}
		else
		{
			MAT_WOOD.add("bulbis");
			MAT_WOOD.add("imparius");
			MAT_WOOD.add("sythian");
		}
	}
	
	
	public static void bygRock120(List<String> MAT_ROCK)
	{
		List<String> WALL = new ArrayList<String>();
		List<String> FLOOR = new ArrayList<String>();
		bygRock120(MAT_ROCK, WALL, FLOOR);
	}
	
	public static void byg(List<String> MATERIAL)
	{
		byg(MATERIAL, false);
		byg(MATERIAL, true);
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
		byg120(MATERIAL, false);
		byg120(MATERIAL, true);
	}

	public static void bygWildUp(List<String> MATERIAL)
	{
		bygWildUp(MATERIAL, false);
		bygWildUp(MATERIAL, true);
	}

	public static void bop(List<String> MAT_WOOD, boolean cherryMC)
	{
		if(!cherryMC) { MAT_WOOD.add("cherry"); }
		MAT_WOOD.addAll(BOP_WOODS);
	}
	
	public static void bop1201(List<String> MAT_WOOD)
	{
		MAT_WOOD.addAll(BOP_WOODS);
		MAT_WOOD.add("empyreal");
		MAT_WOOD.add("maple");
		MAT_WOOD.add("pine");
	}
	
	public static void bopLeaves1201(List<String> LEAVES)
	{
		LEAVES.addAll(BOP_WOODS);
		LEAVES.add("empyreal");
		LEAVES.add("pine");
		LEAVES.addAll(List.of("orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin"));
	}
	
	public static void bopLeaves(List<String> LEAVES, boolean cherryMC)
	{
		if(!cherryMC) { LEAVES.add("pink_cherry"); }
		LEAVES.addAll(BOP_WOODS);
		LEAVES.addAll(List.of("maple", "orange_autumn", "yellow_autumn", cherryMC ? "snowblossom" : "white_cherry", "flowering_oak", "rainbow_birch", "origin"));
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
		abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
		abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
		abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
		abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
		abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
	}
	
	public static void abnormalsWood119(List<String> MAT_WOOD)
	{
		abnormalsWood(MAT_WOOD);
		abnormalsWood(MAT_WOOD, Compatibilities.CAVERNCHASMS_MODID);
	}
	
	public static void abnormalsWood(List<String> MAT_WOOD, String compat)
	{
		if(compat.equals(Compatibilities.ATMO_MODID))
		{
			MAT_WOOD.add("aspen");
			MAT_WOOD.add("grimwood");
			MAT_WOOD.add("kousa");
			MAT_WOOD.add("morado");
			MAT_WOOD.add("rosewood");
			MAT_WOOD.add("yucca");
		}
		
		if(compat.equals(Compatibilities.AUTUM_MODID))
		{
			MAT_WOOD.add("maple");
		}
		
		if(compat.equals(Compatibilities.ENVI_MODID))
		{
			MAT_WOOD.add("cherry");
			MAT_WOOD.add("wisteria");
			MAT_WOOD.add("willow");
		}
		
		if(compat.equals(Compatibilities.UAQUA_MODID))
		{
			MAT_WOOD.add("driftwood");
			MAT_WOOD.add("river");
		}
		
		if(compat.equals(Compatibilities.ENDERGETIC_MODID))
		{
			MAT_WOOD.add("poise");
		}
		
		if(compat.equals(Compatibilities.CAVERNCHASMS_MODID))
		{
			MAT_WOOD.add("azalea");
		}
	}

	public static void abnormalsRock(List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String compat)
	{
		if(compat.equals(Compatibilities.BUZZBEES_MODID))
		{
			MAT_ROCK.add("honeycomb_brick");
			MAT_ROCK.add("honeycomb_tile");
			WALL.add("honeycomb_bricks");
			WALL.add("honeycomb_tiles");
			FLOOR.add("honeycomb_block");
			FLOOR.add("honeycomb_bricks");
		}

		if(compat.equals(Compatibilities.ATMO_MODID))
		{
			MAT_ROCK.add("red_arid_sandstone");
			MAT_ROCK.add("arid_sandstone");
			WALL.add("red_arid_sandstone");
			WALL.add("arid_sandstone");
			FLOOR.add("arid_sand");
			FLOOR.add("red_arid_sand");
		}

		if(compat.equals(Compatibilities.AUTUM_MODID))
		{
			MAT_ROCK.add("snail_shell_bricks");
			MAT_ROCK.add("snail_shell_tiles");
			WALL.add("snail_shell_bricks");
			WALL.add("snail_shell_tiles");
			FLOOR.add("snail_shell_block_stripes");
			FLOOR.add("snail_shell_bricks");
		}
	}
	
	public static void abnormalsRock(List<String> MAT_ROCK)
	{
		abnormalsRock(MAT_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.BUZZBEES_MODID);
		abnormalsRock(MAT_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.ATMO_MODID);
		abnormalsRock(MAT_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.AUTUM_MODID);
	}
	
	public static void abnormalsLeaves(List<String> LEAVES)
	{
		abnormalsLeaves(LEAVES, Compatibilities.ATMO_MODID);
		abnormalsLeaves(LEAVES, Compatibilities.AUTUM_MODID);
		abnormalsLeaves(LEAVES, Compatibilities.ENVI_MODID);
		abnormalsLeaves(LEAVES, Compatibilities.UAQUA_MODID);
	}
	
	public static void abnormalsLeaves(List<String> LEAVES, String compat)
	{
		if(compat.equals(Compatibilities.ATMO_MODID))
		{
			LEAVES.add("aspen");
			LEAVES.add("grimwood");
			LEAVES.add("kousa");
			LEAVES.add("morado");
			LEAVES.add("rosewood");
			LEAVES.add("yucca");
		}
	
		if(compat.equals(Compatibilities.AUTUM_MODID))
		{
			LEAVES.add("maple");
			LEAVES.add("red_maple");
			LEAVES.add("yellow_maple");
			LEAVES.add("orange_maple");
		}
		
		if(compat.equals(Compatibilities.ENVI_MODID))
		{
			LEAVES.add("cherry");
			LEAVES.add("blue_wisteria");
			LEAVES.add("pink_wisteria");
			LEAVES.add("white_wisteria");
			LEAVES.add("purple_wisteria");
			LEAVES.add("willow");
		}
		
		if(compat.equals(Compatibilities.UAQUA_MODID))
		{
			LEAVES.add("river");
		}
	}
	
	public static void abnormalsWood120(List<String> MAT_WOOD, String compat)
	{
		if(compat.equals(Compatibilities.ATMO_MODID))
		{
			MAT_WOOD.addAll(List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel")); 
		}
		
		if(compat.equals(Compatibilities.AUTUM_MODID))
		{
			MAT_WOOD.add("maple");
		}
		
		if(compat.equals(Compatibilities.ENVI_MODID))
		{
			MAT_WOOD.addAll(List.of("plum", "wisteria", "willow", "pine"));
		}
		
		if(compat.equals(Compatibilities.UAQUA_MODID))
		{
			MAT_WOOD.addAll(List.of("driftwood", "river"));
		}
		
		if(compat.equals(Compatibilities.ENDERGETIC_MODID))
		{
			MAT_WOOD.add("poise");
		}
		
		if(compat.equals(Compatibilities.CAVERNCHASMS_MODID))
		{
			MAT_WOOD.add("azalea");
		}
	}
	
	public static void abnormalsWood120(List<String> MAT_WOOD)
	{
		abnormalsWood120(MAT_WOOD, Compatibilities.ATMO_MODID);
		abnormalsWood120(MAT_WOOD, Compatibilities.AUTUM_MODID);
		abnormalsWood120(MAT_WOOD, Compatibilities.ENVI_MODID);
		abnormalsWood120(MAT_WOOD, Compatibilities.UAQUA_MODID);
		abnormalsWood120(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
		abnormalsWood120(MAT_WOOD, Compatibilities.CAVERNCHASMS_MODID);
	}

	public static void abnormalsLeaves120(List<String> LEAVES, String compat)
	{
		if(compat.equals(Compatibilities.ATMO_MODID))
		{
			LEAVES.addAll(List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel"));
		}
		
		if(compat.equals(Compatibilities.AUTUM_MODID))
		{
			LEAVES.addAll(List.of("maple", "red_maple", "yellow_maple","orange_maple"));
		}
		
		if(compat.equals(Compatibilities.ENVI_MODID))
		{
			LEAVES.addAll(List.of("plum", "blue_wisteria", "pink_wisteria", "white_wisteria", "purple_wisteria", "willow", "pine"));
		}
		
		if(compat.equals(Compatibilities.UAQUA_MODID))
		{
			LEAVES.add("river");
		}
	}
	
	public static void abnormalsLeaves120(List<String> LEAVES)
	{
		abnormalsLeaves120(LEAVES, Compatibilities.ATMO_MODID);
		abnormalsLeaves120(LEAVES, Compatibilities.AUTUM_MODID);
		abnormalsLeaves120(LEAVES, Compatibilities.ENVI_MODID);
		abnormalsLeaves120(LEAVES, Compatibilities.UAQUA_MODID);
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
		BlueSkiesBsky(MAT_WOOD);
		PremiumWoodPwood(MAT_WOOD);
	}
	
	public static void AuroraWoods(List<String> MAT_WOOD, String modid)
	{
		if(modid.equals(Compatibilities.BAYOU_BLUES_MODID))
		{
			MAT_WOOD.add("cypress");
		}
		
		if(modid.equals(Compatibilities.ENHANCED_MUSHROOMS_MODID))
		{
			MAT_WOOD.add("brown_mushroom");
			MAT_WOOD.add("red_mushroom");
		}
		
		if(modid.equals(Compatibilities.ABUNDANCE_MODID))
		{
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("redbud");
		}
	}

	public static void AuroraWoods(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("cypress");
		MAT_WOOD.add("brown_mushroom");
		MAT_WOOD.add("red_mushroom");
		MAT_WOOD.add("jacaranda");
		MAT_WOOD.add("redbud");
	}
	
	public static void AuroraLeaves(List<String> MAT_WOOD, String modid)
	{
		if(modid.equals(Compatibilities.BAYOU_BLUES_MODID))
		{
			MAT_WOOD.add("cypress");
		}
				
		if(modid.equals(Compatibilities.ABUNDANCE_MODID))
		{
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("redbud");
		}
	}
	
	public static void AuroraLeaves(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("cypress");
		MAT_WOOD.add("jacaranda");
		MAT_WOOD.add("redbud");
	}
	
	public static void AuroraWoods1201(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("cypress");
		MAT_WOOD.add("mushroom");
		MAT_WOOD.add("jacaranda");
		MAT_WOOD.add("redbud");
	}
	
	public static void AuroraWoods1201(List<String> MAT_WOOD, String modid)
	{
		if(modid.equals(Compatibilities.BAYOU_BLUES_MODID))
		{
			MAT_WOOD.add("cypress");
		}
		
		if(modid.equals(Compatibilities.ENHANCED_MUSHROOMS_MODID))
		{
			MAT_WOOD.add("mushroom");
		}
		
		if(modid.equals(Compatibilities.ABUNDANCE_MODID))
		{
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("redbud");
		}
	}
	
	public static void BlueSkiesBsky(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("bsky_bluebright");
		MAT_WOOD.add("bsky_cherry");
		MAT_WOOD.add("bsky_dusk");
		MAT_WOOD.add("bsky_frostbright");
		MAT_WOOD.add("bsky_lunar");
		MAT_WOOD.add("bsky_maple");
		MAT_WOOD.add("bsky_starlit");
	}

	public static void BlueSkiesTextures(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("bluebright");
		MAT_WOOD.add("cherry");
		MAT_WOOD.add("dusk");
		MAT_WOOD.add("frostbright");
		MAT_WOOD.add("lunar");
		MAT_WOOD.add("maple");
		MAT_WOOD.add("starlit");
	}

	/* New for 1.20.1 */
	public static void BlueSkiesBsky1201(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("bsky_bluebright");
		MAT_WOOD.add("bsky_comet");
		MAT_WOOD.add("bsky_dusk");
		MAT_WOOD.add("bsky_frostbright");
		MAT_WOOD.add("bsky_lunar");
		MAT_WOOD.add("bsky_maple");
		MAT_WOOD.add("bsky_starlit");
	}

	public static void BlueSkiesTextures1201(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("bluebright");
		MAT_WOOD.add("comet");
		MAT_WOOD.add("dusk");
		MAT_WOOD.add("frostbright");
		MAT_WOOD.add("lunar");
		MAT_WOOD.add("maple");
		MAT_WOOD.add("starlit");
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
	
	public static void PremiumWoodPwoodTextures(List<String> MAT_WOOD)
	{
		MAT_WOOD.add("magic");
		MAT_WOOD.add("maple");
		MAT_WOOD.add("purple_heart");
		MAT_WOOD.add("silverbell");
		MAT_WOOD.add("tiger");
		MAT_WOOD.add("willow");
	}
}