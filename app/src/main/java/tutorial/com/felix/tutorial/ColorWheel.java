package tutorial.com.felix.tutorial;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by felix on 10/26/2015.
 */
public class ColorWheel {
    private static String[] primaryCollection = {"#3F51B5", "#E91E63", "#009688", "#FF5722", "#FF9800", "#607D8B", "#795548"};
    private static String[] secondaryCollection = {"#303F9F", "#C2185B", "#00796B", "#E64A19", "#F57C00", "#455A64", "#5D4037"};

    public static Tuple<Integer, Integer> getTupleColor(){
        Random random = new Random();
        int index = random.nextInt(primaryCollection.length-1);
        int primaryColor = Color.parseColor(primaryCollection[index]);
        int secondaryColor = Color.parseColor(secondaryCollection[index]);
        Tuple<Integer, Integer> result = new Tuple<>(primaryColor, secondaryColor);
        return result;
    }
}
