package fr.samlegamer.api.clientgen;

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

/*
 * Derived to McwBridges
 * For future update use this class
 * version 2.0.0
 */
public class McwModsRessources implements IModFiles.IClient
{
	private static final String s = File.separator;
	private String MOD_ID;
	private String VERSION;
	private McwAPI.ClientFolderTypes fold;
	
	public McwModsRessources(String modidData, McwAPI.ClientFolderTypes f)
	{
		this.VERSION = "1.20";
		this.MOD_ID = modidData;
		this.fold=f;
	}
	
	public McwModsRessources(String modidData, McwAPI.ClientFolderTypes f, String otherVersion)
	{
		this.VERSION = otherVersion;
		this.MOD_ID = modidData;
		this.fold=f;
	}
	
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
	
	public void createWoodModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, boolean isStemWood)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : this.fold.getPathList())
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
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"_planks"))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"_leaves"))
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
			directories.clear();
		}
	}
	
	public void createWoodCustomModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : this.fold.getPathList())
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
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/"+nameOfTexturesStripped))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+nameOfTexturesLogs))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+nameOfTexturesPlanks))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"_leaves"))
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
			directories.clear();
		}
	}

	public void createWoodCustomModelsBlocksBYGSetting(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : this.fold.getPathList())
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
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"/leaves"))
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
			directories.clear();
		}
	}
	
	public void createWoodModelItem(String LOCATION, String CompatModid, List<String> MAT_WOOD)
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

	public void createStoneBlockstates(String LOCATION, String CompatModid, List<String> MAT_ROCK)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.BLOCKSTATES.getPath());
		
		for(String i : MAT_ROCK)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().startsWith("sandstone") | file.getFileName().toString().startsWith("balustrade_sandstone")
	                    		| file.getFileName().toString().startsWith("railing_sandstone")| file.getFileName().toString().startsWith("modern_sandstone"))
	                    .collect(Collectors.toList());

	            for (Path file : acaciaFiles) {
	            	try {
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);

	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace(MOD_ID, CompatModid))
	                            .map(line -> line.replace("sandstone", i))
	                            .collect(Collectors.toList());

	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("sandstone", i);
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
	
	public void createStoneModelsBlocks(String LOCATION, String TextureLocationFormodid, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : this.fold.getPathList())
		{
			directories.add(Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str));
			
			for(Path directory : directories)
			{
				for(int nbm = 0;nbm<MAT_ROCK.size();nbm++)
				{
			        try (Stream<Path> files = Files.list(directory)) {
			            List<Path> acaciaFiles = files
			                    .filter(file -> file.getFileName().toString().startsWith("sandstone") | file.getFileName().toString().startsWith("balustrade_sandstone")
			                    		| file.getFileName().toString().startsWith("railing_sandstone")| file.getFileName().toString().startsWith("modern_sandstone"))
			                    .collect(Collectors.toList());
			            for (Path file : acaciaFiles) {
			            	try {
					            final int a = nbm;
					            boolean isSandStoneCustom = WALL.get(a).contains("sandstone");
					            String top = isSandStoneCustom ? WALL.get(a)+"_top" : WALL.get(a);
			                    // Lire tout le contenu du fichier
			                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
			                    // Remplacer "acacia" par "cherry" dans le contenu
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> line.replace("minecraft:block/sandstone_top", TextureLocationFormodid+"/"+top))
			                            .map(line -> line.replace("minecraft:block/sandstone", TextureLocationFormodid+"/"+WALL.get(a)))
			                            .map(line -> line.replace("minecraft:block/sand", TextureLocationFormodid+"/"+FLOOR.get(a)))
			                            .collect(Collectors.toList());
			                    String newFileName = file.getFileName().toString().replace("sandstone", MAT_ROCK.get(a));
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
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
			directories.clear();
		}
	}

	public void createStoneModelItem(String LOCATION, String CompatModid, List<String> MAT_ROCK)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath());
		
		for(String i : MAT_ROCK)
		{
			// Filtrer et traiter les fichiers contenant "acacia" dans leur nom
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().startsWith("sandstone") | file.getFileName().toString().startsWith("balustrade_sandstone")
	                    		| file.getFileName().toString().startsWith("railing_sandstone")| file.getFileName().toString().startsWith("modern_sandstone"))
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
	                            .map(line -> line.replace("sandstone", i))
	                            .collect(Collectors.toList());

	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("sandstone", i);
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

	/*
	 * Used For BWG (white sakura leave / yellow sakura leave)
	 * Warning research only a valid file
	 * example:acacia_hedge (acacia file is required)
	 */
	public void createWoodBlockstateswithResearch(String LOCATION, String CompatModid, List<String> MAT_WOOD, String research)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.BLOCKSTATES.getPath());
		
		for(String i : MAT_WOOD)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains(research))
	                    .collect(Collectors.toList());

	            for (Path file : acaciaFiles) {
	            	try {
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);

	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace(MOD_ID, CompatModid))
	                            .map(line -> line.replace("acacia", i))
	                            .collect(Collectors.toList());

	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.BLOCKSTATES.getPath(), newFileName);

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
	
	public void createWoodModelsBlockswithResearch(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, boolean isStemWood, String research)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : this.fold.getPathList())
		{
			directories.add(Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str));
			
			for(Path directory : directories)
			{
				for(String i : MAT_WOOD)
				{
					// Filtrer et traiter les fichiers contenant "acacia" dans leur nom
			        try (Stream<Path> files = Files.list(directory)) {
			            List<Path> acaciaFiles = files
			                    .filter(file -> file.getFileName().toString().contains(research))
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
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"_planks"))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"_leaves"))
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
			directories.clear();
		}
	}


	public void createWoodCustomModelsBlocksBYGSettingwithResearch(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped, String nameOfTexturesLeaves, String research)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : this.fold.getPathList())
		{
			directories.add(Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str));
			
			for(Path directory : directories)
			{
				for(String i : MAT_WOOD)
				{
			        try (Stream<Path> files = Files.list(directory)) {
			            List<Path> acaciaFiles = files
			                    .filter(file -> file.getFileName().toString().contains(research))
			                    .collect(Collectors.toList());
		
			            for (Path file : acaciaFiles) {
			            	try {
			                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesStripped))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesLogs))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesPlanks))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesLeaves))
			                            .collect(Collectors.toList());
		
			                    String newFileName = file.getFileName().toString().replace("acacia", i);
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
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
			directories.clear();
		}
	}
	
	public void createWoodModelItemwithResearch(String LOCATION, String CompatModid, List<String> MAT_WOOD, String research)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath());
		
		for(String i : MAT_WOOD)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains(research))
	                    .collect(Collectors.toList());
	            for (Path file : acaciaFiles) {
	            	try {
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);

	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace(MOD_ID, CompatModid))
	                            .map(line -> line.replace("acacia", i))
	                            .collect(Collectors.toList());
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath(), newFileName);
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