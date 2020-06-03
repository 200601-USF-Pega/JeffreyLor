import java.util.Arrays;

public class Salads extends Food
{
	
	private String dressing;
	
	public Salads()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Salads(String name, String[] ingredients, String dressing)
	{
		super(name, ingredients);
		this.dressing = dressing;
		// TODO Auto-generated constructor stub
	}

	public String getDressing()
	{
		return dressing;
	}

	public void setDressing(String dressing)
	{
		this.dressing = dressing;
	}

	@Override
	public String toString()
	{
		return "Salad [name=" + getName() + ", ingredients=" + Arrays.toString(getIngredients()) + ", dressing=" + dressing + "]";
	}

}
