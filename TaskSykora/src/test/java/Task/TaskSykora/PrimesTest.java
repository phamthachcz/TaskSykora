package Task.TaskSykora;







import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class PrimesTest {
	

	
	@Test
	public void testWithPrimeNumber() {
		//TODO Check input number 2
		assertEquals(true, Primes.isPrime(2));
		assertEquals(true, Primes.isPrime(5));
		assertEquals(true, Primes.isPrime(13));
	}
	
	@Test
	public void testWithNormalNumber() {
		//TODO Check input number 1
		assertEquals(false, Primes.isPrime(1));
		assertEquals(false, Primes.isPrime(6));
		assertEquals(false, Primes.isPrime(9));
	}
	
	@Test
	public void testWithZeroNumber() {
		//TODO Check input number 0
		assertEquals(false, Primes.isPrime(0));
	}
	
	@Test
	public void testWithNegativeNumber() {
		//TODO Check input negative number
		assertEquals(false, Primes.isPrime(-1));
		
		assertEquals(false, Primes.isPrime(-13));
		
		assertEquals(false, Primes.isPrime(-17));
	}
	
	@Test
	public void testWithLargeNumber() {
		//TODO check input large number
		assertEquals(true, Primes.isPrime(155689));
		assertEquals(false, Primes.isPrime(34534734));
	}
	
	
	@Test
	public void testFindPrimesNumberInList() {
		
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(-2);
		lst.add(15);
		lst.add(19);
		lst.add(21);
		lst.add(89);
		
		assertEquals(3, Primes.checkPrimes(lst, false).size());
	
	}
	
	@Test
	public void testWithEmptyList() {
		
		assertEquals(0, Primes.checkPrimes(Collections.emptyList(), false).size());
	}
	
	@Test
	public void testWithNullList() {
		
		//Test with null list
		assertEquals(0, Primes.checkPrimes(null, false).size());
	}
	
	
}
