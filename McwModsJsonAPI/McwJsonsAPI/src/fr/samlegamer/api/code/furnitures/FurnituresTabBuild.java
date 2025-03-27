package fr.samlegamer.api.code.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class FurnituresTabBuild implements IModFiles.IProgram.TabBuild
{
	public void builderToAddWood(String LOCATION, List<String> MAT_WOOD, String ClassBlockRegistry)
	{
		File file = new File(LOCATION + "CreativeTabWoodADD (Forge).txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_WOOD)
				{
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_wardrobe.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_modern_wardrobe.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_double_wardrobe.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_bookshelf.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_bookshelf_cupboard.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_double_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_bookshelf_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_lower_bookshelf_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_large_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_lower_triple_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_triple_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_covered_desk.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_modern_desk.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_table.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_end_table.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_coffee_table.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_glass_table.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_chair.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_modern_chair.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_striped_chair.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_stool_chair.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_counter.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_drawer_counter.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_double_drawer_counter.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_cupboard_counter.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_wardrobe.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_modern_wardrobe.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_double_wardrobe.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_bookshelf.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_bookshelf_cupboard.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_double_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_bookshelf_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_lower_bookshelf_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_large_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_lower_triple_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_triple_drawer.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_desk.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_covered_desk.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_modern_desk.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_table.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_end_table.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_coffee_table.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_glass_table.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_modern_chair.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_striped_chair.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_stool_chair.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_counter.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_drawer_counter.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_double_drawer_counter.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_cupboard_counter.get());\r\n"+ "");
					//3.3.0 Update
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_kitchen_cabinet.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_double_kitchen_cabinet.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_glass_kitchen_cabinet.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_kitchen_cabinet.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_double_kitchen_cabinet.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".stripped_"+i+"_glass_kitchen_cabinet.get());\r\n"+ "");
				}
				
				buffer.newLine();
				buffer.write("//Finish");
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
	public void builderToAddStone(String LOCATION, List<String> MAT_ROCK, String ClassBlockRegistry) {
		
	}
	
	@Override
	public void fabricWood(String location, List<String> MAT_WOOD, String ClassBlockRegistry)
	{
		File file = new File(location + "CreativeTabWoodADD (Fabric).txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				buffer.write("ItemGroupEvents.modifyEntriesEvent(MacawsRoofs.ROOFGROUP).register(content -> {");
				buffer.newLine();

				for(String i : MAT_WOOD)
				{
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_wardrobe);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_modern_wardrobe);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_double_wardrobe);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_bookshelf);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_bookshelf_cupboard);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_double_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_bookshelf_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_lower_bookshelf_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_large_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_lower_triple_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_triple_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_covered_desk);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_modern_desk);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_table);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_end_table);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_coffee_table);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_glass_table);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_chair);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_modern_chair);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_striped_chair);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_stool_chair);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_counter);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_drawer_counter);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_double_drawer_counter);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_cupboard_counter);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_wardrobe);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_modern_wardrobe);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_double_wardrobe);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_bookshelf);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_bookshelf_cupboard);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_double_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_bookshelf_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_lower_bookshelf_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_large_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_lower_triple_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_triple_drawer);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_desk);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_covered_desk);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_modern_desk);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_table);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_end_table);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_coffee_table);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_glass_table);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_modern_chair);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_striped_chair);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_stool_chair);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_counter);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_drawer_counter);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_double_drawer_counter);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_cupboard_counter);\r\n"+ "");
					//3.3.0 Update
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_kitchen_cabinet);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_double_kitchen_cabinet);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_glass_kitchen_cabinet);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_kitchen_cabinet);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_double_kitchen_cabinet);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".stripped_"+i+"_glass_kitchen_cabinet);\r\n"+ "");				
				}
				buffer.write("});");

				buffer.newLine();
				buffer.write("//Finish");
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

	@Override
	public void fabricStone(String LOCATION, List<String> MAT_ROCK, String ClassBR) {
		// TODO Auto-generated method stub
		
	}

}