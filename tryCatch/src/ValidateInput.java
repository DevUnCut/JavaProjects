import java.util.Scanner;
public class ValidateInput {
	private static final String NULL_STRING = "";
	private static final String QUIT = "Q";
	public static void main(String[] args) {
		//Use the Scanner constructor to create
		// an object to read from the keyboard
		Scanner reader = new Scanner(System.in);
		
		//Loop until the user enters a valid CCSF ID
		String studentID = NULL_STRING;
		
		// while(student.equals(NULL_STRING)
		while (true) {
			//prompt the user
			System.out.print("Enter your CCSF ID or 'Q' to quit: ");
			String input = reader.nextLine();
			//if (input== someOtherString) - tests and to see if input and 
			//  someOtherString reference the same object, not whether the contents
			//   are the same
			// String input_sav = input;
			// input = input.toUpperCase();
			// if (input.equals(QUIT)
			if (input.toUpperCase().equals(QUIT)) { //are the contents of input and QUIT the same
				System.out.println("Thanks and goodbye");
				System.exit(0);
			} // if
			
			studentID = input;
			//test 1: did the user enter anything
			if (studentID.contentEquals(NULL_STRING)) {
				System.out.println("You didn't enter anything!!");
				continue; //start over at next iteration
			}
			
			//test 2: is the input length 9, w or @ followed by 8 digits
			if (studentID.length() != 9) {
				System.out.printf("\"%s\" is not 'W' or '@' followed by 8 digits\n",
						studentID);
				continue; //start over at next iteration				
			} //if student is not 9 characters long
			
			//test 3: CCSF IDs start with @ or w
			char ch = studentID.toUpperCase().charAt(0);
			if (ch != '@' && ch != 'W') {
				System.out.printf("CCSF IDs start with '@' or 'W', not '%c'\n",
						ch);
				continue; //start over at next iteration
			}		
			
			//test 4: CCSF IDs end with 8 digits
			String suffix = studentID.substring(1);
			int num = 0;
			// to do within try/catch
			//again, give error message and continue if there's a problem.
			//if not, it's the last test, so break of the loop and make the
			//printf statement after the while loop reachable.
			try {
				num = Integer.parseInt(suffix);
				
				break;
				
			} catch (Exception e) {
				System.out.printf("you did not enter in a valid number, %d doesn't contain 8 digits\n", num);
			}
			
		}  while (true) {
		System.out.printf("Congratualtions classmates, you have entered a valid CCSF ID: \"%s\"",
				studentID);
		reader.close();
		break;
		}
	} //main ()

} //class ValidateInput