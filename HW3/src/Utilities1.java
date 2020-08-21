import java.util.ArrayList; 
import java.util.Scanner;

public class Utilities1 {
	public static int NOT_FOUND = -1;

	public static long getLong(String line_, char delim_) {

		int delimitPos = line_.indexOf(delim_); // get pos. of space after timestamp
		long longVal = Long.parseLong(line_.substring(0, delimitPos));
		return longVal;
	} // getLong()

	public static int getInt(String line_, char delim_) {

		int delimitPos = line_.indexOf(delim_); // get pos. of space after timestamp
		int intVal = Integer.parseInt(line_.substring(0, delimitPos));
		return intVal;
	} // getInt()

	public static String adjString(String line_, char delim_) {
		int delimitPos = line_.indexOf(delim_); // get pos. of space after timestamp
		return line_.substring(delimitPos + 1);
	}

	
	/*
	 *    numbers: 11  25 38 45 51 58 65 79 91
	 *    value:  38 -- takes 3 brute force comparisons, worst case for brute fore
	 *    is length of numbers which is 9
	 *    
	 *    binary search: 
	 *    1. check middle item. 
	 *       1.a the middle item is at position (low + high)/2  = 4
	 *       1.b  the item at pos 4 is 51, and 51 > 38
	 *    2.  if the middle item is greater than value then make recursivce call:
	 *        return binarySearch(numbers,38,0,4)
	 *        
	 *        if low > high then return -1
	 *        middle = (low + high)/2 = (0 + 4)/2 = 2
	 *        middle value = 38,hooray! 
	 *        return 2
	 *        
	 *        suppose though, we were looking for 37
	 *        return binarySearch(numbers,37,0,2)
	 *        if low > high return NOT_FOUND, e.g., -1
	 *        middle = 1
	 *        25 < 37, so we've got to look in the greater values
	 *        return binarySearch(numbers,37,2,2)
	 *        middle= 2
	 *        38 > 37
	 *        return binarySearch(numbers,37,1,2)
	 *        middle= 1
	 *        
	 *        The base case is if low ==  high and not found then
	 *        will return -1
	 *        
	 *        
	 *        numbers: 11  25 38 45 51 58 65 79 91
	 */
	
	public static int binarySearch(ArrayList<Integer> numbers, int value,int low, int high) {
		int middle = (low + high) / 2;
		//base case
		
		if (low == high  ) {
			//give up
			return NOT_FOUND;
		}
		if (numbers.get(middle) == value ) {
			//hooray, found it!
			return middle;
			
		}
		
		//in case numbers.get(middle) > value
		if (numbers.get(middle) > value) { // we need to check lower
			
			return binarySearch(numbers,value,low,middle); 
			/*
			 lower the highest boundary by the
			 middle and not middle -1 why?
			 even though we've checked the current middle index, we still
			 its current value to be able the high value, we need to get the
			 middle distance between the low and high values if we we're to minus 1 from it
			 we won't get the correct distance.
			*/
		}
		// we need to check higher
		else {
			return binarySearch(numbers,value, middle + 1,high);  // raise the lower boundary
			
		}
		
	} //binarySearch()
	
	public static int factorial(int n) {
		if (n ==1) {
			return 1;
		}
		else {
			int nMinusOne = factorial(n-1);
			System.out.printf("%d! = %d; %d! = %d\n",
					n-1,nMinusOne,n,n*nMinusOne);
			return n * nMinusOne;
		}
	} //factorial
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> test = new ArrayList<>();
		test.add(11); test.add(25); test.add(38); test.add(49); test.add(51);
		test.add(66); test.add(72); test.add(84);
		
		do {
			System.out.print("Enter number to seach for or hit return to quit: ");
			String ans = reader.nextLine();
			if (ans.length()  == 0) {
				break;
			}
			int number = Integer.parseInt(ans);
			int result = binarySearch(test,number,0,test.size());
			System.out.printf("binarySearch() returned %d\n",result);
			
		} while (true);
		
		
		//System.out.printf("%d\n", factorial(6));
		//System.out.print(("Enter n: ");
		
		if (false) {	
		String line = "1574636086288 90 Active";
		long val = getLong(line, ' ');
		String restOfLine = adjString(line, ' ');
		System.out.printf("long is %d, rest of string is \"%s\"\n", val, restOfLine);
		}
		
	} // main()
}