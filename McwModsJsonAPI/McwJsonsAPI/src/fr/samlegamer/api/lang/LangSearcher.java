package fr.samlegamer.api.lang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LangSearcher {
    private final List<String> modidCharged = new ArrayList<>();
    private final boolean bridges;
    private final boolean roofs;
    private final boolean fences;
    private final boolean furnitures;
    private final boolean stairs;
    private final boolean paths;
    private final boolean doors;
    private final boolean trapdoors;
    private final boolean windows;
    private final String READER;

    public LangSearcher(String READER, boolean bridges, boolean roofs, boolean fences, boolean furnitures,
                        boolean stairs, boolean paths, boolean doors, boolean trapdoors, boolean windows) {
        this.bridges = bridges;
        this.roofs = roofs;
        this.fences = fences;
        this.furnitures = furnitures;
        this.stairs = stairs;
        this.paths = paths;
        this.doors = doors;
        this.trapdoors = trapdoors;
        this.windows = windows;
        this.READER = READER;
    }

    public LangSearcher(String READER) {
        this(READER, true, true, true, true, true, true, true, true, true);
    }

    private void addWithBool(boolean b, String str) {
        if (b) {
            modidCharged.add(str);
        }
    }

    private String getWithDelimiter(String line, char delimiter1, char delimiter2) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == delimiter1) {
                int j = i + 1;
                while (j < line.length() && line.charAt(j) != delimiter2) {
                    str.append(line.charAt(j));
                    j++;
                }
                break; // On sort après avoir trouvé la première occurrence
            }
        }

        return str.toString();
    }

    private String getWithDelimiter(String line, char delimiter) {
        return getWithDelimiter(line, delimiter, delimiter);
    }

    public void initWood(String LOCATION, String compatId, List<String> ID_WOOD, List<String> LANG_WOOD, String language, List<String> modidCharged) {
        Path file = Paths.get(LOCATION, language + "(WOOD).json");

        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            System.out.println("Début");

            List<String> keys = new ArrayList<>();
            List<String> languages = new ArrayList<>();

            final String baseFile = "wood.txt";

            System.out.println("Get Keys et Languages");

            for (String folder : modidCharged) {
                Path directoryForLang = Path.of(READER, language, folder, baseFile);

                try (BufferedReader br2 = Files.newBufferedReader(directoryForLang)) {
                    br2.lines().forEach(line -> {
                        final String key = getWithDelimiter(line, '<', '>');
                        final String lang = getWithDelimiter(line, '"');
                        keys.add(key);
                        languages.add(lang);
                    });
                } catch (IOException e) {
                    System.err.println("Erreur lors de la lecture du fichier : " + directoryForLang);
                    e.printStackTrace();
                }
            }
            System.out.println("Set in file");

            bw.write("{\n");

            if (languages.size() == keys.size()) {
                for (int i = 0; i < keys.size(); i++) {
                    if (ID_WOOD.size() == LANG_WOOD.size()) {
                        for (int k = 0; k < LANG_WOOD.size(); k++) {
                            final String key = keys.get(i).replace("%k", ID_WOOD.get(k));
                            final String lang = languages.get(i).replace("%l", LANG_WOOD.get(k));
                            if (k != 0) {
                                bw.write(",");
                                bw.newLine();
                            }
                            bw.write("\"block." + compatId + "." + key + "\":\"" + lang + "\"");
                        }
                        if (i != keys.size()-1) {
                            bw.write(",");
                        }
                        bw.newLine();
                    }
                }
                bw.write("}");

                System.out.println("Finish");

            }
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + file);
            e.printStackTrace();
        }
    }

    public void initLeaves(String LOCATION, String compatId, List<String> ID_LEAVE, List<String> LANG_LEAVE, String language) {
        Path file = Paths.get(LOCATION, language + "(LEAVE).json");

        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            System.out.println("Début");

            List<String> keys = new ArrayList<>();
            List<String> languages = new ArrayList<>();

            final String baseFile = "leave.txt";

            System.out.println("Get Keys et Languages");

            var list = List.of("mcwfences");

            for (String folder : list) {
                Path directoryForLang = Path.of(READER, language, folder, baseFile);

                try (BufferedReader br2 = Files.newBufferedReader(directoryForLang)) {
                    br2.lines().forEach(line -> {
                        final String key = getWithDelimiter(line, '<', '>');
                        final String lang = getWithDelimiter(line, '"');
                        keys.add(key);
                        languages.add(lang);
                    });
                } catch (IOException e) {
                    System.err.println("Erreur lors de la lecture du fichier : " + directoryForLang);
                    e.printStackTrace();
                }
            }
            System.out.println("Set in file");

            bw.write("{\n");

            if (languages.size() == keys.size()) {
                for (int i = 0; i < keys.size(); i++) {
                    if (ID_LEAVE.size() == LANG_LEAVE.size()) {
                        for (int k = 0; k < LANG_LEAVE.size(); k++) {
                            final String key = keys.get(i).replace("%k", ID_LEAVE.get(k));
                            final String lang = languages.get(i).replace("%l", LANG_LEAVE.get(k));
                            if (k != 0) {
                                bw.write(",");
                                bw.newLine();
                            }
                            bw.write("\"block." + compatId + "." + key + "\":\"" + lang + "\"");
                        }
                        if (i != keys.size()-1) {
                            bw.write(",");
                        }
                        bw.newLine();
                    }
                }
                bw.write("}");

                System.out.println("Finish");

            }
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + file);
            e.printStackTrace();
        }
    }

    public void initRock(String LOCATION, String compatId, List<String> ID_ROCK, List<String> LANG_ROCK, String language, List<String> modidCharged) {
        Path file = Paths.get(LOCATION, language + "(STONE).json");

        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            System.out.println("Début");

            List<String> keys = new ArrayList<>();
            List<String> languages = new ArrayList<>();

            final String baseFile = "stone.txt";

            System.out.println("Get Keys et Languages");

            for (String folder : modidCharged) {
                Path directoryForLang = Path.of(READER, language, folder, baseFile);

                try (BufferedReader br2 = Files.newBufferedReader(directoryForLang)) {
                    br2.lines().forEach(line -> {
                        final String key = getWithDelimiter(line, '<', '>');
                        final String lang = getWithDelimiter(line, '"');
                        keys.add(key);
                        languages.add(lang);
                    });
                } catch (IOException e) {
                    System.err.println("Erreur lors de la lecture du fichier : " + directoryForLang);
                    e.printStackTrace();
                }
            }
            System.out.println("Set in file");

            bw.write("{\n");

            if (languages.size() == keys.size()) {
                for (int i = 0; i < keys.size(); i++) {
                    if (ID_ROCK.size() == LANG_ROCK.size()) {
                        for (int k = 0; k < LANG_ROCK.size(); k++) {
                            final String key = keys.get(i).replace("%k", ID_ROCK.get(k));
                            final String lang = languages.get(i).replace("%l", LANG_ROCK.get(k));
                            if (k != 0) {
                                bw.write(",");
                                bw.newLine();
                            }
                            bw.write("\"block." + compatId + "." + key + "\":\"" + lang + "\"");
                        }
                        if (i != keys.size()-1) {
                            bw.write(",");
                        }
                        bw.newLine();
                    }
                }
                bw.write("}");

                System.out.println("Finish");

            }
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + file);
            e.printStackTrace();
        }
    }
}