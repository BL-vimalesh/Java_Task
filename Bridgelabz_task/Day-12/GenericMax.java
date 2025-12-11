package code;

public class GenericMax {

    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("UC1: " + findMax(30, 20, 10)); // uc - 1


        System.out.println("UC2: " + findMax(10, 50, 20)); // uc -2


        System.out.println("UC3: " + findMax(10, 20, 90)); // uc - 2

 
        System.out.println("Float: " + findMax(10.0f, 30.2f, 82.2f)); 

 
        System.out.println("String: " + findMax("Apple", "Peach", "Banana")); 
        
    }
}
