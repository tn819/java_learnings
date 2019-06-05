package tneil_exam1;

import java.util.Scanner;

public class prob1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int in = Integer.parseInt(input.nextLine());
		
		System.out.println((char)(in*4 + 130));
		
		input.close();
	}

}
