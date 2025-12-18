package linear_binarysearch;

public class linearsearch {

	public static void main(String[] args) {
		int[] array = {1,2,-1};
		
		for(int i=0;i<array.length;i++) {
			if(array[i] < 0) {
				System.out.print(array[i]);
				return;
			}
		}
		System.out.print("-1");
	}
}
