package tutorial.com.felix.tutorial;

import java.util.Random;

/**
 * Created by felix on 10/26/2015.
 */
public class FactsBook {
    private String[] collection = {
            "Ants stretch when they wake up in the morning",
            "Mark Twain didn\\'t graduate from elementary school",
            "Slugs have 4 noses",
            "The state of Florida is bigger than England",
            "More peoples use blue toothbrushes than red one",
            "If you want something done ask someone busy"
    };

    public String getFacts() {
        Random random = new Random();
        int index = random.nextInt(collection.length - 1);

        return collection[index];
    }
}
