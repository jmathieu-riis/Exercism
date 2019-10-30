class Leap {
    /**
     * Purpose: Determine if given year is a leap year
     * returns true on every year that is evenly divisible by 4
     * returns false for every year that is evenly divisible by 100
     * returns true if the year is evenly divisible by 400
     * */
    boolean isLeapYear(int year) {
        boolean divBy4 = year % 4 == 0;
        boolean divBy100 = year % 100 == 0;
        boolean divBy400 = year % 400 == 0;
        return divBy400 || divBy4 && !divBy100;
    }

}
