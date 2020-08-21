
public class October31 {
	
	// an arity method is defined as the number of parameters in a call to a method
	// whereas in an fixed arity method, the number of parameters MUST BE THE SAME in every call to the method, and that
	//   method must be the same as the number of formal parameters in the method’s definition.
	public static double average( double... numbers) { // the ellipse after the type name of the parameter is what makes this a arity method.
		// the ellipses indicates that any number of values that are of the type double can be provided when the subroutine is called
		double sum;
		double avg;
		sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		avg = sum / numbers.length;
		return avg;
	}
	
	public static String concat(String... values) {
		String NULL_STRING = "";
		for (String str : values) {
			NULL_STRING += str + " ";
		}
		return NULL_STRING;
	}
	
	public static void main(String []args) {
		System.out.println(concat("hello", "world"));
		System.out.print(concat("hey yoo,", "RZA hit me with that", "flava my damage be"));
	}
	
	/*
	 * 	Another way to initialize an array with a list of values the same time when its declared is as follows
	 *    int[] squares = { 1, 4, 9, 16, 25, 36, 49 }; this initializes squares to refer to a newly created array that contain the values defined in the list
	 *   A list initializer of this form can be used only in a declaration statement !
	 */
	
	/*
	 * However, there is another, similar notation for creating a new array that can be used in other places
	 * The following notation uses another form of the new operator to be able to create both a new array object and to fill it in with the values provided
	 * supposed the variable cubes already has been initialized already and we wanted to assign a new values to it we can do so by:
	 * 		cubes = new int[] {1, 8, 27, 64, 125, 216, 343}; // this is an assignment statement rather than a declaration so if we don't
	 * 															// use the new int[] syntax our code will not be vaild
	 */
	
	/*
	 * 	The syntax for the new operator is as follow's:
	 * 		new <base-type> [] { <list-of-values> } // this expression takes in the value of a reference to a newly created array object, in this sense
	 * 											// its just an array literal, since it's just something that we can type in a program to represent a value
	 * 											// This means that it can be used in any context where it takes in an object of type <base-type> [].
	 *  // for example we could pass in a newly created array as an actual parameter to a subroutine
	 */
	
	/**
     * Creates a Menu.  The names for the MenuItems in the menu are
     *     given as an array of Strings.
     * @param menuName  the name for the Menu that is to be created.
     * @param itemNames  an array holding the text that appears in each
     *     MenuItem.  If a null value appears in the array, the corresponding
     *     item in the menu will be a separator rather than a MenuItem.
     * @return  the menu that has been created and filled with items.
    **/
	/*
	public static Menu createMenu(String menuName, String[] itemNames) {
	      Menu menu = new Menu(menuName);
          for ( String itemName : itemNames ) {
              if ( itemName == null ) {
                  menu.getItems().add( new SeparatorMenuItem() );
              } else {
                  MenuItem item = new MenuItem(itemName);
                  menu.getItems().add(item);
              }
          }
          return menu;
      }
	*/
}
