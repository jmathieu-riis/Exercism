class Darts {
    // Darts class variables
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculate distance of (x, y) coordinate from origin (0, 0)
     */
    private double distFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0));
    }

    int score() {
        double myDist = distFromOrigin();
        if (myDist <= 1.0) {
            return 10;
        } else if (myDist <= 5.0) {
            return 5;
        } else if (myDist <= 10.0) {
            return 1;
        }
        return 0;
    }

}
