package fr.samlegamer.api.code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MRTabBuild
{
	public static void builderToAddWood(String location, List<String> MAT_WOOD, String ClassBR)
	{
		File file = new File(location + "CreativeTabWoodADD.txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_WOOD)
				{
					buffer.write("event.accept("+ClassBR+"."+i+"_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_attic_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_top_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_lower_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_steep_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_upper_lower_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_upper_steep_roof.get());\r\n"+ "");
					buffer.newLine();
					
					buffer.write("event.accept("+ClassBR+"."+i+"_planks_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_planks_attic_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_planks_top_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_planks_lower_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_planks_steep_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_planks_upper_lower_roof.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_planks_upper_steep_roof.get());\r\n"+ "");
					buffer.newLine();
				}
				
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

	public static void fabricWood(String location, List<String> MAT_WOOD, String ClassBR)
	{
		File file = new File(location + "CreativeTabWoodADD.txt");
		
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
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_attic_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_top_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_lower_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_steep_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_upper_lower_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_upper_steep_roof);\r\n"+ "");
					buffer.newLine();
					
					buffer.write("content.add("+ClassBR+"."+i+"_planks_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_planks_attic_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_planks_top_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_planks_lower_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_planks_steep_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_planks_upper_lower_roof);\r\n"+ "");
					buffer.newLine();
					buffer.write("content.add("+ClassBR+"."+i+"_planks_upper_steep_roof);\r\n"+ "");
					buffer.newLine();
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