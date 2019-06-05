package Lecture3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) throws IOException{
		
		File input = new File("textFile.txt");
		Scanner in = new Scanner(input);
		
		while(in.hasNext()){
			System.out.println(in.next());
		}
		
		in.close();

	}

}
