package code;


public class highest_no_float {
    
	public static float float_value(Float f1, Float f2, Float f3) {
		Float max = f1;
		if(f2.compareTo(max) > 0) {
			max = f2;
		}else if(f3.compareTo(max) > 0) {
			max = f3;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(float_value(90.5f, 30.2f, 82.2f)); // uc - 1
		System.out.println(float_value(10.5f, 50.2f, 22.2f)); // uc - 2
		System.out.println(float_value(10.5f, 30.2f, 82.2f)); // uc - 3
	}
}
