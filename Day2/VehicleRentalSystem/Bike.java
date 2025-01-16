public class Bike extends Vehicle {
    private double engineCapacity;
    
    public Bike(String numberPlate, double rentalPricePerDay, double engineCapacity) {
        super("Bike", numberPlate, rentalPricePerDay);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalCost(int numberOfDays) {
        return rentalPricePerDay * numberOfDays;
    }

    public void displayBikeDetails(int numberOfDays) {
        displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Total Rental Cost for " + numberOfDays + " days: " + calculateRentalCost(numberOfDays));
    }
}
