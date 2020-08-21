import java.util.Scanner;



public class HW1 
{
    
	// CelsiusConversion(float num) which takes in a float as an argument
	// this function multiplies the num by 9/5 and then 32 is added to it
	// the purpose of this is to convert Celsius into Fahrenheit.
	public static float CelsiusConversion(float num)
    {
	    	return ((num * 9/5) + 32);
    }
	
	// FahrenheitConversion(float sumNum) which take in a float as an argument
	// this function subtracts 32 from sumNum and then multiplies it by 5/9
	// the purpose of this is to convert Fahrenheit into Celsius.
	public static float FahrenheitConversion(float sumNum)
	{
		return ((sumNum - 32) * 5/9);
	}
	
	// toMeters(float aNum) which takes in a float as an argument
	// this function returns  .0254 multiplied by aNum
	// the purpose of this is to convert Inches into Meters
	public static float toMeters(float aNum)
	{
		return (aNum * 0.0254f);
	}
	
	// fromMeters(float anotherNum) which takes in a float as an argument
	// this function returns anotherNum divided by .0254
	// the purpose of this is to convert Meters into Inches
	public static float fromMeters(float anotherNum)
	{
		return (anotherNum / 0.0254f);
	}
	
	// inToKm(float sumMeters) which take in a float as an argument
	// this function returns sumMeters and divides it by 39370.079
	// the purpose of this is to convert Inches into Kilometers
	public static float inToKm(float sumMeters)
	{
		return (sumMeters / 39370.079f);
	}
	
	// inToCm(float sumCentiMeters) which takes in a float as an argument
	// this function returns sumCentiMeters multiplied by 2.54
	// the purpose of this is to convert Inches into Centimeters
	public static float inToCm(float sumCentiMeters)
	{
		return (sumCentiMeters * 2.54f);
	}
	
	// inToMi(float sumInches) which takes in a float as an argument
	// this function returns sumInches divided by 63360
	// the purpose of this is to convert Inches into Miles
	public static float inToMi(float sumInches)
	{
		return (sumInches / 63360);
	}
	
	// metersToCm(float metersToConvert) takes in a float as an argument
	// this function returns metersToConvert multiplied by 100
	// the purpose of this function is to convert Meters into Centimeters
	public static float metersToCm(float metersToConvert)
	{
		return (metersToConvert * 100);
	}
	
	// metersToKm(float metersIntoKm) takes in a float as an argument
	// this function returns metersIntoKm divided by 1000
	// the purpose of this function is to convert Meters into Kilometers
	public static float metersToKm(float metersIntoKm)
	{
		return (metersIntoKm / 1000);
	}
	
	// metersToMiles(float metersIntoMiles) takes in a float as an argument
	// this function returns metersToMiles divided by 1609.344
	// the purpose of this function is to convert Meters into Kilometers
	public static float metersToMiles(float metersIntoMiles)
	{
		return (metersIntoMiles / 1609.344f);
	}
	
	// centiToMeters(float CentiToConvert) takes in a float as an argument
	// this function returns CentiToConvert divided by 100
	// the purpose of this function is to convert Centimeters into Meters
	public static float centiToMeters(float centiToConvert)
	{
		return (centiToConvert / 100);
	}
	
	// centiToKm(float amntOfCm) takes in a float as an argument
	// this function returns amntOfCm divided by 100000
	// the purpose of this function is to convert Centimeters into Kilometers
	public static float centiToKm(float amntOfCm)
	{
		return (amntOfCm / 100000);
	}
	
	// centiToInches(float cmToIn) takes in a float as an argument
	// this function returns cmToIn divided by 2.54
	// the purpose of this function is to convert Centimeters into Inches
	public static float centiToInches(float cmToIn)
	{
		return (cmToIn / 2.54f);
	}
	
	// centiToMiles(float cmToMi) takes in a float as an argument
	// this function returns cmToMi divided by 160934.4
	// the purpose of this function is to convert Centimeters into Miles
	public static float centiToMiles(float cmToMi)
	{
		return (cmToMi / 160934.4f);
	}
	
	// kiloToCenti(float kmToCm) takes in a float as an argument
	// this function returns kmToCm multiplied by 100000
	// the purpose of this function is to convert Kilometers into Centimeters
	public static float kiloToCenti(float kmToCm)
	{
		return (kmToCm * 100000);
	}
	
	// kiloToMeter(float kmToMeter) takes in a float as an argument
	// this function returns kmToMeter multiplied by 1000
	// the purpose of this function is to convert Kilometers into Meters
	public static float kiloToMeters(float kmToMeter)
	{
		return (kmToMeter * 1000);
	}
	
	// kiloToIches(float kmToInches) takes in a float as an argument
	// this function returns kmToInches multiplied by 39370.079
	// the purpose of this function is to convert Kilometers into Inches
	public static float kiloToInches(float kmToInches)
	{
		return (kmToInches * 39370.079f);
	}
	
	// kiloToMiles(float kmToMiles) takes in a float as an argument
	// this function returns kmToMiles divided by 1.609
	// the purpose of this function is to convert Kilometers into Miles
	public static float kiloToMiles(float kmToMiles)
	{
		return (kmToMiles / 1.609f);
	}
	
	// Finish writing functions for Miles conversion below !
	
	// milesToCenti(float miToCenti) takes in a float as an argument
	// this function returns miToCenti multiplied by 160934.4f
	// the purpose of this function is to convert Miles into Centimeters
	public static float milesToCenti(float miToCenti)
	{
		return (miToCenti * 160934.4f);
	}
	
	// milesToMeters(float miToMeters) takes in a float as an argument
	// this function returns miToMeters multiplied by 1609.344f
	// the purpose of this function is to convert Miles into Meters
	public static float milesToMeters(float miToMeters)
	{
		return (miToMeters * 1609.344f);
	}
	
	// milesToKilo(float miToKm) takes in a float as an argument
	// this function returns miToKm multiplied by 1.609f
	// the purpose of this function is to convert Miles into Kilometers
	public static float milesToKilo(float miToKm)
	{
		return (miToKm * 1.609f);
	}
	
	// milesToInches(float miToInches) takes in a float as an argument
	// this function returns miToInches * 63360 
	// the purpose of this function is to convert Miles into Inches
	public static float milesToInches(float miToInches)
	{
		return (miToInches * 63360);
	}
	
	public static void main(String[] args)
	{
	    // Lets initialize a new Scanner object
	    Scanner keyboard = new Scanner(System.in);
	    
	    // Lets initialize our C, and F variables by setting them = 0.
	    float C = 0;
	    float F = 0;	
	   
	    // now lets initialize a variable to hold our users response
	    String answer = "";
	    	
	    
	    
	    do
	    {
	        System.out.print("Enter, C or F to convert from that standard to another standard, or enter 'Y' to convert distaces 'Q' to quit: ");
	        answer = keyboard.nextLine();
	        
	        while (answer.toUpperCase().equals("C"))
	        {
	        	
	        	System.out.print("Enter the Celsius value you would like to convert into Fahrenheit: ");
	        	C = keyboard.nextFloat();
	        	System.out.printf("%.0f degrees Celcius is %.2f degrees fahrenheit !\n" , C, CelsiusConversion(C));
	        	System.out.print("Enter another value to convert into degrees, if not enter 'b' to go back to the main menu: ");
	        	String secondAnswer = "";
	        	
	        	// since the previous keyboard method used was .nextInt() which only expects a integer. using the .nextInt() method 
	        	// makes it so there's no newline feed so thats why we jump back to the top of our while loop
	        	keyboard.nextLine();
	        	
	        	secondAnswer = keyboard.nextLine();
	        	
	        	// Lets create a while loop to match a regex which matches zero or one instance of '-' and all instances of digits [0-9]
	        	// the while loop can only be broken if the regex doesn't match what it is looking for.
	        	while (secondAnswer.matches("-?\\d*"))
	        	{
	        		C = Float.parseFloat(secondAnswer);
	        		System.out.printf("%.0f degrees Celsius is %.2f degrees Fahrenheit !\n", C, CelsiusConversion(C));
	        		System.out.print("Enter another value to convert into degrees, if not enter 'b' to go back to the main menu: ");
	        		
	        		// Let's give our user the chance to break out the loop or enter in another value
		        	secondAnswer = keyboard.nextLine();
	        	}
	        	
	        	// if our user inputs 'b' or 'B' set answer = "" -to an empty string- 
	        	// this is to break out of the while statement above which run only if answer = 'C'
	        	if (secondAnswer.toLowerCase().equals("b"))
	        	{
	        		answer = "";
	        		continue;
	    
	        	}
	        }
	        
	        
	        while (answer.toUpperCase().equals("F"))
	        {
	        	String second_Answer = "";
	        	System.out.print("Enter the Fahrenheit value you would like to conver into Celsius: ");
	        	F = keyboard.nextFloat();
	        	System.out.printf("%.0f degrees Fahrenheit is %.2f degrees Celsius !\n", F, FahrenheitConversion(F));
	        	System.out.print("Enter another value to convert into degrees, if not enter 'b' to go back to the main menu: ");
	        	
	        	keyboard.nextLine();
	        	
	        	// since we haven't been using the keyboard.nextInt method there's no need for us to add a keyboard.nextLine after this point
	        	// that will change depending on our usage of second_Answer, will it always be treated as a String ?
	        	second_Answer = keyboard.nextLine();
	        	while (second_Answer.matches("-?\\d*"))
	        	{
	        		F = Float.parseFloat(second_Answer);
	        		System.out.printf("%.0f degrees Fahrenheit is %.2f degrees Celsius !\n", F, FahrenheitConversion(F));
	        		System.out.print("Enter another value to convert into degrees, if not enter 'b' to go back to the main menu: ");
	        	
		        	second_Answer = keyboard.nextLine();
	        	}
	        	if (second_Answer.toLowerCase().equals("b"))
	        	{
	        		answer = "";
	        		continue;
	        	}
	        }
	        
	        
	        // Enter this while loop if our users input 'Y' or 'y' to convert different distances !
	        while (answer.toUpperCase().equals("Y"))
	        {
	        	String newAnswer = "";
	        	float cm = 0;
	        	float m = 0;
	        	float km = 0;
	        	float in = 0;
	        	float mi = 0;
	        	System.out.println("Welcome to the distances conversion program !");
	        	System.out.print("Enter in the conversion Unit you would like to convert from(cm, m, km, in, mi), enter 'b' to go back: ");
	        	newAnswer = keyboard.nextLine();
	        	
	        	
	        	// Enter this loop when our user wants to convert Centimeters into a different standard.
	        	while (newAnswer.toLowerCase().equals("cm"))
	        	{
	        		String CentiConversionAnswer = "";
	        		System.out.print("We'll be converting Centimeters into (m, km, in, mi), enter 'b' to go back: ");
	        		CentiConversionAnswer = keyboard.nextLine();
	        		
	        		while (CentiConversionAnswer.toLowerCase().equals("m"))
	        		{
	        			String CentiContinueAnswer = "";

	        			System.out.print("Enter the amount of Centimeters we'll be converting into Meters !: ");
	        			cm = keyboard.nextFloat();
	        			while (cm < 0.0f)
	        			{
	        			    System.out.printf("We cannot convert %f, it has a negative number\n", cm);
	 	        		    System.out.print("Enter a valid number to convert into Meters: ");
		        		    
	 	        		    keyboard.nextLine();
	 	        		    cm = keyboard.nextFloat();
	 	        		    continue;
	        			}
	        			System.out.printf("%.2f Cetimeters is %.2f Meters !\n", cm, centiToMeters(cm));
	        			System.out.print("Enter another value to convert into Meters, enter 'b' to go back: ");
	        			
	        			// remember every time we use .nextInt() it will not be waiting for user input so we must add the .nextLine()
	        			// so we can get the \n newline feed.
	        			keyboard.nextLine();
	        			CentiContinueAnswer = keyboard.nextLine();
	        			
	        			if (CentiContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				CentiConversionAnswer = "";
	        				continue;
	        			}
	        			else if (CentiContinueAnswer.matches("-.?\\d*.?\\d*"))
	        			{
	        				System.out.printf("We cannot convert %s, it has a negative number\n", CentiContinueAnswer);
	        				System.out.print("enter a valid distance which does not contain a negative number: ");
	        				CentiContinueAnswer = keyboard.nextLine();
	        				continue;
	        			}
	        			while (CentiContinueAnswer.matches("[^-].?\\d*.?\\d*"))
	        			{
	        			    if (CentiContinueAnswer.matches("b"))
	        			    {
	        			    	CentiConversionAnswer = "";
	        			    	continue;
	        			    }
	        				cm = Float.parseFloat(CentiContinueAnswer);
	        			    System.out.printf("%.2f Centimeters is %.2f Meters !\n", cm, centiToMeters(cm));
	 	        		    System.out.print("Enter another value to convert into Meters, enter 'b' to go back: ");
		        		    
	 	        		    CentiContinueAnswer = keyboard.nextLine(); 
	 	        		    // need a way to break out this loop if user enters 'b'
	        			}
	        		}
	        		
	        		while (CentiConversionAnswer.toLowerCase().equals("km"))
	        		{
	        		    String centiKmContinueAnswer = "";
	        			System.out.print("Enter the amount of Centimeters we'll be converting into Kilometers !: ");
	        			cm = keyboard.nextFloat();
	        			
	        			while (cm < 0.0f)
	        			{
	        			    System.out.printf("We cannot convert %f, it has a negative number\n", cm);
	 	        		    System.out.print("Enter a valid number to convert into Kilometers: ");
		        		    
	 	        		    keyboard.nextLine();
	 	        		    cm = keyboard.nextFloat();
	 	        		    continue;
	        			}
	        			
	        			System.out.printf("%.2f Centimeters is %.5f Kilometers !\n", cm, centiToKm(cm));
	        			System.out.print("Enter another value to convert into Kilometers, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			centiKmContinueAnswer = keyboard.nextLine();
	        			
	        			if (centiKmContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				CentiConversionAnswer = "";
	        				continue;
	        			}
	        			else if (centiKmContinueAnswer.matches("-.?\\d*.?\\d*"))
	        			{
	        				System.out.printf("We cannot use %s, it has a negative value.\n", centiKmContinueAnswer);
	        				System.out.print("Enter a valid number to convert into kilomerters: ");
	        				centiKmContinueAnswer = keyboard.nextLine();
	        				continue;
	        			}
	        			while (centiKmContinueAnswer.matches("[^-].?\\d*.?\\d*"))
	        			{
	        			    cm = Float.parseFloat(centiKmContinueAnswer);
	        			    System.out.printf("%.2f Centimeters is %.5f Kilometers !\n", cm, centiToKm(cm));
	 	        		    System.out.print("Enter another value to convert into Kilometers, enter 'b' to go back: ");
		        		    
	 	        		    centiKmContinueAnswer = keyboard.nextLine();
	 	        		    continue;
	        			     
	        			}
	        			
	        		}
	        		
	        		while (CentiConversionAnswer.toLowerCase().equals("in"))
	        		{
	        			String centiInContinueAnswer = "";
	        			System.out.print("Enter the amount of Centimeters we'll be converting into Inches: ");
	        			cm = keyboard.nextFloat();
	        			System.out.printf("%.2f Centimeters is %.2f Inches !\n", cm, centiToInches(cm));
	        			System.out.print("Enter another value to convert into Inches, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			centiInContinueAnswer = keyboard.nextLine();
	        			while (centiInContinueAnswer.matches("\\d*"))
	        			{
	        			    cm = Float.parseFloat(centiInContinueAnswer);
	        			    System.out.printf("%.2f Centimeters is %.2f Inches !\n", cm, centiToInches(cm));
	 	        		    System.out.print("Enter another value to convert into Inches, enter 'b' to go back: ");
		        		    
	 	        		    centiInContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (centiInContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				CentiConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		
	        		while (CentiConversionAnswer.toLowerCase().equals("mi"))
	        		{
	        		    String centiMilesContinueAnswer = "";
	        			System.out.print("Enter the amount of Centimeters we'll be converting into Miles: ");
	        			cm = keyboard.nextFloat();
	        			System.out.printf("%.2f Centimeters is %.6f Miles !\n", cm, centiToMiles(cm));
	        			System.out.print("Enter another value to convert into Miles, enter 'b' to go back: ");
	        			
	        			// remember every time we use .nextInt() it will not be waiting for user input so we must add the .nextLine()
	        			// so we can get the \n newline feed.
	        			keyboard.nextLine();
	        			
	        			centiMilesContinueAnswer = keyboard.nextLine();
	        			while (centiMilesContinueAnswer.matches("\\d*"))
	        			{
	        			    cm = Float.parseFloat(centiMilesContinueAnswer);
	        			    System.out.printf("%.2f Centimeters is %.6f Miles !\n", cm, centiToMiles(cm));
	 	        		    System.out.print("Enter another value to convert into Miles, enter 'b' to go back: ");
		        		    
	 	        		    centiMilesContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (centiMilesContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				CentiConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		if (CentiConversionAnswer.toLowerCase().equals("b"))
	        		{
	        			newAnswer = "";
	        			continue;
	        		}
	        	}
	        	
	        	
	        	// Enter this while loop when our user wants to convert Meters into a different standard (finish the Miles while loop)
	        	while (newAnswer.toLowerCase().equals("m"))
	        	{
	        		String conversionAnswer = "";
	        		System.out.print("We'll be converting Meters into (cm, km, in, mi), enter 'b' to go back: ");
	        		conversionAnswer = keyboard.nextLine();
	        		
	        		while (conversionAnswer.toLowerCase().equals("cm"))
	        		{
	        			String cmContinueAnswer = "";
	        			System.out.print("Enter the amount of Meters we'll be converting into Centimeters !: ");
	        			m = keyboard.nextFloat();
	        			System.out.printf("%.2f Meters is %.2f Centimeters !\n", m, metersToCm(m));
	        			System.out.print("Enter another value to convert into Centimeters, enter 'b' to go back: ");
	        			
	        			// remember every time we use .nextInt() it will not be waiting for user input so we must add the .nextLine()
	        			// so we can get the \n newline feed.
	        			keyboard.nextLine();
	        			cmContinueAnswer = keyboard.nextLine();
	        			while (cmContinueAnswer.matches("\\d*"))
	        			{
	        			    m = Float.parseFloat(cmContinueAnswer);
	        			    System.out.printf("%.2f Meters is %.2f Centimeters !\n", m, metersToCm(m));
	 	        		    System.out.print("Enter another value to convert into Centimeters, enter 'b' to go back: ");
		        		    
	 	        		    cmContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (cmContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				conversionAnswer = "";
	        				continue;
	        			}
	        			
	        		}
	        		
	        		while (conversionAnswer.toLowerCase().equals("km"))
	        		{
	        		    String kmContinueAnswer = "";
	        			System.out.print("Enter the amount of Meters we'll be converting into Kilometers !: ");
	        			m = keyboard.nextFloat();
	        			System.out.printf("%.2f Meters is %.2f Kilometers !\n", m, metersToKm(m));
	        			System.out.print("Enter another value to convert into Kilometers, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			kmContinueAnswer = keyboard.nextLine();
	        			while (kmContinueAnswer.matches("\\d*"))
	        			{
	        			    m = Float.parseFloat(kmContinueAnswer);
	        			    System.out.printf("%.2f Meters is %.2f Kilometers !\n", m, metersToKm(m));
	 	        		    System.out.print("Enter another value to convert into Kilometers, enter 'b' to go back: ");
		        		    
	 	        		    kmContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (kmContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				conversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		
	        		while (conversionAnswer.toLowerCase().equals("in"))
	        		{
	        			String continueAnswer = "";
	        			System.out.print("Enter the amount of Meters we'll be converting into Inches: ");
	        			m = keyboard.nextFloat();
	        			System.out.printf("%.2f Meters is %.2f Inches !\n", m, fromMeters(m));
	        			System.out.print("Enter another value to convert into Inches, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			continueAnswer = keyboard.nextLine();
	        			while (continueAnswer.matches("\\d*"))
	        			{
	        			    m = Float.parseFloat(continueAnswer);
	        			    System.out.printf("%.2f Meters is %.2f Inches !\n", m, fromMeters(m));
	 	        		    System.out.print("Enter another value to convert into Inches, enter 'b' to go back: ");
		        		    
	 	        		    continueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (continueAnswer.toLowerCase().equals("b"))
	        			{
	        				conversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		
	        		while (conversionAnswer.toLowerCase().equals("mi"))
	        		{
	        		    String milesContinueAnswer = "";
	        			System.out.print("Enter the amount of Meters we'll be converting into Miles: ");
	        			m = keyboard.nextFloat();
	        			System.out.printf("%.2f Meters is %.2f Miles !\n", m, metersToMiles(m));
	        			System.out.print("Enter another value to convert into Miles, enter 'b' to go back: ");
	        			
	        			// remember every time we use .nextInt() it will not be waiting for user input so we must add the .nextLine()
	        			// so we can get the \n newline feed.
	        			keyboard.nextLine();
	        			milesContinueAnswer = keyboard.nextLine();
	        			while (milesContinueAnswer.matches("\\d*"))
	        			{
	        			    m = Float.parseFloat(milesContinueAnswer);
	        			    System.out.printf("%.2f Meters is %.2f Miles !\n", m, metersToMiles(m));
	 	        		    System.out.print("Enter another value to convert into Miles, enter 'b' to go back: ");
		        		    
	 	        		    milesContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (milesContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				conversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		if (conversionAnswer.toLowerCase().equals("b"))
	        		{
	        			newAnswer = "";
	        			continue;
	        		}
	        		
	        	}
	        	
	        	
	        	// Enter this while loop when our user wants to convert Kilometers into another standard
                while (newAnswer.toLowerCase().equals("km"))
	        	{
                	String kmConversionAnswer = "";
	        		System.out.print("We'll be converting Kilometers into (cm, m, in, mi), enter 'b' to go back: ");
	        		kmConversionAnswer = keyboard.nextLine();
	        		
	        		while (kmConversionAnswer.toLowerCase().equals("cm"))
	        		{
	        			String kmCentiContinueAnswer = "";
	        			System.out.print("Enter the amount of Kilometers we'll be converting into Centimeters !: ");
	        			km = keyboard.nextFloat();
	        			System.out.printf("%.2f Kilometers is %.2f Centimeters !\n", km, kiloToCenti(km));
	        			System.out.print("Enter another value to convert into Centimeters, enter 'b' to go back: ");
	        		
	        			keyboard.nextLine();
	        			kmCentiContinueAnswer = keyboard.nextLine();
	        			while (kmCentiContinueAnswer.matches("\\d*"))
	        			{
	        			    km = Float.parseFloat(kmCentiContinueAnswer);
	        			    System.out.printf("%.2f Kilometers is %.2f Centimeters !\n", km, kiloToCenti(km));
	 	        		    System.out.print("Enter another value to convert into Centimeters, enter 'b' to go back: ");
		        		    
	 	        		    kmCentiContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (kmCentiContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				kmConversionAnswer = "";
	        				continue;
	        			}
	        			
	        		}
	        		
	        		while (kmConversionAnswer.toLowerCase().equals("m"))
	        		{
	        		    String kmMeterContinueAnswer = "";
	        			System.out.print("Enter the amount of Kilometers we'll be converting into Meters !: ");
	        			km = keyboard.nextFloat();
	        			System.out.printf("%.2f Kilometers is %.2f Meters !\n", km, kiloToMeters(km));
	        			System.out.print("Enter another value to convert into Meters, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			kmMeterContinueAnswer = keyboard.nextLine();
	        			while (kmMeterContinueAnswer.matches("\\d*"))
	        			{
	        			    km = Float.parseFloat(kmMeterContinueAnswer);
	        			    System.out.printf("%.2f Kilometers is %.2f Meters !\n", km, kiloToMeters(km));
	 	        		    System.out.print("Enter another value to convert into Meters, enter 'b' to go back: ");
		        		    
	 	        		    kmMeterContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (kmMeterContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				kmConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		
	        		while (kmConversionAnswer.toLowerCase().equals("in"))
	        		{
	        			String kmInchesContinueAnswer = "";
	        			System.out.print("Enter the amount of Kilometers we'll be converting into Inches: ");
	        			km = keyboard.nextFloat();
	        			System.out.printf("%.2f Kilometers is %.2f Inches !\n", km, kiloToInches(km));
	        			System.out.print("Enter another value to convert into Inches, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			kmInchesContinueAnswer = keyboard.nextLine();
	        			while (kmInchesContinueAnswer.matches("\\d*"))
	        			{
	        			    km = Float.parseFloat(kmInchesContinueAnswer);
	        			    System.out.printf("%.2f Kilometers is %.2f Inches !\n", km, kiloToInches(km));
	 	        		    System.out.print("Enter another value to convert into Inches, enter 'b' to go back: ");
		        		    
	 	        		    kmInchesContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (kmInchesContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				kmConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		
	        		while (kmConversionAnswer.toLowerCase().equals("mi"))
	        		{
	        		    String kmMiContinueAnswer = "";
	        			System.out.print("Enter the amount of Kilometers we'll be converting into Miles: ");
	        			km = keyboard.nextFloat();
	        			System.out.printf("%.2f Kilometers is %.2f Miles !\n", km, kiloToMiles(km));
	        			System.out.print("Enter another value to convert into Miles, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			kmMiContinueAnswer = keyboard.nextLine();
	        			while (kmMiContinueAnswer.matches("\\d*"))
	        			{
	        			    km = Float.parseFloat(kmMiContinueAnswer);
	        			    System.out.printf("%.2f Kilometers is %.2f Miles !\n", km, kiloToMiles(km));
	 	        		    System.out.print("Enter another value to convert into Miles, enter 'b' to go back: ");
		        		    
	 	        		    kmMiContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (kmMiContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				kmConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		if (kmConversionAnswer.toLowerCase().equals("b"))
	        		{
	        			newAnswer = "";
	        			continue;
	        		}
	        	
	        	}   
                
                // Enter this while loop when our user wants to convert Inches into another standard
	        	while (newAnswer.toLowerCase().equals("in"))
	        	{
	        		String newConversionAnswer = "";
	        		System.out.print("We'll be converting Inches into (cm, m, km, mi), enter 'b' to go back:  ");
	        		newConversionAnswer = keyboard.nextLine();
	        		
	        		while (newConversionAnswer.toLowerCase().equals("cm"))
	        		{
	        			String cmContinueAnswer = "";
	        			System.out.print("Enter the amount of Inches you want to be converted into Centimeters: ");
	        			in = keyboard.nextFloat();
	        			System.out.printf("%.2f Inches is %.2f Centimeters !\n", in, inToCm(in));
	        			System.out.print("Enter another value to convert into Centimeters, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			
	        			cmContinueAnswer = keyboard.nextLine();
	        			while (cmContinueAnswer.matches("\\d*"))
	        			{
	        				in = Float.parseFloat(cmContinueAnswer);
	        				System.out.printf("%.2f Inches is %.2f Centimeters !\n", in, inToCm(in));
	        				System.out.print("Enter another value to convert into Centimeters, enter 'b' to go back: ");
	        				
	        				cmContinueAnswer = keyboard.nextLine();
	        			}
	        			if (cmContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				newConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		
	        		while (newConversionAnswer.toLowerCase().equals("m"))
	        		{
	        			String newContinueAnswer = "";
	        			System.out.print("Enter the amount of Inches you want to be converted into Meters: ");
	        			in = keyboard.nextFloat();
	        			System.out.printf("%.2f Inches is %.2f Meters !\n", in, toMeters(in));
	        			System.out.print("Enter another value to convert into Meters, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			
	        			newContinueAnswer = keyboard.nextLine();
	        			while (newContinueAnswer.matches("\\d*"))
	        			{
	        			    in = Float.parseFloat(newContinueAnswer);
	        			    System.out.printf("%.2f Inches is %.2f Meters !\n", in, toMeters(in));
	 	        		    System.out.print("Enter another value to convert into Meters, enter 'b' to go back: ");
		        		    
	 	        		    newContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (newContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				newConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		
	        		while (newConversionAnswer.toLowerCase().equals("km"))
	        		{
	        			String keepGoingAnswer = "";
	        			System.out.print("Enter the amount of Inches you want to be converted into Kilometers: ");
	        			in = keyboard.nextFloat();
	        			System.out.printf("%.2f Inches is %.2f Kilometres !\n", in, inToKm(in));
	        			System.out.print("Enter another vlaue to convert into Kilometers, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			
	        			keepGoingAnswer = keyboard.nextLine();
	        			while (keepGoingAnswer.matches("\\d*"))
	        			{
	        				in = Float.parseFloat(keepGoingAnswer);
	        				System.out.printf("%.2f Inches is %.2f Kilometers !\n", in, inToKm(in));
	        				System.out.print("Enter another value to convert into Kilometers, enter 'b' to go back: ");
	        				
	        				keepGoingAnswer = keyboard.nextLine();
	        			}
	        			if (keepGoingAnswer.toLowerCase().equals("b"))
	        			{
	        				newConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		
	        		while (newConversionAnswer.toLowerCase().equals("mi"))
	        		{
	        			String continueConvertMi = "";
	        			System.out.print("Enter the amount of Inches you want to be converted into Miles: ");
	        			in = keyboard.nextFloat();
	        			System.out.printf("%.2f Inches is %.2f Miles !\n", in, inToMi(in));
	        			System.out.print("Enter another value to convert into Miles, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			continueConvertMi = keyboard.nextLine();
	        			while (continueConvertMi.matches("\\d*"))
	        			{
	        				in = Float.parseFloat(continueConvertMi);
	        				System.out.printf("%.2f Inches is %.2f Miles !\n", in, inToKm(in));
	        				System.out.print("Enter another value to convert into Miles, enter 'b' to go back: ");
	        				
	        				continueConvertMi = keyboard.nextLine();
	        			}
	        			if (continueConvertMi.toLowerCase().equals("b"))
	        			{
	        				newConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        		if (newConversionAnswer.toLowerCase().equals("b"))
	        		{
	        			newAnswer = "";
	        			continue;
	        		}
	        	}
	        	
	        	// enter this loop when our user wants to convert Miles into a different standard
	        	while (newAnswer.toLowerCase().equals("mi"))
	        	{
                	String miConversionAnswer = "";
	        		System.out.print("We'll be converting Miles into (cm, m, km, in), enter 'b' to go back: ");
	        		miConversionAnswer = keyboard.nextLine();
	        		
	        		while (miConversionAnswer.toLowerCase().equals("cm"))
	        		{
	        			String miCentiContinueAnswer = "";
	        			System.out.print("Enter the amount of Miles we'll be converting into Centimeters !: ");
	        			mi = keyboard.nextFloat();
	        			System.out.printf("%.2f Miles is %.2f Centimeters !\n", mi, milesToCenti(mi));
	        			System.out.print("Enter another value to convert into Centimeters, enter 'b' to go back: ");
	        		
	        			keyboard.nextLine();
	        			miCentiContinueAnswer = keyboard.nextLine();
	        			while (miCentiContinueAnswer.matches("\\d*"))
	        			{
	        			    mi = Float.parseFloat(miCentiContinueAnswer);
	        			    System.out.printf("%.2f Miles is %.2f Centimeters !\n", mi, milesToCenti(mi));
	 	        		    System.out.print("Enter another value to convert into Centimeters, enter 'b' to go back: ");
		        		    
	 	        		    miCentiContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (miCentiContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				miConversionAnswer = "";
	        				continue;
	        			}
	        			
	        		}
	        		
	        		while (miConversionAnswer.toLowerCase().equals("m"))
	        		{
	        		    String mileMeterContinueAnswer = "";
	        			System.out.print("Enter the amount of Miles we'll be converting into Meters !: ");
	        			mi = keyboard.nextFloat();
	        			System.out.printf("%.2f Miles is %.2f Meters !\n", mi, milesToMeters(mi));
	        			System.out.print("Enter another value to convert into Meters, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			mileMeterContinueAnswer = keyboard.nextLine();
	        			while (mileMeterContinueAnswer.matches("\\d*"))
	        			{
	        			    mi = Float.parseFloat(mileMeterContinueAnswer);
	        			    System.out.printf("%.2f Miles is %.2f Meters !\n", mi, milesToMeters(mi));
	 	        		    System.out.print("Enter another value to convert into Meters, enter 'b' to go back: ");
		        		    
	 	        		    mileMeterContinueAnswer = keyboard.nextLine();
	        			     
	        			}
	        			if (mileMeterContinueAnswer.toLowerCase().equals("b"))
	        			{
	        				miConversionAnswer = "";
	        				continue;
	        			}
	        		}
	        			        		
	        		while (miConversionAnswer.toLowerCase().equals("km"))
	        		{
	        		    String mileKmContinueAnswer = "";
	        			System.out.print("Enter the amount of Miles we'll be converting into Kilometers: ");
	        			mi = keyboard.nextFloat();
	        			System.out.printf("%.2f Miles is %.2f Kilometers !\n", mi, milesToKilo(mi));
	        			System.out.print("Enter another value to convert into Kilometers, enter 'b' to go back: ");
	        			
	        			keyboard.nextLine();
	        			mileKmContinueAnswer = keyboard.nextLine();
	        			
	        			while (mileKmContinueAnswer.matches("\\d*"))
	        			{
	        			    mi = Float.parseFloat(mileKmContinueAnswer);
	        			    System.out.printf("%.2f Miles is %.2f Kilometers !\n", mi, milesToKilo(mi));
	 	        		    System.out.print("Enter another value to convert into Kilometers, enter 'b' to go back: ");
		        		    
	 	        		    mileKmContinueAnswer = keyboard.nextLine();
	        			     
	        			}
 	        		    if (mileKmContinueAnswer.toLowerCase().equals("b"))
 	        		    {
 	        		        miConversionAnswer = "";
 	        		        continue;
 	        		    }
	        		}
	        		
 	        		while (miConversionAnswer.toLowerCase().equals("in"))
 	        		{
 	        		    String mileInchesContinueAnswer = "";
 	        		    System.out.print("Enter the amount of Miles we'll be converting into Inches: ");
 	        		    mi = keyboard.nextFloat();
 	        		    System.out.printf("%.2f Miles is %.2f Inches !\n", mi, milesToInches(mi));
 	        		    System.out.print("Enter another value to convert into Inches, enter 'b' to go back: ");
	        			
 	        		    keyboard.nextLine();
 	        		    mileInchesContinueAnswer = keyboard.nextLine();
 	        		    while (mileInchesContinueAnswer.matches("\\d*"))
 	        		    {
 	        		    	mi = Float.parseFloat(mileInchesContinueAnswer);
 	        		    	System.out.printf("%.2f Miles is %.2f Inches !\n", mi, milesToInches(mi));
 	        		    	System.out.print("Enter another value to convert into Inches, enter 'b' to go back: ");
		        		    
 	        		    	mileInchesContinueAnswer = keyboard.nextLine();
	        			     
 	        		    }
 	        		    if (mileInchesContinueAnswer.toLowerCase().equals("b"))
 	        		    {
 	        		    	miConversionAnswer = "";
 	        		    	continue;
 	        		    }
 	        		}
 	        		if (miConversionAnswer.toLowerCase().equals("b"))
 	        		{
 	        			newAnswer = "";
 	        			continue;
 	        		}
	        	}
	        	
	        if (newAnswer.toLowerCase().equals("b"))
	        {
	        	answer = "";
	        	continue;
	        }
	        }

	    } while (!answer.toUpperCase().equals("Q"));
	}
}