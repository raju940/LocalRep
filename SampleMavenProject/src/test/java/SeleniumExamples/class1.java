package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class class1 {
	
	static WebDriver driver;
//	static class2 cl =new class2();

	
	
	

	public void classrun()
	{
		WebDriverManager.chromedriver().setup(); 
		 driver = new ChromeDriver();
		  driver.get("https://www.mycontactform.com/");
			 class2 cl1= PageFactory.initElements(driver,class2.class);

		cl1.user();
		cl1.pass();
		cl1.submit();
	}
	
}
