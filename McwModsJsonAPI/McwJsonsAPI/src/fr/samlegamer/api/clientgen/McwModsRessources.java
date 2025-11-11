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
import fr.samlegamer.registry.Compatibilities;
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
	private String Modid = "defaultmc";
	
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
	

	public void setModid(String Modid) {
		this.Modid = Modid;
	}
	
	public void createWoodBlockstates(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.BLOCKSTATES.getPath());
		
		for(String i : MAT_WOOD)
		{
			// Filtrer et traiter les fichiers contenant "acacia" dans leur nom
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia") && 
	                    !file.getFileName().toString().contains("hedge"))
	                    .collect(Collectors.toList());

	            for (Path file : acaciaFiles) {
	            	try {
	                    // Lire tout le contenu du fichier
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);

	                    // Remplacer "acacia" par "cherry" dans le contenu
	                    List<String> modifiedLines = lines.stream()
	                            //.map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+MAT_WOOD.get(0) + (isStemWood ? "_stem" : "_log")))
	                           // .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+MAT_WOOD.get(0)))
	                    		
	                            .map(line -> line.replace("mcwwindows:block/parent/resizeable/mid_m", "CHANGEDWINDOW_mid_m"))
	                            .map(line -> line.replace(MOD_ID, CompatModid))
	                            .map(line -> line.replace("acacia", i))
	                            .map(line -> line.replace("CHANGEDWINDOW_mid_m", "mcwwindows:block/parent/resizeable/mid_m"))
	                            .collect(Collectors.toList());

	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.BLOCKSTATES.getPath(), newFileName);

	                    // �crire le contenu modifi� dans un nouveau fichier
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
			                    .filter(file -> file.getFileName().toString().contains("acacia") && 
			    	                    !file.getFileName().toString().contains("acacia_wall"))
			                    .collect(Collectors.toList());
		
			            for (Path file : acaciaFiles) {
			            	try {
			                    // Lire tout le contenu du fichier
			                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
			                    // Remplacer "acacia" par "cherry" dans le contenu
			                    List<String> modifiedLines = lines.stream()
                                        .map(line -> line.replace("mcwfurnitures:block/str_acacia_handle", "mcwfurnitures:block/oak_handle"))
                                        .map(line -> line.replace("mcwfurnitures:block/acacia_handle", "mcwfurnitures:block/oak_handle"))
			                            .map(line -> line.replace("mcwwindows:block/acacia_louvered_shutter", Modid+":block/"+i+"_louvered_shutter"))
			                            .map(line -> line.replace("mcwwindows:block/acacia_shutter", Modid+":block/"+i+"_shutter"))
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/stripped_"+i+(isStemWood ? "_stem" : "_log")))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+i+(isStemWood ? "_stem" : "_log")))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"_planks"))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"_planks"))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"_leaves"))
			                            .map(line -> line.replace("\"texture\": \"mcwtrpdoors:block", "\"texture\": \""+Modid+":block"))
			                            .map(line -> line.replace("acacia", i))
			                            .map(line -> line.replace("\"particle\": \"mcwpaths:block", "\"particle\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"pavement\": \"mcwpaths:block", "\"pavement\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"bottom\": \"mcwdoors:block", "\"bottom\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"particle\": \"mcwdoors:block", "\"particle\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"top\": \"mcwdoors:block", "\"top\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"0\": \"mcwdoors:block", "\"0\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"2\": \"mcwdoors:block", "\"2\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"1\": \"mcwdoors:block", "\"1\": \""+Modid+":block"))
			                            .collect(Collectors.toList());
			                    
			                    // D�terminer le nouveau nom de fichier
			                    String newFileName = file.getFileName().toString().replace("acacia", i);
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
			                    // �crire le contenu modifi� dans un nouveau fichier
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
			directories.clear();
		}
	}
	
	public void createWoodModelsBlocksPrefixed(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood)
	{
		createWoodModelsBlocksPrefixed(LOCATION, TextureLocationFormodid, MAT_WOOD, PREFIX_WOOD, isStemWood, "1.16.5");
	}
	
	public void createWoodModelsBlocksPrefixed(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String pwoodVersion)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : this.fold.getPathList())
		{
			directories.add(Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str));
			String versionOfPwood = pwoodVersion;
			
			for(Path directory : directories)
			{
				for(int i = 0; i<MAT_WOOD.size();i++)
				{
					// Filtrer et traiter les fichiers contenant "acacia" dans leur nom 
			        try (Stream<Path> files = Files.list(directory)) {
			            List<Path> acaciaFiles = files
			                    .filter(file -> file.getFileName().toString().contains("acacia") && 
			    	                    !file.getFileName().toString().contains("acacia_wall"))
			                    .collect(Collectors.toList());
		
			            for (Path file : acaciaFiles) {
			            	try {
					            final int a = i;
					            boolean isBlueSkiesPrefix = PREFIX_WOOD.get(a).contains("bsky_");
					            boolean isPremiumWoodPrefix = PREFIX_WOOD.get(a).contains("pwood_");
					            
					            final String aaa;
					            final String bbb;
					            String strip = isBlueSkiesPrefix ? "stripped_"+MAT_WOOD.get(a)+"_log_side" : "stripped_"+MAT_WOOD.get(a)+(isStemWood ? "_stem" : "_log");

					            switch(versionOfPwood)
					            {
					            	case "1.20.1":
						            	aaa = MAT_WOOD.get(a)+"_log_side";
						            	bbb = "stripped_"+MAT_WOOD.get(a)+"_log_side";
					            		break;
									case "1.21.3":
										aaa = MAT_WOOD.get(a)+"_log_side";
										bbb = "stripped_"+MAT_WOOD.get(a)+"_log_side";
										break;
					            	case "1.21.4":
						            	aaa = MAT_WOOD.get(a)+"_log";
						            	bbb = "stripped_"+MAT_WOOD.get(a)+"_log";
					            		break;
					            	default:
						            	aaa = MAT_WOOD.get(a)+(isStemWood ? "_stem" : "_log");
						            	bbb = (isPremiumWoodPrefix ? MAT_WOOD.get(a)+"_stripped_log" : strip);
					            		break;
					            }
					            					            
					            String log = isBlueSkiesPrefix ? MAT_WOOD.get(a)+"_log_side" : aaa;
					            
			                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
			                    List<String> modifiedLines = lines.stream()
                                        .map(line -> line.replace("mcwfurnitures:block/str_acacia_handle", "mcwfurnitures:block/oak_handle"))
                                        .map(line -> line.replace("mcwfurnitures:block/acacia_handle", "mcwfurnitures:block/oak_handle"))
                                        .map(line -> line.replace("mcwwindows:block/acacia_louvered_shutter", Modid+":block/"+PREFIX_WOOD.get(a)+"_louvered_shutter"))
			                            .map(line -> line.replace("mcwwindows:block/acacia_shutter", Modid+":block/"+PREFIX_WOOD.get(a)+"_shutter"))
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/"+bbb))
			                            .map(line -> line.replace("minecraft:block/acacia_log_top", TextureLocationFormodid+"/"+MAT_WOOD.get(a)+(isStemWood ? "_stem" : "_log")+"_top"))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+log))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+MAT_WOOD.get(a)+"_planks"))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+MAT_WOOD.get(a)+"_planks"))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+MAT_WOOD.get(a)+"_leaves"))
			                            .map(line -> line.replace("\"texture\": \"mcwtrpdoors:block", "\"texture\": \""+Modid+":block"))
			                            .map(line -> line.replace("acacia", PREFIX_WOOD.get(a)))
			                            .map(line -> line.replace("\"particle\": \"mcwpaths:block", "\"particle\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"pavement\": \"mcwpaths:block", "\"pavement\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"bottom\": \"mcwdoors:block", "\"bottom\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"particle\": \"mcwdoors:block", "\"particle\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"top\": \"mcwdoors:block", "\"top\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"0\": \"mcwdoors:block", "\"0\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"2\": \"mcwdoors:block", "\"2\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"1\": \"mcwdoors:block", "\"1\": \""+Modid+":block"))
			                            .collect(Collectors.toList());
			                    
			                    // D�terminer le nouveau nom de fichier
			                    String newFileName = file.getFileName().toString().replace("acacia", PREFIX_WOOD.get(a));
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
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
			        try (Stream<Path> files = Files.list(directory)) {
			            List<Path> acaciaFiles = files
			                    .filter(file -> file.getFileName().toString().contains("acacia") && 
			    	                    !file.getFileName().toString().contains("acacia_wall"))
			                    .collect(Collectors.toList());
		
			            for (Path file : acaciaFiles) {
			            	try {
			                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);

			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> line.replace("mcwwindows:block/acacia_louvered_shutter", Modid+":block/"+i+"_louvered_shutter"))
			                            .map(line -> line.replace("mcwwindows:block/acacia_shutter", Modid+":block/"+i+"_shutter"))
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/"+nameOfTexturesStripped))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+nameOfTexturesLogs))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+nameOfTexturesPlanks))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+nameOfTexturesPlanks))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"_leaves"))
			                            .map(line -> line.replace("\"texture\": \"mcwtrpdoors:block", "\"texture\": \""+Modid+":block"))
			                            .map(line -> line.replace("acacia", i))
			                            .map(line -> line.replace("\"particle\": \"mcwpaths:block", "\"particle\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"pavement\": \"mcwpaths:block", "\"pavement\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"bottom\": \"mcwdoors:block", "\"bottom\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"particle\": \"mcwdoors:block", "\"particle\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"top\": \"mcwdoors:block", "\"top\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"0\": \"mcwdoors:block", "\"0\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"2\": \"mcwdoors:block", "\"2\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"1\": \"mcwdoors:block", "\"1\": \""+Modid+":block"))
			                            /*.map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/"+nameOfTexturesStripped))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+nameOfTexturesLogs))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+nameOfTexturesPlanks))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"_leaves"))		                            
			                            .map(line -> line.replace("mcwtrpdoors", Modid))
			                            .map(line -> line.replace("mcwdoors", Modid))*/
			                            .collect(Collectors.toList());
		
			                    String newFileName = file.getFileName().toString().replace("acacia", i);
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
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
			        try (Stream<Path> files = Files.list(directory)) {
			            List<Path> acaciaFiles = files
			                    .filter(file -> file.getFileName().toString().contains("acacia") && 
			    	                    !file.getFileName().toString().contains("acacia_wall"))
			                    .collect(Collectors.toList());
		
			            for (Path file : acaciaFiles) {
			            	try {
			                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
			                    
			                    List<String> modifiedLines = lines.stream()
                                        .map(line -> line.replace("mcwfurnitures:block/str_acacia_handle", "mcwfurnitures:block/oak_handle"))
                                        .map(line -> line.replace("mcwfurnitures:block/acacia_handle", "mcwfurnitures:block/oak_handle"))
                                        .map(line -> line.replace("mcwwindows:block/acacia_louvered_shutter", Modid+":block/"+i+"_louvered_shutter"))
			                    		.map(line -> line.replace("mcwwindows:block/acacia_shutter", Modid+":block/"+i+"_shutter"))
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesStripped))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesLogs))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"/"+nameOfTexturesPlanks))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+i+"/leaves"))
			                            .map(line -> line.replace("\"texture\": \"mcwtrpdoors:block", "\"texture\": \""+Modid+":block"))
			                            .map(line -> line.replace("acacia", i))
			                            .map(line -> line.replace("\"particle\": \"mcwpaths:block", "\"particle\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"pavement\": \"mcwpaths:block", "\"pavement\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"bottom\": \"mcwdoors:block", "\"bottom\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"particle\": \"mcwdoors:block", "\"particle\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"top\": \"mcwdoors:block", "\"top\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"0\": \"mcwdoors:block", "\"0\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"2\": \"mcwdoors:block", "\"2\": \""+Modid+":block"))
			                            .map(line -> line.replace("\"1\": \"mcwdoors:block", "\"1\": \""+Modid+":block"))
			                            //.map(line -> line.replace("mcwtrpdoors", Modid))
			                            //.map(line -> line.replace("mcwdoors", Modid))
			                            .collect(Collectors.toList());
		
			                    String newFileName = file.getFileName().toString().replace("acacia", i);
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
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
	                    .filter(file -> file.getFileName().toString().contains("acacia") && 
	    	                    !file.getFileName().toString().contains("hedge")
	                    && !file.getFileName().toString().contains("print"))
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
					            String top1 = isSandStoneCustom ? FLOOR.get(a) : FLOOR.get(a);
					            String walltext = MOD_ID.equals(Compatibilities.MCW_FENCES_MODID) ? FLOOR.get(a) : WALL.get(a);
			                    // Lire tout le contenu du fichier
			                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
			                    // Remplacer "acacia" par "cherry" dans le contenu
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> line.replace("minecraft:block/sandstone_top", TextureLocationFormodid+"/"+top))
			                            .map(line -> line.replace("minecraft:block/sandstone", TextureLocationFormodid+"/"+walltext))
			                            .map(line -> line.replace("minecraft:block/sand", TextureLocationFormodid+"/"+top1))
			                            .collect(Collectors.toList());
			                    String newFileName = file.getFileName().toString().replace("sandstone", MAT_ROCK.get(a));
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
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
			directories.clear();
		}
	}

	public void createWoodModelsBlockswithResearchPrefixed(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String research)
	{
		List<Path> directories = new ArrayList<Path>();
		
		for(String str : this.fold.getPathList())
		{
			directories.add(Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str));
			
			for(Path directory : directories)
			{
				for(int i = 0; i<MAT_WOOD.size();i++)
				{
			        try (Stream<Path> files = Files.list(directory)) {
			            List<Path> acaciaFiles = files
			                    .filter(file -> file.getFileName().toString().contains(research))
			                    .collect(Collectors.toList());
		
			            for (Path file : acaciaFiles) {
			            	try {
					            final int a = i;

			                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/stripped_"+MAT_WOOD.get(a)+(isStemWood ? "_stem" : "_log")))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+MAT_WOOD.get(a)+(isStemWood ? "_stem" : "_log")))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+MAT_WOOD.get(a)+"_planks"))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+MAT_WOOD.get(a)+"_planks"))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+MAT_WOOD.get(a)+"_leaves"))
			                            .collect(Collectors.toList());
		
			                    String newFileName = file.getFileName().toString().replace("acacia", PREFIX_WOOD.get(a));
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
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
			directories.clear();
		}
	}
	
	public void createWoodModelsBlockswithResearchCustom(String LOCATION, String TextureLocationFormodid, List<String> MAT_WOOD, boolean isStemWood, String research, String customTextureLeaves)
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
			                            .map(line -> line.replace("minecraft:block/stripped_acacia_log", TextureLocationFormodid+"/stripped_"+i+(isStemWood ? "_stem" : "_log")))
			                            .map(line -> line.replace("minecraft:block/acacia_log", TextureLocationFormodid+"/"+i+(isStemWood ? "_stem" : "_log")))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"_planks"))
			                            .map(line -> line.replace("minecraft:block/acacia_planks", TextureLocationFormodid+"/"+i+"_planks"))
			                            .map(line -> line.replace("mcwfences:block/acacia_leaves", TextureLocationFormodid+"/"+customTextureLeaves))
			                            .collect(Collectors.toList());
		
			                    String newFileName = file.getFileName().toString().replace("acacia", i);
			                    Path newFilePath = Paths.get(McwMain.LOCATION+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+str, newFileName);
		
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