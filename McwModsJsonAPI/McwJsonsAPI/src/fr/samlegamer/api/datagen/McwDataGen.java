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
	
	private void setIfModLoaded(ModLoaders modLoader, String ModidCharged1, String ModidCharged2, List<String> modifiedLines, boolean isAdvancement)
	{
		String modLoadedCondition = "";
		
		switch(modLoader)
        {
        	case FORGE:
        		if(this.VERSION.equals("1.21.3") || this.VERSION.equals("1.21.4") || this.VERSION.equals("1.21.5") || this.VERSION.equals("1.21.10"))
        		{
                    if(isAdvancement)
                    {
                    	 modLoadedCondition = "\"forge:conditional\": [\r\n"
                    	 		+ "    {\r\n"
                    	 		+ "      \"forge:condition\": {\r\n"
                    	 		+ "        \"type\": \"forge:and\",\r\n"
                    	 		+ "        \"values\": [\r\n"
                    	 		+ "          {\r\n"
                    	 		+ "            \"type\": \"forge:mod_loaded\",\r\n"
                    	 		+ "            \"modid\": \""+ModidCharged1+"\"\r\n"
                    	 		+ "          },\r\n"
                    	 		+ "          {\r\n"
                    	 		+ "            \"type\": \"forge:mod_loaded\",\r\n"
                    	 		+ "            \"modid\": \""+ModidCharged2+"\"\r\n"
                    	 		+ "          }\r\n"
                    	 		+ "        ]\r\n"
                    	 		+ "      },";
                         modifiedLines.add(1, modLoadedCondition);
                         modifiedLines.add("\n]\r\n"
                         		+ "}"); 
                    }
                    else
                    {
                    	 modLoadedCondition = "\"forge:conditional\": [\r\n"
                    	 		+ "    {\r\n"
                    	 		+ "      \"forge:condition\": {\r\n"
                    	 		+ "        \"type\": \"forge:and\",\r\n"
                    	 		+ "        \"values\": [\r\n"
                    	 		+ "          {\r\n"
                    	 		+ "            \"type\": \"forge:mod_loaded\",\r\n"
                    	 		+ "            \"modid\": \""+ModidCharged1+"\"\r\n"
                    	 		+ "          },\r\n"
                    	 		+ "          {\r\n"
                    	 		+ "            \"type\": \"forge:mod_loaded\",\r\n"
                    	 		+ "            \"modid\": \""+ModidCharged2+"\"\r\n"
                    	 		+ "          }\r\n"
                    	 		+ "        ]\r\n"
                    	 		+ "      },";
                         modifiedLines.add(1, modLoadedCondition);
                         modifiedLines.add("  ]\r\n"
                         		+ "}"); 
                    }
        		}
        		else
        		{
                    modLoadedCondition = "\"conditions\": [\r\n"
                    		+ "    {\r\n"
                    		+ "      \"type\": \"forge:mod_loaded\",\r\n"
                    		+ "      \"modid\": \""+ModidCharged1+"\"\r\n"
                    		+ "    },\r\n"
                    		+ "    {\r\n"
                    		+ "      \"type\": \"forge:mod_loaded\",\r\n"
                    		+ "      \"modid\": \""+ModidCharged2+"\"\r\n"
                    		+ "    }\r\n"
                    		+ "  ],";
                    	modifiedLines.add(1, modLoadedCondition);
        		}
        		break;
        		
        	case FABRIC:
                	modLoadedCondition = " \"fabric:load_conditions\": [\r\n"
                		+ "    {\r\n"
                		+ "      \"condition\": \"fabric:all_mods_loaded\",\r\n"
                		+ "      \"values\": [\r\n"
                		+ "        \""+ModidCharged1+"\",\r\n" 
                		+ "        \""+ModidCharged2+"\"\r\n" 
                		+ "      ]\r\n"
                		+ "    }\r\n"
                		+ "  ],";

                		modifiedLines.add(1, modLoadedCondition);
        		break;

        	case NEOFORGE:
        			modLoadedCondition = "\"neoforge:conditions\": [\r\n"
        					+ "    {\r\n"
        					+ "      \"type\": \"neoforge:mod_loaded\",\r\n"
        					+ "      \"modid\": \""+ModidCharged1+"\"\r\n"
        					+ "    },\r\n"
        					+ "    {\r\n"
        					+ "      \"type\": \"neoforge:mod_loaded\",\r\n"
        					+ "      \"modid\": \""+ModidCharged2+"\"\r\n"
        					+ "    }\r\n"
        					+ "  ],";
                		modifiedLines.add(1, modLoadedCondition);
        		break;
        }
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
	                    .filter(file -> file.getFileName().toString().contains("acacia")&& 
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
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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
	
	@Deprecated
	public void AdvancementsLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2)
	{
		AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStemWood, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}
	
	public void AdvancementsLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2, ModLoaders modLoader)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
		for(String i : MAT_WOOD)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia")&& 
	    	                    !file.getFileName().toString().contains("hedge"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	
	                    setIfModLoaded(modLoader, ModidCharged1, ModidCharged2, modifiedLines, true);
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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
	
	@Deprecated
	public void AdvancementsLogAllPrefixedIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2)
	{
		AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, isStemWood, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}
	
	public void AdvancementsLogAllPrefixedIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2, ModLoaders modLoaders)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
		for(int i = 0; i<MAT_WOOD.size();i++)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia")&& 
	    	                    !file.getFileName().toString().contains("hedge"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
			            final int a = i;
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+MAT_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+PREFIX_WOOD.get(a)))
	                            .collect(Collectors.toList());
	
	                    setIfModLoaded(modLoaders, ModidCharged1, ModidCharged2, modifiedLines, true);
	                    String newFileName = file.getFileName().toString().replace("acacia", PREFIX_WOOD.get(a));
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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
	
	@Deprecated
	public void AdvancementsLogAllPrefixed(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
		for(int i = 0; i<MAT_WOOD.size();i++)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia")&& 
	    	                    !file.getFileName().toString().contains("hedge"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
			            final int a = i;
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+MAT_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+PREFIX_WOOD.get(a)))
	                            .collect(Collectors.toList());
	
	                    String newFileName = file.getFileName().toString().replace("acacia", PREFIX_WOOD.get(a));
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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
	
	@Deprecated
	public void AdvancementsLogAllCustom(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped)
	{
		AdvancementsLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped, "", "", ModLoaders.FORGE);
	}
	
	public void AdvancementsLogAllCustomIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped, String ModidCharged1, String ModidCharged2, ModLoaders modLoaders)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath());
		
		for(String i : MAT_WOOD)
		{
	        // Filtrer et traiter les fichiers contenant "acacia" dans leur nom
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia")&& 
	    	                    !file.getFileName().toString().contains("hedge"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
	                    // Lire tout le contenu du fichier
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	
	                    // Remplacer "acacia" par "cherry" dans le contenu
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:acacia_planks", ModidOfBaseMod+":"+ nameOfTexturesPlanks))
	                            .map(line -> line.replace("minecraft:stripped_acacia", CompatModid+":"+nameOfTexturesStripped))

	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":" + nameOfTexturesLogs))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	
	                    setIfModLoaded(modLoaders, ModidCharged1, ModidCharged2, modifiedLines, true);
	                    
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .collect(Collectors.toList());
	
	                    // D�terminer le nouveau nom de fichier
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"loot_tables"+s+"blocks"+s, newFileName);
	
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

	@Deprecated
	public void AdvancementsLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood)
	{
		AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStemWood, "minecraft", ModidOfBaseMod, ModLoaders.FORGE);
	}

	@Deprecated
	public void AdvancementsStoneAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK)
	{
		AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, "minecraft", ModidOfBaseMod, ModLoaders.FORGE);
	}
	
	public void AdvancementsStoneAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK, String ModidCharged1, String ModidCharged2, ModLoaders modLoader)
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
	                            .collect(Collectors.toList());
	
	                    setIfModLoaded(modLoader, ModidCharged1, ModidCharged2, modifiedLines, true);
	                    String newFileName = file.getFileName().toString().replace("sandstone", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"advancements"+s+"recipes"+s, newFileName);
	
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
	
	@Deprecated
	public void RecipesLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String ModidCharged)
	{
		RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStemWood, ModidCharged, ModidCharged, ModLoaders.FORGE);
	}

	public void RecipesLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2, ModLoaders modLoader)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":stripped_"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	                    //mcwdoors:acacia
	                    setIfModLoaded(modLoader, ModidCharged1, ModidCharged2, modifiedLines, false);

	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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

	@Deprecated
	public void RecipesLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2)
	{
		RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStemWood, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}
	
	@Deprecated
	public void RecipesLogAllIsChargedPrefixed(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2)
	{
		RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, isStemWood, ModidCharged1, ModidCharged2, false);
	}
	
	@Deprecated
	public void RecipesLogAllIsChargedPrefixed(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2, boolean pWood1201)
	{
		RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, isStemWood, ModidCharged1, ModidCharged2, pWood1201, ModLoaders.FORGE);
	}
	
	public void RecipesLogAllPrefixedIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String ModidCharged1, String ModidCharged2, boolean pWood1201, ModLoaders modLoaders)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
		for(int i = 0; i<MAT_WOOD.size();i++)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia") && 
	                    !file.getFileName().toString().contains("hedge"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
			            final int a = i;
			            boolean isPremiumWoodPrefix = PREFIX_WOOD.get(a).contains("pwood_");
			            final String strip;
			            
			            if(pWood1201)
			            {
			            	strip = "stripped_"+MAT_WOOD.get(a)+"_log";
			            }
			            else
			            {
			            	strip = isPremiumWoodPrefix ? MAT_WOOD.get(a) + "_stripped_log" : "stripped_"+MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log");
			            }
			            
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+MAT_WOOD.get(a)))
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":"+strip))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+PREFIX_WOOD.get(a)))
	                            .collect(Collectors.toList());
	
	                    setIfModLoaded(modLoaders, ModidCharged1, ModidCharged2, modifiedLines, false);
	                    String newFileName = file.getFileName().toString().replace("acacia", PREFIX_WOOD.get(a));
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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
	
	@Deprecated
	public void RecipesLogAllIsChargedCustom(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped, String planksStuff, String ModidCharged1, String ModidCharged2)
	{
		RecipesLogAllCustomIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, nameOfTexturesPlanks, nameOfTexturesLogs, nameOfTexturesStripped, planksStuff, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}
	
	public void RecipesLogAllCustomIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesStripped, String planksStuff, String ModidCharged1, String ModidCharged2, ModLoaders modLoaders)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
		for(String i : MAT_WOOD)
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains("acacia") && 
	                    !file.getFileName().toString().contains("hedge"))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:acacia_slab", ModidOfBaseMod+":"+planksStuff+"_slab"))
	                            .map(line -> line.replace("minecraft:acacia_fence", ModidOfBaseMod+":"+planksStuff+"_fence"))
	                            .map(line -> line.replace("minecraft:acacia_planks", ModidOfBaseMod+":"+nameOfTexturesPlanks))
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+nameOfTexturesLogs))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":"+nameOfTexturesStripped))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	
	                    setIfModLoaded(modLoaders, ModidCharged1, ModidCharged2, modifiedLines, false);
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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

	@Deprecated
	public void RecipesLogAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood)
	{
		RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStemWood, "minecraft", ModidOfBaseMod, ModLoaders.FORGE);
	}

	@Deprecated
	public void RecipesStoneAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK, List<String> FLOOR, String ModidCharged1, String ModidCharged2)
	{
		RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}
	
	public void RecipesStoneAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK, List<String> FLOOR, String ModidCharged1, String ModidCharged2, ModLoaders modLoaders)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
		for(int nbm = 0;nbm<MAT_ROCK.size();nbm++)
		{
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
	                    
	                    boolean containsBricks = MAT_ROCK.get(i).contains("_bricks");
	                    String nameNoBricks = containsBricks ? MAT_ROCK.get(i).replace("_bricks", "") : "";
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:sandstone", ModidOfBaseMod+":"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace(MOD_ID+":sandstone", CompatModid+":"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace(MOD_ID+":balustrade_sandstone", CompatModid+":balustrade_"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace("minecraft:sand", ModidOfBaseMod+":"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace(MOD_ID+":modern_sandstone", CompatModid+":modern_"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace(MOD_ID+":railing_sandstone", CompatModid+":railing_"+MAT_ROCK.get(i)))
	                            .map(line -> line.replace("minecraft:smooth_sandstone", ModidOfBaseMod+":"+smoothSandstone))
	                            .map(line -> line.replace(ModidOfBaseMod+":"+nameNoBricks+"_bricks_slab", ModidOfBaseMod+":"+nameNoBricks+"_brick_slab"))
	                            .map(line -> line.replace(ModidOfBaseMod+":"+nameNoBricks+"_bricks_wall", ModidOfBaseMod+":"+nameNoBricks+"_brick_wall"))
	                            .collect(Collectors.toList());
	
	                    setIfModLoaded(modLoaders, ModidCharged1, ModidCharged2, modifiedLines, false);
	                    String newFileName = file.getFileName().toString().replace("sandstone", MAT_ROCK.get(i));
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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
	
	@Deprecated
	public void RecipesStoneAllIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_ROCK, String ModidCharged1, String ModidCharged2)
	{
		RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, new ArrayList<String>(), ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}

	@Deprecated
	public void AdvancementsLeavesHedgesIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> LEAVES, String ModidCharged1, String ModidCharged2)
	{
		AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}
	
	public void AdvancementsLeavesHedgesIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> LEAVES, String ModidCharged1, String ModidCharged2, ModLoaders modLoader)
	{
		for(String i : LEAVES)
		{
			File file = new File(LOCATION + "data"+s+"advancements"+s+"recipes"+s + i +"_hedge.json");
			
			if(!file.exists())
			{
				try
				{
					String modLoadedCondition = "";
					String endLine = "";
					
					switch(modLoader)
			        {
			        	case FORGE:
			        		if(VERSION.equals("1.21.3"))
			        		{
			                    modLoadedCondition = "\"forge:conditional\": [\r\n"
			                            + "    {\r\n"
			                            + "      \"forge:condition\": {\r\n"
			                            + "        \"type\": \"forge:and\",\r\n"
			                            + "        \"values\": [\r\n"
			                            + "          {\r\n"
			                            + "            \"type\": \"forge:mod_loaded\",\r\n"
			                            + "            \"modid\": \""+ModidCharged1+"\"\r\n"
			                            + "          },\r\n"
			                            + "          {\r\n"
			                            + "            \"type\": \"forge:mod_loaded\",\r\n"
			                            + "            \"modid\": \""+ModidCharged2+"\"\r\n"
			                            + "          }\r\n"
			                            + "        ]\r\n"
			                            + "      },";

			                    endLine = "\n]\r\n"
			                    		+ "}"; 
			        		}
			        		else
			        		{
			                    modLoadedCondition = "\"conditions\": [\r\n"
			                    		+ "    {\r\n"
			                    		+ "      \"type\": \"forge:mod_loaded\",\r\n"
			                    		+ "      \"modid\": \""+ModidCharged1+"\"\r\n"
			                    		+ "    },\r\n"
			                    		+ "    {\r\n"
			                    		+ "      \"type\": \"forge:mod_loaded\",\r\n"
			                    		+ "      \"modid\": \""+ModidCharged2+"\"\r\n"
			                    		+ "    }\r\n"
			                    		+ "  ],";
			        		}
			        		break;
			        		
			        	case FABRIC:
			                	modLoadedCondition = " \"fabric:load_conditions\": [\r\n"
			                		+ "    {\r\n"
			                		+ "      \"condition\": \"fabric:all_mods_loaded\",\r\n"
			                		+ "      \"values\": [\r\n"
			                		+ "        \""+ModidCharged1+"\",\r\n" 
			                		+ "        \""+ModidCharged2+"\"\r\n" 
			                		+ "      ]\r\n"
			                		+ "    }\r\n"
			                		+ "  ],";

			        		break;

			        	case NEOFORGE:
			        			modLoadedCondition = "\"neoforge:conditions\": [\r\n"
			        					+ "    {\r\n"
			        					+ "      \"type\": \"neoforge:mod_loaded\",\r\n"
			        					+ "      \"modid\": \""+ModidCharged1+"\"\r\n"
			        					+ "    },\r\n"
			        					+ "    {\r\n"
			        					+ "      \"type\": \"neoforge:mod_loaded\",\r\n"
			        					+ "      \"modid\": \""+ModidCharged2+"\"\r\n"
			        					+ "    }\r\n"
			        					+ "  ],";
			        		break;
			        }

					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"+modLoadedCondition
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
							+ "}"+endLine);
					buffer.newLine();
					
					buffer.close();
					writer.close();
					file.createNewFile();
					McwAPI.message(file.toPath());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
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
					McwAPI.message(file.toPath());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public void AdvancementsLeavesHedgesPrefixedIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> LEAVES, List<String> PREFIX_LEAVES, String ModidCharged1, String ModidCharged2, ModLoaders modLoader)
	{
		for(int nbm = 0;nbm<LEAVES.size();nbm++)
		{
			File file = new File(LOCATION + "data"+s+"advancements"+s+"recipes"+s + PREFIX_LEAVES.get(nbm) +"_hedge.json");
			
			if(!file.exists())
			{
				try
				{
					String modLoadedCondition = "";
					String endLine = "";
					
					switch(modLoader)
			        {
			        	case FORGE:
			        		if(VERSION.equals("1.21.3"))
			        		{
			                    modLoadedCondition = "\"forge:conditional\": [\r\n"
			                            + "    {\r\n"
			                            + "      \"forge:condition\": {\r\n"
			                            + "        \"type\": \"forge:and\",\r\n"
			                            + "        \"values\": [\r\n"
			                            + "          {\r\n"
			                            + "            \"type\": \"forge:mod_loaded\",\r\n"
			                            + "            \"modid\": \""+ModidCharged1+"\"\r\n"
			                            + "          },\r\n"
			                            + "          {\r\n"
			                            + "            \"type\": \"forge:mod_loaded\",\r\n"
			                            + "            \"modid\": \""+ModidCharged2+"\"\r\n"
			                            + "          }\r\n"
			                            + "        ]\r\n"
			                            + "      },";

			                    endLine = "\n]\r\n"
			                    		+ "}"; 
			        		}
			        		else
			        		{
			                    modLoadedCondition = "\"conditions\": [\r\n"
			                    		+ "    {\r\n"
			                    		+ "      \"type\": \"forge:mod_loaded\",\r\n"
			                    		+ "      \"modid\": \""+ModidCharged1+"\"\r\n"
			                    		+ "    },\r\n"
			                    		+ "    {\r\n"
			                    		+ "      \"type\": \"forge:mod_loaded\",\r\n"
			                    		+ "      \"modid\": \""+ModidCharged2+"\"\r\n"
			                    		+ "    }\r\n"
			                    		+ "  ],";
			        		}
			        		break;
			        		
			        	case FABRIC:
			                	modLoadedCondition = " \"fabric:load_conditions\": [\r\n"
			                		+ "    {\r\n"
			                		+ "      \"condition\": \"fabric:all_mods_loaded\",\r\n"
			                		+ "      \"values\": [\r\n"
			                		+ "        \""+ModidCharged1+"\",\r\n" 
			                		+ "        \""+ModidCharged2+"\"\r\n" 
			                		+ "      ]\r\n"
			                		+ "    }\r\n"
			                		+ "  ],";

			        		break;

			        	case NEOFORGE:
			        			modLoadedCondition = "\"neoforge:conditions\": [\r\n"
			        					+ "    {\r\n"
			        					+ "      \"type\": \"neoforge:mod_loaded\",\r\n"
			        					+ "      \"modid\": \""+ModidCharged1+"\"\r\n"
			        					+ "    },\r\n"
			        					+ "    {\r\n"
			        					+ "      \"type\": \"neoforge:mod_loaded\",\r\n"
			        					+ "      \"modid\": \""+ModidCharged2+"\"\r\n"
			        					+ "    }\r\n"
			        					+ "  ],";
			        		break;
			        }
					
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"+modLoadedCondition
							+ "  \"parent\": \"minecraft:recipes/root\",\r\n"
							+ "  \"rewards\": {\r\n"
							+ "    \"recipes\": [\r\n"
							+ "	\""+CompatModid+":"+PREFIX_LEAVES.get(nbm)+"_hedge\"\r\n"
							+ "    ]\r\n"
							+ "  },\r\n"
							+ "  \"criteria\": {\r\n"
							+ "    \"has_birch\": {\r\n"
							+ "      \"trigger\": \"minecraft:inventory_changed\",\r\n"
							+ "      \"conditions\": {\r\n"
							+ "        \"items\": [\r\n"
							+ "          {\r\n"
							+ "            \"item\": \""+ModidOfBaseMod+":"+LEAVES.get(nbm)+"_leaves\"\r\n"
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
							+ "}"+endLine);
					buffer.newLine();
					
					buffer.close();
					writer.close();
					file.createNewFile();
					McwAPI.message(file.toPath());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	@Deprecated
	public void AdvancementsLeavesHedgesPrefixed(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> LEAVES, List<String> PREFIX_LEAVES)
	{
		for(int nbm = 0;nbm<LEAVES.size();nbm++)
		{
			File file = new File(LOCATION + "data"+s+"advancements"+s+"recipes"+s + PREFIX_LEAVES.get(nbm) +"_hedge.json");
			
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
							+ "	\""+CompatModid+":"+PREFIX_LEAVES.get(nbm)+"_hedge\"\r\n"
							+ "    ]\r\n"
							+ "  },\r\n"
							+ "  \"criteria\": {\r\n"
							+ "    \"has_birch\": {\r\n"
							+ "      \"trigger\": \"minecraft:inventory_changed\",\r\n"
							+ "      \"conditions\": {\r\n"
							+ "        \"items\": [\r\n"
							+ "          {\r\n"
							+ "            \"item\": \""+ModidOfBaseMod+":"+LEAVES.get(nbm)+"_leaves\"\r\n"
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
					McwAPI.message(file.toPath());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	@Deprecated
	public void AdvancementsLeavesHedgesPrefixedIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> LEAVES, List<String> PREFIX_LEAVES, String ModidCharged1, String ModidCharged2)
	{
		AdvancementsLeavesHedgesPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, PREFIX_LEAVES, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
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

	@Deprecated
	public void RecipesLogAllwithResearchIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String research, String ModidCharged1, String ModidCharged2)
	{
		RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStemWood, research, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}

	public void RecipesLogAllwithResearchIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, boolean isStemWood, String research, String ModidCharged1, String ModidCharged2, ModLoaders modLoader)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
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
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":stripped_"+i + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+i))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+i))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+i))
	                            .collect(Collectors.toList());
	                    setIfModLoaded(modLoader, ModidCharged1, ModidCharged2, modifiedLines, false);
	                    String newFileName = file.getFileName().toString().replace("acacia", i);
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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
	
	@Deprecated
	public void RecipesLogAllwithResearchIsChargedPrefixed(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String research, String ModidCharged1, String ModidCharged2)
	{
		RecipesLogAllwithResearchPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, PREFIX_WOOD, isStemWood, research, ModidCharged1, ModidCharged2, ModLoaders.FORGE);
	}
	
	public void RecipesLogAllwithResearchPrefixedIsCharged(String LOCATION, String CompatModid, String ModidOfBaseMod, List<String> MAT_WOOD, List<String> PREFIX_WOOD, boolean isStemWood, String research, String ModidCharged1, String ModidCharged2, ModLoaders modLoader)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.RECIPE.getPath());
		
		for(int nbm = 0;nbm<MAT_WOOD.size();nbm++ )
		{
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains(research))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
			            final int a = nbm;
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	                    
	                    boolean isPremiumWoods = ModidCharged1.equals("premium_wood") || ModidCharged2.equals("premium_wood");
	                    final String stripped=isPremiumWoods ? MAT_WOOD.get(a)+"_stripped_log" : "stripped_"+MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log");
	                    
	                    List<String> modifiedLines = lines.stream()
	                            .map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+MAT_WOOD.get(a) + (isStemWood ? "_stem" : "_log")))
	                            .map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+MAT_WOOD.get(a)))
	                            .map(line -> line.replace("minecraft:stripped_acacia_log", ModidOfBaseMod+":"+stripped))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":rope_acacia", CompatModid+":rope_"+PREFIX_WOOD.get(a)))
	                            .collect(Collectors.toList());
	
	                    setIfModLoaded(modLoader, ModidCharged1, ModidCharged2, modifiedLines, false);
	                    String newFileName = file.getFileName().toString().replace("acacia", PREFIX_WOOD.get(a));
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"recipes"+s, newFileName);
	
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
	
	public void LootTableLogAllwithResearchPrefixed(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> PREFIX_WOOD, String research)
	{
		Path directory = Paths.get(McwAPI.READER+VERSION+s+MOD_ID+s+McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath());
		
		for(int nbm = 0;nbm<MAT_WOOD.size();nbm++ )
		{
	        // Filtrer et traiter les fichiers contenant "acacia" dans leur nom
	        try (Stream<Path> files = Files.list(directory)) {
	            List<Path> acaciaFiles = files
	                    .filter(file -> file.getFileName().toString().contains(research))
	                    .collect(Collectors.toList());
	
	            for (Path file : acaciaFiles) {
	            	try {
			            final int a = nbm;
	                    List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
	
	                    List<String> modifiedLines = lines.stream()
	                            //.map(line -> line.replace("minecraft:acacia_log", ModidOfBaseMod+":"+i + (isStemWood ? "_stem" : "_log")))
	                            //.map(line -> line.replace("minecraft:acacia", ModidOfBaseMod+":"+i))
	                            .map(line -> line.replace(MOD_ID+":acacia", CompatModid+":"+PREFIX_WOOD.get(a)))
	                            .map(line -> line.replace(MOD_ID+":stripped_acacia", CompatModid+":stripped_"+PREFIX_WOOD.get(a)))
	                            .collect(Collectors.toList());
	
	                    String newFileName = file.getFileName().toString().replace("acacia", PREFIX_WOOD.get(a));
	                    Path newFilePath = Paths.get(McwMain.LOCATION+"data"+s+"loot_tables"+s+"blocks"+s, newFileName);
	
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