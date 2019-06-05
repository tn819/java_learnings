package Lecture4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) throws IOException {
		
		int[] characterCounts = new int[26];
		
		File file = new File("datafile.dat");
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			
			for (int i=0; i<line.length(); i++) {
				char c = line.charAt(i);
				
				if (c >= 'A' && c <= 'Z'){
					characterCounts[c - 'A']++;
				} else if (c >= 'a' && c <= 'z') {
					characterCounts[c - 'a']++;
				}
				
			}
			
		}
		
		input.close();

		for (int i=0; i<characterCounts.length; i++) {
			System.out.println(((char)(i + 'A')) + " - " + characterCounts[i]);
		}
		
	}

}
