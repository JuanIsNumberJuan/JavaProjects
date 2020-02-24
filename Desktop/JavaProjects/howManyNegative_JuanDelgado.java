//CSC 121

import java.util.Scanner;
import java.util.Random;

public class howManyNegative_JuanDelgado{
  public static void main(String[] args) {
    /* Add variables as needed */
  /* Type your code here. */
    int neg = fillArray(50);

    System.out.println("\n \nThere are "+neg+" negative numbers");
  }
  /* Add methods as needed */
  public static int fillArray(int x){
    int [] array = new int[x];
    Random random = new Random();
    int counter = 0;

    for(int y = 0; y< array.length; y++){
      //array[y] = 2000000000+(random.nextInt(2000000000+1));
      array[y] = 1000-random.nextInt(2001);
      System.out.print(array[y] + " " );
      if(array[y]<0){
        counter++;
      }
    }
    return counter;
  }

}
