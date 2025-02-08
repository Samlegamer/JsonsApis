package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwMain;
import fr.samlegamer.utils.IModFiles;

public class WindowsLangGenerator  implements IModFiles.ILang
{
	@Override
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{
		Path file = Path.of(McwMain.LOCATION, "En_Us_Wood_Windows.json");
		
		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{");
				buffer.newLine();

				for(int nbm = 0;nbm<MAT_WOOD.size();nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_window\":\"Resizeable "+MAJ_MAT.get(nbm)+" Window\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_window\":\"Resizeable "+MAJ_MAT.get(nbm)+" Planks Window\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_window2\":\"Rectangle "+MAJ_MAT.get(nbm)+" Window\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_window2\":\"Rectangle "+MAJ_MAT.get(nbm)+" Planks Window\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_log_window\":\"Resizeable Stripped "+MAJ_MAT.get(nbm)+" Window\",\r\n"
							+ "\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_log_window2\":\"Rectangle Stripped "+MAJ_MAT.get(nbm)+" Window\",\r\n");
					
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_four_window\":\""+MAJ_MAT.get(nbm)+" Four Pane Window\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_four_window\":\""+MAJ_MAT.get(nbm)+" Planks Four Pane Window\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_log_four_window\":\"Stripped "+MAJ_MAT.get(nbm)+" Four Pane Window\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_log_parapet\":\""+MAJ_MAT.get(nbm)+" Parapet\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_parapet\":\""+MAJ_MAT.get(nbm)+" Planks Parapet\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_blinds\":\""+MAJ_MAT.get(nbm)+" Blinds\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_shutter\":\""+MAJ_MAT.get(nbm)+" Shutter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_louvered_shutter\":\""+MAJ_MAT.get(nbm)+" Louvered Shutter\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_pane_window\":\""+MAJ_MAT.get(nbm)+" Pane Window\",\r\n"
							+ "\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_pane_window\":\"Stripped "+MAJ_MAT.get(nbm)+" Pane Window\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_pane_window\":\""+MAJ_MAT.get(nbm)+" Planks Pane Window\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_curtain_rod\": \""+MAJ_MAT.get(nbm)+" Curtain Rod\"");
				}
				
				buffer.newLine();
				buffer.write("}");
				buffer.close();
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
	{
		Path file = Path.of(McwMain.LOCATION, "Fr_Fr_Wood_Windows.json");
		
		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{");
				buffer.newLine();

				for(int nbm = 0;nbm<MAT_WOOD.size();nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_window\":\"Fenêtre redimensionnable en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_window\":\"Fenêtre redimensionnable en planches de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_window2\":\"Fenêtre rectangulaire en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_window2\":\"Fenêtre rectangulaire en planches de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_log_window\":\"Fenêtre redimensionnable en "+MAJ_MAT.get(nbm)+" écorcée\",\r\n"
							+ "\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_log_window2\":\"Fenêtre rectangulaire en "+MAJ_MAT.get(nbm)+" écorcée\",\r\n");
					
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_four_window\":\"Fenêtre à quatre panneaux en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_four_window\":\"Fenêtre à quatre panneaux en planches de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_log_four_window\":\"Fenêtre à quatre panneaux en "+MAJ_MAT.get(nbm)+" écorcée\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_log_parapet\":\"Parapet en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_parapet\":\"Parapet en planches de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_blinds\":\"Stores en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_shutter\":\"Volet en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_louvered_shutter\":\"Volet persienné en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_pane_window\":\"Fenêtre à panneaux en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+".stripped_"+MAT_WOOD.get(nbm)+"_pane_window\":\"Fenêtre à panneaux en "+MAJ_MAT.get(nbm)+" écorcée\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_plank_pane_window\":\"Fenêtre à panneaux en planches de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_curtain_rod\": \"Tringle à rideau en "+MAJ_MAT.get(nbm)+"\"");
				}
				
				buffer.newLine();
				buffer.write("}");
				buffer.close();
				McwAPI.message(file);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public void initAllStoneEnglish(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT){
	}

	@Override
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT){
	}
}