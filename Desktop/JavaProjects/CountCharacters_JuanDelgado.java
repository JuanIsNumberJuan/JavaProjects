import java.util.Scanner;

public class CountCharacters_JuanDelgado{
  public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Write a letter then a sentence: ");
    String a = userInput.nextLine();
    char letter = a.charAt(0);
    int num = countCharacters(letter, a);//calls method
    System.out.println(num);
  }

  static int countCharacters(char Letter, String sentence){
    int counter = 0;
    for(int x = 1; x<sentence.length(); x++)
    {
      if(sentence.charAt(x)==Letter)//looks for given letter
      {
        counter++;
      }
    }
    return counter;//returns counter
}
}
