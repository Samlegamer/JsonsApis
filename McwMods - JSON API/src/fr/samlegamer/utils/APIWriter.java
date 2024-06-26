package fr.samlegamer.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class APIWriter
{
	public static void write(String location, File fileIn, String write)
	{
		if(!fileIn.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(fileIn);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write(write);
				
				buffer.close();
				writer.close();
				fileIn.createNewFile();
				System.out.println("The File " + fileIn + " wild be generated on this folder : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}