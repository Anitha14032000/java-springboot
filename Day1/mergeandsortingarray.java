import java.util.Arrays;

public class mergeandsortingarray {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 9};
        int[] array2 = {1, 6, 3, 7};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] mergedAndSortedArray = mergeAndSort(array1, array2);

        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedAndSortedArray));
    }

    public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        Arrays.sort(mergedArray);

        return mergedArray;
    }
}
        
        
        
        
