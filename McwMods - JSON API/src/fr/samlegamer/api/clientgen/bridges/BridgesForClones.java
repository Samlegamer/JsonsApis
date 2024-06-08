package fr.samlegamer.api.clientgen.bridges;

import java.io.File;

import fr.samlegamer.utils.APIWriter;

/*
 * It's used for McwBridges Modding Legacy
 * If your addons use à cherry wood in 2 mod ex: bop:cherry byg:cherry
 * then use this to add prefix in the file like "bop_"/"byg_" ex: bop_cherry_bridge byg_cherry_bridge
 */
public class BridgesForClones
{
	public static class BridgeLog
	{
		public static void createModelBlockCustom(String location, String prefix, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/bridge/bridge_wood/" + prefix + nameMaterial + "_base" + ".json");
			File bridge_corner = new File(location + "/models/block/bridge/bridge_wood/" + prefix + nameMaterial + "_corner" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/bridge_wood/" + prefix + nameMaterial + "_middle" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/bridge_wood/" + prefix + nameMaterial + "_side" + ".json");

		APIWriter.write(location, bridge_base, "{\r\n"
				+ "	\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/base\",\r\n"
				+ "	\"textures\": {\r\n"
				+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
				+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
				+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "");
				
		APIWriter.write(location, bridge_corner, "	{\r\n"
				+ "	\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/corner\",\r\n"
				+ "	\"textures\": {\r\n"
				+ "		\"5\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
				+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
				+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "");
		
		APIWriter.write(location, bridge_middle, "	{\r\n"
				+ "	\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/middle\",\r\n"
				+ "	\"textures\": {\r\n"
				+ "		\"5\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
				+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
				+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "");
		
		APIWriter.write(location, bridge_side, "	{\r\n"
				+ "	\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/side\",\r\n"
				+ "	\"textures\": {\r\n"
				+ "		\"5\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
				+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
				+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "");
		}
	}

	public static class RopeBridge
	{
		public static void createModelBlockCustom(String location, String prefix, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_base" + ".json");
			File bridge_corner_clear = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_corner_clear" + ".json");
			File bridge_corner_clear_r = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_corner_clear_r" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_middle" + ".json");
			File bridge_middle_end = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_middle_end" + ".json");
			File bridge_middle_r = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_middle_r" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_side" + ".json");
			File bridge_side_left = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_side_left" + ".json");
			File bridge_side_left_r = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_side_left_r" + ".json");
			File bridge_side_r = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_side_r" + ".json");
			File bridge_side_right = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_side_right" + ".json");
			File bridge_side_right_r = new File(location + "/models/block/bridge/rope/" +prefix+ nameMaterial + "_side_right" + ".json");

		
			APIWriter.write(location, bridge_base, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}");
		
			APIWriter.write(location, bridge_corner_clear, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/corner_clear\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_corner_clear_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/corner_clear_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_middle, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_middle_end, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/middle_end\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_middle_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/middle_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_left, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_left_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_left_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_right, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_right_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_right_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
	}
	}

	public static class StairRope
	{
		public static void createModelBlockCustom(String location, String prefix, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/stair/rope/" +prefix+ nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/rope/" +prefix+ nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/rope/" +prefix+ nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/rope/" +prefix+ nameMaterial + "_right" + ".json");

			APIWriter.write(location, bridge_base, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/rope/parent/base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "	    \"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_double, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/rope/parent/double\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert_stair\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, bridge_left, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/rope/parent/left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert_stair\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_right, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/rope/parent/right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert_stair\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}
	}
	
	public static class StairWood
	{
		public static void createModelBlockCustom(String location, String prefix, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/stair/wood/" +prefix+ nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/wood/" +prefix+ nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/wood/" +prefix+ nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/wood/" +prefix+ nameMaterial + "_right" + ".json");

			APIWriter.write(location, bridge_base, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/wood/parent/base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, bridge_double, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/wood/parent/double\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, bridge_left, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/wood/parent/left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_right, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/wood/parent/right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}

	}
	
	public static class BridgeRailWood
	{
		public static void createModelBlockCustom(String location, String prefix, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesStripped, String nameOfTexturesLogs)
		{
			File rail = new File(location + "/models/block/bridge/rail/" +prefix+ nameMaterial + ".json");
			File railPower = new File(location + "/models/block/bridge/rail/" +prefix+ nameMaterial + "_powered" + ".json");
			
			APIWriter.write(location, rail, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rail/parent/rail\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/" + nameOfTexturesStripped + "\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, railPower, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rail/parent/rail_powered\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/" + nameOfTexturesStripped + "\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
					+ "		\"2\": \"minecraft:block/redstone_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"\r\n"
					+ "	}\r\n"
					+ "}");
		}

	}
	
	public static class PierWood
	{
		public static void createModelBlockCustom(String location, String prefix, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_pillar_single = new File(location + "/models/block/support_pier/wooden/" + prefix + nameMaterial + "_pillar_single" + ".json");

			APIWriter.write(location, bridge_pillar_single, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/support_pier/parent/pillar_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}
	}
}
