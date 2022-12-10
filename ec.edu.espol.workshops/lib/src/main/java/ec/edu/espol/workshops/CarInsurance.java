package ec.edu.espol.workshops;

public class CarInsurance {

	int edad;
	char sexo;
	char estado_civil;
	
	
	
	
	public CarInsurance() {
		
	}
	
	public void calculoPrima(int edad, String sexo, String civil) {
		int prima = 500;
		if(edad<18 || edad>100) {
			System.out.println("Exception,La edad debe ser mayor a 17 y menor a 100");
			return;
		}
		if(!(sexo=="h" || sexo=="m") ) {
			System.out.println("Exception,el sexo debe ser los siguientes h,m");
			return;
		}
		if(!(civil=="c" || civil=="s") ) {
			System.out.println("Exception,el estado civil debe ser los siguientes c,s");
			return;
		}
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
	
	public int calcularPrevium() {
		int prima = 600;
		
		if(this.getSexo() == 'h' && this.getEstado_civil()=='s' && this.getEdad()< 25) {
			prima+=1500;
		}
		
		if(this.getSexo() == 'm' || this.getEstado_civil()=='c') {
			prima-=200;
		}
		
		if(this.getEdad()>= 45 ||  this.getEdad() < 65) {
			prima+=1500;
		}
		return prima;
	}
	public int getPrevium() {
		return this.calcularPrevium();
	}
	
}