package fr.samlegamer.api.code.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.APIWriter;

/*
 * It's used for the new 1.21.1 version
 */
public class FurnituresBlockEntityModifier
{
	public void forge(String location, List<String> MAT_WOOD, String ClassBlockRegistry)
	{
		File file = new File(location + "Block Entities Modifier [Forge-Macaw's Furnitures].txt");
		File at = new File(location + "accesstransformer.cfg");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.newLine();
				buffer.write("//COPY TO YOUR PRINCIPAL CLASS");
				buffer.newLine();
				buffer.write("private static void addCompatibleBlocks(Block... blocks) {\r\n"
						+ "        Set<Block> currentBlocks = new HashSet<>(BlockEntityInit.FURNITURE_STORAGE.get().validBlocks);\r\n"
						+ "        Collections.addAll(currentBlocks, blocks);\r\n"
						+ "        BlockEntityInit.FURNITURE_STORAGE.get().validBlocks = Set.copyOf(currentBlocks);\r\n"
						+ "    }");
				buffer.newLine();

				buffer.write("FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addCompatibleBlocksToFurnitureStorage);");
				buffer.newLine();
				buffer.newLine();
				buffer.write("private void addCompatibleBlocksToFurnitureStorage(FMLCommonSetupEvent e)\r\n"
						+ "    {");
				buffer.newLine();
				buffer.write("        addCompatibleBlocks(");
				for(String i : MAT_WOOD)
				{
					if(!i.equals(MAT_WOOD.get(0)))
					{
						buffer.write(",");
					}
					buffer.write(ClassBlockRegistry+"."+i+"_wardrobe.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_modern_wardrobe.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_double_wardrobe.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_bookshelf.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_bookshelf_cupboard.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_double_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_bookshelf_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_lower_bookshelf_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_large_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_lower_triple_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_triple_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_drawer_counter.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_double_drawer_counter.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_cupboard_counter.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_wardrobe.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_modern_wardrobe.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_double_wardrobe.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_bookshelf.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_bookshelf_cupboard.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_double_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_bookshelf_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_lower_bookshelf_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_large_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_lower_triple_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_triple_drawer.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_counter.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_drawer_counter.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_double_drawer_counter.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_cupboard_counter.get(),");
					buffer.newLine();
					//3.3.0 Update
					buffer.write(ClassBlockRegistry+"."+i+"_kitchen_cabinet.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_double_kitchen_cabinet.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+"."+i+"_glass_kitchen_cabinet.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_kitchen_cabinet.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_double_kitchen_cabinet.get(),");
					buffer.newLine();
					buffer.write(ClassBlockRegistry+".stripped_"+i+"_glass_kitchen_cabinet.get()");
				}

				buffer.write(");");
				buffer.newLine();
				buffer.write("}");
				
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
		
		APIWriter.write(at, "public-f net.minecraft.world.level.block.entity.BlockEntityType f_58915_ # validBlocks");
	}
}
