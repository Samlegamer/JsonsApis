package fr.samlegamer.api.datagen.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.IModFiles;

public class FencesTagsGenerator implements IModFiles.ITagData
{
	private boolean stone;
	private List<String> MAT_ROCK;
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
		this(false, new ArrayList<String>());
	}
	
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
					buffer.write("\""+CompatModid+":"+i+"_highley_gate\",");
					buffer.newLine();
					buffer.write("\""+CompatModid+":"+i+"_pyramid_gate\"");
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

	public void TagsWood(String LOCATION, String CompatModid, List<String> MAT_WOOD)
	{		
		File blk = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "fences.json");
		File blk2 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "fence_gates.json");
		File itm = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_ITEM.getPath() + "fences.json");
		File itm4 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_ITEM.getPath() + "walls.json");
		File blk4 = new File(LOCATION + File.separator + ClassicFolderTypes.TAGS_BLOCK.getPath() + "walls.json");

		if(!itm4.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(itm4);
				BufferedWriter buffer = new BufferedWriter(writer);
				
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
				writer.close();
				itm4.createNewFile();
				McwAPI.message(itm4);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}

		if(!blk4.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(blk4);
				BufferedWriter buffer = new BufferedWriter(writer);
				
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
				writer.close();
				blk4.createNewFile();
				McwAPI.message(blk4);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
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
	public void PickaxeDataGen(String LOCATION, String CompatModid, List<String> MAT_ROCK)
	{		
		File file = new File(LOCATION + "MineablePickaxeData(Macaw's Fences).json");
		
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
				
				for(String i : MAT_ROCK)
				{	
					if(!i.equals(MAT_ROCK.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
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
	public void TagsRock(String LOCATION, String CompatModid, List<String> MAT_ROCK)
	{
		System.out.println("The Tags of Fence is on the TagWood use API Tag with constructor !");
	}

	@Override
	public void HoeDataGenWood(String LOCATION, String CompatModid, List<String> LEAVES)
	{
		File file = new File(LOCATION + "MineableHoeData(Macaw's Fences).json");
		
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
				
				for(String i : LEAVES)
				{
					if(!i.equals(LEAVES.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write("\""+CompatModid+":"+i+"_hedge\"");
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
}