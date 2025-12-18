package day_16;

public class CountingSortAges {

    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 14, 18, 13, 15, 11};

        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;
        int[] count = new int[range];

        
        for (int age : ages) {
            count[age - minAge]++;
        }

        
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                ages[index++] = i + minAge;
                count[i]--;
            }
        }

        System.out.print("Sorted Ages: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
