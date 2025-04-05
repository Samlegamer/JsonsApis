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

public class AbnormalsWarden implements Presetting
{
	private final List<String> mcwMods;
	private final ModLoaders modLoader;

	public AbnormalsWarden()
	{
		this(Reference.allMcwMods(), ModLoaders.FORGE);
	}

	public AbnormalsWarden(List<String> mcwMods, ModLoaders modLoader)
	{
		this.mcwMods = mcwMods;
		this.modLoader=modLoader;
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
			final McwDataGen data = new McwDataGen(mod);

			System.out.println("Start Wood "+ mod +" Client/Data");
			NewModsList.Abnormals.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.ENVI_MODID; // "environmental";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
			txtLocMod = Compatibilities.UAQUA_TEXTURES; // "upgrade_aquatic:block";
			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, mod, client, data);
			ID_WOOD.clear();

			NewModsList.Abnormals.abnormalsWood(ID_WOOD, Compatibilities.CAVERNCHASMS_MODID);
			txtLocMod = Compatibilities.CAVERNCHASMS_TEXTURES; //"environmental:block";
			ModidOfBaseMod = Compatibilities.CAVERNCHASMS_MODID; // "environmental";
			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, mod, client, data);
			ID_WOOD.clear();

			if(mod.equals(Compatibilities.MCW_FENCES_MODID))
			{
				NewModsList.Abnormals.abnormalsLeaves(ID_LEAVE, Compatibilities.ATMO_MODID);
				txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
				ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();

				NewModsList.Abnormals.abnormalsLeaves(ID_LEAVE, Compatibilities.AUTUM_MODID);
				txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
				ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();

				NewModsList.Abnormals.abnormalsLeaves(ID_LEAVE, Compatibilities.ENVI_MODID);
				txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
				ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
				genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client, data);
				ID_LEAVE.clear();

				NewModsList.Abnormals.abnormalsLeaves(ID_LEAVE, Compatibilities.UAQUA_MODID);
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
			final McwDataGen data = new McwDataGen(mod);

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
			System.out.println("Done Stone Client");
		}

			/*Bridges*/
//		if(activeBridges)
//		{
//			/*Instance Bridges*/
//
//
//		}
//
//		/*Fences*/
//		if(activeFences)
//		{
//			/*Instance Fences*/
//			final McwModsRessources client_wood_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD);
//			final McwModsRessources client_stone_fences = new McwModsRessources(Compatibilities.MCW_FENCES_MODID, ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE);
//			final McwDataGen data_fences = new McwDataGen(Compatibilities.MCW_FENCES_MODID);
//
//			System.out.println("Start Wood Client");
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
//			ModsList.abnormalsLeaves(ID_LEAVE, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
//			genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client_wood_fences, data_fences);
//			ID_LEAVE.clear();
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
//			ModsList.abnormalsLeaves(ID_LEAVE, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
//			genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client_wood_fences, data_fences);
//			ID_LEAVE.clear();
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
//			ModsList.abnormalsLeaves(ID_LEAVE, Compatibilities.ENVI_MODID);
//			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
//			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
//			genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client_wood_fences, data_fences);
//			ID_WOOD.clear();
//			ID_LEAVE.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
//			ModsList.abnormalsLeaves(ID_LEAVE, Compatibilities.UAQUA_MODID);
//			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
//			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
//			genHedges(LOCATION, CompatModid, ID_LEAVE, txtLocMod, ModidOfBaseMod, client_wood_fences, data_fences);
//			ID_WOOD.clear();
//			ID_LEAVE.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
//			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
//			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
//			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, client_wood_fences, data_fences);
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//
//			System.out.println("Start Stone Client");
//			ModsList.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.BUZZBEES_MODID);
//			txtLocMod = Compatibilities.BUZZBEES_TEXTURES; //"buzzier_bees:block";
//			ModidOfBaseMod = Compatibilities.BUZZBEES_MODID; //"buzzier_bees";
//			genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, client_stone_fences, data_fences);
//			McwAPI.clears(ID_ROCK, WALL, FLOOR);
//
//			ModsList.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, client_stone_fences, data_fences);
//			McwAPI.clears(ID_ROCK, WALL, FLOOR);
//
//			ModsList.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID, client_stone_fences, data_fences);
//			McwAPI.clears(ID_ROCK, WALL, FLOOR);
//			System.out.println("Done Stone Client");
//		}
//
//		/*Roofs*/
//		if(activeRoofs)
//		{
//			/*Instance Roofs*/
//			final McwModsRessources client_wood_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
//			final McwModsRessources client_stone_roofs = new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD);
//			final McwDataGen data_roofs = new McwDataGen(Compatibilities.MCW_ROOFS_MODID);
//
//			System.out.println("Start Wood Client");
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
//			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
//			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
//			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
//			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
//			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
//			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
//			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, client_wood_roofs, data_roofs);
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//
//			System.out.println("Start Stone Client");
//			ModsList.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.BUZZBEES_MODID);
//			txtLocMod = Compatibilities.BUZZBEES_TEXTURES; //"buzzier_bees:block";
//			ModidOfBaseMod = Compatibilities.BUZZBEES_MODID; //"buzzier_bees";
//			genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, client_stone_roofs, data_roofs);
//			McwAPI.clears(ID_ROCK, WALL, FLOOR);
//
//			ModsList.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, client_stone_roofs, data_roofs);
//			McwAPI.clears(ID_ROCK, WALL, FLOOR);
//
//			ModsList.abnormalsRock(ID_ROCK, WALL, FLOOR, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessourcesStone(LOCATION, CompatModid, ID_ROCK, WALL, FLOOR, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID, client_stone_roofs, data_roofs);
//			McwAPI.clears(ID_ROCK, WALL, FLOOR);
//			System.out.println("Done Stone Client");
//		}
//
//		/*Furnitures*/
//		if(activeFurnitures)
//		{
//			/*Instance Roofs*/
//			final McwModsRessources client_wood_furnitures = new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL);
//			final McwDataGen data_furnitures = new McwDataGen(Compatibilities.MCW_FURNITURES_MODID);
//
//			System.out.println("Start Wood Client");
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
//			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
//			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
//			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
//			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
//			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
//			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
//			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_FURNITURES_MODID, client_wood_furnitures, data_furnitures);
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		/*Stairs*/
//		if(activeStairs)
//		{
//			/*Instance Stairs*/
//			final McwModsRessources client_wood_stairs = new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD);
//			final McwDataGen data_stairs = new McwDataGen(Compatibilities.MCW_STAIRS_MODID);
//
//			System.out.println("Start Wood Client");
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
//			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
//			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
//			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
//			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
//			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
//			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
//			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_STAIRS_MODID, client_wood_stairs, data_stairs);
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		if(activePaths)
//		{
//			/*Instance Paths*/
//			final McwModsRessources client_wood_paths = new McwModsRessources(Compatibilities.MCW_PATHS_MODID, ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD);
//			final McwDataGen data_paths = new McwDataGen(Compatibilities.MCW_PATHS_MODID);
//
//			System.out.println("Start Wood Client");
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
//			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
//			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
//			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
//			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
//			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
//			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, true, Compatibilities.MCW_PATHS_MODID, client_wood_paths, data_paths);
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		if(activeDoors)
//		{
//			/*Instance Doors*/
//			final McwModsRessources client_wood_doors = new McwModsRessources(Compatibilities.MCW_DOORS_MODID, ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD);
//			final McwDataGen data_doors = new McwDataGen(Compatibilities.MCW_DOORS_MODID);
//
//			System.out.println("Start Wood Client");
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
//			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
//			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
//			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
//			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
//			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
//			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
//			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_DOORS_MODID, client_wood_doors, data_doors);
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		if(activeTraps)
//		{
//			/*Instance Trapdoors*/
//			final McwModsRessources client_wood_trapdoors = new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD);
//			final McwDataGen data_trapdoors = new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID);
//
//			System.out.println("Start Wood Client");
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
//			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
//			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
//			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
//			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
//			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
//			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
//			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_TRAPDOORS_MODID, client_wood_trapdoors, data_trapdoors);
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}
//
//		if(activeWindows)
//		{
//			/*Instance Windows*/
//			final McwModsRessources client_wood_windows = new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD);
//			final McwDataGen data_windows = new McwDataGen(Compatibilities.MCW_WINDOWS_MODID);
//
//			System.out.println("Start Wood Client");
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
//			txtLocMod = Compatibilities.ATMO_TEXTURES; //"atmospheric:block";
//			ModidOfBaseMod = Compatibilities.ATMO_MODID; //"atmospheric";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
//			txtLocMod = Compatibilities.AUTUM_TEXTURES; //"autumnity:block";
//			ModidOfBaseMod = Compatibilities.AUTUM_MODID; //"autumnity";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
//			txtLocMod = Compatibilities.ENVI_TEXTURES; //"environmental:block";
//			ModidOfBaseMod = Compatibilities.ENVI_MODID; //"environmental";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
//			txtLocMod = Compatibilities.UAQUA_TEXTURES; //"upgrade_aquatic:block";
//			ModidOfBaseMod = Compatibilities.UAQUA_MODID; //"upgrade_aquatic";
//			genRessources(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, false, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
//			ID_WOOD.clear();
//
//			ModsList.abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
//			txtLocMod = Compatibilities.ENDERGETIC_TEXTURES; //"endergetic:block";
//			ModidOfBaseMod = Compatibilities.ENDERGETIC_MODID; //"endergetic";
//			genEndergetic(LOCATION, CompatModid, ID_WOOD, txtLocMod, ModidOfBaseMod, Compatibilities.MCW_WINDOWS_MODID, client_wood_windows, data_windows);
//			ID_WOOD.clear();
//			System.out.println("Done Wood Client");
//		}


		NewModsList.Abnormals.abnormalsWoodWarden(ID_WOOD);
		NewModsList.Abnormals.abnormalsRock(ID_ROCK);
		NewModsList.Abnormals.abnormalsLeaves(ID_LEAVE);

		System.out.println("Start Tags");

		TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

		tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
		tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
		tagsGenerator.pickaxe(LOCATION, CompatModid, ID_ROCK, Reference.allMcwModsStone());

		tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());
		tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());

//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new BridgesTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new RoofsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new FencesTagsGenerator(true, ID_ROCK, ID_LEAVE));
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new FurnituresTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new StairsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new PathsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new DoorsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new TrapdoorsTagsGenerator());
//		genTags(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, new WindowsTagsGenerator());
		System.out.println("Done Tags");

		genLang(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_ROCK, LANG_ROCK, ID_LEAVE, LANG_LEAVE, "en_us");
		genLang(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_ROCK, LANG_ROCK, ID_LEAVE, LANG_LEAVE, "fr_fr");

//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new BridgesLangGenerator());
//		genLangEnglishRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new BridgesLangGenerator());
//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new RoofsLangGenerator());
//		genLangEnglishRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new RoofsLangGenerator());
//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new FencesLangGenerator(ID_LEAVE, LANG_LEAVE));
//		genLangEnglishRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new FencesLangGenerator(ID_LEAVE, LANG_LEAVE));
//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new FurnituresLangGenerator());
//		genLangEnglishRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new FurnituresLangGenerator());
//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new StairsLangGenerator());
//		genLangEnglishRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new StairsLangGenerator());
//
//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new PathsLangGenerator());
//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new DoorsLangGenerator());
//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new TrapdoorsLangGenerator());
//		genLangEnglishWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new WindowsLangGenerator());
//		
//		LANG_WOOD.clear();
//		LANG_ROCK.clear();
//		LANG_LEAVE.clear();
//		French.Abnormals.abnormalsWoodLang(LANG_WOOD);
//		French.Abnormals.abnormalsRockLang(LANG_ROCK);
//		French.Abnormals.abnormalsLeavesLang(LANG_LEAVE);
//		
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new BridgesLangGenerator());
//		genLangFrenchRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new BridgesLangGenerator());
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new RoofsLangGenerator());
//		genLangFrenchRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new RoofsLangGenerator());
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new FencesLangGenerator(ID_LEAVE, LANG_LEAVE));
//		genLangFrenchRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new FencesLangGenerator(ID_LEAVE, LANG_LEAVE));
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new FurnituresLangGenerator());
//		genLangFrenchRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new FurnituresLangGenerator());
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new StairsLangGenerator());
//		genLangFrenchRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, new StairsLangGenerator());
//		
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new PathsLangGenerator());
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new DoorsLangGenerator());
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new TrapdoorsLangGenerator());
//		genLangFrenchWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, new WindowsLangGenerator());
//		LANG_WOOD.clear();
//		LANG_ROCK.clear();
//		LANG_LEAVE.clear();
		
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
		res.createWoodCustomModelsBlocks(LOCATION, txtLocMod, ID_WOOD, "poise_planks", "poise_stem", "poise_stem_stripped");
		res.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
		dat.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, true, compat, ModidOfBaseMod, modLoader);
		dat.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);
		dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, true, compat, ModidOfBaseMod, modLoader);
	}
	
	private void genLang(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> LANG_WOOD, List<String> ID_ROCK, 
	List<String> LANG_ROCK, List<String> ID_LEAVE, List<String> LANG_LEAVE, String language)
	{
		System.out.println("Start Lang "+ language);
		LangSearcher langSearcher = new LangSearcher(McwAPI.READER_MCW_LANG);
		LangMods.Abnormals.abnormalsWoodWardenLang(LANG_WOOD, language);
		LangMods.Abnormals.abnormalsRockLang(LANG_ROCK, language);
		LangMods.Abnormals.abnormalsLeaveLang(LANG_LEAVE, language);

		langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, Reference.allMcwMods());
		langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
		langSearcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, language, Reference.allMcwModsStone());
		McwAPI.clears(LANG_WOOD, LANG_ROCK, LANG_LEAVE);
		System.out.println("Done Lang "+ language);
	}
}