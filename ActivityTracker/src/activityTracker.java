import java.io.*;
import java.util.Date;
import java.util.Scanner;
/*
 	For this assignment, create an application that enables users to create text files intended to track time spent on a particular activity,
 	such as online games, housework. The only thing that will go in the activity files
 	is a one-line “header" showing the creation timestamp, and the activity name.
 	the only thing the users will do with the files is to view the headers. When the user quits, display the total time spent using your application.
 */


public class activityTracker {
	private static final String NULL_STRING = "";
	private static PrintWriter createFile(String fileName_) throws IOException {
		   PrintWriter pw = null;
		   
		   //replace ' ' with '_', '/' with '-', and delete all !'s and @'s
		   String fn = fileName_;
		   fn = fn.replace(' ','_');
		   fn = fn.replace("!",NULL_STRING);
		   fn = fn.replace("@",NULL_STRING);
		   if (!fn.equals(fileName_)) {
			   System.out.printf("Using \"%s\" as file name instead of \"%s\"\n", fn, fileName_);
		   }
		   else { 
			   System.out.println(fn);
		   }
		   int version = 1;
		   String fileNameProper = fn; 
		   String fileExt = NULL_STRING;
		   int extPos = fn.lastIndexOf('.');

		   if (extPos != -1) {
			   fileExt = fn.substring(extPos);
			   fileNameProper = fn.replace(fileExt, NULL_STRING);   
		   }
		   String nFileNameProper = NULL_STRING;
		   do {
			   File  f = new File(fn);
			   if (!f.exists()) {
				   break;
			   }
			   
			   nFileNameProper = fileNameProper + 'V' + Integer.toString(version) + fileExt; 
			   fn = nFileNameProper;
			   version += 1;
			   continue;
		   } while(true);
		   if (fn.equals(nFileNameProper)) {
			   
		   System.out.printf("\"%s\" already exists we'll be using \"%s\" as the file name\n", fileNameProper, fn);
		   }
		   pw = new PrintWriter(fn);
		   
		   
		   return pw;
	}
	
	public static void main(String []args) {
		
	}// main()
}// class()