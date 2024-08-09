package fr.samlegamer.api.code.bridges;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class BridgesTabBuild implements IModFiles.IProgram.TabBuild
{
	public void builderToAddWood(String LOCATION, List<String> MAT_WOOD, String ClassBlockRegistry)
	{
		File file = new File(LOCATION + "CreativeTabWoodADD (Macaw's Bridges).txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_WOOD)
				{
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_log_bridge_middle.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+".rope_"+i+"_bridge.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_bridge_pier.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_log_bridge_stair.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_rope_bridge_stair.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_rail_bridge.get());\r\n"+ "");
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
	
	public void builderToAddStone(String LOCATION, List<String> MAT_ROCK, String ClassBlockRegistry)
	{
		File file = new File(LOCATION + "CreativeTabStoneADD (Macaw's Bridges).txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_ROCK)
				{
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_bridge.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_bridge_pier.get());\r\n"+ "");
					buffer.newLine();
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_bridge_stair.get());\r\n"+ "");
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
	public void fabricWood(String LOCATION, List<String> MAT_WOOD, String ClassBlockRegistry)
	{
		File file = new File(LOCATION + "CreativeTabWoodADD FABRIC (Macaw's Bridges).txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("//FOR TAB");
				buffer.newLine();
				buffer.write("ItemGroupEvents.modifyEntriesEvent(MacawsBridges.BRIDGEGROUP).register(content -> {");
				buffer.newLine();
				
				for(String i : MAT_WOOD)
				{
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_log_bridge_middle);");
					buffer.newLine();
					buffer.write("content.add("+ClassBlockRegistry+"."+"rope_"+i+"_bridge);");
					buffer.newLine();
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_bridge_pier);");
					buffer.newLine();
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_log_bridge_stair);");
					buffer.newLine();
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_rope_bridge_stair);");
					buffer.newLine();
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_rail_bridge);");
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
	public void fabricStone(String LOCATION, List<String> MAT_ROCK, String ClassBlockRegistry)
	{
		File file = new File(LOCATION + "CreativeTabStoneADD FABRIC (Macaw's Bridges).txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("//FOR TAB");
				buffer.newLine();
				buffer.write("ItemGroupEvents.modifyEntriesEvent(MacawsBridges.BRIDGEGROUP).register(content -> {");
				buffer.newLine();
				
				for(String i : MAT_ROCK)
				{
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_bridge);");
					buffer.newLine();
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_bridge_pier);");
					buffer.newLine();
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_bridge_stair);");
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

}