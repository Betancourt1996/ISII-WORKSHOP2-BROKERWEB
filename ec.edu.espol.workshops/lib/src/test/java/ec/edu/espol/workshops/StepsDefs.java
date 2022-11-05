package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class StepsDefs {
	private int actualAnswer1;
	public CarInsurance carInsurance = new CarInsurance();
	
	@Given("is an adult, male, single")
	public void citizen_is_elderly_male_married() {		
		carInsurance.setEdad(99);
		carInsurance.setSexo('h');
	    carInsurance.setEstado_civil('c');
		}
	@When("we calculate the premium")
	public void we_calculate_the_premium() {
		actualAnswer1 = carInsurance.getPrevium();
		}
	@Then("we should be told 2000")
	public void we_should_receive() {
		assertEquals(1800, actualAnswer1);
		} 

	}