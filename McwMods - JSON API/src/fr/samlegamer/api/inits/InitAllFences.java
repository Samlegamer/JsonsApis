package fr.samlegamer.api.inits;

import java.util.List;
import fr.samlegamer.api.clientgen.fences.MacawsFences;
import fr.samlegamer.api.datagen.fences.MFCodeGenerator;
import fr.samlegamer.api.datagen.fences.MFRecipesGenerator;
import fr.samlegamer.api.datagen.fences.MFTagGenerator;

public class InitAllFences
{
	public static void init(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, List<String> MATERIAL, List<String> MAJ_MAT, boolean isStem, boolean gen117Tags)
	{
		for(int i = 0; i < MATERIAL.size(); i++)
		{
			MacawsFences.InitFolders(LOCATION);
			MFRecipesGenerator.init(LOCATION);
			MFCodeGenerator.init(LOCATION);
			
			MacawsFences.HighleyGate.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MacawsFences.HighleyGate.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), isStem);
			MacawsFences.HighleyGate.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));

			MacawsFences.HorseFence.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MacawsFences.HorseFence.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), isStem);
			MacawsFences.HorseFence.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));

			MacawsFences.Inventory.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), isStem);
			
			MacawsFences.PicketFence.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MacawsFences.PicketFence.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), isStem);
			MacawsFences.PicketFence.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			
			MacawsFences.PyramidGate.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MacawsFences.PyramidGate.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), isStem);
			MacawsFences.PyramidGate.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			
			MacawsFences.StockadeFence.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MacawsFences.StockadeFence.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), isStem);
			MacawsFences.StockadeFence.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			
			MacawsFences.WiredFence.createBlockstate(LOCATION, CompatModid, MATERIAL.get(i));
			MacawsFences.WiredFence.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL.get(i), isStem);
			MacawsFences.WiredFence.createModelItem(LOCATION, CompatModid, MATERIAL.get(i));
			
			MFRecipesGenerator.HighleyGate.loot_tables(LOCATION, CompatModid, MATERIAL.get(i));
			MFRecipesGenerator.HighleyGate.recipe(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i), isStem);

			MFRecipesGenerator.HorseFence.loot_tables(LOCATION, CompatModid, MATERIAL.get(i));
			MFRecipesGenerator.HorseFence.recipe(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i), isStem);

			MFRecipesGenerator.PicketFence.loot_tables(LOCATION, CompatModid, MATERIAL.get(i));
			MFRecipesGenerator.PicketFence.recipe(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i), isStem);

			MFRecipesGenerator.PyramidGate.loot_tables(LOCATION, CompatModid, MATERIAL.get(i));
			MFRecipesGenerator.PyramidGate.recipe(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i), isStem);

			MFRecipesGenerator.StockadeFence.loot_tables(LOCATION, CompatModid, MATERIAL.get(i));
			MFRecipesGenerator.StockadeFence.recipe(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i), isStem);

			MFRecipesGenerator.WiredFence.loot_tables(LOCATION, CompatModid, MATERIAL.get(i));
			MFRecipesGenerator.WiredFence.recipe(LOCATION, ModidExtended, CompatModid, MATERIAL.get(i), isStem);
			
			if(gen117Tags)
			{
				MFTagGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
				MFTagGenerator.FencesDataGen(LOCATION, CompatModid, MATERIAL);
			}
		}
	}
}