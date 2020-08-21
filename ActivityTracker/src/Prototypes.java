import java.io.*;
import java.util.Date;
public class Prototypes {
   private static final String  NULL_STRING = "";
   
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
		  // System.out.println(fileNameProper);
		   System.out.println(fn);
	   }
	   //check to see if a file with the transformed name already exists.  If so, 
	   // try creating files with a version number before the extension.  For 
	   // example, if commute_CCSF.txt already exists, try commute_CCSF_v2.txt;
	   // it that exists try commute_CCSF_v3.txt, etc.
	   
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
		   
		   // we need to break the file into pieces, the file name proper and the extension.
		   // then combine those pieces to create a new file name with the pattern

		   //String newFileName = fileNameProper;
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
   } //createFile()
   
   public static void main (String []args) throws IOException {
	   
	   String fileName = NULL_STRING;
	   if (args[0].toUpperCase().equals("N") ) {
		   if (args.length == 1) {
			   System.out.println("Filename required as 2nd parameter");
			   System.exit(1);
		   } //if
		   fileName = args[1];
		   System.out.printf("Creating file ...\"%s\"\n",fileName);
		   PrintWriter writer = createFile(fileName);
		   writer.printf("%d\n", new Date().getTime());
		   writer.close();
	   } //if the user wants to create a file
		   
   } //main()

}
