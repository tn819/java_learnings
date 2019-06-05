package Lecture3;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		int total = 0;
		int count = 0;
		
		while (input>0) {
			total = total + input;
			count = count + 1;
			
			input = in.nextInt();
		}
		
		if (count>0) {
			System.out.println("The average is " + (total/count));
		} else {
			System.out.println("No average");
		}

	}

}
