package day_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class win_the_pos_uc6 {
    public static void main(String[] args) {
    	 Map<Integer, Integer> snakesAndLadders = new HashMap<>();

         
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

         int position = 0; 
         Random dice = new Random();
         int rolls = 0;

         while (position < 100) {
             int roll = dice.nextInt(6) + 1; // Dice roll (1–6)
             rolls++;
             System.out.println("Roll " + rolls + ": " + roll);

             
             if (position + roll > 100) {
//                 System.out.println("Overshoot! Stay at " + position);
                 continue;
             }

             position += roll;
//             System.out.println("Moved to " + position);

            
             if (snakesAndLadders.containsKey(position)) {
                 int newPos = snakesAndLadders.get(position);
                 if (newPos > position) {
//                     System.out.println("Ladder base at " + position + "! Climb up to " + newPos);
                 } else {
//                     System.out.println("Snake head at " + position + "! Slide down to " + newPos);
                 }
                 position = newPos;
             }

             System.out.println("Current position: " + position);
            
         }

         System.out.println("Player reached 100 in " + rolls + " rolls!");
     }
 }