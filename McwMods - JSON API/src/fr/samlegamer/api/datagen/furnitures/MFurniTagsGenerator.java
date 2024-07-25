package fr.samlegamer.api.datagen.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class MFurniTagsGenerator implements IModFiles.ITagData
{
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
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
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+CompatModid+":"+i+"_wardrobe\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_modern_wardrobe\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_double_wardrobe\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bookshelf_cupboard\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bookshelf\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_drawer\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_double_drawer\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bookshelf_drawer\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_lower_bookshelf_drawer\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_large_drawer\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_lower_triple_drawer\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_triple_drawer\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_desk\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_covered_desk\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_modern_desk\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_table\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_end_table\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_coffee_table\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_glass_table\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_chair\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_modern_chair\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_striped_chair\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stool_chair\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_counter\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_drawer_counter\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_double_drawer_counter\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_cupboard_counter\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"");
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
	public void PickaxeDataGen(String LOCATION, String Modid, List<String> MAT_ROCK) {
		// TODO Auto-generated method stub
		
	}
}