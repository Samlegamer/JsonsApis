package fr.samlegamer.api.code.roofs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class RoofsCodeGeneratorForge implements IModFiles.IProgram.JavaForge
{	
	public void InitRendersLog(String Location, List<String> Material, String ClassMod)
	{
		File file = new File(Location + "Render Type Blocks [Forge-Macaws-Roofs].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : Material)
				{
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_attic_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_lower_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_steep_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_top_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_upper_lower_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_upper_steep_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_attic_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_lower_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_steep_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_top_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_upper_lower_roof.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_upper_steep_roof.get(), RenderType.cutout());");
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
		File file = new File(Location + "Registries Blocks  [Forge-Macaws-Roofs].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("private static final "+(supNetherUpdate ? "BlockBehaviour" : "AbstractBlock")+".Properties ROOFS_WOOD_PROPERTIES = "+(supNetherUpdate ? "BlockBehaviour" : "AbstractBlock")+".Properties.of("+(TrailsandTales ? "" : "Material.WOOD")+").strength(0.5F, 2.5F).sound(SoundType.WOOD);\r\n");
				buffer.newLine();
				
				for(String i : Material)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_roof = createBlock(\""+i+"_roof\", () -> new StairsBlock(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_attic_roof = createBlock(\""+i+"_attic_roof\", () -> new RoofGlass(ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_top_roof = createBlock(\""+i+"_top_roof\", () -> new RoofTopNew(ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_lower_roof = createBlock(\""+i+"_lower_roof\", () -> new StairsBlock(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_steep_roof = createBlock(\""+i+"_steep_roof\", () -> new StairsBlock(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_upper_lower_roof = createBlock(\""+i+"_upper_lower_roof\", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_upper_steep_roof = createBlock(\""+i+"_upper_steep_roof\", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();

					buffer.write("public static final RegistryObject<Block> "+i+"_planks_roof = createBlock(\""+i+"_planks_roof\", () -> new StairsBlock(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_planks_attic_roof = createBlock(\""+i+"_planks_attic_roof\", () -> new RoofGlass(ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_planks_top_roof = createBlock(\""+i+"_planks_top_roof\", () -> new RoofTopNew(ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_planks_lower_roof = createBlock(\""+i+"_planks_lower_roof\", () -> new StairsBlock(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_planks_steep_roof = createBlock(\""+i+"_planks_steep_roof\", () -> new StairsBlock(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_planks_upper_lower_roof = createBlock(\""+i+"_planks_upper_lower_roof\", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
					buffer.newLine();
				
					buffer.write("public static final RegistryObject<Block> "+i+"_planks_upper_steep_roof = createBlock(\""+i+"_planks_upper_steep_roof\", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), ROOFS_WOOD_PROPERTIES));");
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