package WORKSHOP2;

public class CarInsurance {

	int edad;
	char sexo;
	char estado_civil;
	
	
	
	
	public CarInsurance() {
		
	}
	
	public void calculoPrima(int edad, String sexo, String civil) {
		int prima = 500;
		
		if(sexo=="h" && civil=="s" && edad < 25) {
			prima+=1500;
		}
		
		if(sexo=="m" || civil=="c") {
			prima-=200;
		}
		
		if(edad >= 45 ||  edad < 65) {
			prima+=1500;
		}
		
		System.out.println("estado civil: "+civil+" edad: "+edad+" sexo: "+sexo+ " Prima es: "+prima);
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
	public char getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(char estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	
	
}
