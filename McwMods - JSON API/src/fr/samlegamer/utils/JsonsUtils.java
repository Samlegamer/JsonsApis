package fr.samlegamer.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

}