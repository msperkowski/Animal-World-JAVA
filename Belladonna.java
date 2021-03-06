import java.io.*;
public class Belladonna extends Plant
{
	Belladonna(World world, Point position)
	{
		super(world, position, 99);
		species = "Belladonna";
	}

	@Override
	public void fight(Organism other)
	{
		try
		{
			world.addToLog(other.species + " has been poisoned by a belladonna and died!");
		}
		catch (IOException ex)
		{
			System.err.println("Caught IOException: " + ex.getMessage());
		}
		if (other.getPower() >= power)
		{
			other.die();
			die();
		}
		else
			other.die();
	}

	@Override
	protected void createNew(int i, Point position)
	{
		world.organisms[i] = new Belladonna(world, position);
	}

	@Override
	public void draw()
	{
		world.drawSingle(position, "plants/belladonna.png", "belladonna");
	}
}
