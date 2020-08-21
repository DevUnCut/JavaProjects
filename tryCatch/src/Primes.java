import java.util.Scanner;

public class Primes {
	/*
	 *  Design
	 * I. Get the lower bound from the user (>= 2)
	 *     A. prompt the user for a lower bound
	 *     B. if the entry is invalid, complain gently and prompt again
	 *         1. Validation issue 1: nothing entered
	 *             a. "please respond to the prompt"
	 *         2. Validation issue 2: not a valid integer
	 *             a. "'input' is not a valid integer
	 *         3. Validation issue 3: not >= 2
	 *             a "'input' not >= 2
	 * II. Get the upper bound from the user (>= lower bound + 2)
	 * III. Find all prime numbers n such that lower bound <= n <= upper bound
	 * IV. Display those primes to the user
	 * V. Say goodbye
	 */
	
	final static String NULL_STRING = "";
	
	private static boolean isPrime(int num)
	{
		boolean retVal = false;
		if (num == 2)
		{
			return true;
		}
		if (num % 2 == 0)
		{

		}
		return retVal;
	}
	
	private static int getBoundry(int lowVal, String prompt, Scanner reader)
	{
		int boundryVal = 0;
		while (true)
		{	
			System.out.print(prompt);
			String answer = reader.nextLine();
			if (answer.equals(NULL_STRING))
			{
		        System.out.println("please respond to the prompt.");
		        continue;
			}// if user enters nothing
			try
			{
			    boundryVal = Integer.parseInt(answer);	
			} catch (Exception e)
			{
				System.out.printf("\"%s\" is not a valid integer, try again", answer);
				continue;
			}// catch
			if (boundryVal < lowVal) {
				System.out.printf("the number you entered %d is less than %n", boundryVal, lowVal);
				continue;
			}
			break;
		}
		return boundryVal;
	}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		int lowerBound = 0;
		int upperBounnd = 0;
		
		while (lowerBound < 2)
		{
			System.out.print("Enter lower bound for primes >= 2");
			String answer = reader.nextLine();
			
			if (answer.equals(NULL_STRING))
			{
		        System.out.println("please respond to the prompt.");
		        continue;
			}// if user enters nothing
			
			try
			{
			    lowerBound = Integer.parseInt(answer);	
			} catch (Exception e)
			{
				System.out.printf("\"%s\" is not a valid integer, try again", answer);
				continue;
			}// catch
			if (lowerBound < 2) {
				System.out.printf("%d < 2", lowerBound);
				continue;
			}
		}// while
		
		lowerBound = getBoundry(2,"Enter lower bounds for primes (>= 2): ", reader);
		// System.out.printf("the lower bound is : %d", lowerBound);
		String upperPrompt = String.format("Enter upper bounnd for primes (>= %d): ", reader);
		System.out.printf("The lower bound is: %d\n", lowerBound);
		upperPrompt = String.format("", args);
	}// main()

}// class Primes
