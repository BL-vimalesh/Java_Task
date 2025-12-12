package code;

import java.util.Scanner;

public class SimpleMaxTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];    
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Choose option:");
        System.out.println("1. Max");
        System.out.println("2. Min");
        System.out.println("3. Sort");

        int choice = sc.nextInt();

        if (choice == 1) {
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) max = arr[i];
            }
            System.out.println("Max = " + max);
        } else if (choice == 2) {
            int min = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) min = arr[i];
            }
            System.out.println("Min = " + min);
        } else if (choice == 3) {
            
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
