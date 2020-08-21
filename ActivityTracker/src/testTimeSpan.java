
public class testTimeSpan {
// we can have any class within our <type field> in our variable Declaration
	public static void intArray(int []array_) {
		for (int idx = 0; idx < array_.length; ++idx) {
			array_[idx] = idx*idx;
		}
	}
	public static void main(String[] args) {
		TimeSpan span;
		span = new TimeSpan();// this calls the constructor '()'
		int x = 5;
		int []nums = new int [5];
		int []numsAlias = nums;
		
		// examples about aliasing
		String one = "hello";
		String two = "hello";
		String three = "he";
		three += "llo";
		System.out.println(one == three);
		
		System.out.println(nums == numsAlias); // two object can be compared, but whats compared isn't data inside that obj, but rather its memory location
		
		intArray(numsAlias);
		for (int idx = 0; idx < nums.length; ++idx) {
			System.out.printf("%d ", nums[idx]);
		}
		for (int idx = 0; idx < 100000; ++idx) {
			String hello = "hello world!";
		}
		
		span.setEndTime();
		String idString = String.format("Time span #%d", span.getSpanID());
		System.out.printf("%s: It took %d milliseconds to do the for loop\n", idString, span.getDuration());
	}

}
