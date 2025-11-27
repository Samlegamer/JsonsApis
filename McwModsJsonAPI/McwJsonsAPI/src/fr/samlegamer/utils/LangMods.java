package fr.samlegamer.utils;

import fr.samlegamer.McwAPI;

import java.io.File;
import java.util.List;
import static fr.samlegamer.utils.Reference.*;

public class LangMods
{
    public static class RegionsUnexplored
    {
        public static void regionsUnexploredWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, regionsUnexploredFolder + "regionsUnexploredWoodLang", LANG_WOOD);
        }

        public static void regionsUnexploredLeaveLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, regionsUnexploredFolder + "regionsUnexploredLeaveLang", LANG_LEAVE);
        }
    }

    public static class BOP {
        public static void bopWood(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bopFolder + "bopWoodLang", LANG_WOOD);
        }

        public static void bopLeave(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bopFolder + "bopLeaveLang", LANG_LEAVE);
        }

        public static void bopWoodSniffer(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bopFolder + "bopWoodSnifferLang", LANG_WOOD);
        }

        public static void bopLeaveSniffer(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bopFolder + "bopLeaveSnifferLang", LANG_LEAVE);
        }

        public static void bopLeaveCopperGolem(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bopFolder + "bopLeaveCopperGolemLang", LANG_LEAVE);
        }
    }

    public static class BYG {

        public static void bygWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bygFolder + "bygWoodLang", LANG_WOOD);
        }

        public static void bygLeaveLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bygFolder + "bygLeaveLang", LANG_LEAVE);
        }

        public static void bygRockFencesAndRoofsLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bygFolder + "bygRockFencesAndRoofsLang", LANG_ROCK);
        }

        public static void bygRockBridgesLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bygFolder + "bygRockBridgesLang", LANG_ROCK);
        }

        public static void bygWoodWardenLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bygFolder + "bygWoodWardenLang", LANG_WOOD);
        }

        public static void bygLeaveWardenLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bygFolder + "bygLeaveWardenLang", LANG_LEAVE);
        }
    }

    public static class BWG {

        public static void bwgWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bwgFolder + "bwgWoodLang", LANG_WOOD);
        }

        public static void bwgLeaveLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bwgFolder + "bwgLeaveLang", LANG_LEAVE);
        }

        public static void bwgRockLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, bwgFolder + "bwgRockLang", LANG_ROCK);
        }
    }

    public static class Abnormals {

        public static void abnormalsWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, abnormalsFolder + "abnormalsWoodLang", LANG_WOOD);
        }

        public static void abnormalsWoodWardenLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, abnormalsFolder + "abnormalsWoodWardenLang", LANG_WOOD);
        }

        public static void abnormalsWoodSnifferLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, abnormalsFolder + "abnormalsWoodSnifferLang", LANG_WOOD);
        }

        public static void abnormalsLeaveLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, abnormalsFolder + "abnormalsLeaveLang", LANG_LEAVE);
        }

        public static void abnormalsLeaveSnifferLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, abnormalsFolder + "abnormalsLeaveSnifferLang", LANG_LEAVE);
        }

        public static void abnormalsRockLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, abnormalsFolder + "abnormalsRockLang", LANG_ROCK);
        }

        public static void abnormalsRockWardenLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, abnormalsFolder + "abnormalsRockWardenLang", LANG_ROCK);
        }

        public static void abnormalsRockSnifferLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, abnormalsFolder + "abnormalsRockSnifferLang", LANG_ROCK);
        }
    }

    public static class Aurora {

        public static void auroraWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, auroraFolder + "auroraWoodLang", LANG_WOOD);
        }

        public static void auroraWoodCaveLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, auroraFolder + "auroraWoodCaveLang", LANG_WOOD);
        }

        public static void auroraWoodSnifferLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, auroraFolder + "auroraWoodSnifferLang", LANG_WOOD);
        }

        public static void auroraLeaveLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, auroraFolder + "auroraLeaveLang", LANG_LEAVE);
        }

        public static void auroraLeaveBreezeLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, auroraFolder + "auroraLeaveBreezeLang", LANG_LEAVE);
        }

        //!No Man Land + EM 1.21+
        public static void auroraWoodBreezeLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, auroraFolder + "auroraWoodBreezeLang", LANG_WOOD);
        }
    }

    public static class ModdingLegacy {

        public static void blueSkiesWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, moddingLegacyFolder + "blueSkiesWoodLang", LANG_WOOD);
        }

        public static void blueSkiesWoodSnifferLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, moddingLegacyFolder + "blueSkiesWoodSnifferLang", LANG_WOOD);
        }

        public static void premiumWoodWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, moddingLegacyFolder + "premiumWoodWoodLang", LANG_WOOD);
        }
    }

    public static class Quark {

        public static void quarkWoodCaveLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkWoodCaveLang", LANG_WOOD);
        }

        public static void quarkWoodWardenLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkWoodWardenLang", LANG_WOOD);
        }

        public static void quarkWoodSnifferLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkWoodSnifferLang", LANG_WOOD);
        }

        public static void quarkRockLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkRockLang", LANG_ROCK);
        }

        public static void quarkRockCaveLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkRockCaveLang", LANG_ROCK);
        }

        public static void quarkRockSnifferLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkRockSnifferLang", LANG_ROCK);
        }

        public static void quarkLeaveLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkLeaveLang", LANG_LEAVE);
        }

        public static void quarkLeaveCaveLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkLeaveCaveLang", LANG_LEAVE);
        }

        public static void quarkLeaveWardenLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkLeaveWardenLang", LANG_LEAVE);
        }

        public static void quarkLeaveSnifferLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, quarkFolder + "quarkLeaveSnifferLang", LANG_LEAVE);
        }
    }

    public static class Sajevius {

        public static void sajeviusWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, sajeviusFolder + "sajeviusWoodLang", LANG_WOOD);
        }

        public static void sajeviusLeaveLang(List<String> LANG_LEAVE, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, sajeviusFolder + "sajeviusLeaveLang", LANG_LEAVE);
        }

        public static void sajeviusRockLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, sajeviusFolder + "sajeviusRockLang", LANG_ROCK);
        }
    }

    public static class TerraformersMC {

        public static void terraformersMCWoodLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, terraformersmcFolder + "terraformersMCWoodLang", LANG_WOOD);
        }

        public static void terraformersMCLeaveLang(List<String> LANG_WOOD, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, terraformersmcFolder + "terraformersMCLeaveLang", LANG_WOOD);
        }

        public static void terraformersMCRockLang(List<String> LANG_ROCK, String language) {
            addListWithPath(McwAPI.READER_MCW_LANG + language + sep, terraformersmcFolder + "terraformersMCRockLang", LANG_ROCK);
        }
    }

    public static class Minecraft
    {
        public static void mcPaths(List<String> ID_ROCK, List<String> LANG_ROCK)
        {
            addListWithPath(McwAPI.READER_MCW_LANG + "fr_fr" + sep, minecraftFolder +
                    "mcPaths", LANG_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, minecraftFolder + File.separator + "mcPaths", ID_ROCK);
        }

        public static void mcRockBridges(List<String> ID_ROCK, List<String> LANG_ROCK)
        {
            addListWithPath(McwAPI.READER_MCW_LANG + "fr_fr" + sep, minecraftFolder +
                    "mcRockBridges", LANG_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, minecraftFolder + File.separator + "mcRockBridges", ID_ROCK);
        }

        public static void mcRoofs(List<String> ID_ROCK, List<String> LANG_ROCK)
        {
            addListWithPath(McwAPI.READER_MCW_LANG + "fr_fr" + sep, minecraftFolder +
                    "mcRoofs", LANG_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, minecraftFolder + File.separator + "mcRoofs", ID_ROCK);
        }

        public static void mcRockFences(List<String> ID_ROCK, List<String> LANG_ROCK)
        {
            addListWithPath(McwAPI.READER_MCW_LANG + "fr_fr" + sep, minecraftFolder +
                    "mcRockFences", LANG_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, minecraftFolder + File.separator + "mcRockFences", ID_ROCK);
        }

        public static void mcRockStairs(List<String> ID_ROCK, List<String> LANG_ROCK)
        {
            addListWithPath(McwAPI.READER_MCW_LANG + "fr_fr" + sep, minecraftFolder +
                    "mcRockStairs", LANG_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, minecraftFolder + File.separator + "mcRockStairs", ID_ROCK);
        }

        public static void mcRockWindows(List<String> ID_ROCK, List<String> LANG_ROCK)
        {
            addListWithPath(McwAPI.READER_MCW_LANG + "fr_fr" + sep, minecraftFolder +
                    "mcRockWindows", LANG_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, minecraftFolder + File.separator + "mcRockWindows", ID_ROCK);
        }

        public static void mcWood(List<String> ID_WOOD, List<String> LANG_WOOD)
        {
            addListWithPath(McwAPI.READER_MCW_LANG + "fr_fr" + sep, minecraftFolder +
                    "mcWood", LANG_WOOD);
            addListWithPath(McwAPI.READER_MODLIST, minecraftFolder + File.separator + "mcWood", ID_WOOD);
        }
    }
}