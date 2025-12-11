package day_11;

public class Account {
      private double balance;
      public Account(Double initialbalance) {
    	  if(initialbalance >= 0.0) {
    		  balance = initialbalance; 
    	  }else {
    		  balance = 0.0;
    	  }
      }
      public void debit(double salary) {
    	  balance += salary;
      }
      public void credit(double takenamount) {
    	  if(balance >= takenamount) {
    		  balance -=takenamount;
    	  }else {
    		  System.out.print("insuffient balance in the Account");
    	  }
      }
      public void getbalance() {
    	  System.out.print(balance);
      }
}
