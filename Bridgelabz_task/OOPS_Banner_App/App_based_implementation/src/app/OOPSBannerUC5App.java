package app;

package app;

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC5App {

    public static Map<Character, String[]> createCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[] {
            "  *****  ",
            " **     **",
            "**       *",
            "**       *",
            "**       *",
            " **     **",
            "  *****  "
        });

        patternMap.put('P', new String[] {
            "  ****** ",
            " **     **",
            " **     **",
            "  ****** ",
            " **      ",
            " **      ",
            " **      "
        });

        patternMap.put('S', new String[] {
            "  ****** ",
            " **      ",
            " **      ",
            "  ****** ",
            "       **",
            "       **",
            " ******  "
        });

        return patternMap;
    }

    public static void printBanner(String message, Map<Character, String[]> patternMap) {

        int height = patternMap.values().iterator().next().length;


        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createCharacterPatternMap();

        String message = "OOPS";

        printBanner(message, patternMap);
    }
}

