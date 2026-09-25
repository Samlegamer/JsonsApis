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
import java.util.ArrayList;
import java.util.List;

public class Betters implements Presetting
{
	private final List<String> mcwMods;
	private final ModLoaders modLoader;
	private final Versions versions;

	public Betters()
	{
		this(Versions.NONE);
	}

	public Betters(Versions versions)
	{
		this(Reference.allMcwMods(), ModLoaders.FORGE, versions);
	}

	public Betters(List<String> mcwMods, ModLoaders modLoader, Versions versions)
	{
		this.mcwMods = mcwMods;
		this.modLoader=modLoader;
		this.versions=versions;
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
		List<String> ID_LEAVE = new ArrayList<>();
		
		List<String> LANG_WOOD = new ArrayList<>();
		List<String> LANG_LEAVE = new ArrayList<>();
		String CompatModid = "mcwbetters";
		String txtLocMod, ModidOfBaseMod;

		for(String mod : mcwMods)
		{
			ClientFolderTypes clientFolderTypes = Reference.getFoldersWoodWithMcwMod(mod);

			final McwModsRessources client = new McwModsRessources(mod, clientFolderTypes);
			final McwDataGen data = new McwDataGen(mod);

			System.out.println("Start Wood "+ mod +" Client/Data");
			NewModsList.Betters.bettersWood(ID_WOOD, Compatibilities.BETTER_END_MODID, versions);
			txtLocMod = versions == Versions.NONE ? Compatibilities.BETTER_END_FORGE_TEXTURES : Compatibilities.BETTER_END_TEXTURES;
			ModidOfBaseMod = Compatibilities.BETTER_END_MODID;
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Betters.bettersWood(ID_WOOD, Compatibilities.BETTER_NETHER_MODID, versions);
			txtLocMod = Compatibilities.BETTER_NETHER_TEXTURES;
			ModidOfBaseMod = Compatibilities.BETTER_NETHER_MODID;
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			if(mod.equals(Compatibilities.MCW_FENCES_MODID))
			{
				NewModsList.Betters.bettersLeaves(ID_LEAVE, Compatibilities.BETTER_END_MODID, versions);
				txtLocMod = versions == Versions.NONE ? Compatibilities.BETTER_END_FORGE_TEXTURES : Compatibilities.BETTER_END_TEXTURES;
				ModidOfBaseMod = Compatibilities.BETTER_END_MODID;
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();

				NewModsList.Betters.bettersLeaves(ID_LEAVE, Compatibilities.BETTER_NETHER_MODID, versions);
				txtLocMod = Compatibilities.BETTER_NETHER_TEXTURES;
				ModidOfBaseMod = Compatibilities.BETTER_NETHER_MODID;
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();
			}

			System.out.println("Done Wood "+ mod +" Client/Data");
		}

		NewModsList.Betters.bettersWood(ID_WOOD, versions);
		NewModsList.Betters.bettersLeaves(ID_LEAVE, versions);

		System.out.println("Start Tags");
		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());
		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new ArrayList<>(), Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, new ArrayList<>(), Reference.allMcwMods());
		System.out.println("Done Tags");

		if(versions == Versions.MM)
		{
			McwAPI.fixForPaleGarden(LOCATION, CompatModid, ID_WOOD);
		}

		if(versions == Versions.NONE || versions == Versions.CAVEANDCLIFFS || versions == Versions.TRICKYTRIALS || versions == Versions.MM) {
			for (String mod : mcwMods) {
				ClientFolderTypes clientFolderTypes = Reference.getFoldersWoodWithMcwMod(mod);
				for (String path : clientFolderTypes.getPathList()) {
					String pathModel = LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + path + File.separator;
					String[] valuesEnd = {"dragon_tree", "end_lotus", "helix_tree", "jellyshroom", "lacugrove", "lucernia", "mossy_glowshroom", "pythadendron", "tenanea", "umbrella_tree"};
					String[] valuesNether = {"mushroom_fir", "wart", "willow"};

					for (String value : valuesEnd) {
						JsonsUtils.replacer(pathModel, value, value + "_log", value + "_log_side");
						JsonsUtils.replacer(pathModel, value, "stripped_" + value + "_log", value + "_stripped_log_side");
						JsonsUtils.replacer(pathModel, value, value + "_stripped_log_side_side", value + "_stripped_log_side");
						JsonsUtils.replacer(pathModel, value, value + "_log_side_top", value + "_stripped_log_top");
					}

					for (String value : valuesNether) {
						JsonsUtils.replacer(pathModel, value, value + "_log", value + "_bark");
						JsonsUtils.replacer(pathModel, value, "stripped_" + value + "_log", "striped_log_" + value + "_side");
						JsonsUtils.replacer(pathModel, value, "stripped_" + value + "_bark", "striped_log_" + value + "_side");
						JsonsUtils.replacer(pathModel, value, value + "_bark_top", "striped_log_" + value + "_top");
					}

					String stripped_anchor_tree_log_replacement = versions != Versions.NONE ? "anchor_tree_stripped_log_side_1" : "striped_log_anchor_tree_side_1";
					String anchor_tree_log_side_top_replacement = versions != Versions.NONE ? "anchor_tree_stripped_log_top" : "striped_log_anchor_tree_top";
					JsonsUtils.replacer(pathModel, "anchor_tree", "anchor_tree_log", "anchor_tree_log_side");
					JsonsUtils.replacer(pathModel, "anchor_tree", "stripped_anchor_tree_log", stripped_anchor_tree_log_replacement);
					JsonsUtils.replacer(pathModel, "anchor_tree", stripped_anchor_tree_log_replacement+"_side", stripped_anchor_tree_log_replacement);
					JsonsUtils.replacer(pathModel, "anchor_tree", "anchor_tree_log_side_top", anchor_tree_log_side_top_replacement);

					JsonsUtils.replacer(pathModel, "mushroom", "mushroom_log", "mushroom_stem_side_mcw");
					JsonsUtils.replacer(pathModel, "mushroom", "betternether:block/stripped_mushroom_log", "minecraft:block/mushroom_stem");
					JsonsUtils.replacer(pathModel, "mushroom", "betternether:block/stripped_mushroom_stem_side", "minecraft:block/mushroom_stem");
					JsonsUtils.replacer(pathModel, "mushroom", "betternether:block/mushroom_stem_side_mcw_top_mcw", "minecraft:block/mushroom_stem");
					JsonsUtils.replacer(pathModel, "mushroom", "minecraft:block/mushroom_stem_mcw", "minecraft:block/mushroom_stem");

					String nether_sakura_log_side_top_replacement = versions != Versions.NONE ? "nether_sakura_stripped_log_top" : "striped_log_nether_sakura_top";
					JsonsUtils.replacer(pathModel, "nether_sakura", "nether_sakura_log", "nether_sakura_log_side");
					JsonsUtils.replacer(pathModel, "nether_sakura", "stripped_nether_sakura_log", "striped_log_nether_sakura_side");
					JsonsUtils.replacer(pathModel, "nether_sakura", "striped_log_nether_sakura_side_side", "striped_log_nether_sakura_side");
					JsonsUtils.replacer(pathModel, "nether_sakura", "nether_sakura_log_side_top", nether_sakura_log_side_top_replacement);

					JsonsUtils.replacer(pathModel, "rubeus", "rubeus_log", "rubeus_log_side");
					JsonsUtils.replacer(pathModel, "rubeus", "stripped_rubeus_log", "striped_rubeus_log_side");
					JsonsUtils.replacer(pathModel, "rubeus", "striped_rubeus_log_side_side", "striped_rubeus_log_side");
					JsonsUtils.replacer(pathModel, "rubeus", "rubeus_log_side_top", "striped_rubeus_log_top");

					String stalagnate_bark_side_top_replacement = versions != Versions.NONE ? "stalagnate_stripped_log_top" : "striped_log_stalagnate_top";
					JsonsUtils.replacer(pathModel, "stalagnate", "stalagnate_log", "stalagnate_bark_side");
					JsonsUtils.replacer(pathModel, "stalagnate", "stripped_stalagnate_log", "striped_log_stalagnate_side");
					JsonsUtils.replacer(pathModel, "stalagnate", "stripped_stalagnate_bark_side", "striped_log_stalagnate_side");
					JsonsUtils.replacer(pathModel, "stalagnate", "stalagnate_bark_side_top", stalagnate_bark_side_top_replacement);

					if(versions == Versions.TRICKYTRIALS || versions == Versions.MM)
					{
						JsonsUtils.replacer(pathModel, "rubeus", "striped_rubeus_log_side",  "stripped_rubeus_log_side");
						JsonsUtils.replacer(pathModel, "rubeus", "striped_rubeus_log_top",  "stripped_rubeus_log_top");
					}

					if(versions != Versions.NONE)
					{
						JsonsUtils.replacer(pathModel, "mushroom", "mushroom_planks\"", "nether_mushroom_planks\"");

						JsonsUtils.replacer(pathModel, "mushroom_fir", "striped_log_mushroom_fir_side", "mushroom_fir_stripped_log_side");
						JsonsUtils.replacer(pathModel, "wart", "striped_log_wart_side", "wart_stripped_log_side");
						JsonsUtils.replacer(pathModel, "willow", "striped_log_willow_side", "willow_stripped_log_side");
						JsonsUtils.replacer(pathModel, "mushroom_fir", "striped_log_mushroom_fir_top", "mushroom_fir_stripped_log_top");
						JsonsUtils.replacer(pathModel, "wart", "striped_log_wart_top", "wart_stripped_log_top");
						JsonsUtils.replacer(pathModel, "willow", "striped_log_willow_top", "willow_stripped_log_top");

						JsonsUtils.replacer(pathModel, "nether_sakura", "striped_log_nether_sakura_side", "nether_sakura_stripped_log_side");
						JsonsUtils.replacer(pathModel, "stalagnate", "striped_log_stalagnate_side", "stalagnate_stripped_log_side");
					}

					if(versions == Versions.MM)
					{
						JsonsUtils.replacer(pathModel, "gloomwood", "/gloomwood_log", "/gloomwood_log_side");
						JsonsUtils.replacer(pathModel, "gloomwood", "stripped_gloomwood_log", "gloomwood_stripped_log_side");
						JsonsUtils.replacer(pathModel, "gloomwood", "/gloomwood_log_side_top", "/gloomwood_log_top");
						JsonsUtils.replacer(pathModel, "gloomwood", "/gloomwood_log_side_top\"", "/gloomwood_log_top\"");

						JsonsUtils.replacer(pathModel, "dark_gloomwood", "/gloomwood_dark_log_side_top", "/gloomwood_dark_log_top");
						JsonsUtils.replacer(pathModel, "dark_gloomwood", "dark_gloomwood_planks", "gloomwood_dark_planks");
						JsonsUtils.replacer(pathModel, "dark_gloomwood", "dark_gloomwood_log", "gloomwood_dark_log_side");
						JsonsUtils.replacer(pathModel, "dark_gloomwood", "stripped_dark_gloomwood_log", "gloomwood_dark_stripped_log_side");
						JsonsUtils.replacer(pathModel, "dark_gloomwood", "stripped_gloomwood_dark_log_side", "gloomwood_dark_stripped_log_side");
						JsonsUtils.replacer(pathModel, "dark_gloomwood", "gloomwood_dark_stripped_log_side_side", "gloomwood_dark_stripped_log_side");
						JsonsUtils.replacer(pathModel, "dark_gloomwood", "dark_gloomwood_log_side_top", "gloomwood_dark_stripped_log_top");

						JsonsUtils.replacer(pathModel, "dark_gloomwood", "/gloomwood_dark_log_side_top\"", "/gloomwood_dark_stripped_log_top\"");
						JsonsUtils.replacer(pathModel, "dark_gloomwood", "/gloomwood_dark_planks_path\"", "/dark_gloomwood_planks_path\"");
					}
				}
			}
		}
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "lucernia", "lucernia_leaves", "lucernia_leaves_1");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "nether_sakura", "nether_sakura_leaves", "nether_sakura_leaves_2");

		genLang(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_LEAVE, LANG_LEAVE, "en_us");
		System.out.println("Finish Betters Registries");
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

	protected void genHedges(String LOCATION, String CompatModid, List<String> ID_LEAVE, String TextureLocationFormodid, String ModidOfBaseMod, McwModsRessources res, McwDataGen data)
	{
		res.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		res.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, Boolean.FALSE, "acacia_wall");
		res.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		data.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		data.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
		data.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
	}

	private void genLang(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> LANG_WOOD, List<String> ID_LEAVE, List<String> LANG_LEAVE, String language)
	{
		System.out.println("Start Lang "+ language);
		LangSearcher langSearcher = new LangSearcher();
		LangMods.Betters.bettersWoodLang(LANG_WOOD, language, versions);
		LangMods.Betters.bettersLeaveLang(LANG_LEAVE, language, versions);

		langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, Reference.allMcwMods());
		langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
		McwAPI.clears(LANG_WOOD, LANG_LEAVE);
		System.out.println("Done Lang "+ language);
	}
}