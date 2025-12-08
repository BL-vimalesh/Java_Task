package emp_present_or_absent;

public class Daily_Employee_wages {
	public static void main(String[] args) {
		final int is_full_name = 1;
		final int wages_per_hour = 20;
		int day_per_hour = 0;
		double empcheck = Math.floor(Math.random() * 10 ) % 2;
		if(is_full_name == empcheck) {
			day_per_hour = 8;
		}else {
			day_per_hour = 0;
		}
		int total_wages = day_per_hour * wages_per_hour;
		System.out.print(total_wages);
	}
}
