package fr.samlegamer.api.code.bridges;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class BridgesCodeGeneratorForge implements IModFiles.IProgram.JavaForge
{
	public void InitRendersLog(String Location, List<String> Material, String ClassMod)
	{
		File file = new File(Location + "Render Type Blocks Wood [Forge-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : Material)
				{
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_log_bridge_middle.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_rope_bridge_stair.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+".rope_"+i+"_bridge.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_bridge_pier.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_log_bridge_stair.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_rail_bridge.get(), RenderType.cutout());");
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
		File file = new File(Location + "Block Registies Wood [Forge-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				
				String nether = (supNetherUpdate ? "BlockBehaviour" : "AbstractBlock");
				String netherTool = (supNetherUpdate ? "" : ".harvestTool(ToolType.AXE)");

				buffer.write("private static final "+nether+".Properties WOOD = "+nether+".Properties.of("+(TrailsandTales ? "" : "Material.WOOD")+")"+netherTool+".strength(0.5F, 2.5F).sounds(SoundType.WOOD);");
				buffer.newLine();
				buffer.write("private static final "+nether+".Properties RAILS = "+nether+".Properties.of("+(TrailsandTales ? "" : "Material.WOOD")+")"+netherTool+".strength(0.5F, 2.5F).noOcclusion().sounds(SoundType.WOOD);");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_log_bridge_middle = createBlock(\""+i+"_log_bridge_middle\", () -> new Log_Bridge(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> rope_"+i+"_bridge = createBlock(\"rope_"+i+"_bridge\", () -> new Bridge_Block_Rope(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_bridge_pier = createBlock(\""+i+"_bridge_pier\", () -> new Bridge_Support(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_log_bridge_stair = createBlock(\""+i+"_log_bridge_stair\", () -> new Bridge_Stairs(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_rope_bridge_stair = createBlock(\""+i+"_rope_bridge_stair\", () -> new Bridge_Stairs(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_rail_bridge = createBlock(\""+i+"_rail_bridge\", () -> new Rail_Bridge(RAILS));");
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
		File file = new File(Location + "Block Registies Stone [Forge-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				
				String nether = (supNetherUpdate ? "BlockBehaviour" : "AbstractBlock");
				String netherTool = (supNetherUpdate ? "" : ".harvestTool(ToolType.PICKAXE)");

				buffer.write("private static final "+nether+".Properties STONE = "+nether+".Properties.of("+(TrailsandTales ? "" : "Material.STONE")+")"+netherTool+".strength(3.0F, 5.0F).sounds(SoundType.STONE);");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_bridge = createBlock(\""+i+"_bridge\", () -> new Bridge_Block(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_bridge_pier = createBlock(\""+i+"_bridge_pier\", () -> new Bridge_Support(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_bridge_stair = createBlock(\""+i+"_bridge_stair\", () -> new Bridge_Stairs(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> balustrade_"+i+"_bridge = createBlock(\"balustrade_"+i+"_bridge\", () -> new Bridge_Block(STONE));");
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
	
	public void InitRendersStone(String Location, List<String> Material, String ClassMod)
	{
		File file = new File(Location + "Render Type Blocks Stone [Forge-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : Material)
				{
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_bridge.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_bridge_pier.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_bridge_stair.get(), RenderType.cutout());");
					buffer.newLine();
					buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+".balustrade_"+i+"_bridge.get(), RenderType.cutout());");
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

	public void registerBlockLogIsCharged(String Location, List<String> Material, String ModidOfBaseMod, boolean supNetherUpdate, boolean TrailsandTales)
	{
		File file = new File(Location + "Block Registies Wood [Forge-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				
				String nether = (supNetherUpdate ? "BlockBehaviour" : "AbstractBlock");
				String netherTool = (supNetherUpdate ? "" : ".harvestTool(ToolType.AXE)");

				buffer.write("private static final "+nether+".Properties WOOD = "+nether+".Properties.of("+(TrailsandTales ? "" : "Material.WOOD")+")"+netherTool+".strength(0.5F, 2.5F).sounds(SoundType.WOOD);");
				buffer.newLine();
				buffer.write("private static final "+nether+".Properties RAILS = "+nether+".Properties.of("+(TrailsandTales ? "" : "Material.WOOD")+")"+netherTool+".strength(0.5F, 2.5F).noOcclusion().sounds(SoundType.WOOD);");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_log_bridge_middle = createBlock(\""+ModidOfBaseMod+"\", \""+i+"_log_bridge_middle\", () -> new Log_Bridge(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> rope_"+i+"_bridge = createBlock(\""+ModidOfBaseMod+"\", \"rope_"+i+"_bridge\", () -> new Bridge_Block_Rope(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_bridge_pier = createBlock(\""+ModidOfBaseMod+"\", \""+i+"_bridge_pier\", () -> new Bridge_Support(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_log_bridge_stair = createBlock(\""+ModidOfBaseMod+"\", \""+i+"_log_bridge_stair\", () -> new Bridge_Stairs(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_rope_bridge_stair = createBlock(\""+ModidOfBaseMod+"\", \""+i+"_rope_bridge_stair\", () -> new Bridge_Stairs(WOOD));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_rail_bridge = createBlock(\""+ModidOfBaseMod+"\", \""+i+"_rail_bridge\", () -> new Rail_Bridge(RAILS));");
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
	
	public void registerBlockStoneIsCharged(String Location, List<String> Material, String ModidOfBaseMod, boolean supNetherUpdate, boolean TrailsandTales)
	{
		File file = new File(Location + "Block Registies Stone [Forge-Macaw's Bridges].txt");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				
				String nether = (supNetherUpdate ? "BlockBehaviour" : "AbstractBlock");
				String netherTool = (supNetherUpdate ? "" : ".harvestTool(ToolType.PICKAXE)");

				buffer.write("private static final "+nether+".Properties STONE = "+nether+".Properties.of("+(TrailsandTales ? "" : "Material.STONE")+")"+netherTool+".strength(3.0F, 5.0F).sounds(SoundType.STONE);");
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_bridge = createBlock(\""+ModidOfBaseMod+"\", \""+i+"_bridge\", () -> new Bridge_Block(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_bridge_pier = createBlock(\""+ModidOfBaseMod+"\", \""+i+"_bridge_pier\", () -> new Bridge_Support(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> "+i+"_bridge_stair = createBlock(\""+ModidOfBaseMod+"\", \""+i+"_bridge_stair\", () -> new Bridge_Stairs(STONE));");
					buffer.newLine();
					buffer.write("public static final RegistryObject<Block> balustrade_"+i+"_bridge = createBlock(\""+ModidOfBaseMod+"\", \"balustrade_"+i+"_bridge\", () -> new Bridge_Block(STONE));");
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