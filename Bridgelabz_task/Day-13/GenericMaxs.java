package code;
public class GenericMaxs {

    public static <T extends Comparable<T>> void printMax(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        System.out.println("Maximum value is: " + max);
    }
    
    public static void testMaximum() {
        printMax(10, 20, 15);              
        printMax(5.5, 2.2, 9.9);           
        printMax("Apple", "Peach", "Banana"); 
    }

    public static void main(String[] args) {
        testMaximum();
    }
}
