import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arraySortOper {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Integer[] ascendingOrder = numbers.clone();
        Arrays.sort(ascendingOrder);
        Integer[] descendingOrder = numbers.clone();
        Arrays.sort(descendingOrder, Collections.reverseOrder());
        System.out.println("Array in ascending order: " + Arrays.toString(ascendingOrder));
        System.out.println("Array in descending order: " + Arrays.toString(descendingOrder));
        scanner.close();
    }
}
        
        

        
        

        
        

        
        

        
        

        
        
