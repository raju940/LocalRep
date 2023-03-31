package SeleniumExamples;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class sql2 {
  @Test
  public void f() throws ClassNotFoundException, SQLException, IOException {

	  
	  FileInputStream fis = new FileInputStream("C:\\Users\\RajuSomarapu\\eclipse-workspace\\selenium1\\Data\\ContactForm.xlsx");
	  @SuppressWarnings("resource")
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sh = wb.getSheet("sheet2");
	  int shcount = sh.getPhysicalNumberOfRows();
	  System.out.println(shcount);
	 
	  
      Class.forName("com.mysql.cj.jdbc.Driver");  
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
	  Statement stat = con.createStatement();
//	  String s = "insert into emptable values(8388,'Hello',2000,'LDSNR')";
	  ResultSet result = stat.executeQuery("SELECT * FROM emp.emptable");
	  
	  XSSFRow row = sh.createRow(0);
	  int  i=1;
	  while(result.next()) {
		
		 row= sh.createRow(i++);
//		  System.out.println(result.getString(1));
//		  System.out.println(result.getString(2));
//		  System.out.println(result.getString(3));
//		  System.out.println(result.getString(4));
		  
         row.createCell(0).setCellValue(result.getString(1));
         row.createCell(1).setCellValue(result.getString(2));
         row.createCell(2).setCellValue(result.getString(3));
         row.createCell(3).setCellValue(result.getString(4));
	  }
	  
	  FileOutputStream fout = new FileOutputStream("C:\\Users\\RajuSomarapu\\eclipse-workspace\\selenium1\\Data\\ContactForm.xlsx");
	  wb.write(fout);
  
  }
}