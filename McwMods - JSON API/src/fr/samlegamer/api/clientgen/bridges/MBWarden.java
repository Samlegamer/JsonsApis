package fr.samlegamer.api.clientgen.bridges;

import java.io.File;

import fr.samlegamer.utils.APIWriter;

public class MBWarden // + nameMaterial + (isStemTexture ? "_stem" : "_log") +
{	
	//Maj 3.0.0
	public static void init(String location)
	{
		File folderBlockstates = new File(location + "blockstates/");
		File folderModels = new File(location + "models/");
		File folderBlock = new File(location + "models/block/");
		File folderBridge = new File(location + "models/block/bridge/");
		File folderBridgeWood = new File(location + "models/block/bridge/bridge_wood/");
		File folderBridgeStone = new File(location + "models/block/bridge/bridge_stone/");
		File folderBridgerail = new File(location + "models/block/bridge/rail/");
		File folderBridgeRope = new File(location + "models/block/bridge/rope/");
		File folderItem = new File(location + "models/item/");
		File folderStair = new File(location + "models/block/stair/");
		File folderStairWood = new File(location + "models/block/stair/wood/");
		File folderStairRope = new File(location + "models/block/stair/rope/");
		File folderStairStone = new File(location + "models/block/stair/stone/");
		File foldersupport_pier = new File(location + "models/block/support_pier/");
		File foldersupport_pierWood = new File(location + "models/block/support_pier/wooden/");
		File foldersupport_pierStone = new File(location + "models/block/support_pier/stone/");
		
		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists() || !folderBridge.exists()
		|| !folderBridgeWood.exists() || !folderItem.exists() || !folderBridgeStone.exists() || !folderBridgeRope.exists()
		|| !folderStair.exists() || !folderStairWood.exists() || !folderStairRope.exists() || !folderStairStone.exists()
		|| !foldersupport_pier.exists() || !foldersupport_pierWood.exists() || !foldersupport_pierStone.exists() || !folderBridgerail.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderBridge.mkdir();
			folderBridgeWood.mkdir();
			folderItem.mkdir();
			folderBridgeStone.mkdir();
			folderBridgeRope.mkdir();
			folderBridgerail.mkdir();
			folderStair.mkdir();
			folderStairWood.mkdir();
			folderStairRope.mkdir();
			folderStairStone.mkdir();
			foldersupport_pier.mkdir();
			foldersupport_pierWood.mkdir();
			foldersupport_pierStone.mkdir();
		}
	}
	
	public static class BridgeLog
	{
		//Maj 3.0.0
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_log_bridge_middle" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {                     \r\n"
					+ "		\"connection=base\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_base\",\"uvlock\": true},\r\n"
					+ "		\"connection=base_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_base\",\"uvlock\": true},\r\n"
					+ "		\r\n"
					+ "        \"connection=middle_ns\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_middle\", \"y\": 90,\"uvlock\": true},\r\n"
					+ "		\"connection=middle_ew\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_middle\",\"uvlock\": true},\r\n"
					+ "\r\n"
					+ "		\"connection=corner_nw\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_corner\", \"y\": 180,\"uvlock\": true},\r\n"
					+ "		\"connection=corner_ne\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_corner\", \"y\": 270,\"uvlock\": true},\r\n"
					+ "		\"connection=corner_se\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_corner\",\"uvlock\": true},\r\n"
					+ "		\"connection=corner_sw\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_corner\", \"y\": 90,\"uvlock\": true},	\r\n"
					+ "		\r\n"
					+ "		\"connection=side_s\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_side\",\"uvlock\": true},\r\n"
					+ "		\"connection=side_n\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_side\", \"y\": 180,\"uvlock\": true},\r\n"
					+ "		\"connection=side_w\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_side\", \"y\": 90,\"uvlock\": true},\r\n"
					+ "		\"connection=side_e\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_side\", \"y\": 270,\"uvlock\": true},\r\n"
					+ "		\r\n"
					+ "		\"connection=end_s_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_side\", \"y\": 0,\"uvlock\": true},\r\n"
					+ "		\"connection=end_n_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_side\", \"y\": 180,\"uvlock\": true},\r\n"
					+ "		\"connection=end_w_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_side\", \"y\": 90,\"uvlock\": true},\r\n"
					+ "		\"connection=end_e_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_wood/"+material+"_side\", \"y\": 270,\"uvlock\": true}\r\n"
					+ "    }\r\n"
					+ "}");
		}
	
		//Maj 3.0.0
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File bridge_base = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_base" + ".json");
			File bridge_corner = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_corner" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_middle" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_side" + ".json");

		APIWriter.write(location, bridge_base, "{\r\n"
				+ "	\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/base\",\r\n"
				+ "	\"textures\": {\r\n"
				+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
				+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
				+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\"\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "");
				
		APIWriter.write(location, bridge_corner, "	{\r\n"
				+ "	\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/corner\",\r\n"
				+ "	\"textures\": {\r\n"
				+ "		\"5\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
				+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
				+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\"\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "");
		
		APIWriter.write(location, bridge_middle, "	{\r\n"
				+ "	\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/middle\",\r\n"
				+ "	\"textures\": {\r\n"
				+ "		\"5\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
				+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
				+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\"\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "");
		
		APIWriter.write(location, bridge_side, "	{\r\n"
				+ "	\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/side\",\r\n"
				+ "	\"textures\": {\r\n"
				+ "		\"5\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
				+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
				+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\"\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "");
		
		}
	
		//Maj 3.0.0
		public static void createModelBlockCustom(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_base" + ".json");
			File bridge_corner = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_corner" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_middle" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_side" + ".json");

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

		//Maj 3.0.0
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_log_bridge_middle" + ".json");
			APIWriter.write(location, file, "{\"parent\": \""+modid+":block/bridge/bridge_wood/"+mat+"_middle\"}");
		}
	}
	
	public static class RopeBridge
	{
		//Maj 3.0.0
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + "rope_" + material + "_bridge" + ".json");
	
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {                     \r\n"
					+ "		\"facing=north,connection=base\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_base\"},\r\n"
					+ "		\"facing=north,connection=base_toggled\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_base\"},\r\n"
					+ "		\r\n"
					+ "        \"facing=north,connection=middle_ns\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle\", \"y\": 90},\r\n"
					+ "		\"facing=north,connection=middle_ew\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle\"},\r\n"
					+ "\r\n"
					+ "		\"facing=north,connection=middle_end_s\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle_end\", \"y\": 180},\r\n"
					+ "		\"facing=north,connection=middle_end_n\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle_end\"},\r\n"
					+ "		\"facing=north,connection=middle_end_w\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle_end\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=middle_end_e\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle_end\", \"y\": 90},\r\n"
					+ "\r\n"
					+ "		\"facing=north,connection=corner_nw\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_corner_clear\", \"y\": 180},\r\n"
					+ "		\"facing=north,connection=corner_ne\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_corner_clear_r\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=corner_se\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_corner_clear\"},\r\n"
					+ "		\"facing=north,connection=corner_sw\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_corner_clear_r\", \"y\": 90},	\r\n"
					+ "		\r\n"
					+ "		\"facing=north,connection=side_s\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_r\"},\r\n"
					+ "		\"facing=north,connection=side_n\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_r\", \"y\": 180},\r\n"
					+ "		\"facing=north,connection=side_w\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side\", \"y\": 90},\r\n"
					+ "		\"facing=north,connection=side_e\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side\", \"y\": 270},\r\n"
					+ "		\r\n"
					+ "		\"facing=north,connection=end_n_right\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_right\"},\r\n"
					+ "		\"facing=north,connection=end_n_left\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_left\", \"y\": 180},\r\n"
					+ "		\"facing=north,connection=end_e_right\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_right\", \"y\": 180},\r\n"
					+ "		\"facing=north,connection=end_e_left\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_left\"},\r\n"
					+ "		\r\n"
					+ "		\"facing=north,connection=end_s_left\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_left_r\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=end_s_right\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_right_r\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=end_w_left\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_left_r\", \"y\": 90},\r\n"
					+ "		\"facing=north,connection=end_w_right\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_right_r\", \"y\": 90},\r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "		\"facing=east,connection=base\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_base\", \"y\": 90},\r\n"
					+ "		\"facing=east,connection=base_toggled\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_base\", \"y\": 90},\r\n"
					+ "		\r\n"
					+ "        \"facing=east,connection=middle_ns\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle\", \"y\": 90},\r\n"
					+ "		\"facing=east,connection=middle_ew\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle\"},\r\n"
					+ "\r\n"
					+ "		\"facing=east,connection=middle_end_s\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle_end\", \"y\": 180},\r\n"
					+ "		\"facing=east,connection=middle_end_n\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle_end\"},\r\n"
					+ "		\"facing=east,connection=middle_end_w\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle_end\", \"y\": 270},\r\n"
					+ "		\"facing=east,connection=middle_end_e\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_middle_end\", \"y\": 90},\r\n"
					+ "\r\n"
					+ "		\"facing=east,connection=corner_nw\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_corner_clear_r\", \"y\": 180},\r\n"
					+ "		\"facing=east,connection=corner_ne\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_corner_clear\", \"y\": 270},\r\n"
					+ "		\"facing=east,connection=corner_se\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_corner_clear_r\"},\r\n"
					+ "		\"facing=east,connection=corner_sw\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_corner_clear\", \"y\": 90},	\r\n"
					+ "		\r\n"
					+ "		\"facing=east,connection=side_s\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side\"},\r\n"
					+ "		\"facing=east,connection=side_n\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side\", \"y\": 180},\r\n"
					+ "		\"facing=east,connection=side_w\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_r\", \"y\": 90},\r\n"
					+ "		\"facing=east,connection=side_e\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_r\", \"y\": 270},\r\n"
					+ "		\r\n"
					+ "		\"facing=east,connection=end_n_right\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_right_r\"},\r\n"
					+ "		\"facing=east,connection=end_n_left\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_left_r\", \"y\": 180},\r\n"
					+ "		\"facing=east,connection=end_e_right\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_right_r\", \"y\": 180},\r\n"
					+ "		\"facing=east,connection=end_e_left\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_left_r\"},\r\n"
					+ "		\r\n"
					+ "		\"facing=east,connection=end_s_left\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_left\", \"y\": 270},\r\n"
					+ "		\"facing=east,connection=end_s_right\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_right\", \"y\": 270},\r\n"
					+ "		\"facing=east,connection=end_w_left\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_left\", \"y\": 90},\r\n"
					+ "		\"facing=east,connection=end_w_right\":  { \"model\": \""+modid+":block/bridge/rope/"+material+"_side_right\", \"y\": 90}\r\n"
					+ "    }\r\n"
					+ "}\r\n"
					+ "");
			
		}

		//Maj 3.0.0
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File bridge_base = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_base" + ".json");
			File bridge_corner_clear = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_corner_clear" + ".json");
			File bridge_corner_clear_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_corner_clear_r" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle" + ".json");
			File bridge_middle_end = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle_end" + ".json");
			File bridge_middle_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle_r" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side" + ".json");
			File bridge_side_left = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_left" + ".json");
			File bridge_side_left_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_left_r" + ".json");
			File bridge_side_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_r" + ".json");
			File bridge_side_right = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_right" + ".json");
			File bridge_side_right_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_right" + ".json");

		
			APIWriter.write(location, bridge_base, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}");
		
			APIWriter.write(location, bridge_corner_clear, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/corner_clear\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_corner_clear_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/corner_clear_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_middle, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_middle_end, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/middle_end\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_middle_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/middle_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_left, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_left_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_left_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"1_4\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_right, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, bridge_side_right_r, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rope/parent/side_right_r\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}
	
		//Maj 3.0.0
		public static void createModelBlockCustom(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_base" + ".json");
			File bridge_corner_clear = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_corner_clear" + ".json");
			File bridge_corner_clear_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_corner_clear_r" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle" + ".json");
			File bridge_middle_end = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle_end" + ".json");
			File bridge_middle_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle_r" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side" + ".json");
			File bridge_side_left = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_left" + ".json");
			File bridge_side_left_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_left_r" + ".json");
			File bridge_side_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_r" + ".json");
			File bridge_side_right = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_right" + ".json");
			File bridge_side_right_r = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_right" + ".json");

		
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

		//Maj 3.0.0
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/"  + "rope_" + mat + "_bridge" + ".json");
			APIWriter.write(location, file, "{\"parent\": \"" + modid + ":block/bridge/rope/" + mat + "_middle\"}");
		}

	}
	
	public static class BridgeStone
	{
		//Maj 3.0.0
		public static void createBlockstate(String location, String modid, String blockstateName)
		{
			File file = new File(location + "/blockstates/" + blockstateName + "_bridge" + ".json");
		
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {                     \r\n"
					+ "		\"connection=base\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_base\",\"uvlock\": true},\r\n"
					+ "		\"connection=base_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_base\",\"uvlock\": true},\r\n"
					+ "		\r\n"
					+ "        \"connection=middle_ns\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_middle\", \"y\": 90,\"uvlock\": true},\r\n"
					+ "		\"connection=middle_ew\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_middle\",\"uvlock\": true},\r\n"
					+ "\r\n"
					+ "		\"connection=corner_nw\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_corner\", \"y\": 180,\"uvlock\": true},\r\n"
					+ "		\"connection=corner_ne\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_corner\", \"y\": 270,\"uvlock\": true},\r\n"
					+ "		\"connection=corner_se\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_corner\",\"uvlock\": true},\r\n"
					+ "		\"connection=corner_sw\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_corner\", \"y\": 90,\"uvlock\": true},	\r\n"
					+ "		\r\n"
					+ "		\"connection=side_s\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_side\",\"uvlock\": true},\r\n"
					+ "		\"connection=side_n\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_side\", \"y\": 180,\"uvlock\": true},\r\n"
					+ "		\"connection=side_w\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_side\", \"y\": 90,\"uvlock\": true},\r\n"
					+ "		\"connection=side_e\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_side\", \"y\": 270,\"uvlock\": true},\r\n"
					+ "		\r\n"
					+ "		\"connection=end_s_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_side\", \"y\": 0,\"uvlock\": true},\r\n"
					+ "		\"connection=end_n_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_side\", \"y\": 180,\"uvlock\": true},\r\n"
					+ "		\"connection=end_w_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_side\", \"y\": 90,\"uvlock\": true},\r\n"
					+ "		\"connection=end_e_toggled\":  { \"model\": \""+modid+":block/bridge/bridge_stone/"+blockstateName+"_side\", \"y\": 270,\"uvlock\": true}\r\n"
					+ "    }\r\n"
					+ "}");
		}
		
		//Maj 3.0.0
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String textureWall, String textureFloor)
		{
			File bridge_base = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_base" + ".json");
			File bridge_corner = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_corner" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_middle" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_side" + ".json");
			
			APIWriter.write(location, bridge_base, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureFloor+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
					
			APIWriter.write(location, bridge_corner, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_middle, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, bridge_side, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"5\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}

		//Maj 3.0.0
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_bridge" + ".json");
			
			APIWriter.write(location, file, "{\"parent\":\""+modid+":block/bridge/bridge_stone/"+mat+"_middle\"}");
		}
	}
	
	public static class StairWood
	{
		//Maj 3.0.0
		public static void createBlockstate(String location, String modid, String woodMat)
		{
			File file = new File(location + "/blockstates/" + woodMat + "_log_bridge_stair" + ".json");
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {                                                                        \r\n"
					+ "        \"facing=north,connection=base\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=right\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=left\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=double\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 270},\r\n"
					+ "\r\n"
					+ "        \"facing=west,connection=base\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=right\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=left\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=double\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 180},\r\n"
					+ "\r\n"
					+ "        \"facing=south,connection=base\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=right\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=left\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=double\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 90},\r\n"
					+ "\r\n"
					+ "        \"facing=east,connection=base\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\"},\r\n"
					+ "		\"facing=east,connection=right\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\"},\r\n"
					+ "		\"facing=east,connection=left\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\"},	\r\n"
					+ "		\"facing=east,connection=double\":  { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\"}\r\n"
					+ "\r\n"
					+ "    }\r\n"
					+ "}");
		}
	
		//Maj 3.0.0
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File bridge_base = new File(location + "/models/block/stair/wood/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/wood/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/wood/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/wood/" + nameMaterial + "_right" + ".json");

			APIWriter.write(location, bridge_base, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/wood/parent/base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, bridge_double, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/wood/parent/double\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, bridge_left, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/wood/parent/left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_right, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/wood/parent/right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}
	
		//Maj 3.0.0
		public static void createModelBlockCustom(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/stair/wood/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/wood/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/wood/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/wood/" + nameMaterial + "_right" + ".json");

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

		//Maj 3.0.0
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_log_bridge_stair" + ".json");
			APIWriter.write(location, file, "{\"parent\":\""+modid+":block/stair/wood/"+mat+"_double\"}");	
		}
	}

	public static class StairRope
	{
		//Maj 3.0.0
		public static void createBlockstate(String location, String modid, String woodMat)
		{
			File file = new File(location + "/blockstates/" + woodMat + "_rope_bridge_stair" + ".json");
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {                                                                        \r\n"
					+ "        \"facing=north,connection=base\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=right\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=left\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=double\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 270},\r\n"
					+ "\r\n"
					+ "        \"facing=west,connection=base\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=right\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=left\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=double\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 180},\r\n"
					+ "\r\n"
					+ "        \"facing=south,connection=base\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=right\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=left\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=double\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 90},\r\n"
					+ "\r\n"
					+ "        \"facing=east,connection=base\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\"},\r\n"
					+ "		\"facing=east,connection=right\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\"},\r\n"
					+ "		\"facing=east,connection=left\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\"},	\r\n"
					+ "		\"facing=east,connection=double\":  { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\"}\r\n"
					+ "\r\n"
					+ "    }\r\n"
					+ "}");
		}
	
		//Maj 3.0.0
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File bridge_base = new File(location + "/models/block/stair/rope/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/rope/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/rope/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/rope/" + nameMaterial + "_right" + ".json");

			APIWriter.write(location, bridge_base, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/rope/parent/base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "	    \"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_double, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/rope/parent/double\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert_stair\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, bridge_left, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/rope/parent/left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert_stair\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_right, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/rope/parent/right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"mcwbridges:block/lead_knot_vert_stair\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
					+ "		\"3\": \"mcwbridges:block/lead_knot\",\r\n"
					+ "		\"4\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}
	
		//Maj 3.0.0
		public static void createModelBlockCustom(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/stair/rope/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/rope/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/rope/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/rope/" + nameMaterial + "_right" + ".json");

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

		//Maj 3.0.0
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_rope_bridge_stair" + ".json");
			APIWriter.write(location, file, "{\"parent\": \""+modid+":block/stair/rope/"+mat+"_double\"}");
		}
	}

	public static class StairStone
	{
		//Maj 3.0.0
		public static void createBlockstate(String location, String modid, String Stonemat)
		{
			File file = new File(location + "/blockstates/" + Stonemat + "_bridge_stair" + ".json");
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {                                                                        \r\n"
					+ "        \"facing=north,connection=base\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_double\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=right\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_right\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=left\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_left\", \"y\": 270},\r\n"
					+ "		\"facing=north,connection=double\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_base\", \"y\": 270},\r\n"
					+ "\r\n"
					+ "        \"facing=west,connection=base\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_double\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=right\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_right\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=left\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_left\", \"y\": 180},\r\n"
					+ "		\"facing=west,connection=double\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_base\", \"y\": 180},\r\n"
					+ "\r\n"
					+ "        \"facing=south,connection=base\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_double\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=right\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_right\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=left\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_left\", \"y\": 90},\r\n"
					+ "		\"facing=south,connection=double\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_base\", \"y\": 90},\r\n"
					+ "\r\n"
					+ "        \"facing=east,connection=base\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_double\"},\r\n"
					+ "		\"facing=east,connection=right\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_right\"},\r\n"
					+ "		\"facing=east,connection=left\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_left\"},	\r\n"
					+ "		\"facing=east,connection=double\":  { \"model\": \""+modid+":block/stair/stone/"+Stonemat+"_base\"}\r\n"
					+ "\r\n"
					+ "    }\r\n"
					+ "}");
		}
	
		//Maj 3.0.0
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String textureWall, String textureFloor)
		{
			File bridge_base = new File(location + "/models/block/stair/stone/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/stone/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/stone/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/stone/" + nameMaterial + "_right" + ".json");

			APIWriter.write(location, bridge_base, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/stone/parent/base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_double, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/stone/parent/double\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_left, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/stone/parent/left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, bridge_right, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/stair/stone/parent/right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}
	
		//Maj 3.0.0
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_bridge_stair" + ".json");
			APIWriter.write(location, file, "{\"parent\": \""+modid+":block/stair/stone/"+mat+"_double\"}");
		}
	}
	
	public static class PierWood
	{
			// work probably it's just a different tree
			public static void createBlockstate(String location, String modid, String woodMat)
			{
				File file = new File(location + "/blockstates/" + woodMat + "_bridge_pier" + ".json");
				APIWriter.write(location, file, "{\r\n"
						+ "  \"variants\": {\r\n"
						+ "    \"\": {\r\n"
						+ "      \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"\r\n"
						+ "    }\r\n"
						+ "  }\r\n"
						+ "}");
			}
		
			//Maj 3.0.0
			public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
			{
				File bridge_pillar_single = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_single" + ".json");

				APIWriter.write(location, bridge_pillar_single, "{\r\n"
						+ "	\"parent\": \"mcwbridges:block/support_pier/parent/pillar_single\",\r\n"
						+ "	\"textures\": {\r\n"
						+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
						+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
						+ "	}\r\n"
						+ "}\r\n"
						+ "");
			}
			
			//Maj 3.0.0
			public static void createModelBlockCustom(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
			{
				File bridge_pillar_single = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_single" + ".json");

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

			// work probably it's just a different tree
			public static void createModelItem(String location, String modid, String mat)
			{
				File file = new File(location + "/models/item/" + mat + "_bridge_pier" + ".json");
				APIWriter.write(location, file, "{\"parent\": \""+modid+":block/support_pier/wooden/"+mat+"_pillar_single\"}");
			}
	}
	
	public static class PierStone
	{
		// work probably it's just a different tree
		public static void createBlockstate(String location, String modid, String blockstateName)
		{
			File file = new File(location + "/blockstates/" + blockstateName + "_bridge_pier" + ".json");
			APIWriter.write(location, file, "{\r\n"
					+ "  \"variants\": {\r\n"
					+ "    \"\": {\r\n"
					+ "      \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"\r\n"
					+ "    }\r\n"
					+ "  }\r\n"
					+ "}");
		}

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String textureWall)
		{
			File bridge_pillar_single = new File(location + "/models/block/support_pier/stone/" + nameMaterial + "_pillar_single" + ".json");

			APIWriter.write(location, bridge_pillar_single, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/support_pier/parent/pillar_single_stone\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}

		// work probably it's just a different tree
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_bridge_pier" + ".json");
			APIWriter.write(location, file, "{\"parent\":\""+modid+":block/support_pier/stone/"+mat+"_pillar_single\"}");
		}
	}
	
	public static class BridgeRailWood
	{
		public static void createBlockstate(String location, String modid, String blockstateName)
		{
			File file = new File(location + "/blockstates/" + blockstateName + "_rail_bridge" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {                                                                        \r\n"
					+ "        \"facing=north,powered=false\":  { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"\", \"y\": 90},\r\n"
					+ "		\"facing=east,powered=false\":  { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"\"},\r\n"
					+ "		\"facing=south,powered=false\":  { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"\", \"y\": 90},\r\n"
					+ "		\"facing=west,powered=false\":  { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"\"},\r\n"
					+ "\r\n"
					+ "		\"facing=north,powered=true\":  { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_powered\", \"y\": 90},\r\n"
					+ "		\"facing=east,powered=true\":  { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_powered\"},\r\n"
					+ "		\"facing=south,powered=true\":  { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_powered\", \"y\": 90},\r\n"
					+ "		\"facing=west,powered=true\":  { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_powered\"}			\r\n"
					+ "    }\r\n"
					+ "}");
		}
	
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File rail = new File(location + "/models/block/bridge/rail/" + nameMaterial + ".json");
			File railPower = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_powered" + ".json");
			
			APIWriter.write(location, rail, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rail/parent/rail\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, railPower, "{\r\n"
					+ "	\"parent\": \"mcwbridges:block/bridge/rail/parent/rail_powered\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
					+ "		\"2\": \"minecraft:block/redstone_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
					+ "	}\r\n"
					+ "}");
		}
		
		public static void createModelBlockCustom(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesStripped, String nameOfTexturesLogs)
		{
			File rail = new File(location + "/models/block/bridge/rail/" + nameMaterial + ".json");
			File railPower = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_powered" + ".json");
			
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

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_rail_bridge" + ".json");
			APIWriter.write(location, file, "{\"parent\": \""+modid+":block/bridge/rail/"+mat+"\"}");
		}
	}
}