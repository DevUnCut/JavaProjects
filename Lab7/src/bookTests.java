
public class bookTests {
	
	public static void main(String[] args) {
		PairOfDice someDice;
		someDice = new PairOfDice(5,4); // 1st instance of PairOfDice object
		System.out.println(someDice.die1); // die1 = 5 since we set it in our constructor
		someDice.roll(); // this now picks a random number from 1 - 6
		System.out.println(someDice.die1);
		someDice.roll();
		someDice.roll();
		System.out.println(someDice.die1);
		PairOfDice anotherPair;
		anotherPair = new PairOfDice(); // this constructor calls our roll() method to assign each die a random number from 1 - 6.
		System.out.println(anotherPair.die1);
		/*
		anotherDice = new PairOfDice(); // our 2nd instance of PairOfDice NOTE they are two different object
		System.out.println(anotherDice);
		*/
	}
}
