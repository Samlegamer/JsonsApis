package fr.samlegamer.fabric;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Deprecated
public class MFurnituresCodeGenFabric
{
	@Deprecated
	public static void init(String location, List<String> mat, String classBlock)
	{
		File file = new File(location + "CodeGenFabric [Macaw's Furnitures]" + ".json");
	
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write("	public static final Block "+i+"_wardrobe = new TallFurnitureHinge(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_modern_wardrobe = new TallFurnitureHinge(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_double_wardrobe = new TallFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_bookshelf = new TallFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_bookshelf_cupboard = new TallFurnitureHinge(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_drawer = new WideFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_double_drawer = new WideFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_bookshelf_drawer = new WideFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_lower_bookshelf_drawer = new WideFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_large_drawer = new WideFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_lower_triple_drawer = new WideFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_triple_drawer = new WideFurniture(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_desk = new Desk(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_covered_desk = new Desk(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_modern_desk = new Desk(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_table = new TableHitbox(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_end_table = new TableHitbox(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_coffee_table = new Table(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_glass_table = new TableHitbox(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_chair = new StripedChair(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_modern_chair = new ModernChair(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_striped_chair = new StripedChair(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_stool_chair = new Chair(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_counter = new Counter(Blocks.OAK_LOG.getDefaultState(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_drawer_counter = new StorageCounter(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_double_drawer_counter = new StorageCounter(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "	public static final Block "+i+"_cupboard_counter = new StorageCounter(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 2.3F));\r\n"
							+ "");
				}
				
				buffer.newLine();//nonOpaque BlockSoundGroup

				for(String i : mat)
				{
					buffer.write("		add(\""+i+"_wardrobe\", "+i+"_wardrobe);\r\n"
							+ "		add(\""+i+"_modern_wardrobe\", "+i+"_modern_wardrobe);\r\n"
							+ "		add(\""+i+"_double_wardrobe\", "+i+"_double_wardrobe);\r\n"
							+ "		add(\""+i+"_bookshelf\", "+i+"_bookshelf);\r\n"
							+ "		add(\""+i+"_bookshelf_cupboard\", "+i+"_bookshelf_cupboard);\r\n"
							+ "		add(\""+i+"_drawer\", "+i+"_drawer);\r\n"
							+ "		add(\""+i+"_double_drawer\", "+i+"_double_drawer);\r\n"
							+ "		add(\""+i+"_bookshelf_drawer\", "+i+"_bookshelf_drawer);\r\n"
							+ "		add(\""+i+"_lower_bookshelf_drawer\", "+i+"_lower_bookshelf_drawer);\r\n"
							+ "		add(\""+i+"_large_drawer\", "+i+"_large_drawer);\r\n"
							+ "		add(\""+i+"_lower_triple_drawer\", "+i+"_lower_triple_drawer);\r\n"
							+ "		add(\""+i+"_triple_drawer\", "+i+"_triple_drawer);\r\n"
							+ "		add(\""+i+"_desk\", "+i+"_desk);\r\n"
							+ "		add(\""+i+"_covered_desk\", "+i+"_covered_desk);\r\n"
							+ "		add(\""+i+"_modern_desk\", "+i+"_modern_desk);\r\n"
							+ "		add(\""+i+"_table\", "+i+"_table);\r\n"
							+ "		add(\""+i+"_end_table\", "+i+"_end_table);\r\n"
							+ "		add(\""+i+"_coffee_table\", "+i+"_coffee_table);\r\n"
							+ "		add(\""+i+"_glass_table\", "+i+"_glass_table);\r\n"
							+ "		add(\""+i+"_chair\", "+i+"_chair);\r\n"
							+ "		add(\""+i+"_modern_chair\", "+i+"_modern_chair);\r\n"
							+ "		add(\""+i+"_striped_chair\", "+i+"_striped_chair);\r\n"
							+ "		add(\""+i+"_stool_chair\", "+i+"_stool_chair);\r\n"
							+ "		add(\""+i+"_counter\", "+i+"_counter);\r\n"
							+ "		add(\""+i+"_drawer_counter\", "+i+"_drawer_counter);\r\n"
							+ "		add(\""+i+"_double_drawer_counter\", "+i+"_double_drawer_counter);\r\n"
							+ "		add(\""+i+"_cupboard_counter\", "+i+"_cupboard_counter);\r\n"
							+ "");
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
					buffer.write("				"+classBlock+"."+i+"_wardrobe, \r\n"
							+ "				"+classBlock+"."+i+"_modern_wardrobe, \r\n"
							+ "				"+classBlock+"."+i+"_double_wardrobe, \r\n"
							+ "				"+classBlock+"."+i+"_bookshelf, \r\n"
							+ "				"+classBlock+"."+i+"_bookshelf_cupboard, \r\n"
							+ "				"+classBlock+"."+i+"_drawer, \r\n"
							+ "				"+classBlock+"."+i+"_double_drawer, \r\n"
							+ "				"+classBlock+"."+i+"_bookshelf_drawer, \r\n"
							+ "				"+classBlock+"."+i+"_lower_bookshelf_drawer, \r\n"
							+ "				"+classBlock+"."+i+"_large_drawer, \r\n"
							+ "				"+classBlock+"."+i+"_lower_triple_drawer, \r\n"
							+ "				"+classBlock+"."+i+"_triple_drawer, \r\n"
							+ "				"+classBlock+"."+i+"_desk, \r\n"
							+ "				"+classBlock+"."+i+"_covered_desk, \r\n"
							+ "				"+classBlock+"."+i+"_modern_desk, \r\n"
							+ "				"+classBlock+"."+i+"_table, \r\n"
							+ "				"+classBlock+"."+i+"_end_table, \r\n"
							+ "				"+classBlock+"."+i+"_coffee_table, \r\n"
							+ "				"+classBlock+"."+i+"_glass_table, \r\n"
							+ "				"+classBlock+"."+i+"_chair, \r\n"
							+ "				"+classBlock+"."+i+"_modern_chair, \r\n"
							+ "				"+classBlock+"."+i+"_striped_chair, \r\n"
							+ "				"+classBlock+"."+i+"_stool_chair, \r\n"
							+ "				"+classBlock+"."+i+"_counter, \r\n"
							+ "				"+classBlock+"."+i+"_drawer_counter, \r\n"
							+ "				"+classBlock+"."+i+"_double_drawer_counter, \r\n"
							+ "				"+classBlock+"."+i+"_cupboard_counter, \r\n"
							+ "");
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
					buffer.write("				content.add("+classBlock+"."+i+"_wardrobe); \r\n"
							+ "				content.add("+classBlock+"."+i+"_modern_wardrobe); \r\n"
							+ "				content.add("+classBlock+"."+i+"_double_wardrobe); \r\n"
							+ "				content.add("+classBlock+"."+i+"_bookshelf); \r\n"
							+ "				content.add("+classBlock+"."+i+"_bookshelf_cupboard); \r\n"
							+ "				content.add("+classBlock+"."+i+"_drawer); \r\n"
							+ "				content.add("+classBlock+"."+i+"_double_drawer); \r\n"
							+ "				content.add("+classBlock+"."+i+"_bookshelf_drawer); \r\n"
							+ "				content.add("+classBlock+"."+i+"_lower_bookshelf_drawer); \r\n"
							+ "				content.add("+classBlock+"."+i+"_large_drawer); \r\n"
							+ "				content.add("+classBlock+"."+i+"_lower_triple_drawer); \r\n"
							+ "				content.add("+classBlock+"."+i+"_triple_drawer); \r\n"
							+ "				content.add("+classBlock+"."+i+"_desk); \r\n"
							+ "				content.add("+classBlock+"."+i+"_covered_desk); \r\n"
							+ "				content.add("+classBlock+"."+i+"_modern_desk); \r\n"
							+ "				content.add("+classBlock+"."+i+"_table); \r\n"
							+ "				content.add("+classBlock+"."+i+"_end_table); \r\n"
							+ "				content.add("+classBlock+"."+i+"_coffee_table); \r\n"
							+ "				content.add("+classBlock+"."+i+"_glass_table); \r\n"
							+ "				content.add("+classBlock+"."+i+"_chair); \r\n"
							+ "				content.add("+classBlock+"."+i+"_modern_chair); \r\n"
							+ "				content.add("+classBlock+"."+i+"_striped_chair); \r\n"
							+ "				content.add("+classBlock+"."+i+"_stool_chair); \r\n"
							+ "				content.add("+classBlock+"."+i+"_counter); \r\n"
							+ "				content.add("+classBlock+"."+i+"_drawer_counter); \r\n"
							+ "				content.add("+classBlock+"."+i+"_double_drawer_counter); \r\n"
							+ "				content.add("+classBlock+"."+i+"_cupboard_counter); \r\n"
							+ "");
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