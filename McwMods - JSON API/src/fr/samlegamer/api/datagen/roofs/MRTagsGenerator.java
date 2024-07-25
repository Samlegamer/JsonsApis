package fr.samlegamer.api.datagen.roofs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class MRTagsGenerator implements IModFiles.ITagData
{
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{		
		File file = new File(LOCATION + "MineableAxeData (Macaw's Roofs).json");
		
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
					buffer.write("    \""+CompatModid+":"+i+"_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_attic_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_top_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_steep_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_upper_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_upper_steep_roof\",\r\n"+ "");
					buffer.newLine();

					buffer.write("    \""+CompatModid+":"+i+"_planks_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_planks_attic_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_planks_top_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_planks_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_planks_steep_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_planks_upper_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+CompatModid+":"+i+"_planks_upper_steep_roof\",\r\n"+ "");
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

	@Override
	public void PickaxeDataGen(String LOCATION, String Modid, List<String> MAT_ROCK) {
		// TODO Auto-generated method stub
		
	}
}