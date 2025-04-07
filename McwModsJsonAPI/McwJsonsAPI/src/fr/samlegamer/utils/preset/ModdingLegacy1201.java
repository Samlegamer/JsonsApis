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

public class ModdingLegacy1201 implements Presetting
{
	private final boolean bridges;
	private final boolean roofs;
	private final boolean fences;
	private final boolean furnitures;
	private final boolean stairs;
	private final boolean traps;
	private final boolean doors;
	private final boolean paths;
	private final boolean windows;
	private final ModLoaders modLoader;

	public ModdingLegacy1201(boolean bridges, boolean roofs, boolean fences, boolean furnitures, boolean stairs, boolean traps, boolean doors, boolean paths, boolean windows, ModLoaders modLoader)
	{
		this.bridges=bridges;
		this.roofs=roofs;
		this.fences=fences;
		this.furnitures=furnitures;
		this.stairs=stairs;
		this.traps=traps;
		this.doors=doors;
		this.paths=paths;
		this.windows=windows;
		this.modLoader=modLoader;
	}

	public ModdingLegacy1201(ModLoaders modLoader)
	{
		this(true, true, true, true, true, true, true, true, true, modLoader);
	}
	
	@Override
	public void init(String LOCATION)
	{
		McwAPI.StairsGenFolder(LOCATION);
		McwAPI.FurnituresGenFolder(LOCATION);
		McwAPI.FencesGenFolder(LOCATION);
		McwAPI.RoofsGenFolder(LOCATION);
		McwAPI.BridgesGenFolder(LOCATION);
		McwAPI.PathsGenFolder(LOCATION);
		McwAPI.DoorsGenFolder(LOCATION);
		McwAPI.TrapdoorsGenFolder(LOCATION);
		McwAPI.WindowsGenFolder(LOCATION);
		McwAPI.DataGenFolder(LOCATION);

		List<String> ID_WOOD = new ArrayList<>();
		List<String> PREFIX_ID_WOOD = new ArrayList<>();
		List<String> ID_LEAVE = new ArrayList<>();
		List<String> PREFIX_ID_LEAVE = new ArrayList<>();

		List<String> LANG_WOOD = new ArrayList<>();
		List<String> LANG_LEAVE = new ArrayList<>();
		String CompatModid = "mcwmoddinglegacy";
		String txtLocMod, ModidOfBaseMod;
		
		NewModsList.ModdingLegacy.BlueSkiesBsky1201(PREFIX_ID_WOOD);
		NewModsList.ModdingLegacy.BlueSkiesTextures1201(ID_WOOD);
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);
		txtLocMod = Compatibilities.BLUE_SKIES_TEXTURES;
		ModidOfBaseMod = Compatibilities.BLUE_SKIES_MODID;

		if(bridges)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
			/*client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", ID_WOOD, PREFIX_ID_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_bridges.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);*/
		}
		
		if(roofs)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, 
					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
			/*client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", ID_WOOD, PREFIX_ID_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_roofs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);*/
		}
		
		if(fences)
		{
			McwModsRessources res = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
			McwDataGen data = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
			
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, 
					res, 
					data);

			/*client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_fences.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", ID_WOOD, PREFIX_ID_WOOD, false);
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_fences.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false);
			data_fences.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_fences.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);*/
			
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_ID_LEAVE, "acacia_hedge");
			res.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod+"/leaves", ID_LEAVE, PREFIX_ID_LEAVE, false, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_ID_LEAVE, "acacia_hedge");
			data.AdvancementsLeavesHedgesPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, PREFIX_ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, ID_LEAVE, PREFIX_ID_LEAVE, "acacia_hedge");
			data.RecipesLogAllwithResearchPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, PREFIX_ID_LEAVE, false, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);

		}
		
		if(furnitures)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_FURNITURES_MODID, 
					new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL), 
					new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));

			/*client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_furnitures.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", ID_WOOD, PREFIX_ID_WOOD, false);
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_furnitures.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_furnitures.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);*/
		}
		
		if(stairs)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_STAIRS_MODID, 
					new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_STAIRS_MODID));

			/*client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_stairs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", ID_WOOD, PREFIX_ID_WOOD, false);
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_stairs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_stairs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);*/
		}
		
		if(traps)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_TRAPDOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
		}
		
		if(doors)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_DOORS_MODID, 
					new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_DOORS_MODID));
		}

		if(paths)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID, 
					new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_PATHS_MODID));
		}
		
		if(windows)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_WINDOWS_MODID, 
					new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
		}
		ID_LEAVE.clear();
		ID_WOOD.clear();
		PREFIX_ID_WOOD.clear();
		PREFIX_ID_LEAVE.clear();

		/*For Crystal Bridges/Roofs*/
		PREFIX_ID_WOOD.add("bsky_crystallized");
		ID_WOOD.add("crystallized");
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);

		if(bridges)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, 
					new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));

			/*client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", ID_WOOD, PREFIX_ID_WOOD, false);
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_bridges.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_bridges.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);*/
		}
		
		if(roofs)
		{
			genRessourcesBsky(LOCATION, CompatModid, txtLocMod, PREFIX_ID_WOOD, ID_WOOD, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, 
					new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
					new McwDataGen(Compatibilities.MCW_ROOFS_MODID));

			/*client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", ID_WOOD, PREFIX_ID_WOOD, false);
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_roofs.AdvancementsLogAllPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_roofs.RecipesLogAllIsChargedPrefixed(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);*/
		}
		
		if(fences)
		{
			McwModsRessources res = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
			McwDataGen data = new McwDataGen(Compatibilities.MCW_FENCES_MODID);

			//Hedges
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_ID_LEAVE, "acacia_hedge");
			res.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod+"/leaves", ID_LEAVE, PREFIX_ID_LEAVE, false, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_ID_LEAVE, "acacia_hedge");
			data.AdvancementsLeavesHedgesPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, PREFIX_ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, ID_LEAVE, PREFIX_ID_LEAVE, "acacia_hedge");
			data.RecipesLogAllwithResearchPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, PREFIX_ID_LEAVE, false, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
		ID_WOOD.clear();
		PREFIX_ID_WOOD.clear();
		ID_LEAVE.clear();
		PREFIX_ID_LEAVE.clear();

		txtLocMod = Compatibilities.PREMIUM_WOOD_TEXTURES;
		ModidOfBaseMod = Compatibilities.PREMIUM_WOOD_MODID;
		PREFIX_ID_WOOD.add("pwood_magic");
		ID_WOOD.add("magic");
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);
		genPwoodWood(LOCATION, CompatModid, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, ID_LEAVE, PREFIX_ID_LEAVE, ModidOfBaseMod, ID_WOOD.get(0));
		ID_WOOD.clear();
		PREFIX_ID_WOOD.clear();
		ID_LEAVE.clear();
		PREFIX_ID_LEAVE.clear();

		PREFIX_ID_WOOD.add("pwood_maple");
		ID_WOOD.add("maple");
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);
		genPwoodWood(LOCATION, CompatModid, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, ID_LEAVE, PREFIX_ID_LEAVE, ModidOfBaseMod, ID_WOOD.get(0));
		ID_WOOD.clear();
		PREFIX_ID_WOOD.clear();
		ID_LEAVE.clear();
		PREFIX_ID_LEAVE.clear();

		PREFIX_ID_WOOD.add("pwood_purple_heart");
		ID_WOOD.add("purple_heart");
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);
		genPwoodWood(LOCATION, CompatModid, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, ID_LEAVE, PREFIX_ID_LEAVE, ModidOfBaseMod, ID_WOOD.get(0));
		ID_WOOD.clear();
		PREFIX_ID_WOOD.clear();
		ID_LEAVE.clear();
		PREFIX_ID_LEAVE.clear();

		PREFIX_ID_WOOD.add("pwood_silverbell");
		ID_WOOD.add("silverbell");
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);
		genPwoodWood(LOCATION, CompatModid, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, ID_LEAVE, PREFIX_ID_LEAVE, ModidOfBaseMod, ID_WOOD.get(0));
		ID_WOOD.clear();
		PREFIX_ID_WOOD.clear();
		ID_LEAVE.clear();
		PREFIX_ID_LEAVE.clear();

		PREFIX_ID_WOOD.add("pwood_tiger");
		ID_WOOD.add("tiger");
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);
		genPwoodWood(LOCATION, CompatModid, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, ID_LEAVE, PREFIX_ID_LEAVE, ModidOfBaseMod, ID_WOOD.get(0));
		ID_WOOD.clear();
		PREFIX_ID_WOOD.clear();
		ID_LEAVE.clear();
		PREFIX_ID_LEAVE.clear();

		PREFIX_ID_WOOD.add("pwood_willow");
		ID_WOOD.add("willow");
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		ID_LEAVE.addAll(ID_WOOD);
		genPwoodWood(LOCATION, CompatModid, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, ID_LEAVE, PREFIX_ID_LEAVE, ModidOfBaseMod, ID_WOOD.get(0));
		ID_WOOD.clear();
		PREFIX_ID_WOOD.clear();
		ID_LEAVE.clear();
		PREFIX_ID_LEAVE.clear();


		NewModsList.ModdingLegacy.BlueSkiesBsky1201(PREFIX_ID_WOOD);
		NewModsList.ModdingLegacy.PremiumWoodPwood(PREFIX_ID_WOOD);
		PREFIX_ID_WOOD.add("bsky_crystallized");
		LANG_WOOD.add("Crystallized");

		TagsGenerator tags = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tags.axeCustom(LOCATION, CompatModid, PREFIX_ID_WOOD, "RoofsAndBridges", List.of(Compatibilities.MCW_ROOFS_MODID, Compatibilities.MCW_BRIDGES_MODID));

		tags.vanilla(LOCATION, CompatModid, PREFIX_ID_WOOD, List.of(), List.of(), List.of(Compatibilities.MCW_ROOFS_MODID, Compatibilities.MCW_BRIDGES_MODID));
		tags.mcwMods(LOCATION, CompatModid, PREFIX_ID_WOOD, List.of(), List.of(), List.of(Compatibilities.MCW_ROOFS_MODID, Compatibilities.MCW_BRIDGES_MODID));

		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/blocks/", "fence_gates.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/blocks/", "fences.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/blocks/", "walls.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/blocks/", "wooden_doors.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/blocks/", "wooden_fences.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/blocks/", "wooden_trapdoors.json");

		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/items/", "fences.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/items/", "walls.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/items/", "wooden_doors.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/items/", "wooden_fences.json");
		JsonsUtils.deleter(LOCATION+File.separator+"data/tagsNewGen/minecraft/tags/items/", "wooden_trapdoors.json");
//		BridgesTagsGenerator bridges_tags = new BridgesTagsGenerator();
//		bridges_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		bridges_tags.TagsWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		RoofsTagsGenerator roofs_tags = new RoofsTagsGenerator();
//		roofs_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
		PREFIX_ID_WOOD.clear();
		LANG_WOOD.clear();

		NewModsList.ModdingLegacy.BlueSkiesBsky1201(PREFIX_ID_WOOD);
		NewModsList.ModdingLegacy.PremiumWoodPwood(PREFIX_ID_WOOD);
		LANG_LEAVE.addAll(LANG_WOOD);
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		PREFIX_ID_LEAVE.add("bsky_crystallized");
		LANG_LEAVE.add("Crystallized");

		tags.axeCustom(LOCATION, CompatModid, PREFIX_ID_WOOD, "Other", List.of(Compatibilities.MCW_FURNITURES_MODID,
				Compatibilities.MCW_FENCES_MODID,
				Compatibilities.MCW_TRAPDOORS_MODID,
				Compatibilities.MCW_PATHS_MODID,
				Compatibilities.MCW_DOORS_MODID,
				Compatibilities.MCW_WINDOWS_MODID,
				Compatibilities.MCW_STAIRS_MODID));

		tags.hoe(LOCATION, CompatModid, PREFIX_ID_LEAVE);

		tags.vanilla(LOCATION, CompatModid, PREFIX_ID_WOOD, PREFIX_ID_LEAVE, List.of(), List.of(Compatibilities.MCW_FURNITURES_MODID,
				Compatibilities.MCW_FENCES_MODID,
				Compatibilities.MCW_TRAPDOORS_MODID,
				Compatibilities.MCW_PATHS_MODID,
				Compatibilities.MCW_DOORS_MODID,
				Compatibilities.MCW_WINDOWS_MODID,
				Compatibilities.MCW_STAIRS_MODID));
		tags.mcwMods(LOCATION, CompatModid, PREFIX_ID_WOOD, PREFIX_ID_LEAVE, List.of(), List.of(Compatibilities.MCW_FURNITURES_MODID,
				Compatibilities.MCW_FENCES_MODID,
				Compatibilities.MCW_TRAPDOORS_MODID,
				Compatibilities.MCW_PATHS_MODID,
				Compatibilities.MCW_DOORS_MODID,
				Compatibilities.MCW_WINDOWS_MODID,
				Compatibilities.MCW_STAIRS_MODID));


//		FencesTagsGenerator fences_tags = new FencesTagsGenerator(PREFIX_ID_LEAVE);
//		fences_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		fences_tags.HoeDataGenWood(LOCATION, CompatModid, PREFIX_ID_LEAVE);
//		fences_tags.TagsWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//
//		FurnituresTagsGenerator furni_tags = new FurnituresTagsGenerator();
//		furni_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		furni_tags.TagsWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//
//		StairsTagsGenerator stairs_tags = new StairsTagsGenerator();
//		stairs_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		stairs_tags.TagsWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//
//		PathsTagsGenerator paths_tags = new PathsTagsGenerator();
//		paths_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		paths_tags.TagsWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//
//		DoorsTagsGenerator doors_tags = new DoorsTagsGenerator();
//		doors_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		doors_tags.TagsWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//
//		TrapdoorsTagsGenerator traps_tags = new TrapdoorsTagsGenerator();
//		traps_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		traps_tags.TagsWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//
//		WindowsTagsGenerator wins_tags = new WindowsTagsGenerator();
//		wins_tags.AxeDataGenWood(LOCATION, CompatModid, PREFIX_ID_WOOD);
//		wins_tags.TagsWood(LOCATION, CompatModid, PREFIX_ID_WOOD);

		McwAPI.clears(LANG_LEAVE, PREFIX_ID_LEAVE, PREFIX_ID_WOOD, LANG_WOOD);

		addLang(LOCATION, CompatModid, PREFIX_ID_WOOD, LANG_WOOD, PREFIX_ID_LEAVE, LANG_LEAVE, "en_us", "Crystallized");
		addLang(LOCATION, CompatModid, PREFIX_ID_WOOD, LANG_WOOD, PREFIX_ID_LEAVE, LANG_LEAVE, "fr_fr", "cristallisé");


		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "crystallized", "blue_skies:crystallized_fence", "blue_skies:crystallized_wall");


		for(String folderInModel : ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD.getPathList())
		{
			JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+ folderInModel + File.separator, "crystallized", "stripped_crystallized_log_side", "crystallized_planks");
		}

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+ "hedges" + File.separator, "bsky_comet", "comet_leaves", "comet_leaves_can_grow");
	}

	private void addLang(String LOCATION, String CompatModid, List<String> PREFIX_ID_WOOD, List<String> LANG_WOOD, List<String> PREFIX_ID_LEAVE,
						 List<String> LANG_LEAVE, String language, String cristalized)
	{
		LangSearcher langMods = new LangSearcher();

		NewModsList.ModdingLegacy.BlueSkiesBsky1201(PREFIX_ID_WOOD);
		NewModsList.ModdingLegacy.PremiumWoodPwood(PREFIX_ID_WOOD);
		LangMods.ModdingLegacy.blueSkiesWoodSnifferLang(LANG_WOOD, language);
		LangMods.ModdingLegacy.premiumWoodWoodLang(LANG_WOOD, language);
		LANG_LEAVE.addAll(LANG_WOOD);
		PREFIX_ID_LEAVE.addAll(PREFIX_ID_WOOD);
		PREFIX_ID_LEAVE.add("bsky_crystallized");
		LANG_LEAVE.add(cristalized);

		langMods.initWood(LOCATION, CompatModid, PREFIX_ID_WOOD, LANG_WOOD, language,
				List.of(Compatibilities.MCW_FURNITURES_MODID,
						Compatibilities.MCW_FENCES_MODID,
						Compatibilities.MCW_TRAPDOORS_MODID,
						Compatibilities.MCW_PATHS_MODID,
						Compatibilities.MCW_DOORS_MODID,
						Compatibilities.MCW_WINDOWS_MODID,
						Compatibilities.MCW_STAIRS_MODID));
		langMods.initLeaves(LOCATION, CompatModid, PREFIX_ID_LEAVE, LANG_LEAVE, language);
		McwAPI.clears(PREFIX_ID_WOOD, LANG_WOOD, PREFIX_ID_LEAVE, LANG_LEAVE);

		NewModsList.ModdingLegacy.BlueSkiesBsky1201(PREFIX_ID_WOOD);
		NewModsList.ModdingLegacy.PremiumWoodPwood(PREFIX_ID_WOOD);
		LangMods.ModdingLegacy.blueSkiesWoodSnifferLang(LANG_WOOD, language);
		LangMods.ModdingLegacy.premiumWoodWoodLang(LANG_WOOD, language);
		PREFIX_ID_WOOD.add("bsky_crystallized");
		LANG_WOOD.add(cristalized);

		JsonsUtils.addToLangWood(LOCATION, CompatModid, PREFIX_ID_WOOD, LANG_WOOD, language,
				List.of(Compatibilities.MCW_ROOFS_MODID,
						Compatibilities.MCW_BRIDGES_MODID));
		McwAPI.clears(PREFIX_ID_WOOD, LANG_WOOD);
	}

	private void genRessourcesBsky(String LOCATION, String CompatModid, String txtLocMod, List<String> PREFIX_ID_WOOD, List<String> ID_WOOD, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen data)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
		res.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod+"/wood", ID_WOOD, PREFIX_ID_WOOD, false);
		res.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
		data.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, compat, ModidOfBaseMod, modLoader);
		data.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
		data.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, compat, ModidOfBaseMod, false, modLoader);
	}

	public void genPwoodWood(String LOCATION, String CompatModid, String txtLocMod, List<String> ID_WOOD, List<String> PREFIX_ID_WOOD, List<String> ID_LEAVE, List<String> PREFIX_ID_LEAVE, String ModidOfBaseMod, String folderWood)
	{
		/*Instance Bridges*/
		final McwModsRessources client_wood_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
		final McwDataGen data_bridges = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);
		
		/*Instance Roofs*/
		final McwModsRessources client_wood_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
		final McwDataGen data_roofs = new McwDataGen(Compatibilities.MCW_ROOFS_MODID);
		
		/*Instance Fences*/
		final McwModsRessources client_wood_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
		final McwDataGen data_fences = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
		
		/*Instance Furniture*/
		final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
		final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);

		/*Instance Stairs*/
		final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
		final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);

		/*Instance Paths*/
		final McwModsRessources client_wood_paths = new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD);
		final McwDataGen data_paths = new McwDataGen(Compatibilities.MCW_PATHS_MODID);

		/*Instance Doors*/
		final McwModsRessources client_wood_doors = new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD);
		final McwDataGen data_doors = new McwDataGen(Compatibilities.MCW_DOORS_MODID);

		/*Instance Trapdoors*/
		final McwModsRessources client_wood_traps = new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD);
		final McwDataGen data_traps = new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID);

		/*Instance Stairs*/
		final McwModsRessources client_wood_windows = new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD);
		final McwDataGen data_windows = new McwDataGen(Compatibilities.MCW_WINDOWS_MODID);

		if(bridges)
		{
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_bridges.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_bridges.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, modLoader);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_bridges.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod, true, modLoader);
		}
		
		if(roofs)
		{
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_roofs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_roofs.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, modLoader);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_roofs.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod, true, modLoader);
		}
		
		if(fences)
		{
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_fences.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_fences.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data_fences.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_fences.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, true, modLoader);
		}
		
		if(furnitures)
		{
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_furnitures.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_furnitures.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod, modLoader);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_furnitures.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod, true, modLoader);
		}
		
		if(fences)
		{
			client_wood_fences.createWoodBlockstateswithResearch(LOCATION, CompatModid, PREFIX_ID_LEAVE, "acacia_hedge");
			client_wood_fences.createWoodModelsBlockswithResearchPrefixed(LOCATION, txtLocMod, ID_LEAVE, PREFIX_ID_LEAVE, Boolean.FALSE, "acacia_wall");
			client_wood_fences.createWoodModelItemwithResearch(LOCATION, CompatModid, PREFIX_ID_LEAVE, "acacia_hedge");
			data_fences.AdvancementsLeavesHedgesPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, PREFIX_ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data_fences.LootTableLogAllwithResearchPrefixed(LOCATION, CompatModid, ID_LEAVE, PREFIX_ID_LEAVE, "acacia_hedge");
			data_fences.RecipesLogAllwithResearchPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, PREFIX_ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
		
		if(stairs)
		{
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_stairs.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_stairs.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod, modLoader);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_stairs.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod, true, modLoader);
		}
		
		if(paths)
		{
			client_wood_paths.setModid(CompatModid);
			client_wood_paths.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_paths.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_paths.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_paths.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_PATHS_MODID, ModidOfBaseMod, modLoader);
			data_paths.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_paths.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_PATHS_MODID, ModidOfBaseMod, true, modLoader);
		}
		
		if(doors)
		{
			client_wood_doors.setModid(CompatModid);
			client_wood_doors.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_doors.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_doors.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_doors.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_DOORS_MODID, ModidOfBaseMod, modLoader);
			data_doors.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_doors.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_DOORS_MODID, ModidOfBaseMod, true, modLoader);
		}
		
		if(traps)
		{
			client_wood_traps.setModid(CompatModid);
			client_wood_traps.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_traps.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_traps.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_traps.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_TRAPDOORS_MODID, ModidOfBaseMod, modLoader);
			data_traps.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_traps.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_TRAPDOORS_MODID, ModidOfBaseMod, true, modLoader);
		}
		
		if(windows)
		{
			client_wood_windows.setModid(CompatModid);
			client_wood_windows.createWoodBlockstates(LOCATION, CompatModid, PREFIX_ID_WOOD);
			client_wood_windows.createWoodModelsBlocksPrefixed(LOCATION, txtLocMod, ID_WOOD, PREFIX_ID_WOOD, false, "1.20.1");
			client_wood_windows.createWoodModelItem(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_windows.AdvancementsLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_WINDOWS_MODID, ModidOfBaseMod, modLoader);
			data_windows.LootTableLogAll(LOCATION, CompatModid, PREFIX_ID_WOOD);
			data_windows.RecipesLogAllPrefixedIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, PREFIX_ID_WOOD, false, Compatibilities.MCW_WINDOWS_MODID, ModidOfBaseMod, true, modLoader);
		}
	}
}