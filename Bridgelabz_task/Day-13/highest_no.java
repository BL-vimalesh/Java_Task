package code;

class max{
	public static int highest_no(Integer n1, Integer n2, Integer n3) {
		Integer max = n1;
		if(n2.compareTo(max) > 0) {
			max = n2;
		}else if(n3.compareTo(max) > 0) {
			max = n3;
		}
		return max;		
	}
    public static void main(String[] args) {
        System.out.print(highest_no(30,20,10)); // TC 1.1
        System.out.print(highest_no(50,70,30)); // TC 1.2
        System.out.print(highest_no(10,20,50)); // TC 1.3
    }
}
