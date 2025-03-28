package fr.samlegamer.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwMain;

public final class JsonsUtils
{
	private JsonsUtils() {}
	
	/* Delete a specific file (ex : data hedge */
    public static void deleter(String path, String file) {
        Path filePath = Paths.get(path, file);
        try {
            Files.deleteIfExists(filePath);
            System.out.println("Files deleted : " + filePath);
        } catch (IOException e) {
            System.err.println("Error with deleter : " + e.getMessage());
        }
    }

    /* Replace data in files, used for specific leaves name in BYG */
    public static void replacer(String path, String name, String elementOld, String elementNew) {
        File directory = new File(path);
        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("Folder is invalid.");
            return;
        }
        
        File[] files = directory.listFiles((dir, filename) -> filename.contains(name));
        if (files == null || files.length == 0) {
            System.out.println("No file found.");
            return;
        }
        
        for (File file : files) {
            try {
                Path filePath = file.toPath();
                String content = new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
                String updatedContent = content.replace(elementOld, elementNew);
                Files.write(filePath, updatedContent.getBytes(StandardCharsets.UTF_8));
                System.out.println("Updated : " + file.getName());
            } catch (IOException e) {
                System.err.println("Error on update " + file.getName() + " : " + e.getMessage());
            }
        }
    }

    public static void adder1214(String path, String name, String element, String element1) {
    	Path directory = Path.of(path);
        
        try(Stream<Path> files = Files.list(directory))
        {
            List<Path> filesItems = files
                    .filter(file -> file.getFileName().toString().contains(name))
                    .collect(Collectors.toList());
            for (Path file : filesItems) {
                try {
                    List<String> content = Files.readAllLines(file, StandardCharsets.UTF_8);
                    List<String> modifiedLines = content.stream()	                            
                    		.map(line -> line.replace("parent", "model"))
                    		.collect(Collectors.toList());

                    String modLoadedCondition = element;
                    String modLoadedCondition2 = element1;

                     modifiedLines.add(1, modLoadedCondition);
                     modifiedLines.add(4, modLoadedCondition2);
                     
	                    String newFileName = file.getFileName().toString();
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"items"+File.separator, newFileName);
	
	                    Files.write(newFilePath, modifiedLines, StandardCharsets.UTF_8);
	                    McwAPI.message(newFilePath);

                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	public static void Doors1214(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path directory = Paths.get(McwAPI.READER+"1.21.4"+File.separator+"doorsSpecial"+File.separator+McwAPI.ClassicFolderTypes.ITEMS.getPath());
		
		for(String i : MAT_WOOD)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	                    
	                    
	                    
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("mcwdoors:item", CompatModid+":item"))
	                            .map(line -> line.replace("acacia", i))
	                            .collect(Collectors.toList());

	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"items"+File.separator, newFileName);
	
	                    Files.write(newFilePath, modifiedLines, StandardCharsets.UTF_8);
	                    McwAPI.message(newFilePath);
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
	}

    public static void addToLangStone(String LOCATION, String compatId, List<String> ID_ROCK,
                                List<String> LANG_ROCK, String language, List<String> modidCharged) {
        Path file = Paths.get(LOCATION, language + "(STONE).json");

        try {
            // Lire l'ancien JSON si le fichier existe
            StringBuilder ancienJson = new StringBuilder();
            if (Files.exists(file)) {
                ancienJson.append(Files.readString(file, StandardCharsets.UTF_8).trim());
            }

            // Construire les nouvelles entrées JSON
            StringBuilder nouvellesEntrees = new StringBuilder();
            nouvellesEntrees.append("{\n");

            List<String> keys = new ArrayList<>();
            List<String> languages = new ArrayList<>();

            final String baseFile = "stone.txt";

            for (String folder : modidCharged) {
                Path directoryForLang = Path.of("READER", language, folder, baseFile);

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

            boolean firstEntry = true;
            if (languages.size() == keys.size()) {
                for (int i = 0; i < keys.size(); i++) {
                    if (ID_ROCK.size() == LANG_ROCK.size()) {
                        for (int k = 0; k < LANG_ROCK.size(); k++) {
                            final String key = keys.get(i).replace("%k", ID_ROCK.get(k));
                            final String lang = languages.get(i).replace("%l", LANG_ROCK.get(k));

                            if (!firstEntry) {
                                nouvellesEntrees.append(",\n");
                            }
                            nouvellesEntrees.append("  \"block.").append(compatId).append(".").append(key).append("\": \"").append(lang).append("\"");
                            firstEntry = false;
                        }
                    }
                }
            }

            // Ajouter l'ancien JSON après les nouvelles entrées
            if (!ancienJson.isEmpty() && !ancienJson.toString().equals("{}")) {
                if (!firstEntry) {
                    nouvellesEntrees.append(",\n");
                }
                nouvellesEntrees.append(ancienJson.substring(1)); // Enlever la première accolade '{'
            } else {
                nouvellesEntrees.append("\n}");
            }

            // Écriture dans le fichier
            Files.writeString(file, nouvellesEntrees.toString(), StandardCharsets.UTF_8);
            System.out.println("Mise à jour réussie !");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + file);
            e.printStackTrace();
        }
    }

    private static String getWithDelimiter(String line, char start, char end) {
        int startIndex = line.indexOf(start) + 1;
        int endIndex = line.indexOf(end, startIndex);
        return (startIndex > 0 && endIndex > startIndex) ? line.substring(startIndex, endIndex) : "";
    }

    private static String getWithDelimiter(String line, char delimiter) {
        int index = line.indexOf(delimiter);
        return (index >= 0) ? line.substring(index + 1) : "";
    }
}