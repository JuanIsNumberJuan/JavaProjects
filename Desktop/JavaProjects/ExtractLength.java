import java.util.Scanner;		//Juan Delgado CSC 180

public class ExtractLength{

	public static void main(String[] args)
	{
		findLength();
	}

	public static void findLength()
	{
		int size=0, yards = 0, feet = 0, inches = 0;

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a whole number and I will convert it in yards, feet, and inches: ");
		size = userInput.nextInt();
		int userSize = size;


		if(size <= 0)
		{
			System.out.print("A length cannot be negative or 0 \n" );
			findLength();
		}
		else
		{
			while(size > 0)
			{
				if (size >= 36)
				{
					size = size - 36;
					yards++;
				}
				else if (size >= 12)
				{
					size = size - 12;
					feet++;
				}
				else
				{
					size--;
					inches++;
				}
			}
		}

		System.out.print(userSize + " inches equals to "+yards+" yards, " +feet+ " feet, and "+inches+" inches.\n");
	}
}
