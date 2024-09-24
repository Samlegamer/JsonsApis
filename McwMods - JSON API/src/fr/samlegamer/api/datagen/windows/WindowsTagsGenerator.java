package fr.samlegamer.api.datagen.windows;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles.ITagData;

public class WindowsTagsGenerator implements ITagData
{
	@Override
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		File file = new File(LOCATION + "MineableAxeData(Macaw's Windows).json");
		
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
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_window2\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_window2\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_window2\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_four_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_four_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_four_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_pane_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_pane_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_pane_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_log_parapet\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_parapet\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_blinds\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_shutter\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_louvered_shutter\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_curtain_rod\"");
				}
				
				buffer.newLine();
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

	@Override
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD) {
	}

	@Override
	public void PickaxeDataGen(String LOCATION, String CompatModid, List<String> MAT_ROCK) {
	}

	private void addTagWood(String LOCATION, String Modid, List<String> MAT_WOOD, String FileName, String objName)
	{
		File file = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + FileName + ".json");
		
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
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+Modid+":"+i+objName+"\"");
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
	
	@Override
	public void TagsWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "blinds", "_blinds");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "curtain_rods", "_curtain_rod");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "parapets", "_log_parapet");
				
		File windows_two = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "windows_two.json");
		
		if(!windows_two.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(windows_two);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_window2"+"\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_window2"+"\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_window2"+"\"");
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				windows_two.createNewFile();
				McwAPI.message(windows_two);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		File windows_four = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "windows_four.json");
		
		if(!windows_four.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(windows_four);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_four_window"+"\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_four_window"+"\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_four_window"+"\"");
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				windows_four.createNewFile();
				McwAPI.message(windows_four);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		File windows = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "windows.json");
		
		if(!windows.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(windows);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_window"+"\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_window"+"\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_window"+"\"");
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				windows.createNewFile();
				McwAPI.message(windows);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		File shutters = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "shutters.json");
		
		if(!shutters.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(shutters);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_shutter"+"\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_louvered_shutter"+"\"");
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				writer.close();
				shutters.createNewFile();
				McwAPI.message(shutters);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		File file = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() +"walls (Windows).json");

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
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_window2\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_window2\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_window2\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_four_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_four_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_log_four_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_pane_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":stripped_"+i+"_pane_window\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_plank_pane_window\"");
				}
				
				buffer.newLine();
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

	@Override
	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK) {
	}
}