package Task.TaskSykora;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if(args.length  == 0) {
    		return;
    	}
    	ExcelFile excelFile = new ExcelFile(args[0]);
    	
    	try {
			Primes.checkPrimes(excelFile.getNumbersInFile(1), true);
		} 
    	catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
        
    }
    
    
    
    
}
