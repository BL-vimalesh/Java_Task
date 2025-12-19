package junit;

public class Mood_Analyser {
    private String input;

    public Mood_Analyser(String input) {
        this.input = input;
    }

    public static String Analysis(String input) throws custom_exception {
        if (input == null || input.trim().isEmpty()) {
            throw new custom_exception("please enter the input");
        }

        if (input.contains("happy")) {
            return "happy";
        } else if (input.contains("sad")) {
            return "sad";
        } else if (input.contains("neutral")) {
            return "neutral";
        } else {
            return "unknown";
        }
    }
}
