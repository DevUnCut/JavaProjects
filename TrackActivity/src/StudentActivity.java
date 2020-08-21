
public class StudentActivity extends Activity {
	String course;
	String courseLocation;
	
	enum ActiveStatus { ACTIVE, INACTIVE, COMPLETE };
	int actualTimeSpent;
	ActiveStatus status;
	
	public String showStatus() {
		String s = NULL_STRING;
		switch (this.status) {
		case ACTIVE:
			s = "ACTIVE";
			break;
		case INACTIVE:
			s = "INACTIVE";
			break;
		case COMPLETE:
			s = "COMPLETE";
			break;
		} // end of switch statement
		return s;
	}
	
	public ActiveStatus getStatus() {
		return this.status;
	}
	
	public ActiveStatus setStatus(String status_) {
		status_ = status_.toUpperCase();
		switch (status_) {
		case "ACTIVE":
			this.status = ActiveStatus.ACTIVE;
			break;
		case "INACTIVE":
			this.status = ActiveStatus.INACTIVE;
			break;
		case "COMPLETE":
			this.status = ActiveStatus.COMPLETE;
			break;
		default:
			System.out.println("the status you've entered doesn't exist, please try again.");
			break;
		}
		return this.status;
	}
	
	public StudentActivity(String activityName, int numOfEntries,
							String campus_, String course_) {
		this.header = new ActivityHeader(activityName);
		this.course = course_;
		this.campus = campus_;
		this.actualTimeSpent = 0;
		this.status = ActiveStatus.INACTIVE;
		this.entries = new ActivityEntry[DEFAULT_NUM_ENTRIES];
	}
	
	public String toString() {
		String resultStr = "%s: happens at %s;\ncourse: %s\n"
                + "project status is %s; the current entry capacity is %d";
		String result = String.format(resultStr,
				this.header.activityName, this.campus, this.course,
				this.status, this.entries.length);
		return result;
	}
	
}
