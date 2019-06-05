package Lecture5;

import java.util.regex.Pattern;

public class ExampleTwo {

	public static void main(String[] args) {
		
		String[] dates = {"01/01/2017", "1-1-2017", "32-12-2016"};
		
		for (int i=0; i<dates.length; i++) {
			System.out.println(dates[i] + " " + Pattern.matches("([1-9]|[0][1-9]|[12][0-9]|[3][01])(-|/)([1-9]|[0][1-9]|[1][0-2])(-|/)[0-9]{4}", dates[i]));
		}
	}

}
