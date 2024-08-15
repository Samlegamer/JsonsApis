package fr.samlegamer.api.code.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class FencesCodeGeneratorForge implements IModFiles.IProgram.JavaForge
{
	private List<String> LEAVES;

	public FencesCodeGeneratorForge(List<String> leaves)
	{
		this.LEAVES=leaves;
	}
	
	public FencesCodeGeneratorForge()
	{
		this(new ArrayList<String>());
	}
	
	public void InitRendersLog(String Location, List<String> Material, String ClassMod)
	{
		File file = new File(Location + "Render Type Blocks [Forge-Macaws-Fences].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : Material)
				{
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_picket_fence.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_stockade_fence.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_horse_fence.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_wired_fence.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_highley_gate.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_pyramid_gate.get(), RenderType.cutout());");
					buffer.newLine();
				}
				
				for(String i : LEAVES)
				{
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_hedge.get(), RenderType.cutout());");
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

	public void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales)
	{
		File file = new File(Location + "Registries Blocks  [Forge-Macaws-Fences].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				String nether = (supNetherUpdate ? "BlockBehaviour" : "AbstractBlock");
				String trails = (TrailsandTales ? "ofFullCopy" : "copy");
				buffer.write("private static final "+nether+".Properties WOOD = "+nether+".Properties."+trails+"(Blocks.OAK_PLANKS);");
				buffer.newLine();
				buffer.write("private static final "+nether+".Properties HEDGES = "+nether+".Properties."+trails+"(Blocks.OAK_LEAVES);");
				buffer.newLine();
				
				for(String i : Material)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_picket_fence = createBlock(\""+i+"_picket_fence\", () -> new FenceBlock(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_stockade_fence = createBlock(\""+i+"_stockade_fence\", () -> new FenceBlock(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_horse_fence = createBlock(\""+i+"_horse_fence\", () -> new FenceBlock(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_wired_fence = createBlock(\""+i+"_wired_fence\", () -> new WiredFence(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_highley_gate = createBlock(\""+i+"_highley_gate\", () -> new FenceGateBlock(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_pyramid_gate = createBlock(\""+i+"_pyramid_gate\", () -> new FenceGateBlock(WOOD));");
					buffer.newLine();
				}

				for(String i : LEAVES)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_hedge = createBlock(\""+i+"_hedge\", () -> new FenceHitbox(HEDGES));");
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
		File file = new File(Location + "Registries Blocks - Stone [Forge-Macaws-Fences].txt");

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
					buffer.write("public static final RegistryObject<Block> modern_"+i+"_wall = createBlock(\"modern_"+i+"_wall\", () -> new FenceBlock(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> railing_"+i+"_wall = createBlock(\"railing_"+i+"_wall\", () -> new FenceBlock(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_railing_gate = createBlock(\""+i+"_railing_gate\", () -> new FenceGateBlock(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_pillar_wall = createBlock(\""+i+"_pillar_wall\", () -> new FenceBlock(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_grass_topped_wall = createBlock(\""+i+"_grass_topped_wall\", () -> new FenceHitbox(STONE));");
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
	public void InitRendersStone(String Location, List<String> Material, String ClassMod)
	{
		File file = new File(Location + "Render Type Blocks - Stone [Forge-Macaws-Fences].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : Material)
				{
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+".modern_"+i+"_wall.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+".railing_"+i+"_wall.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_railing_gate.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_pillar_wall.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_grass_topped_wall.get(), RenderType.cutout());");
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
}