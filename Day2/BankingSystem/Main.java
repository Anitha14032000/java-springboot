public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("John Doe", "SA123456", 10000, 2000);
        savingsAccount.displayAccountDetails();
        savingsAccount.deposit(5000); 
        savingsAccount.checkBalance();
        savingsAccount.withdraw(3000); 
        savingsAccount.checkBalance();
        savingsAccount.withdraw(15000); 

        System.out.println("\n");


        CurrentAccount currentAccount = new CurrentAccount("Jane Smith", "CA987654", 5000, 1000);
        currentAccount.displayAccountDetails();
        currentAccount.deposit(3000); 
        currentAccount.checkBalance();
        currentAccount.withdraw(4000);
        currentAccount.checkBalance();
        currentAccount.withdraw(5000);
    }
}
