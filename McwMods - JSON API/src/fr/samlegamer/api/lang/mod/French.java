package fr.samlegamer.api.lang.mod;

import java.util.Collection;
import java.util.List;

public class French
{
	public static class ModdingLegacy
	{
		public static void PremiumWoodLang(List<String> MAJ_WOOD)
		{
			MAJ_WOOD.add("magique");
			MAJ_WOOD.add("érable");
			MAJ_WOOD.add("misère pourpre");
			MAJ_WOOD.add("halesier");
			MAJ_WOOD.add("automne");
			MAJ_WOOD.add("saule");
		}

		public static void BlueSkiesLang(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("bleu brillant");
			MAT_WOOD.add("cerisier");
			MAT_WOOD.add("crépuscule");
			MAT_WOOD.add("gel brillant");
			MAT_WOOD.add("lunaire");
			MAT_WOOD.add("érable");
			MAT_WOOD.add("étoilée");
		}

		public static void BlueSkiesLang1201(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("bleu brillant");
			MAT_WOOD.add("comète");
			MAT_WOOD.add("crépuscule");
			MAT_WOOD.add("gel brillant");
			MAT_WOOD.add("lunaire");
			MAT_WOOD.add("érable");
			MAT_WOOD.add("étoilée");
		}

	}
	
	public static class Aurora
	{
		public static void AuroraWoodsLang(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("cyprès");
			MAT_WOOD.add("champignon brun");
			MAT_WOOD.add("champignon rouge");
			MAT_WOOD.add("jacaranda"); 
			MAT_WOOD.add("gainier rouge");
		}		

		public static void AuroraLeavesLang(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("cyprès");
			MAT_WOOD.add("jacaranda"); 
			MAT_WOOD.add("gainier rouge");
		}

		public static void AuroraWoods1201Lang(List<String> MAT_WOOD)
		{
			MAT_WOOD.add("cyprès");
			MAT_WOOD.add("champignon");
			MAT_WOOD.add("jacaranda");
			MAT_WOOD.add("gainier rouge");
		}
	}
	
	public static class Quark
	{
		public static void quarkRockLang(List<String> MAJ_ROCK)
		{
			Collection<String> mat = List.of("brique d'Andesite poli", "Basalt Bricks", "Biotite Bricks", "Diorite Bricks", "Elder Pismarine Bricks", "brique de granite poli", "Jasper Bricks", 
			"Limestone Bricks", "Magma Bricks", "Marble Bricks", "Permafrost Bricks", "Red Sandstone Bricks", "Sandstone Bricks", "Slate Bricks", "Soul Sandstone Bricks");
			MAJ_ROCK.addAll(mat);
		}
	}
	
	public static class Abnormals
	{
		public static void abnormalsWoodLang(List<String> MAJ_WOOD)
		{
			MAJ_WOOD.add("tremble");
			MAJ_WOOD.add("sombrepin");
			MAJ_WOOD.add("cornouiller");
			MAJ_WOOD.add("morado");
			MAJ_WOOD.add("pallisandre");
			MAJ_WOOD.add("yucca");
			MAJ_WOOD.add("érable");
			MAJ_WOOD.add("cerisier");
			MAJ_WOOD.add("glycine");
			MAJ_WOOD.add("saule");
			MAJ_WOOD.add("bois flotté");
			MAJ_WOOD.add("rivière");
			MAJ_WOOD.add("lévita");
		}

		public static void abnormalsRockLang(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.add("rayon de miel taillée");
			MAJ_ROCK.add("rayon de miel carrelée");
			MAJ_ROCK.add("grès aride rouge");
			MAJ_ROCK.add("grès aride");
			MAJ_ROCK.add("briques de coquille d'escargot");
			MAJ_ROCK.add("coquille d'escargot carrelée");
		}
		
		public static void abnormalsLeavesLang(List<String> LEAVES)
		{
			LEAVES.addAll(List.of("tremble", "sombrepin","cornouiller", "morado", "pallisandre", "yucca", "érable", "érable rouges", "érable jaunes", "érable oranges", "cerisier", 
			"glycine bleu", "glycine rose", "glycine blanc", "glycine violet", "saule", "rivière"));
		}
		
		public static void abnormalsWood120Lang(List<String> MAT_WOOD)
		{
			MAT_WOOD.addAll(List.of("tremble", "sombrepin", "cornouiller", "morado", "pallisandre", "yucca", 
			"laurier", "érable", "prunier", "Wisteria", "saule", "pin", "bois flotté", "rivière", "lévita"));
		}

		public static void abnormalsLeaves120Lang(List<String> LEAVES)
		{
			LEAVES.addAll(List.of("tremble", "sombrepin", "cornouiller", "morado", "pallisandre", "yucca", 
			"laurier", "érable", "érable rouges", "érable jaunes", "érable oranges", "prunier",
			"glycine bleu", "glycine rose", "glycine blanc", "glycine violet", "saule", "pin", "rivière"));
		}

	}
	
	public static class BOP
	{
		private static final Collection<String> BOP_WOODS = List.of("bois mort", "pin", "écorce de l'enfer", "jacaranda", "bois magique", "acajou d'amérique", "palmier", "séquoia", "bois de l'ombre", "saule");
		
		public static void bopLang(List<String> MAJ_MAT, boolean cherryMC)
		{
			if(!cherryMC) { MAJ_MAT.add("cerisier"); }
			MAJ_MAT.addAll(BOP_WOODS);
		}
		
		public static void bop1204Lang(List<String> MAJ_MAT)
		{
			MAJ_MAT.addAll(BOP_WOODS);
			MAJ_MAT.add("bois empyréen");
			MAJ_MAT.add("érable");
			MAJ_MAT.add("pinvert");
		}
		
		public static void bopLeaves1204Lang(List<String> LEAVES)
		{
			LEAVES.addAll(BOP_WOODS);
			LEAVES.add("bois empyréen");
			LEAVES.add("pinvert");
			LEAVES.addAll(List.of("érable orange", "érable rouge", "érable jaune", "cyprès", "cerisier blanc", "chêne fleuri", "bouleau multicolore", "vallée retro"));
		}
		
		public static void bopLeavesLang(List<String> LEAVES, boolean cherryMC)
		{
			if(!cherryMC) { LEAVES.add("cerisier rose"); }
			LEAVES.addAll(BOP_WOODS);
			LEAVES.addAll(List.of("érable", "feuilles d'Automne orange", "feuilles d'Automne jaune", "cerisier blanc", "chêne fleuri", "bouleau multicolore", "vallée retro"));
		}
	}
	
	public static class BYG
	{
		public static void bygLeavesWildUpLang(List<String> LEAVES_LANG)
		{
			Collection<String> c = List.of("tremble","baobab","bleue enchantée","cycas","cyprès","ébène", "ether", "sapin","vert enchanté","houx", "jacaranda", "lamente","acajou",
			"érable","palmier","pin","eucalyptus arc-en-ciel","séquoia","skyris","mangrove","saule","hamamélis","zelkova", 
			"sapin bleu", "sapin orange", "sapin rouge", "sapin jaune", "bouleau marron", "bouleau orange", 
			"bouleau rouge", "bouleau jaune", "chêne marron", "chêne orange", "chêne rouge", "cerisier blanc", "cerisier rose", "araucaria", "hamamélis florissantes", 
			"jacaranda indigo florissantes", "jacaranda florissantes", "verger fleuri", "palo verde florissantes", "palo verde");
			LEAVES_LANG.addAll(c);
		}
		
		public static void bygLeavesLang(List<String> LEAVES_LANG)
		{
			bygLeavesWildUpLang(LEAVES_LANG);
		}
		
		public static void bygLeaves120Lang(List<String> LEAVES_LANG)
		{
			LEAVES_LANG.add("tremble");
			LEAVES_LANG.add("baobab");
			LEAVES_LANG.add("platamana azure");
			LEAVES_LANG.add("cika");
			LEAVES_LANG.add("cyprès");
			LEAVES_LANG.add("ébène");
			LEAVES_LANG.add("douglas");
			LEAVES_LANG.add("platamana viridis");
			LEAVES_LANG.add("houx");
			LEAVES_LANG.add("boidfer");
			LEAVES_LANG.add("jacaranda");
			LEAVES_LANG.add("acajou riche");
			LEAVES_LANG.add("érable");
			LEAVES_LANG.add("palmier");
			LEAVES_LANG.add("pin");
			LEAVES_LANG.add("eucalyptus arc-en-ciel");
			LEAVES_LANG.add("séquoia");
			LEAVES_LANG.add("célestis");
			LEAVES_LANG.add("emanglier blanc");
			LEAVES_LANG.add("saule");
			LEAVES_LANG.add("hamamélis");
			LEAVES_LANG.add("zelkova");

			LEAVES_LANG.add("sapin bleu");
			LEAVES_LANG.add("sapin orange");
			LEAVES_LANG.add("sapin rouge");
			LEAVES_LANG.add("sapin jaune");
			LEAVES_LANG.add("bouleau marron");
			LEAVES_LANG.add("bouleau orange");
			LEAVES_LANG.add("bouleau rouge");
			LEAVES_LANG.add("bouleau jaune");
			LEAVES_LANG.add("chêne marron");
			LEAVES_LANG.add("chêne orange");
			LEAVES_LANG.add("chêne rouge");
			LEAVES_LANG.add("sakura blanc");
			LEAVES_LANG.add("sakura jaune");
			LEAVES_LANG.add("érable rouge");
			LEAVES_LANG.add("araucaria");
			LEAVES_LANG.add("hamamélis florissantes");
			LEAVES_LANG.add("jacaranda indigo florissantes");
			LEAVES_LANG.add("boidfer florissantes");
			LEAVES_LANG.add("jacaranda florissantes");
			LEAVES_LANG.add("verger florissantes");
			LEAVES_LANG.add("palo verde florissantes");
			LEAVES_LANG.add("célestis florissantes");
			LEAVES_LANG.add("yucca florissantes");
		}

		public static void bygLang(List<String> MAJ_WOOD)
		{
				MAJ_WOOD.add("tremble");
				MAJ_WOOD.add("baobab");
				MAJ_WOOD.add("bleue enchantée");
				MAJ_WOOD.add("cerisier");
				MAJ_WOOD.add("cycas");
				MAJ_WOOD.add("cyprès");
				MAJ_WOOD.add("ébène");
				MAJ_WOOD.add("ether");
				MAJ_WOOD.add("sapin");
				MAJ_WOOD.add("vert enchanté");
				MAJ_WOOD.add("houx");
				MAJ_WOOD.add("jacaranda");
				MAJ_WOOD.add("lamente");
				MAJ_WOOD.add("acajou");
				MAJ_WOOD.add("mangrove");
				MAJ_WOOD.add("érable");
				MAJ_WOOD.add("belladone");
				MAJ_WOOD.add("palmier");
				MAJ_WOOD.add("pin");
				MAJ_WOOD.add("eucalyptus arc-en-ciel");
				MAJ_WOOD.add("séquoia");
				MAJ_WOOD.add("skyris");
				MAJ_WOOD.add("saule");
				MAJ_WOOD.add("hamamélis");
				MAJ_WOOD.add("zelkova");
				MAJ_WOOD.add("bulbe");
				MAJ_WOOD.add("imparius");
				MAJ_WOOD.add("scythe");
		}

		public static void bygLangWildUp(List<String> MAJ_WOOD)
		{
			MAJ_WOOD.add("tremble");
			MAJ_WOOD.add("baobab");
			MAJ_WOOD.add("bleue enchantée");
			MAJ_WOOD.add("cerisier");
			MAJ_WOOD.add("cycas");
			MAJ_WOOD.add("cyprès");
			MAJ_WOOD.add("ébène");
			MAJ_WOOD.add("ether");
			MAJ_WOOD.add("sapin");
			MAJ_WOOD.add("vert enchanté");
			MAJ_WOOD.add("houx");
			MAJ_WOOD.add("jacaranda");
			MAJ_WOOD.add("lamente");
			MAJ_WOOD.add("acajou");
			MAJ_WOOD.add("mangrove");
			MAJ_WOOD.add("érable");
			MAJ_WOOD.add("belladone");
			MAJ_WOOD.add("palmier");
			MAJ_WOOD.add("pin");
			MAJ_WOOD.add("eucalyptus arc-en-ciel");
			MAJ_WOOD.add("séquoia");
			MAJ_WOOD.add("skyris");
			MAJ_WOOD.add("saule");
			MAJ_WOOD.add("hamamélis");
			MAJ_WOOD.add("zelkova");
			MAJ_WOOD.add("bulbe");
			MAJ_WOOD.add("imparius");
			MAJ_WOOD.add("scythe");
		}
		
		public static void bygRockLang(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.add("roche cryptique");
			MAJ_ROCK.add("briques de dacite");
			MAJ_ROCK.add("travertine polie");
			MAJ_ROCK.add("roche pourpre");
			MAJ_ROCK.add("briques de roche rouge");
			MAJ_ROCK.add("briques de soria");
			MAJ_ROCK.add("briques de stéatite");
		}
		
		public static void bygRockFenceableLang(List<String> MAJ_ROCK)
		{
			Collection<String> mat = List.of("stéatite", "travertine", "dacite", "roche rouge", "roche de soria");
			MAJ_ROCK.addAll(mat);
		}
		
		public static void bygRockLang120(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.add("briques de dacite");
			MAJ_ROCK.add("briques de roche rouge");
			MAJ_ROCK.add("grès rose");
			MAJ_ROCK.add("grès blanc");
			MAJ_ROCK.add("grès bleu");
			MAJ_ROCK.add("grès violet");
			MAJ_ROCK.add("grès noir");
			MAJ_ROCK.add("en grès balayé");
		}
		
		public static void byg120Lang(List<String> MAJ_MAT)
		{
			MAJ_MAT.add("tremble");
			MAJ_MAT.add("baobab");
			MAJ_MAT.add("platamana azure");
			MAJ_MAT.add("cika");
			MAJ_MAT.add("cyprès");
			MAJ_MAT.add("ébène");
			MAJ_MAT.add("douglas");
			MAJ_MAT.add("platamana viridis");
			MAJ_MAT.add("houx");
			MAJ_MAT.add("boidfer");
			MAJ_MAT.add("jacaranda");
			MAJ_MAT.add("acajou riche");
			MAJ_MAT.add("érable");
			MAJ_MAT.add("palmier");
			MAJ_MAT.add("pin");
			MAJ_MAT.add("eucalyptus arc-en-ciel");
			MAJ_MAT.add("séquoia");
			MAJ_MAT.add("sakura");
			MAJ_MAT.add("célestis");
			MAJ_MAT.add("emanglier blanc");
			MAJ_MAT.add("saule");
			MAJ_MAT.add("hamamélis");
			MAJ_MAT.add("zelkova");
			MAJ_MAT.add("fleur");
		}
	}
	
	public static class Minecraft
	{
		//prismarine sombre (windows)
		public static void mcWood(List<String> MAT, List<String> MAJ_MAT)
		{
			MAT.add("oak");
			MAT.add("birch");
			MAT.add("acacia");
			MAT.add("spruce");
			MAT.add("jungle");
			MAT.add("dark_oak");
			MAT.add("crimson");
			MAT.add("warped");
			MAT.add("mangrove");
			MAT.add("cherry");
			MAT.add("pale_oak");
			
			MAJ_MAT.add("chêne");
			MAJ_MAT.add("bouleau");
			MAJ_MAT.add("acacia");
			MAJ_MAT.add("sapin");
			MAJ_MAT.add("jungle");
			MAJ_MAT.add("chêne noir");
			MAJ_MAT.add("carmin");
			MAJ_MAT.add("biscornue");
			MAJ_MAT.add("palétuvier");
			MAJ_MAT.add("cerisier");
			MAJ_MAT.add("chêne pale");
		}
		
		public static void mcRockStairs(List<String> MAT_ROCK, List<String> MAJ_MAT)
		{
			MAT_ROCK.add("brick");
			MAT_ROCK.add("stone_brick");
			MAT_ROCK.add("mossy_stone_brick");
			MAT_ROCK.add("sandstone");
			MAT_ROCK.add("red_sandstone");
			MAT_ROCK.add("deepslate_brick");
			MAT_ROCK.add("cobbled_deepslate");
			MAT_ROCK.add("mud_brick");
			MAT_ROCK.add("blackstone");

			MAT_ROCK.add("glass");
			MAT_ROCK.add("quartz");

			MAT_ROCK.add("cobblestone");
			MAT_ROCK.add("mossy_cobblestone");
			MAT_ROCK.add("andesite");
			MAT_ROCK.add("granite");
			MAT_ROCK.add("diorite");
			MAT_ROCK.add("prismarine");
			MAT_ROCK.add("nether_bricks");
			MAT_ROCK.add("red_nether_brick");
			MAT_ROCK.add("end_stone_bricks");
			
			MAJ_MAT.add("briques");
			MAJ_MAT.add("pierre taillée");
			MAJ_MAT.add("pierre taillée moussue");
			MAJ_MAT.add("grès");
			MAJ_MAT.add("grès rouge");
			MAJ_MAT.add("ardoise des abîmes taillée");
			MAJ_MAT.add("pierres des abîmes");
			MAJ_MAT.add("briques de terre crue");
			MAJ_MAT.add("roche noire");
			
			MAJ_MAT.add("verre");
			MAJ_MAT.add("quartz");

			MAJ_MAT.add("pierre");
			MAJ_MAT.add("pierre moussue");
			MAJ_MAT.add("andésite");
			MAJ_MAT.add("granite");
			MAJ_MAT.add("diorite");
			MAJ_MAT.add("prismarine");
			MAJ_MAT.add("briques du nether");
			MAJ_MAT.add("briques du nether rouges");
			MAJ_MAT.add("briques de l'End");
		}
		
		//Used by Mcw Windows
		public static void mcRockWindows(List<String> MAT_ROCK, List<String> MAJ_MAT)
		{
			MAT_ROCK.add("andesite");
			MAT_ROCK.add("granite");
			MAT_ROCK.add("diorite");

			
			MAJ_MAT.add("andésite");
			MAJ_MAT.add("granite");
			MAJ_MAT.add("diorite");

		}
		//Used by Mcw Bridges
		public static void mcRockBridges(List<String> MAT_ROCK, List<String> MAJ_MAT)
		{
			MAT_ROCK.add("brick");
			MAT_ROCK.add("stone_brick");
			MAT_ROCK.add("mossy_stone_brick");
			MAT_ROCK.add("sandstone");
			MAT_ROCK.add("red_sandstone");
			MAT_ROCK.add("deepslate_brick");
			MAT_ROCK.add("deepslate_tile");
			MAT_ROCK.add("mud_brick");
			MAT_ROCK.add("blackstone");

			MAT_ROCK.add("asian_red");
			MAT_ROCK.add("glass");
			
			MAT_ROCK.add("cobblestone");
			MAT_ROCK.add("mossy_cobblestone");
			MAT_ROCK.add("andesite");
			MAT_ROCK.add("granite");
			MAT_ROCK.add("diorite");
			MAT_ROCK.add("prismarine_bricks");
			MAT_ROCK.add("nether_bricks");
			MAT_ROCK.add("end_stone_bricks");
			
			MAJ_MAT.add("briques");
			MAJ_MAT.add("pierre taillée");
			MAJ_MAT.add("pierre taillée moussue");
			MAJ_MAT.add("grès");
			MAJ_MAT.add("grès rouge");
			MAJ_MAT.add("ardoise des abîmes taillée");
			MAJ_MAT.add("ardoise des abîmes carrelée");
			MAJ_MAT.add("briques de terre crue");
			MAJ_MAT.add("roche noire");
			
			MAJ_MAT.add("rouge asiatique");
			MAJ_MAT.add("verre");
			
			MAJ_MAT.add("pierre");
			MAJ_MAT.add("pierre moussue");
			MAJ_MAT.add("andésite");
			MAJ_MAT.add("granite");
			MAJ_MAT.add("diorite");
			MAJ_MAT.add("briques de prismarine");
			MAJ_MAT.add("briques du nether");
			MAJ_MAT.add("briques de l'End");
		}

		public static void mcTerracotaConcrete(List<String> MAT_ROCK, List<String> MAJ_MAT)
		{
			MAT_ROCK.add("brick");
			MAT_ROCK.add("stone_brick");
			MAT_ROCK.add("mossy_stone_brick");
			MAT_ROCK.add("sandstone");
			MAT_ROCK.add("red_sandstone");
			MAT_ROCK.add("deepslate_brick");
			MAT_ROCK.add("deepslate_tile");
			MAT_ROCK.add("mud_brick");
			MAT_ROCK.add("blackstone");

			MAT_ROCK.add("asian_red");
			MAT_ROCK.add("glass");
			
			MAT_ROCK.add("cobblestone");
			MAT_ROCK.add("mossy_cobblestone");
			MAT_ROCK.add("andesite");
			MAT_ROCK.add("granite");
			MAT_ROCK.add("diorite");
			MAT_ROCK.add("prismarine_bricks");
			MAT_ROCK.add("nether_bricks");
			MAT_ROCK.add("end_stone_bricks");
			
			MAJ_MAT.add("briques");
			MAJ_MAT.add("pierre taillée");
			MAJ_MAT.add("pierre taillée moussue");
			MAJ_MAT.add("grès");
			MAJ_MAT.add("grès rouge");
			MAJ_MAT.add("ardoise des abîmes taillée");
			MAJ_MAT.add("ardoise des abîmes carrelée");
			MAJ_MAT.add("briques de terre crue");
			MAJ_MAT.add("roche noire");
			
			MAJ_MAT.add("rouge asiatique");
			MAJ_MAT.add("verre");
			
			MAJ_MAT.add("pierre");
			MAJ_MAT.add("pierre moussue");
			MAJ_MAT.add("andésite");
			MAJ_MAT.add("granite");
			MAJ_MAT.add("diorite");
			MAJ_MAT.add("briques de prismarine");
			MAJ_MAT.add("briques du nether");
			MAJ_MAT.add("briques de l'End");
		
		}

		public static void mcRockFences(List<String> MAT_ROCK, List<String> MAJ_MAT)
		{
			MAT_ROCK.add("stone_brick");
			MAT_ROCK.add("andesite");
			MAT_ROCK.add("diorite");
			MAT_ROCK.add("granite");
			MAT_ROCK.add("blackstone");
			MAT_ROCK.add("sandstone");
			MAT_ROCK.add("red_sandstone");
			MAT_ROCK.add("nether_brick");
			MAT_ROCK.add("end_brick");
			MAT_ROCK.add("deepslate");
			MAT_ROCK.add("deepslate_brick");
			MAT_ROCK.add("quartz");
			MAT_ROCK.add("mud_brick");
			MAT_ROCK.add("prismarine");
			
			MAJ_MAT.add("pierre taillée");
			MAJ_MAT.add("andésite");
			MAJ_MAT.add("diorite");
			MAJ_MAT.add("granite");
			MAJ_MAT.add("roche noire");
			MAJ_MAT.add("grès");
			MAJ_MAT.add("grès rouge");
			MAJ_MAT.add("briques du nether");
			MAJ_MAT.add("briques de l'End");
			MAJ_MAT.add("ardoise des abîmes");
			MAJ_MAT.add("ardoise des abîmes taillée");
			MAJ_MAT.add("quartz");
			MAJ_MAT.add("briques de terre crue");
			MAJ_MAT.add("prismarine");
		}
	}
}