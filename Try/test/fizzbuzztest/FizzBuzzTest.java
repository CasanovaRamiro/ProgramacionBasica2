package fizzbuzztest;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void FizzBuzzExists() {
		FizzBuzz fb = new FizzBuzz(12);
		assertNotNull(fb);
		assertNotNull(fb.value);
		assertNotNull(fb.result());
		/*
		Integer ve = 5;
		Integer vo = 5;
		assertEquals(ve,vo);
		*/
		//assertEquals((Integer)12,fb.value);
	}
	
	@Test
	public void expectValueToExist() {
		FizzBuzz fb = new FizzBuzz(12);
		
		Integer ve = 12;
		Integer vo = fb.value;
		assertEquals(ve,vo);
	}
	
	@Test
	public void expectThreeToBeFizz() {
		FizzBuzz fb = new FizzBuzz(3);
		
		String ve = "Fizz";
		String vo = fb.result();
		assertEquals(ve,vo);
	}
	
	@Test
	public void expectThreeToBeBuzz() {
		FizzBuzz fb = new FizzBuzz(5);
		String vo = fb.result();
		assertEquals("Buzz",vo);
	}
	
	@Test
	public void expectSevenToBeSeven() {
		FizzBuzz fb = new FizzBuzz(7);
		String vo = fb.result();
		assertEquals("7",vo);
	}
	
	@Test
	public void expectFiteenToBeFizzBuzz() {
		FizzBuzz fb = new FizzBuzz(15);
		String vo = fb.result();
		assertEquals("FizzBuzz",vo);
	}
	

}
