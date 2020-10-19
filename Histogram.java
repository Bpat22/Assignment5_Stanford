/* Histogram.java
 * Reads the score from data file. Separate the score and 
 * print * in each category according to student scores
 */

import java.io.*;

public class Histogram {
	
	//private static String[] arrScores = new String[20];
	private static final int[] COUNTER_SCORE = new int[11];
	
	private static int counter = 0;

	public static void main(String[] args) throws IOException {
		//reading file 
		
		try {
			File midterm = new File("MidtermScores.txt");
			FileReader readFile = new FileReader(midterm);
			BufferedReader rd = new BufferedReader(readFile);
		
			//Data is String format so parse as Integer to read score and stored in temp variable
			//while loop to see if there is data see what number it is and put in specific if statement
			//if no data, break the loop
			while (true) {
				String temp = rd.readLine();
				if (temp == null)
					break;
				int num = Integer.parseInt(temp.trim());
				
				if (num >=0 && num <=9) {
					COUNTER_SCORE[0]++ ;
				}else if (num >= 10 && num <=19) {
					COUNTER_SCORE[1]++;
				}else if (num >= 20 && num <=29) {
					COUNTER_SCORE[2]++;
				}else if (num >= 30 && num <=39) {
					COUNTER_SCORE[3]++;
				}else if (num >= 40 && num <=49) {
					COUNTER_SCORE[4]++;
				}else if (num >= 50 && num <=59) {
					COUNTER_SCORE[5]++;
				}else if (num >= 60 && num <=69) {
					COUNTER_SCORE[6]++;
				}else if (num >= 70 && num <=79) {
					COUNTER_SCORE[7]++;
				}else if (num >= 80 && num <=89) {
					COUNTER_SCORE[8]++;
				}else if (num >= 90 && num <=99){
					COUNTER_SCORE[9]++;		
				}else if (num == 100){
					COUNTER_SCORE[10]++;	
				}	
			}							
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch (IOException e) {
			System.out.println("Incorrect Input/output");
		}
		//printing the the score
		System.out.println("score 00-09: " + COUNTER_SCORE[0]);
		System.out.println("score 10-19: " + COUNTER_SCORE[1]);
		System.out.println("score 20-29: " + COUNTER_SCORE[2]);
		System.out.println("score 30-39: " + COUNTER_SCORE[3]);
		System.out.println("score 40-49: " + COUNTER_SCORE[4]);
		System.out.println("score 50-59: " + COUNTER_SCORE[5]);
		System.out.println("score 60-69: " + COUNTER_SCORE[6]);
		System.out.println("score 70-79: " + COUNTER_SCORE[7]);
		System.out.println("score 80-89: " + COUNTER_SCORE[8]);
		System.out.println("score 90-99: " + COUNTER_SCORE[9]);
		System.out.println("score 100: " + COUNTER_SCORE[10]);
	}	

}
