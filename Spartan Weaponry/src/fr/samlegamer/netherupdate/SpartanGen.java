package fr.samlegamer.netherupdate;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.samlegamer.SpartanMain;
import fr.samlegamer.utils.ClassicFolderTypes;

public class SpartanGen
{
	private static final String s = File.separator;
	private String MOD_ID;
	private String VERSION;

	public SpartanGen(String modidData)
	{
		this.VERSION = "1.20";
		this.MOD_ID = modidData;
	}
	
	public SpartanGen(String modidData, String otherVersion)
	{
		this.VERSION = otherVersion;
		this.MOD_ID = modidData;
	}
	
	public void AdvancementsLogAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood)
	{
		Path directory = Paths.get(SpartanMain.READER+VERSION+s+MOD_ID+s+ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
		for(String i : MAT_WOOD)
		{
	        // Filtrer et traiter les fichiers contenant "acacia" dans leur nom
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
	                    // Lire tout le contenu du fichier
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	
	                    // Remplacer "acacia" par "cherry" dans le contenu
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(SpartanMain.location+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
	                    // �crire le contenu modifi� dans un nouveau fichier
	                    Files.write(newFilePath, modifiedLines, StandardCharsets.UTF_8);
	                    SpartanMain.message(newFilePath.toFile());
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
