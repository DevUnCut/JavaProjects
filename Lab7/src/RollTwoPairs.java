
public class RollTwoPairs {

	public static void main(String[] args) {
		PairOfDice firstDice;
		firstDice = new PairOfDice();
		PairOfDice secondDice;
		secondDice = new PairOfDice();
		
		int countRolls; // count how many times both dice have been rolled
		int total1; // total amount  on firstDice
		int total2; // total amount on secondDice
		
		countRolls = 0;
		do {  // roll both pairs of dice until the totals are the same
			firstDice.roll();
			total1 = firstDice.die1 + firstDice.die2; // gets the total of the first pair of dice
			System.out.printf("The first pair comes up to: %d\n", total1);
			
			secondDice.roll();
			total2 = secondDice.die1 + secondDice.die2;
			System.out.printf("The second pair of dice comes up to: %d\n", total2);
			
			countRolls++; // add 1 to countRolls to update how many rolls we've already done
			
		}while (total1 != total2);
		
		System.out.println("It took " + Integer.toString(countRolls) + " rolls untill the totals are the same.");

	}

}
