import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args)
	{
		Tax();
	}


	public static void Tax()
	{
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter '1' for single or '2' for married");
		int taxPayer = userInput.nextInt();



		final double RATE1 = .10;
		final double RATE2 = .25;
		final double RATE1_Single = 32000;
		final double RATE2_Married = 64000;

		double tax1 = 0;
		double tax2 = 0;

		if (taxPayer == 1)
		{
		System.out.println("Please enter your income: ");
		int income = userInput.nextInt();
			if(income<=RATE1_Single)
			{
				tax1 = income*RATE1;
			}
			else
			{
				tax1 = RATE1_Single*RATE1;
				tax2 = (income - RATE1_Single)*RATE2;
			}
		}
		else if(taxPayer == 2)
		{
		System.out.println("Please enter your income: ");
		int income = userInput.nextInt();
			if(income<=RATE2_Married)
			{
				tax1 = income * RATE1;
			}
			else
			{
				tax1 = RATE2_Married*RATE1;
				tax2 = (income-RATE2_Married)*RATE2;
			}
		}
		else
		{
			System.out.println("Retry");
			Tax();
		}
		System.out.println("Your tax is: " +(tax1 + tax2));

	}
}
