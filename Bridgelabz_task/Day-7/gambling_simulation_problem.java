package gambling;

import java.util.Scanner;

public class gambling_simulation_problem {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int stake = sc.nextInt();
      int goal = sc.nextInt();
      int trials = sc.nextInt();
      int total_count = 0;
      int success_count = 0;
      for(int i=0;i<trials;i++) {
    	  int cash = stake;
    	  int bet = 0;
    	  
    	  while(cash > 0 && cash < goal) {
    		  bet++;
    		  if(Math.random() < 0.5) {
    			  cash--;
    		  }else {
    			  cash++;
    		  }}
    	  total_count+=bet;
    	  if(cash == goal) {
    		  success_count++;
    	  }
      }
      System.out.println("wins percents"+ success_count+"out of"+ trials);
      System.out.println("percentages of wins"+ 100 * success_count/trials);
      System.out.println("Average number of bets"+ total_count / trials);
  }
}
