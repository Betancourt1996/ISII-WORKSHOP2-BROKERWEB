package ec.edu.espol.workshops;
import ec.edu.espol.workshops.CarInsurance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarInsurance nuevo = new CarInsurance();
		
		System.out.println("** Test **");
		
		nuevo.calculoPrima(18, "h", "c");
		nuevo.calculoPrima(17, "h", "c");
		nuevo.calculoPrima(19, "h", "c");
		
		nuevo.calculoPrima(50, "h", "c");
		
		nuevo.calculoPrima(99, "m", "c");
		nuevo.calculoPrima(100, "h", "c");
		nuevo.calculoPrima(101, "m", "c");
		
		nuevo.calculoPrima(18, "m", "s");

		

	}

}
 