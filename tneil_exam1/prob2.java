package tneil_exam1;

import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		String in = input.nextLine();
		
		String z = "z";
		String a = "a";
		String A = "A";
		String Z = "Z";
		String zero = "0";
		String nine = "9";
				
		if ((in.compareTo(z) <= 0) && (in.compareTo(a) >= 0)){//lower case logic
			in = in.toUpperCase();//make upper case if lower case
			System.out.println(in);
		}
		else if ((in.compareTo(Z) <= 0) && (in.compareTo(A) >= 0)){//upper case logic
			in = in.toLowerCase();//make lower case if Upper case
			System.out.println(in);
		}
		else if ((in.compareTo(nine) <= 0) && (in.compareTo(zero) >= 0)){//digit logic
			System.out.println(in.charAt(0)*2-96);//double value of character by 2 if a digit
		}
		else{//in all other cases, simply reprint
			System.out.println(in);//reprint 
		}
		input.close();
		
	}

}
