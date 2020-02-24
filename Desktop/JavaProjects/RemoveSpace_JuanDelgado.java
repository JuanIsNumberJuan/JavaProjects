import java.util.Scanner;
import java.util.Random;

public class RemoveSpace_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a string and I'll remove spaces: ");
    String sentence = userInput.nextLine();
    String newSentence = Remover(sentence);//calls method
    System.out.println(newSentence);

  }

  static String Remover(String a){
    return a.replaceAll("\\s+", "");
    //removes spaces and returns sentence without spaces

  }


}
