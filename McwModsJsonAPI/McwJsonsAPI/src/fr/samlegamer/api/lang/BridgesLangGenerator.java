package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import fr.samlegamer.McwMain;
import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

@Deprecated(forRemoval = true)
public class BridgesLangGenerator implements IModFiles.ILang
{
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{
		Path file = Path.of(McwMain.LOCATION, "En_Us_Wood_Bridges.json");

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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_rail_bridge\":\""+MAJ_MAT.get(nbm)+" Rail Bridge\"");
				}
				
				buffer.write("//Finish");
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

	public void initAllStoneEnglish(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT)
	{
		Path file = Path.of(McwMain.LOCATION, "En_Us_Stone_Bridges.json");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);

				buffer.write("{");
				buffer.newLine();
				
				for(int nbm = 0; nbm < MAT_ROCK.size(); nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge\":\""+MAJ_MAT.get(nbm)+" Bridge\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge_pier\": \""+MAJ_MAT.get(nbm)+" Bridge Support\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge_stair\": \""+MAJ_MAT.get(nbm)+" Bridge Stair\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".balustrade_"+MAT_ROCK.get(nbm)+"_bridge\":\"Balustrade "+MAJ_MAT.get(nbm)+" Bridge\"");
				}
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
		Path file = Path.of(McwMain.LOCATION, "Fr_Fr_Wood_Bridges.json");

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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_rail_bridge\":\"Pont ferroviaire en "+MAJ_MAT.get(nbm)+"\"");
				}
				
				buffer.write("//Finish");
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
	
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT)
	{
		Path file = Path.of(McwMain.LOCATION, "Fr_Fr_Stone_Bridges.json");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);

				buffer.write("{");
				buffer.newLine();
				
				for(int nbm = 0; nbm < MAT_ROCK.size(); nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge\":\"Pont en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge_pier\": \"Support de pont en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bridge_stair\": \"Escalier en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".balustrade_"+MAT_ROCK.get(nbm)+"_bridge\":\"Balustrade de pont en "+MAJ_MAT.get(nbm)+"\"");
				}
				buffer.close();
				McwAPI.message(file);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}