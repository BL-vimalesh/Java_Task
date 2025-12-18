package linear_binarysearch;

public class FindPeakElement {   
    public static int findPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            
            else {
                high = mid;
            }
        }

        
        return low;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(arr);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element Value: " + arr[peakIndex]);
    }
}
