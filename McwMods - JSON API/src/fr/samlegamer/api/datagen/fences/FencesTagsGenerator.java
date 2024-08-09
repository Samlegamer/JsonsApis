package fr.samlegamer.api.datagen.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles;

public class FencesTagsGenerator implements IModFiles.ITagData
{
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{		
		File file = new File(LOCATION + "MineableAxeData(Macaw's Fences).json");
		
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
					buffer.write("\""+CompatModid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_wired_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_highley_gate\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_pyramid_gate\",");
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

	public void TagsWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{		
		File blk = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "fences.json");
		File blk2 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "fence_gates.json");
		File itm = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_ITEM.getPath() + "fences.json");

		if(!blk.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(blk);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+CompatModid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_wired_fence\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"");
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				blk.createNewFile();
				McwAPI.message(blk);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!blk2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(blk2);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+CompatModid+":"+i+"_highley_gate\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_pyramid_gate\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"");
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				blk2.createNewFile();
				McwAPI.message(blk2);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!itm.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(itm);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("\""+CompatModid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_wired_fence\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"");
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				itm.createNewFile();
				McwAPI.message(itm);
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

	@Override
	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK) {
		// TODO Auto-generated method stub
		
	}
}