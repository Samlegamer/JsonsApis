package fr.samlegamer.api.datagen.stairs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwMain;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.IModFiles;

public class StairsTagsGenerator implements IModFiles.ITagData
{
	private final List<String> MAT_ROCK;
	
	public StairsTagsGenerator(List<String> MAT_ROCK)
	{
		this.MAT_ROCK = MAT_ROCK;
		McwAPI.registerFolder(McwMain.LOCATION + ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_STAIRS_MODID + File.separator);
	}
	
	public StairsTagsGenerator()
	{
		this(new ArrayList<String>());
	}
	
	public void AxeDataGenWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, "MineableAxeData (Stairs).json");

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
					buffer.write("	  \""+Modid+":"+i+"_terrace_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_skyline_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_compact_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_bulk_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_loft_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_railing\",\r\n"
							+ "	  \""+Modid+":"+i+"_balcony\",\r\n"
							+ "	  \""+Modid+":"+i+"_platform\"");
				}
				
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(file);
			}
			catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
	
	public void PickaxeDataGen(String LOCATION, String Modid, List<String> MAT_ROCK)
	{
		Path file = Path.of(LOCATION, "MineablePickaxeData (Stairs).json");

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
					buffer.write("\""+Modid+":"+i+"_terrace_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_skyline_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_compact_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_bulk_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_loft_stairs\",\r\n"
							+ "	  \""+Modid+":"+i+"_railing\",\r\n"
							+ "	  \""+Modid+":"+i+"_balcony\",\r\n"
							+ "	  \""+Modid+":"+i+"_platform\"");
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

	private void addTagWood(String LOCATION, String Modid, List<String> MAT_WOOD, List<String> MAT_ROCK, String FileName, String objName)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_STAIRS_MODID + File.separator, FileName + ".json");

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
					buffer.write("\""+Modid+":"+i+"_"+objName+"\"");
				}
				
				if(!MAT_ROCK.isEmpty())
				{
					for(String i : MAT_ROCK)
					{
						McwAPI.verifJson(buffer, i, MAT_WOOD);
						buffer.write("\""+Modid+":"+i+"_"+objName+"\"");
					}
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
	public void TagsWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		addTagWood(LOCATION, Modid, MAT_WOOD, this.MAT_ROCK, "balconies", "balcony");
		addTagWood(LOCATION, Modid, MAT_WOOD, this.MAT_ROCK, "bulk_stairs", "bulk_stairs");
		addTagWood(LOCATION, Modid, MAT_WOOD, this.MAT_ROCK, "compact_stairs", "compact_stairs");
		addTagWood(LOCATION, Modid, MAT_WOOD, this.MAT_ROCK, "loft_stairs", "loft_stairs");
		addTagWood(LOCATION, Modid, MAT_WOOD, this.MAT_ROCK, "platforms", "platform");
		addTagWood(LOCATION, Modid, MAT_WOOD, this.MAT_ROCK, "railings", "railing");
		addTagWood(LOCATION, Modid, MAT_WOOD, this.MAT_ROCK, "skyline_stairs", "skyline_stairs");
		addTagWood(LOCATION, Modid, MAT_WOOD, this.MAT_ROCK, "terrace_stairs", "terrace_stairs");
	}

	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK){
	}

	@Override
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD) {
	}
}