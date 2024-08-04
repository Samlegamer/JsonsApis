package fr.samlegamer.api.code.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class FurnituresCodeGeneratorForge implements IModFiles.IProgram.JavaForge
{
	public void registerBlockLog(String Location, List<String> Material, boolean supNetherUpdate, boolean TrailsandTales)
	{		
		File file = new File(Location + "Registries Blocks  [Forge-Macaws-Furnitures].txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				String nether = (supNetherUpdate ? "BlockBehaviour" : "AbstractBlock");
				String netherTool = (supNetherUpdate ? "" : ".harvestLevel(1).harvestTool(ToolType.AXE)");

				buffer.write("private static final "+nether+".Properties WOOD = "+nether+".Properties.of("+(TrailsandTales ? "" : "Material.WOOD")+")"+netherTool+".strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD);");
				buffer.newLine();
				
				for(String i : Material)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_wardrobe = createBlock(\""+i+"_wardrobe\", () -> new TallFurnitureHinge(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_modern_wardrobe = createBlock(\""+i+"_modern_wardrobe\", () -> new TallFurnitureHinge(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_double_wardrobe = createBlock(\""+i+"_double_wardrobe\", () -> new TallFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_bookshelf = createBlock(\""+i+"_bookshelf\", () -> new BookCabinet(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_bookshelf_cupboard = createBlock(\""+i+"_bookshelf_cupboard\", () -> new BookCabinetHinge(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_drawer = createBlock(\""+i+"_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_double_drawer = createBlock(\""+i+"_double_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_bookshelf_drawer = createBlock(\""+i+"_bookshelf_drawer\", () -> new BookDrawer(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_lower_bookshelf_drawer = createBlock(\""+i+"_lower_bookshelf_drawer\", () -> new BookDrawer(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_large_drawer = createBlock(\""+i+"_large_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_lower_triple_drawer = createBlock(\""+i+"_lower_triple_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_triple_drawer = createBlock(\""+i+"_triple_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_desk = createBlock(\""+i+"_desk\", () -> new Desk(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_covered_desk = createBlock(\""+i+"_covered_desk\", () -> new Desk(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_modern_desk = createBlock(\""+i+"_modern_desk\", () -> new Desk(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_table = createBlock(\""+i+"_table\", () -> new TableHitbox(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_end_table = createBlock(\""+i+"_end_table\", () -> new TableHitbox(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_coffee_table = createBlock(\""+i+"_coffee_table\", () -> new Table(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_glass_table = createBlock(\""+i+"_glass_table\", () -> new TableHitbox(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_chair = createBlock(\""+i+"_chair\", () -> new ClassicChair(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_modern_chair = createBlock(\""+i+"_modern_chair\", () -> new ModernChair(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_striped_chair = createBlock(\""+i+"_striped_chair\", () -> new StripedChair(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_stool_chair = createBlock(\""+i+"_stool_chair\", () -> new Chair(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_counter = createBlock(\""+i+"_counter\", () -> new Counter(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_drawer_counter = createBlock(\""+i+"_drawer_counter\", () -> new StorageCounter(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_double_drawer_counter = createBlock(\""+i+"_double_drawer_counter\", () -> new StorageCounter(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> "+i+"_cupboard_counter = createBlock(\""+i+"_cupboard_counter\", () -> new CupboardCounter(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_wardrobe = createBlock(\"stripped_"+i+"_wardrobe\", () -> new TallFurnitureHinge(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_modern_wardrobe = createBlock(\"stripped_"+i+"_modern_wardrobe\", () -> new TallFurnitureHinge(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_double_wardrobe = createBlock(\"stripped_"+i+"_double_wardrobe\", () -> new TallFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_bookshelf = createBlock(\"stripped_"+i+"_bookshelf\", () -> new BookCabinet(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_bookshelf_cupboard = createBlock(\"stripped_"+i+"_bookshelf_cupboard\", () -> new BookCabinetHinge(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_drawer = createBlock(\"stripped_"+i+"_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_double_drawer = createBlock(\"stripped_"+i+"_double_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_bookshelf_drawer = createBlock(\"stripped_"+i+"_bookshelf_drawer\", () -> new BookDrawer(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_lower_bookshelf_drawer = createBlock(\"stripped_"+i+"_lower_bookshelf_drawer\", () -> new BookDrawer(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_large_drawer = createBlock(\"stripped_"+i+"_large_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_lower_triple_drawer = createBlock(\"stripped_"+i+"_lower_triple_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_triple_drawer = createBlock(\"stripped_"+i+"_triple_drawer\", () -> new WideFurniture(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_desk = createBlock(\"stripped_"+i+"_desk\", () -> new Desk(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_covered_desk = createBlock(\"stripped_"+i+"_covered_desk\", () -> new Desk(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_modern_desk = createBlock(\"stripped_"+i+"_modern_desk\", () -> new Desk(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_table = createBlock(\"stripped_"+i+"_table\", () -> new TableHitbox(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_end_table = createBlock(\"stripped_"+i+"_end_table\", () -> new TableHitbox(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_coffee_table = createBlock(\"stripped_"+i+"_coffee_table\", () -> new Table(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_glass_table = createBlock(\"stripped_"+i+"_glass_table\", () -> new TableHitbox(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_chair = createBlock(\"stripped_"+i+"_chair\", () -> new ClassicChair(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_modern_chair = createBlock(\"stripped_"+i+"_modern_chair\", () -> new ModernChair(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_striped_chair = createBlock(\"stripped_"+i+"_striped_chair\", () -> new StripedChair(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_stool_chair = createBlock(\"stripped_"+i+"_stool_chair\", () -> new Chair(WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_counter = createBlock(\"stripped_"+i+"_counter\", () -> new Counter(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_drawer_counter = createBlock(\"stripped_"+i+"_drawer_counter\", () -> new StorageCounter(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_double_drawer_counter = createBlock(\"stripped_"+i+"_double_drawer_counter\", () -> new StorageCounter(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							
							+ "  public static final RegistryObject<Block> stripped_"+i+"_cupboard_counter = createBlock(\"stripped_"+i+"_cupboard_counter\", () -> new CupboardCounter(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							+ "  public static final RegistryObject<Block> "+i+"_kitchen_cabinet = createBlock(\""+i+"_kitchen_cabinet\", () -> new CabinetHinge(WOOD));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_double_kitchen_cabinet = createBlock(\""+i+"_double_kitchen_cabinet\", () -> new Cabinet(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_glass_kitchen_cabinet = createBlock(\""+i+"_glass_kitchen_cabinet\", () -> new Cabinet(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> stripped_"+i+"_kitchen_cabinet = createBlock(\"stripped_"+i+"_kitchen_cabinet\", () -> new CabinetHinge(WOOD));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> stripped_"+i+"_double_kitchen_cabinet = createBlock(\"stripped_"+i+"_double_kitchen_cabinet\", () -> new Cabinet(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> stripped_"+i+"_glass_kitchen_cabinet = createBlock(\"stripped_"+i+"_glass_kitchen_cabinet\", () -> new Cabinet(Blocks.OAK_LOG.defaultblockstate(), WOOD));\r\n"
							+ "  ");
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

	public void InitRendersLog(String Location, List<String> Material, String ClassMod)
	{		
		File file = new File(Location + "Render Type Blocks [Forge-Macaws-Furnitures].txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
								
				for(String i : Material)
				{
					buffer.write("RenderTypeLookup.setRenderLayer((Block)"+ClassMod+"."+i+"_glass_table.get(), RenderType.translucent());");
					buffer.newLine();
					buffer.write("RenderTypeLookup.setRenderLayer((Block)"+ClassMod+".stripped_"+i+"_glass_table.get(), RenderType.translucent());");
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