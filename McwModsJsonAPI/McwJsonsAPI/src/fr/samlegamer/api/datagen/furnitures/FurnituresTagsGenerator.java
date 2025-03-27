package fr.samlegamer.api.datagen.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwMain;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.IModFiles;

public class FurnituresTagsGenerator implements IModFiles.ITagData
{
	public FurnituresTagsGenerator() {
		McwAPI.registerFolder(McwMain.LOCATION + ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_FURNITURES_MODID + File.separator);
	}
	
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, "MineableAxeData(Macaw's Furnitures).json");

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
					buffer.write("\""+CompatModid+":"+i+"_wardrobe\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_modern_wardrobe\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_double_wardrobe\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_bookshelf\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_bookshelf_cupboard\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_double_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_bookshelf_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_lower_bookshelf_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_large_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_lower_triple_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_triple_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_covered_desk\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_modern_desk\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_table\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_end_table\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_coffee_table\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_glass_table\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_chair\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_modern_chair\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_striped_chair\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_stool_chair\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_counter\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_drawer_counter\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_double_drawer_counter\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_cupboard_counter\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_wardrobe\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_modern_wardrobe\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_double_wardrobe\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_bookshelf\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_bookshelf_cupboard\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_double_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_bookshelf_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_lower_bookshelf_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_large_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_lower_triple_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_triple_drawer\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_desk\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_covered_desk\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_modern_desk\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_table\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_end_table\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_coffee_table\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_glass_table\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_modern_chair\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_striped_chair\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_stool_chair\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_counter\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_drawer_counter\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_double_drawer_counter\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_cupboard_counter\","+ "\n");
					//3.3.0 Update
					buffer.write("\""+CompatModid+":"+i+"_kitchen_cabinet\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_double_kitchen_cabinet\","+ "\n");
					buffer.write("\""+CompatModid+":"+i+"_glass_kitchen_cabinet\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_kitchen_cabinet\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_double_kitchen_cabinet\","+ "\n");
					buffer.write("\""+CompatModid+":stripped_"+i+"_glass_kitchen_cabinet\"");
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
	public void PickaxeDataGen(String LOCATION, String Modid, List<String> MAT_ROCK) {
	}

	private void addTagWood(String LOCATION, String Modid, List<String> MAT_WOOD, String FileName, String objName)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_FURNITURES_MODID + File.separator, FileName + ".json");

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
					buffer.write("\""+Modid+":"+i+"_"+objName+"\",");
					buffer.newLine();
					buffer.write("\""+Modid+":stripped_"+i+"_"+objName+"\"");
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
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
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_FURNITURES_MODID + File.separator, "cabinet.json");

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
					buffer.write("\""+Modid+":stripped_"+i+"_glass_kitchen_cabinet"+"\"");
				}
				
				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
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
	
	private void wadrobe(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_FURNITURES_MODID + File.separator, "wadrobe.json");

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
					buffer.write("\""+Modid+":"+i+"_wardrobe"+"\"");
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
		wadrobe(LOCATION, Modid, MAT_WOOD);
	}

	@Override
	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK) {
	}

	@Override
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD) {
	}

}