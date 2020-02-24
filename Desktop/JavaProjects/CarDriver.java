import java.util.Scanner;

public class CarDriver{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("How many miles is this car traveling: ");
    int miles = userInput.nextInt();
    System.out.println("Enter size of engine in cubic inches");
    int engine = userInput.nextInt();
    Car Camaro = new Car(engine, 4, miles);
    FuelGauge a = new FuelGauge(0,15);
    Odometer b = new Odometer();
    int counter = 0;
    if(miles>0){
      do{
        if(a.getFuel() == 0){
          while(a.getFuel() != 15){
            a.incrementFuel();
          }
          System.out.println("Filled up gass");
        }
        if(counter != 24){
          miles--;
        }
        else{
          a.decrementFuel();
          miles--;
          counter = 0;
          System.out.println("Fuel went down by one \nMiles left: "+miles);
        }
      }while(miles>=0);
    }
    else{
      System.out.println("You can't go negative miles");
    }
  }
}
