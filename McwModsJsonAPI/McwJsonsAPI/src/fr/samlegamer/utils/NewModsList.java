package fr.samlegamer.utils;

import fr.samlegamer.McwAPI;
import fr.samlegamer.registry.Compatibilities;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static fr.samlegamer.utils.Reference.*;

public class NewModsList
{
    public static class RegionsUnexplored
    {
        public static void regionsUnexploredWood(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST, regionsUnexploredFolder + "regionsUnexploredWood", ID_WOOD);
        }

        public static void regionsUnexploredLeave(List<String> ID_LEAVE)
        {
            addListWithPath(McwAPI.READER_MODLIST, regionsUnexploredFolder + "regionsUnexploredLeave", ID_LEAVE);
        }
    }

    public static class BOP
    {
        public static void bopWood(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST, bopFolder + "bopWood", ID_WOOD);
        }

        public static void bopWood1201(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST, bopFolder + "bop1201Wood", ID_WOOD);
        }

        public static void bopLeave(List<String> ID_LEAVE)
        {
            addListWithPath(McwAPI.READER_MODLIST, bopFolder + "bopLeaves", ID_LEAVE);
        }

        public static void bopLeave1201(List<String> ID_LEAVE)
        {
            addListWithPath(McwAPI.READER_MODLIST, bopFolder + "bop1201Leaves", ID_LEAVE);
        }

        public static void bopLeaveCopperGolem(List<String> ID_LEAVE)
        {
            addListWithPath(McwAPI.READER_MODLIST, bopFolder + "bopCopperGolemLeaves", ID_LEAVE);
        }
    }

    public static class BYG {
        public static void bygWood(List<String> ID_WOOD) {
            bygWood(ID_WOOD, false);
            bygWood(ID_WOOD, true);
        }

        public static void bygWood(List<String> ID_WOOD, boolean isStem) {
            if (isStem) {
                addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygWoodIsStem", ID_WOOD);
            } else {
                addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygWoodNotStem", ID_WOOD);
            }
        }

        public static void bygWoodWarden(List<String> ID_WOOD) {
            bygWoodWarden(ID_WOOD, false);
            bygWoodWarden(ID_WOOD, true);
        }

        public static void bygWoodWarden(List<String> ID_WOOD, boolean isStem) {
            if (isStem) {
                addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygWoodIsStem", ID_WOOD);
            } else {
                addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygWardenWoodNotStem", ID_WOOD);
            }
        }

        public static void bygLeavesWarden(List<String> ID_LEAVE)
        {
            bygLeavesWarden(ID_LEAVE, false);
            bygLeavesWarden(ID_LEAVE, true);
        }

        public static void bygLeavesWarden(List<String> ID_LEAVE, boolean specialFolder)
        {
            if (specialFolder) {
                addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygWardenLeavesSpecialFolder", ID_LEAVE);
            } else {
                addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygWardenLeaves", ID_LEAVE);
            }
        }

        public static void bygLeaves(List<String> ID_LEAVE)
        {
            addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygLeaves", ID_LEAVE);
        }

        public static void bygRock(List<String> ID_ROCK)
        {
            bygRock(ID_ROCK, List.of(), List.of());
        }

        public static void bygRock(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR)
        {
            addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygRockMat", ID_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygRockWall", WALL);
            addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygRockFloor", FLOOR);
        }

        public static void bygRockFenceable(List<String> ID_ROCK)
        {
            bygRockFenceable(ID_ROCK, List.of(), List.of());
        }

        public static void bygRockFenceable(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR)
        {
            addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygRockFenceableMat", ID_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygRockFenceableWall", WALL);
            addListWithPath(McwAPI.READER_MODLIST, bygFolder + "bygRockFenceableFloor", FLOOR);
        }
    }

    public static class BWG
    {
        public static void bwgWood(List<String> ID_WOOD)
        {
            bwgWood(ID_WOOD, false);
            bwgWood(ID_WOOD, true);
        }

        public static void bwgWood(List<String> ID_WOOD, boolean isStem) {
            if (isStem) {
                addListWithPath(McwAPI.READER_MODLIST, bwgFolder + "bwgWoodIsStem", ID_WOOD);
            } else {
                addListWithPath(McwAPI.READER_MODLIST, bwgFolder + "bwgWoodNotStem", ID_WOOD);
            }
        }

        public static void bwgLeaves(List<String> ID_LEAVE)
        {
            bwgLeaves(ID_LEAVE, false);
            bwgLeaves(ID_LEAVE, true);
        }

        public static void bwgLeaves(List<String> ID_LEAVE, boolean specialFolder) {
            if (specialFolder) {
                addListWithPath(McwAPI.READER_MODLIST, bwgFolder + "bwgLeavesSpecialFolder", ID_LEAVE);
            } else {
                addListWithPath(McwAPI.READER_MODLIST, bwgFolder + "bwgLeaves", ID_LEAVE);
            }
        }

        public static void bwgRock(List<String> ID_ROCK)
        {
            bwgRock(ID_ROCK, List.of(), List.of());
        }

        public static void bwgRock(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR)
        {
            addListWithPath(McwAPI.READER_MODLIST, bwgFolder + "bwgRockMat", ID_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, bwgFolder + "bwgRockWall", WALL);
            addListWithPath(McwAPI.READER_MODLIST, bwgFolder + "bwgRockFloor", FLOOR);
        }

    }

    public static class TerraformersMC {
        public static void TerraformersMCLeaves(List<String> ID_LEAVE) {
            TerraformersMCLeaves(ID_LEAVE, Compatibilities.TRAVERSE_MODID);
            TerraformersMCLeaves(ID_LEAVE, Compatibilities.TERRESTRIA_MODID);
        }

        public static void TerraformersMCLeaves(List<String> ID_LEAVE, String compat) {
            if (compat.equals(Compatibilities.TRAVERSE_MODID)) {
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "traverseLeaves", ID_LEAVE);
            }

            if (compat.equals(Compatibilities.TERRESTRIA_MODID)) {
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "terrestriaLeaves", ID_LEAVE);
            }
        }

        public static void TerraformersMCWood(List<String> ID_WOOD)
        {
            TerraformersMCWood(ID_WOOD, Compatibilities.TRAVERSE_MODID);
            TerraformersMCWood(ID_WOOD, Compatibilities.CINDERSCAPES_MODID);
            TerraformersMCWood(ID_WOOD, Compatibilities.TERRESTRIA_MODID);
        }

        public static void TerraformersMCWood(List<String> ID_WOOD, String compat)
        {
            if(compat.equals(Compatibilities.TRAVERSE_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "traverseWood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.CINDERSCAPES_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "cinderscapesWood", ID_WOOD);
            }

            if (compat.equals(Compatibilities.TERRESTRIA_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "terrestriaWood", ID_WOOD);
            }
        }

        public static void TerraformersMCRock(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR)
        {
            TerraformersMCRock(ID_ROCK, WALL, FLOOR, Compatibilities.CINDERSCAPES_MODID);
            TerraformersMCRock(ID_ROCK, WALL, FLOOR, Compatibilities.TERRESTRIA_MODID);
        }

        public static void TerraformersMCRock(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR, String compat)
        {
            if(compat.equals(Compatibilities.CINDERSCAPES_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "cinderscapesRockMat", ID_ROCK);
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "cinderscapesRockWall", WALL);
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "cinderscapesRockFloor", FLOOR);
            }

            if(compat.equals(Compatibilities.TERRESTRIA_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "terrestriaRockMat", ID_ROCK);
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "terrestriaRockWall", WALL);
                addListWithPath(McwAPI.READER_MODLIST, terraformersmcFolder + "terrestriaRockFloor", FLOOR);
            }
        }
    }

    public static class Quark {
        public static void quarkRock(List<String> ID_ROCK) {
            quarkRock(ID_ROCK, List.of(), List.of());
        }

        public static void quarkRock(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR) {
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockMat", ID_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockWall", WALL);
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockFloor", FLOOR);
        }

        public static void quarkRockCaveAndCliff(List<String> ID_ROCK)
        {
            quarkRockCaveAndCliff(ID_ROCK, List.of(), List.of());
        }

        public static void quarkRockCaveAndCliff(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR)
        {
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockCaveAndCliffRockMat", ID_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockCaveAndCliffRockWall", WALL);
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockCaveAndCliffRockFloor", FLOOR);
        }

        public static void quarkRockSniffer(List<String> ID_ROCK)
        {
            quarkRockSniffer(ID_ROCK, List.of(), List.of());
        }

        public static void quarkRockSniffer(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR)
        {
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockSnifferRockMat", ID_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockSnifferRockWall", WALL);
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkRockSnifferRockFloor", FLOOR);
        }

        public static void quarkLeaves(List<String> ID_LEAVE)
        {
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkLeaves", ID_LEAVE);
        }

        public static void quarkLeavesWarden(List<String> ID_LEAVE)
        {
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkLeavesWarden", ID_LEAVE);
        }

        public static void quarkLeavesSniffer(List<String> ID_LEAVE)
        {
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkLeavesSniffer", ID_LEAVE);
        }

        public static void quarkWoodCaveAndCliff(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkWoodCaveAndCliff", ID_WOOD);
        }

        public static void quarkWoodWarden(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST, quarkFolder + "quarkWoodWarden", ID_WOOD);
        }
    }

    public static class Sajevius
    {
        public static void sajeviusWood(List<String> ID_WOOD)
        {
            shroomedWood(ID_WOOD);
            betterlandsWood(ID_WOOD);
        }

        public static void shroomedWood(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST, sajeviusFolder + "shroomedWood", ID_WOOD);
        }

        public static void betterlandsWood(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST, sajeviusFolder + "betterlandsWood", ID_WOOD);
        }

        public static void betterlandsRock(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR)
        {
            addListWithPath(McwAPI.READER_MODLIST, sajeviusFolder + "betterlandsRockMat", ID_ROCK);
            addListWithPath(McwAPI.READER_MODLIST, sajeviusFolder + "betterlandsRockWall", WALL);
            addListWithPath(McwAPI.READER_MODLIST, sajeviusFolder + "betterlandsRockFloor", FLOOR);
        }
    }

    public static class Abnormals
    {
        public static void abnormalsWood(List<String> ID_WOOD)
        {
            abnormalsWood(ID_WOOD, Compatibilities.ATMO_MODID);
            abnormalsWood(ID_WOOD, Compatibilities.AUTUM_MODID);
            abnormalsWood(ID_WOOD, Compatibilities.ENVI_MODID);
            abnormalsWood(ID_WOOD, Compatibilities.UAQUA_MODID);
            abnormalsWood(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
        }

        public static void abnormalsWoodWarden(List<String> ID_WOOD)
        {
            abnormalsWood(ID_WOOD);
            abnormalsWood(ID_WOOD, Compatibilities.CAVERNCHASMS_MODID);
        }

        public static void abnormalsWood(List<String> ID_WOOD, String compat)
        {
            if(compat.equals(Compatibilities.ATMO_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ATMO_MODID + File.separator + "Wood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.AUTUM_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.AUTUM_MODID + File.separator + "Wood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.ENVI_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ENVI_MODID + File.separator + "Wood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.UAQUA_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.UAQUA_MODID + File.separator + "Wood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.ENDERGETIC_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ENDERGETIC_MODID + File.separator + "Wood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.CAVERNCHASMS_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.CAVERNCHASMS_MODID + File.separator + "Wood", ID_WOOD);
            }
        }

        public static void abnormalsRock(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR, String compat)
        {
            if(compat.equals(Compatibilities.BUZZBEES_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.BUZZBEES_MODID + File.separator + "RockMat", ID_ROCK);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.BUZZBEES_MODID + File.separator + "RockWall", WALL);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.BUZZBEES_MODID + File.separator + "RockFloor", FLOOR);
            }

            if(compat.equals(Compatibilities.ATMO_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ATMO_MODID + File.separator + "RockMat", ID_ROCK);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ATMO_MODID + File.separator + "RockWall", WALL);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ATMO_MODID + File.separator + "RockFloor", FLOOR);
            }

            if(compat.equals(Compatibilities.AUTUM_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.AUTUM_MODID + File.separator + "RockMat", ID_ROCK);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.AUTUM_MODID + File.separator + "RockWall", WALL);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.AUTUM_MODID + File.separator + "RockFloor", FLOOR);
            }


        }

        public static void abnormalsRockWarden(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR, String compat)
        {
            if(compat.equals(Compatibilities.CAVERNCHASMS_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.CAVERNCHASMS_MODID + File.separator + "RockMat", ID_ROCK);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.CAVERNCHASMS_MODID + File.separator + "RockWall", WALL);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.CAVERNCHASMS_MODID + File.separator + "RockFloor", FLOOR);
            }
        }

        public static void abnormalsRockSniffer(List<String> ID_ROCK, List<String> WALL, List<String> FLOOR, String compat)
        {
            if(compat.equals(Compatibilities.CAVERNCHASMS_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.CAVERNCHASMS_MODID + File.separator + "RockMatSniffer", ID_ROCK);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.CAVERNCHASMS_MODID + File.separator + "RockWallSniffer", WALL);
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.CAVERNCHASMS_MODID + File.separator + "RockFloorSniffer", FLOOR);
            }
        }

        public static void abnormalsRock(List<String> ID_ROCK)
        {
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.BUZZBEES_MODID);
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.ATMO_MODID);
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.AUTUM_MODID);
        }

        public static void abnormalsRockWarden(List<String> ID_ROCK)
        {
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.BUZZBEES_MODID);
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.ATMO_MODID);
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.AUTUM_MODID);
            abnormalsRockWarden(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.CAVERNCHASMS_MODID);
        }

        public static void abnormalsRockSniffer(List<String> ID_ROCK)
        {
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.BUZZBEES_MODID);
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.ATMO_MODID);
            abnormalsRock(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.AUTUM_MODID);
            abnormalsRockSniffer(ID_ROCK, new ArrayList<String>(), new ArrayList<String>(), Compatibilities.CAVERNCHASMS_MODID);
        }

        public static void abnormalsLeaves(List<String> ID_LEAVE)
        {
            abnormalsLeaves(ID_LEAVE, Compatibilities.ATMO_MODID);
            abnormalsLeaves(ID_LEAVE, Compatibilities.AUTUM_MODID);
            abnormalsLeaves(ID_LEAVE, Compatibilities.ENVI_MODID);
            abnormalsLeaves(ID_LEAVE, Compatibilities.UAQUA_MODID);
        }

        public static void abnormalsLeaves(List<String> ID_LEAVE, String compat)
        {
            if(compat.equals(Compatibilities.ATMO_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ATMO_MODID + File.separator + "Leave", ID_LEAVE);
            }

            if(compat.equals(Compatibilities.AUTUM_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.AUTUM_MODID + File.separator + "Leave", ID_LEAVE);
            }

            if(compat.equals(Compatibilities.ENVI_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ENVI_MODID + File.separator + "Leave", ID_LEAVE);
            }

            if(compat.equals(Compatibilities.UAQUA_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.UAQUA_MODID + File.separator + "Leave", ID_LEAVE);
            }
        }

        public static void abnormalsWood120(List<String> ID_WOOD)
        {
            abnormalsWood120(ID_WOOD, Compatibilities.ATMO_MODID);
            abnormalsWood120(ID_WOOD, Compatibilities.AUTUM_MODID);
            abnormalsWood120(ID_WOOD, Compatibilities.ENVI_MODID);
            abnormalsWood120(ID_WOOD, Compatibilities.UAQUA_MODID);
            abnormalsWood120(ID_WOOD, Compatibilities.ENDERGETIC_MODID);
            abnormalsWood120(ID_WOOD, Compatibilities.CAVERNCHASMS_MODID);
        }

        public static void abnormalsWood120(List<String> ID_WOOD, String compat)
        {
            if(compat.equals(Compatibilities.ATMO_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ATMO_MODID + File.separator + "WoodSniffer", ID_WOOD);
            }

            if(compat.equals(Compatibilities.AUTUM_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.AUTUM_MODID + File.separator + "Wood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.ENVI_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ENVI_MODID + File.separator + "WoodSniffer", ID_WOOD);
            }

            if(compat.equals(Compatibilities.UAQUA_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.UAQUA_MODID + File.separator + "Wood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.ENDERGETIC_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ENDERGETIC_MODID + File.separator + "Wood", ID_WOOD);
            }

            if(compat.equals(Compatibilities.CAVERNCHASMS_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.CAVERNCHASMS_MODID + File.separator + "Wood", ID_WOOD);
            }
        }

        public static void abnormalsLeaves120(List<String> ID_LEAVE)
        {
            abnormalsLeaves120(ID_LEAVE, Compatibilities.ATMO_MODID);
            abnormalsLeaves120(ID_LEAVE, Compatibilities.AUTUM_MODID);
            abnormalsLeaves120(ID_LEAVE, Compatibilities.ENVI_MODID);
            abnormalsLeaves120(ID_LEAVE, Compatibilities.UAQUA_MODID);
        }

        public static void abnormalsLeaves120(List<String> ID_LEAVE, String compat)
        {
            if(compat.equals(Compatibilities.ATMO_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ATMO_MODID + File.separator + "LeaveSniffer", ID_LEAVE);
            }

            if(compat.equals(Compatibilities.AUTUM_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.AUTUM_MODID + File.separator + "Leave", ID_LEAVE);
            }

            if(compat.equals(Compatibilities.ENVI_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.ENVI_MODID + File.separator + "LeaveSniffer", ID_LEAVE);
            }

            if(compat.equals(Compatibilities.UAQUA_MODID))
            {
                addListWithPath(McwAPI.READER_MODLIST, abnormalsFolder +
                        Compatibilities.UAQUA_MODID + File.separator + "Leave", ID_LEAVE);
            }
        }
    }

    public static class Aurora {

        public static void auroraWood(List<String> ID_WOOD) {
            auroraWood(ID_WOOD, Compatibilities.BAYOU_BLUES_MODID);
            auroraWood(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID);
            auroraWood(ID_WOOD, Compatibilities.ABUNDANCE_MODID);
        }

        public static void auroraWood(List<String> ID_WOOD, String compat) {
            if (compat.equals(Compatibilities.BAYOU_BLUES_MODID)) {
                addListWithPath(McwAPI.READER_MODLIST, auroraFolder +
                        Compatibilities.BAYOU_BLUES_MODID + File.separator + "Wood", ID_WOOD);
            }

            if (compat.equals(Compatibilities.ENHANCED_MUSHROOMS_MODID)) {
                addListWithPath(McwAPI.READER_MODLIST, auroraFolder +
                        Compatibilities.ENHANCED_MUSHROOMS_MODID + File.separator + "Wood", ID_WOOD);
            }

            if (compat.equals(Compatibilities.ABUNDANCE_MODID)) {
                addListWithPath(McwAPI.READER_MODLIST, auroraFolder +
                        Compatibilities.ABUNDANCE_MODID + File.separator + "Wood", ID_WOOD);
            }
        }

        public static void auroraLeave(List<String> ID_LEAVE) {
            auroraLeave(ID_LEAVE, Compatibilities.BAYOU_BLUES_MODID);
            auroraLeave(ID_LEAVE, Compatibilities.ABUNDANCE_MODID);
        }

        public static void auroraLeave(List<String> ID_LEAVE, String compat) {
            if (!compat.equals(Compatibilities.ENHANCED_MUSHROOMS_MODID)) {
                auroraWood(ID_LEAVE, compat);
            }
        }

        /* Aurora Team doesn't port Abundance or Bayou Blues In next version
         * Old Block is removed */
        public static void auroraCaveWood(List<String> ID_WOOD) {
            auroraWood(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID);
        }

        /* Only one mat in 1.20.1 version */
        public static void auroraSnifferWood(List<String> ID_WOOD) {
            addListWithPath(McwAPI.READER_MODLIST, auroraFolder +
                    Compatibilities.ENHANCED_MUSHROOMS_MODID + File.separator + "WoodSniffer", ID_WOOD);
        }

        /* For 1.21.1 Neoforge */
        public static void auroraBreezeWood(List<String> ID_WOOD, String compat)
        {
            if(compat.equals(Compatibilities.ENHANCED_MUSHROOMS_MODID))
            {
                auroraSnifferWood(ID_WOOD);
            }

            if(compat.equals(Compatibilities.NOMANSLAND))
            {
                addListWithPath(McwAPI.READER_MODLIST, auroraFolder +
                        Compatibilities.NOMANSLAND + File.separator + "WoodBreeze", ID_WOOD);
            }
        }

        public static void auroraBreezeLeave(List<String> ID_LEAVE) {
            addListWithPath(McwAPI.READER_MODLIST, auroraFolder +
                    Compatibilities.NOMANSLAND + File.separator + "LeaveBreeze", ID_LEAVE);
        }

        public static void auroraBreezeNormalFolderLeave(List<String> ID_LEAVE) {
            addListWithPath(McwAPI.READER_MODLIST, auroraFolder +
                    Compatibilities.NOMANSLAND + File.separator + "LeaveNormalFolderBreeze", ID_LEAVE);
        }

        public static void auroraBreezeSpecialFolderLeave(List<String> ID_LEAVE) {
            addListWithPath(McwAPI.READER_MODLIST, auroraFolder +
                    Compatibilities.NOMANSLAND + File.separator + "LeaveSpecialFolderBreeze", ID_LEAVE);
        }

        public static void auroraBreezeWood(List<String> ID_WOOD)
        {
            auroraBreezeWood(ID_WOOD, Compatibilities.ENHANCED_MUSHROOMS_MODID);
            auroraBreezeWood(ID_WOOD, Compatibilities.NOMANSLAND);
        }
    }

    public static class ModdingLegacy
    {
        public static void ModdingLegacyWoods(List<String> ID_WOOD)
        {
            BlueSkiesBsky(ID_WOOD);
            PremiumWoodPwood(ID_WOOD);
        }

        public static void BlueSkiesBsky(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST,
                    moddingLegacyFolder + Compatibilities.BLUE_SKIES_MODID + File.separator + "BlueSkiesBsky", ID_WOOD);
        }

        public static void BlueSkiesTextures(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST,
                    moddingLegacyFolder + Compatibilities.BLUE_SKIES_MODID + File.separator + "BlueSkiesTextures", ID_WOOD);
        }

        /* New for 1.20.1 */
        public static void BlueSkiesBsky1201(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST,
                    moddingLegacyFolder + Compatibilities.BLUE_SKIES_MODID + File.separator + "BlueSkiesBskySniffer", ID_WOOD);
        }

        public static void BlueSkiesTextures1201(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST,
                    moddingLegacyFolder + Compatibilities.BLUE_SKIES_MODID + File.separator + "BlueSkiesTexturesSniffer", ID_WOOD);
        }

        public static void PremiumWoodPwood(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST,
                    moddingLegacyFolder + Compatibilities.PREMIUM_WOOD_MODID + File.separator + "PremiumWoodPwood", ID_WOOD);
        }

        public static void PremiumWoodPwoodTextures(List<String> ID_WOOD)
        {
            addListWithPath(McwAPI.READER_MODLIST,
                    moddingLegacyFolder + Compatibilities.PREMIUM_WOOD_MODID + File.separator + "PremiumWoodTextures", ID_WOOD);
        }
    }
}