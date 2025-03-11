package fr.samlegamer.utils.preset;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.api.datagen.bridges.BridgesTagsGenerator;
import fr.samlegamer.api.datagen.doors.DoorsTagsGenerator;
import fr.samlegamer.api.datagen.fences.FencesTagsGenerator;
import fr.samlegamer.api.datagen.furnitures.FurnituresTagsGenerator;
import fr.samlegamer.api.datagen.paths.PathsTagsGenerator;
import fr.samlegamer.api.datagen.roofs.RoofsTagsGenerator;
import fr.samlegamer.api.datagen.stairs.StairsTagsGenerator;
import fr.samlegamer.api.datagen.traps.TrapdoorsTagsGenerator;
import fr.samlegamer.api.datagen.windows.WindowsTagsGenerator;
import fr.samlegamer.api.lang.BridgesLangGenerator;
import fr.samlegamer.api.lang.DoorsLangGenerator;
import fr.samlegamer.api.lang.FencesLangGenerator;
import fr.samlegamer.api.lang.FurnituresLangGenerator;
import fr.samlegamer.api.lang.PathsLangGenerator;
import fr.samlegamer.api.lang.RoofsLangGenerator;
import fr.samlegamer.api.lang.StairsLangGenerator;
import fr.samlegamer.api.lang.TrapdoorsLangGenerator;
import fr.samlegamer.api.lang.WindowsLangGenerator;
import fr.samlegamer.api.lang.mod.English;
import fr.samlegamer.api.lang.mod.French;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.JsonsUtils;
import fr.samlegamer.utils.ModsList;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.IModFiles.ILang;
import fr.samlegamer.utils.IModFiles.ITagData;

public class Aurora implements Presetting
{	
	private boolean activeBridges;
	private boolean activeRoofs;
	private boolean activeFences;
	private boolean activeFurnitures;
	private boolean activeStairs;
	private boolean activePaths;
	private boolean activeDoors;
	private boolean activeTraps;
	private boolean activeWindows;
	private boolean is120;
	private ModLoaders modLoader;

	public Aurora(boolean activeBridges, boolean activeRoofs, boolean activeFences, boolean activeFurnitures, boolean activeStairs, boolean activePaths, boolean activeDoors, boolean activeTraps, boolean activeWindows, 
	boolean is120, ModLoaders modLoader)
	{
		this.activeBridges=activeBridges;
		this.activeRoofs=activeRoofs;
		this.activeFences=activeFences;
		this.activeFurnitures=activeFurnitures;
		this.activeStairs=activeStairs;
		this.activePaths=activePaths;
		this.activeDoors=activeDoors;
		this.activeTraps=activeTraps;
		this.activeWindows=activeWindows;
		this.is120=is120;
		this.modLoader=modLoader;
	}
	
	public Aurora(boolean is120)
	{
		this(true, true, true, true, true, true, true, true, true, is120, ModLoaders.FORGE);
	}

	private void genRsc(String LOCATION, String CompatModid, String txtLocMod, String ModidOfBaseMod, List<String> MAT_WOOD, Consumer<List<String>> modFunc, String compat, boolean isStem, McwModsRessources res, McwDataGen data)
	{
		modFunc.accept(MAT_WOOD);
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		res.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, isStem);
		res.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		data.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, compat, ModidOfBaseMod, modLoader);
		data.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		data.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, compat, ModidOfBaseMod, modLoader);
		
		if(compat.equals(Compatibilities.MCW_FENCES_MODID) && !ModidOfBaseMod.equals(Compatibilities.ENHANCED_MUSHROOMS_MODID))
		{
			res.createWoodBlockstateswithResearch(LOCATION, CompatModid, MAT_WOOD, "acacia_hedge");
			res.createWoodModelsBlockswithResearch(LOCATION, txtLocMod, MAT_WOOD, Boolean.FALSE, "acacia_wall");
			res.createWoodModelItemwithResearch(LOCATION, CompatModid, MAT_WOOD, "acacia_hedge");
			data.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
			data.LootTableLogAllwithResearch(LOCATION, CompatModid, MAT_WOOD, "acacia_hedge");
			data.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
		}
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

		List<String> MAT_WOOD = new ArrayList<String>();
		List<String> MAJ_WOOD = new ArrayList<String>();
		List<String> LEAVES = new ArrayList<String>();
		List<String> MAJ_LEAVES = new ArrayList<String>();
		String CompatModid = "mcwaurora";
		//String txtLocMod, ModidOfBaseMod;
		
		/*Bridges*/
		if(activeBridges)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_BRIDGES_MODID, false, new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_BRIDGES_MODID, true, new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
			MAT_WOOD.clear();

			
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),	
			Compatibilities.MCW_BRIDGES_MODID, false, new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		/*Fences*/
		if(activeFences)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_FENCES_MODID, false, new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_FENCES_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_FENCES_MODID, true, new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_FENCES_MODID));
			MAT_WOOD.clear();
			
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),
			Compatibilities.MCW_FENCES_MODID, false, new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_FENCES_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Stone Client");
		}
		
		/*Roofs*/
		if(activeRoofs)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_ROOFS_MODID, false, new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_ROOFS_MODID, true, new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),
			Compatibilities.MCW_ROOFS_MODID, false, new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Stone Client");
		}
		
		/*Furnitures*/
		if(activeFurnitures)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_FURNITURES_MODID, false, new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL), 
			new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_FURNITURES_MODID, true, new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL), 
			new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),
			Compatibilities.MCW_FURNITURES_MODID, false, new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL), 
			new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}

		/*Stairs*/
		if(activeStairs)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_STAIRS_MODID, false, new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_STAIRS_MODID, true, new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),
			Compatibilities.MCW_STAIRS_MODID, false, new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		if(activePaths)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_PATHS_MODID, false, new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_PATHS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_PATHS_MODID, true, new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_PATHS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),
			Compatibilities.MCW_PATHS_MODID, false, new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_PATHS_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		if(activeDoors)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_DOORS_MODID, false, new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_DOORS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_DOORS_MODID, true, new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_DOORS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),
			Compatibilities.MCW_DOORS_MODID, false, new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_DOORS_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		if(activeTraps)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_TRAPDOORS_MODID, false, new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_TRAPDOORS_MODID, true, new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),
			Compatibilities.MCW_TRAPDOORS_MODID, false, new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		if(activeWindows)
		{
			System.out.println("Start Wood Client");
			genRsc(LOCATION, CompatModid, Compatibilities.BAYOU_BLUES_TEXTURES, Compatibilities.BAYOU_BLUES_MODID, MAT_WOOD, list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.BAYOU_BLUES_MODID), 
			Compatibilities.MCW_WINDOWS_MODID, false, new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ENHANCED_MUSHROOMS_TEXTURES, Compatibilities.ENHANCED_MUSHROOMS_MODID, MAT_WOOD, 
			this.is120 ? list ->  ModsList.AuroraWoods1201(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID) : list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID),	
			Compatibilities.MCW_WINDOWS_MODID, true, new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
			MAT_WOOD.clear();
	
			genRsc(LOCATION, CompatModid, Compatibilities.ABUNDANCE_TEXTURES, Compatibilities.ABUNDANCE_MODID, MAT_WOOD, 
			list -> ModsList.AuroraWoods(MAT_WOOD, Compatibilities.ABUNDANCE_MODID),
			Compatibilities.MCW_WINDOWS_MODID, false, new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD), 
			new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
			
		System.out.println("Start Data/Tags/Lang/ForgeCode");
		
		if(this.is120)
		{
			ModsList.AuroraWoods1201(MAT_WOOD);
			English.Aurora.AuroraWoods1201Lang(MAJ_WOOD);
		}
		else
		{
			ModsList.AuroraWoods(MAT_WOOD);
			English.Aurora.AuroraWoodsLang(MAJ_WOOD);
		}
		ModsList.AuroraLeaves(LEAVES);
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new BridgesTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new RoofsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new FencesTagsGenerator(LEAVES));
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new FurnituresTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new StairsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new PathsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new DoorsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new TrapdoorsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, new WindowsTagsGenerator());
		
		English.Aurora.AuroraLeavesLang(MAJ_LEAVES);
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new BridgesLangGenerator());
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new RoofsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new FencesLangGenerator(LEAVES, MAJ_LEAVES));
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new FurnituresLangGenerator());
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new StairsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new PathsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new DoorsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new TrapdoorsLangGenerator());
		genLangEnglish(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new WindowsLangGenerator());
		
		MAJ_WOOD.clear();
		MAJ_LEAVES.clear();
		
		if(this.is120)
		{
			French.Aurora.AuroraWoods1201Lang(MAJ_WOOD);
		}
		else
		{
			French.Aurora.AuroraWoodsLang(MAJ_WOOD);
		}
		French.Aurora.AuroraLeavesLang(MAJ_LEAVES);
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new BridgesLangGenerator());
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new RoofsLangGenerator());
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new FencesLangGenerator(LEAVES, MAJ_LEAVES));
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new FurnituresLangGenerator());
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new StairsLangGenerator());
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new PathsLangGenerator());
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new DoorsLangGenerator());
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new TrapdoorsLangGenerator());
		genLangFrench(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new WindowsLangGenerator());

		System.out.println("Done Data/Tags/Lang");
		
		System.out.println("Start replacing");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mushroom", "enhanced_mushrooms:mushroom_stem", "minecraft:mushroom_stem");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "mushroom", "enhanced_mushrooms:mushroom_stem", "minecraft:mushroom_stem");

		System.out.println("Done replacing");

		System.out.println("Finish Aurora Registries");
	}
	
	private void genTags(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> LEAVES, ITagData tag)
	{
		tag.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tag.TagsWood(LOCATION, CompatModid, MAT_WOOD);
	}
	
	private void genLangEnglish(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> MAJ_WOOD, ILang lang)
	{
		lang.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
	}
	
	private void genLangFrench(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> MAJ_WOOD, ILang lang)
	{
		lang.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
	}
}
