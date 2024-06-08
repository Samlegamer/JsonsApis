package fr.samlegamer.api.inits;

import java.util.List;

import fr.samlegamer.api.clientgen.bridges.MBWarden;
import fr.samlegamer.api.clientgen.furnitures.McwFurnitures;
import fr.samlegamer.api.datagen.furnitures.MFurniRecipesGenerator;
import fr.samlegamer.api.datagen.furnitures.MFurniTagsGenerator;
import fr.samlegamer.api.lang.MFurniLangGenerator;

public class InitAllMFurni
{
	public static void WardenAllWood(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, List<String> MATERIAL, List<String> MAJ_MAT, boolean isStem)
	{
		McwFurnitures.InitFolders(LOCATION);
		MFurniLangGenerator.initAllEnglish(CompatModid, MATERIAL, MAJ_MAT);
		MFurniTagsGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
		MFurniRecipesGenerator.init(LOCATION);
		
		for(String i : MATERIAL)
		{
			MBWarden.BridgeLog.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeLog.createModelItem(LOCATION, CompatModid, i);

			MBWarden.BridgeRailWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeRailWood.createModelItem(LOCATION, CompatModid, i);
			
			MBWarden.PierWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.PierWood.createModelItem(LOCATION, CompatModid, i);
			
			MBWarden.RopeBridge.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.RopeBridge.createModelItem(LOCATION, CompatModid, i);

			MBWarden.StairWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairWood.createModelItem(LOCATION, CompatModid, i);

			MBWarden.StairRope.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairRope.createModelItem(LOCATION, CompatModid, i);
			
			MBWarden.BridgeLog.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.RopeBridge.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.StairRope.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.StairWood.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.BridgeRailWood.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MBWarden.PierWood.createModelBlock(LOCATION, TextureLocationFormodid, i, isStem);
		}
	}
	
	public static void CustomWardenAllWood(String LOCATION, String CompatModid, String TextureLocationFormodid, String LocationFormodidPlus, String ModidExtended, List<String> MATERIAL,
	boolean isStem, String nameOfTexturesPlanks, String nameOfTexturesLogs, String nameOfTexturesLogsStripped)
	{
		for(String i : MATERIAL)
		{
			/*MBWarden.BridgeLog.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeLog.createModelItem(LOCATION, CompatModid, i);

			MBWarden.BridgeRailWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.BridgeRailWood.createModelItem(LOCATION, CompatModid, i);
			
			MBWarden.PierWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.PierWood.createModelItem(LOCATION, CompatModid, i);
			
			MBWarden.RopeBridge.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.RopeBridge.createModelItem(LOCATION, CompatModid, i);

			MBWarden.StairWood.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairWood.createModelItem(LOCATION, CompatModid, i);

			MBWarden.StairRope.createBlockstate(LOCATION, CompatModid, i);
			MBWarden.StairRope.createModelItem(LOCATION, CompatModid, i);
						
			MBWarden.BridgeLog.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus, i, nameOfTexturesPlanks, nameOfTexturesLogs);
			MBWarden.RopeBridge.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus, i, nameOfTexturesPlanks, nameOfTexturesLogs);
			MBWarden.StairRope.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus, i, nameOfTexturesPlanks, nameOfTexturesLogs);
			MBWarden.StairWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus, i, nameOfTexturesPlanks, nameOfTexturesLogs);
			MBWarden.BridgeRailWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus, i, nameOfTexturesLogsStripped, nameOfTexturesLogs);
			MBWarden.PierWood.createModelBlockCustom(LOCATION, TextureLocationFormodid + LocationFormodidPlus, i, nameOfTexturesPlanks, nameOfTexturesLogs);*/
		}
	}
	
	public static void WardenAllRock(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, List<String> MATERIAL, List<String> MAJ_MAT, boolean isStem)
	{
		
	}
}