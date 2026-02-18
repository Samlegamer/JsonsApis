package fr.samlegamer.utils.preset;

import fr.samlegamer.McwAPI;
import fr.samlegamer.api.clientgen.McwModsRessources;
import fr.samlegamer.api.datagen.McwDataGen;
import fr.samlegamer.api.datagen.ModLoaders;
import fr.samlegamer.api.lang.LangSearcher;
import fr.samlegamer.registry.Compatibilities;
import fr.samlegamer.utils.LangMods;
import fr.samlegamer.utils.Presetting;
import fr.samlegamer.utils.Reference;
import fr.samlegamer.utils.Versions;

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

    protected void genHedges(String LOCATION, String CompatModid, List<String> ID_LEAVE, String TextureLocationFormodid, String ModidOfBaseMod, McwModsRessources client, McwDataGen dat)
    {
        client.createWoodBlockstateswithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
        client.createWoodModelsBlockswithResearch(LOCATION, TextureLocationFormodid, ID_LEAVE, Boolean.FALSE, "acacia_wall");
        client.createWoodModelItemwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
        dat.AdvancementsLeavesHedgesIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
        dat.LootTableLogAllwithResearch(LOCATION, CompatModid, ID_LEAVE, "acacia_hedge");
        dat.RecipesLogAllwithResearchIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_LEAVE, Boolean.FALSE, "acacia_hedge", Compatibilities.MCW_FENCES_MODID, ModidOfBaseMod, modLoader);
    }

    protected void genStoneBYG(String LOCATION, String CompatModid, List<String> ID_ROCK, List<String> WALL, List<String> FLOOR, String TextureLocationFormodid, String ModidOfBaseMod, String compat,
                               McwModsRessources client, McwDataGen dat)
    {
        client.createStoneBlockstates(LOCATION, CompatModid, ID_ROCK);
        client.createStoneModelsBlocks(LOCATION, TextureLocationFormodid, ID_ROCK, WALL, FLOOR);
        client.createStoneModelItem(LOCATION, CompatModid, ID_ROCK);
        dat.AdvancementsStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, compat, ModidOfBaseMod, modLoader);
        dat.RecipesStoneAllIsCharged(LOCATION, CompatModid, ModidOfBaseMod, ID_ROCK, FLOOR, compat, ModidOfBaseMod, modLoader);
        dat.LootTableStoneAll(LOCATION, CompatModid, ID_ROCK);
    }
}
