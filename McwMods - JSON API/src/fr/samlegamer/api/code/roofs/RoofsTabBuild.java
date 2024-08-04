package fr.samlegamer.api.code.roofs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class RoofsTabBuild implements IModFiles.IProgram.TabBuild
{
	public void builderToAddWood(String LOCATION, List<String> MAT_WOOD, String ClassBlockRegistry)
	{
		File file = new File(LOCATION + "CreativeTabWoodADD(Forge).txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_WOOD)
				{
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_attic_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_top_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_lower_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_steep_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_upper_lower_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_upper_steep_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_planks_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_planks_attic_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_planks_top_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_planks_lower_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_planks_steep_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_planks_upper_lower_roof.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_planks_upper_steep_roof.get());\r\n"+ "");
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
	public void fabricWood(String location, List<String> MAT_WOOD, String ClassBR)
	{
		File file = new File(location + "CreativeTabWoodADD(Fabric).txt");
		
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
					buffer.write("content.add("+ClassBR+"."+i+"_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_attic_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_top_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_lower_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_steep_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_upper_lower_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_upper_steep_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_planks_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_planks_attic_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_planks_top_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_planks_lower_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_planks_steep_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_planks_upper_lower_roof);\r\n"+ "");
					buffer.write("content.add("+ClassBR+"."+i+"_planks_upper_steep_roof);\r\n"+ "");
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

}