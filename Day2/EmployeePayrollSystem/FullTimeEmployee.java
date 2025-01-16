public class FullTimeEmployee extends Employee {
    private double hra;  
    private double da;   

    public FullTimeEmployee(String name, int id, String designation, double basicSalary, double hra, double da) {
        super(name, id, designation, basicSalary);
        this.hra = hra;
        this.da = da;
    }    
    
    @Override
    public double calculateSalary() {
        return basicSalary + hra + da;
    }
    public void displayFullTimeEmployeeDetails() {
        displayDetails();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
    
    
    
    
