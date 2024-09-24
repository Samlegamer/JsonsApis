package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwMain;
import fr.samlegamer.utils.IModFiles;

public class DoorsLangGenerator  implements IModFiles.ILang
{
	@Override
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{		
		File file = new File(McwMain.LOCATION + "En_Us_Wood_Doors.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{");
				buffer.newLine();

				for(int nbm = 0;nbm<MAT_WOOD.size();nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_japanese_door\":\""+MAJ_MAT.get(nbm)+" Shoji Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_japanese2_door\":\""+MAJ_MAT.get(nbm)+" Shoji Whole Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_barn_door\":\""+MAJ_MAT.get(nbm)+" Barn Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_modern_door\":\""+MAJ_MAT.get(nbm)+" Modern Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_barn_glass_door\":\""+MAJ_MAT.get(nbm)+" Barn Glassed Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_cottage_door\":\""+MAJ_MAT.get(nbm)+" Cottage Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_classic_door\":\""+MAJ_MAT.get(nbm)+" Classic Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_beach_door\":\""+MAJ_MAT.get(nbm)+" Beach Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_paper_door\":\""+MAJ_MAT.get(nbm)+" Paper Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_four_panel_door\":\""+MAJ_MAT.get(nbm)+" Four Panel Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_tropical_door\":\""+MAJ_MAT.get(nbm)+" Tropical Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_glass_door\":\""+MAJ_MAT.get(nbm)+" Glass Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_mystic_door\":\""+MAJ_MAT.get(nbm)+" Mystic Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_nether_door\":\""+MAJ_MAT.get(nbm)+" Nether Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_stable_door\":\""+MAJ_MAT.get(nbm)+" Stable Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_stable_head_door\":\""+MAJ_MAT.get(nbm)+" Stable Horse Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_western_door\":\""+MAJ_MAT.get(nbm)+" Western Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bamboo_door\":\""+MAJ_MAT.get(nbm)+" Mesh Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_swamp_door\":\""+MAJ_MAT.get(nbm)+" Swamp Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bark_glass_door\":\""+MAJ_MAT.get(nbm)+" Bark Glass Door\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_waffle_door\":\""+MAJ_MAT.get(nbm)+" Waffle Door\",");
				}
				
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

	@Override
	public void initAllWoodFrench(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{}

	@Override
	public void initAllStoneEnglish(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT) {
	}

	@Override
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT) {
	}
}