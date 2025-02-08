package fr.samlegamer.api.datagen.traps;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles.ITagData;

public class TrapdoorsTagsGenerator implements ITagData
{
	@Override
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, "MineableAxeData(Macaw's Trapdoors).json");

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
					buffer.write("\""+CompatModid+":"+i+"_barn_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barred_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_beach_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_cottage_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_four_panel_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_glass_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_mystic_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_paper_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_tropical_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_swamp_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_blossom_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_classic_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bamboo_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bark_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barrel_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_ranch_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_whispering_trapdoor\"");
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
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD) {
	}

	@Override
	public void PickaxeDataGen(String LOCATION, String CompatModid, List<String> MAT_ROCK) {
	}

	private void addTagWood(String LOCATION, String Modid, List<String> MAT_WOOD, String FileName, String objName)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), FileName + ".json");

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
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "bamboo_trapdoors", "_bamboo_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "bark_trapdoors", "_bark_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "barn_trapdoors", "_barn_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "barred_trapdoors", "_barred_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "barrel_trapdoors", "_barrel_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "beach_trapdoors", "_beach_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "cottage_trapdoors", "_cottage_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "four_panel_trapdoors", "_four_panel_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "glass_trapdoors", "_glass_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "mystic_trapdoors", "_mystic_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "paper_trapdoors", "_paper_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "ranch_trapdoors", "_ranch_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "swamp_trapdoors", "_swamp_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "tropical_trapdoors", "_tropical_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "waffle_trapdoors", "_blossom_trapdoor");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "whispering_trapdoors", "_whispering_trapdoor");

		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "wooden_trapdoors.json");
		Path file2 = Path.of(LOCATION, ClassicFolderTypes.TAGS_ITEM.getPath(), "wooden_trapdoors.json");

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
					buffer.write("\""+CompatModid+":"+i+"_barn_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barred_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_beach_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_cottage_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_four_panel_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_glass_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_mystic_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_paper_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_tropical_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_swamp_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_blossom_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_classic_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bamboo_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bark_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barrel_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_ranch_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_whispering_trapdoor\"");
				}

				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(file2);
			}
			catch (IOException e) {
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
					buffer.write("\""+CompatModid+":"+i+"_barn_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barred_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_beach_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_cottage_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_four_panel_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_glass_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_mystic_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_paper_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_tropical_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_swamp_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_blossom_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_classic_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bamboo_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_bark_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_barrel_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_ranch_trapdoor\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_whispering_trapdoor\"");
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
	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK) {
	}

}
