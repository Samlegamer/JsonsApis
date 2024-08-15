package fr.samlegamer.api.code.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class FencesCodeGeneratorFabric implements IModFiles.IProgram.JavaFabric
{
	private List<String> LEAVES;

	public FencesCodeGeneratorFabric(List<String> leaves)
	{
		this.LEAVES=leaves;
	}
	
	public FencesCodeGeneratorFabric()
	{
		this(new ArrayList<String>());
	}
	
	public void InitRendersLog(String Location, List<String> MAT_WOOD, String ClassMod)
	{
		File file = new File(Location + "Render Type Blocks [Fabric-Macaws-Fences].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),");
				buffer.newLine();

				for(String i : MAT_WOOD)
				{
					if(!i.equals(MAT_WOOD.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write(""+ClassMod+"."+i+"_picket_fence, ");
					buffer.newLine();
					buffer.write(""+ClassMod+"."+i+"_stockade_fence, ");
					buffer.newLine();
					buffer.write(""+ClassMod+"."+i+"_horse_fence, ");
					buffer.newLine();
					buffer.write(""+ClassMod+"."+i+"_wired_fence, ");
					buffer.newLine();
					buffer.write(""+ClassMod+"."+i+"_highley_gate, ");
					buffer.newLine();
					buffer.write(""+ClassMod+"."+i+"_pyramid_gate ");
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
					buffer.write(""+ClassMod+"."+i+"_hedge ");
				}
				buffer.write(");");
				
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

	public void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales)
	{
		File file = new File(Location + "Registries Blocks  [Fabric-Macaws-Fences].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				String ofOrCreate = (TrailsandTales ? "create" : "of");
				buffer.write("private static final AbstractBlock.Settings WOOD = AbstractBlock.Properties."+ofOrCreate+"(Blocks.OAK_PLANKS);");
				buffer.newLine();
				buffer.write("private static final AbstractBlock.Settings HEDGES = AbstractBlock.Properties."+ofOrCreate+"(Blocks.OAK_LEAVES);");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("public static final Block "+i+"_picket_fence = new FenceBlock(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_stockade_fence = new FenceBlock(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_horse_fence = new FenceBlock(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_wired_fence = new WiredFence(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_highley_gate = new FenceGateBlock(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_pyramid_gate = new FenceGateBlock(WOOD);\r\n");
				}
				
				for(String i : LEAVES)
				{
					buffer.write("public static final Block "+i+"_hedge = new FenceHitbox(HEDGES);\r\n");
				}
				
				buffer.newLine();
				buffer.write("//FOR REGISTRIES");

				for(String i : Material)
				{
					buffer.write("add(\""+i+"_picket_fence\", "+i+"_picket_fence);");
					buffer.newLine();
					buffer.write("add(\""+i+"_stockade_fence\", "+i+"_stockade_fence);");
					buffer.newLine();
					buffer.write("add(\""+i+"_horse_fence\", "+i+"_horse_fence);");
					buffer.newLine();
					buffer.write("add(\""+i+"_wired_fence\", "+i+"_wired_fence);");
					buffer.newLine();
					buffer.write("add(\""+i+"_highley_gate\", "+i+"_highley_gate);");
					buffer.newLine();
					buffer.write("add(\""+i+"_pyramid_gate\", "+i+"_pyramid_gate);");
					buffer.newLine();
					buffer.write("add(\""+i+"_hedge\", "+i+"_hedge);");
					buffer.newLine();
				}
				
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
	public void registerBlockStone(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales)
	{
		File file = new File(Location + "Registries Blocks - Stone [Fabric-Macaws-Fences].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				String nether = (supNetherUpdate ? "BlockBehaviour" : "AbstractBlock");
				String trails = (TrailsandTales ? "ofFullCopy" : "copy");
				buffer.write("private static final "+nether+".Properties STONE = "+nether+".Properties."+trails+"(Blocks.SANDSTONE);");
				buffer.newLine();
				
				for(String i : Material)
				{
					buffer.write("public static final Block modern_"+i+"_wall = new FenceBlock(STONE);");
					buffer.newLine();
					buffer.write("public static final Block railing_"+i+"_wall = new FenceBlock(STONE);");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_railing_gate = new FenceGateBlock(STONE);");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_pillar_wall = new FenceBlock(STONE);");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_grass_topped_wall = new FenceHitbox(STONE);");
					buffer.newLine();
				}
				
				for(String i : Material)
				{
					buffer.write("add(\"modern_"+i+"_wall\", modern_"+i+"_wall);");
					buffer.newLine();
					buffer.write("add(\"railing_"+i+"_wall\", railing_"+i+"_wall);");
					buffer.newLine();
					buffer.write("add(\""+i+"_railing_gate\", "+i+"_railing_gate);");
					buffer.newLine();
					buffer.write("add(\""+i+"_pillar_wall\", "+i+"_pillar_wall);");
					buffer.newLine();
					buffer.write("add(\""+i+"_grass_topped_wall\", "+i+"_grass_topped_wall);");
					buffer.newLine();
				}

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
	public void InitRendersStone(String Location, List<String> MAT_ROCK, String ClassMod)
	{
		File file = new File(Location + "Render Type Blocks - Stone [Fabric-Macaws-Fences].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),");
				buffer.newLine();

				for(String i : MAT_ROCK)
				{
					if(!i.equals(MAT_ROCK.get(0)))
					{
						buffer.write(",");
						buffer.newLine();
					}
					buffer.write(""+ClassMod+".modern_"+i+"_wall, ");
					buffer.newLine();
					buffer.write(""+ClassMod+".railing_"+i+"_wall, ");
					buffer.newLine();
					buffer.write(""+ClassMod+"."+i+"_railing_gate, ");
					buffer.newLine();
					buffer.write(""+ClassMod+"."+i+"_pillar_wall, ");
					buffer.newLine();
					buffer.write(""+ClassMod+"."+i+"_grass_topped_wall ");
				}
				buffer.write(");");
				
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