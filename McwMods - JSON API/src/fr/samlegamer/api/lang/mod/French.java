package fr.samlegamer.api.lang.mod;

import java.util.Collection;
import java.util.List;
import fr.samlegamer.utils.Uncomplete;

public class French
{
	@Uncomplete(percent = 5, missing = "french lang missing")
	public static class Abnormals
	{
		public static void abnormalsWoodLang(List<String> MAJ_WOOD)
		{
			MAJ_WOOD.add("Aspen");
			MAJ_WOOD.add("Grimwood");
			MAJ_WOOD.add("Kousa");
			MAJ_WOOD.add("Morado");
			MAJ_WOOD.add("Rosewood");
			MAJ_WOOD.add("Yucca");
			MAJ_WOOD.add("érable");
			MAJ_WOOD.add("Cherry");
			MAJ_WOOD.add("glycine");
			MAJ_WOOD.add("Willow");
			MAJ_WOOD.add("Driftwood");
			MAJ_WOOD.add("River");
			MAJ_WOOD.add("Poise");
		}

		public static void abnormalsRockLang(List<String> MAJ_ROCK)
		{
			MAJ_ROCK.add("Honeycomb Bricks");
			MAJ_ROCK.add("Honeycomb Tiles");
			MAJ_ROCK.add("Red Arid Sandstone");
			MAJ_ROCK.add("Arid Sandstone");
			MAJ_ROCK.add("Snail Shell Bricks");
			MAJ_ROCK.add("Snail Shell Tiles");
		}
	}
	
	public static class BOP
	{
		public static void bopLang(List<String> MAJ_MAT, boolean cherryMC)
		{
			if(!cherryMC) { MAJ_MAT.add("cerisier"); }
			MAJ_MAT.add("bois mort");
			MAJ_MAT.add("pin");
			MAJ_MAT.add("écorce de l'enfer");
			MAJ_MAT.add("jacaranda");
			MAJ_MAT.add("bois magique");
			MAJ_MAT.add("acajou d'amérique");
			MAJ_MAT.add("palmier");
			MAJ_MAT.add("séquoia");
			MAJ_MAT.add("bois de l'ombre");
			MAJ_MAT.add("saule");
		}
		
		public static void bop1204Lang(List<String> MAJ_MAT)
		{
			MAJ_MAT.add("bois mort");
			MAJ_MAT.add("pin");
			MAJ_MAT.add("écorce de l'enfer");
			MAJ_MAT.add("jacaranda");
			MAJ_MAT.add("bois magique");
			MAJ_MAT.add("acajou d'amérique");
			MAJ_MAT.add("palmier");
			MAJ_MAT.add("séquoia");
			MAJ_MAT.add("bois de l'ombre");
			MAJ_MAT.add("saule");
			MAJ_MAT.add("bois empyréen");
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