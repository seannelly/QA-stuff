package task3;

import java.util.Scanner;

public class taskThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// constructor is (name, volume, meteresSquared , cost(£));
		// assuming these are given and not asking for user input on kinds of
		// paint
		paint cheapoMax = new paint("Cheapo Max", 20, 10, 19.99);
		paint averageJoes = new paint("average Joes", 15, 15, 17.99);
		paint duluxoursPaints = new paint("Duluxorous Paints", 10, 20, 25.00);

		// cheapomax 20liters at 10 m2/L is 200m2 £19.99
		// average joes 15 liters 15m2 is 225 per liter £17.99
		// duluxourouspaints 10 liters 20m2 per liter is 200m2 total £25

		paint[] paintBrands = new paint[3];// magic number 3 is amount of paint
											// brands . but for trivial exercise
											// is ok in this instance
		paintBrands[0] = cheapoMax;
		paintBrands[1] = averageJoes;
		paintBrands[2] = duluxoursPaints;
		// there is probably a nicer way to populate the array

		/*
		 * //uncomment to check thing works right
		 * System.out.println(cheapoMax.squareMeterPerPound);
		 * System.out.println(averageJoes.squareMeterPerPound);// best deal
		 * System.out.println(DuluxoursPaints.squareMeterPerPound);
		 */

		// initial values
		paint bestDeal = paintBrands[0]; // is this a shallow copy?
		paint secondBest = paintBrands[0];

		// make work science. iterate array and find best square meter per £
		for (int i = 0; i < paintBrands.length; i++) {
			if (bestDeal.squareMeterPerPound < paintBrands[i].squareMeterPerPound) {
				secondBest = bestDeal;
				bestDeal = paintBrands[i];
			}

		}

		// maybe come back later and ask for simpler measurements like number of
		// walls/height/width and do math to it
		System.out.print("space needed to paint in square meters: ");
		Scanner reader = new Scanner(System.in);
		double sizeOfRoom = reader.nextDouble();

		int paintNeeded = (int) (sizeOfRoom / bestDeal.area);
		double remainder = (sizeOfRoom % bestDeal.area);

		if (remainder == 0) {
			System.out.println(paintNeeded + " cans of " + bestDeal.name);// "cans"
																			// always
																			// plural
		} else if (remainder > 0 && remainder > secondBest.area)// if a can of
																// second best
																// priced paint
																// will not
																// cover then
																// buy a can of
																// the best
																// paint?
		{// check for every case. not sure this always holds
			paintNeeded++;
			System.out.println(paintNeeded + " cans of " + bestDeal.name);
		} else {
			System.out.println(paintNeeded + " cans of " + bestDeal.name
					+ " and 1 can of " + secondBest.name);
		}
		/*
		 * Thinking about this, in the real world you'd never mix paint brands
		 * since the colors would NEVER mix quite right. so then should this if
		 * statement really be needed and just round up on the best deal?
		 */

	}

}
