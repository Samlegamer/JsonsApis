package fr.samlegamer.api.lang.mod;

import java.util.Collection;
import java.util.List;

public class English
{
	public static class Abnormals
	{
		public static void abnormalsWoodLang(List<String> MAJ_WOOD)
		{
			MAJ_WOOD = List.of("Aspen", "Grimwood", "Kousa", "Morado", "Rosewood", "Yucca", "Maple", "Cherry", "Wisteria", "Willow", "Driftwood", "River", "Poise");
		}

		public static void abnormalsRockLang(List<String> MAJ_ROCK)
		{
			MAJ_ROCK = List.of("Honeycomb Bricks", "Honeycomb Tiles", "Red Arid Sandstone", "Arid Sandstone", "Snail Shell Bricks", "Snail Shell Tiles");
		}
	}
	
	public static class BOP
	{
		public static void bopLang(List<String> MAJ_MAT, boolean cherryMC)
		{
			if(!cherryMC) { MAJ_MAT.add("Cherry"); }
			MAJ_MAT.add("Dead");
			MAJ_MAT.add("Fir");
			MAJ_MAT.add("Hellbark");
			MAJ_MAT.add("Jacaranda");
			MAJ_MAT.add("Magic");
			MAJ_MAT.add("Mahogany");
			MAJ_MAT.add("Palm");
			MAJ_MAT.add("Redwood");
			MAJ_MAT.add("Umbran");
			MAJ_MAT.add("Willow");
		}
		
		public static void bop1204Lang(List<String> MAJ_MAT)
		{
			MAJ_MAT.add("Dead");
			MAJ_MAT.add("Fir");
			MAJ_MAT.add("Hellbark");
			MAJ_MAT.add("Jacaranda");
			MAJ_MAT.add("Magic");
			MAJ_MAT.add("Mahogany");
			MAJ_MAT.add("Palm");
			MAJ_MAT.add("Redwood");
			MAJ_MAT.add("Umbran");
			MAJ_MAT.add("Willow");
			MAJ_MAT.add("Empyreal");
		}
	}
	public static class BYG
	{
		public static void bygLeavesWildUpLang(List<String> LEAVES_LANG)
		{
			Collection<String> c = List.of("Aspen","Baobab","Blue Enchanted","Cika","Cypress","Ebony", "Ether", "Fir","Green Enchanted","Holly", "Jacaranda", "Lament","Mahogany","Maple","Palm"
			,"Pine","Rainbow Eucalyptus","Redwood","Skyris","White Mangrove","Willow","Witch Hazel","Zelkova", 
			"Blue Spruce", "Orange Spruce", "Red Spruce", "Yellow Spruce", "Brown Birch", "Orange Birch", 
			"Red Birch", "Yellow Birch", "Brown Oak", "Orange Oak", "Red Oak", "White Cherry", "Pink Cherry", "Araucaria", "Blooming Witch Hazel", "Flowering Indigo Jacaranda", 
			"Flowering Jacaranda", "Flowering Orchard", "Flowering Palo Verde", "Palo Verde");
			LEAVES_LANG.addAll(c);
		}
		
		public static void bygLeaves120Lang(List<String> LEAVES_LANG)
		{
			LEAVES_LANG.add("Aspen");
			LEAVES_LANG.add("Baobab");
			LEAVES_LANG.add("Blue Enchanted");
			LEAVES_LANG.add("Cika");
			LEAVES_LANG.add("Cypress");
			LEAVES_LANG.add("Ebony");
			LEAVES_LANG.add("Fir");
			LEAVES_LANG.add("Green Enchanted");
			LEAVES_LANG.add("Holly");
			LEAVES_LANG.add("Ironwood");
			LEAVES_LANG.add("Jacaranda");
			LEAVES_LANG.add("Mahogany");
			LEAVES_LANG.add("Maple");
			LEAVES_LANG.add("Palm");
			LEAVES_LANG.add("Pine");
			LEAVES_LANG.add("Rainbow Eucalyptus");
			LEAVES_LANG.add("Redwood");
			LEAVES_LANG.add("Skyris");
			LEAVES_LANG.add("White Mangrove");
			LEAVES_LANG.add("Willow");
			LEAVES_LANG.add("Witch Hazel");
			LEAVES_LANG.add("Zelkova");

			
			LEAVES_LANG.add("Blue Spruce");
			LEAVES_LANG.add("Orange Spruce");
			LEAVES_LANG.add("Red Spruce");
			LEAVES_LANG.add("Yellow Spruce");

			LEAVES_LANG.add("Brown Birch");
			LEAVES_LANG.add("Orange Birch");
			LEAVES_LANG.add("Red Birch");
			LEAVES_LANG.add("Yellow Birch");
			
			LEAVES_LANG.add("Brown Oak");
			LEAVES_LANG.add("Orange Oak");
			LEAVES_LANG.add("Red Oak");

			LEAVES_LANG.add("White Sakura");
			LEAVES_LANG.add("Yellow Sakura");
			LEAVES_LANG.add("Red Maple");
			LEAVES_LANG.add("Araucaria");
			LEAVES_LANG.add("Blooming Witch Hazel");
			LEAVES_LANG.add("Flowering Indigo Jacaranda");
			LEAVES_LANG.add("Flowering Ironwood");
			LEAVES_LANG.add("Flowering Jacaranda");
			LEAVES_LANG.add("Flowering Orchard");
			LEAVES_LANG.add("Flowering Palo Verde");
			LEAVES_LANG.add("Flowering Skyris");
			LEAVES_LANG.add("Flowering Yucca");
		}
		
		public static void byg120Lang(List<String> MATERIAL)
		{
			MATERIAL.add("Aspen");
			MATERIAL.add("Baobab");
			MATERIAL.add("Blue Enchanted");
			MATERIAL.add("Cika");
			MATERIAL.add("Cypress");
			MATERIAL.add("Ebony");
			MATERIAL.add("Fir");
			MATERIAL.add("Green Enchanted");
			MATERIAL.add("Holly");
			MATERIAL.add("Ironwood");
			MATERIAL.add("Jacaranda");
			MATERIAL.add("Mahogany");
			MATERIAL.add("Maple");
			MATERIAL.add("Palm");
			MATERIAL.add("Pine");
			MATERIAL.add("Rainbow Eucalyptus");
			MATERIAL.add("Redwood");
			MATERIAL.add("Sakura");
			MATERIAL.add("Skyris");
			MATERIAL.add("White Mangrove");
			MATERIAL.add("Willow");
			MATERIAL.add("Witch Hazel");
			MATERIAL.add("Zelkova");
			MATERIAL.add("Florus");
		}
		
		public static void bygLang(List<String> MATERIAL)
		{
				MATERIAL.add("Aspen");
				MATERIAL.add("Baobab");
				MATERIAL.add("Blue Enchanted");
				MATERIAL.add("Cherry");
				MATERIAL.add("Cika");
				MATERIAL.add("Cypress");
				MATERIAL.add("Ebony");
				MATERIAL.add("Ether");
				MATERIAL.add("Fir");
				MATERIAL.add("Green Enchanted");
				MATERIAL.add("Holly");
				MATERIAL.add("Jacaranda");
				MATERIAL.add("Lament");
				MATERIAL.add("Mahogany");
				MATERIAL.add("Mangrove");
				MATERIAL.add("Maple");
				MATERIAL.add("Nightshade");
				MATERIAL.add("Palm");
				MATERIAL.add("Pine");
				MATERIAL.add("Rainbow Eucalyptus");
				MATERIAL.add("Redwood");
				MATERIAL.add("Skyris");
				MATERIAL.add("Willow");
				MATERIAL.add("Witch Hazel");
				MATERIAL.add("Zelkova");
				MATERIAL.add("Bulbis");
				MATERIAL.add("Imparius");
				MATERIAL.add("Sythian");
		}

		public static void bygLangWildUp(List<String> MATERIAL)
		{
				MATERIAL.add("Aspen");
				MATERIAL.add("Baobab");
				MATERIAL.add("Blue Enchanted");
				MATERIAL.add("Cherry");
				MATERIAL.add("Cika");
				MATERIAL.add("Cypress");
				MATERIAL.add("Ebony");
				MATERIAL.add("Ether");
				MATERIAL.add("Fir");
				MATERIAL.add("Green Enchanted");
				MATERIAL.add("Holly");
				MATERIAL.add("Jacaranda");
				MATERIAL.add("Lament");
				MATERIAL.add("Mahogany");
				MATERIAL.add("White Mangrove");
				MATERIAL.add("Maple");
				MATERIAL.add("Nightshade");
				MATERIAL.add("Palm");
				MATERIAL.add("Pine");
				MATERIAL.add("Rainbow Eucalyptus");
				MATERIAL.add("Redwood");
				MATERIAL.add("Skyris");
				MATERIAL.add("Willow");
				MATERIAL.add("Witch Hazel");
				MATERIAL.add("Zelkova");
				MATERIAL.add("Bulbis");
				MATERIAL.add("Imparius");
				MATERIAL.add("Sythian");
		}
		
		public static void bygRockLang(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.add("Cryptic Stone");
			MAJ_ROCK.add("Dacite Bricks");
			MAJ_ROCK.add("Polished Travertine");
			MAJ_ROCK.add("Purpur Stone");
			MAJ_ROCK.add("Red Rock Bricks");
			MAJ_ROCK.add("Soria Stone Bricks");
			MAJ_ROCK.add("Soapstone Bricks");
		}
		
		public static void bygRockLang120(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.add("Dacite Bricks");
			MAJ_ROCK.add("Red Rock Bricks");
			MAJ_ROCK.add("Pink Sandstone");
			MAJ_ROCK.add("White Sandstone");
			MAJ_ROCK.add("Blue Sandstone");
			MAJ_ROCK.add("Purple Sandstone");
			MAJ_ROCK.add("Black Sandstone");
			MAJ_ROCK.add("Windswept Sandstone");
		}
	}
}
