package fr.samlegamer.utils;

import fr.samlegamer.registry.Compatibilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public final class Reference
{
    private Reference() {}

    public static final String sep = File.separator;

    public static final String bopFolder = "bop" + sep;
    public static final String bygFolder = "byg" + sep;
    public static final String bwgFolder = "bwg" + sep;
    public static final String terraformersmcFolder = "terraformersmc" + sep;
    public static final String quarkFolder = "quark" + sep;
    public static final String sajeviusFolder = "sajevius" + sep;
    public static final String abnormalsFolder = "abnormals" + sep;
    public static final String auroraFolder = "aurora" + sep;
    public static final String moddingLegacyFolder = "moddinglegacy" + sep;

    // For Classic Vanilla Only
    public static final String minecraftFolder = "minecraft" + sep;

    public static List<String> allMcwMods()
    {
        return List.of(
                Compatibilities.MCW_ROOFS_MODID,
                Compatibilities.MCW_FURNITURES_MODID,
                Compatibilities.MCW_BRIDGES_MODID,
                Compatibilities.MCW_FENCES_MODID,
                Compatibilities.MCW_TRAPDOORS_MODID,
                Compatibilities.MCW_PATHS_MODID,
                Compatibilities.MCW_DOORS_MODID,
                Compatibilities.MCW_WINDOWS_MODID,
                Compatibilities.MCW_STAIRS_MODID);
    }

    public static void makeFileWithList(String LOCATION, String MODID, String fileName, List<String> list)
    {
        Path file = Path.of(LOCATION, MODID, fileName + ".txt");

        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardCharsets.UTF_8))
        {
            for(int i = 0; i < list.size(); i++)
            {
                bufferedWriter.write(list.get(i));
                if(i != list.size() - 1)
                {
                    bufferedWriter.newLine();
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void addListWithPath(String LOCATION, String fileName, List<String> list)
    {
        Path directoryForLang = Path.of(LOCATION, fileName + ".txt");

        try (BufferedReader bufferedReader = Files.newBufferedReader(directoryForLang))
        {
            list.addAll(bufferedReader.lines().toList());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}