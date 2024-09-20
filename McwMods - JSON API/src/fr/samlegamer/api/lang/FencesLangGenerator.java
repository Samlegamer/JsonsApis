package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.McwMain;
import fr.samlegamer.McwAPI;
import fr.samlegamer.utils.IModFiles;

public class FencesLangGenerator implements IModFiles.ILang
{
	private List<String> LEAVES;
	private List<String> LEAVES_LANG;

	public FencesLangGenerator(List<String> leaves, List<String> lang)
	{
		this.LEAVES=leaves;
		this.LEAVES_LANG=lang;
	}
	
	public FencesLangGenerator()
	{
		this(new ArrayList<String>(), new ArrayList<String>());
	}


	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{		
		File file = new File(McwMain.LOCATION + "En_Us_Wood_Fences.json");
		
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
					McwAPI.verifJsonLang(buffer, nbm);
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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_pyramid_gate\":\""+MAJ_MAT.get(nbm)+" Pyramid Gate\"");
				}
				
				if(!LEAVES.isEmpty())
				{
					for(int nbm = 0; nbm<LEAVES.size();nbm++)
					{
						McwAPI.verifJsonLang(buffer, nbm);
						buffer.write("\"block."+CompatModid+"."+LEAVES.get(nbm)+"_hedge\":\""+LEAVES_LANG.get(nbm)+" Hedge\"");
					}
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
	public void initAllStoneEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT) 
	{
		File file = new File(McwMain.LOCATION + "En_Us_Stone_Fences.json");
		
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
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+".modern_"+MAT_WOOD.get(nbm)+"_wall\": \"Modern "+MAJ_MAT.get(nbm)+" Wall\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".railing_"+MAT_WOOD.get(nbm)+"_wall\": \"Railing "+MAJ_MAT.get(nbm)+" Wall\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_railing_gate\": \""+MAJ_MAT.get(nbm)+" Railing Gate\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_pillar_wall\": \""+MAJ_MAT.get(nbm)+" Pillar Wall\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_grass_topped_wall\": \""+MAJ_MAT.get(nbm)+" Grass Topped Wall\"");
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
	public void initAllWoodFrench(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{
		File file = new File(McwMain.LOCATION + "Fr_Fr_Wood_Fences.json");
		
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
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_picket_fence\":\"Clôture à piquets en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_stockade_fence\":\"Clôture à palissade en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_horse_fence\":\"Clôture pour chevaux en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_wired_fence\":\"Clôture grillagée en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_highley_gate\":\"Grand portillon en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_pyramid_gate\":\"Portillon pyramidal en "+MAJ_MAT.get(nbm)+"\"");
				}
				
				if(!LEAVES.isEmpty())
				{
					buffer.write(",");
					buffer.newLine();
					for(int nbm = 0; nbm<LEAVES.size();nbm++)
					{
						McwAPI.verifJsonLang(buffer, nbm);
						buffer.write("\"block."+CompatModid+"."+LEAVES.get(nbm)+"_hedge\":\"Haie de "+LEAVES_LANG.get(nbm)+"\"");
					}
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
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT)
	{
		File file = new File(McwMain.LOCATION + "Fr_Fr_Stone_Fences.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
			
				buffer.write("{");
				buffer.newLine();
				
				for(int nbm = 0; nbm<MAT_ROCK.size();nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);
					buffer.write("\"block."+CompatModid+".modern_"+MAT_ROCK.get(nbm)+"_wall\": \"Mur moderne en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+".railing_"+MAT_ROCK.get(nbm)+"_wall\": \"Balustrade mur en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_railing_gate\": \"Portail en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_pillar_wall\": \"Mur de piliers en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_grass_topped_wall\": \"Mur en "+MAJ_MAT.get(nbm)+" surmonté d'herbe\"");
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
}