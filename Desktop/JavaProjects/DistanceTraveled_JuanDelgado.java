import java.util.Scanner;

public class DistanceTraveled_JuanDelgado{

  public static void main(String []args)
  {
    DistanceTraveled();
  }

  public static void DistanceTraveled()
  {
    //if you want to use decimal points just change int to double
    int speed;
    int hours;
    int distance = 0;
    Scanner userInput = new Scanner(System.in);
    //if using double change nextInt to nextDouble
    System.out.println("What is your speed? ");
    speed = userInput.nextInt();
    System.out.println("How long have you been traveling");
    hours = userInput.nextInt();

    String d = "Distance";
    String h = "Hours";
    if(hours < 0)
    {
      System.out.println("You cannot travel for negative hours");
      DistanceTraveled();
    }
    else
    {
      if(speed>0)
      {
        System.out.printf("%-10s %s\n",h , d);
        for(int x = 0; x<hours; x++)
        {
          int y = x+1;
          distance +=speed;
          System.out.printf("%-10s %s\n", y, distance);
        }

      }
      else
      {
        System.out.println("Speed cannot be negative");
        DistanceTraveled();
      }
    }
    //Or you can just use an equation speed * hours
  }

}
