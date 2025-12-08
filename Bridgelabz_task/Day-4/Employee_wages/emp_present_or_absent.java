package emp_present_or_absent;
public class emp_present_or_absent {
	public static void main(String[] args) {
	int isnewno = 1;
	double empcheck = Math.floor(Math.random() * 10) % 2;
	if(isnewno == empcheck) {
		System.out.print("Employee is present");
	}else {
		System.out.print("Employee is absent");
	}
}}
