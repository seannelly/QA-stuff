package task4;

public class Grid {

	
	// grid of semaphores?
	// 0 for empty
	// 1 for ship
	// 2 for miss?
	//-1 for hit
	// 9 for unknown?
	//
	
	int maxSize; //change to make shiny 
	int[][] board; //= new int[maxSize][maxSize];
	
	public Grid(int max)
	{
		maxSize=max;
		board=new int[maxSize][maxSize];

	}
	
	
	public void printGrid()// will need to add ships or an array list of ships and a parameter and amend draw function# 
	{	

		char xCoordinate= 'A';
		//prints board 
		System.out.print("  ");
		for (int k=0; k < maxSize; k++)
		{  
			System.out.print("   "+ xCoordinate++ );
		}
		System.out.print("\n");

		for (int i=0; i < maxSize; i++)
		{
			if (i<9) System.out.print(" ");
				
			System.out.print(i+1 + " |");
		for (int j =0; j < maxSize; j++)
			{
			//for if ship is present 
			switch(board[i][j])// maybe change to switch statement as this gets more complex 
					{
			case 1 :	//ship there 		
				System.out.print("****");
				break;
				// add something a little nicer for vertical stuff, get it to function first;
				//nicer things to come later in step 10 
			case -1: //hit
				System.out.print("!!!!");
				break;
			case 2 :  //miss
				System.out.print("xxxx");
				break;
			default: // 0
				System.out.print("___|");
				break;
		    	 }
			}
			
		System.out.print("\n");
		}
	}

	public void addShip(Ship boat)
	{
		 if ((boat.is_vertical && boat.startingPoint[0]+boat.size >= maxSize ) || (boat.is_vertical!= false  && boat.startingPoint[1]+boat.size >= maxSize))
			    // add statement for when another boat is already there 
		 {
			 
			 System.out.println("CANNOT PLACE BOAT THERE! Try again");
			 return;
		 }
		 
		 
	    //write check such that boat.startingPoint(X or Y depending on orientation)+ size cannot be greater than maxSize attribute
		//board[boat.startingPoint[0]][boat.startingPoint[1]]=1;
		if (boat.is_vertical)
		{
			
			//iterate vertical			 
			for (int i=0; i<boat.size; i++)
			{
				board[boat.startingPoint[0]+i][boat.startingPoint[1]]=1;
			}
		}
		else 
		{
			//go horizontal 
			for (int i=0; i<boat.size; i++)
			{
				board[boat.startingPoint[0]][boat.startingPoint[1]+i]=1;
			}
		}
	
	}
	
	public void guess(char column, int row)
	{ // returns an int to update the other players board? 
		//convert char to int
		int x = Character.getNumericValue(column) % 26; // or something similar, find the offset, of whatever it is 
		System.out.println(x);
		
	    int y =row;
	      
	    
	    switch(board[x][y]){
	    case 0:
	    	board[x][y]=2;//miss
	    	//return 2; 
	    case 1: //hit
	    	board[x][y]=-1;
	    	break;
	    case 2:
	    	System.out.println("You already guessed there!");
	    	break;
	    case -1:
	    	System.out.println("You already hit there!");
	    	break; 
	    	default:
	    		System.out.println("you broke it.");
	    	}	
		
	   
	}

}
