package fr.samlegamer.api.code.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class MFTabBuild implements IModFiles.IProgram.TabBuild
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
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_picket_fence.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_stockade_fence.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_horse_fence.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_wired_fence.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_highley_gate.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_pyramid_gate.get());\r\n"+ "");
					buffer.newLine();
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