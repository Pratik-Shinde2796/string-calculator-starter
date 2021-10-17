package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
}
