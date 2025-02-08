package fr.samlegamer.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import fr.samlegamer.McwAPI;

public class APIWriter
{
	public static void write(Path filePath, String content) {
		if (!Files.exists(filePath)) {
			try {
				Files.writeString(filePath, content, StandardOpenOption.CREATE);
				McwAPI.message(filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}