package fr.samlegamer.api.datagen.paths;

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

@Deprecated(forRemoval = true)
public class PathsTagsGenerator implements IModFiles.ITagData
{
	public PathsTagsGenerator()
	{
		McwAPI.registerFolder(McwMain.LOCATION + ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_PATHS_MODID + File.separator);
	}

	public void AxeDataGenWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, "MineableAxeData (Paths).json");

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
					buffer.write("\""+Modid+":"+i+"_planks_path\"");
				}
				
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
	public void TagsWood(String LOCATION, String Modid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_PATHS_MODID + File.separator, "wooden_paths.json");

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
					buffer.write("\""+Modid+":"+i+"_planks_path\"");
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
	public void TagsRock(String LOCATION, String Modid, List<String> MAT_ROCK) {
		// TODO Auto-generated method stub
		
	}
}
