package fr.samlegamer.api.code.roofs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class RoofsCodeGeneratorFabric implements IModFiles.IProgram.JavaFabric
{
	@Override
	public void InitRendersLog(String location, List<String> Material, String ClassMod)
	{
		File file = new File(location + "Render Type Blocks [Fabric-Macaw's Roofs].txt");
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.newLine();
				buffer.write("//FOR CLIENT");
				buffer.newLine();
				buffer.write("BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write(""+ClassMod+"."+i+"_roof, ");
					buffer.write(""+ClassMod+"."+i+"_attic_roof, ");
					buffer.write(""+ClassMod+"."+i+"_top_roof, ");
					buffer.write(""+ClassMod+"."+i+"_lower_roof, ");
					buffer.write(""+ClassMod+"."+i+"_steep_roof, ");
					buffer.write(""+ClassMod+"."+i+"_upper_lower_roof, ");
					buffer.write(""+ClassMod+"."+i+"_upper_steep_roof, ");
					buffer.write(""+ClassMod+"."+i+"_planks_roof, ");
					buffer.write(""+ClassMod+"."+i+"_planks_attic_roof, ");
					buffer.write(""+ClassMod+"."+i+"_planks_top_roof, ");
					buffer.write(""+ClassMod+"."+i+"_planks_lower_roof, ");
					buffer.write(""+ClassMod+"."+i+"_planks_steep_roof, ");
					buffer.write(""+ClassMod+"."+i+"_planks_upper_lower_roof, ");
					buffer.write(""+ClassMod+"."+i+"_planks_upper_steep_roof, ");
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
	public void registerBlockLog(String location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales)
	{
		File file = new File(location + "Block Registies [Fabric-Macaw's Roofs].txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("private static final AbstractBlock.Settings WOOD_PROPERTIES = AbstractBlock.Settings."+(TrailsandTales ? "create" : "of")+"("+(TrailsandTales ? "" : "Material.WOOD")+").strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD)");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("public static final Block "+i+"_roof = new BaseRoof(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_attic_roof = new RoofGlass(WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_top_roof = new RoofTopNew(WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					
					buffer.write("public static final Block "+i+"_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.defaultBlockstate(), WOOD_PROPERTIES);\r\n");
					buffer.newLine();
				}
				
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("add(\""+i+"_roof\", "+i+"_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_attic_roof\", "+i+"_attic_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_top_roof\", "+i+"_top_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_lower_roof\", "+i+"_lower_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_steep_roof\", "+i+"_steep_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_upper_lower_roof\", "+i+"_upper_lower_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_upper_steep_roof\", "+i+"_upper_steep_roof);");
					buffer.newLine();

					buffer.write("add(\""+i+"_planks_roof\", "+i+"_planks_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_planks_attic_roof\", "+i+"_planks_attic_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_planks_top_roof\", "+i+"_planks_top_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_planks_lower_roof\", "+i+"_planks_lower_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_planks_steep_roof\", "+i+"_planks_steep_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_planks_upper_lower_roof\", "+i+"_planks_upper_lower_roof);");
					buffer.newLine();
					buffer.write("add(\""+i+"_planks_upper_steep_roof\", "+i+"_planks_upper_steep_roof);");
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
