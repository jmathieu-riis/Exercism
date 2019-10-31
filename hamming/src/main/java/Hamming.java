class Hamming {

    private char[] lStrand;
    private char[] rStrand;

    Hamming(String leftStrand, String rightStrand) {
        boolean lsEmpty = leftStrand.isEmpty(); boolean rsEmpty = rightStrand.isEmpty();
        // Validate input first
        if (!lsEmpty || !rsEmpty) {
            // Throw exception if left strand is the empty string
            if (lsEmpty) {
                throw new IllegalArgumentException("left strand must not be empty.");
            }
            // Throw exception if right strand is the empty string
            if (rsEmpty) {
                throw new IllegalArgumentException("right strand must not be empty.");
            }
            if (leftStrand.length() != rightStrand.length()) {
                throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
            }
        }
        // If no exceptions are thrown, continue to initialize class attributes
        this.lStrand = leftStrand.toCharArray();
        this.rStrand = rightStrand.toCharArray();
    }

    int getHammingDistance() {
        int diffCount = 0;
        for (int i = 0;  i < lStrand.length; ++i) {
            // If lstrand[i] is different from rstrand[i], increment diffcount by 1, else by 0
            diffCount += lStrand[i] != rStrand[i] ? 1 : 0;
        }
        return diffCount;
    }

}
