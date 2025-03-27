package fr.samlegamer.api.datagen;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class McwTags
{
    private final String READER;

    public McwTags(String READER)
    {
        this.READER = READER;
    }

    public void axe(String LOCATION, String CompatModid, List<String> ID_WOOD, List<String> modidCharged)
    {
        Path file = Paths.get(LOCATION, "axe.json");

    }

    public void hoe(String LOCATION, String CompatModid, List<String> ID_LEAVE, List<String> modidCharged)
    {
        Path file = Paths.get(LOCATION, "hoe.json");

    }

    public void pickaxe(String LOCATION, String CompatModid, List<String> ID_ROCK, List<String> modidCharged)
    {
        Path file = Paths.get(LOCATION, "pickaxe.json");

    }
}
