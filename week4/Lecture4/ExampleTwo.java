package Lecture4;

public class ExampleTwo {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		
		int[] first = new int[SIZE];
		int[] second = new int[SIZE];
		int[] third = new int[SIZE];
		int[] fourth = new int[SIZE];
		
		for (int i=1; i<=SIZE; i++){
			first[i-1] = i;
			second[i-1] = (int) Math.pow(i, 2);
			third[i-1] = (int) Math.pow(i, 3);
			fourth[i-1] = (int) Math.pow(i, 4);
		}
		
		for(int i=0; i<SIZE; i++) {
			System.out.println(first[i] + "\t" + second[i] + "\t" + third[i] + "\t" + fourth[i]);
		}
		
	}

}
