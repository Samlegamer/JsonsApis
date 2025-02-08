package fr.samlegamer.api.datagen.bridges;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles;

public class BridgesTagsGenerator implements IModFiles.ITagData
{
	public void AxeDataGenWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{		
		Path file = Path.of(LOCATION, "MineableAxeData (Bridges).json");
		
		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("    \""+Modid+":"+i+"_log_bridge_middle\",\r\n"+ "");
					buffer.write("    \""+Modid+":rope_"+i+"_bridge\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_bridge_pier\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_log_bridge_stair\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_rope_bridge_stair\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_rail_bridge\""+ "");
				}
				
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(file);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}
	
	public void PickaxeDataGen(String LOCATION, String Modid, List<String> MAT_ROCK)
	{		
		Path file = Path.of(LOCATION + "MineablePickaxeData (Bridges).json");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_ROCK)
				{
					McwAPI.verifJson(buffer, i, MAT_ROCK);
					buffer.write("    \""+Modid+":"+i+"_bridge\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_bridge_pier\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_bridge_stair\",\r\n"+ "");
					buffer.write("    \""+Modid+":balustrade_"+i+"_bridge\""+ "");
				}
				
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(file);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}

	private void addTag(String LOCATION, String Modid, List<String> MAT_WOOD, String FileName, String objName)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), FileName + ".json");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);

				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();

				for(String i : MAT_WOOD)
				{
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+Modid+":"+i+objName+"\"");
				}

				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				McwAPI.message(file);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void TagsWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "rope_bridges.json");
		addTag(LOCATION, Modid, MAT_WOOD, "log_bridges", "_log_bridge_middle");
		addTag(LOCATION, Modid, MAT_WOOD, "log_stairs", "_log_bridge_stair");
		addTag(LOCATION, Modid, MAT_WOOD, "rail_bridges", "_rail_bridge");
		addTag(LOCATION, Modid, MAT_WOOD, "rope_stairs", "_rope_bridge_stair");
		addTag(LOCATION, Modid, MAT_WOOD, "wooden_piers", "_bridge_pier");
		
		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+Modid+":rope_"+i+"_bridge\"");
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				McwAPI.message(file);
			}
			catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}

	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "stone_bridges.json");

		addTag(LOCATION, Modid, MAT_ROCK, "stone_stairs", "_bridge_stair");
		addTag(LOCATION, Modid, MAT_ROCK, "stone_piers", "_bridge_pier");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_ROCK)
				{
					McwAPI.verifJson(buffer, i, MAT_ROCK);
					buffer.write("\""+Modid+":"+i+"_bridge\",");
					buffer.newLine();
					buffer.write("\""+Modid+":balustrade_"+i+"_bridge\"");
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				McwAPI.message(file);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}

	@Override
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD) {
		// TODO Auto-generated method stub
		
	}

}