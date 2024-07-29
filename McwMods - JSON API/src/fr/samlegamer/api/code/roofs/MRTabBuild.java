package fr.samlegamer.api.code.roofs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class MRTabBuild implements IModFiles.IProgram.TabBuild
{
	public void builderToAddWood(String LOCATION, List<String> MAT_WOOD, String ClassBlockRegistry)
	{
		File file = new File(LOCATION + "CreativeTabWoodADD.txt");
		
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
		// TODO Auto-generated method stub
		
	}
}