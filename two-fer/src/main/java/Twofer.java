
class Twofer {
    String twofer(String name) {
        // Use string formatting
        String baseMessage = "One for %s, one for me.";
        if (name == null || name.isEmpty()) {
            name = "you";
        }
        return String.format(baseMessage, name);
    }
}
