package fr.samlegamer;

import java.io.File;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.preset.*;

public class McwMain
{
	public static final String LOCATION = System.getProperty("user.dir")+File.separator+"genRessourcesMcw"+File.separator;// Local Path
	public static final String RP = System.getProperty("user.dir")+File.separator+"ressourcepack"+File.separator;// Local Path
	
	public static void main(String[] args)
	{
		preset(new BYGWarden(ModLoaders.FABRIC));
	}
	
	public static void preset(Presetting preset)
	{
		preset.init(LOCATION);
	}
}