import java.util.Scanner;

public class sumAndAvgOfarray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        scanner.close();
    }
}    
        
        

        
        

        
        

       
        

        
        
    
