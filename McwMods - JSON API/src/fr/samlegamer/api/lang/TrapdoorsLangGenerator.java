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

public class TrapdoorsLangGenerator implements IModFiles.ILang
{
	@Override
	public void initAllWoodEnglish(String CompatModid, List<String> MAT_WOOD, List<String> MAJ_MAT)
	{
		Path file = Path.of(McwMain.LOCATION, "En_Us_Wood_Trapdoors.json");
		
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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_barn_trapdoor\":\""+MAJ_MAT.get(nbm)+" Barn Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_barred_trapdoor\":\""+MAJ_MAT.get(nbm)+" Barred Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_beach_trapdoor\":\""+MAJ_MAT.get(nbm)+" Beach Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_classic_trapdoor\":\""+MAJ_MAT.get(nbm)+" Classic Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_cottage_trapdoor\":\""+MAJ_MAT.get(nbm)+" Cottage Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_four_panel_trapdoor\":\""+MAJ_MAT.get(nbm)+" Four Panel Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_glass_trapdoor\":\""+MAJ_MAT.get(nbm)+" Glass Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_mystic_trapdoor\":\""+MAJ_MAT.get(nbm)+" Mystic Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_paper_trapdoor\":\""+MAJ_MAT.get(nbm)+" Paper Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_tropical_trapdoor\":\""+MAJ_MAT.get(nbm)+" Tropical Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_swamp_trapdoor\":\""+MAJ_MAT.get(nbm)+" Swamp Trapdoor\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bamboo_trapdoor\":\""+MAJ_MAT.get(nbm)+" Mesh Trapdoor\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bark_trapdoor\":\""+MAJ_MAT.get(nbm)+" Bark Trapdoor\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_ranch_trapdoor\":\""+MAJ_MAT.get(nbm)+" Ranch Trapdoor\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_blossom_trapdoor\": \""+MAJ_MAT.get(nbm)+" Waffle Trapdoor\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_barrel_trapdoor\": \""+MAJ_MAT.get(nbm)+" Barrel Trapdoor\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_whispering_trapdoor\": \""+MAJ_MAT.get(nbm)+" Whispering Trapdoor\"");
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
		Path file = Path.of(McwMain.LOCATION, "Fr_Fr_Wood_Trapdoors.json");
		
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
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_barn_trapdoor\":\"Trappe de grange en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_barred_trapdoor\":\"Trappe à barreaux en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_beach_trapdoor\":\"Trappe de plage en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_classic_trapdoor\":\"Trappe classique en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_cottage_trapdoor\":\"Trappe de chalet en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_four_panel_trapdoor\":\"Trappe à quatre panneaux en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_glass_trapdoor\":\"Trappe vitré en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_mystic_trapdoor\":\"Trappe mystique en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_paper_trapdoor\":\"Trappe à papier en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_tropical_trapdoor\":\"Trappe tropicale en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_swamp_trapdoor\":\"Trappe de marécage en "+MAJ_MAT.get(nbm)+"\",\r\n"
							+ "   \"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bamboo_trapdoor\":\"Trappe de maille en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_bark_trapdoor\":\"Trappe écorcer en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_ranch_trapdoor\":\"Trappe de ranch en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_blossom_trapdoor\": \"Trappe gaufrée en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_barrel_trapdoor\": \"Trappe à tonneau en "+MAJ_MAT.get(nbm)+"\",");
					buffer.newLine();
					buffer.write("\"block."+CompatModid+"."+MAT_WOOD.get(nbm)+"_whispering_trapdoor\": \"Trappe pâleuse en "+MAJ_MAT.get(nbm)+"\"");
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
	public void initAllStoneEnglish(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT) {
	}

	@Override
	public void initAllStoneFrench(String CompatModid, List<String> MAT_ROCK, List<String> MAJ_MAT) {
	}
}