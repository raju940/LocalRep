package SeleniumExamples;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MINI_PROJECT {
	
    @Test
	public void reddif() throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.partialLinkText("Create Account")).click();
		String purl1= driver.getCurrentUrl();
		String url1 = "http://register.rediff.com/register/register.php?FormName=user_details";
		if(purl1.equals(url1)) {
			System.out.println("url validated");
		}else {
			System.out.println("not validated");
		}
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		driver.findElement(By.partialLinkText("terms and conditions")).click();
		String purl2= driver.getCurrentUrl();
		String url2 = "http://register.rediff.com/register/register.php?FormName=user_details";
		if(purl2 == url2) {
			System.out.println("Url validated");
		}else {
			System.out.println("Not validated");
		}
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		for (String allchilds : child) {
			if(!parent.equals(allchilds)) {
			driver.switchTo().window(allchilds);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/input")).click();
			System.out.println(child);
			String title = driver.getTitle();
			System.out.println(title);
			
			
		}
		}
		
		driver.switchTo().window(parent).close();
	}
}
