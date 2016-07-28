package task2;

import java.util.Scanner;

public class taskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);

		System.out.print("How many?:");
		
		int n= reader.nextInt();
		  
		int j=0;
		while (j < n+1)
		{
		for(int i=0; i<j; i++)
			{
			System.out.print("*");
		
			}
		System.out.print("\n");
		j++;
    	} 
	}

}
