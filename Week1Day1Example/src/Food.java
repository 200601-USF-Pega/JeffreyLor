import java.util.Arrays;

public class Food {
	
	private String name;
	private String[] ingredients;
	private int calories;
	
	
	public Food() {
		
		
	}
	
	
	public Food(String name, String[] ingredients, int calories) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.calories = calories;
	}
	
	


	@Override
	public String toString() {
		return "Food [name=" + name + ", ingredients=" + Arrays.toString(ingredients) + ", calories=" + calories + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getIngredients() {
		return ingredients;
	}


	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	

}
