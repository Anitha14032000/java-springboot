public class Car extends Vehicle {
    private String carType; 

   
    public Car(String numberPlate, double rentalPricePerDay, String carType) {
        super("Car", numberPlate, rentalPricePerDay);
        this.carType = carType;
    }
    
    @Override
    public double calculateRentalCost(int numberOfDays) {
        return rentalPricePerDay * numberOfDays;
    }
    
    public void displayCarDetails(int numberOfDays) {
        displayDetails();
        System.out.println("Car Type: " + carType);
        System.out.println("Total Rental Cost for " + numberOfDays + " days: " + calculateRentalCost(numberOfDays));
    }
}
