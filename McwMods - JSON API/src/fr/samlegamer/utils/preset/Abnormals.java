package fr.samlegamer.utils.preset;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClientFolderTypes;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
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
import fr.samlegamer.utils.*;
import fr.samlegamer.utils.IModFiles.ILang;
import fr.samlegamer.utils.IModFiles.ITagData;

public class Abnormals implements Presetting
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

	public Abnormals()
	{
		this(true, true, true, true, true, true, true, true, true);
	}
	
	public Abnormals(boolean activeBridges, boolean activeRoofs, boolean activeFences, boolean activeFurnitures, boolean activeStairs, boolean activePaths, boolean activeDoors, boolean activeTraps, boolean activeWindows)
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
	}
	
	protected void genRessources(String LOCATION, String CompatModid, List<String> MAT_WOOD, String txtLocMod, String ModidOfBaseMod, boolean isStem, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.setModid(CompatModid);
		res.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
		res.createWoodModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, isStem);
		res.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
		dat.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem);
		dat.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
		dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, isStem, compat, ModidOfBaseMod);
	}
	
	protected void genRessourcesStone(String LOCATION, String CompatModid, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String txtLocMod, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat)
	{
		res.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
		res.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
		res.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
		dat.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
		dat.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
		dat.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, FLOOR, compat, ModidOfBaseMod);

	}

	protected void genHedges(String LOCATION, String CompatModid, List<String> LEAVES, String TextureLocationFormodid, String ModidOfBaseMod, McwModsRessources res, McwDataGen data)
	{
		res.createWoodBlockstateswithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		res.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, LEAVES, Boolean.FALSE, "acacia_wall");
		res.createWoodModelItemwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.AdvancementsLeavesHedges(LOCATION, CompatModid, ModidOfBaseMod, LEAVES);
		data.LootTableLogAllwithResearch(LOCATION, CompatModid, LEAVES, "acacia_hedge");
		data.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, LEAVES, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
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

		List<String> MAT_WOOD = new ArrayList<String>();
		List<String> MAT_ROCK = new ArrayList<String>();
		List<String> WALL = new ArrayList<String>();
		List<String> FLOOR = new ArrayList<String>();
		List<String> MAJ_WOOD = new ArrayList<String>();
		List<String> MAJ_ROCK = new ArrayList<String>();
		List<String> LEAVES = new ArrayList<String>();
		List<String> MAJ_LEAVES = new ArrayList<String>();
		String CompatModid = "mcwabnormals";
		String txtLocMod, ModidOfBaseMod;

		/*Bridges*/
		if(activeBridges)
		{
			/*Instance Bridges*/
			final McwModsRessources client_wood_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD);
			final McwModsRessources client_stone_bridges = new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE);
			final McwDataGen data_bridges = new McwDataGen(Compatibilities.MCW_BRIDGES_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; // "environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; // "upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_BRIDGES_MODID, client_wood_bridges, data_bridges);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			client_wood_bridges.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_bridges.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
			client_wood_bridges.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_bridges.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_bridges.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
	
			
			
			System.out.println("Start Stone Client");
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.BUZZBEES_MODID);
			txtLocMod = Compatibilities.BUZZBEES_TEXTURES; //"buzzier_bees:block";
			ModidOfBaseMod = Compatibilities.BUZZBEES_MODID; //"buzzier_bees";
			genRessourcesStone(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, client_stone_bridges, data_bridges);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			client_stone_bridges.createStoneBlockstates(LOCATION, CompatModid, MAT_ROCK);
			client_stone_bridges.createStoneModelsBlocks(LOCATION, txtLocMod, MAT_ROCK, WALL, FLOOR);
			client_stone_bridges.createStoneModelItem(LOCATION, CompatModid, MAT_ROCK);
			data_bridges.AdvancementsStoneAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK);
			data_bridges.LootTableStoneAll(LOCATION, CompatModid, MAT_ROCK);
			data_bridges.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_ROCK, List.of("smooth_red_arid_sandstone", "smooth_arid_sandstone"), Compatibilities.MCW_BRIDGES_MODID, ModidOfBaseMod);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
	
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessourcesStone(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID, client_stone_bridges, data_bridges);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			System.out.println("Done Stone Client");
		}
		
		/*Fences*/
		if(activeFences)
		{
			/*Instance Fences*/
			final McwModsRessources client_wood_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
			final McwModsRessources client_stone_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE);
			final McwDataGen data_fences = new McwDataGen(Compatibilities.MCW_FENCES_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			ModsList.abnormalsLeaves(LEAVES, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
			genHedges(LOCATION, CompatModid, LEAVES, txtLocMod, ModidOfBaseMod, client_wood_fences, data_fences);
			LEAVES.clear();
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			ModsList.abnormalsLeaves(LEAVES, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
			genHedges(LOCATION, CompatModid, LEAVES, txtLocMod, ModidOfBaseMod, client_wood_fences, data_fences);
			LEAVES.clear();
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			ModsList.abnormalsLeaves(LEAVES, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
			genHedges(LOCATION, CompatModid, LEAVES, txtLocMod, ModidOfBaseMod, client_wood_fences, data_fences);
			MAT_WOOD.clear();
			LEAVES.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			ModsList.abnormalsLeaves(LEAVES, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
			genHedges(LOCATION, CompatModid, LEAVES, txtLocMod, ModidOfBaseMod, client_wood_fences, data_fences);
			MAT_WOOD.clear();
			LEAVES.clear();
			
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			client_wood_fences.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_fences.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
			client_wood_fences.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_fences.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_fences.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_fences.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
	
			System.out.println("Start Stone Client");
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.BUZZBEES_MODID);
			txtLocMod = Compatibilities.BUZZBEES_TEXTURES; //"buzzier_bees:block";
			ModidOfBaseMod = Compatibilities.BUZZBEES_MODID; //"buzzier_bees";
			genRessourcesStone(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, client_stone_fences, data_fences);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessourcesStone(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, client_stone_fences, data_fences);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
	
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessourcesStone(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, client_stone_fences, data_fences);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			System.out.println("Done Stone Client");
		}
		
		/*Roofs*/
		if(activeRoofs)
		{
			/*Instance Roofs*/
			final McwModsRessources client_wood_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
			final McwModsRessources client_stone_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
			final McwDataGen data_roofs = new McwDataGen(Compatibilities.MCW_ROOFS_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
			MAT_WOOD.clear();
			
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			client_wood_roofs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_roofs.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
			client_wood_roofs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_roofs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_roofs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_ROOFS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
	
			System.out.println("Start Stone Client");
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.BUZZBEES_MODID);
			txtLocMod = Compatibilities.BUZZBEES_TEXTURES; //"buzzier_bees:block";
			ModidOfBaseMod = Compatibilities.BUZZBEES_MODID; //"buzzier_bees";
			genRessourcesStone(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, client_stone_roofs, data_roofs);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessourcesStone(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, client_stone_roofs, data_roofs);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
	
			ModsList.abnormalsRock(MAT_ROCK, WALL, FLOOR, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessourcesStone(LOCATION, CompatModid, MAT_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, client_stone_roofs, data_roofs);
			McwAPI.clears(MAT_ROCK, WALL, FLOOR);
			System.out.println("Done Stone Client");
		}
		
		/*Furnitures*/
		if(activeFurnitures)
		{
			/*Instance Roofs*/
			final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
			final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			client_wood_furnitures.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_furnitures.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
			client_wood_furnitures.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_furnitures.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_furnitures.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_FURNITURES_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}

		/*Stairs*/ 
		if(activeStairs)
		{
			/*Instance Stairs*/
			final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
			final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			client_wood_stairs.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_stairs.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
			client_wood_stairs.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_stairs.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_stairs.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_STAIRS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		if(activePaths)
		{
			/*Instance Paths*/
			final McwModsRessources client_wood_paths = new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD);
			final McwDataGen data_paths = new McwDataGen(Compatibilities.MCW_PATHS_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, true, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		if(activeDoors)
		{
			/*Instance Doors*/
			final McwModsRessources client_wood_doors = new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD);
			final McwDataGen data_doors = new McwDataGen(Compatibilities.MCW_DOORS_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			//genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, true, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
			client_wood_doors.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_doors.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
			client_wood_doors.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_doors.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_doors.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_doors.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_DOORS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		if(activeTraps)
		{
			/*Instance Trapdoors*/
			final McwModsRessources client_wood_trapdoors = new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD);
			final McwDataGen data_trapdoors = new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			//genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, true, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
			client_wood_trapdoors.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_trapdoors.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
			client_wood_trapdoors.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_trapdoors.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_trapdoors.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_trapdoors.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_TRAPDOORS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		if(activeWindows)
		{
			/*Instance Windows*/
			final McwModsRessources client_wood_windows = new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD);
			final McwDataGen data_windows = new McwDataGen(Compatibilities.MCW_WINDOWS_MODID);

			System.out.println("Start Wood Client");
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
			MAT_WOOD.clear();
	
			ModsList.abnormalsWood(MAT_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			//genRessources(LOCATION, CompatModid, MAT_WOOD, txtLocMod, ModidOfBaseMod, true, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
			client_wood_windows.createWoodBlockstates(LOCATION, CompatModid, MAT_WOOD);
			client_wood_windows.createWoodCustomModelsBlocks(LOCATION, txtLocMod, MAT_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
			client_wood_windows.createWoodModelItem(LOCATION, CompatModid, MAT_WOOD);
			data_windows.AdvancementsLogAll(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true);
			data_windows.LootTableLogAll(LOCATION, CompatModid, MAT_WOOD);
			data_windows.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, MAT_WOOD, true, Compatibilities.MCW_WINDOWS_MODID, ModidOfBaseMod);
			MAT_WOOD.clear();
			System.out.println("Done Wood Client");
		}
		
		System.out.println("Start Data/Tags/Lang");
		ModsList.abnormalsWood(MAT_WOOD);
		ModsList.abnormalsRock(MAT_ROCK);
		ModsList.abnormalsLeaves(LEAVES);
		English.Abnormals.abnormalsWoodLang(MAJ_WOOD);
		English.Abnormals.abnormalsRockLang(MAJ_ROCK);
		English.Abnormals.abnormalsLeavesLang(MAJ_LEAVES);
		
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new BridgesTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new RoofsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new FencesTagsGenerator(true, MAT_ROCK, LEAVES));
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new FurnituresTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new StairsTagsGenerator());
		
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new PathsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new DoorsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new TrapdoorsTagsGenerator());
		genTags(LOCATION, CompatModid, MAT_WOOD, LEAVES, MAT_ROCK, new WindowsTagsGenerator());
		
		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new BridgesLangGenerator());
		genLangEnglishRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new BridgesLangGenerator());
		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new RoofsLangGenerator());
		genLangEnglishRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new RoofsLangGenerator());
		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new FencesLangGenerator(LEAVES, MAJ_LEAVES));
		genLangEnglishRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new FencesLangGenerator(LEAVES, MAJ_LEAVES));
		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new FurnituresLangGenerator());
		genLangEnglishRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new FurnituresLangGenerator());
		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new StairsLangGenerator());
		genLangEnglishRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new StairsLangGenerator());

		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new PathsLangGenerator());
		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new DoorsLangGenerator());
		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new TrapdoorsLangGenerator());
		genLangEnglishWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new WindowsLangGenerator());
		
		MAJ_WOOD.clear();
		MAJ_ROCK.clear();
		MAJ_LEAVES.clear();
		French.Abnormals.abnormalsWoodLang(MAJ_WOOD);
		French.Abnormals.abnormalsRockLang(MAJ_ROCK);
		French.Abnormals.abnormalsLeavesLang(MAJ_LEAVES);
		
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new BridgesLangGenerator());
		genLangFrenchRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new BridgesLangGenerator());
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new RoofsLangGenerator());
		genLangFrenchRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new RoofsLangGenerator());
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new FencesLangGenerator(LEAVES, MAJ_LEAVES));
		genLangFrenchRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new FencesLangGenerator(LEAVES, MAJ_LEAVES));
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new FurnituresLangGenerator());
		genLangFrenchRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new FurnituresLangGenerator());
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new StairsLangGenerator());
		genLangFrenchRock(LOCATION, CompatModid, MAT_ROCK, MAJ_ROCK, new StairsLangGenerator());
		
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new PathsLangGenerator());
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new DoorsLangGenerator());
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new TrapdoorsLangGenerator());
		genLangFrenchWood(LOCATION, CompatModid, MAT_WOOD, MAJ_WOOD, new WindowsLangGenerator());
		MAJ_WOOD.clear();
		MAJ_ROCK.clear();
		MAJ_LEAVES.clear();
		
		/* Make Basic logo model file */
		APIWriter.write(Path.of(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_ITEM.getPath() + "logo.json"), "{\r\n"
				+ "  \"parent\": \"minecraft:item/generated\",\r\n"
				+ "  \"textures\": {\r\n"
				+ "    \"layer0\": \"mcwabnormals:item/logo\"\r\n"
				+ "  }\r\n"
				+ "}");
		
		System.out.println("Done Data/Tags/Lang");
		
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "red_maple", "red_maple_leaves", "maple_leaves");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "yellow_maple", "yellow_maple_leaves", "maple_leaves");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "orange_maple", "orange_maple_leaves", "maple_leaves");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "white_wisteria", "white_wisteria_leaves", "white_wisteria_flowers");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "purple_wisteria", "purple_wisteria_leaves", "purple_wisteria_flowers");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "pink_wisteria", "pink_wisteria_leaves", "pink_wisteria_flowers");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "blue_wisteria", "blue_wisteria_leaves", "blue_wisteria_flowers");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "honeycomb_brick", "buzzier_bees:honeycomb_block", "minecraft:honeycomb_block");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "honeycomb_brick", "\"buzzier_bees:honeycomb_brick\"", "\"buzzier_bees:honeycomb_bricks\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "honeycomb_tile", "\"buzzier_bees:honeycomb_tile\"", "\"buzzier_bees:honeycomb_tiles\"");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "snail_shell_tiles", "autumnity:snail_shell_tiles_wall", "autumnity:snail_shell_tile_wall");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "snail_shell_bricks", "autumnity:snail_shell_block_stripes", "autumnity:snail_shell_block");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "snail_shell_tiles", "autumnity:snail_shell_tiles_wall", "autumnity:snail_shell_tile_wall");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "snail_shell_tiles", "autumnity:snail_shell_tiles_slab", "autumnity:snail_shell_tile_slab");

		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "honeycomb_brick", "\"buzzier_bees:honeycomb_brick\"", "\"buzzier_bees:honeycomb_bricks\"");
		JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "honeycomb_tile", "\"buzzier_bees:honeycomb_tile\"", "\"buzzier_bees:honeycomb_tiles\"");

		System.out.println("Finish Abnormals Registries");
	}
	
	private void genTags(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> LEAVES, List<String> MAT_ROCK, ITagData tag)
	{
		tag.AxeDataGenWood(LOCATION, CompatModid, MAT_WOOD);
		tag.HoeDataGenWood(LOCATION, CompatModid, LEAVES);
		tag.TagsWood(LOCATION, CompatModid, MAT_WOOD);
		tag.PickaxeDataGen(LOCATION, CompatModid, MAT_ROCK);
		tag.TagsRock(LOCATION, CompatModid, MAT_ROCK);
	}
	
	private void genLangEnglishWood(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> MAJ_WOOD, ILang lang)
	{
		lang.initAllWoodEnglish(CompatModid, MAT_WOOD, MAJ_WOOD);
	}
	
	private void genLangEnglishRock(String LOCATION, String CompatModid, List<String> MAT_ROCK, List<String> MAJ_ROCK, ILang lang)
	{
		lang.initAllStoneEnglish(CompatModid, MAT_ROCK, MAJ_ROCK);
	}
	
	private void genLangFrenchWood(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> MAJ_WOOD, ILang lang)
	{
		lang.initAllWoodFrench(CompatModid, MAT_WOOD, MAJ_WOOD);
	}

	private void genLangFrenchRock(String LOCATION, String CompatModid, List<String> MAT_ROCK, List<String> MAJ_ROCK, ILang lang)
	{
		lang.initAllStoneFrench(CompatModid, MAT_ROCK, MAJ_ROCK);
	}
}