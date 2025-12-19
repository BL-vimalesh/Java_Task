package junit;

public class repeat {
	private static String input;
	public repeat(String input) {
		this.input = input;
	}
	
	public String mood_analyser() {
		if(input==null || input.trim().isEmpty()) {
			return "please enter valid input";
		}
		if(input.contains("happy")) {
			return "happy";
		}else if(input.contains("sad")) {
			return "sad";
		}
		return "unkown";		
	}
}
