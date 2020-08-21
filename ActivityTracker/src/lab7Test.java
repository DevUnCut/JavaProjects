/*
 	Lab 7 design
 	The Activity class contains two fields, ActivityHeader and ActivityEntries
 	definition could look something like this
 	
 	import java.util.Date;
 	private ActivityHeader header;
 	private ActivityEntries entries;
 	private []ActivityEntry entries;
 	
 	public Activity(String description_) {
 		header = new ActivityHeader(description_);
 	} // Activity constructor
 	
 	public Activity(String description_, int numEntries_) {
 		header = new ActivityHeader(description_);
 		entries = ??
 	} // Activity constructor
 	
 	
 	ActivityHeader
 		long creationTimestamp; // millis since 1/1/80 UTC
 		String activityDesc;
 		
 	public ActivityHeader (String description_) { // constructor
 		activityDesc = description_;
 		creatonTimestamp = new Date().getTime();
 	}
 	// maybe some other getters and setters too? some other constructor(s)?

* 
*
	ActivityEntry
// when we create our ActivityEnty class there might not be any entries or maybe just 1 or 3 entries we dont know !
 	long entryCreationTimestamp; // millis since 1/1/70 UTC
 	int entryDuration;
 	String entryDescription;
 	
 */
public class lab7Test {

	public static void main(String[] args) {
		

	}

}
