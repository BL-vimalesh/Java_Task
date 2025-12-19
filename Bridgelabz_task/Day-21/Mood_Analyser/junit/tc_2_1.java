package junit;

public class tc_2_1 {
       private static String input;
       public tc_2_1(String input) {
    	   this.input = input;
       }
       public String mood_anayser() {
    	   if(input == null) {
    		   return "happy";
    	   }else {
    		   return "sad";
    	   }
       }
}
