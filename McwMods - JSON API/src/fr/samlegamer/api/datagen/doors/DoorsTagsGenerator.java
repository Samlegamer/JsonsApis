package fr.samlegamer.api.datagen.doors;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles.ITagData;

public class DoorsTagsGenerator implements ITagData
{
	@Override
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		File file = new File(LOCATION + "MineableAxeData(Macaw's Doors).json");
		
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
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_japanese_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_japanese2_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barn_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barn_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_modern_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_cottage_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_classic_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_beach_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_paper_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_four_panel_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_tropical_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stable_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stable_head_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_western_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_waffle_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_mystic_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bark_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_nether_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_swamp_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bamboo_door\"");
				}
				
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
	public void TagsWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{		
		File file = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() +"wooden_doors.json");
		File file2 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_ITEM.getPath() +"wooden_doors.json");

		if(!file2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file2);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_japanese_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_japanese2_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barn_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barn_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_modern_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_cottage_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_classic_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_beach_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_paper_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_four_panel_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_tropical_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stable_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stable_head_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_western_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_waffle_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_mystic_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bark_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_nether_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_swamp_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bamboo_door\"");
				}
				
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				file2.createNewFile();
				McwAPI.message(file2);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		
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
					McwAPI.verifJson(buffer, i, MAT_WOOD);
					buffer.write("\""+CompatModid+":"+i+"_japanese_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_japanese2_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barn_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barn_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_modern_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_cottage_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_classic_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_beach_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_paper_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_four_panel_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_tropical_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stable_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stable_head_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_western_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_waffle_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_mystic_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bark_glass_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_nether_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_swamp_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bamboo_door\"");
				}
				
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
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PickaxeDataGen(String LOCATION, String CompatModid, List<String> MAT_ROCK) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK) {
		// TODO Auto-generated method stub
		
	}

}
