import java.util.Scanner;
import java.util.Arrays;

public class ReversingArray_JuanDelgado{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    int [] userList;
    int [] reverseList;
    int numElements;//how many numbers are in the array
    String nums = ""; //gathers all numbers less then last num
    String num = ""; //make an integer from array to string
    System.out.println("Enter amount of numbers, enter numbers you want to reverse: ");
    numElements = userInput.nextInt();//numbers in array
    if(numElements < 20){
      userList = new int[numElements];//makes array with numElements amount
      reverseList = new int[numElements];
      for(int x = 0; x<numElements; x++)
      {
        userList[x] = userInput.nextInt();
      }
      for(int y = 0; y<numElements; y++)
      {
        nums += Integer.toString(userList[userList.length-y-1]) + " ";
        //makes an array backwords
        //reverseList[y] = userList[userList.length-y-1];
      }
      //prints array backwords
      //System.out.println(Arrays.toString(reverseList));
      System.out.println(nums);
    }

  }
}
