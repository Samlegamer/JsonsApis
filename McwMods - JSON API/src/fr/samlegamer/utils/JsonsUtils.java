package fr.samlegamer.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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

}