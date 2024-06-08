package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.Main;

public class MFurniLangGenerator
{
	public static void initAllEnglish(String Modid, List<String> mat, List<String> matLang)
	{		
		File file = new File(Main.LOCATION + " En_Us_Wood_Furnitures.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
			
				int nbm = 0;
				buffer.write("{");
				buffer.newLine();
				
				for(String i : mat)
				{
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_wardrobe\":\""+matLang.get(nbm)+" Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_modern_wardrobe\":\""+matLang.get(nbm)+" Modern Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_double_wardrobe\":\""+matLang.get(nbm)+" Double Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_bookshelf\":\""+matLang.get(nbm)+" Bookshelf\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_bookshelf_cupboard\":\""+matLang.get(nbm)+" Cupboard Bookshelf\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_drawer\":\""+matLang.get(nbm)+" Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_double_drawer\":\""+matLang.get(nbm)+" Double Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_bookshelf_drawer\":\""+matLang.get(nbm)+" Bookshelf Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_lower_bookshelf_drawer\":\""+matLang.get(nbm)+" Lower Bookshelf Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_large_drawer\":\""+matLang.get(nbm)+" Large Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_lower_triple_drawer\":\""+matLang.get(nbm)+" Lower Triple Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_triple_drawer\":\""+matLang.get(nbm)+" Triple Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_desk\":\""+matLang.get(nbm)+" Desk\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_covered_desk\":\""+matLang.get(nbm)+" Covered Desk\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_modern_desk\":\""+matLang.get(nbm)+" Modern Desk\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_table\":\""+matLang.get(nbm)+" Table\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_end_table\":\""+matLang.get(nbm)+" End Table\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_coffee_table\":\""+matLang.get(nbm)+" Coffee Table\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_glass_table\":\""+matLang.get(nbm)+" Glass Table\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_chair\":\""+matLang.get(nbm)+" Chair\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_modern_chair\":\""+matLang.get(nbm)+" Modern Chair\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_striped_chair\":\""+matLang.get(nbm)+" Striped Chair\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_stool_chair\":\""+matLang.get(nbm)+" Stool\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_counter\":\""+matLang.get(nbm)+" Counter\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_drawer_counter\":\""+matLang.get(nbm)+" Drawer Counter\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_double_drawer_counter\":\""+matLang.get(nbm)+" Double Drawer Counter\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_cupboard_counter\":\""+matLang.get(nbm)+" Cupboard Counter\",");
					buffer.newLine();
					nbm++;
				}
				
				buffer.write("//Finish");
				buffer.newLine();
				buffer.write("}");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Main.LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}