package fr.samlegamer.utils;

import java.io.File;

public enum ClassicFolderTypes
	{
		TAGS_BLOCK_MINEABLE("data"+File.separator+"tags"+File.separator+"block"+File.separator+"mineable"+File.separator),
		TAGS_BLOCK("data"+File.separator+"tags"+File.separator+"blocks"+File.separator),
		TAGS_ITEM("data"+File.separator+"tags"+File.separator+"items"+File.separator),
		RECIPE("data"+File.separator+"recipes"+File.separator), 
		ADVANCEMENT_RECIPE("data"+File.separator+"advancements"+File.separator+"recipes"+File.separator), 
		LOOT_TABLES("data"+File.separator+"loot_tables"+File.separator+"blocks"+File.separator),
		BLOCKSTATES("blockstates"+File.separator),
		MODELS("models"+File.separator),
		MODEL_BLOCK("models"+File.separator+"block"+File.separator),
		MODEL_ITEM("models"+File.separator+"item"+File.separator);
		private String path;
		private ClassicFolderTypes(String path)
		{
			this.path = path;
		}
		
		public String getPath() {
			return path;
		}
	}