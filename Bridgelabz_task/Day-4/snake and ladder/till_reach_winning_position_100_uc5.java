package day_4;

import java.util.HashMap;
import java.util.Map;

public class till_reach_winning_position_100_uc5 {
	public static void main(String[] args) {
Map<Integer,Integer> snakesAndLadders= new HashMap();
        
		snakesAndLadders.put(4, 14);
        snakesAndLadders.put(9, 31);
        snakesAndLadders.put(20, 38);
        snakesAndLadders.put(28, 84);
        snakesAndLadders.put(40, 59);
        snakesAndLadders.put(63, 81);
        snakesAndLadders.put(71, 91);
      
        snakesAndLadders.put(17, 7);
        snakesAndLadders.put(54, 34);
        snakesAndLadders.put(62, 19);
        snakesAndLadders.put(64, 60);
        snakesAndLadders.put(87, 24);
        snakesAndLadders.put(93, 73);
        snakesAndLadders.put(95, 75);
        snakesAndLadders.put(98, 79);
        
        int roll=0;
        int pos = 0;
        int random = 0;
        int stay = 0;
        int forwardcount=0;
        int backwardcount=0;
        int lastnumber = 0;
        while(pos<100) {
        	random = (int) (Math.floor(Math.random() * 6) +1);
        	roll++;
        	lastnumber = random;
        	System.out.print("roll no is"+roll);
        	
        if(pos + random > 100) {
        	stay++;
        	System.out.println("Overshoot! Stay at " + pos);
        	continue;
        }
        pos+=random;
        System.out.println("moved to"+ pos);
        if(snakesAndLadders.containsKey(pos)) {
        	int newpos = snakesAndLadders.get(pos);
        	if(newpos > pos) {
        		forwardcount++;
        		System.out.println("moving forward"+newpos);
        	}else {
        		backwardcount++;
        		System.out.println("moving forward"+newpos);
        	}
        	pos = newpos;
        }
        System.out.println("current pos"+pos);
        
        }
        
        System.out.println("player stays in a same position"+stay);
        System.out.println("moves forward count"+ forwardcount);
        System.out.println("moves backward count"+ backwardcount);
        System.out.println("last number add to 100 is "+ lastnumber);
	}

}
