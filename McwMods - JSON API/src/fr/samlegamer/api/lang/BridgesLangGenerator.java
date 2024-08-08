package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwMain;
import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class BridgesLangGenerator implements IModFiles.ILang
{
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{		
		File file = new File(McwMain.LOCATION + "En_Us_Wood_Bridges.json");
		
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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_log_bridge_middle\":\""+MAJ_MAT.get(nbm)+" Bridge\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bridge_pier\":\""+MAJ_MAT.get(nbm)+" Bridge Support\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".rope_"+MAT_WOOD.get(nbm)+"_bridge\":\"Rope "+MAJ_MAT.get(nbm)+" Bridge\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_log_bridge_stair\":\""+MAJ_MAT.get(nbm)+" Bridge Stair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_rope_bridge_stair\":\""+MAJ_MAT.get(nbm)+" Rope Bridge Stair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_rail_bridge\":\""+MAJ_MAT.get(nbm)+" Rail Bridge\",");
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

	public void initAllStoneEnglish(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT)
	{
		File file = new File(McwMain.LOCATION + "En_Us_Stone_Bridges.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				buffer.write("{");
				buffer.newLine();
				
				for(int nbm = 0; nbm < MAT_ROCK.size(); nbm++)
				{
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge\":\""+MAJ_MAT.get(nbm)+" Bridge\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge_pier\": \""+MAJ_MAT.get(nbm)+" Bridge Support\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge_stair\": \""+MAJ_MAT.get(nbm)+" Bridge Stair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".balustrade_"+MAT_ROCK.get(nbm)+"_bridge\":\"Balustrade "+MAJ_MAT.get(nbm)+" Bridge\",");
					buffer.newLine();
				}
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
	{
		File file = new File(McwMain.LOCATION + "Fr_Fr_Wood_Bridges.json");
		
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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_log_bridge_middle\":\"Pont en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bridge_pier\":\"Support de pont en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".rope_"+MAT_WOOD.get(nbm)+"_bridge\":\"Pont en "+MAJ_MAT.get(nbm)+" avec corde\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_log_bridge_stair\":\"Escalier en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_rope_bridge_stair\":\"Escalier en pont de corde en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_rail_bridge\":\"Pont ferroviaire en "+MAJ_MAT.get(nbm)+"\",");
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
	
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT)
	{
		File file = new File(McwMain.LOCATION + "Fr_Fr_Stone_Bridges.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				buffer.write("{");
				buffer.newLine();
				
				for(int nbm = 0; nbm < MAT_ROCK.size(); nbm++)
				{
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge\":\"Pont en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge_pier\": \"Support de pont en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge_stair\": \"Escalier en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".balustrade_"+MAT_ROCK.get(nbm)+"_bridge\":\"Balustrade de pont en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
				}
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
}