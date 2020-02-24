import java.util.Scanner;		//Juan Delgado CSC 180

public class QuotientCalc {

	public static void main(String [] args)
	{
		round();
	}

	public static void round()
	{
		int firstNum, secondNum;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter numerator: ");
		firstNum = userInput.nextInt();

		System.out.print("Enter a divisor: ");
		secondNum = userInput.nextInt();

		double FNum = firstNum, SNum = secondNum;

		if(secondNum == 0)
		{
			System.out.println("When dividing by zero you get underfined");
			round();
		}
		else
		{
			int divideAsInt = firstNum/secondNum;
			double divide = FNum / SNum;
			String twoDecimalPoints = String.format("%.2f", divide);

			System.out.print("When you divide " +firstNum+ " by "+secondNum+" as an Integer you get " +divideAsInt+
					"\nBut when " +firstNum+" divided by " +secondNum+ " is divided as a double you get "+ divide+
					"\nBut when rounded to the 2nd decimal point you get "+ twoDecimalPoints);
		}

	}

}
