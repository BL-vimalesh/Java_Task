package app;
public class OOPS_banner_app3 {

    public static String[] getOpattern() {
        return new String[] {
            "  *****  ",
            " **     **",
            "**       *",
            "**       *",
            "**       *",
            " **     **",
            "  *****  "
        };
    }

    public static String[] getO2pattern() {
        return new String[] {
            "  *****  ",
            " **     **",
            "**       *",
            "**       *",
            "**       *",
            " **     **",
            "  *****  "
        };
    }

    public static String[] getPpattern() {
        return new String[] {
            "  ****** ",
            " **     **",
            " **     **",
            "  ****** ",
            " **      ",
            " **      ",
            " **      "
        };
    }

    // Letter S
    public static String[] getSpattern() {
        return new String[] {
            "  ****** ",
            " **      ",
            " **      ",
            "  ****** ",
            "       **",
            "       **",
            " ******  "
        };
    }

    public static void main(String[] args) {

        String[] O = getOpattern();
        String[] O2 = getO2pattern();
        String[] P = getPpattern();
        String[] S = getSpattern();

        for (int i = 0; i < O.length; i++) {
            String line = String.join("  ", O[i], O2[i], P[i], S[i]);
            System.out.println(line);
        }
    }
}

