package day_4;

public class SnakeLadder {

    public static void main(String[] args) {
        System.out.println("Welcome to Single Player Snake & Ladder Game!");

        int position = 0;
        int diceRolls = 0;  // Optional: count total dice rolls

        while (position < 100) {
            // Roll the die (1–6)
            int die = (int)(Math.random() * 6) + 1;
            diceRolls++;

            // Determine action: 0 = No Play, 1 = Ladder, 2 = Snake
            int option = (int)(Math.random() * 3);

            switch (option) {
                case 0:
                    System.out.println("No Play → Staying at " + position);
                    break;
                case 1:
                    if (position + die <= 100) {
                        position += die;
                    }
                    System.out.println("Ladder! Move ahead to " + position);
                    break;
                case 2:
                    position -= die;
                    if (position < 0) position = 0;
                    System.out.println("Snake! Move back to " + position);
                    break;
            }

            System.out.println("Rolled: " + die + " | Current Position: " + position);
            System.out.println("-----------------------------");
        }

        System.out.println("Congratulations! You reached 100 and won the game!");
        System.out.println("Total dice rolls: " + diceRolls);
    }
}