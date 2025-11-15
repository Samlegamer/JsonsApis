package fr.samlegamer.utils.preset;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.api.datagen.TagsGenerator;
import fr.samlegamer.api.lang.*;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;

public class Aurora implements Presetting
{
	private final String version;
	private final ModLoaders modLoader;
	private final List<String> mcwMods;
	private final String recipeVersion;

	public Aurora(String version, List<String> mcwMods, ModLoaders modLoader, String recipeVersion)
	{
		this.version=version;
		this.modLoader=modLoader;
		this.mcwMods=mcwMods;
		this.recipeVersion=recipeVersion;
	}
	
	public Aurora(String version, ModLoaders modLoader, String recipeVersion)
	{
		this(version, Reference.allMcwMods(), modLoader, recipeVersion);
	}

	public Aurora(String version)
	{
		this(version, ModLoaders.FORGE, "1.20");
	}

	@Override
	public void init(String LOCATION)
	{
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.PathsGenFolder(LOCATION);
		McwAPI.DoorsGenFolder(LOCATION);
		McwAPI.TrapdoorsGenFolder(LOCATION);
		McwAPI.WindowsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> ID_WOOD = new ArrayList<>();
		List<String> LANG_WOOD = new ArrayList<>();
		List<String> ID_LEAVE = new ArrayList<>();
		List<String> LANG_LEAVE = new ArrayList<>();
		String CompatModid = "mcwaurora";

		for(String mcwMod : mcwMods)
		{
			ClientFolderTypes clientFolderType = Reference.getFoldersWoodWithMcwMod(mcwMod);

			System.out.println("Start Wood Client/Data " + mcwMod);
			if(version.equals("1.16.5"))
			{
				NewModsList.Aurora.auroraWood(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID);
				genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD,
						mcwMod, false, new McwModsRessources(mcwMod, clientFolderType),
				new McwDataGen(mcwMod, recipeVersion));
				ID_WOOD.clear();

				NewModsList.Aurora.auroraWood(ID_WOOD, Compatibilities.ABUNDANCE_MODID);
				genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
				mcwMod, false, new McwModsRessources(mcwMod, clientFolderType), new McwDataGen(mcwMod, recipeVersion));
				ID_WOOD.clear();
			}
			else if(version.equals("1.21.1"))
			{
				final String txtLocMod = Compatibilities.NOMANSLAND_TEXTURES;
				final String ModidOfBaseMod = Compatibilities.NOMANSLAND;

				final McwModsRessources RSC = new McwModsRessources(mcwMod, clientFolderType);
				final McwDataGen DATA = new McwDataGen(mcwMod, recipeVersion);

				NewModsList.Aurora.auroraBreezeWood(ID_WOOD, Compatibilities.NOMANSLAND);

				for(String wood : ID_WOOD)
				{
					genRsc(LOCATION, CompatModid, txtLocMod + "/"+wood, Compatibilities.NOMANSLAND, List.of(wood),
							mcwMod, false, RSC, DATA);
				}
				ID_WOOD.clear();

				if(mcwMod.equals(Compatibilities.MCW_FENCES_MODID)) {
					NewModsList.Aurora.auroraBreezeNormalFolderLeave(ID_LEAVE);

					RSC.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
					RSC.createWoodModelsBlockswithResearch(LOCATION, txtLocMod+"/plants", ID_LEAVE, Boolean.FALSE, "acacia_wall");
					RSC.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
					DATA.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
					DATA.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
					DATA.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
					ID_LEAVE.clear();

					NewModsList.Aurora.auroraBreezeSpecialFolderLeave(ID_LEAVE);

					RSC.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
					RSC.createWoodModelsBlockswithResearch(LOCATION, txtLocMod+"/maple", ID_LEAVE, Boolean.FALSE, "acacia_wall");
					RSC.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
					DATA.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
					DATA.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
					DATA.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
					ID_LEAVE.clear();
				}
			}

			if(version.equals("1.20.1"))
			{
				NewModsList.Aurora.auroraSnifferWood(ID_WOOD);
			}
			else if(version.equals("1.21.1"))
			{
				NewModsList.Aurora.auroraBreezeWood(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID);
			}
			else
			{
				NewModsList.Aurora.auroraWood(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID);
			}
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
			mcwMod, true, new McwModsRessources(mcwMod, clientFolderType), new McwDataGen(mcwMod, recipeVersion));
			ID_WOOD.clear();

			System.out.println("Done Wood Client/Data "+mcwMod);
		}

		switch (version) {
			case "1.16.5" -> {
				NewModsList.Aurora.auroraWood(ID_WOOD);
				NewModsList.Aurora.auroraLeave(ID_LEAVE);
			}
			case "1.20.1" -> {
				NewModsList.Aurora.auroraSnifferWood(ID_WOOD);
			}
			case "1.21.1" -> {
				NewModsList.Aurora.auroraBreezeWood(ID_WOOD);
				NewModsList.Aurora.auroraBreezeLeave(ID_LEAVE);
				NewModsList.Aurora.auroraBreezeNormalFolderLeave(ID_LEAVE);
				NewModsList.Aurora.auroraBreezeSpecialFolderLeave(ID_LEAVE);
			}
			default -> {
				NewModsList.Aurora.auroraCaveWood(ID_WOOD);
			}
		}


		System.out.println("Start Tags");
		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		if(version.equals("1.16.5") || version.equals("1.21.1"))
		{
			tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
		}
		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), Reference.allMcwMods());

		System.out.println("Done Tags");

		System.out.println("Start Languages");
		addLanguage(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_LEAVE, LANG_LEAVE, "en_us");
		if(!version.equals("1.21.1"))
		{
			addLanguage(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_LEAVE, LANG_LEAVE, "fr_fr");
		}
		System.out.println("Done Languages");



		System.out.println("Start replacing");

		if(version.equals("1.20.1") || version.equals("1.21.1"))
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mushroom", "enhanced_mushrooms:mushroom_stem", "minecraft:mushroom_stem");
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "mushroom", "enhanced_mushrooms:mushroom_stem", "minecraft:mushroom_stem");

			JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "mushroom_hedge.json");
			JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mushroom_hedge.json");
		}

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "red_mushroom_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_mushroom_hedge.json");

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "brown_mushroom_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "brown_mushroom_hedge.json");

		System.out.println("Done replacing");

		System.out.println("Finish Aurora Registries");
	}

	private void genRsc(String LOCATION, String CompatModid, String txtLocMod, String ModidOfBaseMod, List<String> ID_WOOD, String compat, boolean isStem, McwModsRessources res, McwDataGen data)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
		res.createWoodModelsBlocks(LOCATION, txtLocMod, ID_WOOD, isStem);
		res.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
		data.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, isStem, compat, ModidOfBaseMod, modLoader);
		data.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, isStem, compat, ModidOfBaseMod, modLoader);

		if(compat.equals(Compatibilities.MCW_FENCES_MODID) && !ModidOfBaseMod.equals(Compatibilities.ENHANCED_MUSHROOMS_MODID))
		{
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_WOOD, "acacia_hedge");
			res.createWoodModelsBlockswithResearch(LOCATION, txtLocMod, ID_WOOD, Boolean.FALSE, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_WOOD, "acacia_hedge");
			data.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_WOOD, "acacia_hedge");
			data.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
	}

	private void addLanguage(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> LANG_WOOD, List<String> ID_LEAVE, List<String> LANG_LEAVE, String language)
	{
		LangSearcher langSearcher = new LangSearcher();

        switch (version) {
            case "1.16.5" -> {
                LangMods.Aurora.auroraWoodLang(LANG_WOOD, language);
                LangMods.Aurora.auroraLeaveLang(LANG_LEAVE, language);

                langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, mcwMods);
                langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
            }
            case "1.20.1" -> {
                LangMods.Aurora.auroraWoodSnifferLang(LANG_WOOD, language);
                langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, mcwMods);
            }
            case "1.21.1" -> {
				LangMods.Aurora.auroraWoodBreezeLang(LANG_WOOD, language);
				LangMods.Aurora.auroraLeaveBreezeLang(LANG_LEAVE, language);
				langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, mcwMods);
				langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);

				System.out.println(ID_LEAVE.toString());
				System.out.println(LANG_LEAVE.toString());
			}
            default -> {
                LangMods.Aurora.auroraWoodCaveLang(LANG_WOOD, language);
                langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, mcwMods);
            }
        }
		LANG_WOOD.clear();
		LANG_LEAVE.clear();
	}
}
