package Task.TaskSykora;

import java.util.ArrayList;
import java.util.List;

public class Primes {//Class find prime number
	
	
	public static Boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
        else if(number == 2){
            return true;
        }
        else if(0 == number % 2){
            return false;
        }
		
		for(int i = 3; i <= Math.sqrt(number); i+=2) {
			if(0 == number % i) {
				return false;
			}
		}
		return true;
	}
	
	
	public static List<Integer> checkPrimes(List<Integer> inputPrimes, Boolean isPrint){
		
		List<Integer> result = new ArrayList<>();
		if(inputPrimes == null) {
			return result;
		}
		
		for (Integer integer : inputPrimes) {
			if(Boolean.TRUE.equals(isPrime(integer))) {
				if(Boolean.TRUE.equals(isPrint))
					System.out.println(integer);
				result.add(integer);
			}
		}
		
		return result;
	}
	
	
	
}

