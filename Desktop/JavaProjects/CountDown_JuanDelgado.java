import java.util.Scanner;

public class CountDown_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter an integer from 20 through 98: ");
    int num = userInput.nextInt();

    if(num>=20 && num<=98)
    {
      while(num%11!=0)
      {
        System.out.print(num + ", ");
        num--;
      }
      System.out.print(num+"\n");
    }
    else{
      System.out.println("Input must be between 20 - 98");
    }
  }
}
