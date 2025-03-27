package fr.samlegamer.client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Deprecated
public class RessourcePackMissing
{
	public static void generateBlockstate(String inputDirectory, String outputDirectory) {
        try (Stream<Path> paths = Files.walk(Paths.get(inputDirectory))) {
            List<Path> files = paths
                    .filter(Files::isRegularFile) // Filtrer pour n'obtenir que les fichiers
                    .collect(Collectors.toList());

            for (Path file : files) {
                String fileName = file.getFileName().toString();
                String baseName = fileName.substring(0, fileName.lastIndexOf('.')); // Nom du fichier sans extension

                // Générer le contenu JSON
                String jsonContent = "{\r\n"
                		+ "  \"variants\": {\r\n"
                		+ "    \"\": {\r\n"
                		+ "      \"model\": \"minecraft:block/diamond_block\"\r\n"
                		+ "    }\r\n"
                		+ "  }\r\n"
                		+ "}";

                // Définir le chemin du fichier de sortie
                Path outputPath = Paths.get(outputDirectory, baseName + ".json");

                // Écrire dans un nouveau fichier, sans remplacer l'existant
                if (!Files.exists(outputPath)) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath.toFile()))) {
                        writer.write(jsonContent);
                        System.out.println("Fichier créé : " + outputPath);
                    }
                } else {
                    System.out.println("Fichier existe déjà et n'a pas été remplacé : " + outputPath);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void generateModelsItem(String inputDirectory, String outputDirectory) {
        try (Stream<Path> paths = Files.walk(Paths.get(inputDirectory))) {
            List<Path> files = paths
                    .filter(Files::isRegularFile) // Filtrer pour n'obtenir que les fichiers
                    .collect(Collectors.toList());

            for (Path file : files) {
                String fileName = file.getFileName().toString();
                String baseName = fileName.substring(0, fileName.lastIndexOf('.')); // Nom du fichier sans extension

                // Générer le contenu JSON
                String jsonContent = "{\r\n"
                		+ "  \"parent\": \"minecraft:block/diamond_block\"\r\n"
                		+ "}";

                // Définir le chemin du fichier de sortie
                Path outputPath = Paths.get(outputDirectory, baseName + ".json");

                // Écrire dans un nouveau fichier, sans remplacer l'existant
                if (!Files.exists(outputPath)) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath.toFile()))) {
                        writer.write(jsonContent);
                        System.out.println("Fichier créé : " + outputPath);
                    }
                } else {
                    System.out.println("Fichier existe déjà et n'a pas été remplacé : " + outputPath);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    public static void generateModelsBlock(String baseInputDirectory, String baseOutputDirectory, List<String> subPaths, List<String> outputDirectories) {
        if (subPaths.size() != outputDirectories.size()) {
            throw new IllegalArgumentException("Les listes de sous-chemins et de répertoires de sortie doivent avoir la même taille.");
        }

        for (int i = 0; i < subPaths.size(); i++) {
            String subPath = subPaths.get(i);
            String outputDirectory = outputDirectories.get(i);

            // Définir le chemin complet du fichier source
            String fileName = Paths.get(baseInputDirectory, subPath).toString();
            String baseName = subPath.substring(subPath.lastIndexOf('/') + 1, subPath.lastIndexOf('.')); // Nom du fichier sans extension

            // Générer le contenu JSON
            String jsonContent = "{\r\n"
            		+ "  \"parent\": \"minecraft:block/cube_all\",\r\n"
            		+ "  \"textures\": {\r\n"
            		+ "    \"all\": \"minecraft:block/diamond_block\"\r\n"
            		+ "  }\r\n"
            		+ "}";

            // Définir le chemin du fichier de sortie
            Path outputPath = Paths.get(baseOutputDirectory+outputDirectory, baseName + ".json");

            // Écrire dans un nouveau fichier, sans remplacer l'existant
            if (!Files.exists(outputPath)) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath.toFile()))) {
                    writer.write(jsonContent);
                    System.out.println("Fichier créé : " + outputPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Fichier existe déjà et n'a pas été remplacé : " + outputPath);
            }
        }
    }
}