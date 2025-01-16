public abstract class Employee {
    protected String name;
    protected int id;
    protected String designation;
    protected double basicSalary;

    
    public Employee(String name, int id, String designation, double basicSalary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    
    public abstract double calculateSalary();
      
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
}
