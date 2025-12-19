package junit;

public class Mood_Analyser {
	
	public String Analyser(String input2) {
		
		
		String input = input2.toLowerCase();
		if(input == null || input.trim().isEmpty()) {
			return "exception";
		}
		
		if(input.contains("happy")) {
			return "happy";
		}else if(input.contains("sad")){
			return "sad";
		}else if(input.contains("netural")){
		return "neutral";
		}
		else {
			return "unknown";
		}
	}
}
