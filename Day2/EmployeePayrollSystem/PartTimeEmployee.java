public class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, String designation, double basicSalary, double hourlyWage, int hoursWorked) {
        super(name, id, designation, basicSalary);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
    public void displayPartTimeEmployeeDetails() {
        displayDetails();
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

    

    
    
