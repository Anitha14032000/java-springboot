public abstract class Vehicle {
    protected String vehicleType;
    protected String numberPlate;
    protected double rentalPricePerDay;

    
    public Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.rentalPricePerDay = rentalPricePerDay;
    }
   
    public abstract double calculateRentalCost(int numberOfDays);
    
    public void displayDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Number Plate: " + numberPlate);
        System.out.println("Rental Price per Day: " + rentalPricePerDay);
    }
}
