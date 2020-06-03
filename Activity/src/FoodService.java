import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodService
{
	
	private ArrayList<Food> foodList = new ArrayList<Food>();
	private final Scanner scan = new Scanner(System.in);
	
	public void createSandwich()
	{
		System.out.print("What is the name of the sandwich? ");
		String name = scan.nextLine();
		System.out.println("What do you want in the sandwich? (separate by commas)");
		String ingredient = scan.nextLine();
		String [] ingredients = ingredient.split(",");
		System.out.print("How many sandwiches? ");
		int quantity = scan.nextInt();
		scan.nextLine();
		
		Food food = new Sandwiches(name, ingredients, quantity);
		foodList.add(food);
		//System.out.println(food);
	}
	
	public void createSoup()
	{
		System.out.print("What is the name of the soup? ");
		String name = scan.nextLine();
		System.out.println("What do you want in the soup? (separate by commas)");
		String ingredient = scan.nextLine();
		String [] ingredients = ingredient.split(",");
		System.out.print("How many ounces? ");
		int quantity = scan.nextInt();
		scan.nextLine();
		
		Food food = new Soups(name, ingredients, quantity);
		foodList.add(food);
		//System.out.println(food);
	}
	
	public void createSalad()
	{
		System.out.print("What is the name of the soup? ");
		String name = scan.nextLine();
		System.out.println("What do you want in the soup? (separate by commas)");
		String ingredient = scan.nextLine();
		String [] ingredients = ingredient.split(",");
		System.out.print("What kind of dressing? ");
		String dressing = scan.nextLine();
		
		Food food = new Salads(name, ingredients, dressing);
		foodList.add(food);
		//System.out.println(food);
	}
	
	public void writeReceipt()
	{	
		try
		{
			ObjectOutputStream objectOutputStream = 
					new ObjectOutputStream(new FileOutputStream("receipt.txt"));
			objectOutputStream.writeObject(foodList);
			objectOutputStream.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	public void readReceipt()
	{
		try {
			ObjectInputStream inputStream = 
					new ObjectInputStream(new FileInputStream("receipt.txt"));
			ArrayList<Food> list = (ArrayList<Food>)inputStream.readObject();
			for(Food f : list)
			{
				System.out.println(f);
			}
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
