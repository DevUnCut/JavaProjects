import java.util.Date;
public class ActivityHeader {
	String activityName;
	private Date creationDate;
	
	public ActivityHeader(String someActivity) { // header for our ActivityEntry
		activityName = someActivity;
		creationDate = new Date();
	}
	
	public ActivityHeader() {
		creationDate = new Date();
	}
	
	public String getActivityHeader() { // returns our header in a formated string
		if (activityName == null) {
			return "";
		}
		else {
			return String.format("The \"%s\" activity was created on \"%s\"\n", activityName, creationDate);
		}
	}
	public long getHeaderCreationTime() {
		return (creationDate.getTime() / 1000);
	}
	
}
