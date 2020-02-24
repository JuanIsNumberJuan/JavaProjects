import java.util.Scanner;

public class Acronyms_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter an Acronym: ");
    String sentence = userInput.nextLine();
    String Acronym = createAcronym(sentence);//calls method
    System.out.println(Acronym);
  }


  static String createAcronym(String a){
    String Acr = "";

    String Sentencee = a.replaceAll("\\s+", "");

    for(int x = 0 ; x < Sentencee.length();x++)
    {
      String CapSentence = Sentencee.toUpperCase();
      //finds cap letters and makes acronym
      if(Sentencee.charAt(x) ==  CapSentence.charAt(x))
      {
          Acr += Sentencee.substring(x,x+1);
      }
    }
    return Acr;

  }




}
