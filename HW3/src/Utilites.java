import java.util.ArrayList;
import java.util.Scanner;

public class Utilites {
	private final static int NOT_FOUND = -1;
	
	/*
	 * numbers: 11 25 30 45 51 58 65 79 91
	 * 
	 * value: 38 --- to reach this value it takes 3 brute force comparison attempts,
	 * 	worst case for brute force is the length of numbers which in 9
	 * 
	 * binary search:
	 * 1. check middle item.
	 * 	1a. the middle item is at position (low + high)/2 = 4
	 * 	1b. the item at position 4 is 51, and 51 > 38
	 * 2. if the middle item is greater than value then make a recursive call:
	 * 		return binarySearch(numbers,38,0.4)
	 * 
	 * 		if low > high then return -1
	 * 		middle = (low + high) /2 = (0 + 4)/2 = 2
	 * 		middle value = 38 hooray!
	 * 		return 2
	 * 
	 * 
	 * 		suppose though, were looking for 37
	 * 		return binarySearch(numbers,37,0,2)
	 * 		if low > high return NOT_FOUND, e.g., -1
	 * 		middle = 1
	 * 		25 < 37, so we've got to look in the greater values
	 * 		return binarySearch(numbers,37,2,2)
	 * 		middle = 2
	 * 		38 > 37
	 * 
	 * 		The base case is if low == high and not found then will return -1
	 */
	public static int binarySearch(ArrayList<Integer> numbers, int value, int low, int high) {
		int middle = (low + high)/2;
		// base case
		// is the middle entry in numbers equal to the value parameter? if so, return the middle
		if (numbers.get(middle) == value) {
			// hooray, found it!
			return middle;
		}
		if (low == high) {
			// give up
			return NOT_FOUND;
		}
		// in case numbers.get(middle) > value -- search lower
		if (numbers.get(middle) > value) {
			return binarySearch(numbers, value, low, middle -1);
		}
		// in case numbers.get(middle) < value -- search higher
		else {
			return binarySearch(numbers, value, middle + 1, high);
		}
	} // binarySearch()

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			int nMinusOne = factorial(n-1);
			System.out.printf("%d! = %d; %d! = %d\n",
					n-1, nMinusOne, n, n*nMinusOne);
			return n * nMinusOne;
		}
	}// factorial()

	public static void main(String []args) {
		
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> test = new ArrayList<>();
		
		test.add(11); test.add(25); test.add(38); test.add(49); test.add(51);
		test.add(66); test.add(72); test.add(84);
		
		do {
			System.out.print("Enter number to seach for or hit return to quit: ");
			String ans = reader.nextLine();
			if (ans.length() == 0) {
				break;
			}
			int number = Integer.parseInt(ans);
			int result = binarySearch(test, number, 0, test.size());
			System.out.printf("binarySearch() returned %d", result);
			break;
		} while(true);
	}
}
