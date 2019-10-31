import java.util.ArrayList;
import java.util.Arrays;

public class PangramChecker {
//    ArrayList<String> alphabet = new ArrayList<>(Arrays.asList(
//            "a", "b", "c", "d", "e", "f", "g", "", "", "", "", "", ""
//            ));


    /**
     * Determine if the given string 'input' is a pangram (contains each letter of the alphabet)
     * @param input the string input to test
     * @return boolean determining whether or not the input is a pangram
     **/
    public boolean isPangram(String input) {
        test();
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    private void test() {
        System.out.println("a".compareTo("z"));
        System.out.println("z".compareTo("a"));
        System.out.println("a".compareTo("a"));
        System.out.println("1".compareTo("a"));
    }

}
