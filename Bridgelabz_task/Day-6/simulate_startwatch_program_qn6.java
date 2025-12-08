package Fib;
import java.util.Scanner;
public class simulate_startwatch_program_qn6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Type 'start' to begin stopwatch:");
        
        String typestart = sc.nextLine();
        long start = 0;
        long end = 0;
        long total_time = 0;
        if(typestart.equalsIgnoreCase("start")) {
        	start = System.currentTimeMillis();
        }
        System.out.print("Type 'end' to begin stopwatch:");
        String typeend = sc.nextLine();
        if(typeend.equalsIgnoreCase("end")) {
        	end = System.currentTimeMillis();
        	total_time = end - start;
        }
        System.out.print(total_time+"milliseconds");
	}
}
