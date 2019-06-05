package Lecture5;

public class ExampleOne {

	public static void main(String[] args) {
		
		String classes = "CS115MATH251PHYS230MATH100";

		String[] courseNumbers = classes.split("[a-zA-Z]+");
		
		for (int i=0; i<courseNumbers.length; i++) {
			System.out.println(courseNumbers[i]);
		}
		
	}

}
