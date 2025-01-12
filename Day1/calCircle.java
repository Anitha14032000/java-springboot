import java.util.Scanner;

public class calCircle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble()
        double pi = Math.PI;
        double circumference = 2 * pi * radius;
        double area = pi * Math.pow(radius, 2);
         System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
        scanner.close();
     }
}
        
        
        
        
        
       
       
        
        

