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

			                    // Créer le contexte de remplacement
			                    ReplacementContext ctx = new ReplacementContext(Modid, TextureLocationFormodid, i, i)
			                            .withLogVariants(
			                                i + (isStemWood ? "_stem" : "_log"),
			                                "stripped_" + i + (isStemWood ? "_stem" : "_log"),
			                                null
			                            )
			                            .withStemWood(isStemWood);

			                    // Appliquer tous les remplacements en une seule passe
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> applyTextureReplacements(line, ctx))
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

			                    // Créer le contexte de remplacement
			                    ReplacementContext ctx = new ReplacementContext(Modid, TextureLocationFormodid, MAT_WOOD.get(a), PREFIX_WOOD.get(a))
			                            .withLogVariants(
			                                log,
			                                bbb,
			                                MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log") + "_top"
			                            )
			                            .withStemWood(isStemWood);

			                    // Appliquer tous les remplacements en une seule passe
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> applyTextureReplacements(line, ctx))
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

			                    // Créer le contexte de remplacement
			                    ReplacementContext ctx = new ReplacementContext(Modid, TextureLocationFormodid, i, i)
			                            .withLogVariants(
			                                nameOfTexturesLogs,
			                                nameOfTexturesStripped,
			                                null
			                            );

			                    // Appliquer tous les remplacements en une seule passe
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> applyTextureReplacements(line, ctx))
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
			                    
			                    // Créer le contexte de remplacement avec mode BYG activé
			                    ReplacementContext ctx = new ReplacementContext(Modid, TextureLocationFormodid, i, i)
			                            .withLogVariants(
			                                i + "/" + nameOfTexturesLogs,
			                                i + "/" + nameOfTexturesStripped,
			                                null
			                            )
			                            .withBYGMode(true);

			                    // Appliquer tous les remplacements en une seule passe
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> applyTextureReplacements(line, ctx))
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

			                    // Créer le contexte de remplacement
			                    ReplacementContext ctx = new ReplacementContext(Modid, TextureLocationFormodid, i, i)
			                            .withLogVariants(
			                                i + (isStemWood ? "_stem" : "_log"),
			                                "stripped_" + i + (isStemWood ? "_stem" : "_log"),
			                                null
			                            )
			                            .withStemWood(isStemWood);

			                    // Appliquer tous les remplacements en une seule passe
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> applyTextureReplacements(line, ctx))
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

			                    // Créer le contexte de remplacement
			                    ReplacementContext ctx = new ReplacementContext(Modid, TextureLocationFormodid, MAT_WOOD.get(a), PREFIX_WOOD.get(a))
			                            .withLogVariants(
			                                MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log"),
			                                "stripped_" + MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log"),
			                                null
			                            )
			                            .withStemWood(isStemWood);

			                    // Appliquer tous les remplacements en une seule passe
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> applyTextureReplacements(line, ctx))
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

			                    // Créer le contexte de remplacement avec custom leaves
			                    ReplacementContext ctx = new ReplacementContext(Modid, TextureLocationFormodid, i, i)
			                            .withLogVariants(
			                                i + (isStemWood ? "_stem" : "_log"),
			                                "stripped_" + i + (isStemWood ? "_stem" : "_log"),
			                                null
			                            )
			                            .withStemWood(isStemWood)
			                            .withCustomLeaves(customTextureLeaves);

			                    // Appliquer tous les remplacements en une seule passe
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> applyTextureReplacements(line, ctx))
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

			                    // Créer le contexte de remplacement avec mode BYG et custom leaves
			                    ReplacementContext ctx = new ReplacementContext(Modid, TextureLocationFormodid, i, i)
			                            .withLogVariants(
			                                i + "/" + nameOfTexturesLogs,
			                                i + "/" + nameOfTexturesStripped,
			                                null
			                            )
			                            .withBYGMode(true)
			                            .withCustomLeaves(i + "/" + nameOfTexturesLeaves);

			                    // Appliquer tous les remplacements en une seule passe
			                    List<String> modifiedLines = lines.stream()
			                            .map(line -> applyTextureReplacements(line, ctx))
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

	/**
	 * Classe interne pour encapsuler tous les paramètres de remplacement de textures
	 */
	private static class ReplacementContext {
		String modid;
		String textureLocation;
		String material;
		String prefix;
		String strippedLog;
		String log;
		String logTop;
		String customLeaves; // Chemin personnalisé pour les leaves (optionnel)
		boolean isStemWood;
		boolean isBYGMode; // Si true, ajoute le préfixe dans les chemins (ex: textureLocation/prefix/planks)

		public ReplacementContext(String modid, String textureLocation, String material, String prefix) {
			this.modid = modid;
			this.textureLocation = textureLocation;
			this.material = material;
			this.prefix = prefix;
			this.isBYGMode = false;
			this.customLeaves = null;
		}

		public ReplacementContext withLogVariants(String log, String strippedLog, String logTop) {
			this.log = log;
			this.strippedLog = strippedLog;
			this.logTop = logTop;
			return this;
		}

		public ReplacementContext withStemWood(boolean isStemWood) {
			this.isStemWood = isStemWood;
			return this;
		}

		public ReplacementContext withBYGMode(boolean isBYGMode) {
			this.isBYGMode = isBYGMode;
			return this;
		}

		public ReplacementContext withCustomLeaves(String customLeaves) {
			this.customLeaves = customLeaves;
			return this;
		}
	}

	/**
	 * Méthode utilitaire pour appliquer tous les remplacements de textures en une seule passe
	 * @param line La ligne à traiter
	 * @param ctx Le contexte contenant tous les paramètres de remplacement
	 * @return La ligne avec tous les remplacements appliqués
	 */
	private String applyTextureReplacements(String line, ReplacementContext ctx) {
		// Remplacements de handles (furnitures)
		line = line.replace("mcwfurnitures:block/str_acacia_handle", "mcwfurnitures:block/oak_handle");
		line = line.replace("mcwfurnitures:block/acacia_handle", "mcwfurnitures:block/oak_handle");

		// Remplacements de shutters (windows)
		line = line.replace("mcwwindows:block/acacia_louvered_shutter", ctx.modid + ":block/" + ctx.prefix + "_louvered_shutter");
		line = line.replace("mcwwindows:block/acacia_shutter", ctx.modid + ":block/" + ctx.prefix + "_shutter");

		// Remplacements de logs et planks
		if (ctx.strippedLog != null) {
			line = line.replace("minecraft:block/stripped_acacia_log", ctx.textureLocation + "/" + ctx.strippedLog);
		}
		if (ctx.logTop != null) {
			line = line.replace("minecraft:block/acacia_log_top", ctx.textureLocation + "/" + ctx.logTop);
		}
		if (ctx.log != null) {
			line = line.replace("minecraft:block/acacia_log", ctx.textureLocation + "/" + ctx.log);
		}

		// Gestion spéciale pour BYG (ajoute le préfixe dans le chemin)
		String planksPath = ctx.isBYGMode
			? ctx.textureLocation + "/" + ctx.prefix + "/" + ctx.material + "_planks"
			: ctx.textureLocation + "/" + ctx.material + "_planks";
		line = line.replace("minecraft:block/acacia_planks", planksPath);

		// Remplacements de leaves
		String leavesPath;
		if (ctx.customLeaves != null) {
			leavesPath = ctx.textureLocation + "/" + ctx.customLeaves;
		} else if (ctx.isBYGMode) {
			leavesPath = ctx.textureLocation + "/" + ctx.prefix + "/leaves";
		} else {
			leavesPath = ctx.textureLocation + "/" + ctx.material + "_leaves";
		}
		line = line.replace("mcwfences:block/acacia_leaves", leavesPath);

		// Remplacements de chemins de textures génériques
		line = line.replace("\"texture\": \"mcwtrpdoors:block", "\"texture\": \"" + ctx.modid + ":block");

		// Remplacement du nom de matériau de base
		line = line.replace("acacia", ctx.prefix);

		// Remplacements de chemins de textures pour paths
		line = line.replace("\"particle\": \"mcwpaths:block", "\"particle\": \"" + ctx.modid + ":block");
		line = line.replace("\"pavement\": \"mcwpaths:block", "\"pavement\": \"" + ctx.modid + ":block");

		// Remplacements de chemins de textures pour doors
		line = line.replace("\"bottom\": \"mcwdoors:block", "\"bottom\": \"" + ctx.modid + ":block");
		line = line.replace("\"particle\": \"mcwdoors:block", "\"particle\": \"" + ctx.modid + ":block");
		line = line.replace("\"top\": \"mcwdoors:block", "\"top\": \"" + ctx.modid + ":block");
		line = line.replace("\"0\": \"mcwdoors:block", "\"0\": \"" + ctx.modid + ":block");
		line = line.replace("\"2\": \"mcwdoors:block", "\"2\": \"" + ctx.modid + ":block");
		line = line.replace("\"1\": \"mcwdoors:block", "\"1\": \"" + ctx.modid + ":block");

		return line;
	}
}