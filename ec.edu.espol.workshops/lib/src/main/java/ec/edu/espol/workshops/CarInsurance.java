package ec.edu.espol.workshops;

public class CarInsurance {


	private int edad;
	private char sexo;
	private String estadoCivil;
	
	public CarInsurance(int edad, char sexo, String estadoCivil) {
		super();
		this.edad = edad;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	} 
	
	public double calcularPrima() {
		//codigo
		return 0.0;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	


}
