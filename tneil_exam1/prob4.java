package tneil_exam1;

import java.util.Scanner;

public class prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[]userArray = new String[5];// create a string array
		for (int i = 0; i<userArray.length; i++){
			System.out.println("Enter a word");//fill array with words
			userArray[i] = input.nextLine();
		}
		String word = userArray[0];
		
		for (int i = 0; i<userArray.length; i++){
			if (userArray[i].compareToIgnoreCase(word) >= 0){ //compare alphabetical order
				word = userArray[i];//replace word if behind in alphabet
			}
		}
		
		System.out.println(word);//print last word alphabetically
	}

}
