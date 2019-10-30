import java.util.ArrayList;
import java.util.Arrays;

class ResistorColorDuo {

    private ArrayList<String> rColors = new ArrayList<String>(Arrays.asList("black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"));

    int value(String[] colors) {
        String dig1Str = Integer.toString(rColors.indexOf(colors[0]));
        String dig2Str = Integer.toString(rColors.indexOf(colors[1]));
        String combined = dig1Str + dig2Str;
        return Integer.parseInt(combined);
    }
}
