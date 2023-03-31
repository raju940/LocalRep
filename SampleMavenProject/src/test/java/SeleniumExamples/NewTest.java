package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
	  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	 System.out.println( driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]")).getText());
	  	  
  }
  
  
  
}
