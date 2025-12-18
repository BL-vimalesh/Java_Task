package linear_binarysearch;
public class RotationPointBinarySearch {    
    public static int findRotationPoint(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        if (arr[low] <= arr[high]) {
            return 0;
        }
        while (low <= high) {
            int mid = (low + high) / 2;   
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int index = findRotationPoint(arr);
        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }
}
