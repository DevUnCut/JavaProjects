
public class StudentTest {

	public static void main(String[] args) {
	
		StudentActivity activityBook = new StudentActivity("Java object", 2, "ocean campus", "CS111B");
		System.out.println(activityBook);
		System.out.println(activityBook.getStatus());
		activityBook.setStatus("null");
		System.out.println(activityBook.getStatus());
	}

}
