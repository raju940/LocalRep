package SeleniumExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots{
	
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.mycontactform.com/");
	  
	    
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File file = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File("./Screenshot/IMAGE.png"));
	  
	  
	  
  }
}
