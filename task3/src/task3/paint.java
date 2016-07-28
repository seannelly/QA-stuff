package task3;

public class paint {
	public String name;
	public int volume;
	public int metersSquared;
	public int area;
	public double cost;
	public double squareMeterPerPound;
	
	public paint(String initalName, int initialVolume, int initialMeters, double initalCost)
	{
		name=initalName;
		volume=initialVolume;
		metersSquared=initialMeters;
		area= volume*metersSquared; 
		cost=initalCost;
		squareMeterPerPound= (volume*metersSquared)/cost;
	}

	
}
