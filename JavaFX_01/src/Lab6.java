/*
    1. Get a time stamp marking when the program started executing.
    2. Prompt the user for an elapsed time in seconds to use, or give them an option to use the actual elapsed time.
    3. whether using the actual or user entered elapsed time, then format that result in a human friendly way in terms of days, hours, minutes, and seconds.
    4. say Goodbye !
 
 */
import java.util.Date;
import java.util.Scanner;


public class Lab6 {

	public static void main(String[] args) {
		//long startMilliSec = new Date().getTime();  -- equivalent to 2 lines bellow --
		final String NULL_STRING = "";
		Scanner reader = new Scanner(System.in);
		Date startDate = new Date();
		long startMilli = startDate.getTime();
		//long programRunTime = startDate.getTime();
		long endMilli = 0;
		long elapsedMilli = 0;
		System.out.print("Enter elapsed time in seconds, or hit enter to use the actual time elapsed: ");
		String ans = reader.nextLine();
		// we can make a better regex we can do that later !!
		while(ans.matches("^[A-Za-z]+|^-[\\d]+")) {
			System.out.println("you didn't enter in a valid input");
			System.out.print("Enter elapsed time in seconds, or hit enter to use the actual time elapsed: ");
			ans = reader.nextLine();
			continue;
		}
		if (ans.equals(NULL_STRING)) {
			endMilli = new Date().getTime();
		}
		else {
			endMilli = startMilli + (Long.parseLong(ans) * 1000);
		}
		
		
		elapsedMilli = endMilli - startMilli;
		//Ultimately, before submission, we should translate elapsedMilli into
		// Hours, Minutes, seconds. But for now
		long elapsedSeconds = elapsedMilli / 1000;
		System.out.printf("Elapsed milliseconds = %d, seconds = %d\n", elapsedMilli, elapsedSeconds);
		long eMinutes = elapsedSeconds / 60;
		long eSeconds = elapsedSeconds % 60;
		long eHours = elapsedSeconds / 3600;
		long eDays = eHours / 24;

		if (eDays >=1 && eHours % 24 == 0 && eMinutes % 60 ==0 && eSeconds % 60 == 0) {
			System.out.printf("%d Days\n", eDays);
		}

		else if	(eHours >= 24 && eMinutes % 60 == 0 && eSeconds % 60 == 0) {
			System.out.printf("%d Days, %d hours\n",eDays, eHours % 24);
		}
		else if (eHours >= 24 && eHours % 24 >= 1 && eSeconds >= 1 ) {
			System.out.printf("%d Days, %d hours, %d seconds\n", eDays, eHours % 24, eSeconds % 60);
		}
		else if (eHours >= 24 && eMinutes % 60 >=1 && eSeconds >=1) {
			System.out.printf("%d Days, %d minutes, %d seconds\n", eDays, eMinutes % 60, eSeconds % 60);
		}
		else if (eHours >= 24 && eMinutes >= 1 && eSeconds % 60 == 0) {
			System.out.printf("%d Days, %d minutes\n", eDays, eMinutes % 60);
		}
		else if (eHours >= 24 && eMinutes % 60 == 0 && eSeconds >= 1) {
			System.out.printf("%d Days, %d seconds\n", eDays, eSeconds % 60);
		}
		else if (eHours == 0 && eMinutes >= 1 && eSeconds >= 1) {
			System.out.printf("%d minutes, %d seconds\n",eMinutes, eSeconds);
		}
		else if (eMinutes / 60 >= 1  && eSeconds % 60 == 0) {
			System.out.printf("%d hours, %d minutes\n", eHours % 60, eMinutes % 60);
		}
		else if (eHours >= 1 && eMinutes >=1 && eSeconds >= 1) {
			System.out.printf("%d hours, %d minutes, %d seconds\n", eHours, eMinutes % 60, eSeconds % 60);
		}
		else {
			System.out.printf("%d seconds\n", eSeconds % 60);
		}
		reader.close();
		System.out.println("Goodbye !");
		
	}

}
