package fr.samlegamer.utils;

import java.util.List;

/*
 * Used for Easy switch
 */
public interface IModFiles
{
	public static interface IData
	{
		void AdvancementsLogAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood);
		void AdvancementsStoneAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK);
		void RecipesLogAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood);
		void LootTableLogAll(String LOCATION, String CompatModid, List<String> MAT_WOOD);
		void RecipesStoneAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK);
		void RecipesStoneAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK, List<String> FLOOR);
		void LootTableStoneAll(String LOCATION, String CompatModid, List<String> MAT_ROCK);
	}
	
	public static interface ITagData
	{
		void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD);
		void HoeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD);
		void PickaxeDataGen(String LOCATION, String CompatModid, List<String> MAT_ROCK);
		void TagsWood(String LOCATION, String Modid, List<String> MAT_WOOD);
		void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK);
	}
	
	public static interface IClient
	{
		//Wood
		void createWoodBlockstates(String LOCATION, String CompatModid, List<String> MAT_WOOD);
		void createWoodModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, boolean isStemWood);
		void createWoodCustomModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped);
		void createWoodModelItem(String LOCATION, String CompatModid, List<String> MAT_WOOD);
		//Stone
		void createStoneBlockstates(String LOCATION, String CompatModid, List<String> MAT_ROCK);
		void createStoneModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR);
		void createStoneModelItem(String LOCATION, String CompatModid, List<String> MAT_ROCK);
	}
	
	public static interface IProgram
	{
		public static interface TabBuild
		{
			void builderToAddWood(String LOCATION, List<String> MAT_WOOD, String ClassBlockRegistry);
			void builderToAddStone(String LOCATION, List<String> MAT_ROCK, String ClassBlockRegistry);
			void fabricWood(String location, List<String> MAT_WOOD, String ClassBR);
			void fabricStone(String LOCATION, List<String> MAT_ROCK, String ClassBR);
		}
		
		public static interface JavaForge
		{
			void InitRendersLog(String Location, List<String> Material, String ClassMod);
			void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
			void registerBlockStone(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
			void InitRendersStone(String Location, List<String> Material, String classBlock);
		}
		
		public static interface JavaNeoForge
		{
			void InitRendersLog(String Location, List<String> Material, String ClassMod);
			void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
			void registerBlockStone(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
			void InitRendersStone(String Location, List<String> Material, String classBlock);
		}
		
		public static interface JavaFabric
		{
			void InitRendersLog(String Location, List<String> Material, String ClassMod);
			void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
			void registerBlockStone(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
			void InitRendersStone(String Location, List<String> Material, String classBlock);
		}
	}

	public static interface ILang
	{
		void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT);
		void initAllWoodFrench(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT);
		void initAllStoneEnglish(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT);
		void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT);
	}
}