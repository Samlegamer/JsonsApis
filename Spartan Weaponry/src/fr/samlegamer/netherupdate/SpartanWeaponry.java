package fr.samlegamer.netherupdate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SpartanWeaponry
{
	public static void battleaxe(String location, String modid, String mat)
	{
		File file = new File(location + "battleaxe_" + mat + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\"spartanweaponry:item/battleaxe_wood\",\r\n"
						+ "\"textures\":{\"layer0\":\""+modid+":items/battleaxe_"+mat+"\"}}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void boomerang(String location, String modid, String mat)
	{
		File file = new File(location + "boomerang_" + mat + ".json");
		File trowing = new File(location + "boomerang_" + mat + "_throwing" + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \"spartanweaponry:item/boomerang_base\",\r\n"
						+ "\"textures\":{\"layer0\": \""+modid+":items/boomerang_"+mat+"\"},\r\n"
						+ "\"overrides\":[{\"predicate\":{\"throwing\": 1},\r\n"
						+ "\"model\": \""+modid+":item/boomerang_"+mat+"_throwing\"}]}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!trowing.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(trowing);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \"spartanweaponry:item/boomerang_wood_throwing\",\r\n"
						+ "\"textures\":{\"layer0\": \""+modid+":items/boomerang_"+mat+"\"}}");
				
				
				buffer.close();
				writer.close();
				trowing.createNewFile();
				System.out.println("The File " + trowing + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void dagger(String location, String modid, String mat)
	{
		File file = new File(location + "dagger_" + mat + ".json");
		File trowing = new File(location + "dagger_" + mat + "_throwing" + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\"spartanweaponry:item/dagger_wood\",\r\n"
						+ "\"textures\":{\"layer0\":\""+modid+":items/dagger_"+mat+"\"},\r\n"
						+ "\"overrides\":[{\"predicate\":{\"throwing\": 1},\r\n"
						+ "\"model\": \""+modid+":item/dagger_"+mat+"_throwing\"}]}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!trowing.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(trowing);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\"spartanweaponry:item/dagger_wood_throwing\",\r\n"
						+ "\"textures\":{\"layer0\":\""+modid+":items/dagger_"+mat+"\"}}");
				
				buffer.close();
				writer.close();
				trowing.createNewFile();
				System.out.println("The File " + trowing + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void flangedmace(String location, String modid, String mat)
	{
		File file = new File(location + "flanged_mace_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\"spartanweaponry:item/flanged_mace_wood\",\r\n"
						+ "\"textures\":{\"layer0\":\""+modid+":items/flanged_mace_"+mat+"\"}}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void glaive(String location, String modid, String mat)
	{
		File file = new File(location + "glaive_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\"spartanweaponry:item/glaive_wood\",\r\n"
						+ "\"textures\":{\"layer0\":\""+modid+":items/glaive_"+mat+"\"}}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void greatsword(String location, String modid, String mat)
	{
		File file = new File(location + "greatsword_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\"spartanweaponry:item/greatsword_wood\",\r\n"
						+ "\"textures\":{\"layer0\":\""+modid+":items/greatsword_"+mat+"\"}}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void halberd(String location, String modid, String mat)
	{
		File file = new File(location + "halberd_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\"spartanweaponry:item/halberd_wood\",\r\n"
						+ "\"textures\":{\"layer0\":\""+modid+":items/halberd_"+mat+"\"}}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void hammer(String location, String modid, String mat)
	{
		File file = new File(location + "hammer_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\"spartanweaponry:item/hammer_wood\",\r\n"
						+ "\"textures\":{\"layer0\":\""+modid+":items/hammer_"+mat+"\"}}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void heavycrossbow(String location, String modid, String mat)
	{
		File file = new File(location + "heavy_crossbow_" + mat + ".json");
		File file2 = new File(location + "heavy_crossbow_" + mat + "_firing.json");
		File file3 = new File(location + "heavy_crossbow_" + mat + "_loaded.json");
		File file4 = new File(location + "heavy_crossbow_" + mat + "_pulling_0.json");
		File file5 = new File(location + "heavy_crossbow_" + mat + "_pulling_1.json");
		File file6 = new File(location + "heavy_crossbow_" + mat + "_pulling_2.json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/heavy_crossbow_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/heavy_crossbow_"+mat+"_standby\"\r\n"
						+ "    },\r\n"
						+ "    \"overrides\": [\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"pulling\": 1\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/heavy_crossbow_"+mat+"_pulling_0\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"pulling\": 1,\r\n"
						+ "                \"pull\": 0.65\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/heavy_crossbow_"+mat+"_pulling_1\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"pulling\": 1,\r\n"
						+ "                \"pull\": 0.9\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/heavy_crossbow_"+mat+"_pulling_2\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"charged\": 1\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/heavy_crossbow_"+mat+"_loaded\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"pulling\": 1,\r\n"
						+ "                \"charged\": 1\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/heavy_crossbow_"+mat+"_firing\"\r\n"
						+ "        }\r\n"
						+ "    ]\r\n"
						+ "}\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!file2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file2);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/heavy_crossbow_wood_firing\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/heavy_crossbow_"+mat+"_loaded\"\r\n"
						+ "    }\r\n"
						+ "}\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				file2.createNewFile();
				System.out.println("The File " + file2 + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!file3.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file3);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/heavy_crossbow_wood_loaded\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/heavy_crossbow_"+mat+"_loaded\"\r\n"
						+ "    }\r\n"
						+ "}\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				file3.createNewFile();
				System.out.println("The File " + file3 + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!file4.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file4);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/heavy_crossbow_wood_pulling_0\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/heavy_crossbow_"+mat+"_pulling_0\"\r\n"
						+ "    }\r\n"
						+ "}\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				file4.createNewFile();
				System.out.println("The File " + file4 + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!file5.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file5);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/heavy_crossbow_wood_pulling_0\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/heavy_crossbow_"+mat+"_pulling_1\"\r\n"
						+ "    }\r\n"
						+ "}\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				file5.createNewFile();
				System.out.println("The File " + file5 + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!file6.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file6);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/heavy_crossbow_wood_pulling_0\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/heavy_crossbow_"+mat+"_pulling_2\"\r\n"
						+ "    }\r\n"
						+ "}\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				file6.createNewFile();
				System.out.println("The File " + file6 + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void javelin(String location, String modid, String mat)
	{
		File file = new File(location + "javelin_" + mat + ".json");
		File fileT = new File(location + "javelin_" + mat + "_throwing.json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/javelin_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/javelin_"+mat+"\"\r\n"
						+ "    },\r\n"
						+ "    \"overrides\": [\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"throwing\": 1\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/javelin_"+mat+"_throwing\"\r\n"
						+ "        }\r\n"
						+ "    ]\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!fileT.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(fileT);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/javelin_wood_throwing\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/javelin_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				fileT.createNewFile();
				System.out.println("The File " + fileT + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void katana(String location, String modid, String mat)
	{
		File file = new File(location + "katana_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/katana_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/katana_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void lance(String location, String modid, String mat)
	{
		File file = new File(location + "lance_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/lance_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/lance_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void longbow(String location, String modid, String mat)
	{
		File file = new File(location + "longbow_" + mat + ".json");
		File file2 = new File(location + "longbow_" + mat + "_pulling_0.json");
		File file3 = new File(location + "longbow_" + mat + "_pulling_1.json");
		File file4 = new File(location + "longbow_" + mat + "_pulling_2.json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"item/generated\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/longbow_"+mat+"_standby\"\r\n"
						+ "    },\r\n"
						+ "    \"display\": {\r\n"
						+ "        \"thirdperson_righthand\": {\r\n"
						+ "            \"rotation\": [ -80, 260, -40 ],\r\n"
						+ "            \"translation\": [ -1, -2, 5.25 ],\r\n"
						+ "            \"scale\": [ 1.2, 1.2, 1.2 ]\r\n"
						+ "        },\r\n"
						+ "        \"thirdperson_lefthand\": {\r\n"
						+ "            \"rotation\": [ -80, -280, 40 ],\r\n"
						+ "            \"translation\": [ -1, -2, 5.25 ],\r\n"
						+ "            \"scale\": [ 1.2, 1.2, 1.2 ]\r\n"
						+ "        },\r\n"
						+ "        \"firstperson_righthand\": {\r\n"
						+ "            \"rotation\": [ 0, -90, 25 ],\r\n"
						+ "            \"translation\": [ 1.13, 3.2, 1.13],\r\n"
						+ "            \"scale\": [ 0.90, 0.90, 0.90 ]\r\n"
						+ "        },\r\n"
						+ "        \"firstperson_lefthand\": {\r\n"
						+ "            \"rotation\": [ 0, 90, -25 ],\r\n"
						+ "            \"translation\": [ 1.13, 3.2, 1.13],\r\n"
						+ "            \"scale\": [ 0.90, 0.90, 0.90 ]\r\n"
						+ "        }\r\n"
						+ "    },\r\n"
						+ "    \"overrides\": [\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"pulling\": 1\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/longbow_"+mat+"_pulling_0\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"pulling\": 1,\r\n"
						+ "                \"pull\": 0.65\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/longbow_"+mat+"_pulling_1\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"pulling\": 1,\r\n"
						+ "                \"pull\": 0.9\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/longbow_"+mat+"_pulling_2\"\r\n"
						+ "        }\r\n"
						+ "    ]\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!file2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file2);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/longbow_wood_pulling_0\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/longbow_"+mat+"_pulling_0\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file2.createNewFile();
				System.out.println("The File " + file2 + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!file3.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file3);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/longbow_wood_pulling_1\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/longbow_"+mat+"_pulling_1\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file3.createNewFile();
				System.out.println("The File " + file3 + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if(!file4.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file4);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/longbow_wood_pulling_2\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/longbow_"+mat+"_pulling_2\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file4.createNewFile();
				System.out.println("The File " + file4 + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void pike(String location, String modid, String mat)
	{
		File file = new File(location + "pike_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/pike_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/pike_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void quarterstaff(String location, String modid, String mat)
	{
		File file = new File(location + "quarterstaff_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/quarterstaff_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/quarterstaff_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void rapier(String location, String modid, String mat)
	{
		File file = new File(location + "rapier_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/rapier_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/rapier_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void saber(String location, String modid, String mat)
	{
		File file = new File(location + "saber_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/saber_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/saber_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void spear(String location, String modid, String mat)
	{
		File file = new File(location + "spear_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/spear_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/spear_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void throwingknife(String location, String modid, String mat)
	{
		File file = new File(location + "throwing_knife_" + mat + ".json");
		File fileT = new File(location + "throwing_knife_" + mat + "_throwing.json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/throwing_knife_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/throwing_knife_"+mat+"\"\r\n"
						+ "    },\r\n"
						+ "    \"overrides\": [\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"throwing\": 1\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/throwing_knife_"+mat+"_throwing\"\r\n"
						+ "        }\r\n"
						+ "    ]\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!fileT.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(fileT);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/throwing_knife_wood_throwing\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/throwing_knife_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				fileT.createNewFile();
				System.out.println("The File " + fileT + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void tomahawk(String location, String modid, String mat)
	{
		File file = new File(location + "tomahawk_" + mat + ".json");
		File fileT = new File(location + "tomahawk_" + mat + "_throwing.json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/tomahawk_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/tomahawk_"+mat+"\"\r\n"
						+ "    },\r\n"
						+ "    \"overrides\": [\r\n"
						+ "        {\r\n"
						+ "            \"predicate\": {\r\n"
						+ "                \"throwing\": 1\r\n"
						+ "            },\r\n"
						+ "            \"model\": \""+modid+":item/tomahawk_"+mat+"_throwing\"\r\n"
						+ "        }\r\n"
						+ "    ]\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!fileT.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(fileT);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"spartanweaponry:item/tomahawk_wood_throwing\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\": \""+modid+":items/tomahawk_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				fileT.createNewFile();
				System.out.println("The File " + fileT + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void warhammer(String location, String modid, String mat)
	{
		File file = new File(location + "warhammer_" + mat + ".json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\":\"spartanweaponry:item/warhammer_wood\",\r\n"
						+ "    \"textures\": {\r\n"
						+ "        \"layer0\":\""+modid+":items/warhammer_"+mat+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("The File " + file + " is generated in : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}