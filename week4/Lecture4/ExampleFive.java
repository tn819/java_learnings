package Lecture4;

public class ExampleFive {

	public static void main(String[] args) {
		
		int[] original = {1, 2, 3, 4, 5, 6};
		
		int[] temp = new int[10];
		for (int i=0; i<original.length; i++) {
			temp[i] = original[i];
		}
		original = temp;
		temp = null;
		
		for(int i=0; i<original.length; i++) {
			System.out.println(original[i]);
		}

	}

}
