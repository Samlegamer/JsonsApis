package fr.samlegamer.api.datagen.windows;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles.ITagData;

public class WindowsTagsGenerator implements ITagData
{
	@Override
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, "MineableAxeData(Macaw's Windows).json");

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
				McwAPI.message(file);
			}
			catch (IOException e) {
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
	
	@Override
	public void TagsWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "blinds", "_blinds");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "curtain_rods", "_curtain_rod");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "parapets", "_log_parapet");

		Path windows_two = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "windows_two.json");

		if(!Files.exists(windows_two))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(windows_two, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
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
				McwAPI.message(windows_two);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		Path windows_four = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "windows_four.json");

		if(!Files.exists(windows_four))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(windows_four, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
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
				McwAPI.message(windows_four);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		Path windows = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "windows.json");

		if(!Files.exists(windows))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(windows, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
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
				McwAPI.message(windows);
			}
			catch (IOException e) {
				e.printStackTrace();
			}	
		}

		Path shutters = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "shutters.json");

		if(!Files.exists(shutters))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(shutters, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
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
				McwAPI.message(shutters);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "walls (Windows).json");

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