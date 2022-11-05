package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class StepsDefs {
	private int actualAnswer1;
	public CarInsurance carInsurance = new CarInsurance();
	
	@Given("is an elderly, male, married")
	public void citizen_is_elderly_male_married() {		
		carInsurance.setEdad(99);
		carInsurance.setSexo('m');
	    carInsurance.setEstado_civil('c');
		}
	@When("we calculate the premium")
	public void we_calculate_the_premium() {
		actualAnswer1 = carInsurance.getPrevium();
		}
	@Then("we should recive 1800")
	public void we_should_receive() {
		assertEquals(1800, actualAnswer1);
		} 
	/*
	@Given("today is Sunday")
	public void today_is_Sunday() {
		today = "Sunday";
		}
	@Given("today is {string}")
	public void today_is(String today) {
		this.today = today;
		}
	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		actualAnswer1 = IsItFriday.isItFriday(today);
		}
	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer1);
		} */
	}