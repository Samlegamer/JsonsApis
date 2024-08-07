package fr.samlegamer.utils;

import java.util.List;

public interface IModFiles
{
	public static interface IData
	{
		void AdvancementsLogAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood);
		void RecipesLogAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood);
		void LootTableLogAll(String LOCATION, String CompatModid, List<String> MAT_WOOD);
		void RecipesStoneAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK);
		void LootTableStoneAll(String LOCATION, String CompatModid, List<String> MAT_ROCK);
	}
	
	public static interface ITagData
	{
		void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD);
		void PickaxeDataGen(String LOCATION, String CompatModid, List<String> MAT_ROCK);
		void TagsWood(String LOCATION, String Modid, List<String> MAT_WOOD);
	}
	
	public static interface IClient
	{
		void createWoodBlockstates(String LOCATION, String CompatModid, List<String> MAT_WOOD);
		void createWoodModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, boolean isStemWood);
		void createWoodCustomModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped);
		void createModelItem(String LOCATION, String CompatModid, List<String> MAT_WOOD);
	}
	
	public static interface IProgram
	{
		public static interface TabBuild
		{
			void builderToAddWood(String LOCATION, List<String> MAT_WOOD, String ClassBlockRegistry);
			void builderToAddStone(String LOCATION, List<String> MAT_ROCK, String ClassBlockRegistry);
			void fabricWood(String location, List<String> MAT_WOOD, String ClassBR);
		}
		
		public static interface JavaForge
		{
			void InitRendersLog(String Location, List<String> Material, String ClassMod);
			void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
		}
		
		public static interface JavaNeoForge
		{
			void InitRendersLog(String Location, List<String> Material, String ClassMod);
			void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
		}
		
		public static interface JavaFabric
		{
			void InitRendersLog(String Location, List<String> Material, String ClassMod);
			void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales);
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