//CSC 121

import java.util.Scanner;

public class MiddleItem_JuanDelgado {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int[] userValues = new int[15]; // Set of data specified by the user
    /* Type your code here. */

    System.out.println("Enter numbers to find middle numbers");

    for(int x  = 0; x<userValues.length; x++){
      userValues[x] = scnr.nextInt();

      if(userValues[x]<0){
        if(x%2==0){
          System.out.println("Needs an odd number of elements");
          return;
        }
        else{
          int mid = (x)/2;
          System.out.println(userValues[mid]);
          return;
        }
      }
    }

    System.out.println("Too many inputs");








  }
}
