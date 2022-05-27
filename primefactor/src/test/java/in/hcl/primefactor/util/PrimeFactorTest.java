package in.hcl.primefactor.util;

import static org.junit.Assert.assertEquals;

import static java.util.Arrays.asList;
import java.util.Arrays;

import org.junit.Test;
import in.hcl.primefactor.util.PrimeFactor;

public class PrimeFactorTest {
	
	@Test
	public void oneHasNotPrimeFactor() {
		assertEquals(asList(), PrimeFactor.computeFactorsFor(1));
	}
	
	@Test
	public void twoHasOnlyItselfAsAPrimeFactor() {
		assertEquals(asList(2), PrimeFactor.computeFactorsFor(2));
	}
	
	@Test
	public void threeHasOnlyItselfAsAPrimeFactor() {
		assertEquals(asList(3), PrimeFactor.computeFactorsFor(3));
	}
	
	@Test
	public void fourHasTwoTimesTwoAsPrimeFactor() {
		assertEquals(asList(2,2), PrimeFactor.computeFactorsFor(4));
	}
	
	@Test
	public void fiveHasOnlyItselfAsAPrimeFactor() {
		assertEquals(asList(5), PrimeFactor.computeFactorsFor(5));
	}
	
	@Test
	public void sixHasTwoAndThreeAsPrimeFactor() {
		assertEquals(asList(2,3), PrimeFactor.computeFactorsFor(6));
	}
	
	@Test
	public void eightHasThreeTimesTwoAsPrimeFactor() {
		assertEquals(asList(2,2,2), PrimeFactor.computeFactorsFor(8));
	}
	
	@Test
	public void nineHasTwoTimesThreeAsPrimeFactor() {
		assertEquals(asList(3,3), PrimeFactor.computeFactorsFor(9));
	}
	
	@Test
	public void TenHasTwoAndFiveAsPrimeFactor() {
		assertEquals(asList(2, 5), PrimeFactor.computeFactorsFor(10));
	}
	
}
