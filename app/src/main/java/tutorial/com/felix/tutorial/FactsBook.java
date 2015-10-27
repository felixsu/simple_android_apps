package tutorial.com.felix.tutorial;

import java.util.Random;

/**
 * Created by felix on 10/26/2015.
 */
public class FactsBook {
    private static String[] collection = {
            "Ants stretch when they wake up in the morning",
            "Mark Twain didn\'t graduate from elementary school",
            "Slugs have 4 noses",
            "The state of Florida is bigger than England",
            "More peoples use blue toothbrushes than red one",
            "If you want something done ask someone busy",
            "In Japan, Ronald McDonald is called Donald McDonald due to a lack of a clear \"r\" sound in Japanese",
            "\"Fart Battles\" were a popular art scrolls created in Japan during the Edo period",
            "51% Of People Think Stormy Weather Affects Cloud Computing",
            "7% of religious Americans pray to God about finding a good parking spot",
            "If you have a pizza with radius Z and thickness A, its volume is = Pi*Z*Z*A",
            "Ronaldinho's deal with Coca-Cola ended after he was caught sipping a Pepsi in a news conference"
    };

    public static String getFacts() {
        Random random = new Random();
        int index = random.nextInt(collection.length - 1);

        return collection[index];
    }
}
