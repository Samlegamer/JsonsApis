package fr.samlegamer.fabric;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MFCodeGenFabric
{
	public static void init(String location, String Modid, List<String> mat, String classBlock)
	{
		File file = new File(location + "CodeGenFabric [Macaw's Fences]" + ".json");
	
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write("public static final Block "+i+"_picket_fence = new FenceBlock(AbstractBlock.Settings.of(Material.WOOD).strength(1.5F, 2.5F).sound(BlockSoundGroup.WOOD));\r\n");
					buffer.write("public static final Block "+i+"_stockade_fence = new FenceBlock(AbstractBlock.Settings.of(Material.WOOD).strength(1.5F, 2.5F).sound(BlockSoundGroup.WOOD));\r\n");
					buffer.write("public static final Block "+i+"_horse_fence = new FenceBlock(AbstractBlock.Settings.of(Material.WOOD).strength(1.5F, 2.5F).sound(BlockSoundGroup.WOOD));\r\n");
					buffer.write("public static final Block "+i+"_wired_fence = new WiredFence(AbstractBlock.Settings.of(Material.WOOD).strength(1.5F, 2.5F).sound(BlockSoundGroup.WOOD));\r\n");
					buffer.write("public static final Block "+i+"_highley_gate = new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(1.5F, 2.5F).sound(BlockSoundGroup.WOOD));\r\n");
					buffer.write("public static final Block "+i+"_pyramid_gate = new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(1.5F, 2.5F).sound(BlockSoundGroup.WOOD));\r\n");
					buffer.write("public static final Block "+i+"_hedge = new FenceHitbox(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(1.5F, 2.5F).sound(BlockSoundGroup.WOOD));\r\n");
				}
				
				buffer.newLine();//Blocks.OAK_LEAVES hedge

				for(String i : mat)
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
				
				buffer.newLine();
				buffer.newLine();
				buffer.newLine();
				buffer.write("//FOR CLIENT");
				buffer.newLine();
				buffer.write("BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),");
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write(""+classBlock+"."+i+"_picket_fence, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_stockade_fence, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_horse_fence, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_wired_fence, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_highley_gate, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_pyramid_gate, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_hedge, ");
					buffer.newLine();
				}
				
				buffer.newLine();
				buffer.newLine();
				buffer.newLine();
				buffer.write("//FOR TABS");
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write("					content.add("+classBlock+"."+i+"_picket_fence);");
					buffer.newLine();
					buffer.write("					content.add("+classBlock+"."+i+"_stockade_fence);");
					buffer.newLine();
					buffer.write("					content.add("+classBlock+"."+i+"_horse_fence);");
					buffer.newLine();
					buffer.write("					content.add("+classBlock+"."+i+"_wired_fence);");
					buffer.newLine();
					buffer.write("					content.add("+classBlock+"."+i+"_highley_gate);");
					buffer.newLine();
					buffer.write("					content.add("+classBlock+"."+i+"_pyramid_gate);");
					buffer.newLine();
					buffer.write("					content.add("+classBlock+"."+i+"_hedge);");
					buffer.newLine();
				}
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}