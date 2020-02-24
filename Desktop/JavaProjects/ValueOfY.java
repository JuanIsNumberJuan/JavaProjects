import java.util.Scanner;

public class ValueOfY {

	public static void main(String args[])
	{

		Scanner UserInput = new Scanner(System.in);

		System.out.print("Enter an x value to find the y value for the function y=4x+3.5: ");
		double x = UserInput.nextDouble(); //Initialized x to be whatever the user inputs

		double y = (4 * x) + 3.5; // y = mx+b

		System.out.print("If your x value is " + x + " then your y value is " + y);



	}
}
