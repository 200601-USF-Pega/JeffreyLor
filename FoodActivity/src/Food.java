import java.io.Serializable;
import java.util.Arrays;

public abstract class Food implements Serializable
{
	private String name;
	private String [] ingredients;
	
	public Food()
	{
		
	}
	
	public Food(String name, String[] ingredients)
	{
		super();
		this.name = name;
		this.ingredients = ingredients;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getIngredients()
	{
		return ingredients;
	}

	public void setIngredients(String[] ingredients)
	{
		this.ingredients = ingredients;
	}

	@Override
	public String toString()
	{
		return "Food [name=" + name + ", ingredients=" + Arrays.toString(ingredients) + "]";
	}


}
