package ec.edu.espol.workshops;
import ec.edu.espol.workshops.CarInsurance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarInsurance nuevo = new CarInsurance();
		
		System.out.println("** Test **");


		
		nuevo.calculoPrima(18, "m", "c");
		nuevo.calculoPrima(24, "otro", "s");
		nuevo.calculoPrima(30, "mujer", "viuda");
		
		nuevo.calculoPrima(20, "h", "s");
		nuevo.calculoPrima(31, "h", "c");
		nuevo.calculoPrima(50, "m", "s");
		


		

	}

}
 