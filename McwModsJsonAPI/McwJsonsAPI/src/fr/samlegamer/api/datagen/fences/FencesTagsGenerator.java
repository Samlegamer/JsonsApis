package fr.samlegamer.api.datagen.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.McwMain;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.IModFiles;

public class FencesTagsGenerator implements IModFiles.ITagData
{
	private final boolean stone;
	private final List<String> MAT_ROCK;
	private List<String> LEAVES;

	public FencesTagsGenerator(boolean s, List<String> rock)
	{
		McwAPI.registerFolder(McwMain.LOCATION + ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_FENCES_MODID + File.separator);
		this.stone = s;
		this.MAT_ROCK=rock;
	}
	
	public FencesTagsGenerator(boolean s, List<String> rock, List<String> leaves)
	{
		this(s, rock);
		this.LEAVES=leaves;
	}
	
	public FencesTagsGenerator(List<String> leaves)
	{
		this();
		this.LEAVES=leaves;
	}
	
	public FencesTagsGenerator() {
		this(false, new ArrayList<>(), new ArrayList<>());
	}
	
	public void AxeDataGenWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path file = Path.of(LOCATION, "MineableAxeData(Macaw's Fences).json");

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
					buffer.write("\""+CompatModid+":"+i+"_pyramid_gate\"");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_curved_gate\"");
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

	private void woodenFences(Path woodenFencesTagItem, String CompatModid, List<String> MAT_WOOD)
	{
		if(!Files.exists(woodenFencesTagItem))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(woodenFencesTagItem, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);

				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();

				for(String i : MAT_WOOD)
				{
					if(!i.equals(MAT_WOOD.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write("\""+CompatModid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_wired_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_curved_gate\"");
				}

				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(woodenFencesTagItem);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void addTagWood(String LOCATION, String Modid, List<String> MAT_WOOD, String FileName, String objName)
	{
		Path file = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_FENCES_MODID + File.separator, FileName + ".json");

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
					buffer.write("\""+Modid+":"+i+"_"+objName+"\"");
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

	public void TagsWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		if(!LEAVES.isEmpty()) {
			addTagWood(LOCATION, CompatModid, LEAVES, "hedges", "hedge");
		}

		addTagWood(LOCATION, CompatModid, MAT_WOOD, "highley_gates", "highley_gate");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "horse_fences", "horse_fence");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "picket_fences", "picket_fence");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "pyramid_gates", "pyramid_gate");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "stockade_fences", "stockade_fence");
		addTagWood(LOCATION, CompatModid, MAT_WOOD, "wired_fences", "wired_fence");

		Path fenceTagBlock = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "fences.json");
		Path fenceGatesTagBlock = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "fence_gates.json");
		Path fenceTagItem = Path.of(LOCATION, ClassicFolderTypes.TAGS_ITEM.getPath(), "fences.json");
		Path itm4 = Path.of(LOCATION, ClassicFolderTypes.TAGS_ITEM.getPath(), "walls.json");
		Path blk4 = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "walls.json");

		Path woodenFencesTagItem = Path.of(LOCATION, ClassicFolderTypes.TAGS_ITEM.getPath(), "wooden_fences.json");
		Path woodenFencesTagBlock = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "wooden_fences.json");

		// 1.2.0
		woodenFences(woodenFencesTagBlock, CompatModid, MAT_WOOD);
		woodenFences(woodenFencesTagItem, CompatModid, MAT_WOOD);

		if(!Files.exists(itm4))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(itm4, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : LEAVES)
				{
					if(!i.equals(LEAVES.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write("\""+CompatModid+":"+i+"_hedge\"");
					if(i.equals(LEAVES.get(LEAVES.size()-1)) && stone)
					{
						buffer.write(",");
						buffer.newLine();
					}
				}
				
				if(stone) {
					for(String i : MAT_ROCK)
					{
						if(!i.equals(MAT_ROCK.get(0)))
						{
							buffer.write(",");
							buffer.newLine();
						}
						buffer.write("\""+CompatModid+":"+i+"_grass_topped_wall\"");
					}
				}

				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(itm4);
			}
			catch (IOException e) {
				e.printStackTrace();
			}	
		}

		if(!Files.exists(blk4))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(blk4, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : LEAVES)
				{
					if(!i.equals(LEAVES.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write("\""+CompatModid+":"+i+"_hedge\"");
					if(i.equals(LEAVES.get(LEAVES.size()-1)) && stone)
					{
						buffer.write(",");
						buffer.newLine();
					}
				}
				
				if(stone) {
					for(String i : MAT_ROCK)
					{
						if(!i.equals(MAT_ROCK.get(0)))
						{
							buffer.write(",");
							buffer.newLine();
						}
						buffer.write("\""+CompatModid+":"+i+"_grass_topped_wall\"");
					}
				}

				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(blk4);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		if(!Files.exists(fenceTagBlock))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(fenceTagBlock, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					if(!i.equals(MAT_WOOD.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write("\""+CompatModid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_wired_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_curved_gate\"");
					if(i.equals(MAT_WOOD.get(MAT_WOOD.size()-1)) && !LEAVES.isEmpty())
					{
						buffer.write(",");
						buffer.newLine();
					}
				}
				
				for(String i : LEAVES)
				{
					if(!i.equals(LEAVES.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write("\""+CompatModid+":"+i+"_hedge\"");
					if(i.equals(LEAVES.get(LEAVES.size()-1)) && stone)
					{
						buffer.write(",");
						buffer.newLine();
					}
				}
				
				if(stone) {
					for(String i : MAT_ROCK)
					{
						if(!i.equals(MAT_ROCK.get(0)))
						{
							buffer.write(",");
							buffer.newLine();
						}
						buffer.write("\""+CompatModid+":modern_"+i+"_wall\",");
						buffer.newLine();
						buffer.write("\""+CompatModid+":"+i+"_pillar_wall\",");
						buffer.newLine();
						buffer.write("\""+CompatModid+":railing_"+i+"_wall\",");
						buffer.newLine();
						buffer.write("\""+CompatModid+":"+i+"_grass_topped_wall\"");
					}
				}
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(fenceTagBlock);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		if(!Files.exists(fenceGatesTagBlock))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(fenceGatesTagBlock, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					if(!i.equals(MAT_WOOD.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write("\""+CompatModid+":"+i+"_highley_gate\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_pyramid_gate\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_curved_gate\"");
					if(i.equals(MAT_WOOD.get(MAT_WOOD.size()-1)) && stone)
					{
						buffer.write(",");
						buffer.newLine();
					}
				}
				
				if(stone) {
					for(String i : MAT_ROCK)
					{
						if(!i.equals(MAT_ROCK.get(0)))
						{
							buffer.write(",");
							buffer.newLine();
						}
						buffer.write("\""+CompatModid+":"+i+"_railing_gate\"");
					}
				}

				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(fenceGatesTagBlock);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		if(!Files.exists(fenceTagItem))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(fenceTagItem, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					if(!i.equals(MAT_WOOD.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write("\""+CompatModid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_wired_fence\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_curved_gate\"");
					if(i.equals(MAT_WOOD.get(MAT_WOOD.size()-1)) && stone)
					{
						buffer.write(",");
						buffer.newLine();
					}
				}
				
				if(stone) {
					for(String i : MAT_ROCK)
					{
						if(!i.equals(MAT_ROCK.get(0)))
						{
							buffer.write(",");
							buffer.newLine();
						}
						buffer.write("\""+CompatModid+":modern_"+i+"_wall\",");
						buffer.newLine();
						buffer.write("\""+CompatModid+":"+i+"_pillar_wall\",");
						buffer.newLine();
						buffer.write("\""+CompatModid+":railing_"+i+"_wall\"");
					}
				}
				
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				McwAPI.message(fenceTagItem);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}

	@Override
	public void PickaxeDataGen(String LOCATION, String CompatModid, List<String> MAT_ROCK)
	{
		Path file = Path.of(LOCATION, "MineablePickaxeData(Macaw's Fences).json");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);

				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : MAT_ROCK)
				{
					McwAPI.verifJson(buffer, i, MAT_ROCK);
					buffer.write("\""+CompatModid+":modern_"+i+"_wall\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":railing_"+i+"_wall\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_railing_gate\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_pillar_wall\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_grass_topped_wall\"");
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
	public void TagsRock(String LOCATION, String CompatModid, List<String> MAT_ROCK)
	{
		// 1.2.0
		addTagWood(LOCATION, CompatModid, MAT_ROCK, "grass_topped_walls", "grass_topped_wall");
		Path modern_walls = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_FENCES_MODID + File.separator, "modern_walls.json");

		if(!Files.exists(modern_walls))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(modern_walls, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);

				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();

				for(String i : MAT_ROCK)
				{
					McwAPI.verifJson(buffer, i, MAT_ROCK);
					buffer.write("\""+CompatModid+":modern_"+i+"_wall"+"\"");
				}

				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				McwAPI.message(modern_walls);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		addTagWood(LOCATION, CompatModid, MAT_ROCK, "pillar_walls", "pillar_wall");
		addTagWood(LOCATION, CompatModid, MAT_ROCK, "railing_gates", "railing_gate");
		Path railing_walls = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), Compatibilities.MCW_FENCES_MODID + File.separator, "railing_walls.json");

		if(!Files.exists(railing_walls))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(railing_walls, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);

				buffer.write("{\r\n"
						+ "  \"values\": [");
				buffer.newLine();

				for(String i : MAT_ROCK)
				{
					McwAPI.verifJson(buffer, i, MAT_ROCK);
					buffer.write("\""+CompatModid+":railing_"+i+"_wall"+"\"");
				}

				buffer.write("  ]\r\n"
						+ "}");
				buffer.close();
				McwAPI.message(railing_walls);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> LEAVES)
	{
		Path file = Path.of(LOCATION, "MineableHoeData(Macaw's Fences).json");

		if(!Files.exists(file) && !LEAVES.isEmpty())
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : LEAVES)
				{
					McwAPI.verifJson(buffer, i, LEAVES);
					buffer.write("\""+CompatModid+":"+i+"_hedge\"");
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
}