package app;
public class OOPS_Banner_App2 {
	    public static void main(String[] args) {

	        String[] O = {
	            "   ***   ",
	            "  **  ** ",
	            " **    **",
	            " **    **",
	            " **    **",
	            " **    **",
	            "  **  ** ",
	            "   ***   "
	        };

	        String[] P = {
	            " *****  ",
	            " **   **",
	            " **   **",
	            " *****  ",
	            " **     ",
	            " **     ",
	            " **     ",
	            " **     "
	        };

	        String[] S = {
	            "  ***** ",
	            " **     ",
	            " **     ",
	            "  ***** ",
	            "      **",
	            "      **",
	            "      **",
	            " *****  "
	        };

	        for (int i = 0; i < O.length; i++) {
	            System.out.println(
	                O[i] + "  " +
	                O[i] + "  " +
	                P[i] + "  " +
	                S[i]
	            );
	        }
	    }
	}
