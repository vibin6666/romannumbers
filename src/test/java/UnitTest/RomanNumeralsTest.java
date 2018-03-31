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
		@Test

	public void should_return_II_when_input_2(){

		//arrange

		RomanNumerals converter = new RomanNumerals();

		int inputNumber = 2;

		String expectedResult = "II";
		//act

		String actualResult = converter.convert(inputNumber);

		//assert
		Assert.assertEquals(expectedResult, actualResult);

	}
}
