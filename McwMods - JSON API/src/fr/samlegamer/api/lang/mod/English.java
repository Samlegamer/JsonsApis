package fr.samlegamer.api.lang.mod;

import java.util.Collection;
import java.util.List;

public class English
{
	public static class ModdingLegacy
	{
		public static void PremiumWoodLang(List<String> MAJ_WOOD)
		{
			MAJ_WOOD.add("Magic");
			MAJ_WOOD.add("Maple");
			MAJ_WOOD.add("Purple Heart");
			MAJ_WOOD.add("Silverbell");
			MAJ_WOOD.add("Tiger");
			MAJ_WOOD.add("Willow");
		}

		public static void BlueSkiesLang(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("Bluebright");
			MAT_WOOD.add("Cherry");
			MAT_WOOD.add("Dusk");
			MAT_WOOD.add("Frostbright");
			MAT_WOOD.add("Lunar");
			MAT_WOOD.add("Maple");
			MAT_WOOD.add("Starlit");
		}

		public static void BlueSkiesLang1201(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("Bluebright");
			MAT_WOOD.add("Comet");
			MAT_WOOD.add("Dusk");
			MAT_WOOD.add("Frostbright");
			MAT_WOOD.add("Lunar");
			MAT_WOOD.add("Maple");
			MAT_WOOD.add("Starlit");
		}

	}
	
	public static class Sajevius
	{
		public static void ShroomedLang(List<String> MAJ_WOOD)
		{
			MAJ_WOOD.add("Blue Hard Mushroom");
			MAJ_WOOD.add("Hard Mushroom");
			MAJ_WOOD.add("Orange Hard Mushroom");
			MAJ_WOOD.add("Purple Hard Mushroom");
		}

		public static void betterlandsWoodsLang(List<String> MAJ_WOOD)
		{
			MAJ_WOOD.add("Juniper");
		}
		
		
		public static void betterlandsRocksLang(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.add("Black Terracotta Bricks");
			MAJ_ROCK.add("Blue Terracotta Bricks");
			MAJ_ROCK.add("Brown Terracotta Bricks");
			MAJ_ROCK.add("Claystone Bricks");
			MAJ_ROCK.add("Cyan Terracotta Bricks");
			MAJ_ROCK.add("Gray Terracotta Bricks");
			MAJ_ROCK.add("Green Terracotta Bricks");
			MAJ_ROCK.add("Light Blue Terracotta Bricks");
			MAJ_ROCK.add("Light Gray Terracotta Bricks");
			MAJ_ROCK.add("Lime Terracotta Bricks");
			MAJ_ROCK.add("Magenta Terracotta Bricks");
			MAJ_ROCK.add("Orange Terracotta Bricks");
			MAJ_ROCK.add("Red Terracotta Bricks");
			MAJ_ROCK.add("Terracotta Bricks");
			MAJ_ROCK.add("White Terracotta Bricks");
			MAJ_ROCK.add("Yellow Terracotta Bricks");
		}
	}
	
	public static class Aurora
	{
		public static void AuroraWoodsLang(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("Cypress");
			MAT_WOOD.add("Brown Mushroom");
			MAT_WOOD.add("Red Mushroom");
			MAT_WOOD.add("Jacaranda"); 
			MAT_WOOD.add("Redbud");
			//abundance 
		}
		
		public static void AuroraLeavesLang(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("Cypress");
			MAT_WOOD.add("Jacaranda"); 
			MAT_WOOD.add("Redbud");
		}

		public static void AuroraWoods1201Lang(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("Cypress");
			MAT_WOOD.add("Mushroom");
			MAT_WOOD.add("Jacaranda");
			MAT_WOOD.add("Redbud");
		}
	}
	
	public static class Quark
	{
		public static void quarkRockLang(List<String> MAJ_ROCK)
		{
			Collection<String> mat = List.of("Andesite Bricks", "Basalt Bricks", "Biotite Bricks", "Diorite Bricks", "Elder Pismarine Bricks", "Granite Bricks", "Jasper Bricks", 
			"Limestone Bricks", "Magma Bricks", "Marble Bricks", "Permafrost Bricks", "Red Sandstone Bricks", "Sandstone Bricks", "Slate Bricks", "Soul Sandstone Bricks");
			MAJ_ROCK.addAll(mat);
		}
		
		public static void quarkLeaves(List<String> LEAVES)
		{
			LEAVES.addAll(List.of("Blue Blossom", "Lavender Blossom", "Orange Blossom", "Pink Blossom", "Red Blossom", "Yellow Blossom"));
		}
	}
	
	public static class Abnormals
	{
		public static void abnormalsWoodLang(List<String> MAJ_WOOD)
		{
			MAJ_WOOD.addAll(List.of("Aspen", "Grimwood", "Kousa", "Morado", "Rosewood", "Yucca", "Maple", "Cherry", "Wisteria", "Willow", "Driftwood", "River", "Poise"));
		}
		
		public static void abnormalsWood119Lang(List<String> MAJ_WOOD)
		{
			abnormalsWoodLang(MAJ_WOOD);
			MAJ_WOOD.add("Azalea");
		}

		public static void abnormalsRockLang(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.addAll(List.of("Honeycomb Bricks", "Honeycomb Tiles", "Red Arid Sandstone", "Arid Sandstone", "Snail Shell Bricks", "Snail Shell Tiles"));
		}
		
		public static void abnormalsLeavesLang(List<String> LEAVES)
		{
			LEAVES.addAll(List.of("Aspen", "Grimwood","Kousa", "Morado", "Rosewood", "Yucca", "Maple", "Red Maple", "Yellow Maple", "Orange Maple", "Cherry", 
			"Blue Wisteria", "Pink Wisteria", "White Wisteria", "Purple Wisteria", "Willow", "River"));
		}
		
		public static void abnormalsWood120Lang(List<String> MAT_WOOD)
		{
			MAT_WOOD.addAll(List.of("Aspen", "Grimwood", "Kousa", "Morado", "Rosewood", "Yucca", 
			"Laurel", "Maple", "Plum", "Wisteria", "Willow", "Pine", "Driftwood", "River", "Poise", "Azalea"));
		}

		public static void abnormalsLeaves120Lang(List<String> LEAVES)
		{
			LEAVES.addAll(List.of("Aspen", "Grimwood", "Kousa", "Morado", "Rosewood", "Yucca", 
			"Laurel", "Maple", "Red Maple", "Yellow Maple", "Orange Maple", "Plum",
			"Blue Wisteria", "Pink Wisteria", "White Wisteria", "Purple Wisteria", "Willow", "Pine", "River"));
		}

	}
	
	public static class BOP
	{
		private static final Collection<String> BOP_WOODS = List.of("Dead", "Fir", "Hellbark", "Jacaranda", "Magic", "Mahogany", "Palm", "Redwood", "Umbran", "Willow");

		public static void bopLang(List<String> MAJ_MAT, boolean cherryMC)
		{
			if(!cherryMC) { MAJ_MAT.add("Cherry"); }
			MAJ_MAT.addAll(BOP_WOODS);
		}
		
		public static void bop1204Lang(List<String> MAJ_MAT)
		{
			MAJ_MAT.addAll(BOP_WOODS);
			MAJ_MAT.add("Empyreal");
			MAJ_MAT.add("Maple");
			MAJ_MAT.add("Pine");
		}
		
		public static void bopLeaves1204Lang(List<String> LEAVES)
		{
			LEAVES.addAll(BOP_WOODS);
			LEAVES.add("Empyreal");
			LEAVES.add("Pine");
			LEAVES.addAll(List.of("Orange Maple", "Red Maple", "Yellow Maple", "Cypress", "Snowblossom", "Flowering Oak", "Rainbow Birch", "Origin"));
		}
		
		public static void bopLeavesLang(List<String> LEAVES, boolean cherryMC)
		{
			if(!cherryMC) { LEAVES.add("Pink Cherry"); }
			LEAVES.addAll(BOP_WOODS);
			LEAVES.addAll(List.of("Maple", "Orange Autumn", "Yellow Autumn", cherryMC ? "Snowblossom" : "White Cherry", "Flowering Oak", "Rainbow Birch", "Origin"));
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
		
		public static void bygLeavesLang(List<String> LEAVES_LANG)
		{
			Collection<String> c = List.of("Aspen","Baobab","Blue Enchanted","Cika","Cypress","Ebony", "Ether", "Fir","Green Enchanted","Holly", "Jacaranda", "Lament","Mahogany","Maple","Palm"
			,"Pine","Rainbow Eucalyptus","Redwood","Skyris","Mangrove","Willow","Witch Hazel","Zelkova", 
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
		
		public static void bygRockFenceableLang(List<String> MAJ_ROCK)
		{
			Collection<String> mat = List.of("Soapstone", "Travertine", "Dacite", "Red Rock", "Scoria Stone");
			MAJ_ROCK.addAll(mat);
		}
		
		public static void bygRockLang(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.add("Cryptic Stone");
			MAJ_ROCK.add("Dacite Bricks");
			MAJ_ROCK.add("Polished Travertine");
			MAJ_ROCK.add("Purpur Stone");
			MAJ_ROCK.add("Red Rock Bricks");
			MAJ_ROCK.add("Scoria Stone Bricks");
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
