package day_4;

public class SnakeAndLadderTwoPlayers {
    public static void main(String[] args) {

        System.out.println("Welcome to Two Player Snake & Ladder Game!");

        int position1 = 0, position2 = 0;    
        int diceRolls1 = 0, diceRolls2 = 0;  
        boolean player1Turn = true;           

        while (position1 < 100 && position2 < 100) {

            int die = (int) (Math.random() * 6) + 1;
            int option = (int) (Math.random() * 3); 

            if (player1Turn) {
                diceRolls1++;
                System.out.println("Player 1 rolls: " + die);

                switch (option) {
                    case 0: 
                        System.out.println("No Play → Player 1 stays at " + position1);
                        player1Turn = false;  
                        break;

                    case 1: 
                        if (position1 + die <= 100) {
                            position1 += die;
                        }
                        System.out.println("Ladder! Player 1 moves to " + position1 + " → Gets another turn!");
                        break;

                    case 2: 
                        position1 -= die;
                        if (position1 < 0) position1 = 0;
                        System.out.println("Snake! Player 1 moves back to " + position1);
                        player1Turn = false;  
                        break;
                }

                System.out.println("Player 1 Position: " + position1);
            } else {
                diceRolls2++;
                System.out.println("Player 2 rolls: " + die);

                switch (option) {
                    case 0: 
                        System.out.println("No Play → Player 2 stays at " + position2);
                        player1Turn = true;
                        break;

                    case 1: 
                        if (position2 + die <= 100) {
                            position2 += die;
                        }
                        System.out.println("Ladder! Player 2 moves to " + position2 + " → Gets another turn!");
                        break;

                    case 2: 
                        position2 -= die;
                        if (position2 < 0) position2 = 0;
                        System.out.println("Snake! Player 2 moves back to " + position2);
                        player1Turn = true;  
                        break;
                }

                System.out.println("Player 2 Position: " + position2);
            }
        }

        
        if (position1 == 100) {
            System.out.println("Player 1 won the game (UC 7)!");
        } else {
            System.out.println("Player 2 won the game (UC 7)!");
        }

        System.out.println("Total dice rolls - Player 1: " + diceRolls1 + ", Player 2: " + diceRolls2);

    }
}
