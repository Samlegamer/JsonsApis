package fr.samlegamer.api.datagen.roofs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MRTagGenerator
{
	public static void AxeDataGen(String LOCATION, String Modid, List<String> Mat)
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
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_attic_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_top_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_steep_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_upper_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_upper_steep_roof\",\r\n"+ "");
					buffer.newLine();

					buffer.write("    \""+Modid+":"+i+"_planks_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_attic_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_top_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_steep_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_upper_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_upper_steep_roof\",\r\n"+ "");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}
}