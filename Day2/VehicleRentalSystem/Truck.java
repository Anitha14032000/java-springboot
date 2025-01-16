public class Truck extends Vehicle {
    private double cargoCapacity; 
    
    public Truck(String numberPlate, double rentalPricePerDay, double cargoCapacity) {
        super("Truck", numberPlate, rentalPricePerDay);
        this.cargoCapacity = cargoCapacity;
    }
  
    @Override
    public double calculateRentalCost(int numberOfDays) {
        return rentalPricePerDay * numberOfDays;
    }
    
    public void displayTruckDetails(int numberOfDays) {
        displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Total Rental Cost for " + numberOfDays + " days: " + calculateRentalCost(numberOfDays));
    }
}
