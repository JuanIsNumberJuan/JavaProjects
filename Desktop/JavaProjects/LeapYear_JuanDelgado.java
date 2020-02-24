import java.util.Scanner;

public class LeapYear_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int Num = userInput.nextInt();
    if(isLeapYear(Num)){
      System.out.println(Num +" is a leap Year");
    }
    else{
      System.out.println(Num +" is not a leap Year");
    }

  }

  static boolean isLeapYear(int LeapYear){
    boolean statement = false;
    if(LeapYear%4==0){
      statement = true;
    }
    return statement;
  }


}
