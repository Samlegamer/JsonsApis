package fr.samlegamer.api.clientgen.bridges;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.samlegamer.utils.APIWriter;

@Deprecated
public class CustomMB
{
	@Deprecated
	public static void InitFolders(String location)
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

	@Deprecated
	public static class BridgeLog
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_base" + ".json");
			File bridge_base_torch = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_base_torch" + ".json");
			File bridge_corner = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_corner" + ".json");
			File bridge_inventory = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_inventory" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_middle" + ".json");
			File bridge_middle_end = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_middle_end" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_side" + ".json");
			File bridge_side_left = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_side_left" + ".json");
			File bridge_side_right = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_side_right" + ".json");

		APIWriter.write(location, bridge_base, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/base\",\r\n"
		+ "\"textures\":{\"1\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
		+ "\"2\": \"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\",\r\n"
		+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\"}}");
		
		APIWriter.write(location, bridge_base_torch, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/base_torch\",\r\n"
		+ "\"textures\": {\"1\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
		+ "\"3\": \"minecraft:block/torch\",\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\"}}");
				
		APIWriter.write(location, bridge_corner, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/corner\",\r\n"
						+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
						+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\"}}");
					
		APIWriter.write(location, bridge_inventory, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/inventory\",\r\n"
							+ "\"textures\": {\"0\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
							+ "\"2\": \"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\"}}");
				
		APIWriter.write(location, bridge_middle, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/middle\",\r\n"
							+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\"}}");
					
		APIWriter.write(location, bridge_middle_end, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/middle_end\",\r\n"
							+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"1\": \"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\"}}");
					
		APIWriter.write(location, bridge_side, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/side\",\r\n"
							+ "\"textures\": {\"0\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\"}}");
					
		APIWriter.write(location, bridge_side_left, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/side_left\",\r\n"
							+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\"}}");
					
		APIWriter.write(location, bridge_side_right, "{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/side_right\",\r\n"
							+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\"}}");
		}
	}
	
	@Deprecated
	public static class RopeBridge
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_base" + ".json");
			File bridge_base_torch = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_base_torch" + ".json");
			File bridge_corner = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_corner" + ".json");
			File bridge_corner_clear = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_corner_clear" + ".json");
			File bridge_inventory = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_inventory" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle" + ".json");
			File bridge_middle_end = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle_end" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side" + ".json");
			File bridge_side_left = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_left" + ".json");
			File bridge_side_right = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_right" + ".json");

		
			APIWriter.write(location, bridge_base, "{\"parent\":\"mcwbridges:block/bridge/rope/parent/base\",\r\n"
						+ "\"textures\":{\"2\":\"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\",\r\n"
						+ "\"particle\":\"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\"}}");
		
			APIWriter.write(location, bridge_base_torch, "{\"parent\":\"mcwbridges:block/bridge/rope/parent/base_torch\",\r\n"
						+ "\"textures\":{\"1\": \"minecraft:block/torch\",\r\n"
						+ "\"3\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
						+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\"}}");
				
			APIWriter.write(location, bridge_corner, "{\"parent\":\"mcwbridges:block/bridge/rope/parent/corner\",\r\n"
						+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
						+ "\"4\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
						+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
						+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");			
					
			APIWriter.write(location, bridge_corner_clear, "{\"parent\": \"mcwbridges:block/bridge/rope/parent/corner_clear\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
							+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");			
					
			APIWriter.write(location, bridge_inventory, "{\"parent\": \"mcwbridges:block/bridge/rope/parent/inventory\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"2\": \"" + TextureLocationFormodid + "/" + nameOfTexturesPlanks + "\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
							+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");		
					
			APIWriter.write(location, bridge_middle, "{\"parent\":\"mcwbridges:block/bridge/rope/parent/middle\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs+"\",\r\n"
							+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");		
					
			APIWriter.write(location, bridge_middle_end, "{\"parent\": \"mcwbridges:block/bridge/rope/parent/middle_end\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\"}}");
			
			APIWriter.write(location, bridge_side, "{\"parent\": \"mcwbridges:block/bridge/rope/parent/side\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");			
					
			APIWriter.write(location, bridge_side_left, "{\"parent\": \"mcwbridges:block/bridge/rope/parent/side_left\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\"}}");

			APIWriter.write(location, bridge_side_right, "{\"parent\": \"mcwbridges:block/bridge/rope/parent/side_right\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameOfTexturesLogs + "\"}}");
		}
	}
	
	@Deprecated
	public static class BridgeStone
	{
		public static void createModelBlock(String location, String TFMWall, String TFMFloor, String nameMaterial, String textureWall, String textureFloor)
		{
			File bridge_base = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_base" + ".json");
			File bridge_base_torch = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_base_torch" + ".json");
			File bridge_corner = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_corner" + ".json");
			File bridge_inventory = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_inventory" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_middle" + ".json");
			File bridge_middle_end = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_middle_end" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_side" + ".json");
			File bridge_side_left = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_side_left" + ".json");
			File bridge_side_right = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_side_right" + ".json");

			if(!bridge_base.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/base\",\r\n"
							+ "\"textures\":{\"1\": \""+TFMWall+"/"+textureWall+"\",\r\n"
							+ "\"2\": \""+TFMFloor+"/"+textureFloor+"\",\r\n"
							+ "\"particle\": \""+TFMFloor+"/"+textureFloor+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base.createNewFile();
					System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		
			if(!bridge_base_torch.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base_torch);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/base_torch\",\r\n"
							+ "\"textures\":{\"1\": \""+TFMWall+"/"+textureWall+"\",\r\n"
							+ "\"3\": \"minecraft:block/torch\",\r\n"
							+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base_torch.createNewFile();
					System.out.println("Le fichier " + bridge_base_torch + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
	
			if(!bridge_corner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_corner);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/corner\",\r\n"
							+ "\"textures\":{\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_corner.createNewFile();
					System.out.println("Le fichier " + bridge_corner + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_inventory.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_inventory);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/inventory\",\r\n"
								+ "\"textures\":{\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMFloor+"/"+textureFloor+"\",\r\n"
								+ "\"2_2\": \""+TFMFloor+"/"+textureFloor+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_inventory.createNewFile();
						System.out.println("Le fichier " + bridge_inventory + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_middle.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_middle);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/middle\",\r\n"
								+ "\"textures\":{\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_middle.createNewFile();
						System.out.println("Le fichier " + bridge_middle + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_middle_end.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_middle_end);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/middle_end\",\r\n"
								+ "\"textures\":{\"1\": \""+TFMFloor+"/"+textureFloor+"\",\r\n"
								+ "\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_middle_end.createNewFile();
						System.out.println("Le fichier " + bridge_middle_end + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_side.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_side);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/side\",\r\n"
								+ "\"textures\":{\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_side.createNewFile();
						System.out.println("Le fichier " + bridge_side + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_side_left.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_side_left);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/side_left\",\r\n"
								+ "\"textures\":{\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_side_left.createNewFile();
						System.out.println("Le fichier " + bridge_side_left + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
	
				if(!bridge_side_right.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_side_right);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/side_right\",\r\n"
								+ "\"textures\":{\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_side_right.createNewFile();
						System.out.println("Le fichier " + bridge_side_right + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
	}
	}
	
	@Deprecated
	public static class StairWood
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/stair/wood/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/wood/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/wood/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/wood/" + nameMaterial + "_right" + ".json");
			File bridge_torch = new File(location + "/models/block/stair/wood/" + nameMaterial + "_torch" + ".json");

			if(!bridge_base.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/base\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
							+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base.createNewFile();
					System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_double.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_double);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/double\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
							+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_double.createNewFile();
					System.out.println("Le fichier " + bridge_double + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/left\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
							+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_left.createNewFile();
					System.out.println("Le fichier " + bridge_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_right.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_right);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/right\",\r\n"
								+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
								+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_right.createNewFile();
						System.out.println("Le fichier " + bridge_right + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_torch.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_torch);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/torch\",\r\n"
								+ "\"textures\":{\"3\": \"minecraft:block/torch\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
								+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_torch.createNewFile();
						System.out.println("Le fichier " + bridge_torch + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}

	@Deprecated
	public static class StairRope
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/stair/rope/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/rope/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/rope/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/rope/" + nameMaterial + "_right" + ".json");
			File bridge_torch = new File(location + "/models/block/stair/rope/" + nameMaterial + "_torch" + ".json");

			if(!bridge_base.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/base\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ " \"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base.createNewFile();
					System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_double.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_double);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/double\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_double.createNewFile();
					System.out.println("Le fichier " + bridge_double + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/left\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_left.createNewFile();
					System.out.println("Le fichier " + bridge_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_right.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_right);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/right\",\r\n"
								+ "\"textures\": {\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
								+ "\"2\": \""+TextureLocationFormodid+"/" + nameOfTexturesPlanks + "\",\r\n"
								+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
								+ "\"4\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
						
						buffer.close();
						writer.close();
						bridge_right.createNewFile();
						System.out.println("Le fichier " + bridge_right + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_torch.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_torch);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/torch\",\r\n"
								+ "\"textures\":{\"4\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
								+ "\"1_3\": \"minecraft:block/torch\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
						
						buffer.close();
						writer.close();
						bridge_torch.createNewFile();
						System.out.println("Le fichier " + bridge_torch + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}

	@Deprecated
	public static class StairStone
	{
		public static void createModelBlock(String location, String TFMWall, String TFMFloor, String nameMaterial, String textureWall, String textureFloor)
		{
			File bridge_base = new File(location + "/models/block/stair/stone/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/stone/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/stone/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/stone/" + nameMaterial + "_right" + ".json");
			File bridge_torch = new File(location + "/models/block/stair/stone/" + nameMaterial + "_torch" + ".json");

			if(!bridge_base.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/base\",\r\n"
							+ "\"textures\":{\"1\": \""+TFMFloor+"/"+textureFloor+"\",\r\n"
							+ "\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base.createNewFile();
					System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_double.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_double);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/double\",\r\n"
							+ "\"textures\":{\"1\": \""+TFMFloor+"/"+textureFloor+"\",\r\n"
							+ "\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_double.createNewFile();
					System.out.println("Le fichier " + bridge_double + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/left\",\r\n"
							+ "\"textures\":{\"1\": \""+TFMFloor+"/"+textureFloor+"\",\r\n"
							+ "\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_left.createNewFile();
					System.out.println("Le fichier " + bridge_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_right.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_right);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/right\",\r\n"
								+ "\"textures\":{\"1\": \""+TFMFloor+"/"+textureFloor+"\",\r\n"
								+ "\"2\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_right.createNewFile();
						System.out.println("Le fichier " + bridge_right + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_torch.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_torch);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/torch\",\r\n"
								+ "\"textures\":{\"3\": \"minecraft:block/torch\",\r\n"
								+ "\"1_1\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_torch.createNewFile();
						System.out.println("Le fichier " + bridge_torch + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	@Deprecated
	public static class PierWood
	{		
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_pillar_corner = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_corner" + ".json");
			File bridge_pillar_middle = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_middle" + ".json");
			File bridge_pillar_side = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_side" + ".json");
			File bridge_pillar_single = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_single" + ".json");

			if(!bridge_pillar_corner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_corner);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/wooden/parent/pillar_corner\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"1\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "_top\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_corner.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_corner + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_pillar_middle.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_middle);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/wooden/parent/pillar_middle\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"1\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "_top\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_middle.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_middle + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_pillar_side.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_side);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/wooden/parent/pillar_side\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"1\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "_top\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_side.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_side + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_pillar_single.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_pillar_single);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/support_pier/wooden/parent/pillar_single\",\r\n"
								+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
								+ "\"1\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "_top\",\r\n"
								+ "\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
						
						buffer.close();
						writer.close();
						bridge_pillar_single.createNewFile();
						System.out.println("Le fichier " + bridge_pillar_single + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	@Deprecated
	public static class PierStone
	{
		public static void createModelBlock(String location, String TFMWall, String TFMFloor, String nameMaterial, String textureWall)
		{
			File bridge_pillar_middle = new File(location + "/models/block/support_pier/stone/" + nameMaterial + "_pillar_middle" + ".json");
			File bridge_pillar_side = new File(location + "/models/block/support_pier/stone/" + nameMaterial + "_pillar_side" + ".json");
			File bridge_pillar_single = new File(location + "/models/block/support_pier/stone/" + nameMaterial + "_pillar_single" + ".json");
		
			if(!bridge_pillar_middle.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_middle);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/stone/parent/pillar_middle\",\r\n"
							+ "\"textures\":{\"0\": \""+TFMWall+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_middle.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_middle + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
	
			if(!bridge_pillar_side.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_side);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/stone/parent/pillar_side\",\r\n"
							+ "\"textures\":{\"0\": \""+TFMWall+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_side.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_side + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_pillar_single.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_pillar_single);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/support_pier/stone/parent/pillar_single\",\r\n"
								+ "\"textures\":{\"0\": \""+TFMWall+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TFMWall+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_pillar_single.createNewFile();
						System.out.println("Le fichier " + bridge_pillar_single + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	@Deprecated
	public static class BridgeRailWood
	{	
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File bridge_base = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_base" + ".json");
			File bridge_base_torch = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_core" + ".json");
			File bridge_corner = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_corner" + ".json");
			File bridge_inventory = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_inventory" + ".json");
			File bridge_middle = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_middle" + ".json");
			File bridge_side = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_side" + ".json");
			File bridge_side_left = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_side_left" + ".json");
			File bridge_side_right = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_side_right" + ".json");

			if(!bridge_base.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/rail/parent/base\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base.createNewFile();
					System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		
			if(!bridge_base_torch.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base_torch);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/core\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base_torch.createNewFile();
					System.out.println("Le fichier " + bridge_base_torch + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_corner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_corner);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/corner\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "\"3\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"_top\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_corner.createNewFile();
					System.out.println("Le fichier " + bridge_corner + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_inventory.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_inventory);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/inventory\",\r\n"
								+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"\",\r\n"
								+ "\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
								+ "\"3\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"_top\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_inventory.createNewFile();
						System.out.println("Le fichier " + bridge_inventory + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_middle.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_middle);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/middle\",\r\n"
								+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"\",\r\n"
								+ "\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
								+ "\"3\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"_top\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_middle.createNewFile();
						System.out.println("Le fichier " + bridge_middle + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_side.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_side);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/bridge/rail/parent/side\",\r\n"
								+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"\",\r\n"
								+ "\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
								+ "\"3\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"_top\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_side.createNewFile();
						System.out.println("Le fichier " + bridge_side + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_side_left.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_side_left);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/side_left\",\r\n"
								+ "\"textures\":{\"0\":\""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"\",\r\n"
								+ "\"2\":\""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
								+ "\"3\":\""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"_top\",\r\n"
								+ "\"particle\":\""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_side_left.createNewFile();
						System.out.println("Le fichier " + bridge_side_left + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
	
				if(!bridge_side_right.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_side_right);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/side_right\",\r\n"
								+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"\",\r\n"
								+ "\"2\":\""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
								+ "\"3\":\""+TextureLocationFormodid+"/"+ nameOfTexturesLogs+"_top\",\r\n"
								+ "\"particle\":\""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_side_right.createNewFile();
						System.out.println("Le fichier " + bridge_side_right + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}
}