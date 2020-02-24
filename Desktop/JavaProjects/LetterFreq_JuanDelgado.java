//Juan Delgado
//CSC 121
import java.io.*;     //BufferedReader; FileReader; IOException;
import java.util.*;   //Arrays;

public class LetterFreq_JuanDelgado{
   static final int MAX = 26;

   public static int[] countAlph(Scanner kb) throws IOException{
      int[] freqs = new int[26];

      String line = kb.nextLine();
      String str;

      //makes a string with everything in a file
      while(kb.hasNextLine()){
        line += kb.nextLine();
      }
      //makes string all caps
      str = line.toUpperCase();
      //System.out.println(line); //test if it prints

      //looks if string is a character and add one to an array slot
      for(int x = 0; x < line.length(); x++){
        if(Character.isLetter(str.charAt(x))){
          freqs[str.charAt(x)-'A']++;
        }
      }
	  // add code here to count the letters

      return freqs;
   }



   public static void printCount(int [] freqs)   {
      for (int i=0; i<freqs.length; i++) {
         int  ch = i + 'A';
         System.out.print("("+ ((char)ch) + "): " + freqs[i] + " : ");
         for(int j=0; j<freqs[i]; j++)
            System.out.print(".");
         System.out.println("");
      }
   }


   public static void main(String[] args) throws IOException{
      String fname = "filename.txt";

      Scanner kb = new Scanner (System.in);
      System.out.print("Enter the filename: ");
      fname= kb.nextLine();
      Scanner fin = new Scanner (new FileReader(fname));

      int [] freqs = countAlph( fin );
      printCount(freqs);

      System.out.println(Arrays.toString(freqs));
   }
}
