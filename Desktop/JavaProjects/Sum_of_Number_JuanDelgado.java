import java.util.Scanner;

public class Sum_of_Numer_JuanDelgado {

  public static void main(String args[])
  {
    Sequence();
  }
  public static void Sequence()
  {
  int x;	// this x will equal whatever the user inputs
	int z = 1; // starts at 1
	int answer = 0; // this will be the output you will be adding z everytime to this
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter a positive whole number to begin sequence "); 
	x = userInput.nextInt();

  if(x>=0)
  {
    for (int y=0; y<x; y++)
    {
      if(x == 1)
      {
        answer = 1;
      }
      else
      {
        answer = answer + z;
        z++;
      }
    }
       System.out.println(answer);
  }
	else
  {
    System.out.println("Number must be a whole number and positive");
    Sequence();
  }

	   //there is an easier way by just using the equation

      //(n+1)n/2
      /*

      if(x>=0)
      {
        answer =(x+1)*x/2;
        System.out.println(answer);
      }
      else
      {
        System.out.println("Number must be a whole number and positive");
        Sequence();
      }
      */
 }
}
