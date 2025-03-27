package fr.samlegamer.api.code.bridges;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class BridgesCodeGeneratorFabric implements IModFiles.IProgram.JavaFabric
{
	public void InitRendersLog(String Location, List<String> Material, String classBlock)
	{
		File file = new File(Location + "Render Type Blocks [Fabric-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("//FOR CLIENT");
				buffer.newLine();
				buffer.write("BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write(""+classBlock+"."+i+"_log_bridge_middle, ");
					buffer.newLine();
					buffer.write(""+classBlock+".rope_"+i+"_bridge, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_bridge_pier, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_log_bridge_stair, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_rope_bridge_stair, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_rail_bridge, ");
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
		File file = new File(Location + "Block Registies [Fabric-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				
				String netherTool = (supNetherUpdate ? "" : ".harvestTool(ToolType.AXE)");
				String ofOrCreate = (TrailsandTales ? "create" : "of");
				
				buffer.write("private static final AbstractBlock.Settings WOOD = AbstractBlock.Settings."+ofOrCreate+"("+(TrailsandTales ? "" : "Material.WOOD")+")"+netherTool+".strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD);");
				buffer.newLine();
				buffer.write("private static final AbstractBlock.Settings RAILS = AbstractBlock.Settings."+ofOrCreate+"("+(TrailsandTales ? "" : "Material.WOOD")+")"+netherTool+".strength(0.5F, 2.5F).noOcclusion().sounds(BlockSoundGroup.WOOD);");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("public static final Block "+i+"_log_bridge_middle = new Log_Bridge(WOOD);\r\n");
					buffer.write("public static final Block rope_"+i+"_bridge = new Bridge_Block_Rope(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_bridge_pier = new Bridge_Support(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_log_bridge_stair = new Bridge_Stairs(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_rope_bridge_stair = new Bridge_Stairs(WOOD);\r\n");
					buffer.write("public static final Block "+i+"_rail_bridge = new Rail_Bridge(RAILS);\r\n");
				}
				
				buffer.newLine();
				buffer.newLine();
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("add(\""+i+"_log_bridge_middle\", "+i+"_log_bridge_middle);");
					buffer.newLine();
					buffer.write("add(\"rope_"+i+"_bridge\", rope_"+i+"_bridge);");
					buffer.newLine();
					buffer.write("add(\""+i+"_bridge_pier\", "+i+"_bridge_pier);");
					buffer.newLine();
					buffer.write("add(\""+i+"_log_bridge_stair\", "+i+"_log_bridge_stair);");
					buffer.newLine();
					buffer.write("add(\""+i+"_rope_bridge_stair\", "+i+"_rope_bridge_stair);");
					buffer.newLine();
					buffer.write("add(\""+i+"_rail_bridge\", "+i+"_rail_bridge);");
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
	
	public void registerBlockStone(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales)
	{
		File file = new File(Location + "Block Registies Stone [Fabric-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				
				String netherTool = (supNetherUpdate ? "" : ".harvestTool(ToolType.PICKAXE)");
				String ofOrCreate = (TrailsandTales ? "create" : "of");
				
				buffer.write("private static final AbstractBlock.Settings STONE = AbstractBlock.Settings."+ofOrCreate+"("+(TrailsandTales ? "" : "Material.STONE")+")"+netherTool+".strength(3.0F, 5.0F).sounds(BlockSoundGroup.STONE);");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("public static final Block "+i+"_bridge = new Bridge_Block(STONE);\r\n");
					buffer.write("public static final Block "+i+"_bridge_pier = new Bridge_Support(STONE);\r\n");
					buffer.write("public static final Block "+i+"_bridge_stair = new Bridge_Stairs(STONE);\r\n");
					buffer.write("public static final Block balustrade_"+i+"_bridge = new Bridge_Block(STONE);\r\n");
				}
				
				buffer.newLine();
				buffer.newLine();
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("add(\""+i+"_bridge\", "+i+"_bridge);");
					buffer.newLine();
					buffer.write("add(\""+i+"_bridge_pier\", "+i+"_bridge_pier);");
					buffer.newLine();
					buffer.write("add(\""+i+"_bridge_stair\", "+i+"_bridge_stair);");
					buffer.newLine();
					buffer.write("add(\"balustrade_"+i+"_bridge\", balustrade_"+i+"_bridge);");
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
	
	public void InitRendersStone(String Location, List<String> Material, String classBlock)
	{
		File file = new File(Location + "Render Type Blocks Stone [Fabric-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("//FOR CLIENT");
				buffer.newLine();
				buffer.write("BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write(""+classBlock+"."+i+"_bridge, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_bridge_pier, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_bridge_stair, ");
					buffer.newLine();
					buffer.write(""+classBlock+".balustrade_"+i+"_bridge, ");
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