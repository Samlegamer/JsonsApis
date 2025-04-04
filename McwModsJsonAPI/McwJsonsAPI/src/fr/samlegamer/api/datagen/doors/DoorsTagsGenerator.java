package fr.samlegamer.api.datagen.doors;

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
import fr.samlegamer.utils.IModFiles.ITagData;

@Deprecated(forRemoval = true)
public class DoorsTagsGenerator implements ITagData
{
	public DoorsTagsGenerator()
	{
		McwAPI.registerFolder(McwMain.LOCATION + ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_DOORS_MODID + File.separator);
	}
	
	@Override
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, "MineableAxeData(Macaw's Doors).json");

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
					buffer.write("\""+CompatModid+":"+i+"_bamboo_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_whispering_door\"");
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

	private void addTagWood(String LOCATION, String Modid, List<String> MAT_WOOD, String FileName, String objName)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_DOORS_MODID + File.separator, FileName + ".json");

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
					buffer.write("\""+Modid+":"+i+objName+"\"");
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

	@Override
	public void TagsWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "bamboo_doors", "_bamboo_door");
		//addTagWood(LOCATION, CompatModid, MAT_WOOD, "bark_doors", "_bark_door"); not exist ???
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "barn_doors", "_barn_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "barn_glass_doors", "_barn_glass_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "beach_doors", "_beach_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "classic_doors", "_classic_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "cottage_doors", "_cottage_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "four_panel_doors", "_four_panel_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "glass_doors", "_glass_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "modern_doors", "_modern_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "mystic_doors", "_mystic_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "nether_doors", "_nether_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "paper_doors", "_paper_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "shoji_doors", "_japanese_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "shoji_whole_doors", "_japanese2_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "stable_doors", "_stable_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "stable_head_doors", "_stable_head_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "swamp_doors", "_swamp_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "tropical_doors", "_tropical_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "waffle_doors", "_waffle_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "western_doors", "_western_door");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "whispering_doors", "_whispering_door");

		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "wooden_doors.json");
		Path file2 = Path.of(LOCATION, ClassicFolderTypes.TAGS_ITEM.getPath(), "wooden_doors.json");

		if(!Files.exists(file2))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file2, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
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
					buffer.write("\""+CompatModid+":"+i+"_bamboo_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_whispering_door\"");
				}

				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(file2);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

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
					buffer.write("\""+CompatModid+":"+i+"_bamboo_door\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_whispering_door\"");
				}

				buffer.newLine();
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
