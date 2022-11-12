package ec.edu.espol.workshops;
import ec.edu.espol.workshops.CarInsurance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarInsurance nuevo = new CarInsurance();
		
		System.out.println("Edad Test");
		
		nuevo.calculoPrima(1, "h", "c");
		nuevo.calculoPrima(29, "h", "s");
		nuevo.calculoPrima(-5, "m", "s");
		
		System.out.println("Sexo Test");
		
		nuevo.calculoPrima(29, "h", "s");
		nuevo.calculoPrima(29, "x", "s");
		
		System.out.println("Estado_Civil Test");
		
		nuevo.calculoPrima(29, "h", "s");
		nuevo.calculoPrima(29, "h", "y");
	}

}
 