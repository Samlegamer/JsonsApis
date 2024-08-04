package fr.samlegamer.api.datagen.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles;

public class FurnituresTagGenerator implements IModFiles.ITagData
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
					buffer.write("\""+CompatModid+":"+i+"_wardrobe\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_modern_wardrobe\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_double_wardrobe\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_bookshelf\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_bookshelf_cupboard\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_drawer\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_double_drawer\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_bookshelf_drawer\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_lower_bookshelf_drawer\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_large_drawer\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_lower_triple_drawer\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_triple_drawer\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_covered_desk\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_modern_desk\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_table\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_end_table\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_coffee_table\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_glass_table\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_chair\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_modern_chair\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_striped_chair\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_stool_chair\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_counter\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_drawer_counter\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_double_drawer_counter\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_cupboard_counter\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_wardrobe\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_modern_wardrobe\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_double_wardrobe\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_bookshelf\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_bookshelf_cupboard\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_drawer\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_double_drawer\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_bookshelf_drawer\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_lower_bookshelf_drawer\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_large_drawer\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_lower_triple_drawer\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_triple_drawer\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_desk\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_covered_desk\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_modern_desk\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_table\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_end_table\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_coffee_table\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_glass_table\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_modern_chair\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_striped_chair\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_stool_chair\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_counter\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_drawer_counter\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_double_drawer_counter\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_cupboard_counter\","+ "");
					//3.3.0 Update
					buffer.write("\""+CompatModid+":"+i+"_kitchen_cabinet\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_double_kitchen_cabinet\","+ "");
					buffer.write("\""+CompatModid+":"+i+"_glass_kitchen_cabinet\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_kitchen_cabinet\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_double_kitchen_cabinet\","+ "");
					buffer.write("\""+CompatModid+":stripped_"+i+"_glass_kitchen_cabinet\","+ "");
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
					buffer.write("\""+Modid+":"+i+"_"+objName+"\",");
					buffer.newLine();
					buffer.write("\""+Modid+":stripped_"+i+"_"+objName+"\",");
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
	
	private void cabinet(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		File file = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "cabinet.json");
		
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
					buffer.write("\""+Modid+":"+i+"_kitchen_cabinet"+"\",");
					buffer.newLine();
					buffer.write("\""+Modid+":stripped_"+i+"_kitchen_cabinet"+"\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_double_kitchen_cabinet"+"\",");
					buffer.newLine();
					buffer.write("\""+Modid+":stripped_"+i+"_double_kitchen_cabinet"+"\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_glass_kitchen_cabinet"+"\",");
					buffer.newLine();
					buffer.write("\""+Modid+":stripped_"+i+"_glass_kitchen_cabinet"+"\",");
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
	
	private void addTagWood(String LOCATION, String Modid, List<String> MAT_WOOD, String FileName)
	{
		addTagWood(LOCATION, Modid, MAT_WOOD, FileName, FileName);
	}
	
	public void TagsWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		addTagWood(LOCATION, Modid, MAT_WOOD, "bookshelf", "bookshelf");
		addTagWood(LOCATION, Modid, MAT_WOOD, "bookshelf_cupboard");
		addTagWood(LOCATION, Modid, MAT_WOOD, "bookshelf_drawer");
		cabinet(LOCATION, Modid, MAT_WOOD);
		addTagWood(LOCATION, Modid, MAT_WOOD, "chair");
		addTagWood(LOCATION, Modid, MAT_WOOD, "coffee_table");
		addTagWood(LOCATION, Modid, MAT_WOOD, "counter");
		addTagWood(LOCATION, Modid, MAT_WOOD, "covered_desk");
		addTagWood(LOCATION, Modid, MAT_WOOD, "cupboard_counter");
		addTagWood(LOCATION, Modid, MAT_WOOD, "desk");
		addTagWood(LOCATION, Modid, MAT_WOOD, "double_drawer");
		addTagWood(LOCATION, Modid, MAT_WOOD, "double_drawer_counter");
		addTagWood(LOCATION, Modid, MAT_WOOD, "double_wardrobe");
		addTagWood(LOCATION, Modid, MAT_WOOD, "drawer");
		addTagWood(LOCATION, Modid, MAT_WOOD, "end_table");
		addTagWood(LOCATION, Modid, MAT_WOOD, "glass_table");
		addTagWood(LOCATION, Modid, MAT_WOOD, "large_drawer");
		addTagWood(LOCATION, Modid, MAT_WOOD, "lower_bookshelf_drawer");
		addTagWood(LOCATION, Modid, MAT_WOOD, "lower_triple_drawer");
		addTagWood(LOCATION, Modid, MAT_WOOD, "modern_chair");
		addTagWood(LOCATION, Modid, MAT_WOOD, "modern_desk");
		addTagWood(LOCATION, Modid, MAT_WOOD, "modern_wardrobe");
		addTagWood(LOCATION, Modid, MAT_WOOD, "stool_chair");
		addTagWood(LOCATION, Modid, MAT_WOOD, "striped_chair");
		addTagWood(LOCATION, Modid, MAT_WOOD, "table");
		addTagWood(LOCATION, Modid, MAT_WOOD, "triple_drawer");
		addTagWood(LOCATION, Modid, MAT_WOOD, "wadrobe");
	}

}