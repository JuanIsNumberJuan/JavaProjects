import java.util.Scanner;

public class MaxMag_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = userInput.nextInt();
    int b = userInput.nextInt();
    int max = maxMagnitude(a,b); //calls method
    System.out.println("Max of "+a+" and "+b+" is "+ max);

  }

  static int maxMagnitude(int c, int d){
    //does absolute value of both numbers
    int fNum = Math.abs(c);
    int sNum = Math.abs(d);

    int x = Math.max(fNum, sNum); //gets max

    if(x == -c || x == c){
      x = c;
    }
    else if (x == - d || x ==d){
      x = d;
    }
      return x;
  }



}
