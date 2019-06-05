package Lecture4;

public class ExampleFour {

	public static void main(String[] args) {
		
		double[] cellBills = {10.0, 5.5, 4.5, 3.4, 4.2};
		
		//...
		
		double[] billsBackup = new double[cellBills.length];
		
		for (int i=0; i<cellBills.length; i++) {
			billsBackup[i] = cellBills[i];
		}
		
		cellBills[3] = 9.9;

		for( int i=0; i<cellBills.length; i++) {
			System.out.println(cellBills[i] + " - " + billsBackup[i]);
		}
		
	}

}
