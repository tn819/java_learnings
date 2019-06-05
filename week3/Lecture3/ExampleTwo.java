package Lecture3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) throws IOException {
		
		File input = new File("input.txt");
		Scanner in = new Scanner(input);
		
		int total = 0;
		int counter = 0;
		
		while(in.hasNextLine()) {
			int number = in.nextInt();
			total = total + number;
			counter = counter + 1;
		}
		
		System.out.println((double)total/(double)counter);

		in.close();
		
	}

}
