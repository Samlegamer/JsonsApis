package fr.samlegamer.utils;

import fr.samlegamer.McwAPI;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

public class McwAcaciaGenerator {

    public static void generateAcaciaFromBirchAndTropical() {
        // Dossiers ciblés
        String[] targets = {"mcwdoors", "mcwtrapdoors"};

        for (String target : targets) {
            Path dir = Paths.get(McwAPI.READER, target);
            if (Files.exists(dir)) {
                try (Stream<Path> paths = Files.walk(dir)) {
                    paths.filter(Files::isRegularFile)
                            .filter(p -> p.toString().contains("birch") || p.toString().contains("tropical"))
                            .forEach(McwAcaciaGenerator::processFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void processFile(Path file) {
        try {
            // Lire contenu
            String content = new String(Files.readAllBytes(file));

            // Nouveau contenu (remplacer birch ou tropical par acacia)
            String newContent = content.replaceAll("birch", "acacia")
                    .replaceAll("tropical", "acacia");

            // Nouveau nom de fichier
            String fileName = file.getFileName().toString()
                    .replace("birch", "acacia")
                    .replace("tropical", "acacia");

            Path newFile = file.getParent().resolve(fileName);

            // Écrire nouvelle version
            Files.write(newFile, newContent.getBytes());
            System.out.println("✔ Créé : " + newFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}