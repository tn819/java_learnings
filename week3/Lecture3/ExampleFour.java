package Lecture3;

import java.util.Scanner;

public class ExampleFour {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		boolean done = false;
		int number = input.nextInt();
		
		int total = 0;
		int counter = 0;
		
		done = !(number>0 && counter<10);
		
		while (!done) {
			total = total + number;
			counter = counter + 1;
			
			number = input.nextInt();
			done = !(number>0 && counter<9);
		}
		
		System.out.println(total/counter);
		
		input.close();
		
	}

}
