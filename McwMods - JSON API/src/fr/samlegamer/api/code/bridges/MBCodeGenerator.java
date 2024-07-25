package fr.samlegamer.api.code.bridges;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MBCodeGenerator
{
	public static class ItemBlockRenderTypes
	{
		public static void initWood(String Location, List<String> Material, String ClassMod)
		{
			File file = new File(Location + "RenderType (Macaw's Bridges)" + ".txt");

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
					System.out.println("Le fichier " + file + " Vient d' tre g n rer   l'emplacement : " + Location);
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
		public static void initWood(String Location, List<String> Material)
		{
			File file = new File(Location + "Registries (Macaw's Bridges)" + ".txt");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_log_bridge_middle = createBlock(\""+i+"_log_bridge_middle\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> rope_"+i+"_bridge = createBlock(\"rope_"+i+"_bridge\", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_bridge_pier = createBlock(\""+i+"_bridge_pier\", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_log_bridge_stair = createBlock(\""+i+"_log_bridge_stair\", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_rope_bridge_stair = createBlock(\""+i+"_rope_bridge_stair\", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
						buffer.write("public static final RegistryObject<Block> "+i+"_rail_bridge = createBlock(\""+i+"_rail_bridge\", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d' tre g n rer   l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}