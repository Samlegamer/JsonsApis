package fr.samlegamer.droptherock;

import fr.samlegamer.utils.APIWriter;

import java.nio.file.Path;

public class DTRData
{
    private final String LOCATION;

    public DTRData(String LOCATION)
    {
        this.LOCATION = LOCATION;
    }

    public void recipe_cobbleAllStuff(String modid, String name, String modidOrigin)
    {
        recipe_cobble(modid, name, modidOrigin);
        recipe_cobbleSlab(modid, name, modidOrigin);
        recipe_cobbleStairs(modid, name, modidOrigin);
        recipe_cobbleWall(modid, name, modidOrigin);
    }

    public void recipe_cobbleWall(String modid, String name, String modidOrigin)
    {
        APIWriter.write(Path.of(LOCATION, name+"_cobblestone_wall_stonecutting.json"), "{\n" +
                "  \"type\": \"minecraft:stonecutting\",\n" +
                "  \"ingredient\": {\n" +
                "    \"item\": \""+modid+":"+name+"_cobblestone\"\n" +
                "  },\n" +
                "  \"result\": \""+modid+":"+name+"_cobblestone_wall\",\n" +
                "  \"count\": 1\n" +
                "}");

        APIWriter.write(Path.of(LOCATION, name+"_cobblestone_wall.json"), "{\n" +
                "  \"type\": \"forge:conditional\",\n" +
                "  \"recipes\": [\n" +
                "    {\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"modid\": \""+modidOrigin+"\",\n" +
                "          \"type\": \"forge:mod_loaded\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"recipe\": {\n" +
                "        \"type\": \"minecraft:crafting_shaped\",\n" +
                "        \"group\": \"wall\",\n" +
                "        \"pattern\": [\n" +
                "          \"###\",\n" +
                "          \"###\"\n" +
                "        ],\n" +
                "        \"key\": {\n" +
                "          \"#\": {\n" +
                "            \"item\": \""+modid+":"+name+"_cobblestone\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"result\": {\n" +
                "          \"item\": \""+modid+":"+name+"_cobblestone_wall\",\n" +
                "          \"count\": 6\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}");

    }

    public void recipe_cobbleStairs(String modid, String name, String modidOrigin)
    {
        APIWriter.write(Path.of(LOCATION, name+"_cobblestone_stairs_stonecutting.json"), "{\n" +
                "  \"type\": \"minecraft:stonecutting\",\n" +
                "  \"ingredient\": {\n" +
                "    \"item\": \""+modid+":"+name+"_cobblestone\"\n" +
                "  },\n" +
                "  \"result\": \""+modid+":"+name+"_cobblestone_stairs\",\n" +
                "  \"count\": 1\n" +
                "}");

        APIWriter.write(Path.of(LOCATION, name+"_cobblestone_stairs.json"), "{\n" +
                "  \"type\": \"forge:conditional\",\n" +
                "  \"recipes\": [\n" +
                "    {\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"modid\": \""+modidOrigin+"\",\n" +
                "          \"type\": \"forge:mod_loaded\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"recipe\": {\n" +
                "        \"type\": \"minecraft:crafting_shaped\",\n" +
                "        \"group\": \"stair\",\n" +
                "        \"pattern\": [\n" +
                "          \"#  \",\n" +
                "          \"## \",\n" +
                "          \"###\"\n" +
                "        ],\n" +
                "        \"key\": {\n" +
                "          \"#\": {\n" +
                "            \"item\": \""+modid+":"+name+"_cobblestone\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"result\": {\n" +
                "          \"item\": \""+modid+":"+name+"_cobblestone_stairs\",\n" +
                "          \"count\": 4\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}");
    }

    public void recipe_cobbleSlab(String modid, String name, String modidOrigin)
    {
        APIWriter.write(Path.of(LOCATION, name+"_cobblestone_slab_stonecutting.json"), "{\n" +
                "  \"type\": \"minecraft:stonecutting\",\n" +
                "  \"ingredient\": {\n" +
                "    \"item\": \""+modid+":"+name+"_cobblestone\"\n" +
                "  },\n" +
                "  \"result\": \""+modid+":"+name+"_cobblestone_slab\",\n" +
                "  \"count\": 2\n" +
                "}");

        APIWriter.write(Path.of(LOCATION, name+"_cobblestone_slab.json"), "{\n" +
                "  \"type\": \"forge:conditional\",\n" +
                "  \"recipes\": [\n" +
                "    {\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"modid\": \""+modidOrigin+"\",\n" +
                "          \"type\": \"forge:mod_loaded\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"recipe\": {\n" +
                "        \"type\": \"minecraft:crafting_shaped\",\n" +
                "        \"group\": \"slab\",\n" +
                "        \"pattern\": [\n" +
                "          \"###\"\n" +
                "        ],\n" +
                "        \"key\": {\n" +
                "          \"#\": {\n" +
                "            \"item\": \""+modid+":"+name+"_cobblestone\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"result\": {\n" +
                "          \"item\": \""+modid+":"+name+"_cobblestone_slab\",\n" +
                "          \"count\": 6\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}");
    }

    public void recipe_cobble(String modid, String name, String modidOrigin)
    {
        APIWriter.write(Path.of(LOCATION, name+"_cobblestone.json"), "{\n" +
                "  \"type\": \"forge:conditional\",\n" +
                "  \"recipes\": [\n" +
                "    {\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"modid\": \""+modidOrigin+"\",\n" +
                "          \"type\": \"forge:mod_loaded\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"recipe\": {\n" +
                "        \"type\": \"minecraft:crafting_shaped\",\n" +
                "        \"group\": \"rock\",\n" +
                "        \"pattern\": [\n" +
                "          \"##\",\n" +
                "          \"##\"\n" +
                "        ],\n" +
                "        \"key\": {\n" +
                "          \"#\": {\n" +
                "            \"item\": \""+modid+":"+name+"_loose_rock\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"result\": {\n" +
                "          \"item\": \""+modid+":"+name+"_cobblestone\"\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}");
    }

    public void loot_table_stuffs_cobble(String modid, String name)
    {
        loot_tables(modid, name);
        loot_tables(modid, name+"_slab");
        loot_tables(modid, name+"_wall");
        loot_tables(modid, name+"_stairs");
    }

    public void loot_tables(String modid, String name)
    {
        APIWriter.write(Path.of(LOCATION, name+".json"), "{\n" +
                "  \"type\": \"minecraft:block\",\n" +
                "  \"pools\": [\n" +
                "    {\n" +
                "      \"rolls\": 1,\n" +
                "      \"entries\": [\n" +
                "        {\n" +
                "          \"type\": \"minecraft:item\",\n" +
                "          \"name\": \""+modid+":"+name+"\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"condition\": \"minecraft:survives_explosion\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}");

    }
}
