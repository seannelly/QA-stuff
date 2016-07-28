package task4;

public class Ship {

	/* player owner?
	 * name?
	 * size?
	 * placed?
	 * starting? 
	 * ending? no end point is function of starting point + size against the vertical boolean
	 * orientation horizontal/vertical
	 * */
	public int size;
	public int[] startingPoint={0,0};
	boolean is_vertical;
	
	public Ship(int initialSize, int initX, int initY, boolean vertical)
	{
		size=initialSize; 
		startingPoint[0]=initX;
		startingPoint[1]=initY;
		is_vertical=vertical;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
