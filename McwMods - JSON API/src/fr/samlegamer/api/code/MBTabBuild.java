package fr.samlegamer.api.code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MBTabBuild
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
					buffer.write("event.accept("+ClassBR+"."+i+"_log_bridge_middle.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+".rope_"+i+"_bridge.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_bridge_pier.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_log_bridge_stair.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_rope_bridge_stair.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_rail_bridge.get());\r\n"+ "");
					buffer.newLine();
				}
				
				buffer.newLine();
				buffer.write("//Finish");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void builderToAddStone(String location, List<String> MAT_ROCK, String ClassBR)
	{
		File file = new File(location + "CreativeTabStoneADD.txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_ROCK)
				{
					buffer.write("event.accept("+ClassBR+"."+i+"_bridge.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_bridge_pier.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_bridge_stair.get());\r\n"+ "");
					buffer.newLine();
				}
				
				buffer.newLine();
				buffer.write("//Finish");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}