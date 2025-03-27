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

@Deprecated(forRemoval = true)
public class PathsLangGenerator  implements IModFiles.ILang
{
	@Override
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{
		Path file = Path.of(McwMain.LOCATION, "En_Us_Wood_Paths.json");

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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_path\": \""+MAJ_MAT.get(nbm)+" Planks Path\"");
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
		Path file = Path.of(McwMain.LOCATION, "Fr_Fr_Wood_Paths.json");

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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_planks_path\": \"Chemin en planches de "+MAJ_MAT.get(nbm)+"\"");
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
	public void initAllStoneEnglish(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT)
	{
		Path file = Path.of(McwMain.LOCATION, "En_Us_Stone_Paths.json");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{");
				buffer.newLine();

				for(int nbm = 0;nbm<MAT_ROCK.size();nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);					
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_diamond_paving\": \""+MAJ_MAT.get(nbm)+" Diamond Paving\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_basket_weave_paving\": \""+MAJ_MAT.get(nbm)+" Basket Weave Paving\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_square_paving\": \""+MAJ_MAT.get(nbm)+" Square Paving\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_honeycomb_paving\": \""+MAJ_MAT.get(nbm)+" Honeycomb Paving\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_clover_paving\": \""+MAJ_MAT.get(nbm)+" Clover Paving\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_dumble_paving\": \""+MAJ_MAT.get(nbm)+" Dumble Paving\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_running_bond\": \""+MAJ_MAT.get(nbm)+" Running Bond\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_running_bond_slab\": \""+MAJ_MAT.get(nbm)+" Running Bond Slab\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_running_bond_path\": \""+MAJ_MAT.get(nbm)+" Running Bond Path\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_strewn_rocky_path\": \""+MAJ_MAT.get(nbm)+" Strewn Rocky Path\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_windmill_weave_path\": \""+MAJ_MAT.get(nbm)+" Windmill Weave Path\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_windmill_weave_slab\": \""+MAJ_MAT.get(nbm)+" Windmill Weave Slab\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_windmill_weave\": \""+MAJ_MAT.get(nbm)+" Windmill Weave\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_flagstone_path\": \""+MAJ_MAT.get(nbm)+" Flagstone Path\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_flagstone_slab\": \""+MAJ_MAT.get(nbm)+" Flagstone Slab\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_flagstone\": \""+MAJ_MAT.get(nbm)+" Flagstone\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_crystal_floor_path\": \""+MAJ_MAT.get(nbm)+" Crystal Floor Path\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_crystal_floor_slab\": \""+MAJ_MAT.get(nbm)+" Crystal Floor Slab\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_crystal_floor\": \""+MAJ_MAT.get(nbm)+" Crystal Floor\"");
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
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT)
	{
		Path file = Path.of(McwMain.LOCATION, "Fr_Fr_Stone_Paths.json");

		if(!Files.exists(file))
		{
			try
			{
				BufferedWriter buffer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
				
				buffer.write("{");
				buffer.newLine();

				for(int nbm = 0;nbm<MAT_ROCK.size();nbm++)
				{
					McwAPI.verifJsonLang(buffer, nbm);					
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_diamond_paving\": \"Pavés losanges en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_basket_weave_paving\": \"Pavés en "+MAJ_MAT.get(nbm)+" tressé\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_square_paving\": \"Pavés carrés en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_honeycomb_paving\": \"Pavés de rayon de miel en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_clover_paving\": \"Pavés trèfleux en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_dumble_paving\": \"Pavés osseux en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_running_bond\": \"Pavés briqueux en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_running_bond_slab\": \"Dalle briqueux en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_running_bond_path\": \"Chemin briqueux en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_strewn_rocky_path\": \"Chemin rocheux strié en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_windmill_weave_path\": \"Chemin de courtepointe tissé en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_windmill_weave_slab\": \"Dalle de courtepointe tissé en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_windmill_weave\": \"Courtepointe tissé en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_flagstone_path\": \"Chemin en pavés de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_flagstone_slab\": \"Dalle en pavés de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_flagstone\": \"Pavés de "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_crystal_floor_path\": \"Chemin ronds en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_crystal_floor_slab\": \"Dalle de rondeur en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_ROCK.get(nbm)+"_crystal_floor\": \"Bloc de rondeur en "+MAJ_MAT.get(nbm)+"\"");
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
}