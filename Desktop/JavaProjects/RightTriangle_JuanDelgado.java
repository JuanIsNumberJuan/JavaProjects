import java.util.Scanner;

public class RightTriangle_JuanDelgado{
  public static void main(String[] args){
    makeTri();
  }

  public static void makeTri()
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Input the height of your right triangle");
    int height = userInput.nextInt();

    String tri = "*";

    if (height <= 0)
    {
      System.out.println("Your triangle cannot have a height of negative or triangle.");
      makeTri();
    }
    else if(height == 1)
    {
      System.out.println("This is your triangle:\n" +tri);
    }
    else
    {
      for(int x = 0; x>=height; x++)
      {
        tri+= "\n";
        for(int y=0; y>x+1; y++)
        {
          tri += tri;
        }
      }
      System.out.println("This is your triangle:\n" + tri);
    }

  }

}
