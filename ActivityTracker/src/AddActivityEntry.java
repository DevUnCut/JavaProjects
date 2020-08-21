import java.util.Scanner;
import java.util.Date;
import java.io.*;

public class AddActivityEntry {
	public static final String NULL_STRING = "";
	public static final String QUIT = "Q";
	public static final String UPDATE = "U";
	public static final String READ = "R";

	private static PrintWriter openAppend(Scanner r_) throws IOException {
		PrintWriter pw = null;
		System.out.print("Enter name of activity file: ");
		String fileName = r_.nextLine();
		FileWriter fw = new FileWriter(fileName, true);
		pw = new PrintWriter(fw);
		return pw;
	} // openAppend()

	private static String updateActivity(Scanner r_, PrintWriter pw_) {
		Date now = new Date();
		String entry = NULL_STRING;
		System.out.print("Describe what you did: ");
		String description = r_.nextLine();
		System.out.print("How long did it take, in minutes: ");
		double duration = r_.nextDouble();
		entry = String.format("%d %d\n%s\n", now.getTime(), (int) (60 * duration), description);
		pw_.println(entry);
		pw_.close();
		return entry;
	}// updateActivity()
	
	private static void readActivity(Scanner r_) throws IOException {
		System.out.print("Enter name of activity file to read: ");
		String readFileName = r_.nextLine();
		File f = new File(readFileName);
		if (!f.exists() ) {
			System.out.printf("file \"%s\" does not exist.\n",readFileName);
		} //if
		Scanner activityReader = new Scanner(f);
		long creationDate = activityReader.nextLong();
		String activityName = activityReader.nextLine();
		System.out.printf("Activity %s was created on %s\n",
				activityName, new Date(creationDate).toString());
		while (activityReader.hasNext()) {
			long entryDate = activityReader.nextLong();
			
			//time in seconds, to be converted to minues
			int entryDuration = activityReader.nextInt();
			activityReader.nextLine();
			String entryDescription = activityReader.nextLine();
			System.out.printf("%s for %.2f minutes:\n\t %s\n",
					new Date(entryDate).toString(), (double) entryDuration/60,entryDescription);
			
		} //while more to read
		activityReader.close();
	}
 
	private static String getChoice(Scanner r_) {
		final String PROMPT = "Please choose one of the following options: ";
		boolean valid = false;
		String ans = NULL_STRING;
		while(true) {
			System.out.println(PROMPT);
			System.out.printf("\t[%s]uit\n", QUIT);
			System.out.printf("\t[%s]pdate an activity file\n", UPDATE);
			System.out.printf("\t[%s]ead an activity file\n", READ);
			System.out.print("[Q/U/R]: ");
			ans = r_.nextLine();
			if (ans.equals(NULL_STRING))  {
				System.out.println("PLease respond to the prompt.");
			}
		
			if (ans.toUpperCase().contentEquals(QUIT) 
					|| ans.equals(UPDATE)
					|| ans.equals(READ) ) {
				break;
			} //if
			System.out.printf("\"%s\" is not a valid response\n",ans);
		};
        
		return ans;
	} // getChoice()

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		do {
			String selection = getChoice(reader);
			switch (selection) {
			case QUIT: 
				break;
			case UPDATE:
				PrintWriter writer = openAppend(reader);
				String updateText = updateActivity(reader, writer);
                //writer.close();
                break;
			case READ:
				readActivity(reader);
				break;
			} //switch	
			if (selection.contentEquals(QUIT)) {
				break;
			}
		
		} while (true);  //while the user wants to play
		
		System.out.println("Thanks for sharing, farwell");
	} //main()

} //class AddActivityEntry
