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

public class RegionsUnexplored implements Presetting
{
    protected static final List<String> ID_WOOD = new ArrayList<>();
    protected static final List<String> LANG_WOOD = new ArrayList<>();
    protected static final List<String> ID_LEAVE = new ArrayList<>();
    protected static final List<String> LANG_LEAVE = new ArrayList<>();

    private final String versioning;
    private final ModLoaders modLoader;

    public RegionsUnexplored(String versioning, ModLoaders modLoader)
    {
        this.versioning = versioning;
        this.modLoader = modLoader;
    }

    public RegionsUnexplored(ModLoaders modL)
    {
        this("1.20", modL);
    }


    @Override
    public void init(String LOCATION)
    {
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

        NewModsList.RegionsUnexplored.regionsUnexploredWood(ID_WOOD);
        NewModsList.RegionsUnexplored.regionsUnexploredLeave(ID_LEAVE);

        String TextureLocationFormodid = Compatibilities.REGIONS_UNEXPLORED_TEXTURES;
        String ModidOfBaseMod = Compatibilities.REGIONS_UNEXPLORED_MODID;
        String CompatModid = "mcwregionsunexplored";

        System.out.println("Bridges...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_BRIDGES_MODID,
                new McwModsRessources(Compatibilities.MCW_BRIDGES_MODID, McwAPI.ClientFolderTypes.MCW_BRIDGES_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_BRIDGES_MODID, this.versioning));
        System.out.println("Roofs...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_ROOFS_MODID,
                new McwModsRessources(Compatibilities.MCW_ROOFS_MODID, McwAPI.ClientFolderTypes.MCW_ROOFS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_ROOFS_MODID, this.versioning));
        System.out.println("Fences...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FENCES_MODID,
                new McwModsRessources(Compatibilities.MCW_FENCES_MODID, McwAPI.ClientFolderTypes.MCW_FENCES_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_FENCES_MODID, this.versioning));
        System.out.println("Furnitures...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_FURNITURES_MODID,
                new McwModsRessources(Compatibilities.MCW_FURNITURES_MODID, McwAPI.ClientFolderTypes.MCW_FURNITURES_BLOCK_MODEL),
                new McwDataGen(Compatibilities.MCW_FURNITURES_MODID, this.versioning));
        System.out.println("Doors...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_DOORS_MODID,
                new McwModsRessources(Compatibilities.MCW_DOORS_MODID, McwAPI.ClientFolderTypes.MCW_DOORS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_DOORS_MODID, this.versioning));
        System.out.println("Paths...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID,
                new McwModsRessources(Compatibilities.MCW_PATHS_MODID, McwAPI.ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_PATHS_MODID, this.versioning));
        System.out.println("Stairs...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_STAIRS_MODID,
                new McwModsRessources(Compatibilities.MCW_STAIRS_MODID, McwAPI.ClientFolderTypes.MCW_STAIRS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_STAIRS_MODID, this.versioning));
        System.out.println("Trapdoors...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_TRAPDOORS_MODID,
                new McwModsRessources(Compatibilities.MCW_TRAPDOORS_MODID, McwAPI.ClientFolderTypes.MCW_TRAPDOORS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_TRAPDOORS_MODID, this.versioning));
        System.out.println("Windows...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_WINDOWS_MODID,
                new McwModsRessources(Compatibilities.MCW_WINDOWS_MODID, McwAPI.ClientFolderTypes.MCW_WINDOWS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_WINDOWS_MODID, this.versioning));
        System.out.println("Paths...");
        genRessources(LOCATION, CompatModid, TextureLocationFormodid, ModidOfBaseMod, Compatibilities.MCW_PATHS_MODID,
                new McwModsRessources(Compatibilities.MCW_PATHS_MODID, McwAPI.ClientFolderTypes.MCW_PATHS_BLOCK_MODEL_WOOD),
                new McwDataGen(Compatibilities.MCW_PATHS_MODID, this.versioning));

        System.out.println("Tags...");
        TagsGenerator tagsGenerator = new TagsGenerator(LOCATION, Reference.allMcwMods());

        tagsGenerator.axe(LOCATION, CompatModid, ID_WOOD, Reference.allMcwMods());
        tagsGenerator.hoe(LOCATION, CompatModid, ID_LEAVE);
        tagsGenerator.vanilla(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), Reference.allMcwMods());
        tagsGenerator.mcwMods(LOCATION, CompatModid, ID_WOOD, ID_LEAVE, List.of(), Reference.allMcwMods());

        addLanguage(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, ID_LEAVE, LANG_LEAVE, "en_us");

        for(McwAPI.ClientFolderTypes list : McwAPI.getClientFolderTypesWood())
        {
            for(String folderInModel : list.getPathList())
            {
                JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + folderInModel +
                File.separator, "sculkwood", "stripped_sculkwood_log", "sculkwood_log_dark");
            }
        }

        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.MODEL_BLOCK.getPath() + "hedges" + File.separator, "palm", "palm_leaves", "palm_leaves_side");


        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "sculkwood", "stripped_sculkwood_log\"", "sculkwood_log_dark\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "sculkwood", "stripped_sculkwood_log\"", "sculkwood_log_dark\"");

        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "alpha_oak", "alpha_oak_leaves\"", "alpha_leaves\"");
        JsonsUtils.replacer(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "alpha_oak", "alpha_oak_leaves\"", "alpha_leaves\"");

        JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.RECIPE.getPath(), "joshua_hedge.json");
        JsonsUtils.deleter(LOCATION + File.separator + McwAPI.ClassicFolderTypes.ADVANCEMENT_RECIPE.getPath(), "joshua_hedge.json");

        System.out.println("Done!");
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
            dat.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, compat, ModidOfBaseMod, modLoader);
            dat.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
            dat.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
        }
    }

    private void addLanguage(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> LANG_WOOD, List<String> ID_LEAVE, List<String> LANG_LEAVE, String language)
    {
        LangSearcher langSearcher = new LangSearcher();

        LangMods.RegionsUnexplored.regionsUnexploredWoodLang(LANG_WOOD, language);
        LangMods.RegionsUnexplored.regionsUnexploredLeaveLang(LANG_LEAVE, language);

        langSearcher.initWood(LOCATION, CompatModid, ID_WOOD, LANG_WOOD, language, Reference.allMcwMods());
        langSearcher.initLeaves(LOCATION, CompatModid, ID_LEAVE, LANG_LEAVE, language);
        LANG_WOOD.clear();
        LANG_LEAVE.clear();
    }
}