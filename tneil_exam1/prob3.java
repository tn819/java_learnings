package tneil_exam1;

import java.util.Scanner;

public class prob3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int response = Integer.parseInt(input.nextLine());//user prompt for input
		
		for(int i =0; i<response;i++){//iterate through five lines
			if((i == 0) || (i == 2) || (i == response)){// conditions for full line write
				for(int j=0; j<i; j++){
				System.out.print("*");
				}}
			else{
				for(int j=0; j<i; j++){// if not line 1,2,end line
					if((j == 0)||(j==i)){
					System.out.print("*");// print at start and end of line
					}
					else{
					System.out.print(" ");// print blanks elsewhere
					}
			}
			System.out.println();
			}
		input.close();

}
}
}
