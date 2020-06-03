import java.util.Arrays;

public class Sandwiches extends Food
{
	
	private int quantity;

	public Sandwiches()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Sandwiches(String name, String[] ingredients, int slices)
	{
		super(name, ingredients);
		// TODO Auto-generated constructor stub
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	@Override
	public String toString()
	{
		return "Sandwich [name=" + getName() + ", ingredients=" + Arrays.toString(getIngredients()) + ", quantity=" + quantity + "]";
	}
	

	
}
