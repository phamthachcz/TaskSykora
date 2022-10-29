package Task.TaskSykora;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile { // Class Read Excel File
	private String pathFile;

	public ExcelFile(String path) {
		this.pathFile = path;

	}

	public List<Integer> getNumbersInFile(int colIndex) throws FileNotFoundException {
		File inputFile = new File(this.pathFile);

		try (FileInputStream fileInputStream = new FileInputStream(inputFile)) {

			XSSFWorkbook work = new XSSFWorkbook(fileInputStream);
			// List of numbers in file
			List<Integer> lstNumbers = new ArrayList<>();

			// TODO Loop all sheets in the file and add number into list
			for (int i = 0; i < work.getNumberOfSheets(); i++) {

				XSSFSheet sheet = work.getSheetAt(i);

				for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
					XSSFRow row = sheet.getRow(rowIndex);
					if (row != null) {
						XSSFCell cell = row.getCell(colIndex);

						if (cell != null) {

							if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
								String cellValue = cell.getStringCellValue();
								if (!cellValue.isEmpty()) {
									try {
										lstNumbers.add(Integer.parseInt(cellValue));
									} catch (NumberFormatException ex) {

									}
								}
							} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
								lstNumbers.add((int) cell.getNumericCellValue());
							}

						}

					}
				}
			}

			// Close File
			work.close();

			return lstNumbers;

		} catch (IOException e) { // Catch file not found exception

			throw new FileNotFoundException("File not found");

		}

	}
}
