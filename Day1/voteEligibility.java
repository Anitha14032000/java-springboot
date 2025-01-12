import java.util.Scanner;

public class voteEligibility{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("you are eligible for vote");
        }
        else{
            System.out.println("you are not eligible for vote");
        }

        scanner.close();

    }
}