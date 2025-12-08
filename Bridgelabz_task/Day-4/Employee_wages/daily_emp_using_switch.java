package emp_present_or_absent;

public class daily_emp_using_switch {

	public static void main(String[] args) {
		final int is_full_time = 1;
		final int is_part_time = 2;
		int wages_per_hour = 20;
		int day_per_hour = 0;
        int empcheck = (int)Math.floor(Math.random() * 10) % 3; 
        switch(empcheck) {
        	case is_full_time:
        		day_per_hour = 8;
        		break;
        	case is_part_time:
        		day_per_hour = 4;
        		break;
        	default:
        		day_per_hour = 0;
        }
        int total_wages = day_per_hour * wages_per_hour;
        System.out.print(total_wages);

	}

}
