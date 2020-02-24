import java.util.Scanner;
import java.util.Random;

public class ESPgame{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();

    String [] colors = {"blue", "green", "red", "orange", "purple", "yellow", "pink"};

    int counter = 0;
    int num;
    String choice;
    String compChoice;
    for(int x=1; x<10; x++){
      System.out.println("Choose a color: ");
      choice = userInput.nextLine();
      num = rand.nextInt((5)+1)+0;

      //System.out.println(num);  //to see the random number
      //System.out.println(colors[num]);    //to see the word the computer choose randomly

      if(choice.equals(colors[num])){

        counter++;
      }
    }
    System.out.println("You guessed correctly "+counter+" times.");
  }
}
