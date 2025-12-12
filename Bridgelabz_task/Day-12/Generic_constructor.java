package code;

public class Generic_constructor<T extends Comparable<T>> {

    T x, y, z;  
    public Generic_constructor(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public T testMaximum() {
        return testMaximum(x, y, z);
    }

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    
    public static void main(String[] args) {

       
        Generic_constructor<Integer> intMax = new Generic_constructor<>(30, 20, 10);
        System.out.println("Max Integer: " + intMax.testMaximum()); // Expected: 30

       
        Generic_constructor<Float> floatMax = new Generic_constructor<>(10.0f, 30.2f, 82.2f);
        System.out.println("Max Float: " + floatMax.testMaximum()); // Expected: 82.2

       
        Generic_constructor<String> stringMax = new Generic_constructor<>("Apple", "Peach", "Banana");
        System.out.println("Max String: " + stringMax.testMaximum()); // Expected: Peach
    }
}

