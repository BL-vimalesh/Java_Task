package linear_binarysearch;

public class FirstLastOccurrence {

   
    static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }


    static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int first = firstOccurrence(array, target);
        int last = lastOccurrence(array, target);

        if (first == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("First occurrence index: " + first);
            System.out.println("Last occurrence index: " + last);
        }
    }
}

