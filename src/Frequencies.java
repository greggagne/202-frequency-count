/**
 *  @author [YOUR NAME GOES HERE]
 *  
 *  @description:  [provide a brief description of your program]
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Frequencies {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Must provide name of the input file");
			System.exit(0);
		}

		// variables for keeping track of the input file
		String line;
		List<String> fileLines;

		// open input file
		try {
			// Read each line into a list
			fileLines = Files.readAllLines(Paths.get(args[0]));
		} catch(IOException e) {
			System.err.println("File " + args[0] + " not found.");
			return;
		}
		
		/**
		 * This logic reads through each input line and extracts each separate word.
		 */

		Iterator<String> itr = fileLines.iterator();

		while (itr.hasNext()) {
			// get the next line in the input file
			line = itr.next();

			// now remove all non alphanumeric characters
			line = line.replaceAll("[^a-zA-Z]+", " ");

			// splits the line into each word
			String tokens[] = line.split(" ");

			/**
			 * At this point, tokens[0] is the first word,
			 * tokens[1] is the second word, and so forth.
			 */
		}

		System.out.println("Just read " + fileLines.size() + " lines.");
	}
}
