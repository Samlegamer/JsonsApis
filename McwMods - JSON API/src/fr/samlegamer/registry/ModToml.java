package fr.samlegamer.registry;

import java.io.File;

import fr.samlegamer.utils.APIWriter;

public class ModToml
{
	public static void build(String location, String modid, String ModName, String version, String versionMC, 
	String picture, String desc, String WebURL, String Author)
	{
		File file = new File(location + "mods (paste to original Mod.toml).txt");
		
		int idForForge = 43; // Set to Default for 1.19.2
		String Vrange = "1.19.2,1.20"; //Set to Default for 1.19.2
		
		switch(versionMC)
		{
		case "1.19.2":
			idForForge = 43;
			Vrange = "1.19.2,1.20";
			break;
		case "1.19.1":
			idForForge = 42;
			break;
		case "1.19":
			idForForge = 41;
			break;
		case "1.18.2":
			idForForge = 40;
			Vrange = "1.18.2,1.19";
			break;
		case "1.18.1":
			idForForge = 39;
			break;
		case "1.18":
			idForForge = 38;
			break;
		case "1.16.5":
			idForForge = 36;
			Vrange = "1.16.5,1.17";
			break;
		}
		
		APIWriter.write(location, file, "modLoader=\"javafml\"\r\n"
				+ "loaderVersion=\"["+idForForge+",)\"\r\n"
				+ "license=\"All rights reserved\"\r\n"
				+ "\r\n"
				+ "[[mods]]\r\n"
				+ "modId=\""+modid+"\"\r\n"
				+ "version=\""+versionMC+"-"+version+"\"\r\n"
				+ "displayName=\""+ModName+"\"\r\n"
				+ "displayURL=\""+WebURL+"\"\r\n"
				+ "logoFile=\""+picture+"\"\r\n"
				+ "credits=\"\"\r\n"
				+ "authors=\""+Author+"\"\r\n"
				+ "\r\n"
				+ "description='''\r\n"
				+ desc+"\r\n"
				+ "'''\r\n"
				+ "\r\n"
				+ "[[dependencies."+modid+"]\r\n"
				+ "    modId=\"forge\"\r\n"
				+ "    mandatory=true\r\n"
				+ "    versionRange=\"["+idForForge+",)\"\r\n"
				+ "    ordering=\"NONE\"\r\n"
				+ "    side=\"BOTH\"\r\n"
				+ "\r\n"
				+ "[[dependencies."+modid+"]]\r\n"
				+ "    modId=\"minecraft\"\r\n"
				+ "    mandatory=true\r\n"
				+ "    versionRange=\"["+Vrange+")\"\r\n"
				+ "    ordering=\"NONE\"\r\n"
				+ "    side=\"BOTH\"\r\n"
				+ "");
	}
}