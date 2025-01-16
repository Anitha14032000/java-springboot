import java.util.HashSet;
import java.util.Set;

public class duplicateRemover {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("\nArray after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
