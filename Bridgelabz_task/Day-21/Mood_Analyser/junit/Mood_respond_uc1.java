package junit;

public class Mood_respond_uc1 {
	private static String input;
	
	public Mood_respond_uc1(String input) {
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
    	Mood_respond_uc1 respond =new Mood_respond_uc1("i am happy");
    	System.out.println(respond.Mood_analyser());
    	Mood_respond_uc1 respond2 =new Mood_respond_uc1("i am sad");
    	System.out.println(respond2.Mood_analyser());
    	Mood_respond_uc1 respond3 =new Mood_respond_uc1("");
    	System.out.println(respond3.Mood_analyser());
    }
}

