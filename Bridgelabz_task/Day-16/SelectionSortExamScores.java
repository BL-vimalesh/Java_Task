package day_16;

public class SelectionSortExamScores {

    public static void main(String[] args) {

        int[] scores = {78, 45, 89, 62, 55};

        
        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

           
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.print("Sorted Exam Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
