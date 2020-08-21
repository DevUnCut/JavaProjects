import java.util.Date;

public class TimeSpan {
	private long startTime;  // millis since 1/1/70 UTC
	private long endTime; // millis since 1/1/70 UTC
	private final int spanID;
	
	public long setEndTime(long end_) {
		long prevEnd = endTime;
		endTime = end_;
		return prevEnd;
	}// setEndTime
	// in oop we cannot have a method and the class name be named exactly the same and have the same parameters !!
	
	public long setEndTime() {
		long prevEnd = endTime;
		endTime = new Date().getTime();
		return prevEnd;
	}// setEndTime
	
	public int getSpanID() { 
		return spanID;
	}
	// what would happen if we changed the modifier to static ??
	// from a class we cannot refer to a static method but what about the other way around?
	public long getDuration () {
		return endTime - startTime;
	}
	
	public int getInstanceCount () {
		return instanceCount;
		// a class wont know which particular field of the many objects it has created, but
		// a object will since there is only one class that created it
	}
	
	private static int instanceCount = 0;
	
	// constructor bellow
	public TimeSpan() {
		startTime = new Date().getTime();
		spanID = ++ instanceCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
