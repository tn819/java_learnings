package Lecture4;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double[] numbers = new double[10];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Enter a number: ");
			numbers[i] = Double.parseDouble(in.nextLine());
		}
		
		boolean done = false;
		double temp;
		do {
			System.out.println("Enter 'Max', 'Min', 'Total', 'Average', or 'Exit': ");
			String input = in.nextLine();
			
			switch (input) {
				case "Max":
				case "max":
					temp = numbers[0]; //initially assume that the first is the max
					for (int i=1; i<numbers.length; i++) {
						if (temp<numbers[i]) { //is the current bigger?
							temp = numbers[i];
						}
					}
					System.out.println("The max is " + temp);
					break;
				case "Min":
				case "min":
					temp = numbers[0]; //initially assume that the first is the min
					for (int i=1; i<numbers.length; i++) {
						if (temp>numbers[i]) { //is the current smaller?
							temp = numbers[i];
						}
					}
					System.out.println("The min is " + temp);
					break;
				case "Total":
				case "total":
					temp = 0; //used to store the total
					for (int i=0; i < numbers.length; i++) {
						temp += numbers[i];
					}
					System.out.println("The total is " + temp);
					break;
				case "Average":
				case "average":
					temp = 0; //used to store the total
					for (int i=0; i < numbers.length; i++) {
						temp += numbers[i];
					}
					System.out.println("The average is " + (temp/numbers.length)); //divide the total by the array's length
					break;
				case "Exit":
				case "exit":
					done = true;
					System.out.println("Bye Bye");
					break;
				default: //case when we don't understand the user's input
					System.out.println("I don't understand, please try again.");
			}
			
		} while(!done);
		
		in.close();
	}

}
