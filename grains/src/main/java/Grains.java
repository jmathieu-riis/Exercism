import java.math.BigInteger;

class Grains {

    /**
     * Calculate total number of grains for the given square between 1 and 64 (inclusively)
     **/
    BigInteger computeNumberOfGrainsOnSquare(final int square) throws IllegalArgumentException {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.TWO.pow(square - 1);
    }

    /**
     * Count total number of grains on a board with 64 squares
     **/
    BigInteger computeTotalNumberOfGrainsOnBoard() {
        BigInteger totalGrains = BigInteger.ZERO;
        for (int i = 1; i <= 64; ++i) {
            totalGrains = totalGrains.add(computeNumberOfGrainsOnSquare(i));
        }
        return totalGrains;
    }

}
