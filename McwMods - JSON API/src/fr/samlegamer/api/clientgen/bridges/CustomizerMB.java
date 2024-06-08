package fr.samlegamer.api.clientgen.bridges;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import fr.samlegamer.utils.APIWriter;

/*
 *  For compatibility that adds several types of wood ex: bop:cherry_bridge & byg:cherry_bridge
 */
public class CustomizerMB
{
	public static class BridgeLog
	{
		public static void createBlockstate(String location, String modid, String blockstateName, String extraNModid)
		{
			File file = new File(location + "/blockstates/" + extraNModid + blockstateName + "_log_bridge_middle" + ".json");
		
		
			APIWriter.write(location, file, "{\"multipart\": [{\r\n"
						+ "      \"when\": { \"OR\": [{ \"facing\": \"north|south\"}]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_base\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"OR\": [{ \"facing\": \"east|west\"}]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_base\", \"y\": 0}},{   \r\n"
						+ "      \"when\": { \"torch\": \"true\" },\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_base_torch\" }},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_right\", \"y\": 0}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_left\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_right\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_left\", \"y\": 0}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_left\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_right\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_left\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_right\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_corner\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_corner\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_corner\"}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_corner\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side\"}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle_end\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle_end\"}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle_end\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle_end\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle\"}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle\"}}]}");
	}
		
		public static void createModelItem(String location, String modid, String mat, String extraNModid)
		{
			File file = new File(location + "/models/item/" + extraNModid + mat + "_log_bridge_middle" + ".json");
			APIWriter.write(location, file, "{\"parent\": \"" + modid + ":block/bridge/bridge_wood/" + mat + "_inventory\"}");
		}
	}
	
	public static class RopeBridge
	{	
		public static void createBlockstate(String location, String modid, String blockstateName, String extraNModid)
		{
			File file = new File(location + "/blockstates/" + "rope_" + extraNModid + blockstateName + "_bridge" + ".json");
	
			APIWriter.write(location, file, "{\r\n"
					+ "  \"multipart\": [\r\n"
					+ "\r\n"
					+ "    {   \"when\": { \"OR\": [\r\n"
					+ "        { \"facing\": \"north|south\"}\r\n"
					+ "        ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_base\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{   \"when\": { \"OR\": [\r\n"
					+ "        { \"facing\": \"east|west\"}\r\n"
					+ "        ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_base\", \"y\": 0}\r\n"
					+ "    },\r\n"
					+ "	\r\n"
					+ "        {   \"when\": { \"torch\": \"true\" },\r\n"
					+ "            \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_base_torch\" }\r\n"
					+ "        },\r\n"
					+ "	\r\n"
					+ "	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_right\", \"y\": 0}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_left\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_right\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_left\", \"y\": 0}\r\n"
					+ "    },\r\n"
					+ "\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_left\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_right\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_left\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_right\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_corner_clear\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_corner_clear\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_corner_clear\"}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_corner_clear\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "		\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side\"} \r\n"
					+ "    },		\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side\", \"y\": 180} \r\n"
					+ "    },	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side\", \"y\": 90} \r\n"
					+ "    },	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side\", \"y\": 270} \r\n"
					+ "    },	\r\n"
					+ "		\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle_end\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle_end\"}\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle_end\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "  	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle_end\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle\"}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle\"}\r\n"
					+ "    }\r\n"
					+ "  ]\r\n"
					+ "}	\r\n"
					+ "");
			
		}
	
		public static void createModelItem(String location, String modid, String mat, String extraNModid)
		{
			File file = new File(location + "/models/item/"  + "rope_" + extraNModid + mat + "_bridge" + ".json");
			APIWriter.write(location, file, "{\"parent\": \"" + modid + ":block/bridge/rope/" + mat + "_inventory\"}");
		}

	}
	
	public static class StairWood
	{
		public static void createBlockstate(String location, String modid, String woodMat, String extraNModid)
		{
			File file = new File(location + "/blockstates/" + extraNModid + woodMat + "_log_bridge_stair" + ".json");
		
			if(!file.exists())
			{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_torch\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_torch\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_torch\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_torch\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"true\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"true\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 270}\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "  ]\r\n"
						+ "}	");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
		
		public static void createModelItem(String location, String modid, String mat, String extraNModid)
		{
			File file = new File(location + "/models/item/" + extraNModid + mat + "_log_bridge_stair" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\":\""+modid+":block/stair/wood/"+mat+"_double\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class StairRope
	{
		public static void createBlockstate(String location, String modid, String woodMat, String extraNModid)
		{
			File file = new File(location + "/blockstates/" + extraNModid + woodMat + "_rope_bridge_stair" + ".json");
		
			if(!file.exists())
			{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_torch\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_torch\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_torch\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_torch\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"true\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"true\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 270}\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}	\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
		
		public static void createModelItem(String location, String modid, String mat, String extraNModid)
		{
			File file = new File(location + "/models/item/" + extraNModid + mat + "_rope_bridge_stair" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/stair/rope/"+mat+"_double\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class PierWood
	{
		public static void createBlockstate(String location, String modid, String woodMat, String extraNModid)
			{
				File file = new File(location + "/blockstates/" + extraNModid + woodMat + "_bridge_pier" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"multipart\": [{ \"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_middle\", \"y\": 90}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_middle\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_corner\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_corner\", \"y\": 90}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_corner\", \"y\": 180}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_corner\", \"y\": 270}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_side\", \"y\": 90}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_side\", \"y\": 180}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_side\", \"y\": 270}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_side\"}}]}");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void createModelItem(String location, String modid, String mat, String extraNModid)
		{
				File file = new File(location + "/models/item/" + extraNModid + mat + "_bridge_pier" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/support_pier/wooden/"+mat+"_pillar_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class BridgeRailWood
	{
		public static void createBlockstate(String location, String modid, String blockstateName, String extraNModid)
		{
			File file = new File(location + "/blockstates/" + extraNModid + blockstateName + "_rail_bridge" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "\r\n"
						+ "    {   \"when\": { \"OR\": [\r\n"
						+ "        { \"facing\": \"north|south\"}\r\n"
						+ "        ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_base\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{   \"when\": { \"OR\": [\r\n"
						+ "        { \"facing\": \"east|west\"}\r\n"
						+ "        ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_base\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_core\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\", \"north_west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\", \"north_east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\", \"south_east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\"}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\", \"south_west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\", \"north_west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\", \"north_east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\", \"south_east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\"}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\", \"south_west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "		\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_side\"} \r\n"
						+ "    },		\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_side\", \"y\": 180} \r\n"
						+ "    },	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_side\", \"y\": 90} \r\n"
						+ "    },	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_side\", \"y\": 270} \r\n"
						+ "    },	\r\n"
						+ "		\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\"}\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "  	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\"}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\"}\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}	\r\n"
						+ "");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
		public static void createModelItem(String location, String modid, String mat, String extraNModid)
		{
			File file = new File(location + "/models/item/" + extraNModid + mat + "_rail_bridge" + ".json");
		
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\":\""+modid+":block/bridge/rail/"+mat+"_inventory\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}