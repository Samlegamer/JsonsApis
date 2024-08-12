package fr.samlegamer.api.lang.mod;

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
	
	public static class BYG
	{
		public static void bygLang(List<String> MATERIAL)
		{
				MATERIAL.add("tremble");
				MATERIAL.add("baobab");
				MATERIAL.add("bleue enchantée");
				MATERIAL.add("cerisier");
				MATERIAL.add("cycas");
				MATERIAL.add("cyprès");
				MATERIAL.add("ébène");
				MATERIAL.add("ether");
				MATERIAL.add("sapin");
				MATERIAL.add("vert enchanté");
				MATERIAL.add("houx");
				MATERIAL.add("jacaranda");
				MATERIAL.add("lamente");
				MATERIAL.add("acajou");
				MATERIAL.add("mangrove");
				MATERIAL.add("érable");
				MATERIAL.add("belladone");
				MATERIAL.add("palmier");
				MATERIAL.add("pin");
				MATERIAL.add("eucalyptus arc-en-ciel");
				MATERIAL.add("séquoia");
				MATERIAL.add("skyris");
				MATERIAL.add("saule");
				MATERIAL.add("hamamélis");
				MATERIAL.add("zelkova");
				MATERIAL.add("bulbe");
				MATERIAL.add("imparius");
				MATERIAL.add("scythe");
		}

		public static void bygLangWildUp(List<String> MATERIAL)
		{
			MATERIAL.add("tremble");
			MATERIAL.add("baobab");
			MATERIAL.add("bleue enchantée");
			MATERIAL.add("cerisier");
			MATERIAL.add("cycas");
			MATERIAL.add("cyprès");
			MATERIAL.add("ébène");
			MATERIAL.add("ether");
			MATERIAL.add("sapin");
			MATERIAL.add("vert enchanté");
			MATERIAL.add("houx");
			MATERIAL.add("jacaranda");
			MATERIAL.add("lamente");
			MATERIAL.add("acajou");
			MATERIAL.add("mangrove");
			MATERIAL.add("érable");
			MATERIAL.add("belladone");
			MATERIAL.add("palmier");
			MATERIAL.add("pin");
			MATERIAL.add("eucalyptus arc-en-ciel");
			MATERIAL.add("séquoia");
			MATERIAL.add("skyris");
			MATERIAL.add("saule");
			MATERIAL.add("hamamélis");
			MATERIAL.add("zelkova");
			MATERIAL.add("bulbe");
			MATERIAL.add("imparius");
			MATERIAL.add("scythe");
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