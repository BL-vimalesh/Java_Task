package app;
public class OOPS_banner_app4 {
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {

            new CharacterPatternMap('O', new String[] {
                "  *****  ",
                " **     **",
                "**       *",
                "**       *",
                "**       *",
                " **     **",
                "  *****  "
            }),

            new CharacterPatternMap('P', new String[] {
                "  ****** ",
                " **     **",
                " **     **",
                "  ****** ",
                " **      ",
                " **      ",
                " **      "
            }),

            new CharacterPatternMap('S', new String[] {
                "  ****** ",
                " **      ",
                " **      ",
                "  ****** ",
                "       **",
                "       **",
                " ******  "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = charMaps[0].pattern.length;

        for (int row = 0; row < height; row++) {

            String[] rowParts = new String[message.length()];

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                rowParts[i] = pattern[row];
            }

            System.out.println(String.join("  ", rowParts));
        }
    }

   
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}

