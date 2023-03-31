package SeleniumExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySQL {
  @Test
  public void f() throws ClassNotFoundException, SQLException {
	  
	  
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/emp","root","root");
	  Statement stat = con.createStatement();
	  String s = "insert into emptable values(8388,'Hello',2000,'LDSNR')";
	  stat.executeQuery(s);
	  con.close();
	  System.out.println("");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
//	  WebDriverManager.chromedriver().setup();
//	  WebDriver driver = new ChromeDriver();
//	  driver.get("https://money.rediff.com/gainers");
//	  List<WebElement> link = driver.findElements(By.tagName("a"));
//	  int linkcount = link.size();
//	  System.out.println(linkcount);
//	  
//	  for(int i=0;i<linkcount;i++) {
//		  WebElement element = link.get(i);
//		  String linkname = element.getText();
//		  System.out.println(linkname);
//		  
//		 List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td/a"));
//		 
//		 for (WebElement href : list) {
//			 System.out.println(href.getAttribute("href"));
//			
//		}
//		  }
	  
	  
	  
	  
	  
  }
  
}  


	 
	  
  

