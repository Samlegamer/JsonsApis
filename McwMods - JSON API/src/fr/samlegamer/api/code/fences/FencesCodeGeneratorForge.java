package fr.samlegamer.api.code.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class FencesCodeGeneratorForge implements IModFiles.IProgram.JavaForge
{
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
					buffer.write("public static final RegistryObject<Block> "+i+"_hedge = createBlock(\""+i+"_hedge\", () -> new FenceHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));");
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
	public void registerBlockStone(String Location, List<String> Material, boolean supNetherUpdate,
			boolean TrailsandTales) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InitRendersStone(String Location, List<String> Material, String classBlock) {
		// TODO Auto-generated method stub
		
	}
}