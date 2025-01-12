import java.util.Scanner;
 public class checkLeapYear{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        if ((year%4==0)&&(year%100!=0 || year%400==0)){
            System.out.println("it is Leap Year");
        }
        else {
            System.out.println("it is not Leap Year");
        }
        scanner.close();

    }
 }


 