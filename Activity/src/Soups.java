import java.util.Arrays;

public class Soups extends Food
{
	
	private int ounces;

	public Soups()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Soups(String name, String[] ingredients, int ounces)
	{
		super(name, ingredients);
		this.ounces = ounces;
		// TODO Auto-generated constructor stub
	}

	public int getOunces()
	{
		return ounces;
	}

	public void setOunces(int ounces)
	{
		this.ounces = ounces;
	}

	@Override
	public String toString()
	{
		return "Soup [name=" + getName() + ", ingredients=" + Arrays.toString(getIngredients()) + ", ounces=" + ounces + "]";
	}
	
	
	
}
