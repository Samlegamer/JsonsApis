package fr.samlegamer.api.datagen.bridges;

import java.io.File;

import fr.samlegamer.utils.APIWriter;
import fr.samlegamer.utils.IModFiles;

@Deprecated
public class McwBridgesRecipe121
{
	public static void init(String LOCATION)
	{
		MBRecipesGenerator.init(LOCATION);
	}
	
	public void RecipesLogAll(String LOCATION, String CompatModid, String ModidOfBaseMod, String MAT_WOOD, boolean isStemWood)
	{
		File file = new File(LOCATION + "/data/recipes/" + MAT_WOOD + "_log_bridge_middle" + ".json");
		File file2 = new File(LOCATION + "/data/recipes/" + "rope_" + MAT_WOOD + "_bridge" + ".json");
		File file3 = new File(LOCATION + "/data/recipes/" + MAT_WOOD + "_bridge_pier" + ".json");
		File file4 = new File(LOCATION + "/data/recipes/" + MAT_WOOD + "_log_bridge_stair" + ".json");
		File file5 = new File(LOCATION + "/data/recipes/" + MAT_WOOD + "_rail_bridge" + ".json");
		File file6 = new File(LOCATION + "/data/recipes/" + MAT_WOOD + "_rope_bridge_stair" + ".json");
		
		APIWriter.write(LOCATION, file6, "{\r\n"
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
						+ "            \"item\": \""+CompatModid+":rope_"+MAT_WOOD+"_bridge\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+MAT_WOOD+"_rope_bridge_stair\",\r\n"
						+ "        \"count\": 6\r\n"
						+ "    }\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file5, "{\r\n"
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
						+ "            \"item\": \""+ModidOfBaseMod+":"+ MAT_WOOD +"_fence\"\r\n"
						+ "        },\r\n"
						+ "        \r\n"
						+ "        \"W\":\r\n"
						+ "        {\r\n"
						+ "            \"item\": \""+ModidOfBaseMod+":"+ MAT_WOOD +"_slab\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+ MAT_WOOD +"_rail_bridge\",\r\n"
						+ "        \"count\": 4\r\n"
						+ "    }\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file4, "{\r\n"
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
						+ "            \"item\": \""+CompatModid+":"+MAT_WOOD+"_log_bridge_middle\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+MAT_WOOD+"_log_bridge_stair\",\r\n"
						+ "        \"count\": 6\r\n"
						+ "    }\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file3, "{\r\n"
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
						+ "            \"item\": \""+ModidOfBaseMod+":"+MAT_WOOD+"_fence\"\r\n"
						+ "        },\r\n"
						+ "        \r\n"
						+ "        \"W\":\r\n"
						+ "        {\r\n"
						+ "            \"item\": \""+ModidOfBaseMod+":" + MAT_WOOD + (isStemWood ? "_stem" : "_log") + "\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+ MAT_WOOD +"_bridge_pier\",\r\n"
						+ "        \"count\": 3\r\n"
						+ "    }\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file, "{\r\n"
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
						+ "            \"item\": \""+ModidOfBaseMod+":"+MAT_WOOD+"_fence\"\r\n"
						+ "        },\r\n"
						+ "        \r\n"
						+ "        \"W\":\r\n"
						+ "        {\r\n"
						+ "            \"item\": \""+ModidOfBaseMod+":"+MAT_WOOD+"_slab\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+MAT_WOOD+"_log_bridge_middle\",\r\n"
						+ "        \"count\": 4\r\n"
						+ "    }\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file2, "{\r\n"
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
						+ "            \"item\": \""+ModidOfBaseMod+":"+MAT_WOOD+"_slab\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+"rope_"+MAT_WOOD+"_bridge\",\r\n"
						+ "        \"count\": 4\r\n"
						+ "    }\r\n"
						+ "}");
	}
		
	public void LootTableLogAll(String LOCATION, String CompatModid, String MAT_WOOD)
	{
		File file = new File(LOCATION + "/data/loot_tables/blocks/" + MAT_WOOD + "_log_bridge_middle" + ".json");
		File file2 = new File(LOCATION + "/data/loot_tables/blocks/" + "rope_" + MAT_WOOD + "_bridge" + ".json");
		File file3 = new File(LOCATION + "/data/loot_tables/blocks/" + MAT_WOOD + "_bridge_pier" + ".json");
		File file4 = new File(LOCATION + "/data/loot_tables/blocks/" + MAT_WOOD + "_log_bridge_stair" + ".json");
		File file5 = new File(LOCATION + "/data/loot_tables/blocks/" + MAT_WOOD + "_rail_bridge" + ".json");
		File file6 = new File(LOCATION + "/data/loot_tables/blocks/" + MAT_WOOD + "_rope_bridge_stair" + ".json");
		
		APIWriter.write(LOCATION, file6, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+MAT_WOOD+"_rope_bridge_stair\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file5, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+MAT_WOOD+"_rail_bridge\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file4, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+MAT_WOOD+"_log_bridge_stair\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");

		APIWriter.write(LOCATION, file3, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+MAT_WOOD+"_bridge_pier\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+MAT_WOOD+"_log_bridge_middle\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");
		
		APIWriter.write(LOCATION, file2, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+"rope_"+MAT_WOOD+"_bridge\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");
	
	}
		
	public void RecipesStoneAll(String LOCATION, String CompatModid, String ModidOfBaseMod, String MAT_WOOD)
	{
		File file1 = new File(LOCATION + "/data/recipes/" + MAT_WOOD + "_bridge" + ".json");
		File file2 = new File(LOCATION + "/data/recipes/" + MAT_WOOD + "_bridge_pier" + ".json");
		File file3 = new File(LOCATION + "/data/recipes/" + MAT_WOOD + "_bridge_stair" + ".json");
		
		APIWriter.write(LOCATION, file3, "{\r\n"
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
						+ "            \"item\": \""+CompatModid+":"+MAT_WOOD+"_bridge\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+MAT_WOOD+"_bridge_stair\",\r\n"
						+ "        \"count\": 6\r\n"
						+ "    }\r\n"
						+ "}");
		APIWriter.write(LOCATION, file2, "{\r\n"
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
						+ "            \"item\": \""+ModidOfBaseMod+":"+ MAT_WOOD +"_wall\"\r\n"
						+ "        },\r\n"
						+ "        \r\n"
						+ "        \"W\":\r\n"
						+ "        {\r\n"
						+ "            \"item\": \""+ModidOfBaseMod+":"+ MAT_WOOD +"\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+ MAT_WOOD +"_bridge_pier\",\r\n"
						+ "        \"count\": 3\r\n"
						+ "    }\r\n"
						+ "}");

		APIWriter.write(LOCATION, file1, "{\r\n"
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
						+ "            \"item\": \""+ModidOfBaseMod+":"+MAT_WOOD+"_wall\"\r\n"
						+ "        },\r\n"
						+ "        \r\n"
						+ "        \"W\":\r\n"
						+ "        {\r\n"
						+ "            \"item\": \""+ModidOfBaseMod+":"+MAT_WOOD+"_slab\"\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \r\n"
						+ "    \"result\":\r\n"
						+ "    {\r\n"
						+ "        \"id\":  \""+CompatModid+":"+MAT_WOOD+"_bridge\",\r\n"
						+ "        \"count\": 4\r\n"
						+ "    }\r\n"
						+ "}");
	}
	
	public void LootTableStoneAll(String LOCATION, String CompatModid, String MAT_WOOD)
	{
		File file = new File(LOCATION + "/data/loot_tables/blocks/" + MAT_WOOD + "_bridge" + ".json");
		File file2 = new File(LOCATION + "/data/loot_tables/blocks/" + MAT_WOOD + "_bridge_pier" + ".json");
		File file3 = new File(LOCATION + "/data/loot_tables/blocks/" + MAT_WOOD + "_bridge_stair"  + ".json");

		APIWriter.write(LOCATION, file3, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+MAT_WOOD+"_bridge_stair\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");

		APIWriter.write(LOCATION, file, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+MAT_WOOD+"_bridge\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");
		
		
		APIWriter.write(LOCATION, file2, "{\r\n"
						+ "	\"type\": \"minecraft:block\",\r\n"
						+ "	\"pools\":\r\n"
						+ "	[\r\n"
						+ "		{\r\n"
						+ "			\"rolls\": 1,\r\n"
						+ "			\"entries\":\r\n"
						+ "			[\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"minecraft:item\",\r\n"
						+ "					\"name\": \""+CompatModid+":"+MAT_WOOD+"_bridge_pier\"\r\n"
						+ "				}\r\n"
						+ "			]\r\n"
						+ "		}\r\n"
						+ "	]\r\n"
						+ "}");
	}

}