package fr.samlegamer.api.code.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MFurniCodeGenerator
{
	public static void BlockRegistry(String LOCATION, String Modid, List<String> Mat)
	{		
		File file = new File(LOCATION + "BlockRegistry - CodeGen(Macaw's Furnitures).json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
								
				for(String i : Mat)
				{
					buffer.write("public static final RegistryObject<Block> "+i+"_wardrobe = BLOCKS.register(\""+i+"_wardrobe\", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_modern_wardrobe = BLOCKS.register(\""+i+"_modern_wardrobe\", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_double_wardrobe = BLOCKS.register(\""+i+"_double_wardrobe\", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_bookshelf = BLOCKS.register(\""+i+"_bookshelf\", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_bookshelf_cupboard = BLOCKS.register(\""+i+"_bookshelf_cupboard\", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_drawer = BLOCKS.register(\""+i+"_drawer\", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_double_drawer = BLOCKS.register(\""+i+"_double_drawer\", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_bookshelf_drawer = BLOCKS.register(\""+i+"_bookshelf_drawer\", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_lower_bookshelf_drawer = BLOCKS.register(\""+i+"_lower_bookshelf_drawer\", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_large_drawer = BLOCKS.register(\""+i+"_large_drawer\", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_lower_triple_drawer = BLOCKS.register(\""+i+"_lower_triple_drawer\", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_triple_drawer = BLOCKS.register(\""+i+"_triple_drawer\", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_desk = BLOCKS.register(\""+i+"_desk\", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_covered_desk = BLOCKS.register(\""+i+"_covered_desk\", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_modern_desk = BLOCKS.register(\""+i+"_modern_desk\", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_table = BLOCKS.register(\""+i+"_table\", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_end_table = BLOCKS.register(\""+i+"_end_table\", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_coffee_table = BLOCKS.register(\""+i+"_coffee_table\", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_glass_table = BLOCKS.register(\""+i+"_glass_table\", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_chair = BLOCKS.register(\""+i+"_chair\", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_modern_chair = BLOCKS.register(\""+i+"_modern_chair\", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_striped_chair = BLOCKS.register(\""+i+"_striped_chair\", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_stool_chair = BLOCKS.register(\""+i+"_stool_chair\", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_counter = BLOCKS.register(\""+i+"_counter\", () -> new Counter(Blocks.OAK_LOG.defaultblockstate(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_drawer_counter = BLOCKS.register(\""+i+"_drawer_counter\", () -> new StorageCounter(Blocks.OAK_LOG.defaultblockstate(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_double_drawer_counter = BLOCKS.register(\""+i+"_double_drawer_counter\", () -> new StorageCounter(Blocks.OAK_LOG.defaultblockstate(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  \r\n"
							+ "  public static final RegistryObject<Block> "+i+"_cupboard_counter = BLOCKS.register(\""+i+"_cupboard_counter\", () -> new StorageCounter(Blocks.OAK_LOG.defaultblockstate(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));\r\n"
							+ "  ");
					buffer.newLine();
					
				}
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}

	public static void RenderRegistry(String LOCATION, String Modid, List<String> Mat)
	{		
		File file = new File(LOCATION + "RenderRegistry - CodeGen(Macaw's Furnitures).json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
								
				for(String i : Mat)
				{
					buffer.write("RenderTypeLookup.setRenderLayer((Block)BlockInit."+i+"_glass_table.get(), RenderType.translucent());");
					buffer.newLine();
					
				}
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}

}