package fr.samlegamer;

import java.util.ArrayList;

import fr.samlegamer.netherupdate.SpartanWeaponry;
import fr.samlegamer.utils.JsonGenerator;

@JsonGenerator(name = "Spartan Weaponry - JSON API", version = "alpha-0.0.1")
public class Main
{
	public static final ArrayList<String> MATERIAL = new ArrayList<>();
	public static final ArrayList<String> MATLANG = new ArrayList<>();
	
	public static final String modid = "heartofspartan";
	public static final String location = "C://Users/Samle/OneDrive/Images/Captures d��cran/models/";
	
	public static void main(String[] jvm)
	{
		registerMaterial();
		registerforLang();
		initModels(MATERIAL);
	}
	
	public static void registerMaterial()
	{
		MATERIAL.add("azurium");
		MATERIAL.add("milathium");
	}
	
	public static void registerforLang()
	{
		MATLANG.add("Azurium");
		MATLANG.add("Milathium");
	}
	
	public static void initModels(ArrayList<String> list)
	{
		for(String i : list)
		{
			SpartanWeaponry.battleaxe(location, modid, i);
			SpartanWeaponry.boomerang(location, modid, i);	
			SpartanWeaponry.dagger(location, modid, i);	
			SpartanWeaponry.flangedmace(location, modid, i);	
			SpartanWeaponry.glaive(location, modid, i);	
			SpartanWeaponry.greatsword(location, modid, i);	
			SpartanWeaponry.halberd(location, modid, i);	
			SpartanWeaponry.hammer(location, modid, i);	
			SpartanWeaponry.heavycrossbow(location, modid, i);	
			SpartanWeaponry.javelin(location, modid, i);	
			SpartanWeaponry.katana(location, modid, i);	
			SpartanWeaponry.lance(location, modid, i);	
			SpartanWeaponry.longbow(location, modid, i);	
			SpartanWeaponry.pike(location, modid, i);	
			SpartanWeaponry.quarterstaff(location, modid, i);	
			SpartanWeaponry.rapier(location, modid, i);	
			SpartanWeaponry.saber(location, modid, i);	
			SpartanWeaponry.spear(location, modid, i);
			SpartanWeaponry.throwingknife(location, modid, i);
			SpartanWeaponry.tomahawk(location, modid, i);
			SpartanWeaponry.warhammer(location, modid, i);
		}
	}
}