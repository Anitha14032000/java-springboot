import java.util.Scanner;

public class trafficLightSystem{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the light,red,green,yellow:");
        String trafficLight= scanner.nextLine().toLowerCase();
        switch (trafficLight){
            case "red":
                System.out.println("Stop!, Light is red colour");
                break;
            case "green":
                System.out.println("go , Light is green colour");
                break;
            case "yellow":
                System.out.println("go slow , Light is yellow colour");
                break;
            default :
                System.out.println("enter proper light colour");
                break;
            
      
        }
        scanner.close();
    }
}