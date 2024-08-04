package fr.samlegamer.api.clientgen.furnitures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.samlegamer.utils.APIWriter;

@Deprecated
public class McwFurnitures
{//+ nameMaterial + (isStemTexture ? "_stem" : "_log") +
	@Deprecated
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
		public static void chair(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
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
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
						
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/stool_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1_0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/striped_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
					
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
						
			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
						
			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/stool_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1_0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/striped_chair\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
		}
	
		public static void wardrobe(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
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
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_bottom_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_top_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_top_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
		
			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_bottom_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p21, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p22, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p23, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p24, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p25, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p26, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			// X = Striped
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_bottom_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"3\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_top_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_cupboard_top_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"3\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/bookshelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_bottom_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, x20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x21, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_base_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x22, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_base_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x23, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_bottom_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x24, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_bottom\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x25, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x26, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/wardrobe_top\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
		}

		public static void table(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
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
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/coffee_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, p20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/coffee_table\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/coffee_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		
			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
			
			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/end_table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/glass_table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/glass\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_center\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_middle_three\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_side\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");

			APIWriter.write(location, x20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/table_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "");
		}

		public static void counter(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
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
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter_inner_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/cupboard_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2_1\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/cupboard_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2_1\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
		
			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/counter_inner_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/cupboard_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2_1\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/cupboard_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2_1\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_counter\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_counter_corner\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1_2\": \"minecraft:block/iron_block\"\r\n"
					+ "	}\r\n"
					+ "}");
		}

		public static void desk(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
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
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
				
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
		
			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/covered_desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/modern_desk_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \"minecraft:block/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"0\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \"minecraft:block/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
		}

		public static void drawer(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
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
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_single_lower\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_single_lower\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p21, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p22, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, p23, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");

			
			
			APIWriter.write(location, x1, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x2, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x3, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x4, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x5, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x6, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x7, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x8, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/double_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x9, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/drawer_base\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x10, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x11, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x12, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x13, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/large_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x14, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/book_shelf_single_lower\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/bookshelf\",\r\n"
					+ "		\"1\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x15, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_single_lower\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x16, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x17, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x18, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x19, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x20, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_left\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x21, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_middle\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x22, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_right\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
			
			APIWriter.write(location, x23, "{\r\n"
					+ "	\"parent\": \"mcwfurnitures:block/parent/triple_shelf_single\",\r\n"
					+ "	\"textures\": {\r\n"
					+ "		\"0\": \"minecraft:block/iron_block\",\r\n"
					+ "		\"1\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "		\"particle\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "	}\r\n"
					+ "}");
		}
	}

	public static class Chair
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_chair" + ".json");
		
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {\r\n"
					+ "        \"facing=east\": { \"model\": \""+modid+":block/chair/"+material+"_chair\", \"y\": 180  },\r\n"
					+ "        \"facing=south\": { \"model\": \""+modid+":block/chair/"+material+"_chair\", \"y\": 270 },\r\n"
					+ "        \"facing=west\": { \"model\": \""+modid+":block/chair/"+material+"_chair\" },\r\n"
					+ "        \"facing=north\": { \"model\": \""+modid+":block/chair/"+material+"_chair\", \"y\": 90  }\r\n"
					+ "    }\r\n"
					+ "}\r\n"
					+ "");
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_chair" + ".json");
		
			APIWriter.write(location, file, "{\"parent\": \""+modid+":block/chair/"+mat+"_chair\"}");
		}
	}
	
	public static class Bookshelf
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_bookshelf" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"variants\": {                                                                        \r\n"
						+ "        \"facing=north,above=false,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_base\", \"y\": 180},\r\n"
						+ "		\"facing=north,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_middle\", \"y\": 180},\r\n"
						+ "		\"facing=north,above=true,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_bottom\", \"y\": 180},\r\n"
						+ "		\"facing=north,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_bottom\", \"y\": 180, \"x\": 180},\r\n"
						+ "\r\n"
						+ "		\"facing=east,above=false,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_base\", \"y\": 270},\r\n"
						+ "		\"facing=east,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_middle\", \"y\": 270},\r\n"
						+ "		\"facing=east,above=true,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_bottom\", \"y\": 270},\r\n"
						+ "		\"facing=east,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_bottom\", \"y\": 270, \"x\": 180},\r\n"
						+ "		\r\n"
						+ "		\"facing=south,above=false,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_base\"},\r\n"
						+ "		\"facing=south,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_middle\"},\r\n"
						+ "		\"facing=south,above=true,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_bottom\"},\r\n"
						+ "		\"facing=south,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_bottom\", \"x\": 180},\r\n"
						+ "		\r\n"
						+ "		\"facing=west,above=false,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_base\", \"y\": 90},\r\n"
						+ "		\"facing=west,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_middle\", \"y\": 90},\r\n"
						+ "		\"facing=west,above=true,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_bottom\", \"y\": 90},\r\n"
						+ "		\"facing=west,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_bottom\", \"y\": 90, \"x\": 180}\r\n"
						+ "    }\r\n"
						+ "}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_bookshelf" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/wardrobe/"+mat+"_bookshelf_base\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	}

	public static class Bookshelf_Cupboard
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_bookshelf_cupboard" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"variants\": {                                                                        \r\n"
						+ "        \"facing=north,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_base_left\", \"y\": 180},\r\n"
						+ "		\"facing=north,above=true,below=true,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_middle\", \"y\": 180},\r\n"
						+ "		\"facing=north,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_bottom_left\", \"y\": 180},\r\n"
						+ "		\"facing=north,above=false,below=true,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_top_left\", \"y\": 180},\r\n"
						+ "\r\n"
						+ "		\"facing=east,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_base_left\", \"y\": 270},\r\n"
						+ "		\"facing=east,above=true,below=true,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_middle\", \"y\": 270},\r\n"
						+ "		\"facing=east,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_bottom_left\", \"y\": 270},\r\n"
						+ "		\"facing=east,above=false,below=true,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_top_left\", \"y\": 270},\r\n"
						+ "		\r\n"
						+ "		\"facing=south,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_base_left\"},\r\n"
						+ "		\"facing=south,above=true,below=true,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_middle\"},\r\n"
						+ "		\"facing=south,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_bottom_left\"},\r\n"
						+ "		\"facing=south,above=false,below=true,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_top_left\"},\r\n"
						+ "		\r\n"
						+ "		\"facing=west,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_base_left\", \"y\": 90},\r\n"
						+ "		\"facing=west,above=true,below=true,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_middle\", \"y\": 90},\r\n"
						+ "		\"facing=west,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_bottom_left\", \"y\": 90},\r\n"
						+ "		\"facing=west,above=false,below=true,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_top_left\", \"y\": 90},\r\n"
						+ "		\r\n"
						+ "		\r\n"
						+ "		\r\n"
						+ "		\"facing=north,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_base_right\", \"y\": 180},\r\n"
						+ "		\"facing=north,above=true,below=true,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_middle\", \"y\": 180, \"x\": 180},\r\n"
						+ "		\"facing=north,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_bottom_right\", \"y\": 180},\r\n"
						+ "		\"facing=north,above=false,below=true,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_top_right\", \"y\": 180},\r\n"
						+ "\r\n"
						+ "		\"facing=east,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_base_right\", \"y\": 270},\r\n"
						+ "		\"facing=east,above=true,below=true,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_middle\", \"y\": 270, \"x\": 180},\r\n"
						+ "		\"facing=east,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_bottom_right\", \"y\": 270},\r\n"
						+ "		\"facing=east,above=false,below=true,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_top_right\", \"y\": 270},\r\n"
						+ "		\r\n"
						+ "		\"facing=south,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_base_right\"},\r\n"
						+ "		\"facing=south,above=true,below=true,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_middle\", \"x\": 180},\r\n"
						+ "		\"facing=south,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_bottom_right\"},\r\n"
						+ "		\"facing=south,above=false,below=true,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_top_right\"},\r\n"
						+ "		\r\n"
						+ "		\"facing=west,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_base_right\", \"y\": 90},\r\n"
						+ "		\"facing=west,above=true,below=true,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_middle\", \"y\": 90, \"x\": 180},\r\n"
						+ "		\"facing=west,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_bottom_right\", \"y\": 90},\r\n"
						+ "		\"facing=west,above=false,below=true,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_bookshelf_cupboard_top_right\", \"y\": 90}\r\n"
						+ "    }\r\n"
						+ "}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_bookshelf_cupboard" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/wardrobe/"+mat+"_bookshelf_cupboard_base_right\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Bookshelf_Drawer
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_bookshelf_drawer" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"variants\": {                                                                        \r\n"
						+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_single\", \"y\": 180},\r\n"
						+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_middle\", \"y\": 180},\r\n"
						+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_left\", \"y\": 180},\r\n"
						+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_right\", \"y\": 180},\r\n"
						+ "		\r\n"
						+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_single\", \"y\": 270},\r\n"
						+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_middle\", \"y\": 270},\r\n"
						+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_left\", \"y\": 270},\r\n"
						+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_right\", \"y\": 270},\r\n"
						+ "		\r\n"
						+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_single\"},\r\n"
						+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_middle\"},\r\n"
						+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_left\"},\r\n"
						+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_right\"},\r\n"
						+ "		\r\n"
						+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_single\", \"y\": 90},\r\n"
						+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_middle\", \"y\": 90},\r\n"
						+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_left\", \"y\": 90},\r\n"
						+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_right\", \"y\": 90}\r\n"
						+ "    }\r\n"
						+ "}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_bookshelf_drawer" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/drawer/"+mat+"_book_shelf_single\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	}

	public static class Coffee_Table
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_coffee_table" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                   \r\n"
							+ "\r\n"
							+ "        \"north=false,east=false,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\"},\r\n"
							+ "		\"north=true,east=false,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table_middle\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table_middle\"},\r\n"
							+ "		\"north=true,east=true,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table_middle\"},\r\n"
							+ "\r\n"
							+ "		\"north=true,east=true,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table_middle\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table_middle\", \"y\": 180},\r\n"
							+ "		\"north=true,east=false,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table_middle\", \"y\": 270},\r\n"
							+ "		\"north=true,east=true,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table_middle\"},\r\n"
							+ "		\r\n"
							+ "		\"north=true,east=false,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\", \"y\": 90},\r\n"
							+ "		\"north=true,east=true,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\", \"y\": 180},\r\n"
							+ "		\"north=false,east=true,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\", \"y\": 270},\r\n"
							+ "		\"north=false,east=false,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\"},\r\n"
							+ "		\r\n"
							+ "        \"north=true,east=false,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\", \"y\": 180},\r\n"
							+ "		\"north=false,east=false,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\", \"y\": 270},\r\n"
							+ "		\"north=false,east=false,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_coffee_table\"}\r\n"
							+ "    }\r\n"
							+ "}\r\n"
							+ "");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_coffee_table" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/table/"+mat+"_coffee_table\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	}

	public static class Counter
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_counter" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight\":  { \"model\": \""+modid+":block/counter/"+material+"_counter\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=straight\":  { \"model\": \""+modid+":block/counter/"+material+"_counter\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=straight\": { \"model\": \""+modid+":block/counter/"+material+"_counter\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=straight\": { \"model\": \""+modid+":block/counter/"+material+"_counter\", \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_corner\", \"y\": 0  },\r\n"
							+ "        \"facing=west,shape=outer_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_corner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_corner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_corner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_corner\", \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=inner_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=inner_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 180 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_counter" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/counter/"+mat+"_counter\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	}
	
	public static class Covered_Desk
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_covered_desk" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_single\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_right\", \"y\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_single\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_single\"},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_middle\"},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_left\"},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_single\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_covered_desk_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_covered_desk" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/desk/"+mat+"_covered_desk_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Cupboard_Counter
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_cupboard_counter" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight\":  { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=straight\":  { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=straight\": { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=straight\": { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter\", \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right\":  { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter_corner\", \"y\": 0  },\r\n"
							+ "        \"facing=west,shape=outer_right\":  { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter_corner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right\": { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_right\": { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter_corner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left\":  { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter_corner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_left\":  { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_left\": { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_left\": { \"model\": \""+modid+":block/counter/"+material+"_cupboard_counter_corner\", \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=inner_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=inner_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 180 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_cupboard_counter" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/counter/"+mat+"_cupboard_counter\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Desk
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_desk" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_single\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_right\", \"y\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_single\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_single\"},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_middle\"},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_left\"},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_single\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_desk_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_desk" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/desk/"+mat+"_desk_single\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	}

	public static class Double_Drawer
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_double_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_single\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_right\", \"y\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_single\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_single\"},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_middle\"},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_left\"},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_single\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_double_shelf_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_double_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/drawer/"+mat+"_double_shelf_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Double_Drawer_Counter
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_double_drawer_counter" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight\":  { \"model\": \""+modid+":block/counter/"+material+"_double_counter\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=straight\":  { \"model\": \""+modid+":block/counter/"+material+"_double_counter\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=straight\": { \"model\": \""+modid+":block/counter/"+material+"_double_counter\", \"y\": 0, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=straight\": { \"model\": \""+modid+":block/counter/"+material+"_double_counter\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right\":  { \"model\": \""+modid+":block/counter/"+material+"_double_counter_corner\", \"y\": 0, \"uvlock\": true  },\r\n"
							+ "        \"facing=west,shape=outer_right\":  { \"model\": \""+modid+":block/counter/"+material+"_double_counter_corner\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_right\": { \"model\": \""+modid+":block/counter/"+material+"_double_counter_corner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=outer_right\": { \"model\": \""+modid+":block/counter/"+material+"_double_counter_corner\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left\":  { \"model\": \""+modid+":block/counter/"+material+"_double_counter_corner\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=outer_left\":  { \"model\": \""+modid+":block/counter/"+material+"_double_counter_corner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_left\": { \"model\": \""+modid+":block/counter/"+material+"_double_counter_corner\", \"y\": 0, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=outer_left\": { \"model\": \""+modid+":block/counter/"+material+"_double_counter_corner\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 0, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=inner_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=inner_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=inner_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=inner_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=inner_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 0, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=inner_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 180, \"uvlock\": true }\r\n"
							+ "    }\r\n"
							+ "}");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_double_drawer_counter" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/counter/"+mat+"_double_counter\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Double_Wardrobe
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_double_wardrobe" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,above=false,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_base\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=true,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_bottom\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_top\", \"y\": 180},\r\n"
							+ "\r\n"
							+ "		\"facing=east,above=false,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_base\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=true,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_bottom\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_top\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,above=false,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_base\"},\r\n"
							+ "		\"facing=south,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_middle\"},\r\n"
							+ "		\"facing=south,above=true,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_bottom\"},\r\n"
							+ "		\"facing=south,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_top\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,above=false,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_base\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=true,below=false\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_bottom\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_double_wardrobe_top\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_double_wardrobe" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/wardrobe/"+mat+"_double_wardrobe_base\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Drawer
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_single\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_right\", \"y\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_single\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_single\"},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_middle\"},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_left\"},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_single\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_shelf_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_drawer" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/drawer/"+mat+"_shelf_single\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	}

	public static class Drawer_Counter
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_drawer_counter" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight\":  { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=straight\":  { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=straight\": { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=straight\": { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter\", \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right\":  { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter_corner\", \"y\": 0  },\r\n"
							+ "        \"facing=west,shape=outer_right\":  { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter_corner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right\": { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_right\": { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter_corner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left\":  { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter_corner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_left\":  { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_left\": { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_left\": { \"model\": \""+modid+":block/counter/"+material+"_drawer_counter_corner\", \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=inner_right\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_right\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_left\":  { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=inner_left\": { \"model\": \""+modid+":block/counter/"+material+"_counter_inner_corner\", \"y\": 180 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_drawer_counter" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/counter/"+mat+"_drawer_counter\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class End_Table
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_end_table" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                   \r\n"
							+ "\r\n"
							+ "        \"north=false,east=false,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_single\"},\r\n"
							+ "		\"north=true,east=false,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_middle\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_middle\"},\r\n"
							+ "		\"north=true,east=true,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_center\"},\r\n"
							+ "\r\n"
							+ "		\"north=true,east=true,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_middle_three\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_middle_three\", \"y\": 180},\r\n"
							+ "		\"north=true,east=false,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_middle_three\", \"y\": 270},\r\n"
							+ "		\"north=true,east=true,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_middle_three\"},\r\n"
							+ "		\r\n"
							+ "		\"north=true,east=false,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_corner\", \"y\": 90},\r\n"
							+ "		\"north=true,east=true,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_corner\", \"y\": 180},\r\n"
							+ "		\"north=false,east=true,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_corner\", \"y\": 270},\r\n"
							+ "		\"north=false,east=false,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_corner\"},\r\n"
							+ "		\r\n"
							+ "        \"north=true,east=false,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_side\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_side\", \"y\": 180},\r\n"
							+ "		\"north=false,east=false,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_side\", \"y\": 270},\r\n"
							+ "		\"north=false,east=false,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_end_table_side\"}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_end_table" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/table/"+mat+"_end_table_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Glass_Table
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_glass_table" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                   \r\n"
							+ "\r\n"
							+ "        \"north=false,east=false,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_single\"},\r\n"
							+ "		\"north=true,east=false,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_middle\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_middle\"},\r\n"
							+ "		\"north=true,east=true,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_center\"},\r\n"
							+ "\r\n"
							+ "		\"north=true,east=true,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_middle_three\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_middle_three\", \"y\": 180},\r\n"
							+ "		\"north=true,east=false,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_middle_three\", \"y\": 270},\r\n"
							+ "		\"north=true,east=true,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_middle_three\"},\r\n"
							+ "		\r\n"
							+ "		\"north=true,east=false,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_corner\", \"y\": 90},\r\n"
							+ "		\"north=true,east=true,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_corner\", \"y\": 180},\r\n"
							+ "		\"north=false,east=true,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_corner\", \"y\": 270},\r\n"
							+ "		\"north=false,east=false,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_corner\"},\r\n"
							+ "		\r\n"
							+ "        \"north=true,east=false,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_side\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_side\", \"y\": 180},\r\n"
							+ "		\"north=false,east=false,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_side\", \"y\": 270},\r\n"
							+ "		\"north=false,east=false,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_glass_table_side\"}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_glass_table" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/table/"+mat+"_glass_table_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Large_Drawer
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_large_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_single\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_right\", \"y\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_single\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_single\"},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_middle\"},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_left\"},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_single\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_large_shelf_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_large_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/drawer/"+mat+"_large_shelf_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Lower_Bookshelf_Drawer
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_lower_bookshelf_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_single\", \"y\": 180, \"x\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_middle\", \"y\": 180, \"x\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_right\", \"y\": 180, \"x\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_left\", \"y\": 180, \"x\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_single\", \"y\": 270, \"x\": 180},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_middle\", \"y\": 270, \"x\": 180},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_right\", \"y\": 270, \"x\": 180},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_left\", \"y\": 270, \"x\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_single\", \"x\": 180},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_middle\", \"x\": 180},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_right\", \"x\": 180},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_left\", \"x\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_single\", \"y\": 90, \"x\": 180},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_middle\", \"y\": 90, \"x\": 180},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_right\", \"y\": 90, \"x\": 180},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_book_shelf_left\", \"y\": 90, \"x\": 180}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_lower_bookshelf_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/drawer/"+mat+"_lower_book_shelf_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Lower_Triple_Drawer
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_lower_triple_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_single\", \"y\": 180, \"x\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_middle\", \"y\": 180, \"x\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_right\", \"y\": 180, \"x\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_left\", \"y\": 180, \"x\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_single\", \"y\": 270, \"x\": 180},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_middle\", \"y\": 270, \"x\": 180},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_right\", \"y\": 270, \"x\": 180},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_left\", \"y\": 270, \"x\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_single\", \"x\": 180},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_middle\", \"x\": 180},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_right\", \"x\": 180},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_left\", \"x\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_single\", \"y\": 90, \"x\": 180},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_middle\", \"y\": 90, \"x\": 180},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_right\", \"y\": 90, \"x\": 180},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_left\", \"y\": 90, \"x\": 180}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_lower_triple_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/drawer/"+mat+"_lower_triple_shelf_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Modern_Chair
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_modern_chair" + ".json");
		
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {\r\n"
					+ "        \"facing=east\": { \"model\": \""+modid+":block/chair/"+material+"_modern_chair\", \"y\": 180  },\r\n"
					+ "        \"facing=south\": { \"model\": \""+modid+":block/chair/"+material+"_modern_chair\", \"y\": 270 },\r\n"
					+ "        \"facing=west\": { \"model\": \""+modid+":block/chair/"+material+"_modern_chair\"},\r\n"
					+ "        \"facing=north\": { \"model\": \""+modid+":block/chair/"+material+"_modern_chair\", \"y\": 90  }\r\n"
					+ "    }\r\n"
					+ "}");
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_modern_chair" + ".json");
		
			APIWriter.write(location, file, "{\"parent\": \""+modid+":block/chair/"+mat+"_modern_chair\"}");
		}
	}

	public static class Modern_Desk
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_modern_desk" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_single\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_right\", \"y\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_single\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_single\"},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_middle\"},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_left\"},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_single\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/desk/"+material+"_modern_desk_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_modern_desk" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/desk/"+mat+"_modern_desk_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Modern_Wardrobe
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_modern_wardrobe" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_base_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_bottom_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_top\", \"y\": 180},\r\n"
							+ "\r\n"
							+ "		\"facing=east,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_base_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_bottom_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_top\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_base_left\"},\r\n"
							+ "		\"facing=south,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_middle\"},\r\n"
							+ "		\"facing=south,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_bottom_left\"},\r\n"
							+ "		\"facing=south,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_top\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_base_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_bottom_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_top\", \"y\": 90},\r\n"
							+ "		\r\n"
							+ "		\r\n"
							+ "		\"facing=north,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_base_right\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_bottom_right\", \"y\": 180},\r\n"
							+ "\r\n"
							+ "		\"facing=east,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_base_right\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_bottom_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_base_right\"},\r\n"
							+ "		\"facing=south,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_bottom_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_base_right\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_modern_wardrobe_bottom_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}\r\n"
							+ "");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_modern_wardrobe" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/wardrobe/"+mat+"_modern_wardrobe_base_right\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Stool_Chair
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_stool_chair" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "  \"variants\": {\r\n"
							+ "    \"\": {\r\n"
							+ "      \"model\": \""+modid+":block/chair/"+material+"_stool_chair\"\r\n"
							+ "    }\r\n"
							+ "  }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_stool_chair" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/chair/"+mat+"_stool_chair\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Striped_Chair
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_striped_chair" + ".json");
		
			APIWriter.write(location, file, "{\r\n"
					+ "    \"variants\": {\r\n"
					+ "        \"facing=east\": { \"model\": \""+modid+":block/chair/"+material+"_striped_chair\", \"y\": 180  },\r\n"
					+ "        \"facing=south\": { \"model\": \""+modid+":block/chair/"+material+"_striped_chair\", \"y\": 270 },\r\n"
					+ "        \"facing=west\": { \"model\": \""+modid+":block/chair/"+material+"_striped_chair\" },\r\n"
					+ "        \"facing=north\": { \"model\": \""+modid+":block/chair/"+material+"_striped_chair\", \"y\": 90  }\r\n"
					+ "    }\r\n"
					+ "}");
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_striped_chair" + ".json");
		
			APIWriter.write(location, file, "{\"parent\": \""+modid+":block/chair/"+mat+"_striped_chair\"}");
		}
	}

	public static class Table
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_table" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                   \r\n"
							+ "\r\n"
							+ "        \"north=false,east=false,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_table_single\"},\r\n"
							+ "		\"north=true,east=false,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_table_middle\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_table_middle\"},\r\n"
							+ "		\"north=true,east=true,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_table_center\"},\r\n"
							+ "\r\n"
							+ "		\"north=true,east=true,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_table_middle_three\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_table_middle_three\", \"y\": 180},\r\n"
							+ "		\"north=true,east=false,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_table_middle_three\", \"y\": 270},\r\n"
							+ "		\"north=true,east=true,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_table_middle_three\"},\r\n"
							+ "		\r\n"
							+ "		\"north=true,east=false,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_table_corner\", \"y\": 90},\r\n"
							+ "		\"north=true,east=true,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_table_corner\", \"y\": 180},\r\n"
							+ "		\"north=false,east=true,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_table_corner\", \"y\": 270},\r\n"
							+ "		\"north=false,east=false,west=true,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_table_corner\"},\r\n"
							+ "		\r\n"
							+ "        \"north=true,east=false,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_table_side\", \"y\": 90},\r\n"
							+ "		\"north=false,east=true,west=false,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_table_side\", \"y\": 180},\r\n"
							+ "		\"north=false,east=false,west=false,south=true\":  { \"model\": \""+modid+":block/table/"+material+"_table_side\", \"y\": 270},\r\n"
							+ "		\"north=false,east=false,west=true,south=false\":  { \"model\": \""+modid+":block/table/"+material+"_table_side\"}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_table" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/table/"+mat+"_table_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Triple_Drawer
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_triple_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_single\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_right\", \"y\": 180},\r\n"
							+ "		\r\n"
							+ "		\"facing=east,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_single\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,north=false,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_single\"},\r\n"
							+ "		\"facing=south,north=true,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_middle\"},\r\n"
							+ "		\"facing=south,north=false,south=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_left\"},\r\n"
							+ "		\"facing=south,north=true,south=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,east=false,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_single\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=false,west=true\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,east=true,west=false\":  { \"model\": \""+modid+":block/drawer/"+material+"_triple_shelf_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_triple_drawer" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/drawer/"+mat+"_triple_shelf_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Wardrobe
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_wardrobe" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=north,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_base_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_middle\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_bottom_left\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_top\", \"y\": 180},\r\n"
							+ "\r\n"
							+ "		\"facing=east,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_base_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_middle\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_bottom_left\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_top\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_base_left\"},\r\n"
							+ "		\"facing=south,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_middle\"},\r\n"
							+ "		\"facing=south,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_bottom_left\"},\r\n"
							+ "		\"facing=south,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_top\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,above=false,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_base_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=true,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_middle\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=true,below=false,hinge=left\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_bottom_left\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=false,below=true\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_top\", \"y\": 90},\r\n"
							+ "		\r\n"
							+ "		\r\n"
							+ "		\"facing=north,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_base_right\", \"y\": 180},\r\n"
							+ "		\"facing=north,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_bottom_right\", \"y\": 180},\r\n"
							+ "\r\n"
							+ "		\"facing=east,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_base_right\", \"y\": 270},\r\n"
							+ "		\"facing=east,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_bottom_right\", \"y\": 270},\r\n"
							+ "		\r\n"
							+ "		\"facing=south,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_base_right\"},\r\n"
							+ "		\"facing=south,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_bottom_right\"},\r\n"
							+ "		\r\n"
							+ "		\"facing=west,above=false,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_base_right\", \"y\": 90},\r\n"
							+ "		\"facing=west,above=true,below=false,hinge=right\":  { \"model\": \""+modid+":block/wardrobe/"+material+"_wardrobe_bottom_right\", \"y\": 90}\r\n"
							+ "    }\r\n"
							+ "}\r\n"
							+ "");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_wardrobe" + ".json");
		
			APIWriter.write(location, file, "{\"parent\": \""+modid+":block/wardrobe/"+mat+"_wardrobe_base_right\"}");
		}
	}
}