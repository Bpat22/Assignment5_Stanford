/*UniqueNames.java
 * program takes input form user entered names
 * check if any names are same
 * returns the unique names out of all names entered
 */
import java.util.*;

public class UniqueNames{
	static Scanner input = new Scanner(System.in);
	static ArrayList<String> arrNames = new ArrayList<String>();
	static String names;

	//main method
	public static void main(String[]args) {
				
		while (true) {
			//user input, enters in next line and checks for case sensitivity to avoid storing same name
			System.out.println("Enter your name: ");
			names = input.nextLine();
			names = names.toLowerCase();
			//when user enters name, code checks if that name is not in list then add
			if(!(arrNames.contains(names))) {
				arrNames.add(names);
			}
			//condition to break the loop
			if (names.equals(""))
			break;
		}	
		listNames();
	}
	
	private static void listNames() {
		System.out.println("Unique names are ");
		for (int i = 0; i < arrNames.size(); i++) {
			System.out.println(arrNames.get(i));
		}
	}
}
