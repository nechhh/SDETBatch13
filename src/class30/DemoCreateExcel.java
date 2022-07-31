package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class DemoCreateExcel {
    /*how to create Excel files using apache poi and java
    */
    public static void main(String[] args) throws IOException {
        //path of the file
        String path="Files/DemoFile.xlsx";
        //navigate to the location
        ///Special class that knows how to handle excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("Olric");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Katrina");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();

    }
}
