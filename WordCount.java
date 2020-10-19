/*WordCount.java
 * Program counts total number of words in any text files
 */

import java.util.Scanner;
import java.io.*;

public class WordCount {
	
	static int lineCount = 0;
	static int wordCount = 0;
	static int charCount = 0;

	//Main method
	public static void main(String[] args) {
		
		//user input for text file
		System.out.println("Please enter file name: ");
		Scanner userInput = new Scanner(System.in);
		String fileName = userInput.nextLine();
		
		String tempString = "";
		
		try {

			File kingLear = new File(fileName);
			FileReader readFile = new FileReader(kingLear);
			BufferedReader bufferRead = new BufferedReader(readFile);

			while((tempString = bufferRead.readLine()) != null){
				charCount += tempString.length();
				String[] words = tempString.split("( )|(')");

				wordCount += words.length;
				lineCount ++;

				for (int i= 0; i < words.length; i++) {
					System.out.println(words[i]);
				}
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch (IOException e) {
			System.out.println("Incorrect Input/output");
		}
		System.out.println("Line count: " + lineCount);
		System.out.println("Word count: " + wordCount);
		System.out.println("Char count: " + charCount);

	}

}
