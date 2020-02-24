import java.util.Scanner;

public class HalfArrow_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    int arrowBaseHeight;
    int arrowBaseWidth;
    int arrowHeadWidth;


    System.out.println("Enter arrow base height:");
    arrowBaseHeight = userInput.nextInt();

    System.out.println("Enter arrow base width:");
    arrowBaseWidth = userInput.nextInt();

    System.out.println("Enter arrow head width:");
    arrowHeadWidth = userInput.nextInt();
    System.out.println("");


    for(int x = 0; x< arrowBaseHeight; x++){
      for(int y = 0; y <arrowBaseWidth; y++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int a = 0; a<arrowHeadWidth; a++){
      for(int z = a; z < arrowHeadWidth;z++){
        System.out.print("*");
      }
      System.out.println();
    }


  }


}
