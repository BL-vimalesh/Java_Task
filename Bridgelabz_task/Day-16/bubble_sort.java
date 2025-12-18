package day_16;

public class bubble_sort {

	public static void main(String[] args) {
		int[] student_mark = {1,7,1,2,7,8,2};
		int temp=0;
		for(int i=0;i<student_mark.length-1;i++) {
			for(int j=0;j<student_mark.length-1-i;j++) {
				if(student_mark[j] > student_mark[j+1]) {
					temp = student_mark[j];
					student_mark[j] = student_mark[j+1];
					student_mark[j+1] = temp;
				}
			}
		}
		for(int i=0;i<student_mark.length;i++) {
			System.out.println(student_mark[i]);
		}
	}}
