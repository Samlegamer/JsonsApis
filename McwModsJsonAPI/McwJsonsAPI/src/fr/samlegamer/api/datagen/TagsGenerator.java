package fr.samlegamer.api.datagen;

import fr.samlegamer.registry.Compatibilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TagsGenerator
{
    protected static final String READER_MCW_TAGS = System.getProperty("user.dir") + File.separator + "tags" + File.separator;

    public void registerFolders(String location, String path)
    {
        Path folderBase = Path.of(location + path);

        if(!Files.exists(folderBase))
        {
            try {
                Files.createDirectories(folderBase);
            }
            catch (IOException ex) {
                System.out.println("Couldn't create folder : "+ex.getMessage());
            }
        }
    }


    public TagsGenerator(String LOCATION, List<String> modidIncluded)
    {
        registerFolders(LOCATION, "data/tagsNewGen/minecraft/tags/blocks/mineable/");
        registerFolders(LOCATION, "data/tagsNewGen/minecraft/tags/items/");

        for (String mod : modidIncluded)
        {
            registerFolders(LOCATION, "data/tagsNewGen/"+mod+"/tags/blocks/");
        }
    }

    public void axe(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> modidIncluded)
    {
        Path file = Paths.get(LOCATION, "data/tagsNewGen/minecraft/tags/blocks/mineable/axe.json");

        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            System.out.println("Début");

            List<String> keys = new ArrayList<>();
            final String baseFile = "wood.txt";

            System.out.println("Get Keys for Tags");

            for (String folder : modidIncluded) {
                Path directoryForLang = Path.of(READER_MCW_TAGS, folder, baseFile);

                try (BufferedReader br2 = Files.newBufferedReader(directoryForLang)) {
                    br2.lines().forEach(keys::add);
                } catch (IOException e) {
                    System.err.println("Erreur lors de la lecture du fichier : " + directoryForLang);
                }
            }
            System.out.println("Set in file");

            bw.write("""
                    {\r
                      "replace": false,\r
                      "values": [""");
            bw.newLine();

                for (int i = 0; i < keys.size(); i++) {
                    for (int k = 0; k < ID_WOOD.size(); k++) {
                        final String key = keys.get(i).replace("%k", ID_WOOD.get(k));
                        if (k != 0) {
                            bw.write(",");
                            bw.newLine();
                        }
                        bw.write("  \""+CompatModid+":" + key + "\"");
                    }
                    if (i != keys.size() - 1) {
                        bw.write(",");
                    }
                    bw.newLine();
                }
                bw.write("  ]\r\n" + "}");
                System.out.println("Finish");
            }
        catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + file);
            e.printStackTrace();
        }
    }

    public void pickaxe(String LOCATION, String CompatModid, List<String> ID_ROCK, List<String> modidIncluded)
    {
        Path file = Paths.get(LOCATION, "data/tagsNewGen/minecraft/tags/blocks/mineable/pickaxe.json");

        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            System.out.println("Début");

            List<String> keys = new ArrayList<>();
            final String baseFile = "stone.txt";

            System.out.println("Get Keys for Tags");

            for (String folder : modidIncluded) {
                Path directoryForLang = Path.of(READER_MCW_TAGS, folder, baseFile);

                try (BufferedReader br2 = Files.newBufferedReader(directoryForLang)) {
                    br2.lines().forEach(keys::add);
                } catch (IOException e) {
                    System.err.println("Erreur lors de la lecture du fichier : " + directoryForLang);
                }
            }
            System.out.println("Set in file");

            bw.write("""
                    {\r
                      "replace": false,\r
                      "values": [""");
            bw.newLine();

            for (int i = 0; i < keys.size(); i++) {
                for (int k = 0; k < ID_ROCK.size(); k++) {
                    final String key = keys.get(i).replace("%k", ID_ROCK.get(k));
                    if (k != 0) {
                        bw.write(",");
                        bw.newLine();
                    }
                    bw.write("  \""+CompatModid+":" + key + "\"");
                }
                if (i != keys.size() - 1) {
                    bw.write(",");
                }
                bw.newLine();
            }
            bw.write("  ]\r\n" + "}");
            System.out.println("Finish");
        }
        catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + file);
            e.printStackTrace();
        }
    }

    public void pickaxeBYGSetting(String LOCATION, String CompatModid, List<String> ID_ROCK, String customName, List<String> modidIncluded)
    {
        Path file = Paths.get(LOCATION, "data/tagsNewGen/minecraft/tags/blocks/mineable/pickaxe"+customName+".json");

        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            System.out.println("Début");

            List<String> keys = new ArrayList<>();
            final String baseFile = "stone.txt";

            System.out.println("Get Keys for Tags");

            for (String folder : modidIncluded) {
                Path directoryForLang = Path.of(READER_MCW_TAGS, folder, baseFile);

                try (BufferedReader br2 = Files.newBufferedReader(directoryForLang)) {
                    br2.lines().forEach(keys::add);
                } catch (IOException e) {
                    System.err.println("Erreur lors de la lecture du fichier : " + directoryForLang);
                }
            }
            System.out.println("Set in file");

            bw.write("""
                    {\r
                      "replace": false,\r
                      "values": [""");
            bw.newLine();

            for (int i = 0; i < keys.size(); i++) {
                for (int k = 0; k < ID_ROCK.size(); k++) {
                    final String key = keys.get(i).replace("%k", ID_ROCK.get(k));
                    if (k != 0) {
                        bw.write(",");
                        bw.newLine();
                    }
                    bw.write("  \""+CompatModid+":" + key + "\"");
                }
                if (i != keys.size() - 1) {
                    bw.write(",");
                }
                bw.newLine();
            }
            bw.write("  ]\r\n" + "}");
            System.out.println("Finish");
        }
        catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + file);
            e.printStackTrace();
        }
    }

    public void hoe(String LOCATION, String CompatModid, List<String> ID_LEAVE)
    {
        Path file = Paths.get(LOCATION, "data/tagsNewGen/minecraft/tags/blocks/mineable/hoe.json");

        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            System.out.println("Début");

            List<String> keys = new ArrayList<>();
            final String baseFile = "leave.txt";

            System.out.println("Get Keys for Tags");

            for (String folder : List.of(Compatibilities.MCW_FENCES_MODID)) {
                Path directoryForLang = Path.of(READER_MCW_TAGS, folder, baseFile);

                try (BufferedReader br2 = Files.newBufferedReader(directoryForLang)) {
                    br2.lines().forEach(keys::add);
                } catch (IOException e) {
                    System.err.println("Erreur lors de la lecture du fichier : " + directoryForLang);
                }
            }
            System.out.println("Set in file");

            bw.write("""
                    {\r
                      "replace": false,\r
                      "values": [""");
            bw.newLine();

            for (int i = 0; i < keys.size(); i++) {
                for (int k = 0; k < ID_LEAVE.size(); k++) {
                    final String key = keys.get(i).replace("%k", ID_LEAVE.get(k));
                    if (k != 0) {
                        bw.write(",");
                        bw.newLine();
                    }
                    bw.write("  \""+CompatModid+":" + key + "\"");
                }
                if (i != keys.size() - 1) {
                    bw.write(",");
                }
                bw.newLine();
            }
            bw.write("  ]\r\n" + "}");
            System.out.println("Finish");
        }
        catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + file);
            e.printStackTrace();
        }
    }

    public void vanilla(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> ID_LEAVE, List<String> ID_ROCK, List<String> modidIncluded)
    {
        List<String> vanillaFilesBlocks = List.of("walls", "fences", "fence_gates", "wooden_doors", "wooden_fences", "wooden_trapdoors");
        List<String> vanillaFilesItems = List.of("walls", "fences", "wooden_doors", "wooden_fences", "wooden_trapdoors");

        setTagsVanillaType("blocks", LOCATION, CompatModid, vanillaFilesBlocks, ID_WOOD, ID_ROCK, ID_LEAVE, modidIncluded);
        setTagsVanillaType("items", LOCATION, CompatModid, vanillaFilesItems, ID_WOOD, ID_ROCK, ID_LEAVE, modidIncluded);
    }

    private void setTagsVanillaType(String typeFolder, String LOCATION, String CompatModid, List<String> vanillaFiles, List<String> ID_WOOD, List<String> ID_ROCK, List<String> ID_LEAVE, List<String> modidIncluded)
    {
        for(String vanilla : vanillaFiles)
        {
            Path file = Paths.get(LOCATION, "data/tagsNewGen/minecraft/tags/"+typeFolder+"/"+vanilla+".json");

            List<String> elementInWood = new ArrayList<>();
            List<String> elementInStone = new ArrayList<>();
            List<String> elementInLeave = new ArrayList<>();

            for(String mod : modidIncluded)
            {
                Path fileWOOD = Path.of(READER_MCW_TAGS, mod+"/"+typeFolder+"/"+vanilla+"WOOD.txt");
                Path fileSTONE = Path.of(READER_MCW_TAGS, mod+"/"+typeFolder+"/"+vanilla+"STONE.txt");
                Path fileLEAVE = Path.of(READER_MCW_TAGS, mod+"/"+typeFolder+"/"+vanilla+"LEAVE.txt");

                if(!ID_WOOD.isEmpty())
                {
                    collectorInFile(fileWOOD, elementInWood);
                }
                if(!ID_ROCK.isEmpty())
                {
                    collectorInFile(fileSTONE, elementInStone);
                }
                if(!ID_LEAVE.isEmpty())
                {
                    collectorInFile(fileLEAVE, elementInLeave);
                }
            }

            if(!Files.exists(file)) {
                try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
                    bufferedWriter.write("""
                            {\r
                              "replace": false,\r
                              "values": [""");
                    bufferedWriter.newLine();

                    if (!ID_WOOD.isEmpty()) {
                        for (String element : elementInWood) {
                            for (String wood : ID_WOOD) {
                                final String id = element.replace("%k", wood);

                                bufferedWriter.write("  \"" + CompatModid + ":" + id + "\"");
                                if (ID_WOOD.indexOf(wood) != ID_WOOD.size() - 1) {
                                    bufferedWriter.write(",");
                                    bufferedWriter.newLine();
                                }
                            }
                            if (elementInWood.indexOf(element) != elementInWood.size() - 1) {
                                bufferedWriter.write(",");
                                bufferedWriter.newLine();
                            }
                        }
                    }

                    if (!ID_ROCK.isEmpty()) {
                        for (String element : elementInStone) {
                            if (!elementInWood.isEmpty() && elementInStone.getFirst().equals(element)) {
                                bufferedWriter.write(",");
                                bufferedWriter.newLine();
                            }

                            for (String stone : ID_ROCK) {
                                final String id = element.replace("%k", stone);

                                bufferedWriter.write("  \"" + CompatModid + ":" + id + "\"");
                                if (ID_ROCK.indexOf(stone) != ID_ROCK.size() - 1) {
                                    bufferedWriter.write(",");
                                    bufferedWriter.newLine();
                                }
                            }
                            if (elementInStone.indexOf(element) != elementInStone.size() - 1) {
                                bufferedWriter.write(",");
                                bufferedWriter.newLine();
                            }
                        }
                    }

                    if (!ID_LEAVE.isEmpty()) {
                        for (String element : elementInLeave) {
                            if ((!elementInStone.isEmpty() && elementInLeave.getFirst().equals(element)) || (!elementInWood.isEmpty() && elementInLeave.getFirst().equals(element))) {
                                bufferedWriter.write(",");
                                bufferedWriter.newLine();
                            }

                            for (String leave : ID_LEAVE) {
                                final String id = element.replace("%k", leave);

                                bufferedWriter.write("  \"" + CompatModid + ":" + id + "\"");
                                if (ID_LEAVE.indexOf(leave) != ID_LEAVE.size() - 1) {
                                    bufferedWriter.write(",");
                                    bufferedWriter.newLine();
                                }
                            }
                            if (elementInLeave.indexOf(element) != elementInLeave.size() - 1) {
                                bufferedWriter.write(",");
                                bufferedWriter.newLine();
                            }
                        }
                    }

                    bufferedWriter.write("  ]\r\n" + "}");
                } catch (IOException e) {
                    System.err.println("Erreur lors de l'écriture final du fichier vanilla : " + file);
                }
            }
        }
    }

    private void collectorInFile(Path file, List<String> list)
    {
        if(Files.exists(file))
        {
            try (BufferedReader bufferedReader = Files.newBufferedReader(file))
            {
                list.addAll(bufferedReader.lines().toList());
            }
            catch (IOException e)
            {
                System.err.println("Erreur lors de la lecture du fichier vanilla : " + file);
            }
        }
    }

    public void mcwMods(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> ID_LEAVE, List<String> ID_ROCK, List<String> modidIncluded)
    {
        for(String mod : modidIncluded)
        {
            try(Stream<Path> fileName = Files.list(Path.of(READER_MCW_TAGS, mod+"/moddedTags/blocks/")))
            {
                for(Path file : fileName.toList())
                {
                    if(file.getFileName().toString().endsWith("WOOD.txt") && !ID_WOOD.isEmpty())
                    {
                        String fileNameString = file.getFileName().toString().replace("WOOD.txt", "");
                        Path fileOut = Paths.get(LOCATION, "data/tagsNewGen/"+mod+"/tags/blocks/"+fileNameString+".json");
                        List<String> elementInTagWood = new ArrayList<>();

                        collectorInFile(file, elementInTagWood);

                        if(!Files.exists(fileOut)) {
                            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(fileOut, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
                                bufferedWriter.write("""
                                        {\r
                                          "replace": false,\r
                                          "values": [""");
                                bufferedWriter.newLine();

                                for (String element : elementInTagWood) {
                                    for (String wood : ID_WOOD) {
                                        final String id = element.replace("%k", wood);

                                        bufferedWriter.write("  \"" + CompatModid + ":" + id + "\"");
                                        if (ID_WOOD.indexOf(wood) != ID_WOOD.size() - 1) {
                                            bufferedWriter.write(",");
                                            bufferedWriter.newLine();
                                        }
                                    }
                                    if (elementInTagWood.indexOf(element) != elementInTagWood.size() - 1) {
                                        bufferedWriter.write(",");
                                        bufferedWriter.newLine();
                                    }
                                }

                                bufferedWriter.write("  ]\r\n" + "}");
                            } catch (IOException e) {
                                System.err.println("Erreur lors de l'écriture final du fichier vanilla : " + fileOut);
                            }
                        }
                    }

                    if(file.getFileName().toString().endsWith("LEAVE.txt") && !ID_LEAVE.isEmpty())
                    {
                        String fileNameString = file.getFileName().toString().replace("LEAVE.txt", "");
                        Path fileOut = Paths.get(LOCATION, "data/tagsNewGen/"+mod+"/tags/blocks/"+fileNameString+".json");
                        List<String> elementInTagWood = new ArrayList<>();

                        collectorInFile(file, elementInTagWood);

                        if(!Files.exists(fileOut)) {
                            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(fileOut, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
                                bufferedWriter.write("""
                                        {\r
                                          "replace": false,\r
                                          "values": [""");
                                bufferedWriter.newLine();

                                for (String element : elementInTagWood) {
                                    for (String wood : ID_LEAVE) {
                                        final String id = element.replace("%k", wood);

                                        bufferedWriter.write("  \"" + CompatModid + ":" + id + "\"");
                                        if (ID_LEAVE.indexOf(wood) != ID_LEAVE.size() - 1) {
                                            bufferedWriter.write(",");
                                            bufferedWriter.newLine();
                                        }
                                    }
                                    if (elementInTagWood.indexOf(element) != elementInTagWood.size() - 1) {
                                        bufferedWriter.write(",");
                                        bufferedWriter.newLine();
                                    }
                                }

                                bufferedWriter.write("  ]\r\n" + "}");
                            } catch (IOException e) {
                                System.err.println("Erreur lors de l'écriture final du fichier vanilla : " + fileOut);
                            }
                        }
                    }

                    if(file.getFileName().toString().endsWith("STONE.txt") && !ID_ROCK.isEmpty())
                    {
                        String fileNameString = file.getFileName().toString().replace("STONE.txt", "");
                        Path fileOut = Paths.get(LOCATION, "data/tagsNewGen/"+mod+"/tags/blocks/"+fileNameString+".json");
                        List<String> elementInTagWood = new ArrayList<>();

                        collectorInFile(file, elementInTagWood);

                        if(!Files.exists(fileOut)) {
                            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(fileOut, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
                                bufferedWriter.write("""
                                        {\r
                                          "replace": false,\r
                                          "values": [""");
                                bufferedWriter.newLine();

                                for (String element : elementInTagWood) {
                                    for (String wood : ID_ROCK) {
                                        final String id = element.replace("%k", wood);

                                        bufferedWriter.write("  \"" + CompatModid + ":" + id + "\"");
                                        if (ID_ROCK.indexOf(wood) != ID_ROCK.size() - 1) {
                                            bufferedWriter.write(",");
                                            bufferedWriter.newLine();
                                        }
                                    }
                                    if (elementInTagWood.indexOf(element) != elementInTagWood.size() - 1) {
                                        bufferedWriter.write(",");
                                        bufferedWriter.newLine();
                                    }
                                }

                                bufferedWriter.write("  ]\r\n" + "}");
                            } catch (IOException e) {
                                System.err.println("Erreur lors de l'écriture final du fichier vanilla : " + fileOut);
                            }
                        }
                    }
                }
            }
            catch (IOException e)
            {
                System.err.println("Erreur lors de la lecture du fichier vanilla : " + e.getMessage());
            }
        }
    }
}
