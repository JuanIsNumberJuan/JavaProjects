import java.util.Scanner;
public class PenniesForPay_JuanDelgado{
  public static void main(String [] args)
  {
    Pennies();
  }
  public static void Pennies()
  {
    double penny = .01;
    int days;
    String d = "Day";
    String s = "Salary";

    Scanner userInput = new Scanner(System.in);
    System.out.println("How many days have you worked? ");
    days = userInput.nextInt();

    if(days==0)
    {
      System.out.println("If you work 0 hours you get paid $0");
    }
    else if(days<0)
    {
      System.out.println("You cannot work for negative days");
      Pennies();
    }
    else
    {
      System.out.printf("%-10s %s\n", d, s);
      for(int x = 0; x<days;x++)
      {
        int y = x+1;
        String pennies = String.format("%,.2f",penny);
        System.out.printf("%-10s %s\n", y, pennies);
        penny *=2;
      }
    }
  }
}
