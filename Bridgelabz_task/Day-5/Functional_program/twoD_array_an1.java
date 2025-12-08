package day_5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class twoD_array_an1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] array = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				array[i][j] = sc.nextInt();
			}
		}
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		pw.print(array[i][j]);
        	}
        	pw.println();
        }
        pw.flush();
	}
}
