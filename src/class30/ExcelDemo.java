package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
     public static void main(String[] args) throws IOException {
          //Location of file on the computer
          String path="Files/SdetBatc13.xlsx";
          //Navigate to this file
          FileInputStream fileInputStream=new FileInputStream(path);
          //Class that understands how Excel files work
          XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
          //Excel files are divided in sheets we can access any sheet by providing its name
          Sheet sheet=xssfWorkbook.getSheet("Sheet1");
          //Sheet have rows and cells(columns)we need to specify the row number and cell number
          //row and columns they also start from index zero
          Row row=sheet.getRow(2);
          Cell cell=row.getCell(1);
          System.out.println(cell);
     }
}
