package fr.samlegamer.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.samlegamer.McwAPI;

public class APIWriter
{
	public static void write(@Deprecated String location, File fileIn, String write)
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
				McwAPI.message(fileIn);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}