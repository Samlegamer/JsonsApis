package fr.samlegamer.utils;

import java.util.List;

public interface IUtils
{
	public void eventAcceptTab(String LOCATION, List<String> MAT_WOOD, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR, String ClassMod);
	
	public void createWoodBridges(String LOCATION, String ModidExtended, List<String> MAT_WOOD, List<String> MAJ_MAT);
	
	public void createRockBridges(String LOCATION, String ModidExtended, List<String> MAT_ROCK, List<String> WALL, List<String> FLOOR);
}