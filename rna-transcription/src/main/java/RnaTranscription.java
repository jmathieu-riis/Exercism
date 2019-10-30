import java.util.ArrayList;
import java.util.Arrays;

class RnaTranscription {

    private ArrayList<String> dnaIndices = new ArrayList<>(Arrays.asList("G", "C", "T", "A"));
    private ArrayList<String> rnaIndices = new ArrayList<>(Arrays.asList("C", "G", "A", "U"));

    /**
     * Convert the given string to a string array of each character in the string s
     **/
    private String[] stringToStringArray(String s) {
        char[] charArray = s.toCharArray();
        String[] stringArray = new String[charArray.length];
        int i = 0;
        for (char c : charArray) {
            stringArray[i] = Character.toString(c);
            ++i;
        }
        return stringArray;
    }

    /**
     * Convert given DNA sequence to an RNA sequence
     **/
    String transcribe(String dnaStrand) {
        String[] dnaStrandArr = stringToStringArray(dnaStrand);
        StringBuilder rnaStrand = new StringBuilder();
        for (String dnaLetter : dnaStrandArr) {
            int dnaIndex = dnaIndices.indexOf(dnaLetter);
            rnaStrand.append(rnaIndices.get(dnaIndex));
        }
        return rnaStrand.toString();
    }

}
