import java.util.Scanner;

public class Multi3Or5 {

	public static void main(String args[])
	{
		int numb;


		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		numb = userInput.nextInt();

		int three = 0;
		int five = 0;
		int both = 0;

		if(numb > 0)
		{
			for (int x = 1; x <= numb; x++)
			{
				if(x%3==0 && x%5==0)
				{
					three++;
					five++;
					both++;
				}
				else if(x %3 ==0)
				{
					three++;
				}
				else if(x%5==0)
				{
					five++;
				}
			}
			System.out.println("There is/are " +three+ " number(s) from 0 to "+numb+ " that are divisible by 3");
			System.out.println("There is/are " +five+ " number(s) from 0 to "+numb+ " that are divisible by 5");
			System.out.println("There is/are " +both+ " number(s) from 0 to "+numb+ " that are divisible by both 3 and 5");
		}
		else
		{
			System.out.print("Number cannot be negative or 0");
		}

	}

}
