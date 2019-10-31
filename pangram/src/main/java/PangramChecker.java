
import java.util.concurrent.ConcurrentSkipListSet;

public class PangramChecker {
    /**
     * Determine if the given string 'input' is a pangram (contains each letter of the alphabet)
     * @param input the string input to test
     * @return boolean determining whether or not the input is a pangram
     **/
    public boolean isPangram(String input) {
        // A set of integers containing our comparison values
        ConcurrentSkipListSet<Integer> prevValidCompVals = new ConcurrentSkipListSet<>();
        for (int i = 0; i < input.length(); ++i) {
            String c = Character.toString(input.charAt(i));
            // Calculate comparison of char at index i to the lowercase letter 'a'
            int curCompVal = c.toLowerCase().compareTo("a");
            // If the comparison value is between 0 and 25, this char is one of the letters of the alphabet
            if (curCompVal >= 0 && curCompVal <= 25) {
                prevValidCompVals.add(curCompVal);
            }
        }
        // returns true if our set is of size 26 (containing only numbers 0 through 25)
        return prevValidCompVals.size() == 26;
    }

}
