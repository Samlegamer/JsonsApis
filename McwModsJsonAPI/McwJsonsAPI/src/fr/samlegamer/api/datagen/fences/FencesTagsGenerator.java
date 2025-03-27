package fr.samlegamer.api.datagen.fences;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles;

public class FencesTagsGenerator implements IModFiles.ITagData
{
	private final boolean stone;
	private final List<String> MAT_ROCK;
	private List<String> LEAVES;

	public FencesTagsGenerator(boolean s, List<String> rock)
	{
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
		this(false, new ArrayList<String>(), new ArrayList<String>());
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

	public void TagsWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{
		Path blk = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "fences.json");
		Path blk2 = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "fence_gates.json");
		Path itm = Path.of(LOCATION, ClassicFolderTypes.TAGS_ITEM.getPath(), "fences.json");
		Path itm4 = Path.of(LOCATION, ClassicFolderTypes.TAGS_ITEM.getPath(), "walls.json");
		Path blk4 = Path.of(LOCATION, ClassicFolderTypes.TAGS_BLOCK.getPath(), "walls.json");

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

		if(!Files.exists(blk))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(blk, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
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
					buffer.write("\""+CompatModid+":"+i+"_wired_fence\"");
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
				McwAPI.message(blk);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		if(!Files.exists(blk2))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(blk2, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
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
					buffer.write("\""+CompatModid+":"+i+"_pyramid_gate\"");
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
				McwAPI.message(blk2);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		if(!Files.exists(itm))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(itm, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
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
					buffer.write("\""+CompatModid+":"+i+"_wired_fence\"");
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
				McwAPI.message(itm);
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
		System.out.println("The Tags of Fence is on the TagWood use API Tag with constructor !");
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