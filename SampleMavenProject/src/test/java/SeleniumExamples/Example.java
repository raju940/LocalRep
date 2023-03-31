package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	
	static WebDriver driver;
	static String browser[] = {"chrome","edge"};
	static String url = "https://www.youtube.com/";
	
	public WebDriver browsers(String browser1,String url) {
		if(browser1.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
		}else if(browser1.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
		}
		
		
		return driver;
		
		
	}
	
	
	
	@Test
	public void f() {
		
		int length = browser.length;
		System.out.println(length);
		
		for(int i=0;i<=length;i++) {
		
		browsers(browser[i],url);
		}
	}
}
