package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.Main;
import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class MFLangGenerator implements IModFiles.ILang
{
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{		
		File file = new File(Main.LOCATION + "En_Us_Wood_Fences.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
			
				buffer.write("{");
				buffer.newLine();
				
				for(int nbm = 0; nbm<MAT_WOOD.size();nbm++)
				{
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_picket_fence\":\""+MAJ_MAT.get(nbm)+" Picket Fence\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_stockade_fence\":\""+MAJ_MAT.get(nbm)+" Stockade Fence\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_horse_fence\":\""+MAJ_MAT.get(nbm)+" Horse Fence\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_wired_fence\":\""+MAJ_MAT.get(nbm)+" Wired Fence\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_highley_gate\":\""+MAJ_MAT.get(nbm)+" Highley Gate\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_pyramid_gate\":\""+MAJ_MAT.get(nbm)+" Pyramid Gate\",");
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

	@Override
	public void initAllStoneEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT) {
		// TODO Auto-generated method stub
		
	}
}