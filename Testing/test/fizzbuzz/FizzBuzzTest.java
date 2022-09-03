package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzBuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void test() {
		Integer ve = 12;
		FizzBuzz fb = new FizzBuzz (ve);
		assertEquals(ve, fb.getValue());
	}

}
