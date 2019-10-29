import java.util.Arrays;

class ReverseString {

    String reverse(String inputString) {
        StringBuilder rev = new StringBuilder();
        int inputLen = inputString.length();
        for (int i = inputLen - 1; i >= 0; --i) {
             int endIndex = inputLen - 1 - i;
             rev.append(inputString.charAt(i));
        }
        return rev.toString();
    }
  
}