package fr.samlegamer.api.datagen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
 * Gen Recipes Loot Tables and Advancements
 */
public class McwDataGen implements IModFiles.IData
{
	private static final String s = File.separator;
	private String MOD_ID;
	private String VERSION;

	public McwDataGen(String modidData)
	{
		this.VERSION = "1.20";
		this.MOD_ID = modidData;
	}
	
	public McwDataGen(String modidData, String otherVersion)
	{
		this.VERSION = otherVersion;
		this.MOD_ID = modidData;
	}
	
	@Override
	public void AdvancementsLogAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
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
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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
	public void AdvancementsStoneAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:sandstone", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace("minecraft:sandstone", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":sandstone", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":balustrade_sandstone", CompatModid+":balustrade_"+i))
	                            .map(line -> line.replace("minecraft:sand", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":modern_sandstone", CompatModid+":modern_"+i))
	                            .map(line -> line.replace(MOD_ID+":railing_sandstone", CompatModid+":railing_"+i))
	                            .map(line -> line.replace("\"mcwfences:modern_red_sandstone_wall\",", ""))
	                            .map(line -> line.replace("\"mcwfences:railing_red_sandstone_wall\",", ""))
	                            .map(line -> line.replace("\"mcwfences:red_sandstone_railing_gate\",", ""))
	                            .map(line -> line.replace("\"mcwfences:red_sandstone_pillar_wall\",", ""))
	                            .map(line -> line.replace("\"mcwfences:red_sandstone_grass_topped_wall\",", ""))
	                            .collect(Collectors.toList());
	                    
	                    String newFileName = file.getFileName().toString().replace("sandstone", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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
	public void RecipesLogAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":stripped_"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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
	public void LootTableLogAll(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath());
		
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
	                            //.map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            //.map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"loot_tables"+s+"blocks"+s, newFileName);
	
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
	public void RecipesStoneAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK, List<String> FLOOR)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
		for(int nbm = 0;nbm<MAT_ROCK.size();nbm++)
		{
	        // Filtrer et traiter les fichiers contenant "acacia" dans leur nom
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().startsWith("sandstone") | file.getFileName().toString().startsWith("balustrade_sandstone")
	                    		| file.getFileName().toString().startsWith("railing_sandstone")| file.getFileName().toString().startsWith("modern_sandstone"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
			            final int i = nbm;
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	                    boolean isSandstone = MAT_ROCK.get(i).contains("sandstone");
	                    String smoothSandstone = isSandstone ? "smooth_"+MAT_ROCK.get(i) : FLOOR.get(i);
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:sandstone", ModidOfBaseMod+":"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace(MOD_ID+":sandstone", CompatModid+":"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace(MOD_ID+":balustrade_sandstone", CompatModid+":balustrade_"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace("minecraft:sand", ModidOfBaseMod+":"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace(MOD_ID+":modern_sandstone", CompatModid+":modern_"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace(MOD_ID+":railing_sandstone", CompatModid+":railing_"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace("minecraft:smooth_sandstone", ModidOfBaseMod+":"+smoothSandstone))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("sandstone", MAT_ROCK.get(i));
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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
	public void RecipesStoneAll(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK)
	{
		RecipesStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, new ArrayList<String>());
	}

	@Override
	public void LootTableStoneAll(String LOCATION, String CompatModid, List<String> MAT_ROCK)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath());
		
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
	                            .map(line -> line.replace(MOD_ID+":sandstone", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":balustrade_sandstone", CompatModid+":balustrade_"+i))
	                            .map(line -> line.replace("minecraft:sand", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":modern_sandstone", CompatModid+":modern_"+i))
	                            .map(line -> line.replace(MOD_ID+":railing_sandstone", CompatModid+":railing_"+i))
	                            .collect(Collectors.toList());
	
	                    String newFileName = file.getFileName().toString().replace("sandstone", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"loot_tables"+s+"blocks"+s, newFileName);
	
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

	public void AdvancementsLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
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
	                            
	                            .map(line -> line.replace("]    }     ]     }", "]    }     ]     },{\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }"))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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

	public void AdvancementsStoneAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:sandstone", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace("minecraft:sandstone", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":sandstone", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":balustrade_sandstone", CompatModid+":balustrade_"+i))
	                            .map(line -> line.replace("]    }     ]     }", "]    }     ]     },{\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }"))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("sandstone", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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

	public void RecipesLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String ModidCharged)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":stripped_"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	
	                    String modLoadedCondition = "\"conditions\": [\r\n"
	                    		+ "    {\r\n"
	                    		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                    		+ "      \"modid\": \""+ModidCharged+"\"\r\n"
	                    		+ "    }\r\n"
	                    		+ "  ],";
	                     modifiedLines.add(1, modLoadedCondition);
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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
	 .map(line -> line.replace("\"count\": 1\r\n"+ "    }", "\"count\": 1\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidCharged+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 2\r\n"+ "    }", "\"count\": 2\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidCharged+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 3\r\n"+ "    }", "\"count\": 3\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidCharged+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 4\r\n"+ "    }", "\"count\": 4\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidCharged+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 5\r\n"+ "    }", "\"count\": 5\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidCharged+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 6\r\n"+ "    }", "\"count\": 6\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidCharged+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	 */
	public void RecipesLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":stripped_"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            
	                            .map(line -> line.replace("\"count\": 1\r\n"+ "    }", "\"count\": 1\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 2\r\n"+ "    }", "\"count\": 2\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 3\r\n"+ "    }", "\"count\": 3\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 4\r\n"+ "    }", "\"count\": 4\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 5\r\n"+ "    }", "\"count\": 5\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 6\r\n"+ "    }", "\"count\": 6\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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

	public void RecipesStoneAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:sandstone", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":sandstone", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":balustrade_sandstone", CompatModid+":balustrade_"+i))
	                            .map(line -> line.replace("\"count\": 1\r\n"+ "    }", "\"count\": 1\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 2\r\n"+ "    }", "\"count\": 2\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 3\r\n"+ "    }", "\"count\": 3\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 4\r\n"+ "    }", "\"count\": 4\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 5\r\n"+ "    }", "\"count\": 5\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .map(line -> line.replace("\"count\": 6\r\n"+ "    }", "\"count\": 6\r\n"+ "    },\r\n"
	                            		+ "    \"conditions\": [\r\n"
	                            		+ "    {\r\n"
	                            		+ "      \"type\": \"forge:mod_loaded\",\r\n"
	                            		+ "      \"modid\": \""+ModidOfBaseMod+"\"\r\n"
	                            		+ "    }\r\n"
	                            		+ "  ]"))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("sandstone", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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

	public void AdvancementsLeavesHedges(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> LEAVES)
	{
		for(String i : LEAVES)
		{
			File file = new File(LOCATION + "data"+s+"advancements"+s+"recipes"+s + i +"_hedge.json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "  \"parent\": \"minecraft:recipes/root\",\r\n"
							+ "  \"rewards\": {\r\n"
							+ "    \"recipes\": [\r\n"
							+ "	\""+CompatModid+":"+i+"_hedge\"\r\n"
							+ "    ]\r\n"
							+ "  },\r\n"
							+ "  \"criteria\": {\r\n"
							+ "    \"has_birch\": {\r\n"
							+ "      \"trigger\": \"minecraft:inventory_changed\",\r\n"
							+ "      \"conditions\": {\r\n"
							+ "        \"items\": [\r\n"
							+ "          {\r\n"
							+ "            \"item\": \""+ModidOfBaseMod+":"+i+"_leaves\"\r\n"
							+ "          }\r\n"
							+ "        ]\r\n"
							+ "      }\r\n"
							+ "    }\r\n"
							+ "  },\r\n"
							+ "  \"requirements\": [\r\n"
							+ "    [\r\n"
							+ "      \"has_birch\"\r\n"
							+ "    ]\r\n"
							+ "  ]\r\n"
							+ "}");
					buffer.newLine();
					
					buffer.close();
					writer.close();
					file.createNewFile();
					McwAPI.message(file);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public void RecipesLogAllwithResearch(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String research)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":stripped_"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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
	
	public void LootTableLogAllwithResearch(String LOCATION, String CompatModid, List<String> MAT_WOOD, String research)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath());
		
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
	                            //.map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            //.map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"loot_tables"+s+"blocks"+s, newFileName);
	
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