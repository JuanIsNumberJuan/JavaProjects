import java.util.Scanner;
public class PrimeNums{

  public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);

    int counter = 0;
    System.out.println("Enter a number: ");
    int num = userInput.nextInt();

    for(int x = 1; x<=num; x++){
      if(num%x==0){
        counter++;
      }
    }
    if(num<=0){
      System.out.println("Negative numbers and zero are excluded");
    }
    else if(num==1){
      System.out.println("1 is a composite number");
    }
    else if(counter==2){
      System.out.println("Your number is a prime number");
    }
    else
    {
      System.out.println("Your number is not a prime number");
    }
  }


}
