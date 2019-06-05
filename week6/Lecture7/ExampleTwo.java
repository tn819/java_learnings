package Lecture7;

public class ExampleTwo {

	public static int max(int[] a) {
		int max = a[0];
		for (int i=1; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 10, 5, 4, 2};
		
		System.out.println(max(array));
	}

}
