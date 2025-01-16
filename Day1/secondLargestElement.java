public class secondLargestElement {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
               
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalStateException("No second largest element (all elements are equal).");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        try {
            int secondLargest = findSecondLargest(array);
            System.out.println("Second largest element is: " + secondLargest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}    

    
