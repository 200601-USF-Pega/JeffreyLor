import java.util.InputMismatchException;
import java.util.Scanner;
public class TextMenu implements Menu
{

	@Override
	public void createOrder()
	{
		Scanner scan = new Scanner(System.in);
		FoodService service = new FoodService();
		boolean loop = true;
		
		while(loop)
		{
		
			System.out.println("What would you like to eat?\n(1) Sandwiches\n(2) Soups\n(3) Salads\n(4) Write Receipt\n(5) Read Receipt\n(6) Exit");
			
			
			int input = 0;
			try
			{
				input = scan.nextInt();
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Invalid option.");
				input = 0;
			}
			scan.nextLine();
			switch(input)
			{
			case 1:
				service.createSandwich();
				break;
			case 2:
				service.createSoup();
				break;
			case 3:
				service.createSalad();
				break;
			case 4:
				service.writeReceipt();
				break;
			case 5:
				service.readReceipt();
				break;
			case 6:
				loop = false;
				break;
			}
		}
	}

	@Override
	public void printReceipt()
	{
		
		
	}

}
