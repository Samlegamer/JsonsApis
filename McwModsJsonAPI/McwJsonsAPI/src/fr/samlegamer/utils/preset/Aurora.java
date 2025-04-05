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
	
	public Aurora(String version, List<String> mcwMods, ModLoaders modLoader)
	{
		this.version=version;
		this.modLoader=modLoader;
		this.mcwMods=mcwMods;
	}
	
	public Aurora(String version, ModLoaders modLoader)
	{
		this(version, Reference.allMcwMods(), modLoader);
	}

	public Aurora(String version)
	{
		this(version, ModLoaders.FORGE);
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
				new McwDataGen(mcwMod));
				ID_WOOD.clear();

				NewModsList.Aurora.auroraWood(ID_WOOD, Compatibilities.ABUNDANCE_MODID);
				genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
				mcwMod, false, new McwModsRessources(mcwMod, clientFolderType), new McwDataGen(mcwMod));
				ID_WOOD.clear();
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
			mcwMod, true, new McwModsRessources(mcwMod, clientFolderType), new McwDataGen(mcwMod));
			ID_WOOD.clear();

			System.out.println("Done Wood Client/Data "+mcwMod);
		}
//		/*Bridges*/
//		if(activeBridges)
//		{
//
//		}
//
//		/*Fences*/
//		if(activeFences)
//		{
//			System.out.println("Start Wood Client");
//			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD, list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID),
//			Compatibilities.MCW_FENCES_MODID, false, new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_FENCES_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
//			this.is120 ? list ->  ModsList.AuroraWoods1201(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),
//			Compatibilities.MCW_FENCES_MODID, true, new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_FENCES_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
//			list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ABUNDANCE_MODID),
//			Compatibilities.MCW_FENCES_MODID, false, new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_FENCES_MODID));
//			ID_WOOD.clear();
//			System.out.println("Done Stone Client");
//		}
//
//		/*Roofs*/
//		if(activeRoofs)
//		{
//			System.out.println("Start Wood Client");
//			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD, list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID),
//			Compatibilities.MCW_ROOFS_MODID, false, new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
//			this.is120 ? list ->  ModsList.AuroraWoods1201(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),
//			Compatibilities.MCW_ROOFS_MODID, true, new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
//			list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ABUNDANCE_MODID),
//			Compatibilities.MCW_ROOFS_MODID, false, new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
//			ID_WOOD.clear();
//			System.out.println("Done Stone Client");
//		}
//
//		/*Furnitures*/
//		if(activeFurnitures)
//		{
//			System.out.println("Start Wood Client");
//			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD, list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID),
//			Compatibilities.MCW_FURNITURES_MODID, false, new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
//			new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
//			this.is120 ? list ->  ModsList.AuroraWoods1201(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),
//			Compatibilities.MCW_FURNITURES_MODID, true, new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
//			new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
//			list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ABUNDANCE_MODID),
//			Compatibilities.MCW_FURNITURES_MODID, false, new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
//			new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		/*Stairs*/
//		if(activeStairs)
//		{
//			System.out.println("Start Wood Client");
//			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD, list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID),
//			Compatibilities.MCW_STAIRS_MODID, false, new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
//			this.is120 ? list ->  ModsList.AuroraWoods1201(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),
//			Compatibilities.MCW_STAIRS_MODID, true, new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
//			list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ABUNDANCE_MODID),
//			Compatibilities.MCW_STAIRS_MODID, false, new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		if(activePaths)
//		{
//			System.out.println("Start Wood Client");
//			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD, list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID),
//			Compatibilities.MCW_PATHS_MODID, false, new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_PATHS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
//			this.is120 ? list ->  ModsList.AuroraWoods1201(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),
//			Compatibilities.MCW_PATHS_MODID, true, new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_PATHS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
//			list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ABUNDANCE_MODID),
//			Compatibilities.MCW_PATHS_MODID, false, new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_PATHS_MODID));
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		if(activeDoors)
//		{
//			System.out.println("Start Wood Client");
//			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD, list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID),
//			Compatibilities.MCW_DOORS_MODID, false, new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_DOORS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
//			this.is120 ? list ->  ModsList.AuroraWoods1201(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),
//			Compatibilities.MCW_DOORS_MODID, true, new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_DOORS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
//			list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ABUNDANCE_MODID),
//			Compatibilities.MCW_DOORS_MODID, false, new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_DOORS_MODID));
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		if(activeTraps)
//		{
//			System.out.println("Start Wood Client");
//			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD, list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID),
//			Compatibilities.MCW_TRAPDOORS_MODID, false, new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
//			this.is120 ? list ->  ModsList.AuroraWoods1201(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),
//			Compatibilities.MCW_TRAPDOORS_MODID, true, new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
//			list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ABUNDANCE_MODID),
//			Compatibilities.MCW_TRAPDOORS_MODID, false, new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		if(activeWindows)
//		{
//			System.out.println("Start Wood Client");
//			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, ID_WOOD, list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID),
//			Compatibilities.MCW_WINDOWS_MODID, false, new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, ID_WOOD,
//			this.is120 ? list ->  ModsList.AuroraWoods1201(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),
//			Compatibilities.MCW_WINDOWS_MODID, true, new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
//			ID_WOOD.clear();
//
//			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, ID_WOOD,
//			list -> ModsList.AuroraWoods(ID_WOOD, Compatibilities.ABUNDANCE_MODID),
//			Compatibilities.MCW_WINDOWS_MODID, false, new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
//			new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
		switch (version) {
			case "1.16.5" -> {
				NewModsList.Aurora.auroraWood(ID_WOOD);
				NewModsList.Aurora.auroraLeave(ID_LEAVE);
			}
			case "1.20.1" -> {
				NewModsList.Aurora.auroraSnifferWood(ID_WOOD);
			}
			case "1.21.1" -> {
//			NewModsList.Aurora.auroraBreezeWood(ID_WOOD);
//			LangMods.Aurora.auroraBreezeWood(LANG_WOOD, language);
			}
			default -> {
				NewModsList.Aurora.auroraCaveWood(ID_WOOD);
			}
		}


		System.out.println("Start Tags");
		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);

		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), Reference.allMcwMods());

//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new BridgesTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new RoofsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new FencesTagsGenerator(ID_LEAVE));
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new FurnituresTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new StairsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new PathsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new DoorsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new TrapdoorsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new WindowsTagsGenerator());
		System.out.println("Done Tags");

		System.out.println("Start Languages");
		addLanguage(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_LEAVE, LANG_LEAVE, "en_us");
		addLanguage(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_LEAVE, LANG_LEAVE, "fr_fr");
		System.out.println("Done Languages");

//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new BridgesLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new RoofsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new FencesLangGenerator(ID_LEAVE, LANG_LEAVE));
//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new FurnituresLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new StairsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new PathsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new DoorsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new TrapdoorsLangGenerator());
//		genLangEnglish(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new WindowsLangGenerator());
//
//		LANG_WOOD.clear();
//		LANG_LEAVE.clear();
//
//		if(this.is120)
//		{
//			French.Aurora.AuroraWoods1201Lang(LANG_WOOD);
//		}
//		else
//		{
//			French.Aurora.AuroraWoodsLang(LANG_WOOD);
//		}
//		French.Aurora.AuroraLeavesLang(LANG_LEAVE);
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new BridgesLangGenerator());
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new RoofsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new FencesLangGenerator(ID_LEAVE, LANG_LEAVE));
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new FurnituresLangGenerator());
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new StairsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new PathsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new DoorsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new TrapdoorsLangGenerator());
//		genLangFrench(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new WindowsLangGenerator());


		System.out.println("Start replacing");

		if(version.equals("1.20.1"))
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mushroom", "enhanced_mushrooms:mushroom_stem", "minecraft:mushroom_stem");
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "mushroom", "enhanced_mushrooms:mushroom_stem", "minecraft:mushroom_stem");
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
		LangSearcher langSearcher = new LangSearcher(McwAPI.READER_MCW_LANG);

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
//			NewModsList.Aurora.auroraBreezeWood(ID_WOOD);
//			LangMods.Aurora.auroraBreezeWood(LANG_WOOD, language);
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
