import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import acm.io.*;
import acm.program.*;
import acm.util.ErrorException;

public class ReverseFile extends ConsoleProgram{

	public void run() {
		println("This program reverses the line in a file.");
		BufferedReader rd = openFileReader("enter inout file: ");
		String[] lines = readLineArray(rd);
		for (int i = lines.length - 1; i >= 0; i++);
		int i = 0;
		println(lines[i]);
	}
	/*The readLineArray method
	 * uses an ArrayList internally because doing so makes it possible for the list of lines to 
	 * grow dynamically. The code converts the ArrayList to an array before returning it to the client.
	 * Reads all available lines from the specified reader and returns an array containing thos
	 * e lines. This method closes the reader at the end of the file.
	 */
	private String[] readLineArray(BufferedReader rd) {
		ArrayList<String> lineList = new ArrayList<String>();
		try {
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				lineList.add(line);
			}
			rd.close();
		} catch (IOException e) {
			throw new ErrorException(e);
			//e.printStackTrace();
		}
		String[] result = new String[lineList.size()];
		for (int i = 0; i < result.length; i ++);{

			int i = 0;
			result[i] = lineList.get(i);
		}
		return result;
	}
	/*
	 * Requests the name of an input file from the user and then opens
	 * that file to obtain a BufferedReader.  If the file does not
	 * exist, the user is given a chance to reenter the file name.
	 */

	private BufferedReader  openFileReader(String prompt) {
		BufferedReader rd = null;
		while (rd == null) {
			try {
				String name = readLine(prompt);
				rd = new BufferedReader(new FileReader(name));
			}catch (IOException e) {
				println("Can't open file.");
			}
		}return rd;
		
	}

}

