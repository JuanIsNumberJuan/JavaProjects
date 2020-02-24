import java.util.Scanner;

public class ThaiKickboxing_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter weight: ");
    int num = userInput.nextInt(); //user input
    String WeightClass = ""; //The weight class(s) that will be output

    //weight list
    int[] weights = {0,112,115,118,122,126,130,135,140,147,154,160,167,174,183,189,198,209};

    //class list
    String[] weightClass = {"Fly Weight", "Super Fly Weight", "Bantam Weight",
    "Super Bantam Weight", "Feather Weight", "Super Feather Weight", "Light Weight",
     "Super Light Weight", "Welter Weight", "Super Welter Weight", "Middle Weight",
     "Super Middle Weight", "Light Heavy Weight", "Super Light Heavy Weight",
     "Cruiser Weight", "Super Cruiser Weight", "Heavy Weight", "Super Heavy Weight"};

     if(num < 0){ //if weight less then 0 it prints out invalid
       System.out.println("Invalid Input");
       return;
     }

     //if weight is greater then or equal to 209 it is atomatically super heavy weight
     if(num>=weights[weights.length-1])
     {
       WeightClass = weightClass[weightClass.length-1];
       System.out.println(WeightClass);
       return;
     }

     //compares if user input is between two numbers or if it is equal to any numbers in the list
     for(int x = 0; x < weights.length; x++)
     {
        if(num>=weights[x] && num <= weights[x+1])
        {
          WeightClass += weightClass[x] + ". ";
        }
     }


     System.out.println(WeightClass);

  }
}
