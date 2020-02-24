import java.util.Scanner;

public class CountCharacter_JuanDelgado{
  public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);
    String a = null;
    int counter = 0;

    System.out.println("Write a letter then a sentence: ");
    a = userInput.nextLine();

    char letter = a.charAt(0);

    for(int x = 1; x<a.length(); x++)
    {
      if(a.charAt(x)==letter)
      {
        counter++;
      }
    }

    System.out.println(counter);
}
}
