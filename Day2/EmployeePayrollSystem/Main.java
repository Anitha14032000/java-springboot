public class Main {
    public static void main(String[] args) {
        
        FullTimeEmployee ftEmployee = new FullTimeEmployee("John Doe", 101, "Software Engineer", 50000, 10000, 5000);
        ftEmployee.displayFullTimeEmployeeDetails();
        
        System.out.println("\n");

        PartTimeEmployee ptEmployee = new PartTimeEmployee("Jane Smith", 102, "Data Entry", 20000, 150, 80);
        ptEmployee.displayPartTimeEmployeeDetails();
    }
}     
        
