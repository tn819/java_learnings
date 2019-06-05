package Lecture7;

public class NameMain {

	public static void main(String[] args) {
		Name myName = new Name();
		myName.setMiddle("Frank");
//		System.out.println(myName);
//		
//		myName.setFirst("Dylan");
//		myName.setMiddle("Foster");
//		myName.setLast("Boliske");
//		
//		System.out.println(myName.getFirst());
//		System.out.println(myName.getMiddle());
//		System.out.println(myName.getLast());
		
		Name yourName = new Name();
		
		System.out.println(myName.equals(yourName));
		
//		System.out.println(myName.junior);
//		myName.setJunior("jr");
//		System.out.println(yourName.junior);
//		System.out.println(myName.getFirst().charAt(0));
	}

}
