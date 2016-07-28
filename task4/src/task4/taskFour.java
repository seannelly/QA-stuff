package task4;

public class taskFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///
		Grid player1= new Grid(3);
		Grid player2= new Grid(3);
		//construction is (size, initialX initialY is_vertical)
		Ship patrolBoat1= new Ship(2, 1, 0, false);
		Ship patrolBoat2= new Ship(2, 0, 0, true);
		Ship battleShip1= new Ship(3, 0, 0, true);
		Ship battleShip2= new Ship(3, 0, 0, true);
		Ship submarine= new Ship(3, 0, 0, true);
		Ship destroyer= new Ship(4, 0, 0, true);
		Ship Carrier = new Ship(5, 0, 0, true);
		//need to build prompt for user to figure out placement and junk 
		
		//char something = 'A';
		//System.out.println(something);
		
		player1.printGrid();
		
		//System.out.println("adding boat");
		player1.addShip(patrolBoat1);
		//System.out.println("boat added!");
		  
		
		player1.printGrid();
		
		player1.guess('A', 1);
		
		
		

	}

}
