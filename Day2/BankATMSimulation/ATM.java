import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0; 

        while (true) {
            
            System.out.println("\n--- Welcome to the Bank ATM ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   
                    System.out.println("Your current balance is: ₹" + balance);
                    break;

                case 2:
                   
                    System.out.print("Enter the amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("₹" + depositAmount + " has been deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                  
                    System.out.print("Enter the amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("₹" + withdrawAmount + " has been withdrawn successfully.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid withdraw amount.");
                    }
                    break;

                case 4:
                   
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}








