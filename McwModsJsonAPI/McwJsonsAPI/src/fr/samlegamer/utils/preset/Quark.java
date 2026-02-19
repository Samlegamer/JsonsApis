package fr.samlegamer.utils.preset;

import fr.samlegamer.McwAPI;
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

public class Quark implements Presetting
{
    protected static final List<String> ID_WOOD = new ArrayList<>();
    protected static final List<String> ID_ROCK = new ArrayList<>();
    protected static final List<String> WALL = new ArrayList<>();
    protected static final List<String> FLOOR = new ArrayList<>();
    protected static final List<String> ID_LEAVE = new ArrayList<>();

    protected static final List<String> LANG_WOOD = new ArrayList<>();
    protected static final List<String> LANG_ROCK = new ArrayList<>();
    protected static final List<String> LANG_LEAVE = new ArrayList<>();
    private final ModLoaders modLoader;
    private final Versions version;

    public Quark(ModLoaders modLoader, Versions version)
    {
        this.modLoader = modLoader;
        this.version = version;
    }

    public Quark(Versions version)
    {
        this(ModLoaders.FORGE, version);
    }

    @Override
    public void init(String LOCATION)
    {
        System.out.println("Quark Loading...");
        clearAll();
        McwAPI.BridgesGenFolder(LOCATION);
        McwAPI.RoofsGenFolder(LOCATION);
        McwAPI.FencesGenFolder(LOCATION);
        McwAPI.FurnituresGenFolder(LOCATION);
        McwAPI.DoorsGenFolder(LOCATION);
        McwAPI.PathsGenFolder(LOCATION);
        McwAPI.TrapdoorsGenFolder(LOCATION);
        McwAPI.WindowsGenFolder(LOCATION);
        McwAPI.StairsGenFolder(LOCATION);
        McwAPI.DataGenFolder(LOCATION);

        NewModsList.Quark.quarkWood(ID_WOOD, version);
        NewModsList.Quark.quarkLeave(ID_LEAVE, version);
        NewModsList.Quark.quarkRock(ID_ROCK, WALL, FLOOR, version);

        String TextureLocationFormodid = Compatibilities.QUARK_TEXTURE;
        String ModidOfBaseMod = Compatibilities.QUARK_MODID;
        String CompatModid = "mcwquark";

        System.out.println("Bridges...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID,
                new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, McwAPI.ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));
        System.out.println("Roofs...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID,
                new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, McwAPI.ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_ROOFS_MODID));
        System.out.println("Fences...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID,
                new McwModsRessources(Compatibilities.MCW_FENCES_MODID, McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_FENCES_MODID));
        System.out.println("Furnitures...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FURNITURES_MODID,
                new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, McwAPI.ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
                new McwDataGen(Compatibilities.MCW_FURNITURES_MODID));
        System.out.println("Doors...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_DOORS_MODID,
                new McwModsRessources(Compatibilities.MCW_DOORS_MODID, McwAPI.ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_DOORS_MODID));
        System.out.println("Paths...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID,
                new McwModsRessources(Compatibilities.MCW_PATHS_MODID, McwAPI.ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_PATHS_MODID));
        System.out.println("Stairs...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_STAIRS_MODID,
                new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, McwAPI.ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_STAIRS_MODID));
        System.out.println("Trapdoors...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_TRAPDOORS_MODID,
                new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, McwAPI.ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID));
        System.out.println("Windows...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_WINDOWS_MODID,
                new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, McwAPI.ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_WINDOWS_MODID));
        System.out.println("Paths...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID,
                new McwModsRessources(Compatibilities.MCW_PATHS_MODID, McwAPI.ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_PATHS_MODID));

        System.out.println("Stone...");
        genRessourcesStone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID,
                new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, McwAPI.ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_STONE),
                new McwDataGen(Compatibilities.MCW_BRIDGES_MODID));

        genRessourcesStone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID,
                new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, McwAPI.ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_ROOFS_MODID));

        genRessourcesStone(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID,
                new McwModsRessources(Compatibilities.MCW_FENCES_MODID, McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE),
                new McwDataGen(Compatibilities.MCW_FENCES_MODID));

        System.out.println("Tags...");
        TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

        tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
        tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
        tagsGenerator.pickaxe(LOCATION, CompatModid, ID_ROCK, Reference.allMcwModsStone());

        tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());
        tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, ID_ROCK, Reference.allMcwMods());
        System.out.println("Tags Finish !");

        boolean isNether = version == Versions.NONE;
        genLang(LOCATION, CompatModid, "en_us");
        if(isNether) {
            genLang(LOCATION, CompatModid, "fr_fr");
        }

        System.out.println("Replacer and fix...");
        if(isNether) {
            replacerNether(LOCATION);
        }
        else {
            replacerCaveAndCliffBreeze(LOCATION);
        }
        System.out.println("Quark Finish !");
    }

    private void genRessourcesStone(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat)
    {
        res.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
        res.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, ID_ROCK, WALL, FLOOR);
        res.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
        dat.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, compat, ModidOfBaseMod, modLoader);
        dat.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, FLOOR, compat, ModidOfBaseMod, modLoader);
        dat.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
    }

    private void genRessources(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidOfBaseMod, String compat, McwModsRessources res, McwDataGen dat)
    {
        res.setModid(CompatModid);
        res.createWoodBlockstates(LOCATION, CompatModid, ID_WOOD);
        res.createWoodModelItem(LOCATION, CompatModid, ID_WOOD);
        res.createWoodModelsBlocks(LOCATION, TextureLocationFormodid, ID_WOOD, false);
        dat.AdvancementsLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, compat, ModidOfBaseMod, modLoader);
        dat.RecipesLogAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_WOOD, false, compat, ModidOfBaseMod, modLoader);
        dat.LootTableLogAll(LOCATION, CompatModid, ID_WOOD);

        if(compat.equals(Compatibilities.MCW_FENCES_MODID))
        {
            res.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
            res.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, Boolean.FALSE, "acacia_wall");
            res.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
            dat.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
            dat.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
            dat.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
        }
    }

    protected void clearAll()
    {
        McwAPI.clears(ID_WOOD, ID_ROCK, WALL, FLOOR, LANG_WOOD, LANG_ROCK, ID_LEAVE, LANG_LEAVE);
    }

    private void genLang(String LOCATION, String CompatModid, String language)
    {
        LangMods.Quark.quarkRockLang(LANG_ROCK, language, version);
        LangMods.Quark.quarkLeaveLang(LANG_LEAVE, language, version);

        System.out.println("Lang Loading "+language);
        final LangSearcher lang_searcher = new LangSearcher();

        lang_searcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
        lang_searcher.initRock(LOCATION, CompatModid, ID_ROCK, LANG_ROCK, language,
                List.of(Compatibilities.MCW_BRIDGES_MODID, Compatibilities.MCW_FENCES_MODID, Compatibilities.MCW_ROOFS_MODID));

        if(version != Versions.NONE)
        {
            LangMods.Quark.quarkWoodLang(LANG_WOOD, language, version);
            lang_searcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, Reference.allMcwMods());
        }

        LANG_WOOD.clear();
        LANG_LEAVE.clear();
        LANG_ROCK.clear();
        System.out.println("Lang Finish "+language);
    }

    private void replacerCaveAndCliffBreeze(String LOCATION)
    {
        if(version == Versions.THEWILDUPDATE || version == Versions.TRAILSANDTALES || version == Versions.TRICKYTRIALS)
        {
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "ancient", "quark:ancient_slab", "quark:ancient_planks_slab");
        }

        if(version == Versions.TRAILSANDTALES || version == Versions.TRICKYTRIALS)
        {
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "raw_iron_bricks", "\"quark:raw_iron_block\"", "\"minecraft:raw_iron_block\"");
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "raw_gold_bricks", "\"quark:raw_gold_block\"", "\"minecraft:raw_gold_block\"");
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "raw_copper_bricks", "\"quark:raw_copper_block\"", "\"minecraft:raw_copper_block\"");

            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "raw_iron_bricks", "\"quark:raw_iron_brick_", "\"quark:raw_iron_bricks_");
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "raw_gold_bricks", "\"quark:raw_gold_brick_", "\"quark:raw_gold_bricks_");
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "raw_copper_bricks", "\"quark:raw_copper_brick_", "\"quark:raw_copper_bricks_");
        }

        if(version != Versions.TRICKYTRIALS)
        {
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "tuff_bricks", "\"quark:tuff\"", "\"minecraft:tuff\"");
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "tuff_bricks", "\"quark:tuff_brick_", "\"quark:tuff_bricks_");
            JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "tuff_bricks", "\"quark:tuff_brick_", "\"quark:tuff_bricks_");
        }

        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "blossom", "quark:blossom_slab", "quark:blossom_planks_slab");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "azalea", "quark:azalea_slab", "quark:azalea_planks_slab");

        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sandstone_bricks", "\"quark:smooth_sandstone_bricks\"", "\"minecraft:smooth_sandstone\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_sandstone_bricks", "\"quark:smooth_red_sandstone_bricks\"", "\"minecraft:smooth_red_sandstone\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "calcite_bricks", "\"quark:calcite\"", "\"minecraft:calcite\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "blackstone_bricks", "\"quark:blackstone\"", "\"minecraft:blackstone\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mossy_cobblestone_bricks", "\"quark:mossy_cobblestone\"", "\"minecraft:mossy_cobblestone\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "cobblestone_bricks", "\"quark:cobblestone\"", "\"minecraft:cobblestone\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "andesite_bricks", "\"quark:andesite\"", "\"minecraft:andesite\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "granite_bricks", "\"quark:granite\"", "\"minecraft:granite\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "diorite_bricks", "\"quark:diorite\"", "\"minecraft:diorite\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "dripstone_bricks", "\"quark:dripstone\"", "\"minecraft:dripstone_block\"");

        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "soul_sandstone_bricks", "\"quark:smooth_soul_sandstone_bricks\"", "\"quark:smooth_soul_sandstone\"");


        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "mossy_cobblestone_bricks", "\"quark:mossy_cobblestone_brick_", "\"quark:mossy_cobblestone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sandstone_bricks", "\"quark:sandstone_brick_", "\"quark:sandstone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "soul_sandstone_bricks", "\"quark:soul_sandstone_brick_", "\"quark:soul_sandstone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "jasper_bricks", "\"quark:jasper_brick_", "\"quark:jasper_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "shale_bricks", "\"quark:shale_brick_", "\"quark:shale_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "permafrost_bricks", "\"quark:permafrost_brick_", "\"quark:permafrost_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "andesite_bricks", "\"quark:andesite_brick_", "\"quark:andesite_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "limestone_bricks", "\"quark:limestone_brick_", "\"quark:limestone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "diorite_bricks", "\"quark:diorite_brick_", "\"quark:diorite_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_sandstone_bricks", "\"quark:red_sandstone_brick_", "\"quark:red_sandstone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "calcite_bricks", "\"quark:calcite_brick_", "\"quark:calcite_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "cobblestone_bricks", "\"quark:cobblestone_brick_", "\"quark:cobblestone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "limestone_bricks", "\"quark:limestone_brick_", "\"quark:limestone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "dripstone_bricks", "\"quark:dripstone_brick_", "\"quark:dripstone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "granite_bricks", "\"quark:granite_brick_", "\"quark:granite_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "blackstone_bricks", "\"quark:blackstone_brick_", "\"quark:blackstone_bricks_");

        for(String folderInModel : McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList())
        {
            JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "soul_sandstone_bricks", "soul_sandstone_bricks_top", "soul_sandstone_bricks");
            JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "red_sandstone_bricks", "red_sandstone_bricks_top", "red_sandstone_bricks");
            JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "sandstone_bricks", "sandstone_bricks_top", "sandstone_bricks");

        }

        JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "blossom_hedge.json");
        JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "azalea_hedge.json");
        JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "blossom_hedge.json");
        JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.LOOT_TABLES.getPath(), "azalea_hedge.json");
        JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "blossom_hedge.json");
        JsonsUtils.deleter(LOCATION + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "azalea_hedge.json");
    }

    private void replacerNether(String LOCATION)
    {
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sandstone_bricks", "\"quark:smooth_sandstone_bricks\"", "\"minecraft:smooth_sandstone\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_sandstone_bricks", "\"quark:smooth_red_sandstone_bricks\"", "\"minecraft:smooth_red_sandstone\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "soul_sandstone_bricks", "\"quark:smooth_soul_sandstone_bricks\"", "\"quark:smooth_soul_sandstone\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "andesite_bricks", "\"quark:andesite\"", "\"minecraft:andesite\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "granite_bricks", "\"quark:granite\"", "\"minecraft:granite\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "diorite_bricks", "\"quark:diorite\"", "\"minecraft:diorite\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "magma_bricks", "\"quark:magma_block\"", "\"minecraft:magma_block\"");

        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "marble_bricks", "\"quark:marble_brick_", "\"quark:marble_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "biotite_bricks", "\"quark:biotite_brick_", "\"quark:biotite_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sandstone_bricks", "\"quark:sandstone_brick_", "\"quark:sandstone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "red_sandstone_bricks", "\"quark:red_sandstone_brick_", "\"quark:red_sandstone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "soul_sandstone_bricks", "\"quark:soul_sandstone_brick_", "\"quark:soul_sandstone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "jasper_bricks", "\"quark:jasper_brick_", "\"quark:jasper_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "permafrost_bricks", "\"quark:permafrost_brick_", "\"quark:permafrost_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "magma_bricks", "\"quark:magma_brick_", "\"quark:magma_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "andesite_bricks", "\"quark:andesite_brick_", "\"quark:andesite_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "diorite_bricks", "\"quark:diorite_brick_", "\"quark:diorite_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "granite_bricks", "\"quark:granite_brick_", "\"quark:granite_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "limestone_bricks", "\"quark:limestone_brick_", "\"quark:limestone_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "slate_bricks", "\"quark:slate_brick_", "\"quark:slate_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "elder_prismarine_bricks", "\"quark:elder_prismarine_brick_", "\"quark:elder_prismarine_bricks_");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "basalt_bricks", "\"quark:basalt_brick_", "\"quark:basalt_bricks_");

        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "biotite_bricks", "\"quark:biotite_bricks_wall", "\"quark:biotite_block_vertical_slab");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "biotite_bricks", "\"quark:biotite_bricks_slab", "\"quark:biotite_block_slab");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "elder_prismarine_bricks", "\"quark:elder_prismarine_bricks_wall", "\"quark:elder_prismarine_wall");

        for(String folderInModel : McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_STONE.getPathList())
        {
            JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "soul_sandstone_bricks", "soul_sandstone_bricks_top", "soul_sandstone_bricks");
            JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "red_sandstone_bricks", "red_sandstone_bricks_top", "red_sandstone_bricks");
            JsonsUtils.replacer(LOCATION+File.separator+McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath()+folderInModel+File.separator, "sandstone_bricks", "sandstone_bricks_top", "sandstone_bricks");
        }
    }
}
