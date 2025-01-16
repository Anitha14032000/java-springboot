import java.util.Scanner;

public class ArrayElementSearch {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to search for:");
        int searchElement = scanner.nextInt();
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == searchElement) {
                position = i + 1; 
                break;
            }
        }
        if (position != -1) {
            System.out.println("Element " + searchElement + " found at position: " + position);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        scanner.close();
    }
}    

       
        

        
        

        
        

        
        

        
        
    
