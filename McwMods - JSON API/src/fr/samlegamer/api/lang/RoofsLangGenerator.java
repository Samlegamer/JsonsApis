package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.Main;
import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class RoofsLangGenerator implements IModFiles.ILang
{
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{		
		File file = new File(Main.LOCATION + "En_Us_Wood_Roofs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				
				buffer.write("{");
				buffer.newLine();

				for(int nbm = 0; nbm < MAT_WOOD.size(); nbm++)
				{
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_roof\":\""+MAJ_MAT.get(nbm)+" Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_attic_roof\":\""+MAJ_MAT.get(nbm)+" Attic Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_top_roof\":\""+MAJ_MAT.get(nbm)+" Top Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_lower_roof\":\""+MAJ_MAT.get(nbm)+" Lower Base Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_steep_roof\":\""+MAJ_MAT.get(nbm)+" Steep Base Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_upper_lower_roof\":\""+MAJ_MAT.get(nbm)+" Lower Top Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_upper_steep_roof\":\""+MAJ_MAT.get(nbm)+" Steep Top Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_roof\":\""+MAJ_MAT.get(nbm)+" Planks Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_attic_roof\":\""+MAJ_MAT.get(nbm)+" Planks Attic Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_top_roof\":\""+MAJ_MAT.get(nbm)+" Planks Top Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_lower_roof\":\""+MAJ_MAT.get(nbm)+" Planks Lower Base Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_steep_roof\":\""+MAJ_MAT.get(nbm)+" Planks Steep Base Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_upper_lower_roof\":\""+MAJ_MAT.get(nbm)+" Planks Lower Top Roof\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_upper_steep_roof\":\""+MAJ_MAT.get(nbm)+" Planks Steep Top Roof\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"//Finish");
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
	
	public void initAllWoodFrench(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{		
		File file = new File(Main.LOCATION + "FR_fr_Wood_Roofs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				
				buffer.write("{");
				buffer.newLine();

				for(int nbm = 0; nbm < MAT_WOOD.size(); nbm++)
				{
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_roof\":\"Toit en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_attic_roof\":\"Toit de grenier en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_top_roof\":\"Faîte de toit en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_lower_roof\":\"Toit inférieur en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_steep_roof\":\"Toit raide en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_upper_lower_roof\":\"Faîte de toit inférieur en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_upper_steep_roof\":\"Faîte de toit raide en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_roof\":\"Toit en planche de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_attic_roof\":\"Toit de grenier en planche de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_top_roof\":\"Faîte de toit en planche de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_lower_roof\":\"Toit inférieur en planche de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_steep_roof\":\"Toit raide en planche de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_upper_lower_roof\":\"Faîte de toit inférieur en planche de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_upper_steep_roof\":\"Faîte de toit raide en planche de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
				}

				buffer.write("\"\"//Finish");
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
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT) {
		// TODO Auto-generated method stub
		
	}

}