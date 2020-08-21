
public class PairOfDice {
    public int die1 ;//= (int) (Math.random() * 6) + 1;
    public int die2 ;//= (int) (Math.random() * 6) + 1;
    
    // constructor that sets initial value for a pair of dice
    public PairOfDice(int val1, int val2) {
    	die1 = val1;
    	die2 = val2;
    }
    
    public void roll() {
    	die1 = (int) (Math.random() * 6) + 1;
    	die2 = (int) (Math.random() * 6) + 1;
    }
    /*
         Let's create some constructors for of PairOfDice class
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		The definition of a constructor looks much like the definition of any other subroutine,
		but with 3 major exceptions !
		1) A constructor does NOT have a return type (NOT EVEN void)
		2) The name of the constructor MUST be the SAME name as the class in which it is defined in.
		3) Lastly The ONLY MODIFIERS that can be used on a constructor definition are those with the access modifiers labeled as:
			public, private, and protected A CONSTRUCTOR CANNOT BE STATIC
		
		A constructor has a subroutine(method) body of the usual form. blocks of statements. There are no restrictions on what statements can be used
		The ability to include parameters is one of the main reasons for using constructors. The parameters can provide data to be used in the
		construction of the object. 
		
		The value of a constructor should be used in some way for example:
			
			PairOfDice dicePair; // declaring variable of type PairOfDice
			dicePair = new PairOfDice(1, 1); // let dicePair refer to a new PairOfDice object, whose instance variables are initially set to 1 and 1.
			
		Since we now defined a constructor for our PairOfDice class, we can NO LONGER create an object by saying "new PairOfDice()" or by using the
		default constructor.
		In our current version of PairOfDice, there's only one constructor for the entire class and it requires two parameters ! This is not a problem.
		We can add a second constructor or however many we want to have in our class(as long as their signatures are unique.
		That is that as long as they have different numbers, or types of formal parameters  
		 	for example - maybe create one constructor with no parameters ? - that'll produce a PairOfDice object showing random numbers.
     */
    public PairOfDice() { //construct a PairOfDice object that when called, it sets each of the dice to be a random number between 1 and 6.
    	// Since we've already made a method that'll assign a random number to each of our die variables we
    	// just have to call on the roll() method
    	/*
    	die1 = (int) ((Math.random() * 6) + 1);
    	die2 = (int) ((Math.random() * 6) + 1);
    	*/
    	roll();
    }

}
