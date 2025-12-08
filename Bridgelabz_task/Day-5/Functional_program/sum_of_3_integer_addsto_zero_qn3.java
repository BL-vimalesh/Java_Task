package day_5;

import java.util.Scanner;

public class sum_of_3_integer_addsto_zero_qn3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
            for(int j=i+1; j<num; j++) {
                for(int k=j+1; k<num; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
        		}
        	}       	
        }
        System.out.print(count);
	}
}
