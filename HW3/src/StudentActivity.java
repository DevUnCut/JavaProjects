import java.io.*;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class StudentActivity {
	/*
	 * 	every StudentActivity object contains a header and a collection of activities, (think about the unchanging fields)
	 */
	private static final String NULL_STRING = "";
	StudentActivityHeader header;
	static int	numOfEntries;
	static ArrayList<StudentActivityEntry> entries = new ArrayList<StudentActivityEntry>();
	static String activityName = NULL_STRING;
	int actualDuration;
	static long startTime;
	static long endTime;
	
	enum ActivityStatus {INACTIVE, ACTIVE, COMPLETE, UNKNOWN}
	ActivityStatus status;
	
	
	public static long setEndTime() {
		long prevEnd = endTime;
		endTime = new Date().getTime();
		return prevEnd;
	}
	
	public static void setTime() {
		startTime = new Date().getTime();
	}
	
	public static void setTime(long num) {
		startTime = num;
	}
	
	public static long getDuration() { // shows duration in milliseconds
		return (endTime - startTime);
	}
	
	public static void resetTime() {
		startTime = 0;
		endTime = 0;
	}
	
	/*
	 * 	Lets start with what happens when our user creates a new Activity
	 * 		When our user creates an activity all thats being passed is a String which is the activity name(this will be a file !)
	 * 			Note that the filenames are displayed without the "ACTIVITY-" prefix or the ".ext" extension. 
	 */
	
	// Lets create a method to check for a required format if that format is not found 
		// replace those errors with the appropriate format and let the user know about the change.
	public static String newFormat(String oldName) { //replace ' ' with '_', '/' with '-', and delete all !'s and @'s
		String origName = oldName;
		oldName = oldName.replace(' ', '_');
		oldName = oldName.replace('/', '-');
		oldName = oldName.replace("!", NULL_STRING);
		oldName = oldName.replace("@", NULL_STRING);
		
		// this adds the prefix to our file (our user doesn't have to know about this) 
		String fileNameProper = oldName;
		String preFix = "ACTIVITY-";
		int preFixIdx = oldName.indexOf(preFix);
		if (preFixIdx == -1) {
			oldName = preFix + oldName; // this adds the prefix to our oldName
		}
		String fileExt = NULL_STRING;
		int extPos = oldName.lastIndexOf('.');
		
		if (extPos != -1) {
			fileExt = oldName.substring(extPos);
			fileNameProper = oldName.replace(fileExt, NULL_STRING);
		}
		else {
			
			fileExt = ".txt";
			fileNameProper = oldName + fileExt;
			oldName = fileNameProper;
		}
		
		if (!oldName.replace(preFix, NULL_STRING).equals(origName)) {

			System.out.printf("Using \"%s\" as the file name instead of \"%s\"\n", oldName.replace(preFix, NULL_STRING), origName);
		}
		else if (oldName.replace(preFix, NULL_STRING).contentEquals(origName)){
			System.out.println(oldName.replace(preFix, NULL_STRING));
		}
		// this doesn't check if our activityName already exists
		return oldName;
		
	} // newFormat()
	
	
	// lets create an Activity file with the format from above
	public PrintWriter createFile(String fileName_) throws IOException {
			PrintWriter pw = null;
			String prefix = "ACTIVITY-";
			String fileName = newFormat(fileName_);
			// check to see if the file name already exists if so add a suffix to the file
			int version = 1;
			String fileNameProper = fileName;
			String fileExt = NULL_STRING;
			
			int extPos = fileNameProper.lastIndexOf('.');
			
			if (extPos != -1) {
				fileExt = fileName.substring(extPos);
				fileNameProper = fileName.replace(fileExt, NULL_STRING);
			}
			else {
				fileExt = ".txt";
				fileNameProper = fileName;
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
			activityName = fileName;
			return pw;
			
	}
	
	/*
	 * 	When we create a StudentActivity object we would like to create a file of that StudentActivity object name.
	 * 	also we would also like to fill in that Activity object with an entry, 
	 * 		- so a default constructor will need a name and a description of what we just did.
	 */
	
	// the following constructor is for a Single StudententActivity that has only 1 entry 
	public StudentActivity(String activityName_, String campus_, String course_, String description_, int duration_) throws IOException {
			setTime();
			PrintWriter writer = createFile(activityName_);
			setEndTime();
			writer.printf("It took \"%d\" milliseconds to create this StudentActivity object file !\n", getDuration());
			resetTime();
			
			setTime();
			header = new StudentActivityHeader(campus_, course_, duration_);
			setEndTime();
			writer.printf("It took \"%d\" milliseconds to create this StudentActivityHeader.\n", getDuration());
			writer.println();
			writer.print(header.getActivityHeader());
			resetTime();
			
			setTime();
			//entries = new ArrayList<>();
			entries.add(new StudentActivityEntry(description_));
			setEndTime();
			writer.printf("It took \"%d\" milliseconds to create the StudentActivityEntry", getDuration());
			writer.println();
			resetTime();
			
			writer.println();
			writer.printf("the description for this entry is: \"%s\"\n", entries.get(0).getEntry());
			writer.print("-------------------------\n");
			writer.close(); // before we're ever able to finish writing to the file we must always close that file to finalize it.
			numOfEntries += 1;
	}
	
	public StudentActivity(String activityName_, String campus_, String course_, String description, int duration_, int entrySize_) throws IOException {
		setTime();
		PrintWriter writer = createFile(activityName_);
		setEndTime();
		writer.printf("It took %d milliseconds to create the Activity file\n", getDuration());

		header = new StudentActivityHeader(campus_, course_, duration_);
		setEndTime();
		writer.printf("It took %d milliseconds to create the StudentActivityHeader.\n", getDuration());
		writer.println();
		writer.print(header.getActivityHeader());	

		entries.add(new StudentActivityEntry(description, duration_));
		numOfEntries += 1;
		setEndTime();
		writer.println();
		writer.printf("It took %d milliseconds to create the %d entry.\n", getDuration(), 1);
		writer.print(entries.get(0).getEntry());
		writer.println();
		setEndTime();
		writer.printf("It took %d milliseconds to finish writing to the file.\n", getDuration());
		if (entries.size() == 1) {
			writer.println("-------------------------");
		}
		writer.close();
	}
	
	public static int arraySize() {
		return entries.size();
	}
	
	public static int getEntriesSize() {
		return numOfEntries;
	}
	
	public static String addFileEntry(String description_, int duration_, int entryNum) {
		setTime();
		entries.add(new StudentActivityEntry(description_, duration_));
		String str = StudentTest1.getFile();
		File aFile = new File(str);
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(aFile);
		} catch (Exception e) {
			System.out.printf("an error occured: %s", e);
		}
		
		int fileEntries = 0;
		while (fileReader.hasNext()) {
			if (fileReader.next().matches("^-*$")) {
				fileEntries += 1;
				continue;
			}
			continue;
		}
		numOfEntries = fileEntries;
		numOfEntries += entryNum;
		setEndTime();
		String entryTime = String.format("It took %d milliseconds to create the %d entry.\n", 
				getDuration(), numOfEntries);
		String entry = entries.get(0).getEntry();
		String result = entryTime + "\n" + entry;
		return result;
	}
	
	public static String addFileEntry(String description_, int duration_) {
		setTime();
		entries.add(new StudentActivityEntry(description_, duration_));
		String str = StudentTest1.getFile();
		
		File aFile = new File(str);
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(aFile);
		} catch (Exception e) {
			System.out.printf("an error occured: %s", e);
		}
		
		int fileEntries = 0;
		while (fileReader.hasNext()) {
			if (fileReader.next().matches("^-*$")) {
				fileEntries += 1;
				continue;
			}
			continue;
		}
		numOfEntries = fileEntries;
		numOfEntries += 1;
		setEndTime();
		String entryTime = String.format("It took %d milliseconds to create the %d entry.\n", 
				getDuration(), numOfEntries);
		String entry = entries.get(0).getEntry();
		String result = entryTime + "\n" + entry;
		return result;
	}
	
	public static void addEntry(String description_, int duration_) throws IOException {
		setTime();
		entries.add(new StudentActivityEntry(description_, duration_));
		PrintWriter printWriter = new PrintWriter(new FileOutputStream
				(new File(activityName), true));
		numOfEntries += 1;
		setEndTime();
		printWriter.printf("It took %d milliseconds to create the %d entry\n", getDuration(), numOfEntries);
		printWriter.println();
		printWriter.printf("%s", entries.get(numOfEntries - 1).getEntry());
		setEndTime();
		printWriter.println();
		printWriter.printf("It took %d milliseconds to write the entry to the file.\n", getDuration());
		setEndTime();
		printWriter.printf("It took %d milliseconds to finish writing the file.\n", getDuration());
		if (entries.size() >= 1) {
			printWriter.println("-------------------------");
		}
		printWriter.close();
	}
	

}
