//Jake Kickbush, Kenneth Tovera, Jeffrey Lor, Kenneth Haynes
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] pizzaIngredients = {"Sauce", "Sausage", "Pepperoni", "Dough"};
		
		try {
			Food food1 = new Food("Pizza", pizzaIngredients, 100);
			
			System.out.println(food1);
		}
		
		catch (Exception e) {
			
			System.out.println("Error");
			
		}

	}

}
