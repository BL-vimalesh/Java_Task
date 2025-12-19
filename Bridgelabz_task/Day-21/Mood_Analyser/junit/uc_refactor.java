package junit;

public class uc_refactor {
     private static String input;
     
     public uc_refactor() {
    	 this.input = input;
     }
     public uc_refactor(String input) {
    	 this.input = input;
     }
     public static String Mood_analyser(){
 		if(input == null || input.trim().isEmpty()) {
 			return "please enter valid input";
 		}
 		String input2 = input.toLowerCase();
 		if(input2.contains("happy")) {
 			return "happy";
 		}else if(input2.contains("sad")) {
 			return "Sad";
 		}
 		else {
 			return "unkown";
 		}
 	}
     public static void main(String[] args) {
    	 uc_refactor uc = new uc_refactor("i am happy mood");
    	 System.out.println(uc.Mood_analyser());
    	 uc_refactor uc2 = new uc_refactor("i am sad mood");
    	 System.out.println(uc.Mood_analyser());
    	 uc_refactor uc3 = new uc_refactor(" ");
    	 System.out.println(uc.Mood_analyser());
     }
}
