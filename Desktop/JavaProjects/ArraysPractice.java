import java.util.Scanner;

public class ArraysPractice{
  public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a number and we will find how many numbers there are");
    int num = userInput.nextInt();
    getArr(num);
  }

  public static void getArr(int x){
    int [] testArr1;
    testArr1 = new int[] {4, 3, 3, 3, 9, 6, 6, 13, 16, 7, 7, 7, 6, 7,9};

    int [] testArr2;
    testArr2 = new int[] {9, 9, 9, 3, 3, 3, 6, 7, 9, 9, 6, 6,7, 1,1,1,5,5,5,6,6};

    int counter = 0;
    int counter2 = 0;

    for(int y = 0; y < testArr1.length; y++)
    {
      if(x == testArr1[y]){
        counter++;
      }
    }
    System.out.println("There are "+counter+ " "+x+" in the first array");

    for(int z = 0; z < testArr2.length;z++)
    {
      if(x == testArr2[z]){
        counter2++;
      }
    }
    System.out.println("There are "+counter2+ " "+x+" in the second array");
    Scanner userInputt = new Scanner(System.in);


    //if statement acting up (won't run)
    System.out.println("Do you want to find if two numbers are together? y/n ");
    String choice = userInputt.nextLine();

    if(choice == "y" || choice == "Y"){
      Scanner userInput = new Scanner(System.in);

      System.out.println("What is your first number: ");
      int firstNum = userInput.nextInt();
      System.out.println("What is your second number: ");
      int secondNum = userInput.nextInt();
      findTwoNums(firstNum, secondNum);
    }
    else{
      System.out.println("ok");
    }

    }
    public static void findTwoNums(int a, int b){
      int [] testArr1;
      testArr1 = new int[] {4, 3, 3, 3, 9, 6, 6, 13, 16, 7, 7, 7, 6, 7,9};

      int [] testArr2;
      testArr2 = new int[] {9, 9, 9, 3, 3, 3, 6, 7, 9, 9, 6, 6,7, 1,1,1,5,5,5,6,6};

      int counter3 = 0;
      int counter4 = 0;
      for(int y = 0; y < testArr1.length-1;y++)
      {
        if(a == testArr1[y] && b == testArr1[y+1]){
          counter3++;
        }
      }
      System.out.println("There are "+counter3+ " "+a+" and " + b+" in the first array");

      for(int z = 0; z < testArr2.length-1;z++)
      {
        if(a == testArr2[z] && b == testArr2[z+1]){
          counter4++;
        }
      }
      System.out.println("There are "+counter4+ " "+a+" and " + b +" in the second array");
    }

}
