package fr.samlegamer.api.code.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class FurnituresCodeGeneratorFabric implements IModFiles.IProgram.JavaFabric
{
	@Override
	public void InitRendersLog(String location, List<String> Material, String ClassMod)
	{
		File file = new File(location + "Render Type Blocks [Fabric-Macaw's Furnitures].txt");
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
					buffer.write(""+ClassMod+"."+i+"_glass_table, ");
					buffer.write(""+ClassMod+".stripped_"+i+"_glass_table, ");
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
		File file = new File(location + "Block Registies [Fabric-Macaw's Furnitures].txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.newLine();
				String nether = (supNetherUpdate ? "AbstractBlock" : "AbstractBlock");
				String netherTool = (supNetherUpdate ? "" : ".harvestLevel(1).harvestTool(ToolType.AXE)");
				buffer.write("private static final "+nether+".Settings WOOD = "+nether+".Settings.create("+(TrailsandTales ? "" : "Material.WOOD")+")"+netherTool+".strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD);");
				buffer.newLine();

				for(String i : Material)
				{
						buffer.write("public static final Block "+i+"_wardrobe = new TallFurnitureHinge(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_modern_wardrobe = new TallFurnitureHinge(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_double_wardrobe = new TallFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_bookshelf = new TallFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_bookshelf_cupboard = new TallFurnitureHinge(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_double_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_bookshelf_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_lower_bookshelf_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_large_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_lower_triple_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_triple_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_desk = new Desk(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_covered_desk = new Desk(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_modern_desk = new Desk(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_table = new TableHitbox(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_end_table = new TableHitbox(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_coffee_table = new Table(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_glass_table = new TableHitbox(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_chair = new StripedChair(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_modern_chair = new ModernChair(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_striped_chair = new StripedChair(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_stool_chair = new Chair(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_counter = new Counter(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_drawer_counter = new StorageCounter(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_double_drawer_counter = new StorageCounter(WOOD);\r\n"
								
								+ "  public static final Block "+i+"_cupboard_counter = new CupboardCounter(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_wardrobe = new TallFurnitureHinge(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_modern_wardrobe = new TallFurnitureHinge(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_double_wardrobe = new TallFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_bookshelf = new TallFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_bookshelf_cupboard = new TallFurnitureHinge(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_double_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_bookshelf_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_lower_bookshelf_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_large_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_lower_triple_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_triple_drawer = new WideFurniture(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_desk = new Desk(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_covered_desk = new Desk(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_modern_desk = new Desk(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_table = new TableHitbox(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_end_table = new TableHitbox(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_coffee_table = new Table(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_glass_table = new TableHitbox(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_chair = new StripedChair(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_modern_chair = new ModernChair(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_striped_chair = new StripedChair(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_stool_chair = new Chair(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_counter = new Counter(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_drawer_counter = new StorageCounter(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_double_drawer_counter = new StorageCounter(WOOD);\r\n"
								
								+ "  public static final Block stripped_"+i+"_cupboard_counter = new CupboardCounter(WOOD);\r\n"
								+ "  public static final Block "+i+"_kitchen_cabinet = new CabinetHinge(WOOD);\r\n"
								+ "  public static final Block "+i+"_double_kitchen_cabinet = new Cabinet(WOOD);\r\n"
								+ "  public static final Block "+i+"_glass_kitchen_cabinet = new Cabinet(WOOD);\r\n"
								+ "  public static final Block stripped_"+i+"_kitchen_cabinet = new CabinetHinge(WOOD);\r\n"
								+ "  public static final Block stripped_"+i+"_double_kitchen_cabinet = new Cabinet(WOOD);\r\n"
								+ "  public static final Block stripped_"+i+"_glass_kitchen_cabinet = new Cabinet(WOOD);\r\n"
								+ "  "
								+ "");
						buffer.newLine();
				}
				
				buffer.newLine();

				for(String i : Material)
				{
					buffer.write("add(\""+i+"_wardrobe\", "+i+"_wardrobe);");
					buffer.newLine();
					buffer.write("add(\""+i+"_modern_wardrobe\", "+i+"_modern_wardrobe);");
					buffer.newLine();
					buffer.write("add(\""+i+"_double_wardrobe\", "+i+"_double_wardrobe);");
					buffer.newLine();
					buffer.write("add(\""+i+"_bookshelf\", "+i+"_bookshelf);");
					buffer.newLine();
					buffer.write("add(\""+i+"_bookshelf_cupboard\", "+i+"_bookshelf_cupboard);");
					buffer.newLine();
					buffer.write("add(\""+i+"_drawer\", "+i+"_drawer);");
					buffer.newLine();
					buffer.write("add(\""+i+"_double_drawer\", "+i+"_double_drawer);");
					buffer.newLine();
					buffer.write("add(\""+i+"_bookshelf_drawer\", "+i+"_bookshelf_drawer);");
					buffer.newLine();
					buffer.write("add(\""+i+"_lower_bookshelf_drawer\", "+i+"_lower_bookshelf_drawer);");
					buffer.newLine();
					buffer.write("add(\""+i+"_large_drawer\", "+i+"_large_drawer);");
					buffer.newLine();
					buffer.write("add(\""+i+"_lower_triple_drawer\", "+i+"_lower_triple_drawer);");
					buffer.newLine();
					buffer.write("add(\""+i+"_triple_drawer\", "+i+"_triple_drawer);");
					buffer.newLine();
					buffer.write("add(\""+i+"_desk\", "+i+"_desk);");
					buffer.newLine();
					buffer.write("add(\""+i+"_covered_desk\", "+i+"_covered_desk);");
					buffer.newLine();
					buffer.write("add(\""+i+"_modern_desk\", "+i+"_modern_desk);");
					buffer.newLine();
					buffer.write("add(\""+i+"_table\", "+i+"_table);");
					buffer.newLine();
					buffer.write("add(\""+i+"_end_table\", "+i+"_end_table);");
					buffer.newLine();
					buffer.write("add(\""+i+"_coffee_table\", "+i+"_coffee_table);");
					buffer.newLine();
					buffer.write("add(\""+i+"_glass_table\", "+i+"_glass_table);");
					buffer.newLine();
					buffer.write("add(\""+i+"_chair\", "+i+"_chair);");
					buffer.newLine();
					buffer.write("add(\""+i+"_modern_chair\", "+i+"_modern_chair);");
					buffer.newLine();
					buffer.write("add(\""+i+"_striped_chair\", "+i+"_striped_chair);");
					buffer.newLine();
					buffer.write("add(\""+i+"_stool_chair\", "+i+"_stool_chair);");
					buffer.newLine();
					buffer.write("add(\""+i+"_counter\", "+i+"_counter);");
					buffer.newLine();
					buffer.write("add(\""+i+"_drawer_counter\", "+i+"_drawer_counter);");
					buffer.newLine();
					buffer.write("add(\""+i+"_double_drawer_counter\", "+i+"_double_drawer_counter);");
					buffer.newLine();
					buffer.write("add(\""+i+"_cupboard_counter\", "+i+"_cupboard_counter);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_wardrobe\", stripped_"+i+"_wardrobe);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_modern_wardrobe\", stripped_"+i+"_modern_wardrobe);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_double_wardrobe\", stripped_"+i+"_double_wardrobe);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_bookshelf\", stripped_"+i+"_bookshelf);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_bookshelf_cupboard\", stripped_"+i+"_bookshelf_cupboard);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_drawer\", stripped_"+i+"_drawer);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_double_drawer\", stripped_"+i+"_double_drawer);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_bookshelf_drawer\", stripped_"+i+"_bookshelf_drawer);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_lower_bookshelf_drawer\", stripped_"+i+"_lower_bookshelf_drawer);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_large_drawer\", stripped_"+i+"_large_drawer);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_lower_triple_drawer\", stripped_"+i+"_lower_triple_drawer);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_triple_drawer\", stripped_"+i+"_triple_drawer);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_desk\", stripped_"+i+"_desk);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_covered_desk\", stripped_"+i+"_covered_desk);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_modern_desk\", stripped_"+i+"_modern_desk);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_table\", stripped_"+i+"_table);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_end_table\", stripped_"+i+"_end_table);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_coffee_table\", stripped_"+i+"_coffee_table);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_glass_table\", stripped_"+i+"_glass_table);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_chair\", stripped_"+i+"_chair);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_modern_chair\", stripped_"+i+"_modern_chair);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_striped_chair\", stripped_"+i+"_striped_chair);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_stool_chair\", stripped_"+i+"_stool_chair);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_counter\", stripped_"+i+"_counter);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_drawer_counter\", stripped_"+i+"_drawer_counter);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_double_drawer_counter\", stripped_"+i+"_double_drawer_counter);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_cupboard_counter\", stripped_"+i+"_cupboard_counter);");
					buffer.newLine();
					buffer.write("add(\""+i+"_kitchen_cabinet\", "+i+"_kitchen_cabinet);");
					buffer.newLine();
					buffer.write("add(\""+i+"_double_kitchen_cabinet\", "+i+"_double_kitchen_cabinet);");
					buffer.newLine();
					buffer.write("add(\""+i+"_glass_kitchen_cabinet\", "+i+"_glass_kitchen_cabinet);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_kitchen_cabinet\", stripped_"+i+"_kitchen_cabinet);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_double_kitchen_cabinet\", stripped_"+i+"_double_kitchen_cabinet);");
					buffer.newLine();
					buffer.write("add(\"stripped_"+i+"_glass_kitchen_cabinet\", stripped_"+i+"_glass_kitchen_cabinet);");
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
