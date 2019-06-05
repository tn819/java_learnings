package Lecture7;

public class Name {

	private String first;
	private String middle;
	private String last;
	
	public static String junior = "jr.";
	public static String senior = "sr.";
	
	public Name() {
		first = "John";
		middle = "";
		last = "Doe";
	}
	
	public Name(String f, String l) {
		first = f;
		last = l;
		
		middle = "";
	}
	
	public Name(String f, String m, String l) {
		first = f;
		last = l;
		
		middle = m;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public void setMiddle(String m) {
		middle = m;
	}
	
	public void setLast(String l) {
		last = l;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getMiddle() {
		return middle;
	}
	
	public String getLast() {
		return last;
	}

	public static void setJunior(String j) {
		junior = j;
	}
	
	public static void setSenior(String s) {
		senior = s;
	}
	
	public String toString() {
		return first + " " + (middle.equals("")?"":(middle + " "))+ last;
	}
	
	public boolean equals(Name n) {
//		return last.equals(n.getLast()) && first.equals(n.getFirst()) 
//				&& middle.equals(n.getMiddle());
		if (!last.equals(n.getLast())) {
			return false;
		} else if(!first.equals(n.getFirst())) {
			return false;
		} else if (!middle.equals(n.getMiddle())) {
			return false;
		} else {
			return true;
		}
	}
	
}
