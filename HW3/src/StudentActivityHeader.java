/*
 *  we need a few things: course, campus, creation time stamp, possible initial estimate
 *  	so we can better at estimation -- All the stuff that will never chance once
 *  		the activity is created. --
 */

import java.util.Date;

public class StudentActivityHeader {
	final long creationTimeStamp = new Date().getTime();
	String campus;
	String course; // campus and course variables are just Strings for the location that is activity is happening at.
	int initialEstimate; // in minutes
	static long startTime;
	static long endTime;
	
	public StudentActivityHeader(String campus_, String course_, int estimate_) {
		this.campus = campus_;
		this.course = course_;
		this.initialEstimate = estimate_; // how long does the user think it took to do this
	}
	
	public StudentActivityHeader(String campus_, String course_) {
		this.campus = campus_;
		this.course = course_;
		this.initialEstimate = 0;
	}
	
	
	public String getActivityHeader() {
		if (this.initialEstimate == 0) {
			return String.format( "this activity took place at \"%s\"\n"
					+ "for the course \"%s\"\n", campus, course);
		}
		else {
			return String.format( "this activity took place at \"%s\"\n"
						+ "for the course \"%s\"\n", campus, course);
		}
	}
	
	
}
