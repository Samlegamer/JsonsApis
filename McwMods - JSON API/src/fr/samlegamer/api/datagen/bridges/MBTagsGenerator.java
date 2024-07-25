package fr.samlegamer.api.datagen.bridges;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles;

public class MBTagsGenerator implements IModFiles.ITagData
{
	public void AxeDataGenWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{		
		File file = new File(LOCATION + "MineableAxeData.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("    \""+Modid+":"+i+"_log_bridge_middle\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":rope_"+i+"_bridge\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_bridge_pier\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_log_bridge_stair\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_rope_bridge_stair\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_rail_bridge\",\r\n"+ "");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n" + "}");
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
	
	public void PickaxeDataGen(String LOCATION, String Modid, List<String> MAT_ROCK)
	{		
		File file = new File(LOCATION + "MineablePickaxeData.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_ROCK)
				{
					buffer.write("    \""+Modid+":"+i+"_bridge\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_bridge_pier\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_bridge_stair\",\r\n"+ "");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n" + "}");
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

	public void TagsWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		File file = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "log_bridges.json");
		File file2 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "log_stairs.json");
		File file3 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "rail_bridges.json");
		File file4 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "rope_bridges.json");
		File file5 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "rope_stairs.json");
		File file6 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "wooden_piers.json");

		if(!file6.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file6);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+Modid+":"+i+"_bridge_pier\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				file6.createNewFile();
				McwAPI.message(file6);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!file5.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file5);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+Modid+":"+i+"_rope_bridge_stair\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				file5.createNewFile();
				McwAPI.message(file5);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!file4.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file4);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+Modid+":rope_"+i+"_bridge\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				file4.createNewFile();
				McwAPI.message(file4);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!file3.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file3);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+Modid+":"+i+"_rail_bridge\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				file3.createNewFile();
				McwAPI.message(file3);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!file2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file2);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+Modid+":"+i+"_log_bridge_stair\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				file2.createNewFile();
				McwAPI.message(file2);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+Modid+":"+i+"_log_bridge_middle\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
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

	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK)
	{		
		File file = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "stone_piers.json");
		File file2 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "stone_bridges.json");
		File file3 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "stone_stairs.json");

		if(!file3.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file3);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_ROCK)
				{
					buffer.write("\""+Modid+":"+i+"_bridge_stair\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				file3.createNewFile();
				McwAPI.message(file3);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!file2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file2);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_ROCK)
				{
					buffer.write("\""+Modid+":"+i+"_bridge\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				file2.createNewFile();
				McwAPI.message(file2);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_ROCK)
				{
					buffer.write("\""+Modid+":"+i+"_bridge_pier\",");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n"
						+ "}");
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