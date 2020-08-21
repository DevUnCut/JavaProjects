import java.util.Scanner;

public class Primes {
	/*
	 * Design I. Get the lower bound from the user (≥ 2) A. prompt the user for a
	 * lower bound B. if the entry is invalid, complain gently and prompt again 1.
	 * Validation issue 1: nothing entered. a. "Please respond to the prompt" 2.
	 * Validation issue 2: not a valid integer a "'input' is not a valid integer 3.
	 * Validation issue 3: not ≥ 2 a "'input" not ≥ 2 II. Get the upper bound from
	 * the user. (≥ lower bound + 2) III. Find all prime numbers n such that lower
	 * bound ≤ n ≤ upper bound IV. Display those primes to the user V. Display the
	 * number of primes found to the user V. Say goodbye
	 * 
	 */
	final static String NULL_STRING = "";

	private static int getBoundary(int lowVal_, String prompt_, Scanner reader_) {
		int boundaryVal = 0;
		while (true) {
			System.out.print(prompt_);
			String answer = reader_.nextLine();
			if (answer.equals(NULL_STRING)) {
				System.out.println("Please respond to the prompt.");
				continue;
			} // if user entered nothing
			try {
				boundaryVal = Integer.parseInt(answer);
			} catch (Exception e) {
				System.out.printf("\"%s\" is not a valid integer, try again.\n", answer);
				continue;
			} // catch
			if (boundaryVal < lowVal_) {
				System.out.printf("The number you entered %d is less than %d\n", boundaryVal, lowVal_);
				continue;
			} // if lowerBound out of range
			break;
		} // while
		return boundaryVal;
	} // getBoundary()
	
	
    private static boolean isPrime(int num) {
        boolean primeNum = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
        	    if (num % i == 0)
        	    {
        	    	return false;
        	    }
        }
        return primeNum;
    }
    
    private static String primeNumsBetween(int lower_boundery, int upper_boundery)
    {
    	int counter = 0;
    	String primes_found = "";
    	for (int i = lower_boundery; i <= upper_boundery; i++)
    	{
    		if (isPrime(i))
    		{
    			counter += 1;
    			if (counter % 3 == 0)
    			{
    				primes_found += "\n";
    			}
    			primes_found += i + "\t";
    		}
    	}
    	
    	return primes_found;
    }

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int lowerBound = 0;
		int upperBound = 0;
		/*
		while (lowerBound < 2) {
			System.out.print("Enter lower bound for primes ≥ 2: ");
			String answer = reader.nextLine();
			if (answer.equals(NULL_STRING)) {
				System.out.println("Please respond to the prompt.");
				continue;
			} // if user entered nothing
			try {
				lowerBound = Integer.parseInt(answer);
			} catch (Exception e) {
				System.out.printf("\"%s\" is not a valid integer, try again.\n", answer);
				continue;
			} // catch
			if (lowerBound < 2) {
				System.out.printf("The number you entered %d is less than 2\n", lowerBound);
				continue;
			} // if lowerBound out of range
		} // while
		*/
		lowerBound = getBoundary(2,"Enter lower bound for primes (≥ 2): ", reader);
		System.out.printf("The lower bound is: %d\n", lowerBound);
		String upperPrompt = String.format("Enter upper bound for primes (≥ %d): ",
				lowerBound +2);
				
		upperBound = getBoundary(lowerBound +2,upperPrompt, reader);
		System.out.printf("The upper bound is: %d\n", upperBound);
		System.out.print(primeNumsBetween(lowerBound, upperBound) + " are all prime numbers !");
	} // main()

} // class primes
