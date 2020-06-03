
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
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
		System.out.print("What is the name of the salad? ");
		String name = scan.nextLine();
		System.out.println("What do you want in the salad? (separate by commas)");
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
			FileWriter fw = new FileWriter("receipt.txt");
			for(Food f : foodList)
			{
				fw.write(f.toString());
			}
			fw.flush();
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	public void readReceipt()
	{
		try {
			FileReader fr = new FileReader("receipt.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int i;
	        while((i=br.read())!=-1){
	        	System.out.print((char)i);
	        }
	        br.close();   
	        fr.close();
	        System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
