//Juan Delgado
//CSC 121
import java.util.Scanner;

public class GetArray{

  public static void main(String [] args){
    GetArray test = new GetArray();
  }
  public GetArray(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("How big do you want your array?: ");
    int x = userInput.nextInt();
    getArray(x);


  }
  public int[] getArray(int n){
    int[] nums = new int[n];
    Scanner Input = new Scanner(System.in);

    System.out.println("Enter your numbers: ");
    for(int y = 0; y < n; y++){
      nums[y] = Input.nextInt();
    }
    returnMaxMin(nums);
    countZeroSum(nums);
    return nums;
  }

  public int[] returnMaxMin(int[] arr){
    int min =0;
    int max=0;
    for(int x = 0; x< arr.length-1; x++){
      if(arr[x]<arr[x+1]){
        min = arr[x];
        max = arr[x+1];
      }
      else{
        min=arr[x+1];
        max=arr[x];
      }
    }
    System.out.println("Min is "+min+" Max is "+max);

    return arr;
  }
  public int countZeroSum(int[] arr){
    int counter = 0;
    int z;
    for(int x = 0; x<arr.length;x++){
      for(int y = x; y<arr.length; y++){
        z = arr[x]+arr[y];
        if(z == 0 ){
          counter++;
        }
      }
    }
    System.out.println("There are "+counter+ " pairs");

    return counter;
  }
}
