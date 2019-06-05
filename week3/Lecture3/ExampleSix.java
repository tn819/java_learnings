package Lecture3;

public class ExampleSix {

	public static void main(String[] args) {
		
		int size = 3;
		int row = 0;
		
		while (row < size) {
			int column = 0;
			while(column < size) {
				System.out.print("*");
				column++;
			}
			System.out.println();
			row++;
		}

	}

}
