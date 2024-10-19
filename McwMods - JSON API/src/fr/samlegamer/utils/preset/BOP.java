package fr.samlegamer.utils.preset;

import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.stairs.StairsTagsGenerator;
import fr.samlegamer.api.lang.StairsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;

public class BOP implements Presetting
{
	protected static final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
	protected static final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);

	protected static final List<String> MAT_WOOD = new ArrayList<String>();
	protected static final List<String> MAJ_WOOD = new ArrayList<String>();

	@Override
	public void init(String LOCATION)
	{
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		ModsList.bop(MAT_WOOD, false);
		
		String TextureLocationFormodid = Compatibilities.BOP_TEXTURES;
		String ModidOfBaseMod = Compatibilities.BOP_MODID;
		String CompatModid = "mcwbiomesoplenty";

		client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		client_wood_stairs.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, MAT_WOOD, false);
		data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false);
		data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, false, Compatibilities.MCW_STAIRS_MODID);
		data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);

		StairsTagsGenerator tags_stairs = new StairsTagsGenerator();
		tags_stairs.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tags_stairs.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		StairsLangGenerator lang_stairs = new StairsLangGenerator();
		English.BOP.bopLang(MAJ_WOOD, false);
		lang_stairs.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
		MAJ_WOOD.clear();
		French.BOP.bopLang(MAJ_WOOD, false);
		lang_stairs.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
	}
}