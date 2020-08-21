import java.util.Date;

public class ActivityEntry {
	private Date entryDate;
	private String entryDescription;
	private String entryCampus;
	private long entryTime;
	

	// this constructor will add to our activities lets say we have an ActivityEntry array whose activities are all about 'working out'
	//		if we have worked out on Monday and we want to log that we also worked out on Wednesday we will use this constructor.
	public ActivityEntry(String entryDescription_, String campus_) {
		entryDescription = entryDescription_;
		entryCampus = campus_;
		entryDate = new Date();
		entryTime = (entryDate.getTime() / 1000);
	}
	
	// the following constructor is used to create either a Single activity entry, OR to initialize an ActivityEntry array[]
	public ActivityEntry(String entryName, String description, String campus) {
		entryDescription = description;
		entryCampus = campus;
		entryDate = new Date();
		entryTime = (entryDate.getTime() / 1000);
	}
	
	public ActivityEntry(String defaultValue) {
		entryDescription = null;
		entryCampus = null;
		entryDate = new Date();
		entryTime = (entryDate.getTime() / 1000);
	}
	
	
	public long getEntryTime() {
		return entryTime;
	}
	
	public String getEntry() { // this returns a String will all of the details in our entry
		return String.format("\nThis activity entry was created on \"%s\"\nThe description is: \"%s\"\nThis activity happend at \"%s\"\n",
						entryDate, entryDescription, entryCampus);
	}
	
}