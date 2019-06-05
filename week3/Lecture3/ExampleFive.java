package Lecture3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleFive {

	public static void main(String[] args) throws IOException{
		
		File file = new File("number.txt");
		Scanner input = new Scanner(file);
		
		boolean notDone = true;
		
		int sum = 0;
		int count = 0;
		
		while (notDone) {
			int num = input.nextInt();
			
			if (num%2==1) {
				sum = sum + num;
				count = count + 1;
			}
			
			notDone = input.hasNextInt() || count<=9;
			
		}
		
		System.out.println(sum);
		
		input.close();

	}

}
