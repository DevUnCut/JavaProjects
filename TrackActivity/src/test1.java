
public class test1 {

	public static void main(String[] args) {
		Activity activityList = new Activity("Java objects", "we're working with objects", "Ocean campus", 2);
		activityList.addActivityEntry("we're still working with object ughhh!", "home", 1);
		activityList.addActivityEntry("can we fill this list ?", "Ocean campus", 2);
		activityList.getActivities();
		activityList.getEntryArraySize();
		activityList.getEntriesSize();
		Activity aSingleActivity = new Activity("one activity test", "testing method that creates one Activity object.", "Ocean campus");
		aSingleActivity.getActivities();
		aSingleActivity.getEntriesSize();
		activityList.getEntriesSize();
		
	}

}
