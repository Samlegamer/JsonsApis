package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.McwAPI;
import fr.samlegamer.McwMain;
import fr.samlegamer.utils.IModFiles;

public class StairsLangGenerator implements IModFiles.ILang
{
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{		
		File file = new File(McwMain.LOCATION + "En_Us_Wood_Stairs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(int nbm = 0;nbm<MAT_WOOD.size();nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_terrace_stairs\":\""+MAJ_MAT.get(nbm)+" Terrace Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_skyline_stairs\":\""+MAJ_MAT.get(nbm)+" Skyline Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_compact_stairs\":\""+MAJ_MAT.get(nbm)+" Compact Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bulk_stairs\":\""+MAJ_MAT.get(nbm)+" Bulk Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_loft_stairs\":\""+MAJ_MAT.get(nbm)+" Loft Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_railing\":\""+MAJ_MAT.get(nbm)+" Stair Railing\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_balcony\":\""+MAJ_MAT.get(nbm)+" Balcony\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_platform\":\""+MAJ_MAT.get(nbm)+" Platform\"");
				}
				
				buffer.newLine();
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
		File file = new File(McwMain.LOCATION + "En_Us_Stone_Stairs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(int nbm = 0; nbm < MAT_ROCK.size(); nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_terrace_stairs\": \""+MAJ_MAT.get(nbm)+" Terrace Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_skyline_stairs\": \""+MAJ_MAT.get(nbm)+" Skyline Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_compact_stairs\": \""+MAJ_MAT.get(nbm)+" Compact Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bulk_stairs\": \""+MAJ_MAT.get(nbm)+" Bulk Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_loft_stairs\": \""+MAJ_MAT.get(nbm)+" Loft Stairs\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_railing\": \""+MAJ_MAT.get(nbm)+" Railing\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_balcony\": \""+MAJ_MAT.get(nbm)+" Balcony\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_platform\": \""+MAJ_MAT.get(nbm)+" Platform\",");
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
		File file = new File(McwMain.LOCATION + "Fr_Fr_Wood_Stairs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(int nbm = 0;nbm<MAT_WOOD.size();nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_terrace_stairs\":\"Escalier de terrasse en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_skyline_stairs\":\"Escalier horizontale en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_compact_stairs\":\"Escalier compact en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bulk_stairs\":\"Escalier vraceux en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_loft_stairs\":\"Escalier de grenier en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_railing\":\"Rampe d'escalier en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_balcony\":\"Balcon en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_platform\":\"Plate-forme en "+MAJ_MAT.get(nbm)+"\"");
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
	
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT)
	{
		File file = new File(McwMain.LOCATION + "Fr_Fr_Stone_Stairs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(int nbm = 0; nbm < MAT_ROCK.size(); nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_terrace_stairs\":\"Escalier de terrasse en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_skyline_stairs\":\"Escalier horizontale en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_compact_stairs\":\"Escalier compact en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_bulk_stairs\":\"Escalier vraceux en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_loft_stairs\":\"Escalier de grenier en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_railing\":\"Rampe d'escalier en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_balcony\":\"Balcon en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_platform\":\"Plate-forme en "+MAJ_MAT.get(nbm)+"\"");

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