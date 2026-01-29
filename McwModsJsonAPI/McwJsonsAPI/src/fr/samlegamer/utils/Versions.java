package fr.samlegamer.utils;

public enum Versions
{
    NONE(""), CAVEANDCLIFFS("CaveAndCliff"), THEWILDUPDATE("Warden"), TRAILSANDTALES("Sniffer"),
    TRICKYTRIALS("Breeze"), COPPERAGE("CopperGolem");
    private final String name;

    Versions(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
