package fr.samlegamer.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

	
	public static void PreReplacedRecipe1213(String LOCATION) {
	    File outputDir = new File("convert");
	    if (!outputDir.exists()) {
	        outputDir.mkdir();
	    }

        File directory = new File(LOCATION);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".json"));

        if (files == null || files.length == 0) {
            System.out.println("❌ Aucun fichier JSON trouvé dans '" + LOCATION + "' !");
            return;
        }

        for (File file : files) {
            try {
                // Lire le contenu du fichier
                String content = Files.readString(file.toPath());
                System.out.println("\n🔹 JSON d'origine de " + file.getName() + " :\n" + content);

                // Supprimer les conditions (optionnel)
                content = removeConditions(content);

                // Convertir le format JSON
                String convertedContent = convertRecipeFormat(content);
                System.out.println("\n🔹 JSON converti :\n" + convertedContent);

                // Trouver le nom du fichier basé sur "result" : { "id": "mod:item" }
                String outputFilename = file.getName();
                Matcher matcher = Pattern.compile("\"id\"\\s*:\\s*\"([a-z0-9_]+):([a-z0-9_]+)\"").matcher(convertedContent);
                if (matcher.find()) {
                    outputFilename = matcher.group(2) + ".json";
                }

                // Sauvegarder le fichier converti
                Files.writeString(Path.of("convert", outputFilename), convertedContent);
                System.out.println("✅ Converti : " + file.getName() + " → " + outputFilename);

            } catch (Exception e) {
                System.err.println("❌ Erreur lors de la conversion de " + file.getName());
                e.printStackTrace();
            }
        }

        System.out.println("\n🎉 Conversion terminée ! Les fichiers sont dans 'convert/'.");
    }

    private static String removeConditions(String json) {
        // Supprime les "conditions": [...] du JSON (facultatif)
        return json.replaceAll("\"conditions\"\\s*:\\s*\\[.*?],", "");
    }

    private static String convertRecipeFormat(String json) {
        // Remplace les anciennes clés JSON dans "key" pour shaped
        Pattern shapedPattern = Pattern.compile("\"([a-zA-Z0-9_])\"\\s*:\\s*\\{\\s*\"item\"\\s*:\\s*\"([^\"]+)\"\\s*}");
        Matcher shapedMatcher = shapedPattern.matcher(json);
        StringBuffer sb = new StringBuffer();
        while (shapedMatcher.find()) {
            shapedMatcher.appendReplacement(sb, "\"" + shapedMatcher.group(1) + "\": \"" + shapedMatcher.group(2) + "\"");
        }
        shapedMatcher.appendTail(sb);
        json = sb.toString();

        // Remplace les ingrédients dans "ingredients" pour shapeless
        Pattern shapelessPattern = Pattern.compile("\\{\\s*\"item\"\\s*:\\s*\"([^\"]+)\"\\s*}");
        Matcher shapelessMatcher = shapelessPattern.matcher(json);
        sb = new StringBuffer();
        while (shapelessMatcher.find()) {
            shapelessMatcher.appendReplacement(sb, "\"" + shapelessMatcher.group(1) + "\"");
        }
        shapelessMatcher.appendTail(sb);

        return sb.toString();
    }
}