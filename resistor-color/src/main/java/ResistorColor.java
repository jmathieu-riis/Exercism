class ResistorColor {

    private String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        int i = 0;
        for (String c : colors) {
            if (c.equals(color)) {
                return i;
            }
            ++i;
        }
        return -1;
    }

    String[] colors() {
        return colors;
    }
}
