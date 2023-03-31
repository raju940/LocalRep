package SeleniumExamples;

import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
	
	WebDriver driver;
	@BeforeTest	
 public void beforetest() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.mycontactform.com/");
	 driver.manage().window().maximize();

 }
     	
  @Test(priority=1,invocationCount = 2)
  public void test1() throws InterruptedException {
	  
	  
	  driver.findElement(By.id("user")).sendKeys("qatrainer");
	  driver.findElement(By.id("pass")).sendKeys("admin123");
	  driver.findElement(By.name("btnSubmit")).click();
	  driver.findElement(By.partialLinkText("Logout")).click(); 
	  Thread.sleep(1000);
	  
  }
  
  @Test(priority=0,invocationCount = 2)
  public void test2() { 
	  
	  driver.findElement(By.id("user")).sendKeys("qatrainer");
	  driver.findElement(By.id("pass")).sendKeys("admin1223");
	  driver.findElement(By.name("btnSubmit")).click();

	  try {
		  driver.findElement(By.partialLinkText("Logout")).click();
	  }catch(NoSuchElementException e) {
		  e.printStackTrace();
		  
	  }
	  
	  
  }
  
  
   @AfterTest
   public void aftertest() {
	   driver.close();
   }
  
}
