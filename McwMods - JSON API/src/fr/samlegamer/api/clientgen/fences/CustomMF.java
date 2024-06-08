package fr.samlegamer.api.clientgen.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.samlegamer.utils.APIWriter;

public class CustomMF
{
	public static class HighleyGate
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
		File p1 = new File(location + "/models/block/highley_gate/" + nameMaterial + "_highley_gate" + ".json");
		File p2 = new File(location + "/models/block/highley_gate/" + nameMaterial + "_highley_gate_open" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/highley_gate\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!p2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p2);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/highley_gate_open\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
				
				buffer.close();
				writer.close();
				p2.createNewFile();
				System.out.println("Le fichier " + p2 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	}
	
	public static class HorseFence
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/horse/" + nameMaterial + "_horse_fence_side" + ".json");
			File p2 = new File(location + "/models/block/horse/" + nameMaterial + "_log_fence_post" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/horse_fence_side\",\r\n"
						+ "\"textures\":{\"texture\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
						+ "\"1_texture\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!p2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p2);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/log_fence_post\",\r\n"
						+ "\"textures\":{\"5\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
				
				buffer.close();
				writer.close();
				p2.createNewFile();
				System.out.println("Le fichier " + p2 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	}
	
	public static class PicketFence
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/picket/" + nameMaterial + "_picket_fence_side" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/picket_fence_side\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	}

	public static class StockadeFence
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/stockade/" + nameMaterial + "_stockade_fence_side" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/stockade_fence_side\",\r\n"
						+ "\"textures\":{\"4\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
						+ "\"5\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	}
	
	public static class WiredFence
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/wired/" + nameMaterial + "_wired_fence_post" + ".json");
			File p2 = new File(location + "/models/block/wired/" + nameMaterial + "_wired_fence_side" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/wired_fence_post\",\r\n"
						+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"_top\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!p2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p2);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/wired_fence_side\",\r\n"
						+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"_top\",\r\n"
						+ "\"4\": \"mcwfences:block/wire_fence\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
						+ "\"1_texture\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
				
				buffer.close();
				writer.close();
				p2.createNewFile();
				System.out.println("Le fichier " + p2 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	}
	
	public static class PyramidGate
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/pyramid_gate/" + nameMaterial + "_pyramid_gate" + ".json");
			File p2 = new File(location + "/models/block/pyramid_gate/" + nameMaterial + "_pyramid_gate_open" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/pyramid_gate\",\r\n"
						+ "\"textures\":{\"3\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
						+ "\"6\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!p2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p2);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/pyramid_gate_open\",\r\n"
						+ "\"textures\":{\"3\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
						+ "\"6\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\"}}");
				
				buffer.close();
				writer.close();
				p2.createNewFile();
				System.out.println("Le fichier " + p2 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	}

	public static class Inventory
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String nameOfTexturesPlanks, String nameOfTexturesLogs)
		{
			File p1 = new File(location + "/models/block/inventory/" + nameMaterial + "_highley_gate" + ".json");
			File p2 = new File(location + "/models/block/inventory/" + nameMaterial + "_horse_fence" + ".json");
			File p3 = new File(location + "/models/block/inventory/" + nameMaterial + "_picket_fence" + ".json");
			File p4 = new File(location + "/models/block/inventory/" + nameMaterial + "_stockade_fence" + ".json");
			File p5 = new File(location + "/models/block/inventory/" + nameMaterial + "_wired_fence" + ".json");

			APIWriter.write(location, p1, "{\"parent\":\"mcwfences:block/parent/inventory/highley_gate\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameOfTexturesPlanks+"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
						+ "\"1_texture\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
			
			APIWriter.write(location, p2, "{\"parent\":\"mcwfences:block/parent/inventory/horse_fence\",\r\n"
					+ "\"textures\":{\"1_texture\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\",\r\n"
					+ "\"1_1_texture\": \""+TextureLocationFormodid+"/stripped_"+ nameOfTexturesLogs +"\",\r\n"
					+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
					+ "\"wall\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
			
			APIWriter.write(location, p3, "{\"parent\": \"mcwfences:block/parent/inventory/picket_fence\",\r\n"
					+ "\"textures\":{\"5\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
					+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"}}");
			
			APIWriter.write(location, p4, "{\"parent\": \"mcwfences:block/parent/inventory/stockade_fence\",\r\n"
					+ "\"textures\":{\"5\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\",\r\n"
					+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameOfTexturesPlanks +"\"}}");

			APIWriter.write(location, p5, "{\"parent\": \"mcwfences:block/parent/inventory/wired_fence\",\r\n"
					+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"_top\",\r\n"
					+ "\"4\": \"mcwfences:block/wire_fence\",\r\n"
					+ "\"1_texture\": \""+TextureLocationFormodid+"/"+ nameOfTexturesLogs +"\"}}");
		}
	}
}