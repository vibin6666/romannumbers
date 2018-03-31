package UnitTest;
import org.junit.Assert;
import org.junit.Test;

import cicd_workshop.RomanNumerals;

public class RomanNumeralsTest {
	@Test
	public void should_return_I_when_input_1(){
		//arrange
		RomanNumerals converter = new RomanNumerals();
		int inputNumber = 1;
		String expectedResult = "I";
		
		//act
		String actualResult = converter.convert(inputNumber);
		
		//assert
		Assert.assertEquals(expectedResult, actualResult);
	}
}
