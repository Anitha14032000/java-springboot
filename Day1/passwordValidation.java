import java.util.Scanner;

public class passwordValidation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        
        
        if (password.length() >= 8 && password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*")) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
        
        scanner.close();
    }
}
