package fr.samlegamer.api.clientgen.roofs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MRCustom
{	
	public static class Log_Attic_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File roof_closed = new File(Location + "/models/block/attic/" + material + "_attic_roof_closed" + ".json");
			File roof_open = new File(Location + "/models/block/attic/" + material + "_attic_roof_open" + ".json");
			
			if(!roof_open.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_open);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/attic_roof_open\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "		\"3\": \"minecraft:block/glass\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"     \r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_open.createNewFile();
					System.out.println("Le fichier " + roof_open + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!roof_closed.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_closed);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/attic_roof_closed\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs + "\",\r\n"
							+ "		\"3\": \"minecraft:block/glass\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs + "\"      \r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_closed.createNewFile();
					System.out.println("Le fichier " + roof_closed + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Planks_Attic_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File roof_open = new File(Location + "/models/block/attic/" + material + "_planks_attic_roof_open" + ".json");
			File roof_closed = new File(Location + "/models/block/attic/" + material + "_planks_attic_roof_closed" + ".json");

			if(!roof_open.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_open);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/attic_roof_open\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"3\": \"minecraft:block/glass\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"     \r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_open.createNewFile();
					System.out.println("Le fichier " + roof_open + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!roof_closed.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_closed);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/attic_roof_closed\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"3\": \"minecraft:block/glass\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"      \r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_closed.createNewFile();
					System.out.println("Le fichier " + roof_closed + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Log_Lower_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File f1 = new File(Location + "/models/block/lower/" + material + "_lower" + ".json");
			File f2 = new File(Location + "/models/block/lower/" + material + "_lower_inner" + ".json");
			File f3 = new File(Location + "/models/block/lower/" + material + "_lower_outer" + ".json");
			File f4 = new File(Location + "/models/block/lower/" + material + "_upper_lower" + ".json");
			File f5 = new File(Location + "/models/block/lower/" + material + "_upper_lower_inner" + ".json");
			File f6 = new File(Location + "/models/block/lower/" + material + "_upper_lower_outer" + ".json");

			if(!f1.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f1);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"}}");
					buffer.close();
					writer.close();
					f1.createNewFile();
					System.out.println("Le fichier " + f1 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f2.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f2);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
					buffer.close();
					writer.close();
					f2.createNewFile();
					System.out.println("Le fichier " + f2 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f3.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f3);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
					buffer.close();
					writer.close();
					f3.createNewFile();
					System.out.println("Le fichier " + f3 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f4.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f4);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_lower\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					buffer.close();
					writer.close();
					f4.createNewFile();
					System.out.println("Le fichier " + f4 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f5.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f5);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_lower_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					buffer.close();
					writer.close();
					f5.createNewFile();
					System.out.println("Le fichier " + f5 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f6.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f6);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
					buffer.close();
					writer.close();
					f6.createNewFile();
					System.out.println("Le fichier " + f6 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
	
	public static class Planks_Lower_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File f1 = new File(Location + "/models/block/lower/" + material + "_planks_lower" + ".json");
			File f2 = new File(Location + "/models/block/lower/" + material + "_planks_lower_inner" + ".json");
			File f3 = new File(Location + "/models/block/lower/" + material + "_planks_lower_outer" + ".json");
			File f4 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower" + ".json");
			File f5 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower_inner" + ".json");
			File f6 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower_outer" + ".json");

			if(!f1.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f1);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesPlanks + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/" + nameOfTexturesPlanks + "\"}}");
					buffer.close();
					writer.close();
					f1.createNewFile();
					System.out.println("Le fichier " + f1 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f2.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f2);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks + "\"}}");
					buffer.close();
					writer.close();
					f2.createNewFile();
					System.out.println("Le fichier " + f2 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f3.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f3);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"}}");
					buffer.close();
					writer.close();
					f3.createNewFile();
					System.out.println("Le fichier " + f3 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f4.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f4);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"}}");
					buffer.close();
					writer.close();
					f4.createNewFile();
					System.out.println("Le fichier " + f4 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f5.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f5);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"}}");
					buffer.close();
					writer.close();
					f5.createNewFile();
					System.out.println("Le fichier " + f5 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f6.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f6);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"}}");
					buffer.close();
					writer.close();
					f6.createNewFile();
					System.out.println("Le fichier " + f6 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Log_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File roof = new File(Location + "/models/block/roof/" + material + "_roof" + ".json");
			File roof_inner = new File(Location + "/models/block/roof/" + material + "_roof_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/roof/" + material + "_roof_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"4\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + nameOfTexturesLogs + "\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class Planks_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File roof = new File(Location + "/models/block/roof/" + material + "_planks_roof" + ".json");
			File roof_inner = new File(Location + "/models/block/roof/" + material + "_planks_roof_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/roof/" + material + "_planks_roof_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
	
	public static class Log_Steep_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File roof = new File(Location + "/models/block/steep/" + material + "_steep" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_steep_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_steep_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Planks_Steep_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File roof = new File(Location + "/models/block/steep/" + material + "_planks_steep" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_planks_steep_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_planks_steep_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Log_Top_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File four_way_roof = new File(Location + "/models/block/top/" + material + "_four_way_roof" + ".json");
			File three_way_roof = new File(Location + "/models/block/top/" + material + "_three_way_roof" + ".json");
			File top_inner = new File(Location + "/models/block/top/" + material + "_top_inner" + ".json");
			File top_outer = new File(Location + "/models/block/top/" + material + "_top_outer" + ".json");
			File top_pyramid = new File(Location + "/models/block/top/" + material + "_top_pyramid" + ".json");
			File top_roof = new File(Location + "/models/block/top/" + material + "_top_roof" + ".json");
			File top_roof_end = new File(Location + "/models/block/top/" + material + "_top_roof_end" + ".json");
			
			if(!top_roof_end.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_roof_end);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof_end\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_roof_end.createNewFile();
					System.out.println("Le fichier " + top_roof_end + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_roof.createNewFile();
					System.out.println("Le fichier " + top_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_pyramid.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_pyramid);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_pyramid\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_pyramid.createNewFile();
					System.out.println("Le fichier " + top_pyramid + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_outer.createNewFile();
					System.out.println("Le fichier " + top_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_inner.createNewFile();
					System.out.println("Le fichier " + top_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!four_way_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(four_way_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/four_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					four_way_roof.createNewFile();
					System.out.println("Le fichier " + four_way_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!three_way_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(three_way_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/three_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					three_way_roof.createNewFile();
					System.out.println("Le fichier " + three_way_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
	
	public static class Planks_Top_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File four_way_roof = new File(Location + "/models/block/top/" + material + "_planks_four_way_roof" + ".json");
			File three_way_roof = new File(Location + "/models/block/top/" + material + "_planks_three_way_roof" + ".json");
			File top_inner = new File(Location + "/models/block/top/" + material + "_planks_top_inner" + ".json");
			File top_outer = new File(Location + "/models/block/top/" + material + "_planks_top_outer" + ".json");
			File top_pyramid = new File(Location + "/models/block/top/" + material + "_planks_top_pyramid" + ".json");
			File top_roof = new File(Location + "/models/block/top/" + material + "_planks_top_roof" + ".json");
			File top_roof_end = new File(Location + "/models/block/top/" + material + "_planks_top_roof_end" + ".json");
			
			if(!top_roof_end.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_roof_end);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof_end\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_roof_end.createNewFile();
					System.out.println("Le fichier " + top_roof_end + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_roof.createNewFile();
					System.out.println("Le fichier " + top_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_pyramid.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_pyramid);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_pyramid\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_pyramid.createNewFile();
					System.out.println("Le fichier " + top_pyramid + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_outer.createNewFile();
					System.out.println("Le fichier " + top_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_inner.createNewFile();
					System.out.println("Le fichier " + top_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!four_way_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(four_way_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/four_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					four_way_roof.createNewFile();
					System.out.println("Le fichier " + four_way_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!three_way_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(three_way_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/three_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					three_way_roof.createNewFile();
					System.out.println("Le fichier " + three_way_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class UpperLog_Steep_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File roof = new File(Location + "/models/block/steep/" + material + "_upper_steep" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_upper_steep_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_upper_steep_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class UpperPlanks_Steep_Roof
	{	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File roof = new File(Location + "/models/block/steep/" + material + "_planks_upper_steep" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_planks_upper_steep_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_planks_upper_steep_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

}