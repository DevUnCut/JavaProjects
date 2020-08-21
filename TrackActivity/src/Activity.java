import java.util.Date;

public class Activity{
	
	Date currentDate = new Date();
	long creationTimestamp;
	static final int DEFAULT_NUM_ENTRIES = 3;
	final String NULL_STRING = "";
	ActivityEntry []entries;
	enum ActiveStatus { ACTIVE, INACTIVE, COMPLETE };
	String course;
	String campus;
	String description;
	ActiveStatus status;
	ActivityHeader header;
	int headerTime;
	long entryTimestamp;
	int entryTime;
	int totalOfEntries = 0;
	
	// the following constructor is used to initialize our []Activity the size of the array is defined by the parameter named 'size'
	public Activity(String activityName_, String description_, String campus_, int size) {
		currentDate = new Date();
		header = new ActivityHeader(activityName_); // create a header for our activity Note that in our ActivityEntry call a header object is made.
		creationTimestamp = currentDate.getTime() / 1000;
		headerTime = (int) (creationTimestamp - header.getHeaderCreationTime());
		entries = new ActivityEntry[size];
		entries[0] = new ActivityEntry(description_, campus_);
		entryTimestamp = entries[0].getEntryTime();
		entryTime = (int) (entryTimestamp - creationTimestamp);
		totalOfEntries++;
	}
	
	public Activity() {
		currentDate = new Date();
		header = new ActivityHeader();
		creationTimestamp = currentDate.getTime() / 1000;
		headerTime = (int) (creationTimestamp - header.getHeaderCreationTime());
		entries = new ActivityEntry[DEFAULT_NUM_ENTRIES];
		entries[0] = new ActivityEntry(NULL_STRING);
		
	}
	
	
	public Activity(String activityName_, String description_, String campus_) { // this constructor creates one activity object
		currentDate = new Date();
		header = new ActivityHeader(activityName_);
		creationTimestamp = currentDate.getTime() / 1000;
		headerTime = (int) (creationTimestamp - header.getHeaderCreationTime());
		entries = new ActivityEntry[1];
		entries[0] = new ActivityEntry(activityName_, description_, campus_);
		entryTimestamp = entries[0].getEntryTime();
		entryTime = (int) (entryTimestamp - creationTimestamp);
		totalOfEntries++;
	}
	
	// the following method is used to add an activity entry to our entries array
	public void addActivityEntry(String description_, String campus_, int arrayPos) {
		if (arrayPos < entries.length && arrayPos >= totalOfEntries) {
			currentDate = new Date();
			entries[arrayPos] = new ActivityEntry(description_, campus_);
			entryTimestamp = entries[arrayPos].getEntryTime();
			creationTimestamp = (currentDate.getTime() / 1000);
			entryTime = (int) (creationTimestamp - entryTimestamp);
			totalOfEntries++;
		}
		else {
			System.out.printf("this array is already filled with %d entries, please contanct an administrator\n\n", totalOfEntries);
		}
	}
	
	
	public void getActivities() { // this method will print out the formatted Strings for every ActivityEntry and that Activity's header.
		System.out.print(header.getActivityHeader());
		System.out.println("It took " + headerTime +" seconds to create the header");
		for (int i = 0; i < entries.length; i++) {
			if (entries[i] == null) {
				continue;
			}
			System.out.print(entries[i].getEntry());
			System.out.println("It took " + entryTime + " seconds to create this entry\n");
		}
	}

	public void getEntriesSize() {
		System.out.printf("There are %d total entries for this activity.\n\n", totalOfEntries);
	}
	
	public void getEntryArraySize() {
		for (int i = 0; i <= entries.length; i++) {
			if (i == entries.length) {
				System.out.printf("This ActivityEntry array can hold a maximum of %d entries.\n\n", i);
			}
		}
	}
	

}
