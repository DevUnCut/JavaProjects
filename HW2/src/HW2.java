import java.io.*;

import java.util.Scanner;
import java.util.Date;

public class HW2 {
	
	private static final String NULL_STRING = "";
	static long startTime;
	static long endTime;
	
	public static String newFormat(String oldName) { //replace ' ' with '_', '/' with '-', and delete all !'s and @'s
		oldName = oldName.replace(' ', '_');
		oldName = oldName.replace('/', '-');
		oldName = oldName.replace("!", NULL_STRING);
		oldName = oldName.replace("@", NULL_STRING);
		
		// this adds the prefix to our file (our user doesn't have to know about this 
		String preFix = "ACTIVITY-";
		int preFixIdx = oldName.indexOf(preFix);
		if (preFixIdx == -1) {
			oldName = preFix + oldName;
		}
		return oldName;
	} // newFormat(oldName)
	
	private static PrintWriter createFile(String fileName_) throws IOException {
		PrintWriter pw = null;
		
		
		String fileName = fileName_;
		fileName = newFormat(fileName);
		// check to see if the file name already exists if so add a suffix to the file
		int version = 1;
		String fileNameProper = fileName;
		String fileExt = NULL_STRING;
		String prefix = "ACTIVITY-";
		int extPos = fileNameProper.lastIndexOf('.');
		
		if (extPos != -1) {
			fileExt = fileName.substring(extPos);
			fileNameProper = fileName.replace(fileExt, NULL_STRING);
		}
		else {
			fileExt = ".txt";
			fileNameProper = fileName;
		}
		
		// Lets check to see if this our users input matches our format, if not display them the new format.
		if (!fileName.replace(prefix, NULL_STRING).equals(fileName_)) {
			System.out.printf("Using \"%s\" as the file name instead of \"%s\"\n", fileName.replace(prefix, NULL_STRING), fileName_);
		}
		else{
			System.out.println(fileName.replace(prefix, NULL_STRING));
		}

		
		String anotherFile = NULL_STRING;
		do {
			File f = new File(fileName);
			if (!f.exists()) {
				break;
			}
			anotherFile = fileNameProper + 'V' + Integer.toString(version) + fileExt;
			fileName = anotherFile;
			version += 1;
			continue;
		} while (true);
		
		// print out the file name that we are going to use
		if (fileName.equals(anotherFile)) {
			
			System.out.printf("\"%s\" already exists we'll be using \"%s\" as the file name\n", 
					fileNameProper.replace(prefix, NULL_STRING) + fileExt, fileName.replace(prefix, NULL_STRING));
		}
		pw = new PrintWriter(fileName); // this creates the file
		return pw;
	} // createFile()
	
	// Get the amount of time it took to create the file
	public static long setEndTime() {
		long prevEnd = endTime;
		endTime = new Date().getTime();
		return prevEnd;
	}
	
	public static void setTime() {
		startTime = new Date().getTime();
	}
	
	public static long getDuration() { // shows duration in seconds
		return ((endTime - startTime) / 1000);
	}

	public static void main(String[] args) throws IOException{
		setTime();
		Scanner reader = new Scanner(System.in);
		String fileName = NULL_STRING;
		String userSelection = NULL_STRING;
		String menuSelection = NULL_STRING;
		System.out.println("Welcome to the Activity Tracker !");
		
		do {	// we're in this loop when we first start off or when our menuSelection is set to "". this displays the menu.
			System.out.println("Activity Tracker Menu");
			System.out.println("\"N\" -- Track a new activity"); // enter "N" to create a new activity
			System.out.println("\"V\" -- View an activity");
			System.out.println("\"Q\" -- Quit the Activity Tracker program");
			System.out.print("Selection: ");
			
			userSelection = reader.nextLine();	// we're getting our user's input here
			userSelection = userSelection.toUpperCase();
			menuSelection = userSelection;
			
			while (menuSelection.equals("N")) {
				setTime();
				System.out.print("Enter new activity name: ");
				fileName = reader.nextLine();
				
				PrintWriter writer = createFile(fileName); // we're creating our file here
				setEndTime();
				
				// writing to the file here
				writer.printf("Started on %s\n", new Date());
				writer.close(); // this closes the file
				
				System.out.println("It took " + getDuration() + " seconds to create this activity");
				System.out.print("Go back to main menu? [Y/N]: ");
				userSelection = reader.nextLine().toUpperCase();
				if (userSelection.contentEquals("Y")) {
					menuSelection = NULL_STRING;
					continue;
				}
				if (userSelection.contentEquals("N")) {
					System.out.print("Create a new activity [Y/N] ('N' quits the program):");
					userSelection = reader.nextLine().toUpperCase();
 					if (userSelection.equals("Y")) {
 						continue;
 					}
 					else if (userSelection.equals("N")) {
 						menuSelection = "Q";
 						continue;
 					}
				}
			}
			
			while (menuSelection.equals("V")) {
				// grab the activity and display when we started tracking it
				System.out.print("Enter the file name to display tracking info for: ");
				fileName = reader.nextLine();
				String prefix = "ACTIVITY-";
				do {
					if (!fileName.startsWith(prefix)) {
						fileName = prefix + fileName;
						continue;
					}
					File f = new File(fileName);
					if (!f.exists()) {
						System.out.printf("This file \"%s\" does not exist\n", f);
						System.out.print("Track another file [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						if (userSelection.equals("Y")) {
							System.out.print("Enter another file name to display tracing info for: ");
							fileName = reader.nextLine();
							continue;
						}
						if (userSelection.equals("N")) {
							System.out.print("Go back to main menu [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
							if (userSelection.contentEquals("Y")) {
								menuSelection = NULL_STRING;
								break;
							}
							else if(userSelection.contentEquals("N")) {
								menuSelection = "Q";
								break;
							}
						}
					}
					else if (f.exists()) {
						System.out.printf("The file \"%s\" exists !\n", f);
						System.out.println();
						Scanner fileReader = new Scanner(f);
						String fileContents = NULL_STRING;
						while (fileReader.hasNext()) {
							fileContents += fileReader.nextLine() + "\n";
						}
						fileReader.close();
						System.out.println(fileContents);
						System.out.print("Track another file [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						if (userSelection.equals("Y")) {
							break;
						}
						else if (userSelection.equals("N")) {
							System.out.print("Go back to main menu [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
							if (userSelection.equals("Y")) {
								menuSelection = NULL_STRING;
								break;
							}
							else if (userSelection.equals("N")) {
								menuSelection = "Q";
								break;
							}
						}
					}
				} while (true);
				
			}
			if (menuSelection.equals("Q")) {
				reader.close();
				setEndTime();
				long totalTimeSpent;
				totalTimeSpent = getDuration(); // total time in seconds
				int totalSeconds = (int) totalTimeSpent % 60;
				long totalMinutes = totalTimeSpent / 60; 
				int totalHours = (int) (totalTimeSpent / 3600);
				int totalDays = (int) totalHours % 24;
				System.out.printf("%d days, %d hours, %d minutes, %d seconds\n", totalDays, totalHours, totalMinutes, totalSeconds);
				System.out.println("Goodbye.");
				break;
			}
			else {
				System.out.printf("\"%s\" is not a valid option.\n", userSelection);
				menuSelection = NULL_STRING;
				userSelection = NULL_STRING;
				continue;
			}
		} while (menuSelection == NULL_STRING);

	}

}