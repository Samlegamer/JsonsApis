package fr.samlegamer.api.code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MFTabBuild
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
					buffer.write("event.accept("+ClassBR+"."+i+"_picket_fence.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_stockade_fence.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_horse_fence.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_wired_fence.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_highley_gate.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBR+"."+i+"_pyramid_gate.get());\r\n"+ "");
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