package fr.samlegamer.fabric;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MRCodeGenFabric
{
	public static void init(String location, List<String> mat, String classBlock)
	{
		File file = new File(location + "CodeGenFabric [Macaw's Roofs]" + ".json");
	
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write("public static final Block "+i+"_roof = new BaseRoof(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_attic_roof = new RoofGlass(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_top_roof = new RoofTopNew(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					
					buffer.write("public static final Block "+i+"_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.defaultBlockstate(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
				}
				
				buffer.newLine();

				for(String i : mat)
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
				
				buffer.newLine();
				buffer.newLine();
				buffer.newLine();
				buffer.write("//FOR CLIENT");
				buffer.newLine();
				buffer.write("BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),");
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write(""+classBlock+"."+i+"_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_attic_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_top_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_lower_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_steep_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_upper_lower_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_upper_steep_roof, ");
					buffer.newLine();
					
					buffer.write(""+classBlock+"."+i+"_planks_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_planks_attic_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_planks_top_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_planks_lower_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_planks_steep_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_planks_upper_lower_roof, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_planks_upper_steep_roof, ");
					buffer.newLine();
				}
				
				buffer.newLine();
				buffer.newLine();
				buffer.newLine();
				buffer.write("//FOR TABS");
				buffer.newLine();
				buffer.write("ItemGroupEvents.modifyEntriesEvent(MacawsFurniture.FURNITUREGROUP).register(content -> {");
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write("content.add("+classBlock+"."+i+"_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_attic_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_top_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_lower_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_steep_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_upper_lower_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_upper_steep_roof);");
					buffer.newLine();
					
					buffer.write("content.add("+classBlock+"."+i+"_planks_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_planks_attic_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_planks_top_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_planks_lower_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_planks_steep_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_planks_upper_lower_roof);");
					buffer.newLine();
					buffer.write("content.add("+classBlock+"."+i+"_planks_upper_steep_roof);");
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