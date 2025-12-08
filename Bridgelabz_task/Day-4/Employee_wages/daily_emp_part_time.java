package emp_present_or_absent;
public class daily_emp_part_time {
	public static void main(String[] args) {
		int is_full_time = 1;
		int is_part_time = 2;
		int wages_per_hour = 20;
		int day_per_hour = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if(is_full_time == empcheck) {
        	day_per_hour = 8;
        }else if(is_part_time == empcheck) {
        	day_per_hour = 4;
        }else {
        	day_per_hour = 0;
        }
        int total_wages = day_per_hour * wages_per_hour;
        System.out.print(total_wages);
	}
}
