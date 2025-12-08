package day_4;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class twodices_uc7 {
	public static void main(String[] args) {
		        Map<Integer,Integer> snakesAndLadders = new HashMap<>();

		       
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

		        int pos1 = 0, pos2 = 0; 
		        int turn = 1;           
		        int roll=0;

		        while (pos1 < 100 && pos2 < 100) {
		           roll = (int)(Math.floor(Math.random() * 6) +1);
		            System.out.println("Player " + turn + " rolls: " + roll);

		         
		            int pos = (turn == 1) ? pos1 : pos2;

		            
		            if (pos + roll > 100) {
		                System.out.println("Overshoot! Player " + turn + " stays at " + pos);
		            } else {
		                pos += roll;
		                System.out.println("Player " + turn + " moves to " + pos);

		                
		                if (snakesAndLadders.containsKey(pos)) {
		                    int newPos = snakesAndLadders.get(pos);
		                    if (newPos > pos) {
		                        System.out.println("Ladder! Player " + turn + " climbs to " + newPos);
		                        pos = newPos;
		                        
		                        if (turn == 1) pos1 = pos; else pos2 = pos;
		                        if (pos == 100) break;
		                        continue; 
		                    } else {
		                        System.out.println("Snake! Player " + turn + " slides to " + newPos);
		                        pos = newPos;
		                    }
		                }
		            }

		            
		            if (turn == 1) pos1 = pos; else pos2 = pos;

		            
		            turn = (turn == 1) ? 2 : 1;

		            System.out.println("Player1 at " + pos1 + " | Player2 at " + pos2);
		            
		        }

		        
		        if (pos1 == 100) {
		            System.out.println("Player 1 wins the game!");
		        } else {
		            System.out.println("Player 2 wins the game!");
		        }
		    }
		}

