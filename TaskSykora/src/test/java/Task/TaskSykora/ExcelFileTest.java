package Task.TaskSykora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.io.FileNotFoundException;

import org.junit.Test;

public class ExcelFileTest {
	
	@Test
	public void testExceptionIsThrown() {

		assertThrows(FileNotFoundException.class, () -> new ExcelFile("").getNumbersInFile(1));
		assertThrows(FileNotFoundException.class, () -> new ExcelFile("D:\\abc.xlsx").getNumbersInFile(1));
	}
	
	@Test
	public void testReadNumbersInFile() {
		ExcelFile excel = new ExcelFile("D:\\data.xlsx");
		try {
			int countActual   =  excel.getNumbersInFile(1).size();
			assertEquals(17, countActual);
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReadNumbersInAnotherColumn() {
		ExcelFile excel = new ExcelFile("D:\\data.xlsx");
		try {
			int countActual = excel.getNumbersInFile(2).size();
			assertEquals(0, countActual);
			
			assertEquals(0, excel.getNumbersInFile(5).size());
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
