package featureSteps;

import java.util.List;

import org.junit.Assert;

import cicd_workshop.RomanNumerals;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import cucumber.api.DataTable;
import static org.junit.Assert.*;

public class RomanNumeralsStepDefinitions {
	private RomanNumerals converter;
	private int inputNumber = 0;
	private String actualResult = "";
	@Given("^a decimal number equal to <decimalNumber>$")
	public void a_decimal_number_equal_to_decimal_number() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    converter = new RomanNumerals();
	    //inputNumber = decimalNumber;
	}

	@When("^the roman numeral is generated$")
	public void the_roman_numeral_is_generated() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //actualResult = converter.convert(inputNumber);
	}

	@Then("^roman numeral should be <romanNumber>$")
	public void roman_numeral_should_be_roman_numeral(List<NumberSet> numbers) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
		boolean result = true;
		String actualResult = ""; 
		String expectedResult = "";
	    for(NumberSet numberSet : numbers){
	    	expectedResult = numberSet.romanNumber;
	    	actualResult = converter.convert(numberSet.decimalNumber);
	    	System.out.println(expectedResult + " " + actualResult);
	    	assertEquals(expectedResult,actualResult);
	    }
		
	}
}
