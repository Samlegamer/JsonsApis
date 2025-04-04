package fr.samlegamer.api.datagen.roofs;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

@Deprecated(forRemoval = true)
public class RoofsTagsGenerator implements IModFiles.ITagData
{
	@Override
	public void AxeDataGenWood(String LOCATION, String Modid, List<String> Mat)
	{
		Path file = Path.of(LOCATION, "MineableAxeData (Roofs).json");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : Mat)
				{
					McwAPI.verifJson(buffer, i, Mat);
					buffer.write("    \""+Modid+":"+i+"_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_attic_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_top_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_lower_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_steep_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_upper_lower_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_upper_steep_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_planks_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_planks_attic_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_planks_top_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_planks_lower_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_planks_steep_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_planks_upper_lower_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_planks_upper_steep_roof\"");
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

	@Override
	public void PickaxeDataGen(String LOCATION, String Modid, List<String> MAT_ROCK)
	{
		Path file = Path.of(LOCATION, "MineablePickaxeData (Roofs).json");

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
					buffer.write("    \""+Modid+":"+i+"_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_attic_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_top_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_lower_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_steep_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_upper_lower_roof\",\r\n");
					buffer.write("    \""+Modid+":"+i+"_upper_steep_roof\"");
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

	@Override
	public void TagsWood(String LOCATION, String Modid, List<String> MAT_WOOD) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD) {
		// TODO Auto-generated method stub
		
	}
}