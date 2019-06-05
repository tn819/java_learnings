package Lecture3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleSeven {

	public static void main(String[] args) throws IOException {
		
		File input = new File("input.txt");
		Scanner in = new Scanner(input);
		
		int total = 0;
		int counter = 0;
		
		do {
			int number = in.nextInt();
			total+=number;
			counter++;
		} while (in.hasNextLine());
		
		System.out.println((double)total/(double)counter);

		in.close();

	}

}
