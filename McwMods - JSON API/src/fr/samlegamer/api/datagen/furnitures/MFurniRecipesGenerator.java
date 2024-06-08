package fr.samlegamer.api.datagen.furnitures;

import java.io.File;

import fr.samlegamer.utils.APIWriter;

public class MFurniRecipesGenerator
{//   + material + (isStemTexture ? "_stem" : "_log") +
	public static void init(String location)
	{
		File folderData = new File(location + "data/");
		File folderRecipes = new File(location + "data/recipes/");
		File folderLoot_Tables = new File(location + "data/loot_tables/");
		File folderBlocks = new File(location + "data/loot_tables/blocks/");

		if(!folderData.exists() || !folderRecipes.exists() || !folderLoot_Tables.exists() || !folderBlocks.exists())
		{
			folderData.mkdir();
			folderRecipes.mkdir();
			folderLoot_Tables.mkdir();
			folderBlocks.mkdir();
		}
	}
	
	public static class Bookshelf
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_bookshelf" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_bookshelf\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_bookshelf" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"BBB\",\r\n"
					+ "		\"AAA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:book\"\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_bookshelf\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Bookshelf_Cupboard
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_bookshelf_cupboard" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_bookshelf_cupboard\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_bookshelf_cupboard" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"BAC\",\r\n"
					+ "		\"AAA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_door\"\r\n"
					+ "        },\r\n"
					+ "		\r\n"
					+ "	    \"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:book\"\r\n"
					+ "        } \r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_bookshelf_cupboard\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Bookshelf_Drawer
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_bookshelf_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_bookshelf_drawer\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_bookshelf_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"ABA\",\r\n"
					+ "		\"ACA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_drawer\"\r\n"
					+ "        },\r\n"
					+ "		\r\n"
					+ "	    \"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:book\"\r\n"
					+ "        } \r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_bookshelf_drawer\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Chair
	{
		public static void loot_tables(String location, String ModidCompat, String material, boolean is302Update)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_chair" + ".json");
			
			APIWriter.write(location, file, (is302Update ? "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_chair\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}" : 
						"{\r\n"
						+ "  \"type\": \"minecraft:block\",\r\n"
						+ "  \"pools\": [\r\n"
						+ "    {\r\n"
						+ "      \"rolls\": 1.0,\r\n"
						+ "      \"bonus_rolls\": 0.0,\r\n"
						+ "      \"entries\": [\r\n"
						+ "        {\r\n"
						+ "          \"type\": \"minecraft:item\",\r\n"
						+ "          \"conditions\": [\r\n"
						+ "            {\r\n"
						+ "              \"condition\": \"minecraft:block_state_property\",\r\n"
						+ "              \"block\": \""+ModidCompat+":"+material+"_chair\",\r\n"
						+ "              \"properties\": {\r\n"
						+ "                \"part\": \"lower\"\r\n"
						+ "              }\r\n"
						+ "            }\r\n"
						+ "          ],\r\n"
						+ "          \"name\": \""+ModidCompat+":"+material+"_chair\"\r\n"
						+ "        }\r\n"
						+ "      ],\r\n"
						+ "      \"conditions\": [\r\n"
						+ "        {\r\n"
						+ "          \"condition\": \"minecraft:survives_explosion\"\r\n"
						+ "        }\r\n"
						+ "      ]\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}"));
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_chair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \" A\",\r\n"
					+ "        \"BA\",\r\n"
					+ "        \"CC\"		\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_slab\"\r\n"
					+ "        },\r\n"
					+ "		\r\n"
					+ "		\"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_fence\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_chair\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Coffee_Table
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_coffee_table" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_coffee_table\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_coffee_table" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"A\",\r\n"
					+ "        \"B\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_fence\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_coffee_table\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Counter
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_counter" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_counter\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_counter" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"A\",\r\n"
					+ "        \"B\"	\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_slab\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_counter\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Covered_Desk
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_covered_desk" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_covered_desk\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_covered_desk" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"A A\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_covered_desk\",\r\n"
					+ "        \"count\": 2\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Cupboard_Counter
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_cupboard_counter" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_cupboard_counter\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_cupboard_counter" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"A\",\r\n"
					+ "        \"B\"	\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_slab\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+ModidCompat+":"+material+"_wardrobe\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_cupboard_counter\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Desk
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_desk" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_desk\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_desk" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"B B\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_fence\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_desk\",\r\n"
					+ "        \"count\": 2\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Double_Drawer
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_double_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_double_drawer\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_double_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"ABA\",\r\n"
					+ "		\"ABA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_drawer\"\r\n"
					+ "        }\r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_double_drawer\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Double_Drawer_Counter
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_double_drawer_counter" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_double_drawer_counter\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_double_drawer_counter" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"A\",\r\n"
					+ "        \"B\"	\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_slab\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+ModidCompat+":"+material+"_double_drawer\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_double_drawer_counter\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Double_Wardrobe
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_double_wardrobe" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_double_wardrobe\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_double_wardrobe" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"BAB\",\r\n"
					+ "		\"AAA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_door\"\r\n"
					+ "        }\r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_double_wardrobe\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Drawer
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_drawer\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"ABA\",\r\n"
					+ "		\"AAA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_drawer\"\r\n"
					+ "        }\r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_drawer\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class End_Table
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_end_table" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_end_table\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_end_table" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"A\",\r\n"
					+ "        \"B\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+ModidCompat+":"+material+"_table\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_end_table\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Glass_Table
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_glass_table" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_glass_table\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_glass_table" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"A\",\r\n"
					+ "        \"B\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+ModidCompat+":"+material+"_end_table\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:glass\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_glass_table\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Large_Drawer
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_large_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_large_drawer\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_large_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"ABA\",\r\n"
					+ "        \"AAA\",\r\n"
					+ "		\"AAA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_drawer\"\r\n"
					+ "        }\r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_large_drawer\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Lower_Bookshelf_Drawer
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_lower_bookshelf_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_lower_bookshelf_drawer\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_lower_bookshelf_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"ACA\",\r\n"
					+ "		\"ABA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_drawer\"\r\n"
					+ "        },\r\n"
					+ "		\r\n"
					+ "	    \"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:book\"\r\n"
					+ "        } \r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_lower_bookshelf_drawer\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Lower_Triple_Drawer
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_lower_triple_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_lower_triple_drawer\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_lower_triple_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"BAB\",\r\n"
					+ "		\"ABA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_drawer\"\r\n"
					+ "        }\r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_lower_triple_drawer\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Modern_Chair
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_modern_chair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_modern_chair\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_modern_chair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"BA\",\r\n"
					+ "        \"CC\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_slab\"\r\n"
					+ "        },\r\n"
					+ "		\r\n"
					+ "		\"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_fence\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_modern_chair\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Modern_Desk
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_modern_desk" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_modern_desk\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_modern_desk" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"BCB\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_fence\"\r\n"
					+ "        },\r\n"
					+ "		\r\n"
					+ "		\"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:stick\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_modern_desk\",\r\n"
					+ "        \"count\": 2\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	// + material + (isStemTexture ? "_stem" : "_log") +
	
	public static class Modern_Wardrobe
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_modern_wardrobe" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_modern_wardrobe\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_modern_wardrobe" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"AAB\",\r\n"
					+ "		\"AAA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_door\"\r\n"
					+ "        }\r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_modern_wardrobe\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Stool_Chair
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_stool_chair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_stool_chair\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_stool_chair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "		\"A\",\r\n"
					+ "        \"A\",\r\n"
					+ "        \"B\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, 	\r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_fence\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_stool_chair\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Striped_Chair
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_striped_chair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_striped_chair\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_striped_chair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \" A\",\r\n"
					+ "        \"BC\",\r\n"
					+ "		\"CC\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_slab\"\r\n"
					+ "        },\r\n"
					+ "		\r\n"
					+ "		\"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_fence\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_striped_chair\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
	
	public static class Table
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_table" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_table\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_table" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"A\",\r\n"
					+ "        \"B\"                \r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+ModidCompat+":"+material+"_coffee_table\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_fence\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_table\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Triple_Drawer
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_triple_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_triple_drawer\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_triple_drawer" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"ABA\",\r\n"
					+ "		\"BAB\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_drawer\"\r\n"
					+ "        }\r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_triple_drawer\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class Wardrobe
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_wardrobe" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "	\"type\": \"minecraft:block\",\r\n"
					+ "	\"pools\":\r\n"
					+ "	[\r\n"
					+ "		{\r\n"
					+ "			\"rolls\": 1,\r\n"
					+ "			\"entries\":\r\n"
					+ "			[\r\n"
					+ "				{\r\n"
					+ "					\"type\": \"minecraft:item\",\r\n"
					+ "					\"name\": \""+ModidCompat+":"+material+"_wardrobe\"\r\n"
					+ "				}\r\n"
					+ "			]\r\n"
					+ "		}\r\n"
					+ "	]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_wardrobe" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "        \"AAA\",\r\n"
					+ "        \"ABA\",\r\n"
					+ "		\"AAA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "	    \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }, \r\n"
					+ "		\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"mcwfurnitures:cabinet_door\"\r\n"
					+ "        }\r\n"
					+ "		\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_wardrobe\",\r\n"
					+ "        \"count\": 4\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
}