package fr.samlegamer.api.datagen.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MFurniTagsGenerator
{
	public static void AxeDataGen(String LOCATION, String Modid, List<String> Mat)
	{		
		File file = new File(LOCATION + "MineableAxeData(Macaw's Furnitures).json");
		
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
					buffer.write("\""+Modid+":"+i+"_wardrobe\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_modern_wardrobe\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_double_wardrobe\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_bookshelf_cupboard\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_bookshelf\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_drawer\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_double_drawer\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_bookshelf_drawer\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_lower_bookshelf_drawer\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_large_drawer\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_lower_triple_drawer\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_triple_drawer\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_desk\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_covered_desk\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_modern_desk\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_table\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_end_table\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_coffee_table\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_glass_table\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_chair\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_modern_chair\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_striped_chair\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_stool_chair\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_counter\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_drawer_counter\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_double_drawer_counter\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_cupboard_counter\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"");
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}
}