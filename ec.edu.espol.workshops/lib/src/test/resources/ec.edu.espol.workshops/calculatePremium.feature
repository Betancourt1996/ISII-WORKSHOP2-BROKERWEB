Feature: Calculate the insurance prime for a customer?
	Scenario: The customer is an elderly, male, married
		Given is an adult, male, single
		When we calculate the premium
		Then we should be told 2000
