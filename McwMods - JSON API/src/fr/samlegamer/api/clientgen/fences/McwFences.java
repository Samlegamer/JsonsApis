package fr.samlegamer.api.clientgen.fences;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.samlegamer.McwMain;
import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;
@Deprecated
public class McwFences implements IModFiles.IClient
{
	private static final String s = File.separator;
	private static final String MOD_ID = "mcwfences";
	private String VERSION;
	
	public McwFences()
	{
		this.VERSION = "1.20";
	}
	
	public McwFences(String otherVersion)
	{
		this.VERSION = otherVersion;
	}
	
	@Override
	public void createWoodBlockstates(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.BLOCKSTATES.getPath());
		
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
	                            //.map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+MAT_WOOD.get(0) + (isStemWood ? "_stem" : "_log")))
	                           // .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+MAT_WOOD.get(0)))
	                            .map(line -> line.replace(MOD_ID, CompatModid))
	                            .map(line -> line.replace("acacia", i))
	                            .collect(Collectors.toList());

	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.BLOCKSTATES.getPath(), newFileName);

	                    // �crire le contenu modifi� dans un nouveau fichier
	                    Files.write(newFilePath, modifiedLines, StandardCharsets.UTF_8);
	                    McwAPI.message(newFilePath.toFile());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
	}

	@Override
	public void createWoodModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, boolean isStemWood)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL.getPathList())
		{
			directories.add(Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str));
			
			for(Path directory : directories)
			{
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
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/stripped_"+i+(isStemWood ? "_stem" : "_log")))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+i+(isStemWood ? "_stem" : "_log")))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"_planks"))
			                            .collect(Collectors.toList());
		
			                    // D�terminer le nouveau nom de fichier
			                    String newFileName = file.getFileName().toString().replace("acacia", i);
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
			                    // �crire le contenu modifi� dans un nouveau fichier
			                    Files.write(newFilePath, modifiedLines, StandardCharsets.UTF_8);
			                    McwAPI.message(newFilePath.toFile());
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
	}

	@Override
	public void createWoodCustomModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL.getPathList())
		{
			directories.add(Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str));
			
			for(Path directory : directories)
			{
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
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesStripped))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesLogs))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesPlanks))
			                            .collect(Collectors.toList());
		
			                    // D�terminer le nouveau nom de fichier
			                    String newFileName = file.getFileName().toString().replace("acacia", i);
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
			                    // �crire le contenu modifi� dans un nouveau fichier
			                    Files.write(newFilePath, modifiedLines, StandardCharsets.UTF_8);
			                    McwAPI.message(newFilePath.toFile());
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
	
	}

	@Override
	public void createModelItem(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath());
		
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
	                            //.map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+MAT_WOOD.get(0) + (isStemWood ? "_stem" : "_log")))
	                           // .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+MAT_WOOD.get(0)))
	                            .map(line -> line.replace(MOD_ID, CompatModid))
	                            .map(line -> line.replace("acacia", i))
	                            .collect(Collectors.toList());

	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath(), newFileName);

	                    // �crire le contenu modifi� dans un nouveau fichier
	                    Files.write(newFilePath, modifiedLines, StandardCharsets.UTF_8);
	                    McwAPI.message(newFilePath.toFile());
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
