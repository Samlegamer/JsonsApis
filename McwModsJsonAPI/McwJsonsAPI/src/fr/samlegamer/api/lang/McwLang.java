package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import fr.samlegamer.McwAPI;
import fr.samlegamer.McwAPI.ClassicFolderTypes;
import fr.samlegamer.utils.Uncomplete;

/* Update to path system */
@Deprecated
@Uncomplete(missing = "Unworked", percent = 5)
public class McwLang
{
	private boolean bridge = false;
	private boolean roofs = false;
	private boolean fences = false;
	private boolean furnitures = false;
	
	public McwLang(boolean bridge, boolean roofs, boolean fences, boolean furnitures)
	{
		this.bridge=bridge;
		this.roofs=roofs;
		this.fences=fences;
		this.furnitures=furnitures;
	}

	public void english(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{
		File file = new File(LOCATION + File.separator + ClassicFolderTypes.LANG.getPath() + "en_us.json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
			
				buffer.write("{");
				buffer.newLine();
				
				for(int nbm = 0;nbm < MAT_WOOD.size(); nbm++)
				{
					McwAPI.verifJson(buffer, MAT_WOOD.get(nbm), MAT_WOOD);
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_wardrobe\":\""+MAJ_MAT.get(nbm)+" Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_modern_wardrobe\":\""+MAJ_MAT.get(nbm)+" Modern Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_double_wardrobe\":\""+MAJ_MAT.get(nbm)+" Double Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bookshelf\":\""+MAJ_MAT.get(nbm)+" Bookshelf\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bookshelf_cupboard\":\""+MAJ_MAT.get(nbm)+" Cupboard Bookshelf\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_drawer\":\""+MAJ_MAT.get(nbm)+" Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_double_drawer\":\""+MAJ_MAT.get(nbm)+" Double Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bookshelf_drawer\":\""+MAJ_MAT.get(nbm)+" Bookshelf Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_lower_bookshelf_drawer\":\""+MAJ_MAT.get(nbm)+" Lower Bookshelf Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_large_drawer\":\""+MAJ_MAT.get(nbm)+" Large Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_lower_triple_drawer\":\""+MAJ_MAT.get(nbm)+" Lower Triple Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_triple_drawer\":\""+MAJ_MAT.get(nbm)+" Triple Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_desk\":\""+MAJ_MAT.get(nbm)+" Desk\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_covered_desk\":\""+MAJ_MAT.get(nbm)+" Covered Desk\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_modern_desk\":\""+MAJ_MAT.get(nbm)+" Modern Desk\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_table\":\""+MAJ_MAT.get(nbm)+" Table\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_end_table\":\""+MAJ_MAT.get(nbm)+" End Table\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_coffee_table\":\""+MAJ_MAT.get(nbm)+" Coffee Table\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_glass_table\":\""+MAJ_MAT.get(nbm)+" Glass Table\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_chair\":\""+MAJ_MAT.get(nbm)+" Chair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_modern_chair\":\""+MAJ_MAT.get(nbm)+" Modern Chair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_striped_chair\":\""+MAJ_MAT.get(nbm)+" Striped Chair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_stool_chair\":\""+MAJ_MAT.get(nbm)+" Stool\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_counter\":\""+MAJ_MAT.get(nbm)+" Counter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_drawer_counter\":\""+MAJ_MAT.get(nbm)+" Drawer Counter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_double_drawer_counter\":\""+MAJ_MAT.get(nbm)+" Double Drawer Counter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_cupboard_counter\":\""+MAJ_MAT.get(nbm)+" Cupboard Counter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_wardrobe\":\"Stripped "+MAJ_MAT.get(nbm)+" Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_modern_wardrobe\":\"Stripped "+MAJ_MAT.get(nbm)+" Modern Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_double_wardrobe\":\"Stripped "+MAJ_MAT.get(nbm)+" Double Wardrobe\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_bookshelf\":\"Stripped "+MAJ_MAT.get(nbm)+" Bookshelf\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_bookshelf_cupboard\":\"Stripped "+MAJ_MAT.get(nbm)+" Cupboard Bookshelf\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_drawer\":\"Stripped "+MAJ_MAT.get(nbm)+" Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_double_drawer\":\"Stripped "+MAJ_MAT.get(nbm)+" Double Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_bookshelf_drawer\":\"Stripped "+MAJ_MAT.get(nbm)+" Bookshelf Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_lower_bookshelf_drawer\":\"Stripped "+MAJ_MAT.get(nbm)+" Lower Bookshelf Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_large_drawer\":\"Stripped "+MAJ_MAT.get(nbm)+" Large Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_lower_triple_drawer\":\"Stripped "+MAJ_MAT.get(nbm)+" Lower Triple Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_triple_drawer\":\"Stripped "+MAJ_MAT.get(nbm)+" Triple Drawer\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_desk\":\"Stripped "+MAJ_MAT.get(nbm)+" Desk\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_covered_desk\":\"Stripped "+MAJ_MAT.get(nbm)+" Covered Desk\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_modern_desk\":\"Stripped "+MAJ_MAT.get(nbm)+" Modern Desk\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_table\":\"Stripped "+MAJ_MAT.get(nbm)+" Table\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_end_table\":\"Stripped "+MAJ_MAT.get(nbm)+" End Table\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_coffee_table\":\"Stripped "+MAJ_MAT.get(nbm)+" Coffee Table\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_glass_table\":\"Stripped "+MAJ_MAT.get(nbm)+" Glass Table\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_chair\":\"Stripped "+MAJ_MAT.get(nbm)+" Chair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_modern_chair\":\"Stripped "+MAJ_MAT.get(nbm)+" Modern Chair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_striped_chair\":\"Stripped "+MAJ_MAT.get(nbm)+" Striped Chair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_stool_chair\":\"Stripped "+MAJ_MAT.get(nbm)+" Stool\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_counter\":\"Stripped "+MAJ_MAT.get(nbm)+" Counter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_drawer_counter\":\"Stripped "+MAJ_MAT.get(nbm)+" Drawer Counter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_double_drawer_counter\":\"Stripped "+MAJ_MAT.get(nbm)+" Double Drawer Counter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_cupboard_counter\":\"Stripped "+MAJ_MAT.get(nbm)+" Cupboard Counter\",");
					buffer.newLine();
					//3.3.0 Update
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_kitchen_cabinet\":\""+MAJ_MAT.get(nbm)+" Kitchen Cabinet\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_double_kitchen_cabinet\":\""+MAJ_MAT.get(nbm)+" Double Kitchen\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_glass_kitchen_cabinet\":\""+MAJ_MAT.get(nbm)+" Glass Kitchen Cabinet\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_kitchen_cabinet\":\"Stripped "+MAJ_MAT.get(nbm)+" Kitchen Cabinet\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_double_kitchen_cabinet\":\"Stripped "+MAJ_MAT.get(nbm)+" Double Kitchen\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_glass_kitchen_cabinet\":\"Stripped "+MAJ_MAT.get(nbm)+" Glass Kitchen Cabinet\",");
					buffer.newLine();
				}
				
				buffer.write("//Finish");
				buffer.newLine();
				buffer.write("}");
				buffer.close();
				writer.close();
				file.createNewFile();
				McwAPI.message(file);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public void french(String LOCATION, String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT) {
		
	}
}