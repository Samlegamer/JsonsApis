package fr.samlegamer.api.datagen.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MFCodeGenerator
{	
	public static void init(String location)
	{
		File folderCode = new File(location + "code/");
		File folderRenderType = new File(location + "code/RenderType/");
		File folderBlocks = new File(location + "code/Blocks/");

		if(!folderCode.exists() || !folderRenderType.exists() || !folderBlocks.exists())
		{
			folderCode.mkdir();
			folderRenderType.mkdir();
			folderBlocks.mkdir();
		}
	}
	
	public static class ItemBlockRenderTypes
	{
		public static void initAll(String Location, List<String> Material, String ClassMod)
		{
			File file = new File(Location + "/code/RenderType/" + "RenderTypeBridges" + ".java");

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
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class BlockRegistry
	{
		public static void initAll(String Location, List<String> Material)
		{
			File file = new File(Location + "/code/Blocks/" + "BlocksFences" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_picket_fence = createBlock(\""+i+"_picket_fence\", () -> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_stockade_fence = createBlock(\""+i+"_stockade_fence\", () -> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_horse_fence = createBlock(\""+i+"_horse_fence\", () -> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_wired_fence = createBlock(\""+i+"_wired_fence\", () -> new WiredFence(null));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_highley_gate = createBlock(\""+i+"_highley_gate\", () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_pyramid_gate = createBlock(\""+i+"_pyramid_gate\", () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}