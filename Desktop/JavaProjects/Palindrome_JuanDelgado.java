import java.util.Scanner;

public class Palindrome_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word = userInput.nextLine();

    String Word = word.trim();


    boolean a = true;
    for(int x = 1; x<Word.length(); x++){
      char ch1 = Word.charAt(x-1);
      char ch2 = Word.charAt(Word.length()-x);
      if(ch1 != ch2)
      {
        a = false;
      }

    }
    if(a)
    {
        System.out.println(word+ " is a Palindrome.");
    }
    else
    {
      System.out.println(word +" is not a Palindrome.");
    }


  }
}
