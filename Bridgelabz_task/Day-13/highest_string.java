package code;

public class highest_string {
    public static String input(String s1, String s2, String s3) {
    	String max = s1;
    	if(s2.compareTo(max) > 0) {
    		max = s2;
    	}else if(s3.compareTo(max) > 0) {
    		max = s3;
    	}
    	return max;
    }
	public static void main(String[] args) {
		System.out.print(input("apple","samsung","oppo"));//uc1
		System.out.print(input("samsung","apple","oppo"));//uc2
		System.out.print(input("oppo","samsung","apple"));//uc3
	}
}
