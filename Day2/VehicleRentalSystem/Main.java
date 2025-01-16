public class Main {
    public static void main(String[] args) {
        
        Car car = new Car("KA01AB1234", 1000, "Sedan");
        car.displayCarDetails(5);

        System.out.println("\n");

       
        Bike bike = new Bike("MH12CD5678", 500, 150);
        bike.displayBikeDetails(3); 

        System.out.println("\n");

       
        Truck truck = new Truck("TN34EF6789", 3000, 10);
        truck.displayTruckDetails(7); 
    }
}
