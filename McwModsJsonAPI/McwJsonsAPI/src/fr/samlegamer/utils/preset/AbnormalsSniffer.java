package fr.samlegamer.utils.preset;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.api.datagen.TagsGenerator;
import fr.samlegamer.api.lang.LangSearcher;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.*;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AbnormalsSniffer implements Presetting
{
	private final List<String> mcwMods;
	private final ModLoaders modLoader;
	private final String version;

	public AbnormalsSniffer()
	{
		this("1.20", ModLoaders.FORGE);
	}

	public AbnormalsSniffer(String version, ModLoaders modLoader)
	{
		this(Reference.allMcwMods(), version, modLoader);
	}

	public AbnormalsSniffer(List<String> mcwMods, String version, ModLoaders modLoader)
	{
		this.mcwMods = mcwMods;
		this.modLoader=modLoader;
		this.version = version;
	}
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.PathsGenFolder(LOCATION);
		McwAPI.DoorsGenFolder(LOCATION);
		McwAPI.TrapdoorsGenFolder(LOCATION);
		McwAPI.WindowsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> ID_WOOD = new ArrayList<>();
		List<String> ID_ROCK = new ArrayList<>();
		List<String> WALL = new ArrayList<>();
		List<String> FLOOR = new ArrayList<>();
		List<String> ID_LEAVE = new ArrayList<>();
		
		List<String> LANG_WOOD = new ArrayList<>();
		List<String> LANG_ROCK = new ArrayList<>();
		List<String> LANG_LEAVE = new ArrayList<>();
		String CompatModid = "mcwabnormals";
		String txtLocMod, ModidOfBaseMod;

		for(String mod : mcwMods)
		{
			ClientFolderTypes clientFolderTypes = Reference.getFoldersWoodWithMcwMod(mod);

			final McwModsRessources client = new McwModsRessources(mod, clientFolderTypes);
			final McwDataGen data = new McwDataGen(mod, version);

			System.out.println("Start Wood "+ mod +" Client/Data");
			NewModsList.Abnormals.abnormalsWood120(ID_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood120(ID_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood120(ID_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; // "environmental";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood120(ID_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; // "upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood120(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood120(ID_WOOD, Compatibilities.CAVERNCHASMS_MODID);
			txtLocMod = Compatibilities.CAVERNCHASMS_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.CAVERNCHASMS_MODID; // "environmental";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			if(mod.equals(Compatibilities.MCW_FENCES_MODID))
			{
				NewModsList.Abnormals.abnormalsLeaves120(ID_LEAVE, Compatibilities.ATMO_MODID);
				txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
				ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();

				NewModsList.Abnormals.abnormalsLeaves120(ID_LEAVE, Compatibilities.AUTUM_MODID);
				txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
				ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();

				NewModsList.Abnormals.abnormalsLeaves120(ID_LEAVE, Compatibilities.ENVI_MODID);
				txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
				ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();

				NewModsList.Abnormals.abnormalsLeaves120(ID_LEAVE, Compatibilities.UAQUA_MODID);
				txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
				ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();
			}

			System.out.println("Done Wood "+ mod +" Client/Data");
		}

		for(String mod : Reference.allMcwModsStone())
		{
			ClientFolderTypes clientFolderTypes = Reference.getFoldersStoneWithMcwMod(mod);
			final McwModsRessources client = new McwModsRessources(mod, clientFolderTypes);
			final McwDataGen data = new McwDataGen(mod, version);

			System.out.println("Start Stone Client");
			NewModsList.Abnormals.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.BUZZBEES_MODID);
			txtLocMod = Compatibilities.BUZZBEES_TEXTURES; //"buzzier_bees:block";
			ModidOfBaseMod = Compatibilities.BUZZBEES_MODID; //"buzzier_bees";
			genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, mod, client, data);
			McwAPI.clears(ID_ROCK, WALL, FLOOR);

			NewModsList.Abnormals.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			client.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
			client.createStoneModelsBlocks(LOCATION, txtLocMod, ID_ROCK, WALL, FLOOR);
			client.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
			data.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, mod, ModidOfBaseMod, modLoader);
			data.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);

			if(mod.equals(Compatibilities.MCW_BRIDGES_MODID))
			{
				data.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, List.of("smooth_red_arid_sandstone", "smooth_arid_sandstone"), Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, modLoader);

			}
			else
			{
				genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, client, data);
			}

			McwAPI.clears(ID_ROCK, WALL, FLOOR);
			NewModsList.Abnormals.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, mod, client, data);
			McwAPI.clears(ID_ROCK, WALL, FLOOR);

            NewModsList.Abnormals.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.CAVERNCHASMS_MODID);
            txtLocMod = Compatibilities.CAVERNCHASMS_TEXTURES;
            ModidOfBaseMod = Compatibilities.CAVERNCHASMS_MODID;
            genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, mod, client, data);
            McwAPI.clears(ID_ROCK, WALL, FLOOR);
			System.out.println("Done Stone Client");
		}


		NewModsList.Abnormals.abnormalsWood120(ID_WOOD);
		NewModsList.Abnormals.abnormalsRockWarden(ID_ROCK);
		NewModsList.Abnormals.abnormalsLeaves120(ID_LEAVE);

		System.out.println("Start Tags");
		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
		tagsGenerator.pickaxe(LOCATION, CompatModid, ID_ROCK, Reference.allMcwModsStone());

		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());

		System.out.println("Done Tags");

		genLang(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_ROCK, LANG_ROCK, ID_LEAVE, LANG_LEAVE, "en_us");
		genLang(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_ROCK, LANG_ROCK, ID_LEAVE, LANG_LEAVE, "fr_fr");
		
		/* Make Basic logo model file */
		APIWriter.write(Path.of(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath() + "logo.json"), """
                {\r
                  "parent": "minecraft:item/generated",\r
                  "textures": {\r
                    "layer0": "mcwabnormals:item/logo"\r
                  }\r
                }""");
		
		System.out.println("Done Data/Tags/Lang");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "red_maple", "red_maple_leaves", "maple_leaves");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "yellow_maple", "yellow_maple_leaves", "maple_leaves");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "orange_maple", "orange_maple_leaves", "maple_leaves");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "honeycomb_brick", "buzzier_bees:honeycomb_block", "minecraft:honeycomb_block");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "honeycomb_brick", "\"buzzier_bees:honeycomb_brick\"", "\"buzzier_bees:honeycomb_bricks\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "honeycomb_tile", "\"buzzier_bees:honeycomb_tile\"", "\"buzzier_bees:honeycomb_tiles\"");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "snail_shell_tiles", "autumnity:snail_shell_tiles_wall", "autumnity:snail_shell_tile_wall");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "snail_shell_bricks", "autumnity:snail_shell_block_stripes", "autumnity:snail_shell_block");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "snail_shell_tiles", "autumnity:snail_shell_tiles_wall", "autumnity:snail_shell_tile_wall");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "snail_shell_tiles", "autumnity:snail_shell_tiles_slab", "autumnity:snail_shell_tile_slab");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "honeycomb_brick", "\"buzzier_bees:honeycomb_brick\"", "\"buzzier_bees:honeycomb_bricks\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "honeycomb_tile", "\"buzzier_bees:honeycomb_tile\"", "\"buzzier_bees:honeycomb_tiles\"");



        List<List<String>> pathsStone = List.of(ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE.getPathList(), ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD.getPathList(), ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList());

        for(List<String> path : pathsStone) {
            for (String folderInModel : path) {
                JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "cobbled_deepslate_bricks", "caverns_and_chasms:block/cobbled_deepslate\"", "minecraft:block/cobbled_deepslate\"");
                JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "polished_calcite", "caverns_and_chasms:block/calcite\"", "minecraft:block/calcite\"");
                JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "lapis_bricks", "caverns_and_chasms:block/lapis_block\"", "minecraft:block/lapis_block\"");
                JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel + File.separator, "flooded_dripstone_shingles", "caverns_and_chasms:block/dripstone_block\"", "minecraft:block/dripstone_block\"");
            }
        }

        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "cobbled_deepslate_bricks", "\"caverns_and_chasms:cobbled_deepslate\"", "\"minecraft:cobbled_deepslate\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "polished_calcite", "\"caverns_and_chasms:calcite\"", "\"minecraft:calcite\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "lapis_bricks", "\"caverns_and_chasms:lapis_block\"", "\"minecraft:lapis_block\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "flooded_dripstone_shingles", "\"caverns_and_chasms:dripstone_block\"", "\"minecraft:dripstone_block\"");



		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "wisteria_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "wisteria_hedge.json");

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "driftwood_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "driftwood_hedge.json");

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "poise_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "poise_hedge.json");

		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "azalea_hedge.json");
		JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "azalea_hedge.json");

		System.out.println("Finish Abnormals Registries");
	}

	protected void genRessources(String LOCATION, String CompatModid, List<String> ID_WOOD, String txtLocMod, String ModidOfBaseMod, boolean isStem, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
		res.createWoodModelsBlocks(LOCATION, txtLocMod, ID_WOOD, isStem);
		res.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
		dat.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, isStem, compat, ModidOfBaseMod, modLoader);
		dat.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
		dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, isStem, compat, ModidOfBaseMod, modLoader);
	}

	protected void genRessourcesStone(String LOCATION, String CompatModid, List<String> ID_ROCK, List<String> WALL, List<String> FLOOR, String txtLocMod, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
		res.createStoneModelsBlocks(LOCATION, txtLocMod, ID_ROCK, WALL, FLOOR);
		res.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
		dat.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, compat, ModidOfBaseMod, modLoader);
		dat.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
		dat.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, FLOOR, compat, ModidOfBaseMod, modLoader);

	}

	protected void genHedges(String LOCATION, String CompatModid, List<String> ID_LEAVE, String TextureLocationFormodid, String ModidOfBaseMod, McwModsRessources res, McwDataGen data)
	{
		res.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		res.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, Boolean.FALSE, "acacia_wall");
		res.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		data.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		data.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		data.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
	}

	protected void genEndergetic(String LOCATION, String CompatModid, List<String> ID_WOOD, String txtLocMod, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
		res.createWoodCustomModelsBlocks(LOCATION, txtLocMod, ID_WOOD, "poise_planks", "poise_stem", "stripped_poise_stem");
		res.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
		dat.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, true, compat, ModidOfBaseMod, modLoader);
		dat.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
		dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, true, compat, ModidOfBaseMod, modLoader);
	}
	
	private void genLang(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> LANG_WOOD, List<String> ID_ROCK, 
	List<String> LANG_ROCK, List<String> ID_LEAVE, List<String> LANG_LEAVE, String language)
	{
		System.out.println("Start Lang "+ language);
		LangSearcher langSearcher = new LangSearcher();
		LangMods.Abnormals.abnormalsWoodSnifferLang(LANG_WOOD, language);
		LangMods.Abnormals.abnormalsRockWardenLang(LANG_ROCK, language);
		LangMods.Abnormals.abnormalsLeaveSnifferLang(LANG_LEAVE, language);

		langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, Reference.allMcwMods());
		langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
		langSearcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, language, Reference.allMcwModsStone());
		McwAPI.clears(LANG_WOOD, LANG_ROCK, LANG_LEAVE);
		System.out.println("Done Lang "+ language);
	}
}