import java.util.Scanner;
//import java.util.Arrays;
// use this if you want to print the whole array

public class FindAllBelow_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    int[] userValues;
    int lastNum;//last number in array
    int numElements;//how many numbers are in the array
    String nums = ""; //gathers all numbers less then last num
    String num = ""; //make an integer from array to string
    System.out.println("Enter amount of numbers, enter all numbers, enter what number you want to compare: ");
    numElements = userInput.nextInt();//numbers in array
    if(numElements<20){
      userValues = new int[numElements];//makes array with numElements amount

      for(int x = 0; x<numElements; x++){
        userValues[x] = userInput.nextInt(); //makes array with user inputs
      }

      lastNum = userInput.nextInt(); //initializes last num to last num in array

      for(int y = 0; y<numElements; y++){
        if(userValues[y]<=lastNum) //compares numbers array to the last num
        {
          num = Integer.toString(userValues[y]);
          nums += num + " ";
        }
      }
      //turns array to string and it prints out
      //System.out.println(Arrays.toString(userValues));

      //prints last number of array
      //System.out.println(lastNum);

      System.out.println(nums); //prints number less then the number given

    }

  }
}
