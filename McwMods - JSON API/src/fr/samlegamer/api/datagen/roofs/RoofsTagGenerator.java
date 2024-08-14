package fr.samlegamer.api.datagen.roofs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class RoofsTagGenerator implements IModFiles.ITagData
{
	@Override
	public void AxeDataGenWood(String LOCATION, String Modid, List<String> Mat)
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
				
				for(String i : Mat)
				{
					buffer.write("    \""+Modid+":"+i+"_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_attic_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_top_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_lower_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_steep_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_upper_lower_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_upper_steep_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_planks_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_planks_attic_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_planks_top_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_planks_lower_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_planks_steep_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_planks_upper_lower_roof\",\r\n"+ "");
					buffer.write("    \""+Modid+":"+i+"_planks_upper_steep_roof\",\r\n"+ "");
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
	public void PickaxeDataGen(String LOCATION, String CompatModid, List<String> MAT_ROCK) {
		// TODO Auto-generated method stub
		
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