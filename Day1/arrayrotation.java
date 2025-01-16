import java.util.Arrays;

public class arrayrotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int positions = 2;

        System.out.println("Original Array: " + Arrays.toString(array));
        rotateArray(array, positions);
        System.out.println("Array after rotating by " + positions + " positions: " + Arrays.toString(array));
    }

    public static void rotateArray(int[] arr, int n) {
        int length = arr.length;
        n = n % length; 
        reverseArray(arr, 0, n - 1);      
        reverseArray(arr, n, length - 1); 
        reverseArray(arr, 0, length - 1); 
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
