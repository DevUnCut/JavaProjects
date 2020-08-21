import java.io.*;
import java.util.Scanner;
public class StudentTest1 {
	static String fileName = "";
	public static String getFile() {
		return fileName;
	}
	
	public static void main(String[] args) throws IOException {
		
		final String NULL_STRING = "";
		Scanner reader = new Scanner(System.in);
		int totalOfEntries = 0;
		String aFile = NULL_STRING;
		String whichCampus = NULL_STRING;
		String whatCourse = NULL_STRING;
		int    userEstimation = 0;
		String entryDescription = NULL_STRING;
		String userSelection = NULL_STRING;
		String menuSelection = NULL_STRING;
		int    numOfEntries = 0;
		StudentActivity activityFile = null;
		boolean error = true;
		
		
		System.out.println("Welcome to the Activity Tracker !\n");
		do {	// we're in this loop when we first start off or when our menuSelection is set to "". this displays the menu.
			System.out.println("Activity Tracker Menu");
			System.out.println("\"A\" -- Add entry to an activity");
			System.out.println("\"N\" -- Track a new activity"); // enter "N" to create a new activity
			System.out.println("\"V\" -- View an activity"); // enter "V" to view an Activity- file
			System.out.println("\"Q\" -- Quit the Activity Tracker program"); // enter "Q" to quit to program
			System.out.print("Selection: ");
			userSelection = reader.nextLine().toUpperCase();
			menuSelection = userSelection;
			
			while (menuSelection.equals("N")) {
				System.out.print("Enter a new activity name: ");
				aFile = reader.nextLine();
				System.out.print("At which campus does this happen at: ");
				whichCampus = reader.nextLine();
				System.out.print("For what course is this for?: ");
				whatCourse = reader.nextLine();
				System.out.print("What did you do?: ");
				entryDescription = reader.nextLine();
				do {
					try {
						System.out.print("How long do you think you'll spend on this activity(in hours)?: ");
						userSelection = reader.nextLine();
						userEstimation = Integer.parseInt(userSelection);
						if (userEstimation < 0) {
							System.out.println("Please enter a positive integer");
							error = true;
						}
						else {
							error = false;
						}
					} catch (Exception e) {
						System.out.printf("\"%s\" is not a valid input:\n", userSelection);
					}
				}	while (error);
				System.out.print("Do you have more than one entry? [Y/N]: ");
				userSelection = reader.nextLine().toUpperCase();
				// Loop thats checks user input for home many entries //
				while (!userSelection.contentEquals("Y") && !userSelection.contentEquals("N")) {
			        System.out.printf("the option \"%s\" is no valid.\n", userSelection);
			        System.out.print("Do you have more than one entry? [Y/N]: ");
			        userSelection = reader.nextLine().toUpperCase();
			        continue;
				}
				if (userSelection.equals("Y")) {
					do {
						try {
							System.out.print("How many more entries?: ");
							numOfEntries = reader.nextInt();
							if (numOfEntries < 0) {
								System.out.println("please enter a positive integer.");
								error = true;
							}
							else {
							    error = false;
							}
						} catch (Exception e) {
							System.out.printf("Please enter a integer, your input is invalid.\n");
							reader.nextLine();
							error = true;
							continue;
						}
					} while(error);
					// use the StudentActivity constructor that creates an array object for us
					// 	then use the addActivity() method to add new entries to that object.
					activityFile = new StudentActivity(aFile, whichCampus, whatCourse, entryDescription, userEstimation, numOfEntries);
					totalOfEntries += 1;
					// let's enter a for loop which gives our user an option to add different data to other entries.
					// note our array is already at size 1 since we needed an entry to fill it in during initialization.
					for (; numOfEntries >= totalOfEntries;) {
						System.out.print("What did you do?: ");
						reader.nextLine();
						entryDescription = reader.nextLine();
						do {
							try {
								System.out.print("How long do you think you'll spend on this activity(in hours)?: ");
								userEstimation = reader.nextInt();
								if (userEstimation < 0) {
									System.out.println("Please enter a positive integer");
									error = true;
								}
								else {
									error = false;
								}
							} catch (Exception e) {
								System.out.printf("your input is not a valid input, please enter a integer.\n");
								reader.nextLine();
								error = true;
								continue;
							}
						}	while (error);
						StudentActivity.addEntry(entryDescription, userEstimation);																		// refers to the same file name as before
						totalOfEntries += 1;
						continue;
					}
					System.out.print("Create another activity object? [Y/N]: ");
					reader.nextLine();
					userSelection = reader.nextLine().toUpperCase();
					while (!userSelection.equals("N") && !userSelection.equals("Y")) {
						System.out.printf("\"%s\" is an invalid option.\n", userSelection);
						System.out.print("Create another activity object? [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						continue;
					}
					if (userSelection.contentEquals("Y")) {
						continue;
					}
					else if (userSelection.contentEquals("N")) {
						System.out.print("Go back to main menu? [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						while (!userSelection.equals("N") && !userSelection.equals("Y")) {
							System.out.printf("\"%s\" is an invalid option.\n", userSelection);
							System.out.print("Go back to the main menu? [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
							continue;
						}
						if (userSelection.contentEquals("Y")) {
							menuSelection = NULL_STRING;
							userSelection = NULL_STRING;
							System.out.println();
						}
						else if (userSelection.contentEquals("N")) {
							menuSelection = "Q";
							userSelection = NULL_STRING;
						}
					}

				}
				else if (userSelection.equals("N")) {
					activityFile = new StudentActivity(aFile, whichCampus, whatCourse, entryDescription, userEstimation);
					totalOfEntries += 1;
					System.out.print("Create another StudentActivity? [Y/N]: ");
					userSelection = reader.nextLine().toUpperCase();
					while (!userSelection.equals("N") && !userSelection.equals("Y")) {
						System.out.printf("The option \"%s\" is not valid.\n", userSelection);
						System.out.print("Create another StudentActivity? [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						continue;
					}
					if (userSelection.equals("N")) {
						System.out.print("Go back to main menu? [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						while (!userSelection.equals("N") && !userSelection.equals("Y")) {
							System.out.printf("The option \"%s\" is not valid.\n", userSelection);
							System.out.print("Go back to main menu? [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
							continue;
						}
						if (userSelection.equals("N")) {
							menuSelection = "Q";
							continue;
						}
						else if (userSelection.contentEquals("Y")) {
							menuSelection = NULL_STRING;
							System.out.println();
							continue;
						}
					}
					else if (userSelection.equals("Y")) {
						userSelection = NULL_STRING;
						menuSelection = "N";
						continue;
					}
				}
				
			}// while() == N
			
			while (menuSelection.equals("V")) {
				System.out.print("Enter an Activity file name to view its contents: ");
				String fileToSearch;
				fileToSearch = reader.nextLine();
				String prefix = "ACTIVITY-";
				do {
					if (!fileToSearch.startsWith(prefix)) {
						fileToSearch = prefix + fileToSearch;
						continue;
					}
					File f = new File(fileToSearch);
					if (!f.exists()) {
						System.out.printf("This file \"%s\" does not exist\n", f);
						System.out.print("Track another file [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						while (!userSelection.contentEquals("Y") && !userSelection.equals("N")) {
							System.out.printf("\"%s\" is not a valid option.\n", userSelection);
							System.out.print("Track another file [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
						}
						if (userSelection.equals("Y")) {
							break;
						}
						if (userSelection.equals("N")) {
							System.out.print("Go back to main menu [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
							while (!userSelection.contentEquals("Y") && !userSelection.equals("N")) {
								System.out.printf("\"%s\" is not a valid option.\n", userSelection);
								System.out.print("Go back to main menu? [Y/N]: ");
								userSelection = reader.nextLine().toUpperCase();
							}
							if (userSelection.contentEquals("Y")) {
								System.out.println();
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
								System.out.println();
								menuSelection = NULL_STRING;
								break;
							}
							else if (userSelection.equals("N")) {
								menuSelection = "Q";
								break;
							}
						}
					}
			} while(true);
			} // while() menuSelection == "V"
			
			while (menuSelection.contentEquals("A")) {
				System.out.print("Enter file name to add an entry to, otherwise press enter to view list of Files: ");
				userSelection = reader.nextLine();
				if (userSelection.contentEquals(NULL_STRING)) {
					// use the default eclipse-workspace/(projectName)/ -to access all files
				
					File folder = new File(System.getProperty("user.home") + "/eclipse-workspace/HW3");
					String []files;
					files = folder.list();
					
					System.out.println();
					for (String file : files) {
						if (file.matches("^[^.].*\\..*")) {
							System.out.println(file);
						}
					}
					System.out.println();
					System.out.print("Go back to the main menu [Y/N]: ");
					userSelection = reader.nextLine().toUpperCase();
					while (!userSelection.contentEquals("Y") && !userSelection.contentEquals("N")) {
						System.out.printf("The option \"%s\" is invalid.\n", userSelection);
						System.out.print("Go back to the main menu [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
					}
					if (userSelection.contentEquals("Y")) {
						 userSelection = NULL_STRING;
						 menuSelection = NULL_STRING;
						 System.out.println();
					}
					else if (userSelection.contentEquals("N")) {
						System.out.print("Would you like to search for another file [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						while (!userSelection.contentEquals("Y") && !userSelection.contentEquals("N")) {
							System.out.printf("The option \"%s\" is invalid.\n", userSelection);
							System.out.print("Would you like to search for another file [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
						}
						if (userSelection.contentEquals("N")) {
							userSelection = NULL_STRING;
							menuSelection = "Q";
							
						}
						else if (userSelection.equals("Y")) {
							continue;
						}
					}
				}
				if (userSelection.matches("^[^\\\\B].*")) { // when our users enters any String, it will go through the following code 
					fileName = userSelection;
					// is our fileName in a valid format?
					fileName = StudentActivity.newFormat(fileName);
					System.out.printf("Using \"%s\" which contains"
							+" the prefix, as search critera instead of \"%s\"\n", fileName, fileName.replace("ACTIVITY-", NULL_STRING));
					
					// Let's access our default eclipse-workspace to return all files within that directory
					// if we just access the file like this well end up over writing all the data
					// we need to open in append mode
					File fileToSearch = new File(fileName);
					if (fileToSearch.exists()) { // does our user search query return a file that exits? if so what do we do?
						System.out.printf("The file \"%s\" has been found.\n", fileToSearch);
						FileWriter fw = new FileWriter(fileToSearch, true); // this opens the file in append mode.
						
						System.out.print("Do you have more than one entry? [Y/N]: ");
						userSelection = reader.nextLine().toUpperCase();
						// Loop thats checks user input for how many entries 
						while (!userSelection.contentEquals("Y") && !userSelection.contentEquals("N")) {
					        System.out.printf("the option \"%s\" is no valid.\n", userSelection);
					        System.out.print("Do you have more than one entry? [Y/N]: ");
					        userSelection = reader.nextLine().toUpperCase();
					        continue;
						}
						if (userSelection.equals("Y")) {
							
							do {
								try {
									System.out.print("How many entries? (in total): ");
									numOfEntries = reader.nextInt();
									if (numOfEntries < 0) {
										System.out.println("please enter a positive integer.");
										error = true;
									}
									else {
									    error = false;
									}
								} catch (Exception e) {
									System.out.printf("Please enter a integer, your input is invalid.\n");
									reader.nextLine();
									error = true;
									continue;
								}
							} while(error);
							
							for (int i = 1; i < numOfEntries + 1; i++) {
								System.out.print("What did you do?: ");
								reader.nextLine();
								entryDescription = reader.nextLine();
								do {
									try {
										System.out.print("How long do you think you'll spend on this activity(in hours)?: ");
										userEstimation = reader.nextInt();
										if (userEstimation < 0) {
											System.out.println("Please enter a positive integer");
											error = true;
										}
										else {
											error = false;
										}
									} catch (Exception e) {
										System.out.printf("your input is not a valid input, please enter a integer.\n");
										reader.nextLine();
										error = true;
										continue;
									}
								}	while (error);
								
								// we need to figure out how many entries we have in our file, due to our
								// file format each entry terminates with a line like so
										// -----------
								
								fw.append(StudentActivity.addFileEntry(entryDescription, userEstimation, i));
								fw.append("\n");
								fw.append("-------------------------\n");
								totalOfEntries += 1;
								continue;
							}
							fw.close();
						}
						if (userSelection.contentEquals("N")) {
							System.out.print("What did you do?: ");
							entryDescription = reader.nextLine();
							do {
								try {
									System.out.print("How long do you think you'll spend on this activity(in hours)?: ");
									userEstimation = reader.nextInt();
									if (userEstimation < 0) {
										System.out.println("Please enter a positive integer");
										error = true;
									}
									else {
										error = false;
									}
								} catch (Exception e) {
									System.out.printf("your input is not a valid input, please enter a integer.\n");
									reader.nextLine();
									error = true;
									continue;
								}
							}	while (error);
							fw.append(StudentActivity.addFileEntry(entryDescription, userEstimation));
							fw.append("\n");
							fw.append("-------------------------\n");
							fw.close();
						}
						System.out.print("Go back to main menu? [Y/N]:");
						reader.nextLine();
						userSelection = reader.nextLine().toUpperCase();
						while (!userSelection.contentEquals("Y") && !userSelection.contentEquals("N")) {
							System.out.printf("The option \"%s\" is invalid.\n", userSelection);
							System.out.print("Go back to the main menu [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
						}
						if (userSelection.contentEquals("Y")) {
							 userSelection = NULL_STRING;
							 menuSelection = NULL_STRING;
							 System.out.println();
						}
						else if (userSelection.contentEquals("N")) {
							System.out.print("Would you like to search for another file to add an entry to? [Y/N]: ");
							userSelection = reader.nextLine().toUpperCase();
							while (!userSelection.contentEquals("Y") && !userSelection.contentEquals("N")) {
								System.out.printf("The option \"%s\" is invalid.\n", userSelection);
								System.out.print("Would you like to search for another file to add an entry to? [Y/N]: ");
								userSelection = reader.nextLine().toUpperCase();
							}
							if (userSelection.contentEquals("N")) {
								userSelection = NULL_STRING;
								menuSelection = "Q";
								
							}
							else if (userSelection.equals("Y")) {
								continue;
							}
						}
					}// file.exists()
					if (!fileToSearch.exists()) {
						System.out.printf("\"%s\" is an not a vaid file name please try again\n", fileName);
						System.out.println();
						continue;
					}
				}

			}
			
			while (menuSelection.equals("Q")) {
				reader.close();
				break;
			}

		} while (menuSelection == NULL_STRING);
		

	}

}
