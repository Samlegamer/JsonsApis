package fr.samlegamer.api.code.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class FencesTabBuild implements IModFiles.IProgram.TabBuild
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
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_stockade_fence.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_horse_fence.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_wired_fence.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_highley_gate.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_pyramid_gate.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_hedge.get());\r\n"+ "");
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
	public void builderToAddStone(String LOCATION, List<String> MAT_ROCK, String ClassBlockRegistry)
	{
		File file = new File(LOCATION + "CreativeTabStoneADD.txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_ROCK)
				{
					buffer.write("event.accept("+ClassBlockRegistry+".modern_"+i+"_wall.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+".railing_"+i+"_wall.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_railing_gate.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_pillar_wall.get());\r\n"+ "");
					buffer.write("event.accept("+ClassBlockRegistry+"."+i+"_grass_topped_wall.get());\r\n"+ "");
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
	public void fabricWood(String LOCATION, List<String> MAT_WOOD, String ClassBlockRegistry) {

		File file = new File(LOCATION + "CreativeTabWoodADD FABRIC.txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_WOOD)
				{
					buffer.write("					content.add("+ClassBlockRegistry+"."+i+"_picket_fence);");
					buffer.newLine();
					buffer.write("					content.add("+ClassBlockRegistry+"."+i+"_stockade_fence);");
					buffer.newLine();
					buffer.write("					content.add("+ClassBlockRegistry+"."+i+"_horse_fence);");
					buffer.newLine();
					buffer.write("					content.add("+ClassBlockRegistry+"."+i+"_wired_fence);");
					buffer.newLine();
					buffer.write("					content.add("+ClassBlockRegistry+"."+i+"_highley_gate);");
					buffer.newLine();
					buffer.write("					content.add("+ClassBlockRegistry+"."+i+"_pyramid_gate);");
					buffer.newLine();
					buffer.write("					content.add("+ClassBlockRegistry+"."+i+"_hedge);");
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
		File file = new File(LOCATION + "CreativeTabStoneADD FABRIC.txt");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : MAT_ROCK)
				{
					buffer.write("content.add("+ClassBlockRegistry+".modern_"+i+"_wall);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+".railing_"+i+"_wall);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_railing_gate);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_pillar_wall);\r\n"+ "");
					buffer.write("content.add("+ClassBlockRegistry+"."+i+"_grass_topped_wall);\r\n"+ "");
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