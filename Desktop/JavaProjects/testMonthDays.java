//Juan Delgado
//CSC 121

// use this to test MonthDays code
import java.util.Scanner;
public class testMonthDays{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a month (1-12): ");
    int x = userInput.nextInt();
    System.out.println("Enter a year: ");
    int y = userInput.nextInt();
    MonthDays test = new MonthDays(x,y);
  }
}
