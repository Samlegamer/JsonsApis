package fr.samlegamer.api.datagen.bridges;

import java.io.File;
import fr.samlegamer.utils.APIWriter;

public class CustomizerRecipesMB
{/*
	public static class BridgeLog
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/recipes/" + extraNModid + material + "_log_bridge_middle" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"F F\",\r\n"
							+ "    \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_fence\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_slab\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+extraNModid+material+"_log_bridge_middle\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
		}

		public static void loot_tablesGen(String location, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/loot_tables/" + extraNModid + material + "_log_bridge_middle" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+extraNModid+material+"_log_bridge_middle\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
	}

	public static class RopeBridge
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/recipes/" + "rope_" + extraNModid + material + "_bridge" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"F F\",\r\n"
							+ "    \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:string\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_slab\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+"rope_"+extraNModid+material+"_bridge\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
		}

		public static void loot_tablesGen(String location, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/loot_tables/" + "rope_" + extraNModid + material + "_bridge" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+"rope_"+extraNModid+material+"_bridge\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
	}

	public static class Pier
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material, boolean isStemTexture, String extraNModid)
		{
			File file = new File(location + "/data/recipes/" + extraNModid + material + "_bridge_pier" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"WFW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_fence\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+extraNModid+ material +"_bridge_pier\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
		}

		public static void loot_tablesGen(String location, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/loot_tables/" + extraNModid + material + "_bridge_pier" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+extraNModid+material+"_bridge_pier\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
	}

	public static class Stairs
	{
		public static void recipeGen(String location, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/recipes/" + extraNModid + material + "_log_bridge_stair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"  F\",\r\n"
							+ "    \" FF\",\r\n"
							+ "	\"FFF\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidCompat+":"+extraNModid+material+"_log_bridge_middle\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+extraNModid+material+"_log_bridge_stair\",\r\n"
							+ "        \"count\": 6\r\n"
							+ "    }\r\n"
							+ "}");
		}

		public static void loot_tablesGen(String location, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/loot_tables/" + extraNModid + material + "_log_bridge_stair" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+extraNModid+material+"_log_bridge_stair\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
	}

	public static class Rails
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/recipes/" + extraNModid + material + "_rail_bridge" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"F F\",\r\n"
							+ "    \"FWF\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+ material +"_fence\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+ material +"_slab\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+extraNModid+ material +"_rail_bridge\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
		}

		public static void loot_tablesGen(String location, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/loot_tables/" + extraNModid + material + "_rail_bridge" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+extraNModid+material+"_rail_bridge\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
	}

	public static class RopeStairs
	{
		public static void recipeGen(String location, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/recipes/" + extraNModid + material + "_rope_bridge_stair" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"  F\",\r\n"
							+ "    \" FF\",\r\n"
							+ "	\"FFF\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidCompat+":rope_"+extraNModid+material+"_bridge\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+extraNModid+material+"_rope_bridge_stair\",\r\n"
							+ "        \"count\": 6\r\n"
							+ "    }\r\n"
							+ "}");
		}

		public static void loot_tablesGen(String location, String modidCompat, String material, String extraNModid)
		{
			File file = new File(location + "/data/loot_tables/" + extraNModid + material + "_rope_bridge_stair" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+extraNModid+material+"_rope_bridge_stair\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
	}*/
}