package fr.samlegamer.api.clientgen.furnitures;

import java.io.File;

import fr.samlegamer.utils.APIWriter;

public class CustomMFurni
{
	public static void InitFolders(String location)
	{
		File folderBlockstates = new File(location + "blockstates/");
		File folderModels = new File(location + "models/");
		File folderBlock = new File(location + "models/block/");
		File folderItem = new File(location + "models/item/");
		File chair = new File(location + "models/block/chair/");
		File counter = new File(location + "models/block/counter/");
		File desk = new File(location + "models/block/desk/");
		File drawer = new File(location + "models/block/drawer/");
		File gui = new File(location + "models/block/gui/");
		File table = new File(location + "models/block/table/");
		File wardrobe = new File(location + "models/block/wardrobe/");

		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists()
		|| !folderItem.exists() || !chair.exists() 
		|| !counter.exists() || !desk.exists() || !drawer.exists()
		|| !gui.exists() || !table.exists() || !wardrobe.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderItem.mkdir();
			chair.mkdir();
			counter.mkdir();
			desk.mkdir();
			drawer.mkdir();
			gui.mkdir();
			table.mkdir();
			wardrobe.mkdir();
		}
	}
	
	public static class ModelsGen
	{
		public static void chair(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/chair/" + nameMaterial + "_chair" + ".json");
			File p3 = new File(location + "/models/block/chair/" + nameMaterial + "_modern_chair" + ".json");
			File p5 = new File(location + "/models/block/chair/" + nameMaterial + "_stool_chair" + ".json");
			File p6 = new File(location + "/models/block/chair/" + nameMaterial + "_striped_chair" + ".json");
			File p8 = new File(location + "/models/block/chair/stripped_" + nameMaterial + "_chair" + ".json");
			File p10 = new File(location + "/models/block/chair/stripped_" + nameMaterial + "_modern_chair" + ".json");
			File p12 = new File(location + "/models/block/chair/stripped_" + nameMaterial + "_stool_chair" + ".json");
			File p13 = new File(location + "/models/block/chair/stripped_" + nameMaterial + "_striped_chair" + ".json");

			APIWriter.write(location, p1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
						
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/stool_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1_0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/striped_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
					
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
						
			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
						
			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/stool_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1_0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/striped_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
		}
	
		public static void wardrobe(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_base" + ".json");
			File p2 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_bottom" + ".json");
			File p3 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_cupboard_base_left" + ".json");
			File p4 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_cupboard_base_right" + ".json");
			File p5 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_cupboard_bottom_left" + ".json");
			File p6 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_cupboard_bottom_right" + ".json");
			File p7 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_cupboard_middle" + ".json");
			File p8 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_cupboard_top_left" + ".json");
			File p9 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_cupboard_top_right" + ".json");
			File p10 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_bookshelf_middle" + ".json");
			File p11 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_double_wardrobe_base" + ".json");
			File p12 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_double_wardrobe_bottom" + ".json");
			File p13 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_double_wardrobe_middle" + ".json");
			File p14 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_double_wardrobe_top" + ".json");
			File p15 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_modern_wardrobe_base_left" + ".json");
			File p16 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_modern_wardrobe_base_right" + ".json");
			File p17 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_modern_wardrobe_bottom_left" + ".json");
			File p18 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_modern_wardrobe_bottom_right" + ".json");
			File p19 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_modern_wardrobe_middle" + ".json");
			File p20 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_modern_wardrobe_top" + ".json");
			File p21 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_wardrobe_base_left" + ".json");
			File p22 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_wardrobe_base_right" + ".json");
			File p23 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_wardrobe_bottom_left" + ".json");
			File p24 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_wardrobe_bottom_right" + ".json");
			File p25 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_wardrobe_middle" + ".json");
			File p26 = new File(location + "/models/block/wardrobe/" + nameMaterial + "_wardrobe_top" + ".json");

			File x1 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_base" + ".json");
			File x2 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_bottom" + ".json");
			File x3 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_cupboard_base_left" + ".json");
			File x4 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_cupboard_base_right" + ".json");
			File x5 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_cupboard_bottom_left" + ".json");
			File x6 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_cupboard_bottom_right" + ".json");
			File x7 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_cupboard_middle" + ".json");
			File x8 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_cupboard_top_left" + ".json");
			File x9 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_cupboard_top_right" + ".json");
			File x10 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_bookshelf_middle" + ".json");
			File x11 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_double_wardrobe_base" + ".json");
			File x12 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_double_wardrobe_bottom" + ".json");
			File x13 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_double_wardrobe_middle" + ".json");
			File x14 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_double_wardrobe_top" + ".json");
			File x15 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_modern_wardrobe_base_left" + ".json");
			File x16 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_modern_wardrobe_base_right" + ".json");
			File x17 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_modern_wardrobe_bottom_left" + ".json");
			File x18 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_modern_wardrobe_bottom_right" + ".json");
			File x19 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_modern_wardrobe_middle" + ".json");
			File x20 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_modern_wardrobe_top" + ".json");
			File x21 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_wardrobe_base_left" + ".json");
			File x22 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_wardrobe_base_right" + ".json");
			File x23 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_wardrobe_bottom_left" + ".json");
			File x24 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_wardrobe_bottom_right" + ".json");
			File x25 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_wardrobe_middle" + ".json");
			File x26 = new File(location + "/models/block/wardrobe/stripped_" + nameMaterial + "_wardrobe_top" + ".json");

			APIWriter.write(location, p1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_bottom_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_top_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_top_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
		
			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_bottom_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p21, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p22, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p23, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p24, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p25, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p26, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			// X = Striped
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_bottom_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_top_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_top_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_bottom_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x21, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x22, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x23, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x24, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x25, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x26, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
		}

		public static void table(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/table/" + nameMaterial + "_coffee_table" + ".json");
			File p2 = new File(location + "/models/block/table/" + nameMaterial + "_coffee_table_middle" + ".json");
			File p3 = new File(location + "/models/block/table/" + nameMaterial + "_end_table_center" + ".json");
			File p4 = new File(location + "/models/block/table/" + nameMaterial + "_end_table_corner" + ".json");
			File p5 = new File(location + "/models/block/table/" + nameMaterial + "_end_table_middle" + ".json");
			File p6 = new File(location + "/models/block/table/" + nameMaterial + "_end_table_middle_three" + ".json");
			File p7 = new File(location + "/models/block/table/" + nameMaterial + "_end_table_side" + ".json");
			File p8 = new File(location + "/models/block/table/" + nameMaterial + "_end_table_single" + ".json");
			File p9 = new File(location + "/models/block/table/" + nameMaterial + "_glass_table_center" + ".json");
			File p10 = new File(location + "/models/block/table/" + nameMaterial + "_glass_table_corner" + ".json");
			File p11 = new File(location + "/models/block/table/" + nameMaterial + "_glass_table_middle" + ".json");
			File p12 = new File(location + "/models/block/table/" + nameMaterial + "_glass_table_middle_three" + ".json");
			File p13 = new File(location + "/models/block/table/" + nameMaterial + "_glass_table_side" + ".json");
			File p14 = new File(location + "/models/block/table/" + nameMaterial + "_glass_table_single" + ".json");
			File p15 = new File(location + "/models/block/table/" + nameMaterial + "_table_center" + ".json");
			File p16 = new File(location + "/models/block/table/" + nameMaterial + "_table_corner" + ".json");
			File p17 = new File(location + "/models/block/table/" + nameMaterial + "_table_middle" + ".json");
			File p18 = new File(location + "/models/block/table/" + nameMaterial + "_table_middle_three" + ".json");
			File p19 = new File(location + "/models/block/table/" + nameMaterial + "_table_side" + ".json");
			File p20 = new File(location + "/models/block/table/" + nameMaterial + "_table_single" + ".json");

			File x1 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_coffee_table" + ".json");
			File x2 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_coffee_table_middle" + ".json");
			File x3 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_end_table_center" + ".json");
			File x4 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_end_table_corner" + ".json");
			File x5 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_end_table_middle" + ".json");
			File x6 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_end_table_middle_three" + ".json");
			File x7 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_end_table_side" + ".json");
			File x8 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_end_table_single" + ".json");
			File x9 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_glass_table_center" + ".json");
			File x10 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_glass_table_corner" + ".json");
			File x11 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_glass_table_middle" + ".json");
			File x12 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_glass_table_middle_three" + ".json");
			File x13 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_glass_table_side" + ".json");
			File x14 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_glass_table_single" + ".json");
			File x15 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_table_center" + ".json");
			File x16 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_table_corner" + ".json");
			File x17 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_table_middle" + ".json");
			File x18 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_table_middle_three" + ".json");
			File x19 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_table_side" + ".json");
			File x20 = new File(location + "/models/block/table/stripped_" + nameMaterial + "_table_single" + ".json");
			
			APIWriter.write(location, p1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/coffee_table\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/coffee_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/coffee_table\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/coffee_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}

		public static void counter(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/counter/" + nameMaterial + "_counter" + ".json");
			File p2 = new File(location + "/models/block/counter/" + nameMaterial + "_counter_corner" + ".json");
			File p3 = new File(location + "/models/block/counter/" + nameMaterial + "_counter_inner_corner" + ".json");
			File p4 = new File(location + "/models/block/counter/" + nameMaterial + "_cupboard_counter" + ".json");
			File p5 = new File(location + "/models/block/counter/" + nameMaterial + "_cupboard_counter_corner" + ".json");
			File p6 = new File(location + "/models/block/counter/" + nameMaterial + "_double_counter" + ".json");
			File p7 = new File(location + "/models/block/counter/" + nameMaterial + "_double_counter_corner" + ".json");
			File p8 = new File(location + "/models/block/counter/" + nameMaterial + "_drawer_counter" + ".json");
			File p9 = new File(location + "/models/block/counter/" + nameMaterial + "_drawer_counter_corner" + ".json");

			File x1 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_counter" + ".json");
			File x2 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_counter_corner" + ".json");
			File x3 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_counter_inner_corner" + ".json");
			File x4 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_cupboard_counter" + ".json");
			File x5 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_cupboard_counter_corner" + ".json");
			File x6 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_double_counter" + ".json");
			File x7 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_double_counter_corner" + ".json");
			File x8 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_drawer_counter" + ".json");
			File x9 = new File(location + "/models/block/counter/stripped_" + nameMaterial + "_drawer_counter_corner" + ".json");

			APIWriter.write(location, p1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter_inner_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/cupboard_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2_1\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/cupboard_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2_1\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
		
			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter_inner_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/cupboard_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2_1\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/cupboard_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2_1\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
		}

		public static void desk(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/desk/" + nameMaterial + "_covered_desk_left" + ".json");
			File p2 = new File(location + "/models/block/desk/" + nameMaterial + "_covered_desk_middle" + ".json");
			File p3 = new File(location + "/models/block/desk/" + nameMaterial + "_covered_desk_right" + ".json");
			File p4 = new File(location + "/models/block/desk/" + nameMaterial + "_covered_desk_single" + ".json");
			File p5 = new File(location + "/models/block/desk/" + nameMaterial + "_desk" + ".json");
			File p6 = new File(location + "/models/block/desk/" + nameMaterial + "_desk_left" + ".json");
			File p7 = new File(location + "/models/block/desk/" + nameMaterial + "_desk_middle" + ".json");
			File p8 = new File(location + "/models/block/desk/" + nameMaterial + "_desk_right" + ".json");
			File p9 = new File(location + "/models/block/desk/" + nameMaterial + "_desk_single" + ".json");
			File p10 = new File(location + "/models/block/desk/" + nameMaterial + "_modern_desk_left" + ".json");
			File p11 = new File(location + "/models/block/desk/" + nameMaterial + "_modern_desk_middle" + ".json");
			File p12 = new File(location + "/models/block/desk/" + nameMaterial + "_modern_desk_right" + ".json");
			File p13 = new File(location + "/models/block/desk/" + nameMaterial + "_modern_desk_single" + ".json");

			File x1 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_covered_desk_left" + ".json");
			File x2 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_covered_desk_middle" + ".json");
			File x3 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_covered_desk_right" + ".json");
			File x4 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_covered_desk_single" + ".json");
			File x5 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_desk" + ".json");
			File x6 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_desk_left" + ".json");
			File x7 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_desk_middle" + ".json");
			File x8 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_desk_right" + ".json");
			File x9 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_desk_single" + ".json");
			File x10 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_modern_desk_left" + ".json");
			File x11 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_modern_desk_middle" + ".json");
			File x12 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_modern_desk_right" + ".json");
			File x13 = new File(location + "/models/block/desk/stripped_" + nameMaterial + "_modern_desk_single" + ".json");

			APIWriter.write(location, p1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
		
			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \"minecraft:block/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
		}

		public static void drawer(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/drawer/" + nameMaterial + "_book_shelf_left" + ".json");
			File p2 = new File(location + "/models/block/drawer/" + nameMaterial + "_book_shelf_middle" + ".json");
			File p3 = new File(location + "/models/block/drawer/" + nameMaterial + "_book_shelf_right" + ".json");
			File p4 = new File(location + "/models/block/drawer/" + nameMaterial + "_book_shelf_single" + ".json");
			File p5 = new File(location + "/models/block/drawer/" + nameMaterial + "_double_shelf_left" + ".json");
			File p6 = new File(location + "/models/block/drawer/" + nameMaterial + "_double_shelf_middle" + ".json");
			File p7 = new File(location + "/models/block/drawer/" + nameMaterial + "_double_shelf_right" + ".json");
			File p8 = new File(location + "/models/block/drawer/" + nameMaterial + "_double_shelf_single" + ".json");
			File p9 = new File(location + "/models/block/drawer/" + nameMaterial + "_drawer_base" + ".json");
			File p10 = new File(location + "/models/block/drawer/" + nameMaterial + "_large_shelf_left" + ".json");
			File p11 = new File(location + "/models/block/drawer/" + nameMaterial + "_large_shelf_middle" + ".json");
			File p12 = new File(location + "/models/block/drawer/" + nameMaterial + "_large_shelf_right" + ".json");
			File p13 = new File(location + "/models/block/drawer/" + nameMaterial + "_large_shelf_single" + ".json");
			File p14 = new File(location + "/models/block/drawer/" + nameMaterial + "_lower_book_shelf_single" + ".json");
			File p15 = new File(location + "/models/block/drawer/" + nameMaterial + "_lower_triple_shelf_single" + ".json");
			File p16 = new File(location + "/models/block/drawer/" + nameMaterial + "_shelf_left" + ".json");
			File p17 = new File(location + "/models/block/drawer/" + nameMaterial + "_shelf_middle" + ".json");
			File p18 = new File(location + "/models/block/drawer/" + nameMaterial + "_shelf_right" + ".json");
			File p19 = new File(location + "/models/block/drawer/" + nameMaterial + "_shelf_single" + ".json");
			File p20 = new File(location + "/models/block/drawer/" + nameMaterial + "_triple_shelf_left" + ".json");
			File p21 = new File(location + "/models/block/drawer/" + nameMaterial + "_triple_shelf_middle" + ".json");
			File p22 = new File(location + "/models/block/drawer/" + nameMaterial + "_triple_shelf_right" + ".json");
			File p23 = new File(location + "/models/block/drawer/" + nameMaterial + "_triple_shelf_single" + ".json");

			File x1 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_book_shelf_left" + ".json");
			File x2 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_book_shelf_middle" + ".json");
			File x3 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_book_shelf_right" + ".json");
			File x4 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_book_shelf_single" + ".json");
			File x5 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_double_shelf_left" + ".json");
			File x6 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_double_shelf_middle" + ".json");
			File x7 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_double_shelf_right" + ".json");
			File x8 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_double_shelf_single" + ".json");
			File x9 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_drawer_base" + ".json");
			File x10 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_large_shelf_left" + ".json");
			File x11 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_large_shelf_middle" + ".json");
			File x12 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_large_shelf_right" + ".json");
			File x13 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_large_shelf_single" + ".json");
			File x14 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_lower_book_shelf_single" + ".json");
			File x15 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_lower_triple_shelf_single" + ".json");
			File x16 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_shelf_left" + ".json");
			File x17 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_shelf_middle" + ".json");
			File x18 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_shelf_right" + ".json");
			File x19 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_shelf_single" + ".json");
			File x20 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_triple_shelf_left" + ".json");
			File x21 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_triple_shelf_middle" + ".json");
			File x22 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_triple_shelf_right" + ".json");
			File x23 = new File(location + "/models/block/drawer/stripped_" + nameMaterial + "_triple_shelf_single" + ".json");

			APIWriter.write(location, p1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_single_lower\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_single_lower\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p21, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p22, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p23, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");

			
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_single_lower\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_single_lower\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x21, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x22, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x23, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesLogs+"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+nameOfTexturesLogs+"\"\r\n"
					+ "	}\r\n"
					+ "}");
		}
	}
}