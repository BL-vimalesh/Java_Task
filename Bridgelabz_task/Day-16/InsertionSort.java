package day_16;

public class InsertionSort {

    public static void main(String[] args) {
      int[] empid = {8,6,4,3,1};
      
      for(int i=1;i<empid.length;i++) {
       int key =empid[i];
       int j = i-1;
       
       while(j>=0 && empid[j] > key) {
    	   empid[j+1] = empid[j];
    	   j--;
       }
       empid[j+1] = key;
    }
      
      for(int i=0;i<empid.length;i++) {
    	  System.out.println(empid[i]);
      }
}}