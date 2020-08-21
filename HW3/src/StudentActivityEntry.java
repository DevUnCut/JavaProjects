import java.util.Date;
import java.util.ArrayList;

public class StudentActivityEntry {
	final long    		entryTimeStamp = new Date().getTime(); // not only is this our creation time stamp but its also our start time from
																// when the object was created.
	int					entryDuration; // how long will we do this activity for(user input field)
	int					entryCreationDuration;
	String				entryDescription;
	// StudentActivityEntry entries = new StudentActivityEntry[NUM_ENTRIES] // usually we'll code in a constant instead of using a literal
	// the code above allocates a fixed size collection meaning that its max size cannot change
	ArrayList<String>   collaborators = new ArrayList<>();
	// the size of the ArrayList is returned by the method .size() // we use this because an ArrayList doesn't have a fixed size
	// the ArrayList is a dynamic array meaning the max number of objects it can hold can vary 
	static long			startTime;
	static long			endTime;
	private final String NULL_STRING = "";
	static final String	Collaborator_ENTRY_PRE = "C: ";
	static final String	ENTRY_PRE = "E: ";
	
	// still need to make a setter for setting the collaborators.
	
	public StudentActivityEntry(String descrip_) { // we should create a header object for each of our entries !								// the header takes in a campus, course and an estimate
		this.entryDescription = descrip_;
		this.collaborators = null;
		this.entryDuration = 20;
	} // most commonly used constructor
	
	public StudentActivityEntry(String descrip_, int duration) {
		this.entryDescription = descrip_;
		this.entryDuration = duration;
		this.collaborators = null;
	} // here's another constructor
	
	public String getEntry() {
		return String.format("%s\nEstimated time of completion is %d hours\n"
				+ "The description of this entry is: %s", getCollaborators(), entryDuration, entryDescription);
	}
	/*
	private void addEntry(String descrip_, int duration) {
		
	}
	*/
	public void printCollaborators() { // prints collaborators
		try {
			for (String name : collaborators) {
			System.out.printf("%s %s helped with this entry.\n" , Collaborator_ENTRY_PRE, name);
			continue;
			}
		} catch (Exception e) {
			System.out.print("There were no collaborators for this entry.\n");
		}
	}
	
	public String getCollaborators() {
		String return_val = NULL_STRING;
		try {
			for (String name : collaborators) {
				return_val += String.format("%s %s helped on this entry.", Collaborator_ENTRY_PRE, name);
				continue;
			}
		}
		catch (Exception e) {
			return_val = "There are no collaborators for this entry.";
		}
		return return_val;
		}
	
	public ArrayList<String> removeCollaborator(String name_) {
		this.collaborators.remove(name_);
		return this.collaborators;
	}
	


}
